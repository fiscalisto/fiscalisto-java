// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoicePayrollPerception: InvoicePayrollPerception.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollPerception {
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
     * Horas extra (HorasExtra), con la percepción 019.
     */
    @JsonProperty("overtime")
    private List<InvoicePayrollPerceptionOvertimeItem> overtime;

    /**
     * Acciones o títulos (AccionesOTitulos), con la percepción 045.
     */
    @JsonProperty("stock_options")
    private InvoicePayrollPerceptionStockOptions stockOptions;

    /**
     * Tipo de percepción (TipoPercepcion), c_TipoPercepcion: 001 sueldos…
     */
    public String getType() {
        return type;
    }

    public InvoicePayrollPerception setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Clave del patrón (Clave).
     */
    public String getKey() {
        return key;
    }

    public InvoicePayrollPerception setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Concepto (Concepto).
     */
    public String getConcept() {
        return concept;
    }

    public InvoicePayrollPerception setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Importe gravado (ImporteGravado).
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public InvoicePayrollPerception setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollPerception setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * Importe exento (ImporteExento).
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public InvoicePayrollPerception setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollPerception setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }

    /**
     * Horas extra (HorasExtra), con la percepción 019.
     */
    public List<InvoicePayrollPerceptionOvertimeItem> getOvertime() {
        return overtime;
    }

    public InvoicePayrollPerception setOvertime(List<InvoicePayrollPerceptionOvertimeItem> overtime) {
        this.overtime = overtime;
        return this;
    }

    /**
     * Acciones o títulos (AccionesOTitulos), con la percepción 045.
     */
    public InvoicePayrollPerceptionStockOptions getStockOptions() {
        return stockOptions;
    }

    public InvoicePayrollPerception setStockOptions(InvoicePayrollPerceptionStockOptions stockOptions) {
        this.stockOptions = stockOptions;
        return this;
    }
}
