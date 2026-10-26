// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoicePayrollDeduction: InvoicePayrollDeduction.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollDeduction {
    /**
     * Tipo de deducción (TipoDeduccion), c_TipoDeduccion: 001 IMSS, 002 ISR…
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
     * Importe (Importe).
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Tipo de deducción (TipoDeduccion), c_TipoDeduccion: 001 IMSS, 002 ISR…
     */
    public String getType() {
        return type;
    }

    public InvoicePayrollDeduction setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Clave del patrón (Clave).
     */
    public String getKey() {
        return key;
    }

    public InvoicePayrollDeduction setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Concepto (Concepto).
     */
    public String getConcept() {
        return concept;
    }

    public InvoicePayrollDeduction setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Importe (Importe).
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public InvoicePayrollDeduction setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollDeduction setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
