// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PrepaidExpenseScheduleItem: PrepaidExpenseScheduleItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrepaidExpenseScheduleItem {
    /**
     * Un solo mes, del 1 al 12 (MesIni y MesFin iguales).
     */
    @JsonProperty("month")
    private Long month;

    /**
     * El último día del mes, AAAA-MM-DD.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * true si su fecha ya pasó.
     */
    @JsonProperty("posted")
    private Boolean posted;

    /**
     * Un solo mes, del 1 al 12 (MesIni y MesFin iguales).
     */
    public Long getMonth() {
        return month;
    }

    public PrepaidExpenseScheduleItem setMonth(Long month) {
        this.month = month;
        return this;
    }

    @JsonIgnore
    public PrepaidExpenseScheduleItem setMonth(long month) {
        return setMonth(Long.valueOf(month));
    }

    /**
     * El último día del mes, AAAA-MM-DD.
     */
    public String getDate() {
        return date;
    }

    public PrepaidExpenseScheduleItem setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PrepaidExpenseScheduleItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PrepaidExpenseScheduleItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * true si su fecha ya pasó.
     */
    public Boolean getPosted() {
        return posted;
    }

    public PrepaidExpenseScheduleItem setPosted(Boolean posted) {
        this.posted = posted;
        return this;
    }
}
