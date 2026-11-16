// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoiceCreateComercioExterior: Complemento de comercio exterior 2.0.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateComercioExterior {
    /**
     * Motivo de traslado (MotivoTraslado), c_MotivoTraslado, solo en un traslado: 01 mercancías facturadas con anterioridad (relacione la factura de venta en related), 02 reubicación de mercancías propias, 03 consignación, 04 para posterior enajenación, 05 propiedad de terceros (con owners), 99 otros.
     * <p>
     * Valores: 99, 01, 02, 03, 04, 05.
     */
    @JsonProperty("motive")
    private String motive;

    /**
     * Propietarios de la mercancía si no es el emisor (Propietario), con motive 05.
     */
    @JsonProperty("owners")
    private List<InvoiceCreateComercioExteriorOwner> owners;

    /**
     * Incoterm (Incoterm), c_INCOTERM: EXW, FOB, CIF, DAP, DDP…
     */
    @JsonProperty("incoterm")
    private String incoterm;

    /**
     * Número de certificado de origen (NumCertificadoOrigen).
     */
    @JsonProperty("certificate")
    private String certificate;

    /**
     * Tipo de cambio a dólares (TipoCambioUSD).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("usd_rate")
    private BigDecimal usdRate;

    /**
     * CURP del emisor persona física (Emisor Curp).
     */
    @JsonProperty("issuer_curp")
    private String issuerCurp;

    /**
     * Domicilio del emisor (Emisor Domicilio): calle y números; lo demás sale de su código postal.
     */
    @JsonProperty("issuer_address")
    private InvoiceCreateComercioExteriorIssuerAddress issuerAddress;

    /**
     * Domicilio del receptor en el extranjero (Receptor Domicilio).
     */
    @JsonProperty("receiver_address")
    private InvoiceCreateComercioExteriorReceiverAddress receiverAddress;

    /**
     * Destinatario, si no es el receptor (Destinatario).
     */
    @JsonProperty("recipient")
    private InvoiceCreateComercioExteriorRecipient recipient;

    /**
     * Mercancías (Mercancia), una por concepto exportado.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("goods")
    private List<InvoiceCreateComercioExteriorGood> goods;

    /**
     * Observaciones del complemento (Observaciones).
     */
    @JsonProperty("notes")
    private String notes;

    /**
     * Motivo de traslado (MotivoTraslado), c_MotivoTraslado, solo en un traslado: 01 mercancías facturadas con anterioridad (relacione la factura de venta en related), 02 reubicación de mercancías propias, 03 consignación, 04 para posterior enajenación, 05 propiedad de terceros (con owners), 99 otros.
     * <p>
     * Valores: 99, 01, 02, 03, 04, 05.
     */
    public String getMotive() {
        return motive;
    }

    public InvoiceCreateComercioExterior setMotive(String motive) {
        this.motive = motive;
        return this;
    }

    /**
     * Propietarios de la mercancía si no es el emisor (Propietario), con motive 05.
     */
    public List<InvoiceCreateComercioExteriorOwner> getOwners() {
        return owners;
    }

    public InvoiceCreateComercioExterior setOwners(List<InvoiceCreateComercioExteriorOwner> owners) {
        this.owners = owners;
        return this;
    }

    /**
     * Incoterm (Incoterm), c_INCOTERM: EXW, FOB, CIF, DAP, DDP…
     */
    public String getIncoterm() {
        return incoterm;
    }

    public InvoiceCreateComercioExterior setIncoterm(String incoterm) {
        this.incoterm = incoterm;
        return this;
    }

    /**
     * Número de certificado de origen (NumCertificadoOrigen).
     */
    public String getCertificate() {
        return certificate;
    }

    public InvoiceCreateComercioExterior setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Tipo de cambio a dólares (TipoCambioUSD).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getUsdRate() {
        return usdRate;
    }

    public InvoiceCreateComercioExterior setUsdRate(BigDecimal usdRate) {
        this.usdRate = usdRate;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateComercioExterior setUsdRate(double usdRate) {
        return setUsdRate(BigDecimal.valueOf(usdRate));
    }

    /**
     * CURP del emisor persona física (Emisor Curp).
     */
    public String getIssuerCurp() {
        return issuerCurp;
    }

    public InvoiceCreateComercioExterior setIssuerCurp(String issuerCurp) {
        this.issuerCurp = issuerCurp;
        return this;
    }

    /**
     * Domicilio del emisor (Emisor Domicilio): calle y números; lo demás sale de su código postal.
     */
    public InvoiceCreateComercioExteriorIssuerAddress getIssuerAddress() {
        return issuerAddress;
    }

    public InvoiceCreateComercioExterior setIssuerAddress(InvoiceCreateComercioExteriorIssuerAddress issuerAddress) {
        this.issuerAddress = issuerAddress;
        return this;
    }

    /**
     * Domicilio del receptor en el extranjero (Receptor Domicilio).
     */
    public InvoiceCreateComercioExteriorReceiverAddress getReceiverAddress() {
        return receiverAddress;
    }

    public InvoiceCreateComercioExterior setReceiverAddress(InvoiceCreateComercioExteriorReceiverAddress receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }

    /**
     * Destinatario, si no es el receptor (Destinatario).
     */
    public InvoiceCreateComercioExteriorRecipient getRecipient() {
        return recipient;
    }

    public InvoiceCreateComercioExterior setRecipient(InvoiceCreateComercioExteriorRecipient recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Mercancías (Mercancia), una por concepto exportado.
     * <p>
     * Obligatorio.
     */
    public List<InvoiceCreateComercioExteriorGood> getGoods() {
        return goods;
    }

    public InvoiceCreateComercioExterior setGoods(List<InvoiceCreateComercioExteriorGood> goods) {
        this.goods = goods;
        return this;
    }

    /**
     * Observaciones del complemento (Observaciones).
     */
    public String getNotes() {
        return notes;
    }

    public InvoiceCreateComercioExterior setNotes(String notes) {
        this.notes = notes;
        return this;
    }
}
