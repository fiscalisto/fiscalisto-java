// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FillPayrollVacancyParams: los campos de «Cubrir una vacante».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FillPayrollVacancyParams {
    /**
     * Quien la ocupa (emp_…), ya dado de alta con POST /v1/employees: queda con el jefe, el departamento y la sucursal de la vacante.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Quien la ocupa (emp_…), ya dado de alta con POST /v1/employees: queda con el jefe, el departamento y la sucursal de la vacante.
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public FillPayrollVacancyParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }
}
