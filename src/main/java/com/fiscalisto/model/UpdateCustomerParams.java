// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateCustomerParams: los campos de «Actualizar un cliente».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateCustomerParams {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    @JsonProperty("legal_name")
    private String legalName;

    /**
     * Régimen fiscal (RegimenFiscal), clave de c_RegimenFiscal: 601, 612, 626…
     */
    @JsonProperty("tax_system")
    private String taxSystem;

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Correo del cliente (varios separados por comas), a donde van sus facturas con send_email.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    @JsonProperty("use")
    private String use;

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    @JsonProperty("foreign")
    private UpdateCustomerParamsForeign foreign;

    /**
     * Su grupo de clientes (cgr_…), o null para ninguno.
     */
    @JsonProperty("group")
    private String group;

    /**
     * Su propia lista de precios (prl_…), que gana sobre la de su grupo; null: la de su grupo o la de todos.
     */
    @JsonProperty("price_list")
    private String priceList;

    /**
     * Su propio descuento en cada concepto, en %; null: el de su grupo.
     */
    @JsonProperty("discount_percent")
    private BigDecimal discountPercent;

    /**
     * true si el cliente es contribuyente de IEPS: el IEPS va desglosado en vez de sumado al precio.
     */
    @JsonProperty("ieps_taxpayer")
    private Boolean iepsTaxpayer;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public UpdateCustomerParams setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    public String getLegalName() {
        return legalName;
    }

    public UpdateCustomerParams setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Régimen fiscal (RegimenFiscal), clave de c_RegimenFiscal: 601, 612, 626…
     */
    public String getTaxSystem() {
        return taxSystem;
    }

    public UpdateCustomerParams setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
        return this;
    }

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     */
    public String getZip() {
        return zip;
    }

    public UpdateCustomerParams setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Correo del cliente (varios separados por comas), a donde van sus facturas con send_email.
     */
    public String getEmail() {
        return email;
    }

    public UpdateCustomerParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    public String getUse() {
        return use;
    }

    public UpdateCustomerParams setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    public UpdateCustomerParamsForeign getForeign() {
        return foreign;
    }

    public UpdateCustomerParams setForeign(UpdateCustomerParamsForeign foreign) {
        this.foreign = foreign;
        return this;
    }

    /**
     * Su grupo de clientes (cgr_…), o null para ninguno.
     */
    public String getGroup() {
        return group;
    }

    public UpdateCustomerParams setGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Su propia lista de precios (prl_…), que gana sobre la de su grupo; null: la de su grupo o la de todos.
     */
    public String getPriceList() {
        return priceList;
    }

    public UpdateCustomerParams setPriceList(String priceList) {
        this.priceList = priceList;
        return this;
    }

    /**
     * Su propio descuento en cada concepto, en %; null: el de su grupo.
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public UpdateCustomerParams setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    @JsonIgnore
    public UpdateCustomerParams setDiscountPercent(double discountPercent) {
        return setDiscountPercent(BigDecimal.valueOf(discountPercent));
    }

    /**
     * true si el cliente es contribuyente de IEPS: el IEPS va desglosado en vez de sumado al precio.
     */
    public Boolean getIepsTaxpayer() {
        return iepsTaxpayer;
    }

    public UpdateCustomerParams setIepsTaxpayer(Boolean iepsTaxpayer) {
        this.iepsTaxpayer = iepsTaxpayer;
        return this;
    }
}
