// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SatAnnualPreloadPayrollEmployerConcept: SatAnnualPreloadPayrollEmployerConcept.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatAnnualPreloadPayrollEmployerConcept {
    /**
     * La clave del SAT, como en concepts.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Su nombre en el SAT.
     */
    @JsonProperty("title")
    private String title;

    /**
     * El monto del ejercicio de ese patrón, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * La clave del SAT, como en concepts.
     */
    public String getCode() {
        return code;
    }

    public SatAnnualPreloadPayrollEmployerConcept setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Su nombre en el SAT.
     */
    public String getTitle() {
        return title;
    }

    public SatAnnualPreloadPayrollEmployerConcept setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * El monto del ejercicio de ese patrón, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SatAnnualPreloadPayrollEmployerConcept setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SatAnnualPreloadPayrollEmployerConcept setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
