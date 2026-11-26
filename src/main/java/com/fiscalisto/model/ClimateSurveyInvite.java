// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

/**
 * ClimateSurveyInvite: ClimateSurveyInvite.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyInvite {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private StringOr<Employee> employee;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Si ya contestó (no qué).
     */
    @JsonProperty("answered")
    private Boolean answered;

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public ClimateSurveyInvite setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ClimateSurveyInvite setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public ClimateSurveyInvite setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ClimateSurveyInvite setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Si ya contestó (no qué).
     */
    public Boolean getAnswered() {
        return answered;
    }

    public ClimateSurveyInvite setAnswered(Boolean answered) {
        this.answered = answered;
        return this;
    }
}
