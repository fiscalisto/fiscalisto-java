// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollAccumulatedConcept: PayrollAccumulatedConcept.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollAccumulatedConcept {
    /**
     * percepcion, deduccion u otro_pago.
     * <p>
     * Valores: percepcion, deduccion, otro_pago.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * c_TipoPercepcion, c_TipoDeduccion o c_TipoOtroPago.
     */
    @JsonProperty("type")
    private String type;

    /**
     * La clave del patrón.
     */
    @JsonProperty("key")
    private String key;

    /**
     * El concepto de la línea de captura (ISR, IVA…) como lo da el SAT.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * El importe de cada mes, de enero (posición 0) a diciembre. Percepciones: gravado más exento.
     */
    @JsonProperty("months")
    private List<BigDecimal> months;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Percepciones: lo gravado.
     */
    @JsonProperty("taxed")
    private BigDecimal taxed;

    /**
     * Percepciones: lo exento.
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * Cuántos recibos lo llevan.
     */
    @JsonProperty("receipts")
    private BigDecimal receipts;

    /**
     * percepcion, deduccion u otro_pago.
     * <p>
     * Valores: percepcion, deduccion, otro_pago.
     */
    public String getKind() {
        return kind;
    }

    public PayrollAccumulatedConcept setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * c_TipoPercepcion, c_TipoDeduccion o c_TipoOtroPago.
     */
    public String getType() {
        return type;
    }

    public PayrollAccumulatedConcept setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * La clave del patrón.
     */
    public String getKey() {
        return key;
    }

    public PayrollAccumulatedConcept setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * El concepto de la línea de captura (ISR, IVA…) como lo da el SAT.
     */
    public String getConcept() {
        return concept;
    }

    public PayrollAccumulatedConcept setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * El importe de cada mes, de enero (posición 0) a diciembre. Percepciones: gravado más exento.
     */
    public List<BigDecimal> getMonths() {
        return months;
    }

    public PayrollAccumulatedConcept setMonths(List<BigDecimal> months) {
        this.months = months;
        return this;
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PayrollAccumulatedConcept setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedConcept setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Percepciones: lo gravado.
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public PayrollAccumulatedConcept setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedConcept setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * Percepciones: lo exento.
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public PayrollAccumulatedConcept setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedConcept setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }

    /**
     * Cuántos recibos lo llevan.
     */
    public BigDecimal getReceipts() {
        return receipts;
    }

    public PayrollAccumulatedConcept setReceipts(BigDecimal receipts) {
        this.receipts = receipts;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulatedConcept setReceipts(double receipts) {
        return setReceipts(BigDecimal.valueOf(receipts));
    }
}
