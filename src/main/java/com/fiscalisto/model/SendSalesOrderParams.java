// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SendSalesOrderParams: los campos de «Mandar un pedido».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendSalesOrderParams {
    /**
     * Mandarlo por correo, con su PDF y url (por omisión true). Con false solo contesta url, para que usted la mande.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * A quién (hasta 5 correos). Por omisión, el correo del pedido.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    @JsonProperty("message")
    private String message;

    /**
     * Mandarlo por correo, con su PDF y url (por omisión true). Con false solo contesta url, para que usted la mande.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public SendSalesOrderParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * A quién (hasta 5 correos). Por omisión, el correo del pedido.
     */
    public String getTo() {
        return to;
    }

    public SendSalesOrderParams setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    public String getMessage() {
        return message;
    }

    public SendSalesOrderParams setMessage(String message) {
        this.message = message;
        return this;
    }
}
