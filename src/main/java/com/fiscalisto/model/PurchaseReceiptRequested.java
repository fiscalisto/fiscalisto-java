// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PurchaseReceiptRequested: PurchaseReceiptRequested.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseReceiptRequested {
    /**
     * egreso (la factura completa y después una nota de crédito por el anticipo, opción A) o remanente (la factura solo por lo que falta, opción B).
     */
    @JsonProperty("method")
    private String method;

    /**
     * A quién (correos separados por comas).
     */
    @JsonProperty("to")
    private String to;

    /**
     * Cuándo se pidió.
     */
    @JsonProperty("at")
    private String at;

    /**
     * egreso (la factura completa y después una nota de crédito por el anticipo, opción A) o remanente (la factura solo por lo que falta, opción B).
     */
    public String getMethod() {
        return method;
    }

    public PurchaseReceiptRequested setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * A quién (correos separados por comas).
     */
    public String getTo() {
        return to;
    }

    public PurchaseReceiptRequested setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Cuándo se pidió.
     */
    public String getAt() {
        return at;
    }

    public PurchaseReceiptRequested setAt(String at) {
        this.at = at;
        return this;
    }
}
