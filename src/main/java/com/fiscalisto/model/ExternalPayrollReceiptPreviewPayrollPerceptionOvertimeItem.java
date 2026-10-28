// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem: ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem {
    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * c_TipoHoras: 01 dobles, 02 triples, 03 simples.
     */
    @JsonProperty("hours_type")
    private String hoursType;

    /**
     * hours.
     */
    @JsonProperty("hours")
    private Long hours;

    /**
     * amount_paid.
     */
    @JsonProperty("amount_paid")
    private BigDecimal amountPaid;

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    public Long getDays() {
        return days;
    }

    public ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem setDays(long days) {
        return setDays(Long.valueOf(days));
    }

    /**
     * c_TipoHoras: 01 dobles, 02 triples, 03 simples.
     */
    public String getHoursType() {
        return hoursType;
    }

    public ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem setHoursType(String hoursType) {
        this.hoursType = hoursType;
        return this;
    }

    /**
     * hours.
     */
    public Long getHours() {
        return hours;
    }

    public ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem setHours(Long hours) {
        this.hours = hours;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem setHours(long hours) {
        return setHours(Long.valueOf(hours));
    }

    /**
     * amount_paid.
     */
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollPerceptionOvertimeItem setAmountPaid(double amountPaid) {
        return setAmountPaid(BigDecimal.valueOf(amountPaid));
    }
}
