// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * HiringVacancy: HiringVacancy.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HiringVacancy {
    /**
     * La vacante (vac_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * El puesto.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Departamento (Departamento).
     */
    @JsonProperty("department")
    private String department;

    /**
     * Estado del objeto.
     * <p>
     * Valores: pending_approval, approved, rejected, filled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Si está en la página de empleos.
     */
    @JsonProperty("published")
    private Boolean published;

    /**
     * Su página, si está publicada.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Lo que pide.
     */
    @JsonProperty("requirements")
    private List<String> requirements;

    /**
     * El tipo de contrato.
     * <p>
     * Valores: full_time, part_time, fixed_term, project, internship.
     */
    @JsonProperty("employment_type")
    private String employmentType;

    /**
     * Dónde se trabaja.
     * <p>
     * Valores: on_site, hybrid, remote.
     */
    @JsonProperty("workplace")
    private String workplace;

    /**
     * Si la página muestra el sueldo.
     */
    @JsonProperty("show_salary")
    private Boolean showSalary;

    /**
     * Hasta cuándo recibe solicitudes (YYYY-MM-DD).
     */
    @JsonProperty("closes_on")
    private String closesOn;

    /**
     * Forma farmacéutica (FormaFarmaceutica), c_FormaFarmaceutica.
     */
    @JsonProperty("form")
    private String form;

    /**
     * Cuántos candidatos hay en cada etapa.
     */
    @JsonProperty("candidates")
    private List<HiringVacancyCandidate> candidates;

    /**
     * La vacante (vac_…).
     */
    public String getId() {
        return id;
    }

    public HiringVacancy setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * El puesto.
     */
    public String getTitle() {
        return title;
    }

    public HiringVacancy setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public HiringVacancy setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Estado del objeto.
     * <p>
     * Valores: pending_approval, approved, rejected, filled.
     */
    public String getStatus() {
        return status;
    }

    public HiringVacancy setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Si está en la página de empleos.
     */
    public Boolean getPublished() {
        return published;
    }

    public HiringVacancy setPublished(Boolean published) {
        this.published = published;
        return this;
    }

    /**
     * Su página, si está publicada.
     */
    public String getUrl() {
        return url;
    }

    public HiringVacancy setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public HiringVacancy setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lo que pide.
     */
    public List<String> getRequirements() {
        return requirements;
    }

    public HiringVacancy setRequirements(List<String> requirements) {
        this.requirements = requirements;
        return this;
    }

    /**
     * El tipo de contrato.
     * <p>
     * Valores: full_time, part_time, fixed_term, project, internship.
     */
    public String getEmploymentType() {
        return employmentType;
    }

    public HiringVacancy setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
        return this;
    }

    /**
     * Dónde se trabaja.
     * <p>
     * Valores: on_site, hybrid, remote.
     */
    public String getWorkplace() {
        return workplace;
    }

    public HiringVacancy setWorkplace(String workplace) {
        this.workplace = workplace;
        return this;
    }

    /**
     * Si la página muestra el sueldo.
     */
    public Boolean getShowSalary() {
        return showSalary;
    }

    public HiringVacancy setShowSalary(Boolean showSalary) {
        this.showSalary = showSalary;
        return this;
    }

    /**
     * Hasta cuándo recibe solicitudes (YYYY-MM-DD).
     */
    public String getClosesOn() {
        return closesOn;
    }

    public HiringVacancy setClosesOn(String closesOn) {
        this.closesOn = closesOn;
        return this;
    }

    /**
     * Forma farmacéutica (FormaFarmaceutica), c_FormaFarmaceutica.
     */
    public String getForm() {
        return form;
    }

    public HiringVacancy setForm(String form) {
        this.form = form;
        return this;
    }

    /**
     * Cuántos candidatos hay en cada etapa.
     */
    public List<HiringVacancyCandidate> getCandidates() {
        return candidates;
    }

    public HiringVacancy setCandidates(List<HiringVacancyCandidate> candidates) {
        this.candidates = candidates;
        return this;
    }
}
