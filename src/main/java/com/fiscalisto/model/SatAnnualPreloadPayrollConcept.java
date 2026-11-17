// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SatAnnualPreloadPayrollConcept: SatAnnualPreloadPayrollConcept.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatAnnualPreloadPayrollConcept {
    /**
     * La clave del SAT: PIRA1 ingresos por asimilados, PISR1 ISR retenido, y las de sueldos y salarios.
     */
    @JsonProperty("code")
    private String code;

    /**
     * El grupo en que el SAT la muestra.
     */
    @JsonProperty("group")
    private String group;

    /**
     * Su nombre en el SAT.
     */
    @JsonProperty("title")
    private String title;

    /**
     * El monto del ejercicio, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * La clave del SAT: PIRA1 ingresos por asimilados, PISR1 ISR retenido, y las de sueldos y salarios.
     */
    public String getCode() {
        return code;
    }

    public SatAnnualPreloadPayrollConcept setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * El grupo en que el SAT la muestra.
     */
    public String getGroup() {
        return group;
    }

    public SatAnnualPreloadPayrollConcept setGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Su nombre en el SAT.
     */
    public String getTitle() {
        return title;
    }

    public SatAnnualPreloadPayrollConcept setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * El monto del ejercicio, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SatAnnualPreloadPayrollConcept setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SatAnnualPreloadPayrollConcept setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
