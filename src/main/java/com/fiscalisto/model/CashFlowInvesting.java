// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CashFlowInvesting: Actividades de inversión: activos fijos, terrenos, diferidos e inversiones permanentes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashFlowInvesting {
    /**
     * Cada grupo de cuentas que cambió.
     */
    @JsonProperty("lines")
    private List<CashFlowInvestingLine> lines;

    /**
     * El flujo neto de la actividad.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Cada grupo de cuentas que cambió.
     */
    public List<CashFlowInvestingLine> getLines() {
        return lines;
    }

    public CashFlowInvesting setLines(List<CashFlowInvestingLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * El flujo neto de la actividad.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CashFlowInvesting setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CashFlowInvesting setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
