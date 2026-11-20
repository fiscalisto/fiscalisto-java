// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AnnualAdjustment: El ajuste anual del ISR de un ejercicio (artículo 97 de la Ley del ISR): el ISR del año de cada empleado contra lo retenido.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualAdjustment {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El ejercicio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Desde cuándo lo llevan los recibos: el 1 de enero del año siguiente.
     */
    @JsonProperty("applies_from")
    private String appliesFrom;

    /**
     * La fecha de pago del último recibo timbrado del año.
     */
    @JsonProperty("last_payment_date")
    private String lastPaymentDate;

    /**
     * Cada empleado que trabajó en el año.
     */
    @JsonProperty("employees")
    private List<AnnualAdjustmentEmployee> employees;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AnnualAdjustment setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AnnualAdjustment setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public AnnualAdjustment setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio.
     */
    public Long getYear() {
        return year;
    }

    public AnnualAdjustment setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public AnnualAdjustment setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Desde cuándo lo llevan los recibos: el 1 de enero del año siguiente.
     */
    public String getAppliesFrom() {
        return appliesFrom;
    }

    public AnnualAdjustment setAppliesFrom(String appliesFrom) {
        this.appliesFrom = appliesFrom;
        return this;
    }

    /**
     * La fecha de pago del último recibo timbrado del año.
     */
    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public AnnualAdjustment setLastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
        return this;
    }

    /**
     * Cada empleado que trabajó en el año.
     */
    public List<AnnualAdjustmentEmployee> getEmployees() {
        return employees;
    }

    public AnnualAdjustment setEmployees(List<AnnualAdjustmentEmployee> employees) {
        this.employees = employees;
        return this;
    }
}
