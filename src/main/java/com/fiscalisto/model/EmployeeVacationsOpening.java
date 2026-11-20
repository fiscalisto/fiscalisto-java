// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * EmployeeVacationsOpening: EmployeeVacationsOpening.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeVacationsOpening {
    /**
     * El día del saldo inicial.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Los de años cumplidos.
     */
    @JsonProperty("pending_days")
    private BigDecimal pendingDays;

    /**
     * Los tomados del año en curso.
     */
    @JsonProperty("taken_days")
    private BigDecimal takenDays;

    /**
     * El día del saldo inicial.
     */
    public String getDate() {
        return date;
    }

    public EmployeeVacationsOpening setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Los de años cumplidos.
     */
    public BigDecimal getPendingDays() {
        return pendingDays;
    }

    public EmployeeVacationsOpening setPendingDays(BigDecimal pendingDays) {
        this.pendingDays = pendingDays;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsOpening setPendingDays(double pendingDays) {
        return setPendingDays(BigDecimal.valueOf(pendingDays));
    }

    /**
     * Los tomados del año en curso.
     */
    public BigDecimal getTakenDays() {
        return takenDays;
    }

    public EmployeeVacationsOpening setTakenDays(BigDecimal takenDays) {
        this.takenDays = takenDays;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsOpening setTakenDays(double takenDays) {
        return setTakenDays(BigDecimal.valueOf(takenDays));
    }
}
