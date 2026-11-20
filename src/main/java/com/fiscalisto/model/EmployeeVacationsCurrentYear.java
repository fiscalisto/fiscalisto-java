// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * EmployeeVacationsCurrentYear: El año de servicio en curso.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeVacationsCurrentYear {
    /**
     * Su número: 1 el primer año de servicio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Su aniversario.
     */
    @JsonProperty("completes_on")
    private String completesOn;

    /**
     * Los días que le tocan al cumplirlo.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Los que ya tomó por adelantado.
     */
    @JsonProperty("taken_in_advance")
    private BigDecimal takenInAdvance;

    /**
     * Su parte proporcional al día del saldo, menos lo adelantado.
     */
    @JsonProperty("accrued_days")
    private BigDecimal accruedDays;

    /**
     * Su número: 1 el primer año de servicio.
     */
    public Long getYear() {
        return year;
    }

    public EmployeeVacationsCurrentYear setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsCurrentYear setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Su aniversario.
     */
    public String getCompletesOn() {
        return completesOn;
    }

    public EmployeeVacationsCurrentYear setCompletesOn(String completesOn) {
        this.completesOn = completesOn;
        return this;
    }

    /**
     * Los días que le tocan al cumplirlo.
     */
    public BigDecimal getDays() {
        return days;
    }

    public EmployeeVacationsCurrentYear setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsCurrentYear setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Los que ya tomó por adelantado.
     */
    public BigDecimal getTakenInAdvance() {
        return takenInAdvance;
    }

    public EmployeeVacationsCurrentYear setTakenInAdvance(BigDecimal takenInAdvance) {
        this.takenInAdvance = takenInAdvance;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsCurrentYear setTakenInAdvance(double takenInAdvance) {
        return setTakenInAdvance(BigDecimal.valueOf(takenInAdvance));
    }

    /**
     * Su parte proporcional al día del saldo, menos lo adelantado.
     */
    public BigDecimal getAccruedDays() {
        return accruedDays;
    }

    public EmployeeVacationsCurrentYear setAccruedDays(BigDecimal accruedDays) {
        this.accruedDays = accruedDays;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsCurrentYear setAccruedDays(double accruedDays) {
        return setAccruedDays(BigDecimal.valueOf(accruedDays));
    }
}
