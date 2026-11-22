// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * TrainingSettings: Lo que se configura en POST /v1/training/settings.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingSettings {
    /**
     * El nombre en la constancia; null usa la razón social.
     */
    @JsonProperty("company_name")
    private String companyName;

    /**
     * Quien firma con hasta 50 trabajadores.
     */
    @JsonProperty("legal_rep")
    private String legalRep;

    /**
     * El representante del patrón ante la comisión mixta.
     */
    @JsonProperty("commission_employer_rep")
    private String commissionEmployerRep;

    /**
     * El representante de los trabajadores ante la comisión mixta.
     */
    @JsonProperty("workers_rep")
    private String workersRep;

    /**
     * Los integrantes de la comisión mixta de capacitación (artículo 153-E LFT).
     */
    @JsonProperty("commission")
    private List<TrainingSettingsCommissionItem> commission;

    /**
     * El día en que se constituyó la comisión mixta.
     */
    @JsonProperty("commission_constituted_on")
    private String commissionConstitutedOn;

    /**
     * Los trabajadores contados a mano; null cuenta Nómina.
     */
    @JsonProperty("workers_count")
    private Long workersCount;

    /**
     * Cuándo empieza el plan de capacitación vigente.
     */
    @JsonProperty("plan_start")
    private String planStart;

    /**
     * Cuándo termina el plan de capacitación vigente.
     */
    @JsonProperty("plan_end")
    private String planEnd;

    /**
     * La ocupación de cada puesto.
     */
    @JsonProperty("occupations")
    private Map<String, String> occupations;

    /**
     * El nombre en la constancia; null usa la razón social.
     */
    public String getCompanyName() {
        return companyName;
    }

    public TrainingSettings setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Quien firma con hasta 50 trabajadores.
     */
    public String getLegalRep() {
        return legalRep;
    }

    public TrainingSettings setLegalRep(String legalRep) {
        this.legalRep = legalRep;
        return this;
    }

    /**
     * El representante del patrón ante la comisión mixta.
     */
    public String getCommissionEmployerRep() {
        return commissionEmployerRep;
    }

    public TrainingSettings setCommissionEmployerRep(String commissionEmployerRep) {
        this.commissionEmployerRep = commissionEmployerRep;
        return this;
    }

    /**
     * El representante de los trabajadores ante la comisión mixta.
     */
    public String getWorkersRep() {
        return workersRep;
    }

    public TrainingSettings setWorkersRep(String workersRep) {
        this.workersRep = workersRep;
        return this;
    }

    /**
     * Los integrantes de la comisión mixta de capacitación (artículo 153-E LFT).
     */
    public List<TrainingSettingsCommissionItem> getCommission() {
        return commission;
    }

    public TrainingSettings setCommission(List<TrainingSettingsCommissionItem> commission) {
        this.commission = commission;
        return this;
    }

    /**
     * El día en que se constituyó la comisión mixta.
     */
    public String getCommissionConstitutedOn() {
        return commissionConstitutedOn;
    }

    public TrainingSettings setCommissionConstitutedOn(String commissionConstitutedOn) {
        this.commissionConstitutedOn = commissionConstitutedOn;
        return this;
    }

    /**
     * Los trabajadores contados a mano; null cuenta Nómina.
     */
    public Long getWorkersCount() {
        return workersCount;
    }

    public TrainingSettings setWorkersCount(Long workersCount) {
        this.workersCount = workersCount;
        return this;
    }

    @JsonIgnore
    public TrainingSettings setWorkersCount(long workersCount) {
        return setWorkersCount(Long.valueOf(workersCount));
    }

    /**
     * Cuándo empieza el plan de capacitación vigente.
     */
    public String getPlanStart() {
        return planStart;
    }

    public TrainingSettings setPlanStart(String planStart) {
        this.planStart = planStart;
        return this;
    }

    /**
     * Cuándo termina el plan de capacitación vigente.
     */
    public String getPlanEnd() {
        return planEnd;
    }

    public TrainingSettings setPlanEnd(String planEnd) {
        this.planEnd = planEnd;
        return this;
    }

    /**
     * La ocupación de cada puesto.
     */
    public Map<String, String> getOccupations() {
        return occupations;
    }

    public TrainingSettings setOccupations(Map<String, String> occupations) {
        this.occupations = occupations;
        return this;
    }
}
