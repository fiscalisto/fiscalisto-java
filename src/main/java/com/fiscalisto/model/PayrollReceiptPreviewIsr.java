// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollReceiptPreviewIsr: El cálculo del ISR del periodo: base, tarifa, subsidio y resultado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollReceiptPreviewIsr {
    /**
     * ISR según la tarifa del periodo.
     */
    @JsonProperty("tariff")
    private BigDecimal tariff;

    /**
     * Subsidio para el empleo causado.
     */
    @JsonProperty("subsidy")
    private BigDecimal subsidy;

    /**
     * ISR retenido (tarifa menos subsidio, no menos de 0).
     */
    @JsonProperty("withheld")
    private BigDecimal withheld;

    /**
     * true si gana el salario mínimo: no se le retiene ISR.
     */
    @JsonProperty("exempt_minimum")
    private Boolean exemptMinimum;

    /**
     * El ajuste de fin de mes: subsidio revertido y el ISR que retiene.
     */
    @JsonProperty("adjustment")
    private PayrollReceiptPreviewIsrAdjustment adjustment;

    /**
     * ISR según la tarifa del periodo.
     */
    public BigDecimal getTariff() {
        return tariff;
    }

    public PayrollReceiptPreviewIsr setTariff(BigDecimal tariff) {
        this.tariff = tariff;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreviewIsr setTariff(double tariff) {
        return setTariff(BigDecimal.valueOf(tariff));
    }

    /**
     * Subsidio para el empleo causado.
     */
    public BigDecimal getSubsidy() {
        return subsidy;
    }

    public PayrollReceiptPreviewIsr setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreviewIsr setSubsidy(double subsidy) {
        return setSubsidy(BigDecimal.valueOf(subsidy));
    }

    /**
     * ISR retenido (tarifa menos subsidio, no menos de 0).
     */
    public BigDecimal getWithheld() {
        return withheld;
    }

    public PayrollReceiptPreviewIsr setWithheld(BigDecimal withheld) {
        this.withheld = withheld;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreviewIsr setWithheld(double withheld) {
        return setWithheld(BigDecimal.valueOf(withheld));
    }

    /**
     * true si gana el salario mínimo: no se le retiene ISR.
     */
    public Boolean getExemptMinimum() {
        return exemptMinimum;
    }

    public PayrollReceiptPreviewIsr setExemptMinimum(Boolean exemptMinimum) {
        this.exemptMinimum = exemptMinimum;
        return this;
    }

    /**
     * El ajuste de fin de mes: subsidio revertido y el ISR que retiene.
     */
    public PayrollReceiptPreviewIsrAdjustment getAdjustment() {
        return adjustment;
    }

    public PayrollReceiptPreviewIsr setAdjustment(PayrollReceiptPreviewIsrAdjustment adjustment) {
        this.adjustment = adjustment;
        return this;
    }
}
