// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateExpenseReportParams: los campos de «Actualizar una comprobación».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateExpenseReportParams {
    /**
     * Su nombre. Por omisión, «Viaje a {destination}» o el periodo.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Para qué fue: el SAT pide que el viaje sea por el negocio.
     */
    @JsonProperty("purpose")
    private String purpose;

    /**
     * A dónde.
     */
    @JsonProperty("destination")
    private String destination;

    /**
     * Al extranjero: cambian los topes de alimentos y hospedaje.
     */
    @JsonProperty("abroad")
    private Boolean abroad;

    /**
     * A más de 50 km de donde trabaja la persona (por omisión, true). Más cerca, no son viáticos deducibles.
     */
    @JsonProperty("far")
    private Boolean far;

    /**
     * La salida (o el inicio del periodo).
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * El regreso (o el fin del periodo).
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Su nombre. Por omisión, «Viaje a {destination}» o el periodo.
     */
    public String getTitle() {
        return title;
    }

    public UpdateExpenseReportParams setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Para qué fue: el SAT pide que el viaje sea por el negocio.
     */
    public String getPurpose() {
        return purpose;
    }

    public UpdateExpenseReportParams setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * A dónde.
     */
    public String getDestination() {
        return destination;
    }

    public UpdateExpenseReportParams setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Al extranjero: cambian los topes de alimentos y hospedaje.
     */
    public Boolean getAbroad() {
        return abroad;
    }

    public UpdateExpenseReportParams setAbroad(Boolean abroad) {
        this.abroad = abroad;
        return this;
    }

    /**
     * A más de 50 km de donde trabaja la persona (por omisión, true). Más cerca, no son viáticos deducibles.
     */
    public Boolean getFar() {
        return far;
    }

    public UpdateExpenseReportParams setFar(Boolean far) {
        this.far = far;
        return this;
    }

    /**
     * La salida (o el inicio del periodo).
     */
    public String getStartDate() {
        return startDate;
    }

    public UpdateExpenseReportParams setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * El regreso (o el fin del periodo).
     */
    public String getEndDate() {
        return endDate;
    }

    public UpdateExpenseReportParams setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
}
