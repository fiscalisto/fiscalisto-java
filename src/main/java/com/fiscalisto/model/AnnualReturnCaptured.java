// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AnnualReturnCaptured: Lo capturado con POST /v1/accounting/annual_returns/{year}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnCaptured {
    /**
     * Las pérdidas capturadas.
     */
    @JsonProperty("losses")
    private List<AnnualReturnCapturedLoss> losses;

    /**
     * Las deducciones pendientes capturadas.
     */
    @JsonProperty("pending_deductions")
    private List<AnnualReturnCapturedPendingDeduction> pendingDeductions;

    /**
     * Conceptos (Conceptos), al menos uno.
     */
    @JsonProperty("items")
    private List<AnnualReturnCapturedItem> items;

    /**
     * true si está en una excepción del artículo 78-E.
     */
    @JsonProperty("exception_78e")
    private Boolean exception78e;

    /**
     * Mes inicial (MesIni), 1 a 12.
     */
    @JsonProperty("from_month")
    private Long fromMonth;

    /**
     * Las pérdidas capturadas.
     */
    public List<AnnualReturnCapturedLoss> getLosses() {
        return losses;
    }

    public AnnualReturnCaptured setLosses(List<AnnualReturnCapturedLoss> losses) {
        this.losses = losses;
        return this;
    }

    /**
     * Las deducciones pendientes capturadas.
     */
    public List<AnnualReturnCapturedPendingDeduction> getPendingDeductions() {
        return pendingDeductions;
    }

    public AnnualReturnCaptured setPendingDeductions(List<AnnualReturnCapturedPendingDeduction> pendingDeductions) {
        this.pendingDeductions = pendingDeductions;
        return this;
    }

    /**
     * Conceptos (Conceptos), al menos uno.
     */
    public List<AnnualReturnCapturedItem> getItems() {
        return items;
    }

    public AnnualReturnCaptured setItems(List<AnnualReturnCapturedItem> items) {
        this.items = items;
        return this;
    }

    /**
     * true si está en una excepción del artículo 78-E.
     */
    public Boolean getException78e() {
        return exception78e;
    }

    public AnnualReturnCaptured setException78e(Boolean exception78e) {
        this.exception78e = exception78e;
        return this;
    }

    /**
     * Mes inicial (MesIni), 1 a 12.
     */
    public Long getFromMonth() {
        return fromMonth;
    }

    public AnnualReturnCaptured setFromMonth(Long fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    @JsonIgnore
    public AnnualReturnCaptured setFromMonth(long fromMonth) {
        return setFromMonth(Long.valueOf(fromMonth));
    }
}
