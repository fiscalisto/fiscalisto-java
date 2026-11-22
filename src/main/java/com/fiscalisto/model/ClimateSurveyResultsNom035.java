// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ClimateSurveyResultsNom035: ClimateSurveyResultsNom035.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyResultsNom035 {
    /**
     * La calificación final y su nivel de riesgo.
     */
    @JsonProperty("final")
    private ClimateSurveyResultsNom035Final final_;

    /**
     * Cada categoría de la guía.
     */
    @JsonProperty("categories")
    private List<ClimateSurveyResultsNom035Category> categories;

    /**
     * Cada dominio de la guía.
     */
    @JsonProperty("domains")
    private List<ClimateSurveyResultsNom035Domain> domains;

    /**
     * Cada departamento con min_group respuestas o más.
     */
    @JsonProperty("departments")
    private List<ClimateSurveyResultsNom035Department> departments;

    /**
     * Departamentos con menos de min_group respuestas, que no se muestran.
     */
    @JsonProperty("hidden_departments")
    private Long hiddenDepartments;

    /**
     * La calificación final y su nivel de riesgo.
     */
    public ClimateSurveyResultsNom035Final getFinal() {
        return final_;
    }

    public ClimateSurveyResultsNom035 setFinal(ClimateSurveyResultsNom035Final final_) {
        this.final_ = final_;
        return this;
    }

    /**
     * Cada categoría de la guía.
     */
    public List<ClimateSurveyResultsNom035Category> getCategories() {
        return categories;
    }

    public ClimateSurveyResultsNom035 setCategories(List<ClimateSurveyResultsNom035Category> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Cada dominio de la guía.
     */
    public List<ClimateSurveyResultsNom035Domain> getDomains() {
        return domains;
    }

    public ClimateSurveyResultsNom035 setDomains(List<ClimateSurveyResultsNom035Domain> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * Cada departamento con min_group respuestas o más.
     */
    public List<ClimateSurveyResultsNom035Department> getDepartments() {
        return departments;
    }

    public ClimateSurveyResultsNom035 setDepartments(List<ClimateSurveyResultsNom035Department> departments) {
        this.departments = departments;
        return this;
    }

    /**
     * Departamentos con menos de min_group respuestas, que no se muestran.
     */
    public Long getHiddenDepartments() {
        return hiddenDepartments;
    }

    public ClimateSurveyResultsNom035 setHiddenDepartments(Long hiddenDepartments) {
        this.hiddenDepartments = hiddenDepartments;
        return this;
    }

    @JsonIgnore
    public ClimateSurveyResultsNom035 setHiddenDepartments(long hiddenDepartments) {
        return setHiddenDepartments(Long.valueOf(hiddenDepartments));
    }
}
