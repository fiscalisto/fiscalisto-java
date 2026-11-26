// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * Training: La capacitación de un emisor (Nómina › Capacitación).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Training {
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
    private StringOr<Issuer> issuer;

    /**
     * Lo que se configura en POST /v1/training/settings.
     */
    @JsonProperty("settings")
    private TrainingSettings settings;

    /**
     * Los trabajadores que cuenta.
     */
    @JsonProperty("workers")
    private Long workers;

    /**
     * Si los cuenta de Nómina (true) o a mano (false).
     */
    @JsonProperty("workers_from_payroll")
    private Boolean workersFromPayroll;

    /**
     * Si son más de 50 y firman los representantes de la comisión mixta (artículo 24, fracción II).
     */
    @JsonProperty("mixed_commission")
    private Boolean mixedCommission;

    /**
     * Los años del plan de capacitación.
     */
    @JsonProperty("plan_years")
    private List<TrainingPlanYear> planYears;

    /**
     * Constancias que vencen en 60 días o ya vencieron.
     */
    @JsonProperty("renewals")
    private List<TrainingRenewal> renewals;

    /**
     * Totales (Totales).
     */
    @JsonProperty("totals")
    private TrainingTotals totals;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Training setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Training setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public Training setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public Training setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public Training setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Lo que se configura en POST /v1/training/settings.
     */
    public TrainingSettings getSettings() {
        return settings;
    }

    public Training setSettings(TrainingSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Los trabajadores que cuenta.
     */
    public Long getWorkers() {
        return workers;
    }

    public Training setWorkers(Long workers) {
        this.workers = workers;
        return this;
    }

    @JsonIgnore
    public Training setWorkers(long workers) {
        return setWorkers(Long.valueOf(workers));
    }

    /**
     * Si los cuenta de Nómina (true) o a mano (false).
     */
    public Boolean getWorkersFromPayroll() {
        return workersFromPayroll;
    }

    public Training setWorkersFromPayroll(Boolean workersFromPayroll) {
        this.workersFromPayroll = workersFromPayroll;
        return this;
    }

    /**
     * Si son más de 50 y firman los representantes de la comisión mixta (artículo 24, fracción II).
     */
    public Boolean getMixedCommission() {
        return mixedCommission;
    }

    public Training setMixedCommission(Boolean mixedCommission) {
        this.mixedCommission = mixedCommission;
        return this;
    }

    /**
     * Los años del plan de capacitación.
     */
    public List<TrainingPlanYear> getPlanYears() {
        return planYears;
    }

    public Training setPlanYears(List<TrainingPlanYear> planYears) {
        this.planYears = planYears;
        return this;
    }

    /**
     * Constancias que vencen en 60 días o ya vencieron.
     */
    public List<TrainingRenewal> getRenewals() {
        return renewals;
    }

    public Training setRenewals(List<TrainingRenewal> renewals) {
        this.renewals = renewals;
        return this;
    }

    /**
     * Totales (Totales).
     */
    public TrainingTotals getTotals() {
        return totals;
    }

    public Training setTotals(TrainingTotals totals) {
        this.totals = totals;
        return this;
    }
}
