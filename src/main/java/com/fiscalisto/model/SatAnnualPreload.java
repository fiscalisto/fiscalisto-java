// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatAnnualPreload: Lo que el SAT precargará en la declaración anual de una persona física: sus sueldos y retenciones, y sus deducciones personales.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatAnnualPreload {
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El ejercicio de la anual.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Lo que dice el visor de nómina del SAT: lo que le pagaron sus patrones y el ISR que le retuvieron, según sus recibos de nómina. null si aún no se lee.
     */
    @JsonProperty("payroll")
    private SatAnnualPreloadPayroll payroll;

    /**
     * Lo que dice el visor de deducciones personales del SAT. null si aún no se lee.
     */
    @JsonProperty("personal_deductions")
    private SatAnnualPreloadPersonalDeductions personalDeductions;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatAnnualPreload setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatAnnualPreload setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatAnnualPreload setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio de la anual.
     */
    public Long getYear() {
        return year;
    }

    public SatAnnualPreload setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public SatAnnualPreload setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Lo que dice el visor de nómina del SAT: lo que le pagaron sus patrones y el ISR que le retuvieron, según sus recibos de nómina. null si aún no se lee.
     */
    public SatAnnualPreloadPayroll getPayroll() {
        return payroll;
    }

    public SatAnnualPreload setPayroll(SatAnnualPreloadPayroll payroll) {
        this.payroll = payroll;
        return this;
    }

    /**
     * Lo que dice el visor de deducciones personales del SAT. null si aún no se lee.
     */
    public SatAnnualPreloadPersonalDeductions getPersonalDeductions() {
        return personalDeductions;
    }

    public SatAnnualPreload setPersonalDeductions(SatAnnualPreloadPersonalDeductions personalDeductions) {
        this.personalDeductions = personalDeductions;
        return this;
    }
}
