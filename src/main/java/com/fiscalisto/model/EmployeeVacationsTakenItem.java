// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * EmployeeVacationsTakenItem: EmployeeVacationsTakenItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeVacationsTakenItem {
    /**
     * El fin del periodo del recibo.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Los días de vacaciones que pagó.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * El fin del periodo del recibo.
     */
    public String getDate() {
        return date;
    }

    public EmployeeVacationsTakenItem setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Los días de vacaciones que pagó.
     */
    public BigDecimal getDays() {
        return days;
    }

    public EmployeeVacationsTakenItem setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsTakenItem setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }
}
