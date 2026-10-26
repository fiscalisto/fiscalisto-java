// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollReceiptPreviewPerception: PayrollReceiptPreviewPerception.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollReceiptPreviewPerception {
    /**
     * Tipo de percepción (TipoPercepcion), c_TipoPercepcion: 001 sueldos…
     */
    @JsonProperty("type")
    private String type;

    /**
     * Clave del patrón (Clave).
     */
    @JsonProperty("key")
    private String key;

    /**
     * Concepto (Concepto).
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * Importe gravado (ImporteGravado).
     */
    @JsonProperty("taxed")
    private BigDecimal taxed;

    /**
     * Importe exento (ImporteExento).
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * Tipo de percepción (TipoPercepcion), c_TipoPercepcion: 001 sueldos…
     */
    public String getType() {
        return type;
    }

    public PayrollReceiptPreviewPerception setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Clave del patrón (Clave).
     */
    public String getKey() {
        return key;
    }

    public PayrollReceiptPreviewPerception setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Concepto (Concepto).
     */
    public String getConcept() {
        return concept;
    }

    public PayrollReceiptPreviewPerception setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Importe gravado (ImporteGravado).
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public PayrollReceiptPreviewPerception setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreviewPerception setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * Importe exento (ImporteExento).
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public PayrollReceiptPreviewPerception setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public PayrollReceiptPreviewPerception setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }
}
