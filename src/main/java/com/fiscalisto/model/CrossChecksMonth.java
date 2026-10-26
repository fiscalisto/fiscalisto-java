// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CrossChecksMonth: CrossChecksMonth.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossChecksMonth {
    /**
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * El peor de sus cruces: differs (no coincide), unreadable (una cifra no se pudo leer), not_filed (sin declaración mensual) o matches.
     * <p>
     * Valores: matches, differs, not_filed, unreadable.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Un cruce por cifra.
     */
    @JsonProperty("checks")
    private List<CrossChecksMonthCheck> checks;

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public CrossChecksMonth setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El peor de sus cruces: differs (no coincide), unreadable (una cifra no se pudo leer), not_filed (sin declaración mensual) o matches.
     * <p>
     * Valores: matches, differs, not_filed, unreadable.
     */
    public String getStatus() {
        return status;
    }

    public CrossChecksMonth setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Un cruce por cifra.
     */
    public List<CrossChecksMonthCheck> getChecks() {
        return checks;
    }

    public CrossChecksMonth setChecks(List<CrossChecksMonthCheck> checks) {
        this.checks = checks;
        return this;
    }
}
