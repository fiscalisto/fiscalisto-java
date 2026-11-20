// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CashFlowFinancing: Actividades de financiamiento: préstamos bancarios, dividendos, aportaciones y capital.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashFlowFinancing {
    /**
     * Cada grupo de cuentas que cambió.
     */
    @JsonProperty("lines")
    private List<CashFlowFinancingLine> lines;

    /**
     * El flujo neto de la actividad.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Cada grupo de cuentas que cambió.
     */
    public List<CashFlowFinancingLine> getLines() {
        return lines;
    }

    public CashFlowFinancing setLines(List<CashFlowFinancingLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * El flujo neto de la actividad.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CashFlowFinancing setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CashFlowFinancing setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
