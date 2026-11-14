// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * VerifyCfdiParams: los campos de «Verificar un CFDI en el SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VerifyCfdiParams {
    /**
     * El XML del CFDI, como texto. Se leen de él el UUID, los dos RFC y el total. Hasta 4 millones de caracteres.
     */
    @JsonProperty("xml")
    private String xml;

    /**
     * El texto del QR del PDF (https://verificacfdi.facturaelectronica.sat.gob.mx/default.aspx?id=…&amp;re=…&amp;rr=…&amp;tt=…&amp;fe=…), si no tiene el XML.
     */
    @JsonProperty("qr")
    private String qr;

    /**
     * El folio fiscal, sin XML ni QR. Va con issuer_tax_id, receiver_tax_id y total.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El RFC del emisor, sin XML ni QR.
     */
    @JsonProperty("issuer_tax_id")
    private String issuerTaxId;

    /**
     * El RFC del receptor, sin XML ni QR.
     */
    @JsonProperty("receiver_tax_id")
    private String receiverTaxId;

    /**
     * El total del comprobante, sin XML ni QR. El SAT lo compara como número.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * El XML del CFDI, como texto. Se leen de él el UUID, los dos RFC y el total. Hasta 4 millones de caracteres.
     */
    public String getXml() {
        return xml;
    }

    public VerifyCfdiParams setXml(String xml) {
        this.xml = xml;
        return this;
    }

    /**
     * El texto del QR del PDF (https://verificacfdi.facturaelectronica.sat.gob.mx/default.aspx?id=…&amp;re=…&amp;rr=…&amp;tt=…&amp;fe=…), si no tiene el XML.
     */
    public String getQr() {
        return qr;
    }

    public VerifyCfdiParams setQr(String qr) {
        this.qr = qr;
        return this;
    }

    /**
     * El folio fiscal, sin XML ni QR. Va con issuer_tax_id, receiver_tax_id y total.
     */
    public String getUuid() {
        return uuid;
    }

    public VerifyCfdiParams setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * El RFC del emisor, sin XML ni QR.
     */
    public String getIssuerTaxId() {
        return issuerTaxId;
    }

    public VerifyCfdiParams setIssuerTaxId(String issuerTaxId) {
        this.issuerTaxId = issuerTaxId;
        return this;
    }

    /**
     * El RFC del receptor, sin XML ni QR.
     */
    public String getReceiverTaxId() {
        return receiverTaxId;
    }

    public VerifyCfdiParams setReceiverTaxId(String receiverTaxId) {
        this.receiverTaxId = receiverTaxId;
        return this;
    }

    /**
     * El total del comprobante, sin XML ni QR. El SAT lo compara como número.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public VerifyCfdiParams setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public VerifyCfdiParams setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
