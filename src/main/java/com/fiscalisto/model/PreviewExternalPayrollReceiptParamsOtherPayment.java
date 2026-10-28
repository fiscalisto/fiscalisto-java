// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PreviewExternalPayrollReceiptParamsOtherPayment: PreviewExternalPayrollReceiptParamsOtherPayment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreviewExternalPayrollReceiptParamsOtherPayment {
    /**
     * TipoOtroPago (c_TipoOtroPago): 002 subsidio para el empleo…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * El archivo .key en base64 (puede traer el prefijo data:).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * SubsidioCausado: solo con el 002.
     */
    @JsonProperty("subsidy_caused")
    private BigDecimal subsidyCaused;

    /**
     * CompensacionSaldosAFavor: solo con el 004.
     */
    @JsonProperty("balance_compensation")
    private PreviewExternalPayrollReceiptParamsOtherPaymentBalanceCompensation balanceCompensation;

    /**
     * TipoOtroPago (c_TipoOtroPago): 002 subsidio para el empleo…
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public PreviewExternalPayrollReceiptParamsOtherPayment setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * El archivo .key en base64 (puede traer el prefijo data:).
     * <p>
     * Obligatorio.
     */
    public String getKey() {
        return key;
    }

    public PreviewExternalPayrollReceiptParamsOtherPayment setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     * <p>
     * Obligatorio.
     */
    public String getConcept() {
        return concept;
    }

    public PreviewExternalPayrollReceiptParamsOtherPayment setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PreviewExternalPayrollReceiptParamsOtherPayment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsOtherPayment setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * SubsidioCausado: solo con el 002.
     */
    public BigDecimal getSubsidyCaused() {
        return subsidyCaused;
    }

    public PreviewExternalPayrollReceiptParamsOtherPayment setSubsidyCaused(BigDecimal subsidyCaused) {
        this.subsidyCaused = subsidyCaused;
        return this;
    }

    @JsonIgnore
    public PreviewExternalPayrollReceiptParamsOtherPayment setSubsidyCaused(double subsidyCaused) {
        return setSubsidyCaused(BigDecimal.valueOf(subsidyCaused));
    }

    /**
     * CompensacionSaldosAFavor: solo con el 004.
     */
    public PreviewExternalPayrollReceiptParamsOtherPaymentBalanceCompensation getBalanceCompensation() {
        return balanceCompensation;
    }

    public PreviewExternalPayrollReceiptParamsOtherPayment setBalanceCompensation(PreviewExternalPayrollReceiptParamsOtherPaymentBalanceCompensation balanceCompensation) {
        this.balanceCompensation = balanceCompensation;
        return this;
    }
}
