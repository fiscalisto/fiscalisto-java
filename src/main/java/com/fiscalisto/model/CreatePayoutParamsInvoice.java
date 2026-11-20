// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreatePayoutParamsInvoice: CreatePayoutParamsInvoice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayoutParamsInvoice {
    /**
     * El folio fiscal de la factura recibida.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Cuánto pagar, en la moneda de la factura. Por omisión, todo lo que falta (amount_due).
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Por qué paga menos de lo que falta («Parcial», «Anticipo»…).
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * El folio fiscal de la factura recibida.
     * <p>
     * Obligatorio.
     */
    public String getUuid() {
        return uuid;
    }

    public CreatePayoutParamsInvoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Cuánto pagar, en la moneda de la factura. Por omisión, todo lo que falta (amount_due).
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreatePayoutParamsInvoice setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreatePayoutParamsInvoice setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Por qué paga menos de lo que falta («Parcial», «Anticipo»…).
     */
    public String getReason() {
        return reason;
    }

    public CreatePayoutParamsInvoice setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
