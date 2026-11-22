// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollCalendarEvent: Una fecha del calendario de nómina.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollCalendarEvent {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * pago (una nómina, en su fecha de pago), imss (cuotas del mes, LSS art. 39), rcv_infonavit (bimestrales), isn (impuesto sobre nómina de un estado), aguinaldo (LFT art. 87), ptu (LFT art. 122), prima_riesgo (determinación anual, RACERF art. 32), ajuste_anual (LISR art. 97), icsoe (informativa cuatrimestral al IMSS de un contratista REPSE, LSS art. 15-A), sisub (la del Infonavit, Ley del Infonavit art. 29 Bis) o renovacion_repse (la renovación del registro en el REPSE cada tres años, LFT art. 15).
     * <p>
     * Valores: pago, imss, rcv_infonavit, isn, aguinaldo, ptu, prima_riesgo, ajuste_anual, icsoe, sisub, renovacion_repse.
     */
    @JsonProperty("obligation")
    private String obligation;

    /**
     * Lo identifica junto con obligation: 2026-11 (mes), 2026-B6 (bimestre), 2026 (año), 2026-11:CMX (ISN de un estado) o 2026-11-16/2026-11-30:04 (una nómina).
     */
    @JsonProperty("key")
    private String key;

    /**
     * Qué es, como lo dice la app.
     */
    @JsonProperty("title")
    private String title;

    /**
     * El último día para pagarlo (YYYY-MM-DD), ya movido al siguiente día hábil cuando la ley lo mueve.
     */
    @JsonProperty("due_date")
    private String dueDate;

    /**
     * El artículo de la ley que da la fecha.
     */
    @JsonProperty("basis")
    private String basis;

    /**
     * Si se debe depende de algo que no sabemos (una PTU sin utilidad, una prima que no cambió) o falta el día de pago del ISN de un estado: qué confirmar. No se avisa.
     */
    @JsonProperty("to_confirm")
    private String toConfirm;

    /**
     * Marcado como pagado; una nómina, cuando todos sus recibos están timbrados.
     */
    @JsonProperty("paid")
    private Boolean paid;

    /**
     * Cuándo se marcó pagado (ISO 8601); una nómina timbrada, su fecha de pago.
     */
    @JsonProperty("paid_at")
    private String paidAt;

    /**
     * El c_Estado de un isn.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Una nómina (obligation pago): su periodo y cuántos recibos van.
     */
    @JsonProperty("payroll")
    private PayrollCalendarEventPayroll payroll;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollCalendarEvent setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * pago (una nómina, en su fecha de pago), imss (cuotas del mes, LSS art. 39), rcv_infonavit (bimestrales), isn (impuesto sobre nómina de un estado), aguinaldo (LFT art. 87), ptu (LFT art. 122), prima_riesgo (determinación anual, RACERF art. 32), ajuste_anual (LISR art. 97), icsoe (informativa cuatrimestral al IMSS de un contratista REPSE, LSS art. 15-A), sisub (la del Infonavit, Ley del Infonavit art. 29 Bis) o renovacion_repse (la renovación del registro en el REPSE cada tres años, LFT art. 15).
     * <p>
     * Valores: pago, imss, rcv_infonavit, isn, aguinaldo, ptu, prima_riesgo, ajuste_anual, icsoe, sisub, renovacion_repse.
     */
    public String getObligation() {
        return obligation;
    }

    public PayrollCalendarEvent setObligation(String obligation) {
        this.obligation = obligation;
        return this;
    }

    /**
     * Lo identifica junto con obligation: 2026-11 (mes), 2026-B6 (bimestre), 2026 (año), 2026-11:CMX (ISN de un estado) o 2026-11-16/2026-11-30:04 (una nómina).
     */
    public String getKey() {
        return key;
    }

    public PayrollCalendarEvent setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Qué es, como lo dice la app.
     */
    public String getTitle() {
        return title;
    }

    public PayrollCalendarEvent setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * El último día para pagarlo (YYYY-MM-DD), ya movido al siguiente día hábil cuando la ley lo mueve.
     */
    public String getDueDate() {
        return dueDate;
    }

    public PayrollCalendarEvent setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * El artículo de la ley que da la fecha.
     */
    public String getBasis() {
        return basis;
    }

    public PayrollCalendarEvent setBasis(String basis) {
        this.basis = basis;
        return this;
    }

    /**
     * Si se debe depende de algo que no sabemos (una PTU sin utilidad, una prima que no cambió) o falta el día de pago del ISN de un estado: qué confirmar. No se avisa.
     */
    public String getToConfirm() {
        return toConfirm;
    }

    public PayrollCalendarEvent setToConfirm(String toConfirm) {
        this.toConfirm = toConfirm;
        return this;
    }

    /**
     * Marcado como pagado; una nómina, cuando todos sus recibos están timbrados.
     */
    public Boolean getPaid() {
        return paid;
    }

    public PayrollCalendarEvent setPaid(Boolean paid) {
        this.paid = paid;
        return this;
    }

    /**
     * Cuándo se marcó pagado (ISO 8601); una nómina timbrada, su fecha de pago.
     */
    public String getPaidAt() {
        return paidAt;
    }

    public PayrollCalendarEvent setPaidAt(String paidAt) {
        this.paidAt = paidAt;
        return this;
    }

    /**
     * El c_Estado de un isn.
     */
    public String getState() {
        return state;
    }

    public PayrollCalendarEvent setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Una nómina (obligation pago): su periodo y cuántos recibos van.
     */
    public PayrollCalendarEventPayroll getPayroll() {
        return payroll;
    }

    public PayrollCalendarEvent setPayroll(PayrollCalendarEventPayroll payroll) {
        this.payroll = payroll;
        return this;
    }
}
