// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * PublishPayrollVacancyParams: los campos de «Publicar una vacante».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublishPayrollVacancyParams {
    /**
     * true la pone en la página; false la quita.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("published")
    private Boolean published;

    /**
     * Qué hará la persona; los párrafos van separados por una línea en blanco.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Lo que pide, uno por renglón (escolaridad, experiencia…).
     */
    @JsonProperty("requirements")
    private List<String> requirements;

    /**
     * full_time, part_time, fixed_term (por tiempo determinado), project (por obra determinada) o internship (prácticas).
     * <p>
     * Valores: full_time, part_time, fixed_term, project, internship.
     */
    @JsonProperty("employment_type")
    private String employmentType;

    /**
     * Dónde se trabaja: on_site (presencial), hybrid (híbrido) o remote.
     * <p>
     * Valores: on_site, hybrid, remote.
     */
    @JsonProperty("workplace")
    private String workplace;

    /**
     * Si la página muestra el sueldo de la vacante (salary_min y salary_max).
     */
    @JsonProperty("show_salary")
    private Boolean showSalary;

    /**
     * Hasta cuándo recibe solicitudes (YYYY-MM-DD).
     */
    @JsonProperty("closes_on")
    private String closesOn;

    /**
     * El formulario que llenan (jbf_…); null el predeterminado.
     */
    @JsonProperty("form")
    private String form;

    /**
     * true la pone en la página; false la quita.
     * <p>
     * Obligatorio.
     */
    public Boolean getPublished() {
        return published;
    }

    public PublishPayrollVacancyParams setPublished(Boolean published) {
        this.published = published;
        return this;
    }

    /**
     * Qué hará la persona; los párrafos van separados por una línea en blanco.
     */
    public String getDescription() {
        return description;
    }

    public PublishPayrollVacancyParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lo que pide, uno por renglón (escolaridad, experiencia…).
     */
    public List<String> getRequirements() {
        return requirements;
    }

    public PublishPayrollVacancyParams setRequirements(List<String> requirements) {
        this.requirements = requirements;
        return this;
    }

    /**
     * full_time, part_time, fixed_term (por tiempo determinado), project (por obra determinada) o internship (prácticas).
     * <p>
     * Valores: full_time, part_time, fixed_term, project, internship.
     */
    public String getEmploymentType() {
        return employmentType;
    }

    public PublishPayrollVacancyParams setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
        return this;
    }

    /**
     * Dónde se trabaja: on_site (presencial), hybrid (híbrido) o remote.
     * <p>
     * Valores: on_site, hybrid, remote.
     */
    public String getWorkplace() {
        return workplace;
    }

    public PublishPayrollVacancyParams setWorkplace(String workplace) {
        this.workplace = workplace;
        return this;
    }

    /**
     * Si la página muestra el sueldo de la vacante (salary_min y salary_max).
     */
    public Boolean getShowSalary() {
        return showSalary;
    }

    public PublishPayrollVacancyParams setShowSalary(Boolean showSalary) {
        this.showSalary = showSalary;
        return this;
    }

    /**
     * Hasta cuándo recibe solicitudes (YYYY-MM-DD).
     */
    public String getClosesOn() {
        return closesOn;
    }

    public PublishPayrollVacancyParams setClosesOn(String closesOn) {
        this.closesOn = closesOn;
        return this;
    }

    /**
     * El formulario que llenan (jbf_…); null el predeterminado.
     */
    public String getForm() {
        return form;
    }

    public PublishPayrollVacancyParams setForm(String form) {
        this.form = form;
        return this;
    }
}
