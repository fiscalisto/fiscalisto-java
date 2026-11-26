// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollCost: Lo que cuesta la nómina del año mes por mes: lo pagado más las cuotas del patrón y el impuesto sobre nómina.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollCost {
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
     * iss_…
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * Año (Ejercicio).
     */
    @JsonProperty("year")
    private BigDecimal year;

    /**
     * Si las cuotas del patrón y el ISN del año se pueden calcular.
     */
    @JsonProperty("rates_loaded")
    private Boolean ratesLoaded;

    /**
     * Cada mes con recibos, del más antiguo al más reciente.
     */
    @JsonProperty("months")
    private List<PayrollCostMonth> months;

    /**
     * Totales (Totales).
     */
    @JsonProperty("totals")
    private PayrollCostTotals totals;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollCost setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollCost setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * iss_…
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public PayrollCost setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public PayrollCost setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public PayrollCost setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Año (Ejercicio).
     */
    public BigDecimal getYear() {
        return year;
    }

    public PayrollCost setYear(BigDecimal year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public PayrollCost setYear(double year) {
        return setYear(BigDecimal.valueOf(year));
    }

    /**
     * Si las cuotas del patrón y el ISN del año se pueden calcular.
     */
    public Boolean getRatesLoaded() {
        return ratesLoaded;
    }

    public PayrollCost setRatesLoaded(Boolean ratesLoaded) {
        this.ratesLoaded = ratesLoaded;
        return this;
    }

    /**
     * Cada mes con recibos, del más antiguo al más reciente.
     */
    public List<PayrollCostMonth> getMonths() {
        return months;
    }

    public PayrollCost setMonths(List<PayrollCostMonth> months) {
        this.months = months;
        return this;
    }

    /**
     * Totales (Totales).
     */
    public PayrollCostTotals getTotals() {
        return totals;
    }

    public PayrollCost setTotals(PayrollCostTotals totals) {
        this.totals = totals;
        return this;
    }
}
