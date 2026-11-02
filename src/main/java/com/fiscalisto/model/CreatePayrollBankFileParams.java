// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreatePayrollBankFileParams: los campos de «Archivo para pagar la nómina en el banco».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollBankFileParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La fecha de pago de los recibos (FechaPago): se pagan los recibos de nómina timbrados con esa fecha, sumados por empleado. También es el día en que el banco aplica el archivo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * El formato del banco: bbva (Net Cash), banamex (BancaNet, layout D), banorte (Banorte en su Empresa), santander (Enlace, solo cuentas Santander) o spei (CSV para cualquier banco). Por omisión, el del banco de account.
     * <p>
     * Valores: bbva, banamex, banorte, santander, spei.
     */
    @JsonProperty("layout")
    private String layout;

    /**
     * La CLABE de la cuenta de cargo del emisor. Por omisión, la que se usó la última vez en la app, o su primera cuenta bancaria.
     */
    @JsonProperty("account")
    private String account;

    /**
     * El archivo del día (1 a 99): un segundo archivo el mismo día lleva otro número. Por omisión 1.
     */
    @JsonProperty("sequence")
    private Long sequence;

    /**
     * Banamex: su número de cliente de BancaNet (12 dígitos).
     */
    @JsonProperty("client_number")
    private String clientNumber;

    /**
     * Banorte: su número de emisora (5 dígitos).
     */
    @JsonProperty("issuer_number")
    private String issuerNumber;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePayrollBankFileParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La fecha de pago de los recibos (FechaPago): se pagan los recibos de nómina timbrados con esa fecha, sumados por empleado. También es el día en que el banco aplica el archivo.
     * <p>
     * Obligatorio.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public CreatePayrollBankFileParams setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * El formato del banco: bbva (Net Cash), banamex (BancaNet, layout D), banorte (Banorte en su Empresa), santander (Enlace, solo cuentas Santander) o spei (CSV para cualquier banco). Por omisión, el del banco de account.
     * <p>
     * Valores: bbva, banamex, banorte, santander, spei.
     */
    public String getLayout() {
        return layout;
    }

    public CreatePayrollBankFileParams setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    /**
     * La CLABE de la cuenta de cargo del emisor. Por omisión, la que se usó la última vez en la app, o su primera cuenta bancaria.
     */
    public String getAccount() {
        return account;
    }

    public CreatePayrollBankFileParams setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El archivo del día (1 a 99): un segundo archivo el mismo día lleva otro número. Por omisión 1.
     */
    public Long getSequence() {
        return sequence;
    }

    public CreatePayrollBankFileParams setSequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }

    @JsonIgnore
    public CreatePayrollBankFileParams setSequence(long sequence) {
        return setSequence(Long.valueOf(sequence));
    }

    /**
     * Banamex: su número de cliente de BancaNet (12 dígitos).
     */
    public String getClientNumber() {
        return clientNumber;
    }

    public CreatePayrollBankFileParams setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
        return this;
    }

    /**
     * Banorte: su número de emisora (5 dígitos).
     */
    public String getIssuerNumber() {
        return issuerNumber;
    }

    public CreatePayrollBankFileParams setIssuerNumber(String issuerNumber) {
        this.issuerNumber = issuerNumber;
        return this;
    }
}
