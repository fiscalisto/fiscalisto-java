// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoicePayrollImssDays: En un recibo que calculó Fiscalisto: los días del IMSS.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollImssDays {
    /**
     * Días naturales del periodo que trabajó para el patrón: las cuotas del IMSS se causan por mes calendario (LSS art. 39), no por los días pagados.
     */
    @JsonProperty("calendar_days")
    private Long calendarDays;

    /**
     * Faltas del recibo.
     */
    @JsonProperty("absences")
    private Long absences;

    /**
     * Días de incapacidad del recibo.
     */
    @JsonProperty("disability_days")
    private Long disabilityDays;

    /**
     * Días que cotiza en enfermedades y maternidad (excedente, prestaciones en dinero, gastos médicos de pensionados): el periodo sin la incapacidad; las faltas cuentan (LSS art. 31 fr. I).
     */
    @JsonProperty("sickness_and_maternity")
    private Long sicknessAndMaternity;

    /**
     * Días que cotiza en invalidez y vida y en cesantía en edad avanzada y vejez: además sin las faltas, hasta 7 por mes.
     */
    @JsonProperty("disability_and_old_age")
    private Long disabilityAndOldAge;

    /**
     * Días naturales del periodo que trabajó para el patrón: las cuotas del IMSS se causan por mes calendario (LSS art. 39), no por los días pagados.
     */
    public Long getCalendarDays() {
        return calendarDays;
    }

    public InvoicePayrollImssDays setCalendarDays(Long calendarDays) {
        this.calendarDays = calendarDays;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollImssDays setCalendarDays(long calendarDays) {
        return setCalendarDays(Long.valueOf(calendarDays));
    }

    /**
     * Faltas del recibo.
     */
    public Long getAbsences() {
        return absences;
    }

    public InvoicePayrollImssDays setAbsences(Long absences) {
        this.absences = absences;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollImssDays setAbsences(long absences) {
        return setAbsences(Long.valueOf(absences));
    }

    /**
     * Días de incapacidad del recibo.
     */
    public Long getDisabilityDays() {
        return disabilityDays;
    }

    public InvoicePayrollImssDays setDisabilityDays(Long disabilityDays) {
        this.disabilityDays = disabilityDays;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollImssDays setDisabilityDays(long disabilityDays) {
        return setDisabilityDays(Long.valueOf(disabilityDays));
    }

    /**
     * Días que cotiza en enfermedades y maternidad (excedente, prestaciones en dinero, gastos médicos de pensionados): el periodo sin la incapacidad; las faltas cuentan (LSS art. 31 fr. I).
     */
    public Long getSicknessAndMaternity() {
        return sicknessAndMaternity;
    }

    public InvoicePayrollImssDays setSicknessAndMaternity(Long sicknessAndMaternity) {
        this.sicknessAndMaternity = sicknessAndMaternity;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollImssDays setSicknessAndMaternity(long sicknessAndMaternity) {
        return setSicknessAndMaternity(Long.valueOf(sicknessAndMaternity));
    }

    /**
     * Días que cotiza en invalidez y vida y en cesantía en edad avanzada y vejez: además sin las faltas, hasta 7 por mes.
     */
    public Long getDisabilityAndOldAge() {
        return disabilityAndOldAge;
    }

    public InvoicePayrollImssDays setDisabilityAndOldAge(Long disabilityAndOldAge) {
        this.disabilityAndOldAge = disabilityAndOldAge;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollImssDays setDisabilityAndOldAge(long disabilityAndOldAge) {
        return setDisabilityAndOldAge(Long.valueOf(disabilityAndOldAge));
    }
}
