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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListVacationRequestsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
