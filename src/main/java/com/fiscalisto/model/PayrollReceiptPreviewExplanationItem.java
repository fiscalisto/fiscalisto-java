// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollReceiptPreviewExplanationItem: PayrollReceiptPreviewExplanationItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollReceiptPreviewExplanationItem {
    /**
     * isr, subsidio, isr_ajuste (ajuste mensual del subsidio) o imss_eym_excedente, imss_eym_dinero, imss_gmp, imss_iv, imss_cv (cada cuota obrera del IMSS).
     */
    @JsonProperty("id")
    private String id;

    /**
     * isr: el impuesto; subsidio: subsidio para el empleo; imss: una cuota obrera.
     * <p>
     * Valores: isr, subsidio, imss.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * La línea como la nombra el recibo.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * Lo que el recibo tiene en esa línea.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Qué es la línea y por qué salió así, en una frase.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * La base, la tasa o el renglón de la tarifa y la operación, en orden; el último paso es el importe.
     */
    @JsonProperty("steps")
    private List<PayrollReceiptPreviewExplanationItemStep> steps;

    /**
     * El fundamento de cada cifra.
     */
    @JsonProperty("law")
    private List<PayrollReceiptPreviewExplanationItemLawItem> law;

    /**
     * isr, subsidio, isr_ajuste (ajuste mensual del subsidio) o imss_eym_excedente, imss_eym_dinero, imss_gmp, imss_iv, imss_cv (cada cuota obrera del IMSS).
     */
    public String getId() {
        return id;
    }

    public PayrollReceiptPreviewExplanationItem setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * isr: el impuesto; subsidio: subsidio para el empleo; imss: una cuota obrera.
     * <p>
     * Valores: isr, subsidio, imss.
     */
    public String getKind() {
        return kind;
    }

    public PayrollReceiptPreviewExplanationItem setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * La línea como la nombra el recibo.
     */
    public String getConcept() {
        return concept;
    }

    public PayrollReceiptPreviewExplanationItem setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Lo que el recibo tiene en esa línea.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayrollReceiptPreviewExplanationItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreviewExplanationItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Qué es la línea y por qué salió así, en una frase.
     */
    public String getSummary() {
        return summary;
    }

    public PayrollReceiptPreviewExplanationItem setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * La base, la tasa o el renglón de la tarifa y la operación, en orden; el último paso es el importe.
     */
    public List<PayrollReceiptPreviewExplanationItemStep> getSteps() {
        return steps;
    }

    public PayrollReceiptPreviewExplanationItem setSteps(List<PayrollReceiptPreviewExplanationItemStep> steps) {
        this.steps = steps;
        return this;
    }

    /**
     * El fundamento de cada cifra.
     */
    public List<PayrollReceiptPreviewExplanationItemLawItem> getLaw() {
        return law;
    }

    public PayrollReceiptPreviewExplanationItem setLaw(List<PayrollReceiptPreviewExplanationItemLawItem> law) {
        this.law = law;
        return this;
    }
}
