// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateRetentionParamsPeriod: Periodo (Periodo): mes inicial, mes final y año.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsPeriod {
    /**
     * Año (Ejercicio).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Un solo mes, del 1 al 12 (MesIni y MesFin iguales).
     */
    @JsonProperty("month")
    private Long month;

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
     * <p>
     * Obligatorio.
     */
    public Long getYear() {
        return year;
    }

    public CreateRetentionParamsPeriod setYear(Long year) {
        this.year = year;
        return this;
    }

    public CreateRetentionParamsPeriod setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Un solo mes, del 1 al 12 (MesIni y MesFin iguales).
     */
    public Long getMonth() {
        return month;
    }

    public CreateRetentionParamsPeriod setMonth(Long month) {
        this.month = month;
        return this;
    }

    public CreateRetentionParamsPeriod setMonth(long month) {
        return setMonth(Long.valueOf(month));
    }

    /**
     * Mes inicial (MesIni), 1 a 12.
     */
    public Long getFromMonth() {
        return fromMonth;
    }

    public CreateRetentionParamsPeriod setFromMonth(Long fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    public CreateRetentionParamsPeriod setFromMonth(long fromMonth) {
        return setFromMonth(Long.valueOf(fromMonth));
    }

    /**
     * Mes final (MesFin), 1 a 12, del mismo año.
     */
    public Long getToMonth() {
        return toMonth;
    }

    public CreateRetentionParamsPeriod setToMonth(Long toMonth) {
        this.toMonth = toMonth;
        return this;
    }

    public CreateRetentionParamsPeriod setToMonth(long toMonth) {
        return setToMonth(Long.valueOf(toMonth));
    }
}
