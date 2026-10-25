package com.fiscalisto;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Un error de la API, o de la conexión (type connection_error). Decida con {@link #getCode()},
 * que es estable (compárelo con {@link ErrorCode}); el mensaje es para mostrarlo a una persona.
 * <p>
 * {@code catch (FiscalistoException e) { if (ErrorCode.INVOICE_REJECTED.equals(e.getCode())) … }}
 */
public class FiscalistoException extends RuntimeException {
    private final String type;
    private final String code;
    private final String param;
    private final String satCode;
    private final String invoice;
    private final String docUrl;
    private final String requestId;
    private final int statusCode;
    private final String idempotencyKey;
    private final JsonNode raw;

    FiscalistoException(JsonNode raw, int statusCode, String requestId, String idempotencyKey, Throwable cause) {
        super(text(raw, "message", "Error de la API de Fiscalisto"), cause);
        this.raw = raw;
        this.type = text(raw, "type", "api_error");
        this.code = text(raw, "code", "unknown");
        this.param = text(raw, "param", null);
        this.satCode = text(raw, "sat_code", null);
        this.invoice = text(raw, "invoice", null);
        this.docUrl = text(raw, "doc_url", null);
        this.requestId = text(raw, "request_id", requestId);
        this.statusCode = statusCode;
        this.idempotencyKey = idempotencyKey;
    }

    private static String text(JsonNode raw, String key, String otherwise) {
        JsonNode v = raw == null ? null : raw.get(key);
        return v != null && v.isTextual() ? v.asText() : otherwise;
    }

    /** invalid_request_error, authentication_error, …, api_error o connection_error. */
    public String getType() {
        return type;
    }

    /** La razón precisa, estable: vea https://fiscalisto.com/docs/api/errores. */
    public String getCode() {
        return code;
    }

    /** El campo que hay que corregir (items.0.unit_price). */
    public String getParam() {
        return param;
    }

    /** El código del SAT o del PAC cuando ellos lo rechazaron (CFDI40145). */
    public String getSatCode() {
        return satCode;
    }

    /** El comprobante rechazado (inv_…), cuando lo hay. */
    public String getInvoice() {
        return invoice;
    }

    public String getDocUrl() {
        return docUrl;
    }

    /** Búsquelo en Desarrolladores › Solicitudes o mándelo a soporte. */
    public String getRequestId() {
        return requestId;
    }

    /** El código HTTP (0: la solicitud no llegó). */
    public int getStatusCode() {
        return statusCode;
    }

    /** La Idempotency-Key que se mandó: repita con ella para saber si se timbró. */
    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    /** El objeto error tal como llegó. */
    public JsonNode getRaw() {
        return raw;
    }

    @Override
    public String toString() {
        return "FiscalistoException(code=" + code + ", status=" + statusCode + ", message=" + getMessage() + ")";
    }
}
