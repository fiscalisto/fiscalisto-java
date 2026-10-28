// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateExternalPayrollReceiptParamsDeduction: CreateExternalPayrollReceiptParamsDeduction.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExternalPayrollReceiptParamsDeduction {
    /**
     * TipoDeduccion (c_TipoDeduccion): 001 IMSS, 002 ISR, 010 Infonavit…
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
     * Concepto de los egresos (IntegracEgresos/ConceptoS), hasta 100 caracteres.
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
     * TipoDeduccion (c_TipoDeduccion): 001 IMSS, 002 ISR, 010 Infonavit…
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateExternalPayrollReceiptParamsDeduction setType(String type) {
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

    public CreateExternalPayrollReceiptParamsDeduction setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Concepto de los egresos (IntegracEgresos/ConceptoS), hasta 100 caracteres.
     * <p>
     * Obligatorio.
     */
    public String getConcept() {
        return concept;
    }

    public CreateExternalPayrollReceiptParamsDeduction setConcept(String concept) {
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

    public CreateExternalPayrollReceiptParamsDeduction setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateExternalPayrollReceiptParamsDeduction setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
