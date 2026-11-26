// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInvoiceParamsGlobal: Factura global a público en general (InformacionGlobal): periodicidad, meses y año.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsGlobal {
    /**
     * Periodicidad (Periodicidad), c_Periodicidad: 01 diario, 02 semanal o 04 mensual; 05 bimestral solo en el Régimen de Incorporación Fiscal (621). La regla 2.7.1.21 de la RMF 2026 no permite 03 quincenal.
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
     * Año (Año): el de la fecha de la factura o hasta cinco años antes (CFDI40136).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Solo emisores con régimen 603 (donatarias y asociaciones): true conserva la descripción, claves, unidad y cantidad de cada concepto en vez de «Venta», 01010101, ACT.
     */
    @JsonProperty("keep_concepts")
    private Boolean keepConcepts;

    /**
     * Periodicidad (Periodicidad), c_Periodicidad: 01 diario, 02 semanal o 04 mensual; 05 bimestral solo en el Régimen de Incorporación Fiscal (621). La regla 2.7.1.21 de la RMF 2026 no permite 03 quincenal.
     * <p>
     * Obligatorio.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public UpdateInvoiceParamsGlobal setPeriodicity(String periodicity) {
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

    public UpdateInvoiceParamsGlobal setMonths(String months) {
        this.months = months;
        return this;
    }

    /**
     * Año (Año): el de la fecha de la factura o hasta cinco años antes (CFDI40136).
     * <p>
     * Obligatorio.
     */
    public Long getYear() {
        return year;
    }

    public UpdateInvoiceParamsGlobal setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsGlobal setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Solo emisores con régimen 603 (donatarias y asociaciones): true conserva la descripción, claves, unidad y cantidad de cada concepto en vez de «Venta», 01010101, ACT.
     */
    public Boolean getKeepConcepts() {
        return keepConcepts;
    }

    public UpdateInvoiceParamsGlobal setKeepConcepts(Boolean keepConcepts) {
        this.keepConcepts = keepConcepts;
        return this;
    }
}
