// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateExternalPayrollReceiptParamsPerception: CreateExternalPayrollReceiptParamsPerception.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExternalPayrollReceiptParamsPerception {
    /**
     * TipoPercepcion (c_TipoPercepcion): 001 sueldos, 002 aguinaldo…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Clave del patrón (3 a 15 caracteres).
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
     * ImporteGravado.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("taxed")
    private BigDecimal taxed;

    /**
     * ImporteExento.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * HorasExtra: solo con la percepción 019.
     */
    @JsonProperty("overtime")
    private List<CreateExternalPayrollReceiptParamsPerceptionOvertimeItem> overtime;

    /**
     * AccionesOTitulos: solo con la percepción 045.
     */
    @JsonProperty("stock_options")
    private CreateExternalPayrollReceiptParamsPerceptionStockOptions stockOptions;

    /**
     * TipoPercepcion (c_TipoPercepcion): 001 sueldos, 002 aguinaldo…
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateExternalPayrollReceiptParamsPerception setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Clave del patrón (3 a 15 caracteres).
     * <p>
     * Obligatorio.
     */
    public String getKey() {
        return key;
    }

    public CreateExternalPayrollReceiptParamsPerception setKey(String key) {
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

    public CreateExternalPayrollReceiptParamsPerception setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * ImporteGravado.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTaxed() {
        return taxed;
    }

    public CreateExternalPayrollReceiptParamsPerception setTaxed(BigDecimal taxed) {
        this.taxed = taxed;
        return this;
    }

    @JsonIgnore
    public CreateExternalPayrollReceiptParamsPerception setTaxed(double taxed) {
        return setTaxed(BigDecimal.valueOf(taxed));
    }

    /**
     * ImporteExento.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public CreateExternalPayrollReceiptParamsPerception setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public CreateExternalPayrollReceiptParamsPerception setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }

    /**
     * HorasExtra: solo con la percepción 019.
     */
    public List<CreateExternalPayrollReceiptParamsPerceptionOvertimeItem> getOvertime() {
        return overtime;
    }

    public CreateExternalPayrollReceiptParamsPerception setOvertime(List<CreateExternalPayrollReceiptParamsPerceptionOvertimeItem> overtime) {
        this.overtime = overtime;
        return this;
    }

    /**
     * AccionesOTitulos: solo con la percepción 045.
     */
    public CreateExternalPayrollReceiptParamsPerceptionStockOptions getStockOptions() {
        return stockOptions;
    }

    public CreateExternalPayrollReceiptParamsPerception setStockOptions(CreateExternalPayrollReceiptParamsPerceptionStockOptions stockOptions) {
        this.stockOptions = stockOptions;
        return this;
    }
}
