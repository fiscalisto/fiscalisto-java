// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreatePayrollReceiptParamsIncidents: Incidencias del periodo, como en Nómina › Emitir recibos: horas extra, domingos trabajados, vacaciones y premios. Fiscalisto calcula sus importes, su parte exenta y el ISR con el sueldo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollReceiptParamsIncidents {
    /**
     * Horas extra dobles (pagadas al doble), horas completas: hasta 9 por semana en 2026 y 2027, 10 en 2028, 11 en 2029 y 12 desde 2030 (LFT arts. 66 y transitorio cuarto del decreto DOF 01-05-2026). Exentas la mitad, hasta 5 UMA por semana; todas si gana el salario mínimo (LISR art. 93 fr. I).
     */
    @JsonProperty("double_hours")
    private Long doubleHours;

    /**
     * Horas extra triples, las que pasan de las dobles de la semana (LFT art. 68). Gravadas.
     */
    @JsonProperty("triple_hours")
    private Long tripleHours;

    /**
     * Días en que se trabajaron las horas extra (nodo HorasExtra); uno por cada 3 horas si no lo manda.
     */
    @JsonProperty("overtime_days")
    private Long overtimeDays;

    /**
     * Domingos trabajados: prima dominical del 25% del salario diario por cada uno (LFT art. 71), exenta hasta 1 UMA por domingo.
     */
    @JsonProperty("sundays")
    private Long sundays;

    /**
     * Días de vacaciones que disfrutó en el periodo (se pagan como sueldo dentro de days): su prima vacacional con el porcentaje del empleado, exenta hasta 15 UMA en el año.
     */
    @JsonProperty("vacation_days")
    private BigDecimal vacationDays;

    /**
     * Premios y bonos del periodo, gravados.
     */
    @JsonProperty("bonuses")
    private List<CreatePayrollReceiptParamsIncidentsBonus> bonuses;

    /**
     * Horas extra dobles (pagadas al doble), horas completas: hasta 9 por semana en 2026 y 2027, 10 en 2028, 11 en 2029 y 12 desde 2030 (LFT arts. 66 y transitorio cuarto del decreto DOF 01-05-2026). Exentas la mitad, hasta 5 UMA por semana; todas si gana el salario mínimo (LISR art. 93 fr. I).
     */
    public Long getDoubleHours() {
        return doubleHours;
    }

    public CreatePayrollReceiptParamsIncidents setDoubleHours(Long doubleHours) {
        this.doubleHours = doubleHours;
        return this;
    }

    @JsonIgnore
    public CreatePayrollReceiptParamsIncidents setDoubleHours(long doubleHours) {
        return setDoubleHours(Long.valueOf(doubleHours));
    }

    /**
     * Horas extra triples, las que pasan de las dobles de la semana (LFT art. 68). Gravadas.
     */
    public Long getTripleHours() {
        return tripleHours;
    }

    public CreatePayrollReceiptParamsIncidents setTripleHours(Long tripleHours) {
        this.tripleHours = tripleHours;
        return this;
    }

    @JsonIgnore
    public CreatePayrollReceiptParamsIncidents setTripleHours(long tripleHours) {
        return setTripleHours(Long.valueOf(tripleHours));
    }

    /**
     * Días en que se trabajaron las horas extra (nodo HorasExtra); uno por cada 3 horas si no lo manda.
     */
    public Long getOvertimeDays() {
        return overtimeDays;
    }

    public CreatePayrollReceiptParamsIncidents setOvertimeDays(Long overtimeDays) {
        this.overtimeDays = overtimeDays;
        return this;
    }

    @JsonIgnore
    public CreatePayrollReceiptParamsIncidents setOvertimeDays(long overtimeDays) {
        return setOvertimeDays(Long.valueOf(overtimeDays));
    }

    /**
     * Domingos trabajados: prima dominical del 25% del salario diario por cada uno (LFT art. 71), exenta hasta 1 UMA por domingo.
     */
    public Long getSundays() {
        return sundays;
    }

    public CreatePayrollReceiptParamsIncidents setSundays(Long sundays) {
        this.sundays = sundays;
        return this;
    }

    @JsonIgnore
    public CreatePayrollReceiptParamsIncidents setSundays(long sundays) {
        return setSundays(Long.valueOf(sundays));
    }

    /**
     * Días de vacaciones que disfrutó en el periodo (se pagan como sueldo dentro de days): su prima vacacional con el porcentaje del empleado, exenta hasta 15 UMA en el año.
     */
    public BigDecimal getVacationDays() {
        return vacationDays;
    }

    public CreatePayrollReceiptParamsIncidents setVacationDays(BigDecimal vacationDays) {
        this.vacationDays = vacationDays;
        return this;
    }

    @JsonIgnore
    public CreatePayrollReceiptParamsIncidents setVacationDays(double vacationDays) {
        return setVacationDays(BigDecimal.valueOf(vacationDays));
    }

    /**
     * Premios y bonos del periodo, gravados.
     */
    public List<CreatePayrollReceiptParamsIncidentsBonus> getBonuses() {
        return bonuses;
    }

    public CreatePayrollReceiptParamsIncidents setBonuses(List<CreatePayrollReceiptParamsIncidentsBonus> bonuses) {
        this.bonuses = bonuses;
        return this;
    }
}
