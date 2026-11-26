// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * ReviewResult: El resultado de una persona en un ciclo, por competencia y tipo de evaluador.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewResult {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El ciclo (rvc_…).
     */
    @JsonProperty("cycle")
    private String cycle;

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
     * El resultado: competencias y objetivos con el peso de los objetivos.
     */
    @JsonProperty("final")
    private BigDecimal final_;

    /**
     * El promedio de cada tipo de evaluador que cuenta, con su peso.
     */
    @JsonProperty("competencies_score")
    private BigDecimal competenciesScore;

    /**
     * Lo que calificó el jefe en cada objetivo, con su peso.
     */
    @JsonProperty("objectives_score")
    private BigDecimal objectivesScore;

    /**
     * Cada tipo de evaluador.
     */
    @JsonProperty("relations")
    private List<ReviewResultRelation> relations;

    /**
     * La calificación de cada competencia.
     */
    @JsonProperty("competencies")
    private List<ReviewResultCompetency> competencies;

    /**
     * Los comentarios.
     */
    @JsonProperty("comments")
    private List<ReviewResultComment> comments;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ReviewResult setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El ciclo (rvc_…).
     */
    public String getCycle() {
        return cycle;
    }

    public ReviewResult setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public ReviewResult setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ReviewResult setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public ReviewResult setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ReviewResult setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El resultado: competencias y objetivos con el peso de los objetivos.
     */
    public BigDecimal getFinal() {
        return final_;
    }

    public ReviewResult setFinal(BigDecimal final_) {
        this.final_ = final_;
        return this;
    }

    @JsonIgnore
    public ReviewResult setFinal(double final_) {
        return setFinal(BigDecimal.valueOf(final_));
    }

    /**
     * El promedio de cada tipo de evaluador que cuenta, con su peso.
     */
    public BigDecimal getCompetenciesScore() {
        return competenciesScore;
    }

    public ReviewResult setCompetenciesScore(BigDecimal competenciesScore) {
        this.competenciesScore = competenciesScore;
        return this;
    }

    @JsonIgnore
    public ReviewResult setCompetenciesScore(double competenciesScore) {
        return setCompetenciesScore(BigDecimal.valueOf(competenciesScore));
    }

    /**
     * Lo que calificó el jefe en cada objetivo, con su peso.
     */
    public BigDecimal getObjectivesScore() {
        return objectivesScore;
    }

    public ReviewResult setObjectivesScore(BigDecimal objectivesScore) {
        this.objectivesScore = objectivesScore;
        return this;
    }

    @JsonIgnore
    public ReviewResult setObjectivesScore(double objectivesScore) {
        return setObjectivesScore(BigDecimal.valueOf(objectivesScore));
    }

    /**
     * Cada tipo de evaluador.
     */
    public List<ReviewResultRelation> getRelations() {
        return relations;
    }

    public ReviewResult setRelations(List<ReviewResultRelation> relations) {
        this.relations = relations;
        return this;
    }

    /**
     * La calificación de cada competencia.
     */
    public List<ReviewResultCompetency> getCompetencies() {
        return competencies;
    }

    public ReviewResult setCompetencies(List<ReviewResultCompetency> competencies) {
        this.competencies = competencies;
        return this;
    }

    /**
     * Los comentarios.
     */
    public List<ReviewResultComment> getComments() {
        return comments;
    }

    public ReviewResult setComments(List<ReviewResultComment> comments) {
        this.comments = comments;
        return this;
    }
}
