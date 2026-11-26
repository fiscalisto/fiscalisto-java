// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListVacationRequestsParams: los campos de «Listar solicitudes de vacaciones».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListVacationRequestsParams {
    /**
     * Solo las de este empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * pending, approved, rejected o canceled.
     * <p>
     * Valores: pending, approved, rejected, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuántas, de 1 a 500. Por omisión 100.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id (vrq_…) de la última de la página anterior, para la siguiente.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gte]")
    private String createdGte;

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gt]")
    private String createdGt;

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lte]")
    private String createdLte;

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lt]")
    private String createdLt;

    /**
     * Solo las de este empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public ListVacationRequestsParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * pending, approved, rejected o canceled.
     * <p>
     * Valores: pending, approved, rejected, canceled.
     */
    public String getStatus() {
        return status;
    }

    public ListVacationRequestsParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuántas, de 1 a 500. Por omisión 100.
     */
    public Long getLimit() {
        return limit;
    }

    public ListVacationRequestsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListVacationRequestsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id (vrq_…) de la última de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListVacationRequestsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListVacationRequestsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListVacationRequestsParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListVacationRequestsParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListVacationRequestsParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListVacationRequestsParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }
}
