// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PreviewExternalPayrollReceiptParamsReferences: Sus ids: el empleado y la corrida de nómina. payroll_run_id es obligatorio en un recibo extraordinario.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreviewExternalPayrollReceiptParamsReferences {
    /**
     * El id del empleado en su sistema.
     */
    @JsonProperty("employee_id")
    private String employeeId;

    /**
     * El id de la corrida de nómina en su sistema.
     */
    @JsonProperty("payroll_run_id")
    private String payrollRunId;

    /**
     * El id del empleado en su sistema.
     */
    public String getEmployeeId() {
        return employeeId;
    }

    public PreviewExternalPayrollReceiptParamsReferences setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    /**
     * El id de la corrida de nómina en su sistema.
     */
    public String getPayrollRunId() {
        return payrollRunId;
    }

    public PreviewExternalPayrollReceiptParamsReferences setPayrollRunId(String payrollRunId) {
        this.payrollRunId = payrollRunId;
        return this;
    }
}
