// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdateInvoiceParamsComercioExterior: Complemento de comercio exterior 2.0.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsComercioExterior {
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
    private List<UpdateInvoiceParamsComercioExteriorOwner> owners;

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
    private UpdateInvoiceParamsComercioExteriorIssuerAddress issuerAddress;

    /**
     * Domicilio del receptor en el extranjero (Receptor Domicilio).
     */
    @JsonProperty("receiver_address")
    private UpdateInvoiceParamsComercioExteriorReceiverAddress receiverAddress;

    /**
     * Destinatario, si no es el receptor (Destinatario).
     */
    @JsonProperty("recipient")
    private UpdateInvoiceParamsComercioExteriorRecipient recipient;

    /**
     * Mercancías (Mercancia), una por concepto exportado.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("goods")
    private List<UpdateInvoiceParamsComercioExteriorGood> goods;

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

    public UpdateInvoiceParamsComercioExterior setMotive(String motive) {
        this.motive = motive;
        return this;
    }

    /**
     * Propietarios de la mercancía si no es el emisor (Propietario), con motive 05.
     */
    public List<UpdateInvoiceParamsComercioExteriorOwner> getOwners() {
        return owners;
    }

    public UpdateInvoiceParamsComercioExterior setOwners(List<UpdateInvoiceParamsComercioExteriorOwner> owners) {
        this.owners = owners;
        return this;
    }

    /**
     * Incoterm (Incoterm), c_INCOTERM: EXW, FOB, CIF, DAP, DDP…
     */
    public String getIncoterm() {
        return incoterm;
    }

    public UpdateInvoiceParamsComercioExterior setIncoterm(String incoterm) {
        this.incoterm = incoterm;
        return this;
    }

    /**
     * Número de certificado de origen (NumCertificadoOrigen).
     */
    public String getCertificate() {
        return certificate;
    }

    public UpdateInvoiceParamsComercioExterior setCertificate(String certificate) {
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

    public UpdateInvoiceParamsComercioExterior setUsdRate(BigDecimal usdRate) {
        this.usdRate = usdRate;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsComercioExterior setUsdRate(double usdRate) {
        return setUsdRate(BigDecimal.valueOf(usdRate));
    }

    /**
     * CURP del emisor persona física (Emisor Curp).
     */
    public String getIssuerCurp() {
        return issuerCurp;
    }

    public UpdateInvoiceParamsComercioExterior setIssuerCurp(String issuerCurp) {
        this.issuerCurp = issuerCurp;
        return this;
    }

    /**
     * Domicilio del emisor (Emisor Domicilio): calle y números; lo demás sale de su código postal.
     */
    public UpdateInvoiceParamsComercioExteriorIssuerAddress getIssuerAddress() {
        return issuerAddress;
    }

    public UpdateInvoiceParamsComercioExterior setIssuerAddress(UpdateInvoiceParamsComercioExteriorIssuerAddress issuerAddress) {
        this.issuerAddress = issuerAddress;
        return this;
    }

    /**
     * Domicilio del receptor en el extranjero (Receptor Domicilio).
     */
    public UpdateInvoiceParamsComercioExteriorReceiverAddress getReceiverAddress() {
        return receiverAddress;
    }

    public UpdateInvoiceParamsComercioExterior setReceiverAddress(UpdateInvoiceParamsComercioExteriorReceiverAddress receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }

    /**
     * Destinatario, si no es el receptor (Destinatario).
     */
    public UpdateInvoiceParamsComercioExteriorRecipient getRecipient() {
        return recipient;
    }

    public UpdateInvoiceParamsComercioExterior setRecipient(UpdateInvoiceParamsComercioExteriorRecipient recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Mercancías (Mercancia), una por concepto exportado.
     * <p>
     * Obligatorio.
     */
    public List<UpdateInvoiceParamsComercioExteriorGood> getGoods() {
        return goods;
    }

    public UpdateInvoiceParamsComercioExterior setGoods(List<UpdateInvoiceParamsComercioExteriorGood> goods) {
        this.goods = goods;
        return this;
    }

    /**
     * Observaciones del complemento (Observaciones).
     */
    public String getNotes() {
        return notes;
    }

    public UpdateInvoiceParamsComercioExterior setNotes(String notes) {
        this.notes = notes;
        return this;
    }
}
