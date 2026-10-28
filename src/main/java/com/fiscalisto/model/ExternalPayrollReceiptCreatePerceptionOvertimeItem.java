// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptCreatePerceptionOvertimeItem: ExternalPayrollReceiptCreatePerceptionOvertimeItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptCreatePerceptionOvertimeItem {
    /**
     * Días con horas extra (Dias).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * c_TipoHoras: 01 dobles, 02 triples, 03 simples.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("hours_type")
    private String hoursType;

    /**
     * Horas extra (HorasExtra).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("hours")
    private BigDecimal hours;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount_paid")
    private BigDecimal amountPaid;

    /**
     * Días con horas extra (Dias).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getDays() {
        return days;
    }

    public ExternalPayrollReceiptCreatePerceptionOvertimeItem setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreatePerceptionOvertimeItem setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * c_TipoHoras: 01 dobles, 02 triples, 03 simples.
     * <p>
     * Obligatorio.
     */
    public String getHoursType() {
        return hoursType;
    }

    public ExternalPayrollReceiptCreatePerceptionOvertimeItem setHoursType(String hoursType) {
        this.hoursType = hoursType;
        return this;
    }

    /**
     * Horas extra (HorasExtra).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getHours() {
        return hours;
    }

    public ExternalPayrollReceiptCreatePerceptionOvertimeItem setHours(BigDecimal hours) {
        this.hours = hours;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreatePerceptionOvertimeItem setHours(double hours) {
        return setHours(BigDecimal.valueOf(hours));
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public ExternalPayrollReceiptCreatePerceptionOvertimeItem setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreatePerceptionOvertimeItem setAmountPaid(double amountPaid) {
        return setAmountPaid(BigDecimal.valueOf(amountPaid));
    }
}
