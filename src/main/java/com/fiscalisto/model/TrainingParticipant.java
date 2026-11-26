// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;

/**
 * TrainingParticipant: Quien tomó un curso y su constancia DC-3.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingParticipant {
    /**
     * Quien tomó el curso (trp_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

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
     * Su clave del Catálogo Nacional de Ocupaciones.
     */
    @JsonProperty("occupation")
    private String occupation;

    /**
     * pending, passed, failed o sufficiency.
     */
    @JsonProperty("result")
    private String result;

    /**
     * Su calificación de 0 a 100.
     */
    @JsonProperty("score")
    private BigDecimal score;

    /**
     * Una nota sobre su resultado.
     */
    @JsonProperty("note")
    private String note;

    /**
     * El folio de su constancia DC-3, consecutivo por emisor.
     */
    @JsonProperty("folio")
    private Long folio;

    /**
     * Cuándo se emitió.
     */
    @JsonProperty("issued_at")
    private String issuedAt;

    /**
     * Cuándo se entregó.
     */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /**
     * paper, email o portal.
     */
    @JsonProperty("delivered_via")
    private String deliveredVia;

    /**
     * none (sin constancia), waiting (el curso no termina), due (por entregar), late (pasó el plazo), issued (emitida, sin entregar) o delivered.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El día límite para entregarla (20 días hábiles desde el fin del curso).
     */
    @JsonProperty("deliver_by")
    private String deliverBy;

    /**
     * Hasta cuándo está vigente, si el curso tiene vigencia.
     */
    @JsonProperty("expires_on")
    private String expiresOn;

    /**
     * Por qué todavía no se puede emitir su constancia.
     */
    @JsonProperty("blocker")
    private String blocker;

    /**
     * Quien tomó el curso (trp_…).
     */
    public String getId() {
        return id;
    }

    public TrainingParticipant setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TrainingParticipant setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public TrainingParticipant setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public TrainingParticipant setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public TrainingParticipant setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public TrainingParticipant setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su clave del Catálogo Nacional de Ocupaciones.
     */
    public String getOccupation() {
        return occupation;
    }

    public TrainingParticipant setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    /**
     * pending, passed, failed o sufficiency.
     */
    public String getResult() {
        return result;
    }

    public TrainingParticipant setResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Su calificación de 0 a 100.
     */
    public BigDecimal getScore() {
        return score;
    }

    public TrainingParticipant setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    @JsonIgnore
    public TrainingParticipant setScore(double score) {
        return setScore(BigDecimal.valueOf(score));
    }

    /**
     * Una nota sobre su resultado.
     */
    public String getNote() {
        return note;
    }

    public TrainingParticipant setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * El folio de su constancia DC-3, consecutivo por emisor.
     */
    public Long getFolio() {
        return folio;
    }

    public TrainingParticipant setFolio(Long folio) {
        this.folio = folio;
        return this;
    }

    @JsonIgnore
    public TrainingParticipant setFolio(long folio) {
        return setFolio(Long.valueOf(folio));
    }

    /**
     * Cuándo se emitió.
     */
    public String getIssuedAt() {
        return issuedAt;
    }

    public TrainingParticipant setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    /**
     * Cuándo se entregó.
     */
    public String getDeliveredAt() {
        return deliveredAt;
    }

    public TrainingParticipant setDeliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    /**
     * paper, email o portal.
     */
    public String getDeliveredVia() {
        return deliveredVia;
    }

    public TrainingParticipant setDeliveredVia(String deliveredVia) {
        this.deliveredVia = deliveredVia;
        return this;
    }

    /**
     * none (sin constancia), waiting (el curso no termina), due (por entregar), late (pasó el plazo), issued (emitida, sin entregar) o delivered.
     */
    public String getStatus() {
        return status;
    }

    public TrainingParticipant setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El día límite para entregarla (20 días hábiles desde el fin del curso).
     */
    public String getDeliverBy() {
        return deliverBy;
    }

    public TrainingParticipant setDeliverBy(String deliverBy) {
        this.deliverBy = deliverBy;
        return this;
    }

    /**
     * Hasta cuándo está vigente, si el curso tiene vigencia.
     */
    public String getExpiresOn() {
        return expiresOn;
    }

    public TrainingParticipant setExpiresOn(String expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Por qué todavía no se puede emitir su constancia.
     */
    public String getBlocker() {
        return blocker;
    }

    public TrainingParticipant setBlocker(String blocker) {
        this.blocker = blocker;
        return this;
    }
}
