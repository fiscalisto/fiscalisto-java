// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * RecurringInvoiceSchedule: Cada cuánto: frequency (monthly, weekly o daily), interval, day_of_month (con monthly; "last" es el último del mes), y la hora (hour, en time_zone) en que se timbra.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecurringInvoiceSchedule {
    /**
     * monthly: cada interval meses en day_of_month. weekly o daily: cada interval semanas o días.
     * <p>
     * Valores: monthly, weekly, daily.
     */
    @JsonProperty("frequency")
    private String frequency;

    /**
     * Cada cuántos meses, semanas o días.
     */
    @JsonProperty("interval")
    private Long interval;

    /**
     * Con monthly: el día del mes, del 1 al 28, o "last" (el último). null con weekly o daily.
     */
    @JsonProperty("day_of_month")
    private JsonNode dayOfMonth;

    /**
     * La hora (0 a 23) en que se timbra, en time_zone.
     */
    @JsonProperty("hour")
    private Long hour;

    /**
     * La zona de esa hora (America/Mexico_City, America/Cancun…).
     */
    @JsonProperty("time_zone")
    private String timeZone;

    /**
     * monthly: cada interval meses en day_of_month. weekly o daily: cada interval semanas o días.
     * <p>
     * Valores: monthly, weekly, daily.
     */
    public String getFrequency() {
        return frequency;
    }

    public RecurringInvoiceSchedule setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Cada cuántos meses, semanas o días.
     */
    public Long getInterval() {
        return interval;
    }

    public RecurringInvoiceSchedule setInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    @JsonIgnore
    public RecurringInvoiceSchedule setInterval(long interval) {
        return setInterval(Long.valueOf(interval));
    }

    /**
     * Con monthly: el día del mes, del 1 al 28, o "last" (el último). null con weekly o daily.
     */
    public JsonNode getDayOfMonth() {
        return dayOfMonth;
    }

    public RecurringInvoiceSchedule setDayOfMonth(JsonNode dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    /**
     * La hora (0 a 23) en que se timbra, en time_zone.
     */
    public Long getHour() {
        return hour;
    }

    public RecurringInvoiceSchedule setHour(Long hour) {
        this.hour = hour;
        return this;
    }

    @JsonIgnore
    public RecurringInvoiceSchedule setHour(long hour) {
        return setHour(Long.valueOf(hour));
    }

    /**
     * La zona de esa hora (America/Mexico_City, America/Cancun…).
     */
    public String getTimeZone() {
        return timeZone;
    }

    public RecurringInvoiceSchedule setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
}
