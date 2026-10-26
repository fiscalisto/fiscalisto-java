// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateRecurringInvoiceParamsSchedule: Cada cuánto y a qué hora se timbra.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRecurringInvoiceParamsSchedule {
    /**
     * monthly: cada interval meses en day_of_month. weekly o daily: cada interval semanas o días desde start_date.
     * <p>
     * Valores: monthly, weekly, daily.
     */
    @JsonProperty("frequency")
    private String frequency;

    /**
     * Cada cuántos meses, semanas o días. Por omisión 1. Hasta 24 meses, 52 semanas o 365 días.
     */
    @JsonProperty("interval")
    private Long interval;

    /**
     * Con monthly: el día, del 1 al 28, o "last" (el último del mes). Por omisión el día de start_date, o el de hoy.
     */
    @JsonProperty("day_of_month")
    private Object dayOfMonth;

    /**
     * La primera factura, AAAA-MM-DD (hoy o después). Por omisión: con monthly, el próximo day_of_month; con weekly o daily, hoy.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * La hora (0 a 23) en que se timbra, en time_zone. Por omisión 7.
     */
    @JsonProperty("hour")
    private Long hour;

    /**
     * La zona de esa hora. Por omisión America/Mexico_City.
     * <p>
     * Valores: America/Mexico_City, America/Cancun, America/Mazatlan, America/Hermosillo, America/Tijuana, America/Ciudad_Juarez.
     */
    @JsonProperty("time_zone")
    private String timeZone;

    /**
     * monthly: cada interval meses en day_of_month. weekly o daily: cada interval semanas o días desde start_date.
     * <p>
     * Valores: monthly, weekly, daily.
     */
    public String getFrequency() {
        return frequency;
    }

    public UpdateRecurringInvoiceParamsSchedule setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Cada cuántos meses, semanas o días. Por omisión 1. Hasta 24 meses, 52 semanas o 365 días.
     */
    public Long getInterval() {
        return interval;
    }

    public UpdateRecurringInvoiceParamsSchedule setInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    @JsonIgnore
    public UpdateRecurringInvoiceParamsSchedule setInterval(long interval) {
        return setInterval(Long.valueOf(interval));
    }

    /**
     * Con monthly: el día, del 1 al 28, o "last" (el último del mes). Por omisión el día de start_date, o el de hoy.
     */
    public Object getDayOfMonth() {
        return dayOfMonth;
    }

    public UpdateRecurringInvoiceParamsSchedule setDayOfMonth(Object dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    /**
     * La primera factura, AAAA-MM-DD (hoy o después). Por omisión: con monthly, el próximo day_of_month; con weekly o daily, hoy.
     */
    public String getStartDate() {
        return startDate;
    }

    public UpdateRecurringInvoiceParamsSchedule setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * La hora (0 a 23) en que se timbra, en time_zone. Por omisión 7.
     */
    public Long getHour() {
        return hour;
    }

    public UpdateRecurringInvoiceParamsSchedule setHour(Long hour) {
        this.hour = hour;
        return this;
    }

    @JsonIgnore
    public UpdateRecurringInvoiceParamsSchedule setHour(long hour) {
        return setHour(Long.valueOf(hour));
    }

    /**
     * La zona de esa hora. Por omisión America/Mexico_City.
     * <p>
     * Valores: America/Mexico_City, America/Cancun, America/Mazatlan, America/Hermosillo, America/Tijuana, America/Ciudad_Juarez.
     */
    public String getTimeZone() {
        return timeZone;
    }

    public UpdateRecurringInvoiceParamsSchedule setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
}
