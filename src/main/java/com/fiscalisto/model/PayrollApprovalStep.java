// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollApprovalStep: PayrollApprovalStep.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollApprovalStep {
    /**
     * El paso en que va, desde 1.
     */
    @JsonProperty("number")
    private Long number;

    /**
     * Cuántos pasos tiene.
     */
    @JsonProperty("of")
    private Long of;

    /**
     * El nombre del paso, como «Finanzas».
     */
    @JsonProperty("name")
    private String name;

    /**
     * El paso en que va, desde 1.
     */
    public Long getNumber() {
        return number;
    }

    public PayrollApprovalStep setNumber(Long number) {
        this.number = number;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalStep setNumber(long number) {
        return setNumber(Long.valueOf(number));
    }

    /**
     * Cuántos pasos tiene.
     */
    public Long getOf() {
        return of;
    }

    public PayrollApprovalStep setOf(Long of) {
        this.of = of;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalStep setOf(long of) {
        return setOf(Long.valueOf(of));
    }

    /**
     * El nombre del paso, como «Finanzas».
     */
    public String getName() {
        return name;
    }

    public PayrollApprovalStep setName(String name) {
        this.name = name;
        return this;
    }
}
