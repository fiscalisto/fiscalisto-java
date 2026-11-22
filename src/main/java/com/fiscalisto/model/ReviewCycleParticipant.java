// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ReviewCycleParticipant: ReviewCycleParticipant.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewCycleParticipant {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Puesto (Puesto).
     */
    @JsonProperty("position")
    private String position;

    /**
     * Departamento (Departamento).
     */
    @JsonProperty("department")
    private String department;

    /**
     * Su jefe en el organigrama (emp_…), quien la evalúa como jefe.
     */
    @JsonProperty("manager")
    private String manager;

    /**
     * Los compañeros elegidos para evaluarla (emp_…).
     */
    @JsonProperty("peers")
    private List<String> peers;

    /**
     * Quién la evalúa, desde que se abre el ciclo.
     */
    @JsonProperty("raters")
    private List<ReviewCycleParticipantRater> raters;

    /**
     * Sus objetivos.
     */
    @JsonProperty("objectives")
    private List<ReviewObjective> objectives;

    /**
     * Su calificación de competencias.
     */
    @JsonProperty("competencies_score")
    private BigDecimal competenciesScore;

    /**
     * Su calificación de objetivos.
     */
    @JsonProperty("objectives_score")
    private BigDecimal objectivesScore;

    /**
     * El resultado calculado: vivo con el ciclo abierto, guardado al cerrar.
     */
    @JsonProperty("final")
    private BigDecimal final_;

    /**
     * La calificación calibrada.
     */
    @JsonProperty("calibrated")
    private BigDecimal calibrated;

    /**
     * Por qué cambió.
     */
    @JsonProperty("calibration_note")
    private String calibrationNote;

    /**
     * 1 bajo, 2 medio, 3 alto, para la matriz de 9 cuadros.
     */
    @JsonProperty("potential")
    private Long potential;

    /**
     * El que cuenta: calibrated, o si no, final.
     */
    @JsonProperty("result")
    private BigDecimal result;

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public ReviewCycleParticipant setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ReviewCycleParticipant setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Puesto (Puesto).
     */
    public String getPosition() {
        return position;
    }

    public ReviewCycleParticipant setPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public ReviewCycleParticipant setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Su jefe en el organigrama (emp_…), quien la evalúa como jefe.
     */
    public String getManager() {
        return manager;
    }

    public ReviewCycleParticipant setManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Los compañeros elegidos para evaluarla (emp_…).
     */
    public List<String> getPeers() {
        return peers;
    }

    public ReviewCycleParticipant setPeers(List<String> peers) {
        this.peers = peers;
        return this;
    }

    /**
     * Quién la evalúa, desde que se abre el ciclo.
     */
    public List<ReviewCycleParticipantRater> getRaters() {
        return raters;
    }

    public ReviewCycleParticipant setRaters(List<ReviewCycleParticipantRater> raters) {
        this.raters = raters;
        return this;
    }

    /**
     * Sus objetivos.
     */
    public List<ReviewObjective> getObjectives() {
        return objectives;
    }

    public ReviewCycleParticipant setObjectives(List<ReviewObjective> objectives) {
        this.objectives = objectives;
        return this;
    }

    /**
     * Su calificación de competencias.
     */
    public BigDecimal getCompetenciesScore() {
        return competenciesScore;
    }

    public ReviewCycleParticipant setCompetenciesScore(BigDecimal competenciesScore) {
        this.competenciesScore = competenciesScore;
        return this;
    }

    @JsonIgnore
    public ReviewCycleParticipant setCompetenciesScore(double competenciesScore) {
        return setCompetenciesScore(BigDecimal.valueOf(competenciesScore));
    }

    /**
     * Su calificación de objetivos.
     */
    public BigDecimal getObjectivesScore() {
        return objectivesScore;
    }

    public ReviewCycleParticipant setObjectivesScore(BigDecimal objectivesScore) {
        this.objectivesScore = objectivesScore;
        return this;
    }

    @JsonIgnore
    public ReviewCycleParticipant setObjectivesScore(double objectivesScore) {
        return setObjectivesScore(BigDecimal.valueOf(objectivesScore));
    }

    /**
     * El resultado calculado: vivo con el ciclo abierto, guardado al cerrar.
     */
    public BigDecimal getFinal() {
        return final_;
    }

    public ReviewCycleParticipant setFinal(BigDecimal final_) {
        this.final_ = final_;
        return this;
    }

    @JsonIgnore
    public ReviewCycleParticipant setFinal(double final_) {
        return setFinal(BigDecimal.valueOf(final_));
    }

    /**
     * La calificación calibrada.
     */
    public BigDecimal getCalibrated() {
        return calibrated;
    }

    public ReviewCycleParticipant setCalibrated(BigDecimal calibrated) {
        this.calibrated = calibrated;
        return this;
    }

    @JsonIgnore
    public ReviewCycleParticipant setCalibrated(double calibrated) {
        return setCalibrated(BigDecimal.valueOf(calibrated));
    }

    /**
     * Por qué cambió.
     */
    public String getCalibrationNote() {
        return calibrationNote;
    }

    public ReviewCycleParticipant setCalibrationNote(String calibrationNote) {
        this.calibrationNote = calibrationNote;
        return this;
    }

    /**
     * 1 bajo, 2 medio, 3 alto, para la matriz de 9 cuadros.
     */
    public Long getPotential() {
        return potential;
    }

    public ReviewCycleParticipant setPotential(Long potential) {
        this.potential = potential;
        return this;
    }

    @JsonIgnore
    public ReviewCycleParticipant setPotential(long potential) {
        return setPotential(Long.valueOf(potential));
    }

    /**
     * El que cuenta: calibrated, o si no, final.
     */
    public BigDecimal getResult() {
        return result;
    }

    public ReviewCycleParticipant setResult(BigDecimal result) {
        this.result = result;
        return this;
    }

    @JsonIgnore
    public ReviewCycleParticipant setResult(double result) {
        return setResult(BigDecimal.valueOf(result));
    }
}
