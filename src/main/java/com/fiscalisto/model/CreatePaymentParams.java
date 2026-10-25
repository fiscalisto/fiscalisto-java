// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * CreatePaymentParams: los campos de «Timbrar un complemento de pago».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePaymentParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Fecha en que le pagaron (FechaPago), AAAA-MM-DD. Por omisión hoy.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * Número de operación del pago (NumOperacion), como el rastreo SPEI.
     */
    @JsonProperty("operation_number")
    private String operationNumber;

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    @JsonProperty("exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    @JsonProperty("series")
    private String series;

    /**
     * Las facturas que paga (DoctoRelacionado).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("documents")
    private List<CreatePaymentParamsDocument> documents;

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
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePaymentParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Fecha en que le pagaron (FechaPago), AAAA-MM-DD. Por omisión hoy.
     */
    public String getDate() {
        return date;
    }

    public CreatePaymentParams setDate(String date) {
        this.date = date;
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

    public CreatePaymentParams setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Número de operación del pago (NumOperacion), como el rastreo SPEI.
     */
    public String getOperationNumber() {
        return operationNumber;
    }

    public CreatePaymentParams setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public CreatePaymentParams setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public CreatePaymentParams setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    public CreatePaymentParams setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    public String getSeries() {
        return series;
    }

    public CreatePaymentParams setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Las facturas que paga (DoctoRelacionado).
     * <p>
     * Obligatorio.
     */
    public List<CreatePaymentParamsDocument> getDocuments() {
        return documents;
    }

    public CreatePaymentParams setDocuments(List<CreatePaymentParamsDocument> documents) {
        this.documents = documents;
        return this;
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreatePaymentParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    public String getEmail() {
        return email;
    }

    public CreatePaymentParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Correos con copia, separados por comas.
     */
    public String getEmailCc() {
        return emailCc;
    }

    public CreatePaymentParams setEmailCc(String emailCc) {
        this.emailCc = emailCc;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreatePaymentParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
