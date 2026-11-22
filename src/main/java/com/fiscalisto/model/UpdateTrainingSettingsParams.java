// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * UpdateTrainingSettingsParams: los campos de «Configurar la capacitación».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateTrainingSettingsParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El nombre de la empresa en la constancia; null usa la razón social. Persona física: apellido paterno, materno y nombre(s).
     */
    @JsonProperty("company_name")
    private String companyName;

    /**
     * Quien firma como patrón o representante legal cuando hay hasta 50 trabajadores (art. 24, fr. II).
     */
    @JsonProperty("legal_rep")
    private String legalRep;

    /**
     * Con más de 50 trabajadores: el representante del patrón ante la comisión mixta de capacitación, que firma la constancia.
     */
    @JsonProperty("commission_employer_rep")
    private String commissionEmployerRep;

    /**
     * Con más de 50 trabajadores: el representante de los trabajadores ante la comisión mixta, que también firma.
     */
    @JsonProperty("workers_rep")
    private String workersRep;

    /**
     * Los integrantes de la comisión mixta de capacitación (LFT 153-E: igual número por cada parte).
     */
    @JsonProperty("commission")
    private List<UpdateTrainingSettingsParamsCommissionItem> commission;

    /**
     * El día en que se constituyó la comisión mixta.
     */
    @JsonProperty("commission_constituted_on")
    private String commissionConstitutedOn;

    /**
     * Los trabajadores de la empresa, si no todos están en Nómina; null cuenta los empleados activos.
     */
    @JsonProperty("workers_count")
    private Long workersCount;

    /**
     * El día en que empieza el plan de capacitación (dos años como máximo, LFT 153-H).
     */
    @JsonProperty("plan_start")
    private String planStart;

    /**
     * El día en que termina el plan.
     */
    @JsonProperty("plan_end")
    private String planEnd;

    /**
     * La ocupación del Catálogo Nacional de Ocupaciones de cada puesto: {"Operador de montacargas": "06.2"}. Reemplaza las de antes.
     */
    @JsonProperty("occupations")
    private Map<String, String> occupations;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateTrainingSettingsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El nombre de la empresa en la constancia; null usa la razón social. Persona física: apellido paterno, materno y nombre(s).
     */
    public String getCompanyName() {
        return companyName;
    }

    public UpdateTrainingSettingsParams setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Quien firma como patrón o representante legal cuando hay hasta 50 trabajadores (art. 24, fr. II).
     */
    public String getLegalRep() {
        return legalRep;
    }

    public UpdateTrainingSettingsParams setLegalRep(String legalRep) {
        this.legalRep = legalRep;
        return this;
    }

    /**
     * Con más de 50 trabajadores: el representante del patrón ante la comisión mixta de capacitación, que firma la constancia.
     */
    public String getCommissionEmployerRep() {
        return commissionEmployerRep;
    }

    public UpdateTrainingSettingsParams setCommissionEmployerRep(String commissionEmployerRep) {
        this.commissionEmployerRep = commissionEmployerRep;
        return this;
    }

    /**
     * Con más de 50 trabajadores: el representante de los trabajadores ante la comisión mixta, que también firma.
     */
    public String getWorkersRep() {
        return workersRep;
    }

    public UpdateTrainingSettingsParams setWorkersRep(String workersRep) {
        this.workersRep = workersRep;
        return this;
    }

    /**
     * Los integrantes de la comisión mixta de capacitación (LFT 153-E: igual número por cada parte).
     */
    public List<UpdateTrainingSettingsParamsCommissionItem> getCommission() {
        return commission;
    }

    public UpdateTrainingSettingsParams setCommission(List<UpdateTrainingSettingsParamsCommissionItem> commission) {
        this.commission = commission;
        return this;
    }

    /**
     * El día en que se constituyó la comisión mixta.
     */
    public String getCommissionConstitutedOn() {
        return commissionConstitutedOn;
    }

    public UpdateTrainingSettingsParams setCommissionConstitutedOn(String commissionConstitutedOn) {
        this.commissionConstitutedOn = commissionConstitutedOn;
        return this;
    }

    /**
     * Los trabajadores de la empresa, si no todos están en Nómina; null cuenta los empleados activos.
     */
    public Long getWorkersCount() {
        return workersCount;
    }

    public UpdateTrainingSettingsParams setWorkersCount(Long workersCount) {
        this.workersCount = workersCount;
        return this;
    }

    @JsonIgnore
    public UpdateTrainingSettingsParams setWorkersCount(long workersCount) {
        return setWorkersCount(Long.valueOf(workersCount));
    }

    /**
     * El día en que empieza el plan de capacitación (dos años como máximo, LFT 153-H).
     */
    public String getPlanStart() {
        return planStart;
    }

    public UpdateTrainingSettingsParams setPlanStart(String planStart) {
        this.planStart = planStart;
        return this;
    }

    /**
     * El día en que termina el plan.
     */
    public String getPlanEnd() {
        return planEnd;
    }

    public UpdateTrainingSettingsParams setPlanEnd(String planEnd) {
        this.planEnd = planEnd;
        return this;
    }

    /**
     * La ocupación del Catálogo Nacional de Ocupaciones de cada puesto: {"Operador de montacargas": "06.2"}. Reemplaza las de antes.
     */
    public Map<String, String> getOccupations() {
        return occupations;
    }

    public UpdateTrainingSettingsParams setOccupations(Map<String, String> occupations) {
        this.occupations = occupations;
        return this;
    }
}
