// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListEmployeeDeductionsParams: los campos de «Listar descuentos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListEmployeeDeductionsParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo los de este empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListEmployeeDeductionsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo los de este empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public ListEmployeeDeductionsParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }
}
