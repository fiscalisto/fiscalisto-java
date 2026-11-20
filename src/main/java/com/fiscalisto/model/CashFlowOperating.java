// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CashFlowOperating: Actividades de operación.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashFlowOperating {
    /**
     * Lo que se suma porque no salió efectivo: depreciación (171), deterioro (172) y amortización (183).
     */
    @JsonProperty("non_cash")
    private List<CashFlowOperatingNonCashItem> nonCash;

    /**
     * El cambio en clientes, inventarios, proveedores, impuestos y demás cuentas de operación.
     */
    @JsonProperty("working_capital")
    private List<CashFlowOperatingWorkingCapitalItem> workingCapital;

    /**
     * El flujo neto de actividades de operación.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo que se suma porque no salió efectivo: depreciación (171), deterioro (172) y amortización (183).
     */
    public List<CashFlowOperatingNonCashItem> getNonCash() {
        return nonCash;
    }

    public CashFlowOperating setNonCash(List<CashFlowOperatingNonCashItem> nonCash) {
        this.nonCash = nonCash;
        return this;
    }

    /**
     * El cambio en clientes, inventarios, proveedores, impuestos y demás cuentas de operación.
     */
    public List<CashFlowOperatingWorkingCapitalItem> getWorkingCapital() {
        return workingCapital;
    }

    public CashFlowOperating setWorkingCapital(List<CashFlowOperatingWorkingCapitalItem> workingCapital) {
        this.workingCapital = workingCapital;
        return this;
    }

    /**
     * El flujo neto de actividades de operación.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CashFlowOperating setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CashFlowOperating setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
