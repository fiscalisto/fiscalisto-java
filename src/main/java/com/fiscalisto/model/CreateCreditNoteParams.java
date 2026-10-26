// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * CreateCreditNoteParams: los campos de «Timbrar una nota de crédito».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCreditNoteParams {
    /**
     * La factura (inv_… o su UUID).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * Importe de la nota antes de impuestos: Fiscalisto agrega el IVA y las retenciones de la factura en la misma proporción.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Descripción del concepto de la nota (Descripcion), como «Descuento por pronto pago».
     */
    @JsonProperty("description")
    private String description;

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * Tipo de relación (TipoRelacion): 01 nota de crédito, 03 devolución, 04 sustitución, 07 anticipo…
     * <p>
     * Valores: 01, 03.
     */
    @JsonProperty("relationship")
    private String relationship;

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Correos con copia, separados por comas.
     */
    @JsonProperty("email_cc")
    private String emailCc;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * La factura (inv_… o su UUID).
     * <p>
     * Obligatorio.
     */
    public String getInvoice() {
        return invoice;
    }

    public CreateCreditNoteParams setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Importe de la nota antes de impuestos: Fiscalisto agrega el IVA y las retenciones de la factura en la misma proporción.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateCreditNoteParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateCreditNoteParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Descripción del concepto de la nota (Descripcion), como «Descuento por pronto pago».
     */
    public String getDescription() {
        return description;
    }

    public CreateCreditNoteParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     * <p>
     * Obligatorio.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public CreateCreditNoteParams setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Tipo de relación (TipoRelacion): 01 nota de crédito, 03 devolución, 04 sustitución, 07 anticipo…
     * <p>
     * Valores: 01, 03.
     */
    public String getRelationship() {
        return relationship;
    }

    public CreateCreditNoteParams setRelationship(String relationship) {
        this.relationship = relationship;
        return this;
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreateCreditNoteParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    public String getEmail() {
        return email;
    }

    public CreateCreditNoteParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Correos con copia, separados por comas.
     */
    public String getEmailCc() {
        return emailCc;
    }

    public CreateCreditNoteParams setEmailCc(String emailCc) {
        this.emailCc = emailCc;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreateCreditNoteParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
