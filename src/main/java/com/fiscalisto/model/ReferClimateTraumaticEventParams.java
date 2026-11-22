// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReferClimateTraumaticEventParams: los campos de «Anotar a dónde se canalizó a un trabajador».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReferClimateTraumaticEventParams {
    /**
     * Quien vivió el acontecimiento (emp_…), de GET /v1/climate_surveys/{id}/traumatic_events.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * A dónde se le canalizó: el IMSS, un médico, un psicólogo.
     */
    @JsonProperty("referred_to")
    private String referredTo;

    /**
     * Cuándo.
     */
    @JsonProperty("referred_on")
    private String referredOn;

    /**
     * Una nota.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Quien vivió el acontecimiento (emp_…), de GET /v1/climate_surveys/{id}/traumatic_events.
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public ReferClimateTraumaticEventParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * A dónde se le canalizó: el IMSS, un médico, un psicólogo.
     */
    public String getReferredTo() {
        return referredTo;
    }

    public ReferClimateTraumaticEventParams setReferredTo(String referredTo) {
        this.referredTo = referredTo;
        return this;
    }

    /**
     * Cuándo.
     */
    public String getReferredOn() {
        return referredOn;
    }

    public ReferClimateTraumaticEventParams setReferredOn(String referredOn) {
        this.referredOn = referredOn;
        return this;
    }

    /**
     * Una nota.
     */
    public String getNote() {
        return note;
    }

    public ReferClimateTraumaticEventParams setNote(String note) {
        this.note = note;
        return this;
    }
}
