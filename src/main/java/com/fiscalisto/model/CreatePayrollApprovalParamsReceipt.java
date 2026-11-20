// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreatePayrollApprovalParamsReceipt: CreatePayrollApprovalParamsReceipt.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollApprovalParamsReceipt {
    /**
     * El empleado (emp_…) del emisor.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Días pagados; sin él, todos los días que le tocan del periodo menos absences y disability_days.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Faltas del periodo (días sin goce de sueldo), de 0 a 31.
     */
    @JsonProperty("absences")
    private Long absences;

    /**
     * Días de incapacidad que expidió el IMSS en el periodo, de 0 a 31.
     */
    @JsonProperty("disability_days")
    private Long disabilityDays;

    /**
     * Incidencias del periodo, como en Nómina › Emitir recibos: horas extra, domingos, descansos y festivos trabajados, vacaciones, premios y comisiones. Fiscalisto calcula sus importes, su parte exenta y el ISR con el sueldo.
     */
    @JsonProperty("incidents")
    private CreatePayrollApprovalParamsReceiptIncidents incidents;

    /**
     * El empleado (emp_…) del emisor.
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public CreatePayrollApprovalParamsReceipt setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Días pagados; sin él, todos los días que le tocan del periodo menos absences y disability_days.
     */
    public BigDecimal getDays() {
        return days;
    }

    public CreatePayrollApprovalParamsReceipt setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceipt setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Faltas del periodo (días sin goce de sueldo), de 0 a 31.
     */
    public Long getAbsences() {
        return absences;
    }

    public CreatePayrollApprovalParamsReceipt setAbsences(Long absences) {
        this.absences = absences;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceipt setAbsences(long absences) {
        return setAbsences(Long.valueOf(absences));
    }

    /**
     * Días de incapacidad que expidió el IMSS en el periodo, de 0 a 31.
     */
    public Long getDisabilityDays() {
        return disabilityDays;
    }

    public CreatePayrollApprovalParamsReceipt setDisabilityDays(Long disabilityDays) {
        this.disabilityDays = disabilityDays;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceipt setDisabilityDays(long disabilityDays) {
        return setDisabilityDays(Long.valueOf(disabilityDays));
    }

    /**
     * Incidencias del periodo, como en Nómina › Emitir recibos: horas extra, domingos, descansos y festivos trabajados, vacaciones, premios y comisiones. Fiscalisto calcula sus importes, su parte exenta y el ISR con el sueldo.
     */
    public CreatePayrollApprovalParamsReceiptIncidents getIncidents() {
        return incidents;
    }

    public CreatePayrollApprovalParamsReceipt setIncidents(CreatePayrollApprovalParamsReceiptIncidents incidents) {
        this.incidents = incidents;
        return this;
    }
}
