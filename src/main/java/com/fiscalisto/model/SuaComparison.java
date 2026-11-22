// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SuaComparison: La cédula de determinación de cuotas del SUA comparada, trabajador por trabajador, con las cuotas patronales que Fiscalisto calculó de los recibos del mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuaComparison {
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
     * El mes que se comparó (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * El mes que dice la cédula (AAAA-MM), o null si no lo dice.
     */
    @JsonProperty("cedula_month")
    private String cedulaMonth;

    /**
     * El registro patronal de la cédula, sin guiones.
     */
    @JsonProperty("employer_registration")
    private String employerRegistration;

    /**
     * true si la cédula es de otro registro patronal que el de sus datos fiscales.
     */
    @JsonProperty("other_employer_registration")
    private Boolean otherEmployerRegistration;

    /**
     * La prima de riesgo de trabajo de la cédula, como fracción; el cálculo se hizo con ella.
     */
    @JsonProperty("employer_risk_premium")
    private BigDecimal employerRiskPremium;

    /**
     * true si no se pudo leer el texto del PDF (dañado o escaneado): imprímalo de nuevo desde el SUA.
     */
    @JsonProperty("unreadable")
    private Boolean unreadable;

    /**
     * Cada trabajador: primero los que difieren, luego los que coinciden.
     */
    @JsonProperty("workers")
    private List<SuaComparisonWorker> workers;

    /**
     * Totales (Totales).
     */
    @JsonProperty("totals")
    private SuaComparisonTotals totals;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SuaComparison setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SuaComparison setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SuaComparison setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes que se comparó (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public SuaComparison setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El mes que dice la cédula (AAAA-MM), o null si no lo dice.
     */
    public String getCedulaMonth() {
        return cedulaMonth;
    }

    public SuaComparison setCedulaMonth(String cedulaMonth) {
        this.cedulaMonth = cedulaMonth;
        return this;
    }

    /**
     * El registro patronal de la cédula, sin guiones.
     */
    public String getEmployerRegistration() {
        return employerRegistration;
    }

    public SuaComparison setEmployerRegistration(String employerRegistration) {
        this.employerRegistration = employerRegistration;
        return this;
    }

    /**
     * true si la cédula es de otro registro patronal que el de sus datos fiscales.
     */
    public Boolean getOtherEmployerRegistration() {
        return otherEmployerRegistration;
    }

    public SuaComparison setOtherEmployerRegistration(Boolean otherEmployerRegistration) {
        this.otherEmployerRegistration = otherEmployerRegistration;
        return this;
    }

    /**
     * La prima de riesgo de trabajo de la cédula, como fracción; el cálculo se hizo con ella.
     */
    public BigDecimal getEmployerRiskPremium() {
        return employerRiskPremium;
    }

    public SuaComparison setEmployerRiskPremium(BigDecimal employerRiskPremium) {
        this.employerRiskPremium = employerRiskPremium;
        return this;
    }

    @JsonIgnore
    public SuaComparison setEmployerRiskPremium(double employerRiskPremium) {
        return setEmployerRiskPremium(BigDecimal.valueOf(employerRiskPremium));
    }

    /**
     * true si no se pudo leer el texto del PDF (dañado o escaneado): imprímalo de nuevo desde el SUA.
     */
    public Boolean getUnreadable() {
        return unreadable;
    }

    public SuaComparison setUnreadable(Boolean unreadable) {
        this.unreadable = unreadable;
        return this;
    }

    /**
     * Cada trabajador: primero los que difieren, luego los que coinciden.
     */
    public List<SuaComparisonWorker> getWorkers() {
        return workers;
    }

    public SuaComparison setWorkers(List<SuaComparisonWorker> workers) {
        this.workers = workers;
        return this;
    }

    /**
     * Totales (Totales).
     */
    public SuaComparisonTotals getTotals() {
        return totals;
    }

    public SuaComparison setTotals(SuaComparisonTotals totals) {
        this.totals = totals;
        return this;
    }
}
