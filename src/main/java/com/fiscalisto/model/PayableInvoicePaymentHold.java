// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayableInvoicePaymentHold: PayableInvoicePaymentHold.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayableInvoicePaymentHold {
    /**
     * La regla que lo retuvo, por su nombre.
     */
    @JsonProperty("rule")
    private String rule;

    /**
     * Por qué, como lo dice la regla.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Cuándo lo retuvo (UTC).
     */
    @JsonProperty("held_at")
    private String heldAt;

    /**
     * La regla que lo retuvo, por su nombre.
     */
    public String getRule() {
        return rule;
    }

    public PayableInvoicePaymentHold setRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Por qué, como lo dice la regla.
     */
    public String getNote() {
        return note;
    }

    public PayableInvoicePaymentHold setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Cuándo lo retuvo (UTC).
     */
    public String getHeldAt() {
        return heldAt;
    }

    public PayableInvoicePaymentHold setHeldAt(String heldAt) {
        this.heldAt = heldAt;
        return this;
    }
}
