// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClimateCentro: ClimateCentro.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateCentro {
    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Quienes trabajan ahí hoy.
     */
    @JsonProperty("workers")
    private Long workers;

    /**
     * II, III o null (solo la Guía I).
     */
    @JsonProperty("guide")
    private String guide;

    /**
     * Cuándo se cerró la última identificación NOM-035 ahí.
     */
    @JsonProperty("last_on")
    private String lastOn;

    /**
     * Cuándo toca la siguiente: cada dos años como mínimo (numeral 7.9).
     */
    @JsonProperty("next_due")
    private String nextDue;

    /**
     * Si ya le tocaba (o nunca se ha hecho).
     */
    @JsonProperty("overdue")
    private Boolean overdue;

    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    public String getBranch() {
        return branch;
    }

    public ClimateCentro setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ClimateCentro setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Quienes trabajan ahí hoy.
     */
    public Long getWorkers() {
        return workers;
    }

    public ClimateCentro setWorkers(Long workers) {
        this.workers = workers;
        return this;
    }

    @JsonIgnore
    public ClimateCentro setWorkers(long workers) {
        return setWorkers(Long.valueOf(workers));
    }

    /**
     * II, III o null (solo la Guía I).
     */
    public String getGuide() {
        return guide;
    }

    public ClimateCentro setGuide(String guide) {
        this.guide = guide;
        return this;
    }

    /**
     * Cuándo se cerró la última identificación NOM-035 ahí.
     */
    public String getLastOn() {
        return lastOn;
    }

    public ClimateCentro setLastOn(String lastOn) {
        this.lastOn = lastOn;
        return this;
    }

    /**
     * Cuándo toca la siguiente: cada dos años como mínimo (numeral 7.9).
     */
    public String getNextDue() {
        return nextDue;
    }

    public ClimateCentro setNextDue(String nextDue) {
        this.nextDue = nextDue;
        return this;
    }

    /**
     * Si ya le tocaba (o nunca se ha hecho).
     */
    public Boolean getOverdue() {
        return overdue;
    }

    public ClimateCentro setOverdue(Boolean overdue) {
        this.overdue = overdue;
        return this;
    }
}
