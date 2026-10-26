// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * RetentionTax: RetentionTax.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetentionTax {
    /**
     * Impuesto: isr, iva o ieps (ImpuestoRet 001, 002, 003).
     */
    @JsonProperty("tax")
    private String tax;

    /**
     * Base del impuesto retenido (BaseRet).
     */
    @JsonProperty("base")
    private BigDecimal base;

    /**
     * Monto retenido (MontoRet).
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Tipo de pago de la retención (TipoPagoRet): 01 definitivo IVA, 02 definitivo IEPS, 03 definitivo ISR, 04 provisional ISR. Por omisión el usual de cada impuesto.
     */
    @JsonProperty("payment_type")
    private String paymentType;

    /**
     * Impuesto: isr, iva o ieps (ImpuestoRet 001, 002, 003).
     */
    public String getTax() {
        return tax;
    }

    public RetentionTax setTax(String tax) {
        this.tax = tax;
        return this;
    }

    /**
     * Base del impuesto retenido (BaseRet).
     */
    public BigDecimal getBase() {
        return base;
    }

    public RetentionTax setBase(BigDecimal base) {
        this.base = base;
        return this;
    }

    @JsonIgnore
    public RetentionTax setBase(double base) {
        return setBase(BigDecimal.valueOf(base));
    }

    /**
     * Monto retenido (MontoRet).
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public RetentionTax setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public RetentionTax setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Tipo de pago de la retención (TipoPagoRet): 01 definitivo IVA, 02 definitivo IEPS, 03 definitivo ISR, 04 provisional ISR. Por omisión el usual de cada impuesto.
     */
    public String getPaymentType() {
        return paymentType;
    }

    public RetentionTax setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
}
