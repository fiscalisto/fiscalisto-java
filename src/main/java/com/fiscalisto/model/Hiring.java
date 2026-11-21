// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Hiring: La página de empleos de un emisor: su configuración, sus formularios y sus vacantes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hiring {
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
     * La página de empleos del emisor.
     */
    @JsonProperty("careers_url")
    private String careersUrl;

    /**
     * Si la página se ve.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * El texto de arriba de la página.
     */
    @JsonProperty("intro")
    private String intro;

    /**
     * El correo para dudas y derechos ARCO de los candidatos; null usa el de Datos fiscales.
     */
    @JsonProperty("contact_email")
    private String contactEmail;

    /**
     * Las etapas de sus candidatos, en orden.
     */
    @JsonProperty("stages")
    private List<String> stages;

    /**
     * Quien no cumple un requisito: flag, su solicitud llega marcada; warn, además se le dice antes de enviar.
     * <p>
     * Valores: flag, warn.
     */
    @JsonProperty("unmet_requirements")
    private String unmetRequirements;

    /**
     * El formulario (jbf_…) de las vacantes que no eligen uno; null el básico.
     */
    @JsonProperty("default_form")
    private String defaultForm;

    /**
     * Sus formularios de solicitud.
     */
    @JsonProperty("forms")
    private List<JobForm> forms;

    /**
     * Las vacantes abiertas, y las cubiertas que aún tienen candidatos.
     */
    @JsonProperty("vacancies")
    private List<HiringVacancy> vacancies;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Hiring setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Hiring setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public Hiring setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La página de empleos del emisor.
     */
    public String getCareersUrl() {
        return careersUrl;
    }

    public Hiring setCareersUrl(String careersUrl) {
        this.careersUrl = careersUrl;
        return this;
    }

    /**
     * Si la página se ve.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public Hiring setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * El texto de arriba de la página.
     */
    public String getIntro() {
        return intro;
    }

    public Hiring setIntro(String intro) {
        this.intro = intro;
        return this;
    }

    /**
     * El correo para dudas y derechos ARCO de los candidatos; null usa el de Datos fiscales.
     */
    public String getContactEmail() {
        return contactEmail;
    }

    public Hiring setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Las etapas de sus candidatos, en orden.
     */
    public List<String> getStages() {
        return stages;
    }

    public Hiring setStages(List<String> stages) {
        this.stages = stages;
        return this;
    }

    /**
     * Quien no cumple un requisito: flag, su solicitud llega marcada; warn, además se le dice antes de enviar.
     * <p>
     * Valores: flag, warn.
     */
    public String getUnmetRequirements() {
        return unmetRequirements;
    }

    public Hiring setUnmetRequirements(String unmetRequirements) {
        this.unmetRequirements = unmetRequirements;
        return this;
    }

    /**
     * El formulario (jbf_…) de las vacantes que no eligen uno; null el básico.
     */
    public String getDefaultForm() {
        return defaultForm;
    }

    public Hiring setDefaultForm(String defaultForm) {
        this.defaultForm = defaultForm;
        return this;
    }

    /**
     * Sus formularios de solicitud.
     */
    public List<JobForm> getForms() {
        return forms;
    }

    public Hiring setForms(List<JobForm> forms) {
        this.forms = forms;
        return this;
    }

    /**
     * Las vacantes abiertas, y las cubiertas que aún tienen candidatos.
     */
    public List<HiringVacancy> getVacancies() {
        return vacancies;
    }

    public Hiring setVacancies(List<HiringVacancy> vacancies) {
        this.vacancies = vacancies;
        return this;
    }
}
