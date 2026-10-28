// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoicePayrollPerceptionOvertimeItem: InvoicePayrollPerceptionOvertimeItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollPerceptionOvertimeItem {
    /**
     * Días con horas extra (Dias).
     */
    @JsonProperty("days")
    private Long days;

    /**
     * c_TipoHoras: 01 dobles, 02 triples, 03 simples.
     */
    @JsonProperty("hours_type")
    private String hoursType;

    /**
     * Horas extra (HorasExtra).
     */
    @JsonProperty("hours")
    private Long hours;

    /**
     * Importe pagado (ImportePagado).
     */
    @JsonProperty("amount_paid")
    private BigDecimal amountPaid;

    /**
     * Días con horas extra (Dias).
     */
    public Long getDays() {
        return days;
    }

    public InvoicePayrollPerceptionOvertimeItem setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollPerceptionOvertimeItem setDays(long days) {
        return setDays(Long.valueOf(days));
    }

    /**
     * c_TipoHoras: 01 dobles, 02 triples, 03 simples.
     */
    public String getHoursType() {
        return hoursType;
    }

    public InvoicePayrollPerceptionOvertimeItem setHoursType(String hoursType) {
        this.hoursType = hoursType;
        return this;
    }

    /**
     * Horas extra (HorasExtra).
     */
    public Long getHours() {
        return hours;
    }

    public InvoicePayrollPerceptionOvertimeItem setHours(Long hours) {
        this.hours = hours;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollPerceptionOvertimeItem setHours(long hours) {
        return setHours(Long.valueOf(hours));
    }

    /**
     * Importe pagado (ImportePagado).
     */
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public InvoicePayrollPerceptionOvertimeItem setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollPerceptionOvertimeItem setAmountPaid(double amountPaid) {
        return setAmountPaid(BigDecimal.valueOf(amountPaid));
    }
}
