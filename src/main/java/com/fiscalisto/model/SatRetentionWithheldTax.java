// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SatRetentionWithheldTax: SatRetentionWithheldTax.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatRetentionWithheldTax {
    /**
     * Base del impuesto retenido (BaseRet).
     */
    @JsonProperty("base")
    private BigDecimal base;

    /**
     * Impuesto: isr, iva o ieps (ImpuestoRet 001, 002, 003).
     */
    @JsonProperty("tax")
    private String tax;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Tipo de pago de la retención (TipoPagoRet): 01 definitivo IVA, 02 definitivo IEPS, 03 definitivo ISR, 04 provisional ISR. Por omisión el usual de cada impuesto.
     */
    @JsonProperty("payment_type")
    private String paymentType;

    /**
     * Base del impuesto retenido (BaseRet).
     */
    public BigDecimal getBase() {
        return base;
    }

    public SatRetentionWithheldTax setBase(BigDecimal base) {
        this.base = base;
        return this;
    }

    @JsonIgnore
    public SatRetentionWithheldTax setBase(double base) {
        return setBase(BigDecimal.valueOf(base));
    }

    /**
     * Impuesto: isr, iva o ieps (ImpuestoRet 001, 002, 003).
     */
    public String getTax() {
        return tax;
    }

    public SatRetentionWithheldTax setTax(String tax) {
        this.tax = tax;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SatRetentionWithheldTax setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SatRetentionWithheldTax setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Tipo de pago de la retención (TipoPagoRet): 01 definitivo IVA, 02 definitivo IEPS, 03 definitivo ISR, 04 provisional ISR. Por omisión el usual de cada impuesto.
     */
    public String getPaymentType() {
        return paymentType;
    }

    public SatRetentionWithheldTax setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
}
