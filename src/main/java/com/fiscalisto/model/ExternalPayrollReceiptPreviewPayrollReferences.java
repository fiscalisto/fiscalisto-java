// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExternalPayrollReceiptPreviewPayrollReferences: ExternalPayrollReceiptPreviewPayrollReferences.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayrollReferences {
    /**
     * employee_id.
     */
    @JsonProperty("employee_id")
    private String employeeId;

    /**
     * payroll_run_id.
     */
    @JsonProperty("payroll_run_id")
    private String payrollRunId;

    /**
     * employee_id.
     */
    public String getEmployeeId() {
        return employeeId;
    }

    public ExternalPayrollReceiptPreviewPayrollReferences setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    /**
     * payroll_run_id.
     */
    public String getPayrollRunId() {
        return payrollRunId;
    }

    public ExternalPayrollReceiptPreviewPayrollReferences setPayrollRunId(String payrollRunId) {
        this.payrollRunId = payrollRunId;
        return this;
    }
}
