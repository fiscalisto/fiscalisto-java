// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClimateSurveyReport: Lo que dice el informe además de los resultados (numeral 7.7).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyReport {
    /**
     * El domicilio del centro de trabajo.
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
     * Las conclusiones.
     */
    @JsonProperty("conclusions")
    private String conclusions;

    /**
     * El responsable de la evaluación.
     */
    @JsonProperty("responsible")
    private String responsible;

    /**
     * Su cédula profesional.
     */
    @JsonProperty("license")
    private String license;

    /**
     * El domicilio del centro de trabajo.
     */
    public String getAddress() {
        return address;
    }

    public ClimateSurveyReport setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Su actividad principal.
     */
    public String getActivity() {
        return activity;
    }

    public ClimateSurveyReport setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    /**
     * El objetivo de la evaluación.
     */
    public String getObjective() {
        return objective;
    }

    public ClimateSurveyReport setObjective(String objective) {
        this.objective = objective;
        return this;
    }

    /**
     * Las principales actividades que se hacen ahí.
     */
    public String getActivities() {
        return activities;
    }

    public ClimateSurveyReport setActivities(String activities) {
        this.activities = activities;
        return this;
    }

    /**
     * Las conclusiones.
     */
    public String getConclusions() {
        return conclusions;
    }

    public ClimateSurveyReport setConclusions(String conclusions) {
        this.conclusions = conclusions;
        return this;
    }

    /**
     * El responsable de la evaluación.
     */
    public String getResponsible() {
        return responsible;
    }

    public ClimateSurveyReport setResponsible(String responsible) {
        this.responsible = responsible;
        return this;
    }

    /**
     * Su cédula profesional.
     */
    public String getLicense() {
        return license;
    }

    public ClimateSurveyReport setLicense(String license) {
        this.license = license;
        return this;
    }
}
