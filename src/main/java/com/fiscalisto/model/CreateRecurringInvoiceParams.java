// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateRecurringInvoiceParams: los campos de «Crear una factura recurrente».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRecurringInvoiceParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Para reconocerla: «Renta oficina 3», «Plan Pro de ACME».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cada cuánto y a qué hora se timbra.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("schedule")
    private CreateRecurringInvoiceParamsSchedule schedule;

    /**
     * La factura que se repite: el cuerpo de POST /v1/invoices, sin issuer, folio, date, global ni metadata. En description puede usar {mes}, {mes anterior}, {mes siguiente}, {año}, {año anterior}, {año siguiente} y {periodo}: cada factura los llena con su fecha. Como se escriben es como salen: {mes} «noviembre», {Mes} «Noviembre», {MES} «NOVIEMBRE».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("invoice")
    private CreateRecurringInvoiceParamsInvoice invoice;

    /**
     * Mandar cada factura al correo del cliente (customer.email o el del catálogo). Por omisión true.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Si quedaron periodos sin timbrar (sin timbres, en pausa con su fecha pasada): all los timbra todos, cada uno con su mes; latest solo el más reciente. Por omisión all.
     * <p>
     * Valores: all, latest.
     */
    @JsonProperty("catch_up")
    private String catchUp;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateRecurringInvoiceParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Para reconocerla: «Renta oficina 3», «Plan Pro de ACME».
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateRecurringInvoiceParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cada cuánto y a qué hora se timbra.
     * <p>
     * Obligatorio.
     */
    public CreateRecurringInvoiceParamsSchedule getSchedule() {
        return schedule;
    }

    public CreateRecurringInvoiceParams setSchedule(CreateRecurringInvoiceParamsSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * La factura que se repite: el cuerpo de POST /v1/invoices, sin issuer, folio, date, global ni metadata. En description puede usar {mes}, {mes anterior}, {mes siguiente}, {año}, {año anterior}, {año siguiente} y {periodo}: cada factura los llena con su fecha. Como se escriben es como salen: {mes} «noviembre», {Mes} «Noviembre», {MES} «NOVIEMBRE».
     * <p>
     * Obligatorio.
     */
    public CreateRecurringInvoiceParamsInvoice getInvoice() {
        return invoice;
    }

    public CreateRecurringInvoiceParams setInvoice(CreateRecurringInvoiceParamsInvoice invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Mandar cada factura al correo del cliente (customer.email o el del catálogo). Por omisión true.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreateRecurringInvoiceParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Si quedaron periodos sin timbrar (sin timbres, en pausa con su fecha pasada): all los timbra todos, cada uno con su mes; latest solo el más reciente. Por omisión all.
     * <p>
     * Valores: all, latest.
     */
    public String getCatchUp() {
        return catchUp;
    }

    public CreateRecurringInvoiceParams setCatchUp(String catchUp) {
        this.catchUp = catchUp;
        return this;
    }
}
