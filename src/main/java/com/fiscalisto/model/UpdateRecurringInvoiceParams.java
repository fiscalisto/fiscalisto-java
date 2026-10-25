// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateRecurringInvoiceParams: los campos de «Cambiar o pausar una factura recurrente».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRecurringInvoiceParams {
    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cada cuánto y a qué hora se timbra.
     */
    @JsonProperty("schedule")
    private UpdateRecurringInvoiceParamsSchedule schedule;

    /**
     * La factura completa que se repite desde la siguiente vez (reemplaza la anterior).
     */
    @JsonProperty("invoice")
    private UpdateRecurringInvoiceParamsInvoice invoice;

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Si quedaron periodos sin timbrar: all los timbra todos, cada uno con su mes; latest solo el más reciente.
     * <p>
     * Valores: all, latest.
     */
    @JsonProperty("catch_up")
    private String catchUp;

    /**
     * false la pausa; true la reanuda desde hoy, sin timbrar las fechas que pasaron en pausa.
     */
    @JsonProperty("active")
    private Boolean active;

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public UpdateRecurringInvoiceParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cada cuánto y a qué hora se timbra.
     */
    public UpdateRecurringInvoiceParamsSchedule getSchedule() {
        return schedule;
    }

    public UpdateRecurringInvoiceParams setSchedule(UpdateRecurringInvoiceParamsSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * La factura completa que se repite desde la siguiente vez (reemplaza la anterior).
     */
    public UpdateRecurringInvoiceParamsInvoice getInvoice() {
        return invoice;
    }

    public UpdateRecurringInvoiceParams setInvoice(UpdateRecurringInvoiceParamsInvoice invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public UpdateRecurringInvoiceParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Si quedaron periodos sin timbrar: all los timbra todos, cada uno con su mes; latest solo el más reciente.
     * <p>
     * Valores: all, latest.
     */
    public String getCatchUp() {
        return catchUp;
    }

    public UpdateRecurringInvoiceParams setCatchUp(String catchUp) {
        this.catchUp = catchUp;
        return this;
    }

    /**
     * false la pausa; true la reanuda desde hoy, sin timbrar las fechas que pasaron en pausa.
     */
    public Boolean getActive() {
        return active;
    }

    public UpdateRecurringInvoiceParams setActive(Boolean active) {
        this.active = active;
        return this;
    }
}
