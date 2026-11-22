// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RepseContractWorker: RepseContractWorker.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseContractWorker {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Desde cuándo trabaja en el contrato (YYYY-MM-DD).
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Hasta cuándo, o null mientras siga.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public RepseContractWorker setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public RepseContractWorker setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Desde cuándo trabaja en el contrato (YYYY-MM-DD).
     */
    public String getStartDate() {
        return startDate;
    }

    public RepseContractWorker setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Hasta cuándo, o null mientras siga.
     */
    public String getEndDate() {
        return endDate;
    }

    public RepseContractWorker setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
}
