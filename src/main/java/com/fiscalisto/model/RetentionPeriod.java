// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetentionPeriod: Periodo (Periodo): mes inicial, mes final y año.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetentionPeriod {
    /**
     * Año (Ejercicio).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Mes inicial (MesIni), 1 a 12.
     */
    @JsonProperty("from_month")
    private Long fromMonth;

    /**
     * Mes final (MesFin), 1 a 12, del mismo año.
     */
    @JsonProperty("to_month")
    private Long toMonth;

    /**
     * Año (Ejercicio).
     */
    public Long getYear() {
        return year;
    }

    public RetentionPeriod setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public RetentionPeriod setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Mes inicial (MesIni), 1 a 12.
     */
    public Long getFromMonth() {
        return fromMonth;
    }

    public RetentionPeriod setFromMonth(Long fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    @JsonIgnore
    public RetentionPeriod setFromMonth(long fromMonth) {
        return setFromMonth(Long.valueOf(fromMonth));
    }

    /**
     * Mes final (MesFin), 1 a 12, del mismo año.
     */
    public Long getToMonth() {
        return toMonth;
    }

    public RetentionPeriod setToMonth(Long toMonth) {
        this.toMonth = toMonth;
        return this;
    }

    @JsonIgnore
    public RetentionPeriod setToMonth(long toMonth) {
        return setToMonth(Long.valueOf(toMonth));
    }
}
