// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SatAnnualPreloadPayroll: SatAnnualPreloadPayroll.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatAnnualPreloadPayroll {
    /**
     * Hasta qué día tiene procesados el SAT los recibos (AAAA-MM-DD).
     */
    @JsonProperty("updated_on")
    private String updatedOn;

    /**
     * Cuándo se leyó del SAT.
     */
    @JsonProperty("read_at")
    private String readAt;

    /**
     * Los totales del ejercicio de todos sus patrones.
     */
    @JsonProperty("concepts")
    private List<SatAnnualPreloadPayrollConcept> concepts;

    /**
     * Cada patrón (retenedor) con sus totales.
     */
    @JsonProperty("employers")
    private List<SatAnnualPreloadPayrollEmployer> employers;

    /**
     * Hasta qué día tiene procesados el SAT los recibos (AAAA-MM-DD).
     */
    public String getUpdatedOn() {
        return updatedOn;
    }

    public SatAnnualPreloadPayroll setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * Cuándo se leyó del SAT.
     */
    public String getReadAt() {
        return readAt;
    }

    public SatAnnualPreloadPayroll setReadAt(String readAt) {
        this.readAt = readAt;
        return this;
    }

    /**
     * Los totales del ejercicio de todos sus patrones.
     */
    public List<SatAnnualPreloadPayrollConcept> getConcepts() {
        return concepts;
    }

    public SatAnnualPreloadPayroll setConcepts(List<SatAnnualPreloadPayrollConcept> concepts) {
        this.concepts = concepts;
        return this;
    }

    /**
     * Cada patrón (retenedor) con sus totales.
     */
    public List<SatAnnualPreloadPayrollEmployer> getEmployers() {
        return employers;
    }

    public SatAnnualPreloadPayroll setEmployers(List<SatAnnualPreloadPayrollEmployer> employers) {
        this.employers = employers;
        return this;
    }
}
