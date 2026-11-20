// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollApprovalReceipt: PayrollApprovalReceipt.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollApprovalReceipt {
    /**
     * emp_…
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Días pagados.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Faltas.
     */
    @JsonProperty("absences")
    private BigDecimal absences;

    /**
     * Días de incapacidad.
     */
    @JsonProperty("disability_days")
    private BigDecimal disabilityDays;

    /**
     * Los importes aprobados: se timbra solo un recibo que los tenga.
     */
    @JsonProperty("totals")
    private PayrollApprovalReceiptTotals totals;

    /**
     * emp_…
     */
    public String getEmployee() {
        return employee;
    }

    public PayrollApprovalReceipt setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollApprovalReceipt setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Días pagados.
     */
    public BigDecimal getDays() {
        return days;
    }

    public PayrollApprovalReceipt setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalReceipt setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Faltas.
     */
    public BigDecimal getAbsences() {
        return absences;
    }

    public PayrollApprovalReceipt setAbsences(BigDecimal absences) {
        this.absences = absences;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalReceipt setAbsences(double absences) {
        return setAbsences(BigDecimal.valueOf(absences));
    }

    /**
     * Días de incapacidad.
     */
    public BigDecimal getDisabilityDays() {
        return disabilityDays;
    }

    public PayrollApprovalReceipt setDisabilityDays(BigDecimal disabilityDays) {
        this.disabilityDays = disabilityDays;
        return this;
    }

    @JsonIgnore
    public PayrollApprovalReceipt setDisabilityDays(double disabilityDays) {
        return setDisabilityDays(BigDecimal.valueOf(disabilityDays));
    }

    /**
     * Los importes aprobados: se timbra solo un recibo que los tenga.
     */
    public PayrollApprovalReceiptTotals getTotals() {
        return totals;
    }

    public PayrollApprovalReceipt setTotals(PayrollApprovalReceiptTotals totals) {
        this.totals = totals;
        return this;
    }
}
