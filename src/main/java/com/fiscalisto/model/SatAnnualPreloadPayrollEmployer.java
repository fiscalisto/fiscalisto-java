// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SatAnnualPreloadPayrollEmployer: SatAnnualPreloadPayrollEmployer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatAnnualPreloadPayrollEmployer {
    /**
     * El RFC del patrón.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su nombre o razón social.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Sus totales del ejercicio por clave.
     */
    @JsonProperty("concepts")
    private List<SatAnnualPreloadPayrollEmployerConcept> concepts;

    /**
     * El RFC del patrón.
     */
    public String getTaxId() {
        return taxId;
    }

    public SatAnnualPreloadPayrollEmployer setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su nombre o razón social.
     */
    public String getName() {
        return name;
    }

    public SatAnnualPreloadPayrollEmployer setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sus totales del ejercicio por clave.
     */
    public List<SatAnnualPreloadPayrollEmployerConcept> getConcepts() {
        return concepts;
    }

    public SatAnnualPreloadPayrollEmployer setConcepts(List<SatAnnualPreloadPayrollEmployerConcept> concepts) {
        this.concepts = concepts;
        return this;
    }
}
