// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestPurchaseReceiptInvoiceParams: los campos de «Pedir la factura a la tienda».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestPurchaseReceiptInvoiceParams {
    /**
     * fiscalisto (la tienda factura con Fiscalisto: se timbra al momento), email (le mandamos a la tienda sus datos y la foto), portal o manual (usted la pidió; solo se marca pedida).
     * <p>
     * Valores: fiscalisto, email, portal, manual.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("method")
    private String method;

    /**
     * email: el correo de la tienda. Por omisión, store_email.
     */
    @JsonProperty("to")
    private String to;

    /**
     * email: unas líneas para la tienda.
     */
    @JsonProperty("message")
    private String message;

    /**
     * email y fiscalisto: el correo al que la tienda manda la factura. Por omisión, el correo de respuesta del emisor.
     */
    @JsonProperty("reply_to")
    private String replyTo;

    /**
     * fiscalisto (la tienda factura con Fiscalisto: se timbra al momento), email (le mandamos a la tienda sus datos y la foto), portal o manual (usted la pidió; solo se marca pedida).
     * <p>
     * Valores: fiscalisto, email, portal, manual.
     * <p>
     * Obligatorio.
     */
    public String getMethod() {
        return method;
    }

    public RequestPurchaseReceiptInvoiceParams setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * email: el correo de la tienda. Por omisión, store_email.
     */
    public String getTo() {
        return to;
    }

    public RequestPurchaseReceiptInvoiceParams setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * email: unas líneas para la tienda.
     */
    public String getMessage() {
        return message;
    }

    public RequestPurchaseReceiptInvoiceParams setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * email y fiscalisto: el correo al que la tienda manda la factura. Por omisión, el correo de respuesta del emisor.
     */
    public String getReplyTo() {
        return replyTo;
    }

    public RequestPurchaseReceiptInvoiceParams setReplyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }
}
