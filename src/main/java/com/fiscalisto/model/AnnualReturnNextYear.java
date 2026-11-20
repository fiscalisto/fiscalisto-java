// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AnnualReturnNextYear: Lo que pasa al año siguiente: las pérdidas que quedan (con la de este año) y desde 2027 las deducciones pendientes del artículo 78-B.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnNextYear {
    /**
     * Las pérdidas que quedan.
     */
    @JsonProperty("losses")
    private List<AnnualReturnNextYearLoss> losses;

    /**
     * Las deducciones pendientes del artículo 78-B.
     */
    @JsonProperty("pending_deductions")
    private List<AnnualReturnNextYearPendingDeduction> pendingDeductions;

    /**
     * Las pérdidas que quedan.
     */
    public List<AnnualReturnNextYearLoss> getLosses() {
        return losses;
    }

    public AnnualReturnNextYear setLosses(List<AnnualReturnNextYearLoss> losses) {
        this.losses = losses;
        return this;
    }

    /**
     * Las deducciones pendientes del artículo 78-B.
     */
    public List<AnnualReturnNextYearPendingDeduction> getPendingDeductions() {
        return pendingDeductions;
    }

    public AnnualReturnNextYear setPendingDeductions(List<AnnualReturnNextYearPendingDeduction> pendingDeductions) {
        this.pendingDeductions = pendingDeductions;
        return this;
    }
}
