// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTrainingSettingsParamsCommissionItem: UpdateTrainingSettingsParamsCommissionItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateTrainingSettingsParamsCommissionItem {
    /**
     * Su nombre.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * A quién representa: patron o trabajadores.
     * <p>
     * Valores: patron, trabajadores.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("side")
    private String side;

    /**
     * Su cargo en la comisión (opcional).
     */
    @JsonProperty("role")
    private String role;

    /**
     * Su nombre.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public UpdateTrainingSettingsParamsCommissionItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A quién representa: patron o trabajadores.
     * <p>
     * Valores: patron, trabajadores.
     * <p>
     * Obligatorio.
     */
    public String getSide() {
        return side;
    }

    public UpdateTrainingSettingsParamsCommissionItem setSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * Su cargo en la comisión (opcional).
     */
    public String getRole() {
        return role;
    }

    public UpdateTrainingSettingsParamsCommissionItem setRole(String role) {
        this.role = role;
        return this;
    }
}
