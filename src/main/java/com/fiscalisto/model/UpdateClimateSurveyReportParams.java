// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateClimateSurveyReportParams: los campos de «Guardar el informe de una encuesta».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateClimateSurveyReportParams {
    /**
     * El domicilio del centro de trabajo (numeral 7.7 b)).
     */
    @JsonProperty("address")
    private String address;

    /**
     * Su actividad principal.
     */
    @JsonProperty("activity")
    private String activity;

    /**
     * El objetivo de la evaluación.
     */
    @JsonProperty("objective")
    private String objective;

    /**
     * Las principales actividades que se hacen ahí.
     */
    @JsonProperty("activities")
    private String activities;

    /**
     * Las conclusiones (numeral 7.7 g)).
     */
    @JsonProperty("conclusions")
    private String conclusions;

    /**
     * El responsable de la evaluación.
     */
    @JsonProperty("responsible")
    private String responsible;

    /**
     * Su cédula profesional, si la tiene.
     */
    @JsonProperty("license")
    private String license;

    /**
     * El domicilio del centro de trabajo (numeral 7.7 b)).
     */
    public String getAddress() {
        return address;
    }

    public UpdateClimateSurveyReportParams setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Su actividad principal.
     */
    public String getActivity() {
        return activity;
    }

    public UpdateClimateSurveyReportParams setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    /**
     * El objetivo de la evaluación.
     */
    public String getObjective() {
        return objective;
    }

    public UpdateClimateSurveyReportParams setObjective(String objective) {
        this.objective = objective;
        return this;
    }

    /**
     * Las principales actividades que se hacen ahí.
     */
    public String getActivities() {
        return activities;
    }

    public UpdateClimateSurveyReportParams setActivities(String activities) {
        this.activities = activities;
        return this;
    }

    /**
     * Las conclusiones (numeral 7.7 g)).
     */
    public String getConclusions() {
        return conclusions;
    }

    public UpdateClimateSurveyReportParams setConclusions(String conclusions) {
        this.conclusions = conclusions;
        return this;
    }

    /**
     * El responsable de la evaluación.
     */
    public String getResponsible() {
        return responsible;
    }

    public UpdateClimateSurveyReportParams setResponsible(String responsible) {
        this.responsible = responsible;
        return this;
    }

    /**
     * Su cédula profesional, si la tiene.
     */
    public String getLicense() {
        return license;
    }

    public UpdateClimateSurveyReportParams setLicense(String license) {
        this.license = license;
        return this;
    }
}
