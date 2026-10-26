// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParams: los campos de «Cambiar las reglas de autofactura».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParams {
    /**
     * Hasta cuándo se puede facturar un ticket: `month`, hasta el fin del mes de la venta (lo usual ante el SAT); `days`, `window_days` días después.
     * <p>
     * Valores: month, days.
     */
    @JsonProperty("window")
    private String window;

    /**
     * Días para facturar con `window: days`.
     */
    @JsonProperty("window_days")
    private Long windowDays;

    /**
     * c_Periodicidad de la factura global con los tickets que nadie facturó: 01 diaria, 02 semanal, 03 quincenal, 04 mensual.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    @JsonProperty("global_periodicity")
    private String globalPeriodicity;

    /**
     * Hasta cuándo se puede facturar un ticket: `month`, hasta el fin del mes de la venta (lo usual ante el SAT); `days`, `window_days` días después.
     * <p>
     * Valores: month, days.
     */
    public String getWindow() {
        return window;
    }

    public UpdateSelfInvoicingParams setWindow(String window) {
        this.window = window;
        return this;
    }

    /**
     * Días para facturar con `window: days`.
     */
    public Long getWindowDays() {
        return windowDays;
    }

    public UpdateSelfInvoicingParams setWindowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    @JsonIgnore
    public UpdateSelfInvoicingParams setWindowDays(long windowDays) {
        return setWindowDays(Long.valueOf(windowDays));
    }

    /**
     * c_Periodicidad de la factura global con los tickets que nadie facturó: 01 diaria, 02 semanal, 03 quincenal, 04 mensual.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    public String getGlobalPeriodicity() {
        return globalPeriodicity;
    }

    public UpdateSelfInvoicingParams setGlobalPeriodicity(String globalPeriodicity) {
        this.globalPeriodicity = globalPeriodicity;
        return this;
    }
}
