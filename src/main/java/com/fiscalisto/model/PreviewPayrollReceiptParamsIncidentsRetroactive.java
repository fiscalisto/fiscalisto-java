// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PreviewPayrollReceiptParamsIncidentsRetroactive: Retroactivo de un aumento: la diferencia de salario de los días ya pagados con el anterior, como percepción 001 (clave RET) gravada, que paga ISR con el sueldo del periodo (art. 96 de la LISR). Las cuotas IMSS de la diferencia las cubre la modificación de salario con su fecha en el SUA; el recibo no retiene la parte del trabajador (art. 38 de la LSS).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreviewPayrollReceiptParamsIncidentsRetroactive {
    /**
     * Día desde el que rige el aumento (YYYY-MM-DD), antes del periodo y hasta un año antes.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Salario diario que tenía el empleado antes del aumento. El de ahora es el del empleado: cámbielo antes con PATCH /v1/employees/{id}.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("previous_salary")
    private BigDecimal previousSalary;

    /**
     * Días que se pagaron con el salario anterior desde from. Si no lo manda, los de los periodos ya pagados desde ese día.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Día desde el que rige el aumento (YYYY-MM-DD), antes del periodo y hasta un año antes.
     * <p>
     * Obligatorio.
     */
    public String getFrom() {
        return from;
    }

    public PreviewPayrollReceiptParamsIncidentsRetroactive setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Salario diario que tenía el empleado antes del aumento. El de ahora es el del empleado: cámbielo antes con PATCH /v1/employees/{id}.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getPreviousSalary() {
        return previousSalary;
    }

    public PreviewPayrollReceiptParamsIncidentsRetroactive setPreviousSalary(BigDecimal previousSalary) {
        this.previousSalary = previousSalary;
        return this;
    }

    @JsonIgnore
    public PreviewPayrollReceiptParamsIncidentsRetroactive setPreviousSalary(double previousSalary) {
        return setPreviousSalary(BigDecimal.valueOf(previousSalary));
    }

    /**
     * Días que se pagaron con el salario anterior desde from. Si no lo manda, los de los periodos ya pagados desde ese día.
     */
    public BigDecimal getDays() {
        return days;
    }

    public PreviewPayrollReceiptParamsIncidentsRetroactive setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public PreviewPayrollReceiptParamsIncidentsRetroactive setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }
}
