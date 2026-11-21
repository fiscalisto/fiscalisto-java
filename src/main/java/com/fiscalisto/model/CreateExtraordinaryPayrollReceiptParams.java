// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * CreateExtraordinaryPayrollReceiptParams: los campos de «Timbrar un aguinaldo, PTU o finiquito».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExtraordinaryPayrollReceiptParams {
    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * aguinaldo (sus días al año, al menos 15, en proporción a los trabajados), ptu (la parte que le toca de las utilidades) o finiquito (al último día trabajado, end_date del empleado: aguinaldo, vacaciones y prima vacacional proporcionales y, con exit_reason dismissal, la indemnización y la prima de antigüedad).
     * <p>
     * Valores: aguinaldo, ptu, finiquito.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * FechaPago del recibo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * aguinaldo: el año que paga (por omisión, el de payment_date). ptu: el año de la utilidad (por omisión, el anterior a payment_date).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * aguinaldo: los días trabajados en el año, si no son todos los que estuvo contratado (faltas o incapacidades que no cuentan).
     */
    @JsonProperty("days_worked")
    private BigDecimal daysWorked;

    /**
     * ptu: lo que le toca a este empleado (la mitad de la PTU por días trabajados y la mitad por salario, con el tope de tres meses de salario). Fiscalisto calcula su parte exenta (15 UMA) y su ISR.
     */
    @JsonProperty("ptu_amount")
    private BigDecimal ptuAmount;

    /**
     * aguinaldo y ptu: cómo retener el ISR de la parte gravada. lower (por omisión) el que retenga menos; art96 sumada al sueldo del mes; art174 el procedimiento opcional del Reglamento de la LISR.
     * <p>
     * Valores: lower, art96, art174.
     */
    @JsonProperty("isr_method")
    private String isrMethod;

    /**
     * finiquito: resignation (renuncia, común acuerdo o fin de contrato, por omisión; prima de antigüedad solo con 15 años o más), dismissal (despido sin causa: suma 3 meses de salario integrado y la prima de antigüedad), justified_dismissal (despido por una causa del art. 47 de la LFT: sin indemnización, con prima de antigüedad), worker_rescission (el trabajador rescinde por una causa del art. 51: 3 meses, 20 días por año y prima de antigüedad) o death (fallecimiento: prima de antigüedad a sus beneficiarios, sin importar los años).
     * <p>
     * Valores: resignation, dismissal, justified_dismissal, worker_rescission, death.
     */
    @JsonProperty("exit_reason")
    private String exitReason;

    /**
     * finiquito con dismissal: incluye 20 días por año de servicio (LFT art. 50), cuando el patrón no lo reinstala.
     */
    @JsonProperty("twenty_days_per_year")
    private Boolean twentyDaysPerYear;

    /**
     * finiquito: los días de vacaciones del año de servicio en curso que ya tomó. Por omisión, los de sus recibos timbrados (GET /v1/employees/{id}/vacations).
     */
    @JsonProperty("vacation_days_taken")
    private BigDecimal vacationDaysTaken;

    /**
     * finiquito: los días de vacaciones de años de servicio cumplidos que no disfrutó ni han prescrito; se pagan con su prima vacacional. Por omisión, pending_days de sus vacaciones.
     */
    @JsonProperty("vacation_days_owed")
    private BigDecimal vacationDaysOwed;

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * El confirmation_token de POST /v1/payroll_receipts/extraordinary/preview: timbra solo si el recibo calculado ahora es el que revisó (si no, 409 payroll_calculation_changed).
     */
    @JsonProperty("confirmation_token")
    private String confirmationToken;

    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public CreateExtraordinaryPayrollReceiptParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * aguinaldo (sus días al año, al menos 15, en proporción a los trabajados), ptu (la parte que le toca de las utilidades) o finiquito (al último día trabajado, end_date del empleado: aguinaldo, vacaciones y prima vacacional proporcionales y, con exit_reason dismissal, la indemnización y la prima de antigüedad).
     * <p>
     * Valores: aguinaldo, ptu, finiquito.
     * <p>
     * Obligatorio.
     */
    public String getKind() {
        return kind;
    }

    public CreateExtraordinaryPayrollReceiptParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * FechaPago del recibo.
     * <p>
     * Obligatorio.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public CreateExtraordinaryPayrollReceiptParams setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * aguinaldo: el año que paga (por omisión, el de payment_date). ptu: el año de la utilidad (por omisión, el anterior a payment_date).
     */
    public Long getYear() {
        return year;
    }

    public CreateExtraordinaryPayrollReceiptParams setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public CreateExtraordinaryPayrollReceiptParams setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * aguinaldo: los días trabajados en el año, si no son todos los que estuvo contratado (faltas o incapacidades que no cuentan).
     */
    public BigDecimal getDaysWorked() {
        return daysWorked;
    }

    public CreateExtraordinaryPayrollReceiptParams setDaysWorked(BigDecimal daysWorked) {
        this.daysWorked = daysWorked;
        return this;
    }

    @JsonIgnore
    public CreateExtraordinaryPayrollReceiptParams setDaysWorked(double daysWorked) {
        return setDaysWorked(BigDecimal.valueOf(daysWorked));
    }

    /**
     * ptu: lo que le toca a este empleado (la mitad de la PTU por días trabajados y la mitad por salario, con el tope de tres meses de salario). Fiscalisto calcula su parte exenta (15 UMA) y su ISR.
     */
    public BigDecimal getPtuAmount() {
        return ptuAmount;
    }

    public CreateExtraordinaryPayrollReceiptParams setPtuAmount(BigDecimal ptuAmount) {
        this.ptuAmount = ptuAmount;
        return this;
    }

    @JsonIgnore
    public CreateExtraordinaryPayrollReceiptParams setPtuAmount(double ptuAmount) {
        return setPtuAmount(BigDecimal.valueOf(ptuAmount));
    }

    /**
     * aguinaldo y ptu: cómo retener el ISR de la parte gravada. lower (por omisión) el que retenga menos; art96 sumada al sueldo del mes; art174 el procedimiento opcional del Reglamento de la LISR.
     * <p>
     * Valores: lower, art96, art174.
     */
    public String getIsrMethod() {
        return isrMethod;
    }

    public CreateExtraordinaryPayrollReceiptParams setIsrMethod(String isrMethod) {
        this.isrMethod = isrMethod;
        return this;
    }

    /**
     * finiquito: resignation (renuncia, común acuerdo o fin de contrato, por omisión; prima de antigüedad solo con 15 años o más), dismissal (despido sin causa: suma 3 meses de salario integrado y la prima de antigüedad), justified_dismissal (despido por una causa del art. 47 de la LFT: sin indemnización, con prima de antigüedad), worker_rescission (el trabajador rescinde por una causa del art. 51: 3 meses, 20 días por año y prima de antigüedad) o death (fallecimiento: prima de antigüedad a sus beneficiarios, sin importar los años).
     * <p>
     * Valores: resignation, dismissal, justified_dismissal, worker_rescission, death.
     */
    public String getExitReason() {
        return exitReason;
    }

    public CreateExtraordinaryPayrollReceiptParams setExitReason(String exitReason) {
        this.exitReason = exitReason;
        return this;
    }

    /**
     * finiquito con dismissal: incluye 20 días por año de servicio (LFT art. 50), cuando el patrón no lo reinstala.
     */
    public Boolean getTwentyDaysPerYear() {
        return twentyDaysPerYear;
    }

    public CreateExtraordinaryPayrollReceiptParams setTwentyDaysPerYear(Boolean twentyDaysPerYear) {
        this.twentyDaysPerYear = twentyDaysPerYear;
        return this;
    }

    /**
     * finiquito: los días de vacaciones del año de servicio en curso que ya tomó. Por omisión, los de sus recibos timbrados (GET /v1/employees/{id}/vacations).
     */
    public BigDecimal getVacationDaysTaken() {
        return vacationDaysTaken;
    }

    public CreateExtraordinaryPayrollReceiptParams setVacationDaysTaken(BigDecimal vacationDaysTaken) {
        this.vacationDaysTaken = vacationDaysTaken;
        return this;
    }

    @JsonIgnore
    public CreateExtraordinaryPayrollReceiptParams setVacationDaysTaken(double vacationDaysTaken) {
        return setVacationDaysTaken(BigDecimal.valueOf(vacationDaysTaken));
    }

    /**
     * finiquito: los días de vacaciones de años de servicio cumplidos que no disfrutó ni han prescrito; se pagan con su prima vacacional. Por omisión, pending_days de sus vacaciones.
     */
    public BigDecimal getVacationDaysOwed() {
        return vacationDaysOwed;
    }

    public CreateExtraordinaryPayrollReceiptParams setVacationDaysOwed(BigDecimal vacationDaysOwed) {
        this.vacationDaysOwed = vacationDaysOwed;
        return this;
    }

    @JsonIgnore
    public CreateExtraordinaryPayrollReceiptParams setVacationDaysOwed(double vacationDaysOwed) {
        return setVacationDaysOwed(BigDecimal.valueOf(vacationDaysOwed));
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreateExtraordinaryPayrollReceiptParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreateExtraordinaryPayrollReceiptParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * El confirmation_token de POST /v1/payroll_receipts/extraordinary/preview: timbra solo si el recibo calculado ahora es el que revisó (si no, 409 payroll_calculation_changed).
     */
    public String getConfirmationToken() {
        return confirmationToken;
    }

    public CreateExtraordinaryPayrollReceiptParams setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
        return this;
    }
}
