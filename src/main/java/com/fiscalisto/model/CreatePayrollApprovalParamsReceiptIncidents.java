// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreatePayrollApprovalParamsReceiptIncidents: Incidencias del periodo, como en Nómina › Emitir recibos: horas extra, domingos, descansos y festivos trabajados, vacaciones, premios y comisiones. Fiscalisto calcula sus importes, su parte exenta y el ISR con el sueldo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollApprovalParamsReceiptIncidents {
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
     * Días de descanso semanal que trabajó sin descansar otro en su lugar: salario doble por cada uno además del día (LFT art. 73). Exentos con las horas extra: la mitad, hasta 5 UMA por semana entre ambos; todo si gana el salario mínimo (LISR art. 93 fr. I).
     */
    @JsonProperty("rest_days_worked")
    private Long restDaysWorked;

    /**
     * Días de descanso obligatorio que trabajó (1 de enero, 1 de mayo, 16 de septiembre, 25 de diciembre, los lunes del art. 74 y la jornada electoral): salario doble por cada uno además del día (LFT art. 75), exento como rest_days_worked.
     */
    @JsonProperty("holidays_worked")
    private Long holidaysWorked;

    /**
     * Días de vacaciones que disfrutó en el periodo (se pagan como sueldo dentro de days): su prima vacacional con el porcentaje del empleado, exenta hasta 15 UMA en el año.
     */
    @JsonProperty("vacation_days")
    private BigDecimal vacationDays;

    /**
     * Si la empresa paga los disability_days del recibo: percepción 014 con su nodo Incapacidad. Exenta como previsión social con el límite de 7 UMA al año (art. 93 de la LISR); la de un riesgo de trabajo, toda.
     */
    @JsonProperty("disability_pay")
    private CreatePayrollApprovalParamsReceiptIncidentsDisabilityPay disabilityPay;

    /**
     * Retroactivo de un aumento: la diferencia de salario de los días ya pagados con el anterior, como percepción 001 (clave RET) gravada, que paga ISR con el sueldo del periodo (art. 96 de la LISR). Las cuotas IMSS de la diferencia las cubre la modificación de salario con su fecha en el SUA; el recibo no retiene la parte del trabajador (art. 38 de la LSS).
     */
    @JsonProperty("retroactive")
    private CreatePayrollApprovalParamsReceiptIncidentsRetroactive retroactive;

    /**
     * Premios, comisiones y bonos del periodo, gravados.
     */
    @JsonProperty("bonuses")
    private List<CreatePayrollApprovalParamsReceiptIncidentsBonus> bonuses;

    /**
     * Horas extra dobles (pagadas al doble), horas completas: hasta 9 por semana en 2026 y 2027, 10 en 2028, 11 en 2029 y 12 desde 2030 (LFT arts. 66 y transitorio cuarto del decreto DOF 01-05-2026). Exentas la mitad, hasta 5 UMA por semana; todas si gana el salario mínimo (LISR art. 93 fr. I).
     */
    public Long getDoubleHours() {
        return doubleHours;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setDoubleHours(Long doubleHours) {
        this.doubleHours = doubleHours;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceiptIncidents setDoubleHours(long doubleHours) {
        return setDoubleHours(Long.valueOf(doubleHours));
    }

    /**
     * Horas extra triples, las que pasan de las dobles de la semana (LFT art. 68). Gravadas.
     */
    public Long getTripleHours() {
        return tripleHours;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setTripleHours(Long tripleHours) {
        this.tripleHours = tripleHours;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceiptIncidents setTripleHours(long tripleHours) {
        return setTripleHours(Long.valueOf(tripleHours));
    }

    /**
     * Días en que se trabajaron las horas extra (nodo HorasExtra); uno por cada 3 horas si no lo manda.
     */
    public Long getOvertimeDays() {
        return overtimeDays;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setOvertimeDays(Long overtimeDays) {
        this.overtimeDays = overtimeDays;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceiptIncidents setOvertimeDays(long overtimeDays) {
        return setOvertimeDays(Long.valueOf(overtimeDays));
    }

    /**
     * Domingos trabajados: prima dominical del 25% del salario diario por cada uno (LFT art. 71), exenta hasta 1 UMA por domingo.
     */
    public Long getSundays() {
        return sundays;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setSundays(Long sundays) {
        this.sundays = sundays;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceiptIncidents setSundays(long sundays) {
        return setSundays(Long.valueOf(sundays));
    }

    /**
     * Días de descanso semanal que trabajó sin descansar otro en su lugar: salario doble por cada uno además del día (LFT art. 73). Exentos con las horas extra: la mitad, hasta 5 UMA por semana entre ambos; todo si gana el salario mínimo (LISR art. 93 fr. I).
     */
    public Long getRestDaysWorked() {
        return restDaysWorked;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setRestDaysWorked(Long restDaysWorked) {
        this.restDaysWorked = restDaysWorked;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceiptIncidents setRestDaysWorked(long restDaysWorked) {
        return setRestDaysWorked(Long.valueOf(restDaysWorked));
    }

    /**
     * Días de descanso obligatorio que trabajó (1 de enero, 1 de mayo, 16 de septiembre, 25 de diciembre, los lunes del art. 74 y la jornada electoral): salario doble por cada uno además del día (LFT art. 75), exento como rest_days_worked.
     */
    public Long getHolidaysWorked() {
        return holidaysWorked;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setHolidaysWorked(Long holidaysWorked) {
        this.holidaysWorked = holidaysWorked;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceiptIncidents setHolidaysWorked(long holidaysWorked) {
        return setHolidaysWorked(Long.valueOf(holidaysWorked));
    }

    /**
     * Días de vacaciones que disfrutó en el periodo (se pagan como sueldo dentro de days): su prima vacacional con el porcentaje del empleado, exenta hasta 15 UMA en el año.
     */
    public BigDecimal getVacationDays() {
        return vacationDays;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setVacationDays(BigDecimal vacationDays) {
        this.vacationDays = vacationDays;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceiptIncidents setVacationDays(double vacationDays) {
        return setVacationDays(BigDecimal.valueOf(vacationDays));
    }

    /**
     * Si la empresa paga los disability_days del recibo: percepción 014 con su nodo Incapacidad. Exenta como previsión social con el límite de 7 UMA al año (art. 93 de la LISR); la de un riesgo de trabajo, toda.
     */
    public CreatePayrollApprovalParamsReceiptIncidentsDisabilityPay getDisabilityPay() {
        return disabilityPay;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setDisabilityPay(CreatePayrollApprovalParamsReceiptIncidentsDisabilityPay disabilityPay) {
        this.disabilityPay = disabilityPay;
        return this;
    }

    /**
     * Retroactivo de un aumento: la diferencia de salario de los días ya pagados con el anterior, como percepción 001 (clave RET) gravada, que paga ISR con el sueldo del periodo (art. 96 de la LISR). Las cuotas IMSS de la diferencia las cubre la modificación de salario con su fecha en el SUA; el recibo no retiene la parte del trabajador (art. 38 de la LSS).
     */
    public CreatePayrollApprovalParamsReceiptIncidentsRetroactive getRetroactive() {
        return retroactive;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setRetroactive(CreatePayrollApprovalParamsReceiptIncidentsRetroactive retroactive) {
        this.retroactive = retroactive;
        return this;
    }

    /**
     * Premios, comisiones y bonos del periodo, gravados.
     */
    public List<CreatePayrollApprovalParamsReceiptIncidentsBonus> getBonuses() {
        return bonuses;
    }

    public CreatePayrollApprovalParamsReceiptIncidents setBonuses(List<CreatePayrollApprovalParamsReceiptIncidentsBonus> bonuses) {
        this.bonuses = bonuses;
        return this;
    }
}
