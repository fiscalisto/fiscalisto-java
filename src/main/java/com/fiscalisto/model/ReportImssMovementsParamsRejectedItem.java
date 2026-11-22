// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReportImssMovementsParamsRejectedItem: ReportImssMovementsParamsRejectedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportImssMovementsParamsRejectedItem {
    /**
     * El movimiento (imv_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("movement")
    private String movement;

    /**
     * Lo que dice el IMSS, como en su acuse del IDSE.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * El movimiento (imv_…).
     * <p>
     * Obligatorio.
     */
    public String getMovement() {
        return movement;
    }

    public ReportImssMovementsParamsRejectedItem setMovement(String movement) {
        this.movement = movement;
        return this;
    }

    /**
     * Lo que dice el IMSS, como en su acuse del IDSE.
     * <p>
     * Obligatorio.
     */
    public String getReason() {
        return reason;
    }

    public ReportImssMovementsParamsRejectedItem setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
