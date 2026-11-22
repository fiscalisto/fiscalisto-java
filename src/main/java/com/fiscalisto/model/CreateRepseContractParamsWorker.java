// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateRepseContractParamsWorker: CreateRepseContractParamsWorker.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRepseContractParamsWorker {
    /**
     * El empleado (emp_…) del mismo emisor.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Desde cuándo trabaja en el contrato (YYYY-MM-DD).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Hasta cuándo; null mientras siga.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * El empleado (emp_…) del mismo emisor.
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public CreateRepseContractParamsWorker setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Desde cuándo trabaja en el contrato (YYYY-MM-DD).
     * <p>
     * Obligatorio.
     */
    public String getStartDate() {
        return startDate;
    }

    public CreateRepseContractParamsWorker setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Hasta cuándo; null mientras siga.
     */
    public String getEndDate() {
        return endDate;
    }

    public CreateRepseContractParamsWorker setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
}
