// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteCostCenterParams: los campos de «Borrar un centro de costo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteCostCenterParams {
    /**
     * Otro centro de costo (ccn_…) que se queda con sus facturas.
     */
    @JsonProperty("move_to")
    private String moveTo;

    /**
     * Otro centro de costo (ccn_…) que se queda con sus facturas.
     */
    public String getMoveTo() {
        return moveTo;
    }

    public DeleteCostCenterParams setMoveTo(String moveTo) {
        this.moveTo = moveTo;
        return this;
    }
}
