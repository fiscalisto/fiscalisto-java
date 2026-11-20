// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPayrollCalendarParams: los campos de «Calendario de nómina».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPayrollCalendarParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Hasta cuántos días adelante (por omisión 90, hasta 366).
     */
    @JsonProperty("days_ahead")
    private Long daysAhead;

    /**
     * Desde cuántos días atrás (por omisión 31, hasta 366).
     */
    @JsonProperty("days_back")
    private Long daysBack;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetPayrollCalendarParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Hasta cuántos días adelante (por omisión 90, hasta 366).
     */
    public Long getDaysAhead() {
        return daysAhead;
    }

    public GetPayrollCalendarParams setDaysAhead(Long daysAhead) {
        this.daysAhead = daysAhead;
        return this;
    }

    @JsonIgnore
    public GetPayrollCalendarParams setDaysAhead(long daysAhead) {
        return setDaysAhead(Long.valueOf(daysAhead));
    }

    /**
     * Desde cuántos días atrás (por omisión 31, hasta 366).
     */
    public Long getDaysBack() {
        return daysBack;
    }

    public GetPayrollCalendarParams setDaysBack(Long daysBack) {
        this.daysBack = daysBack;
        return this;
    }

    @JsonIgnore
    public GetPayrollCalendarParams setDaysBack(long daysBack) {
        return setDaysBack(Long.valueOf(daysBack));
    }
}
