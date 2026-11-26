// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

/**
 * ReviewCycleParticipantRater: ReviewCycleParticipantRater.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewCycleParticipantRater {
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
     * self (autoevaluación), manager (su jefe), peer (compañeros) o report (personas a su cargo).
     */
    @JsonProperty("relation")
    private String relation;

    /**
     * Si ya la envió (no qué contestó).
     */
    @JsonProperty("done")
    private Boolean done;

    /**
     * Si tiene portal; sin él no puede contestar.
     */
    @JsonProperty("portal")
    private Boolean portal;

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public ReviewCycleParticipantRater setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ReviewCycleParticipantRater setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public ReviewCycleParticipantRater setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ReviewCycleParticipantRater setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * self (autoevaluación), manager (su jefe), peer (compañeros) o report (personas a su cargo).
     */
    public String getRelation() {
        return relation;
    }

    public ReviewCycleParticipantRater setRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * Si ya la envió (no qué contestó).
     */
    public Boolean getDone() {
        return done;
    }

    public ReviewCycleParticipantRater setDone(Boolean done) {
        this.done = done;
        return this;
    }

    /**
     * Si tiene portal; sin él no puede contestar.
     */
    public Boolean getPortal() {
        return portal;
    }

    public ReviewCycleParticipantRater setPortal(Boolean portal) {
        this.portal = portal;
        return this;
    }
}
