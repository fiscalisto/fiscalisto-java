// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * EmployeeTraining: La capacitación de un empleado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeTraining {
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
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su ocupación: la suya o la de su puesto.
     */
    @JsonProperty("occupation")
    private String occupation;

    /**
     * La suya, cuando no es la de su puesto.
     */
    @JsonProperty("own_occupation")
    private String ownOccupation;

    /**
     * Su grado de estudios terminados.
     */
    @JsonProperty("education")
    private String education;

    /**
     * Los cursos que tomó, del más reciente al más antiguo.
     */
    @JsonProperty("courses")
    private List<EmployeeTrainingCourse> courses;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EmployeeTraining setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public EmployeeTraining setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public EmployeeTraining setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public EmployeeTraining setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su ocupación: la suya o la de su puesto.
     */
    public String getOccupation() {
        return occupation;
    }

    public EmployeeTraining setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    /**
     * La suya, cuando no es la de su puesto.
     */
    public String getOwnOccupation() {
        return ownOccupation;
    }

    public EmployeeTraining setOwnOccupation(String ownOccupation) {
        this.ownOccupation = ownOccupation;
        return this;
    }

    /**
     * Su grado de estudios terminados.
     */
    public String getEducation() {
        return education;
    }

    public EmployeeTraining setEducation(String education) {
        this.education = education;
        return this;
    }

    /**
     * Los cursos que tomó, del más reciente al más antiguo.
     */
    public List<EmployeeTrainingCourse> getCourses() {
        return courses;
    }

    public EmployeeTraining setCourses(List<EmployeeTrainingCourse> courses) {
        this.courses = courses;
        return this;
    }
}
