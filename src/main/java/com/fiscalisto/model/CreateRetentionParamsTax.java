// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsTax: CreateRetentionParamsTax.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsTax {
    /**
     * Impuesto: isr, iva o ieps (ImpuestoRet 001, 002, 003).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax")
    private String tax;

    /**
     * Base del impuesto retenido (BaseRet).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("base")
    private BigDecimal base;

    /**
     * Monto retenido (MontoRet).
     * <p>
     * Obligatorio.
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
     * <p>
     * Obligatorio.
     */
    public String getTax() {
        return tax;
    }

    public CreateRetentionParamsTax setTax(String tax) {
        this.tax = tax;
        return this;
    }

    /**
     * Base del impuesto retenido (BaseRet).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getBase() {
        return base;
    }

    public CreateRetentionParamsTax setBase(BigDecimal base) {
        this.base = base;
        return this;
    }

    public CreateRetentionParamsTax setBase(double base) {
        return setBase(BigDecimal.valueOf(base));
    }

    /**
     * Monto retenido (MontoRet).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateRetentionParamsTax setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public CreateRetentionParamsTax setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Tipo de pago de la retención (TipoPagoRet): 01 definitivo IVA, 02 definitivo IEPS, 03 definitivo ISR, 04 provisional ISR. Por omisión el usual de cada impuesto.
     */
    public String getPaymentType() {
        return paymentType;
    }

    public CreateRetentionParamsTax setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
}
