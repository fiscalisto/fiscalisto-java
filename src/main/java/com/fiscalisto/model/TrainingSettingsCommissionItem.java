// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrainingSettingsCommissionItem: TrainingSettingsCommissionItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingSettingsCommissionItem {
    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * patron o trabajadores.
     */
    @JsonProperty("side")
    private String side;

    /**
     * Su cargo en la comisión (presidente, secretario…).
     */
    @JsonProperty("role")
    private String role;

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public TrainingSettingsCommissionItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * patron o trabajadores.
     */
    public String getSide() {
        return side;
    }

    public TrainingSettingsCommissionItem setSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * Su cargo en la comisión (presidente, secretario…).
     */
    public String getRole() {
        return role;
    }

    public TrainingSettingsCommissionItem setRole(String role) {
        this.role = role;
        return this;
    }
}
