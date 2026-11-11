// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatRetentionPeriod: SatRetentionPeriod.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatRetentionPeriod {
    /**
     * Ejercicio (Ejercicio).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Mes inicial (MesIni), 1 a 12.
     */
    @JsonProperty("month_start")
    private Long monthStart;

    /**
     * Mes final (MesFin), 1 a 12.
     */
    @JsonProperty("month_end")
    private Long monthEnd;

    /**
     * Ejercicio (Ejercicio).
     */
    public Long getYear() {
        return year;
    }

    public SatRetentionPeriod setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public SatRetentionPeriod setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Mes inicial (MesIni), 1 a 12.
     */
    public Long getMonthStart() {
        return monthStart;
    }

    public SatRetentionPeriod setMonthStart(Long monthStart) {
        this.monthStart = monthStart;
        return this;
    }

    @JsonIgnore
    public SatRetentionPeriod setMonthStart(long monthStart) {
        return setMonthStart(Long.valueOf(monthStart));
    }

    /**
     * Mes final (MesFin), 1 a 12.
     */
    public Long getMonthEnd() {
        return monthEnd;
    }

    public SatRetentionPeriod setMonthEnd(Long monthEnd) {
        this.monthEnd = monthEnd;
        return this;
    }

    @JsonIgnore
    public SatRetentionPeriod setMonthEnd(long monthEnd) {
        return setMonthEnd(Long.valueOf(monthEnd));
    }
}
