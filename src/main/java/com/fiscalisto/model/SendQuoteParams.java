// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SendQuoteParams: los campos de «Mandar una cotización».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendQuoteParams {
    /**
     * Mandarla por correo, con su PDF y la liga (por omisión true). Con false solo se marca enviada y contesta url, para que usted la mande.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * A quién (hasta 5 correos). Por omisión, el correo del cliente.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Un mensaje en el correo.
     */
    @JsonProperty("message")
    private String message;

    /**
     * Al aceptarla, timbrar la factura sola (con los datos fiscales del cliente; si no los tiene, la página se los pide primero). Por omisión false: la factura se timbra con POST /v1/quotes/{id}/invoice.
     */
    @JsonProperty("auto_invoice")
    private Boolean autoInvoice;

    /**
     * Recordarle por correo, a los mismos destinatarios, 3 días antes de su último día si no ha respondido (una vez). Solo al mandarla por correo; por omisión false.
     */
    @JsonProperty("remind")
    private Boolean remind;

    /**
     * Mandarla por correo, con su PDF y la liga (por omisión true). Con false solo se marca enviada y contesta url, para que usted la mande.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public SendQuoteParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * A quién (hasta 5 correos). Por omisión, el correo del cliente.
     */
    public String getTo() {
        return to;
    }

    public SendQuoteParams setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Un mensaje en el correo.
     */
    public String getMessage() {
        return message;
    }

    public SendQuoteParams setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Al aceptarla, timbrar la factura sola (con los datos fiscales del cliente; si no los tiene, la página se los pide primero). Por omisión false: la factura se timbra con POST /v1/quotes/{id}/invoice.
     */
    public Boolean getAutoInvoice() {
        return autoInvoice;
    }

    public SendQuoteParams setAutoInvoice(Boolean autoInvoice) {
        this.autoInvoice = autoInvoice;
        return this;
    }

    /**
     * Recordarle por correo, a los mismos destinatarios, 3 días antes de su último día si no ha respondido (una vez). Solo al mandarla por correo; por omisión false.
     */
    public Boolean getRemind() {
        return remind;
    }

    public SendQuoteParams setRemind(Boolean remind) {
        this.remind = remind;
        return this;
    }
}
