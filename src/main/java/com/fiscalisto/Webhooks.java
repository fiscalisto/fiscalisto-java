package com.fiscalisto;

import com.fiscalisto.model.Event;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.Collection;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Verificar que un webhook lo mandó Fiscalisto (Standard Webhooks): la firma HMAC-SHA256 de
 * {@code webhook-id.webhook-timestamp.cuerpo} con el secreto whsec_ del endpoint.
 */
public final class Webhooks {
    /** Cuánto puede diferir la hora del webhook de la suya. */
    public static final Duration DEFAULT_TOLERANCE = Duration.ofMinutes(5);

    private Webhooks() {}

    /** El webhook no es de Fiscalisto: falta un encabezado, la hora o la firma no cuadran. */
    public static final class VerificationException extends RuntimeException {
        VerificationException(String message) {
            super(message);
        }
    }

    /**
     * Revisa la firma y la hora de un webhook y le devuelve el evento. Pase el cuerpo exactamente
     * como llegó, no el JSON ya interpretado: un espacio de diferencia cambia la firma. Los
     * encabezados, con valores String o listas (los de Spring o del Servlet), en cualquier
     * mayúscula.
     */
    public static Event verify(byte[] payload, Map<String, ?> headers, String secret) {
        return verify(payload, headers, secret, Instant.now(), DEFAULT_TOLERANCE);
    }

    public static Event verify(String payload, Map<String, ?> headers, String secret) {
        return verify(payload.getBytes(StandardCharsets.UTF_8), headers, secret);
    }

    /** {@link #verify(byte[], Map, String)} con la hora y la tolerancia que usted diga (pruebas). */
    public static Event verify(byte[] payload, Map<String, ?> headers, String secret, Instant now, Duration tolerance) {
        String id = header(headers, "webhook-id");
        String timestamp = header(headers, "webhook-timestamp");
        String signatures = header(headers, "webhook-signature");
        if (id == null || timestamp == null || signatures == null)
            throw new VerificationException("Faltan los encabezados webhook-id, webhook-timestamp o webhook-signature.");
        long sent;
        try {
            sent = Long.parseLong(timestamp);
        } catch (NumberFormatException e) {
            sent = Long.MIN_VALUE;
        }
        if (sent == Long.MIN_VALUE || Math.abs(now.getEpochSecond() - sent) > tolerance.toSeconds())
            throw new VerificationException("La hora del webhook está fuera de tolerancia: puede ser una repetición.");
        if (!secret.startsWith("whsec_")) throw new VerificationException("El secreto del endpoint empieza con whsec_.");
        byte[] expected;
        try {
            byte[] key = Base64.getDecoder().decode(secret.substring("whsec_".length()));
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(key, "HmacSHA256"));
            mac.update((id + "." + timestamp + ".").getBytes(StandardCharsets.UTF_8));
            expected = mac.doFinal(payload);
        } catch (IllegalArgumentException | InvalidKeyException e) {
            throw new VerificationException("El secreto del endpoint no es válido.");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
        // Several during a secret change, separated by spaces: any one valid is enough.
        for (String part : signatures.split(" ")) {
            int comma = part.indexOf(',');
            if (comma < 0 || !part.substring(0, comma).equals("v1")) continue;
            byte[] given;
            try {
                given = Base64.getDecoder().decode(part.substring(comma + 1));
            } catch (IllegalArgumentException e) {
                continue;
            }
            if (MessageDigest.isEqual(given, expected)) {
                try {
                    return ApiClient.MAPPER.readValue(payload, Event.class);
                } catch (IOException e) {
                    throw new VerificationException("El cuerpo del webhook no es JSON: " + e.getMessage());
                }
            }
        }
        throw new VerificationException("La firma del webhook no coincide con el secreto.");
    }

    private static String header(Map<String, ?> headers, String name) {
        for (Map.Entry<String, ?> e : headers.entrySet()) {
            if (e.getKey() == null || !e.getKey().equalsIgnoreCase(name)) continue;
            Object v = e.getValue();
            if (v instanceof Collection<?> c) v = c.isEmpty() ? null : c.iterator().next();
            if (v instanceof String[] a) v = a.length == 0 ? null : a[0];
            if (v != null) return v.toString();
        }
        return null;
    }
}
