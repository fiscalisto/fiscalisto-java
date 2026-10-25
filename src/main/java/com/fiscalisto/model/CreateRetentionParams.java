// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * CreateRetentionParams: los campos de «Timbrar una constancia de retenciones».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Descripción de la retención (DescRetenc); obligatoria con la clave 25 (otro tipo).
     */
    @JsonProperty("description")
    private String description;

    /**
     * Receptor de la constancia (Receptor): nacional con RFC y código postal, o extranjero.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("recipient")
    private CreateRetentionParamsRecipient recipient;

    /**
     * Periodo (Periodo): mes inicial, mes final y año.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("period")
    private CreateRetentionParamsPeriod period;

    /**
     * Totales (Totales).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("totals")
    private CreateRetentionParamsTotals totals;

    /**
     * Impuestos del comprobante, por tipo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("taxes")
    private List<CreateRetentionParamsTax> taxes;

    /**
     * Complemento de dividendos.
     */
    @JsonProperty("dividends")
    private CreateRetentionParamsDividends dividends;

    /**
     * Complemento de intereses.
     */
    @JsonProperty("interest")
    private CreateRetentionParamsInterest interest;

    /**
     * Complemento de pagos a extranjeros.
     */
    @JsonProperty("foreign_payment")
    private CreateRetentionParamsForeignPayment foreignPayment;

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

    public CreateRetentionParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero…
     * <p>
     * Obligatorio.
     */
    public String getCode() {
        return code;
    }

    public CreateRetentionParams setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Descripción de la retención (DescRetenc); obligatoria con la clave 25 (otro tipo).
     */
    public String getDescription() {
        return description;
    }

    public CreateRetentionParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Receptor de la constancia (Receptor): nacional con RFC y código postal, o extranjero.
     * <p>
     * Obligatorio.
     */
    public CreateRetentionParamsRecipient getRecipient() {
        return recipient;
    }

    public CreateRetentionParams setRecipient(CreateRetentionParamsRecipient recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Periodo (Periodo): mes inicial, mes final y año.
     * <p>
     * Obligatorio.
     */
    public CreateRetentionParamsPeriod getPeriod() {
        return period;
    }

    public CreateRetentionParams setPeriod(CreateRetentionParamsPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Totales (Totales).
     * <p>
     * Obligatorio.
     */
    public CreateRetentionParamsTotals getTotals() {
        return totals;
    }

    public CreateRetentionParams setTotals(CreateRetentionParamsTotals totals) {
        this.totals = totals;
        return this;
    }

    /**
     * Impuestos del comprobante, por tipo.
     * <p>
     * Obligatorio.
     */
    public List<CreateRetentionParamsTax> getTaxes() {
        return taxes;
    }

    public CreateRetentionParams setTaxes(List<CreateRetentionParamsTax> taxes) {
        this.taxes = taxes;
        return this;
    }

    /**
     * Complemento de dividendos.
     */
    public CreateRetentionParamsDividends getDividends() {
        return dividends;
    }

    public CreateRetentionParams setDividends(CreateRetentionParamsDividends dividends) {
        this.dividends = dividends;
        return this;
    }

    /**
     * Complemento de intereses.
     */
    public CreateRetentionParamsInterest getInterest() {
        return interest;
    }

    public CreateRetentionParams setInterest(CreateRetentionParamsInterest interest) {
        this.interest = interest;
        return this;
    }

    /**
     * Complemento de pagos a extranjeros.
     */
    public CreateRetentionParamsForeignPayment getForeignPayment() {
        return foreignPayment;
    }

    public CreateRetentionParams setForeignPayment(CreateRetentionParamsForeignPayment foreignPayment) {
        this.foreignPayment = foreignPayment;
        return this;
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreateRetentionParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    public String getEmail() {
        return email;
    }

    public CreateRetentionParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreateRetentionParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
