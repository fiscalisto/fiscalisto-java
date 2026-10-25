// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateGlobal: Factura global a público en general (InformacionGlobal): periodicidad, meses y año.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateGlobal {
    /**
     * Periodicidad (Periodicidad), c_Periodicidad: 01 diario, 02 semanal, 03 quincenal, 04 mensual, 05 bimestral.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * Meses (Meses), c_Meses: 01 a 12, o 13 a 18 bimestres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("months")
    private String months;

    /**
     * Año (Año).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Periodicidad (Periodicidad), c_Periodicidad: 01 diario, 02 semanal, 03 quincenal, 04 mensual, 05 bimestral.
     * <p>
     * Obligatorio.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public InvoiceCreateGlobal setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * Meses (Meses), c_Meses: 01 a 12, o 13 a 18 bimestres.
     * <p>
     * Obligatorio.
     */
    public String getMonths() {
        return months;
    }

    public InvoiceCreateGlobal setMonths(String months) {
        this.months = months;
        return this;
    }

    /**
     * Año (Año).
     * <p>
     * Obligatorio.
     */
    public Long getYear() {
        return year;
    }

    public InvoiceCreateGlobal setYear(Long year) {
        this.year = year;
        return this;
    }

    public InvoiceCreateGlobal setYear(long year) {
        return setYear(Long.valueOf(year));
    }
}
