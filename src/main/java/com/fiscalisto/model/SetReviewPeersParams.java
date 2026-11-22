// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SetReviewPeersParams: los campos de «Elegir los compañeros que evalúan a alguien».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetReviewPeersParams {
    /**
     * La persona que se evalúa (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Los compañeros que la evalúan (emp_…). Vacío: al abrir se toman al azar. Con el ciclo abierto agrega o quita sus evaluaciones (las ya contestadas se quedan).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("peers")
    private List<String> peers;

    /**
     * La persona que se evalúa (emp_…).
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public SetReviewPeersParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Los compañeros que la evalúan (emp_…). Vacío: al abrir se toman al azar. Con el ciclo abierto agrega o quita sus evaluaciones (las ya contestadas se quedan).
     * <p>
     * Obligatorio.
     */
    public List<String> getPeers() {
        return peers;
    }

    public SetReviewPeersParams setPeers(List<String> peers) {
        this.peers = peers;
        return this;
    }
}
