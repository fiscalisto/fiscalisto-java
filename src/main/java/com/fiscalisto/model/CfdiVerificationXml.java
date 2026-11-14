// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CfdiVerificationXml: CfdiVerificationXml.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CfdiVerificationXml {
    /**
     * La versión del CFDI (4.0 o 3.3).
     */
    @JsonProperty("version")
    private String version;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     */
    @JsonProperty("type")
    private String type;

    /**
     * La fecha de emisión (Fecha), como viene en el XML.
     */
    @JsonProperty("issued_at")
    private String issuedAt;

    /**
     * La fecha de timbrado (FechaTimbrado), como viene en el XML.
     */
    @JsonProperty("stamped_at")
    private String stampedAt;

    /**
     * El nombre del emisor en el XML.
     */
    @JsonProperty("issuer_name")
    private String issuerName;

    /**
     * El nombre del receptor en el XML.
     */
    @JsonProperty("receiver_name")
    private String receiverName;

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * La versión del CFDI (4.0 o 3.3).
     */
    public String getVersion() {
        return version;
    }

    public CfdiVerificationXml setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     */
    public String getType() {
        return type;
    }

    public CfdiVerificationXml setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * La fecha de emisión (Fecha), como viene en el XML.
     */
    public String getIssuedAt() {
        return issuedAt;
    }

    public CfdiVerificationXml setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    /**
     * La fecha de timbrado (FechaTimbrado), como viene en el XML.
     */
    public String getStampedAt() {
        return stampedAt;
    }

    public CfdiVerificationXml setStampedAt(String stampedAt) {
        this.stampedAt = stampedAt;
        return this;
    }

    /**
     * El nombre del emisor en el XML.
     */
    public String getIssuerName() {
        return issuerName;
    }

    public CfdiVerificationXml setIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    /**
     * El nombre del receptor en el XML.
     */
    public String getReceiverName() {
        return receiverName;
    }

    public CfdiVerificationXml setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public CfdiVerificationXml setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
}
