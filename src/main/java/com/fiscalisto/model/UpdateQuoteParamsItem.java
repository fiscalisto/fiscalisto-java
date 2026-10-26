// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * UpdateQuoteParamsItem: Un concepto. description, product_key y unit_price son obligatorios, salvo que mande product (prd_…): entonces vienen de su catálogo y lo que mande encima gana.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateQuoteParamsItem {
    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    @JsonProperty("product")
    private String product;

    /**
     * Descripción del concepto (Descripcion), hasta 1,000 caracteres.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Clave de unidad (ClaveUnidad) de c_ClaveUnidad: E48 unidad de servicio (por omisión), H87 pieza, ACT actividad…
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Nombre de la unidad (Unidad), hasta 20 caracteres.
     */
    @JsonProperty("unit_name")
    private String unitName;

    /**
     * Número de identificación o SKU (NoIdentificacion).
     */
    @JsonProperty("sku")
    private String sku;

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;

    /**
     * Descuento (Descuento).
     */
    @JsonProperty("discount")
    private BigDecimal discount;

    /**
     * Objeto de impuesto (ObjetoImp), c_ObjetoImp: 01 no objeto, 02 sí objeto (por omisión), 03 sin desglose, 04 no causa…
     * <p>
     * Valores: 01, 02, 03, 04, 05, 06, 07, 08.
     */
    @JsonProperty("taxability")
    private String taxability;

    /**
     * Tasa de IVA trasladado: 0.16 (por omisión), 0.08 (región fronteriza), 0 o exento.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    @JsonProperty("iva")
    private String iva;

    /**
     * IEPS trasladado: tasa (0.265…) o cuota en pesos por unidad, según ieps_factor.
     */
    @JsonProperty("ieps")
    private BigDecimal ieps;

    /**
     * Tasa o Cuota (TipoFactor del IEPS).
     * <p>
     * Valores: Tasa, Cuota.
     */
    @JsonProperty("ieps_factor")
    private String iepsFactor;

    /**
     * Unidades de IEPS a cuota (litros, cigarros…), si no son la cantidad.
     */
    @JsonProperty("ieps_units")
    private BigDecimal iepsUnits;

    /**
     * Tasa de IVA retenido (por ejemplo 0.106667, dos terceras partes del 16%).
     */
    @JsonProperty("iva_retention")
    private BigDecimal ivaRetention;

    /**
     * Tasa de ISR retenido (por ejemplo 0.10 honorarios, 0.0125 RESICO).
     */
    @JsonProperty("isr_retention")
    private BigDecimal isrRetention;

    /**
     * Números de cuenta predial (CuentaPredial) en arrendamiento.
     */
    @JsonProperty("predial")
    private List<String> predial;

    /**
     * Números de pedimento (InformacionAduanera) de mercancía importada.
     */
    @JsonProperty("pedimentos")
    private List<String> pedimentos;

    /**
     * A cuenta de terceros (ACuentaTerceros): RFC, nombre, régimen y código postal.
     */
    @JsonProperty("third_party")
    private UpdateQuoteParamsItemThirdParty thirdParty;

    /**
     * Complemento de instituciones educativas privadas (IEDU): alumno, CURP, nivel y RVOE.
     */
    @JsonProperty("iedu")
    private UpdateQuoteParamsItemIedu iedu;

    /**
     * Complemento de vehículo usado.
     */
    @JsonProperty("used_vehicle")
    private UpdateQuoteParamsItemUsedVehicle usedVehicle;

    /**
     * Addenda del receptor (Walmart, Soriana…), con sus propios campos.
     */
    @JsonProperty("addenda")
    private Map<String, String> addenda;

    /**
     * Un producto de su catálogo (prd_…): toma su clave, unidad, precio e impuestos.
     */
    public String getProduct() {
        return product;
    }

    public UpdateQuoteParamsItem setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Descripción del concepto (Descripcion), hasta 1,000 caracteres.
     */
    public String getDescription() {
        return description;
    }

    public UpdateQuoteParamsItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     */
    public String getProductKey() {
        return productKey;
    }

    public UpdateQuoteParamsItem setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Clave de unidad (ClaveUnidad) de c_ClaveUnidad: E48 unidad de servicio (por omisión), H87 pieza, ACT actividad…
     */
    public String getUnitKey() {
        return unitKey;
    }

    public UpdateQuoteParamsItem setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Nombre de la unidad (Unidad), hasta 20 caracteres.
     */
    public String getUnitName() {
        return unitName;
    }

    public UpdateQuoteParamsItem setUnitName(String unitName) {
        this.unitName = unitName;
        return this;
    }

    /**
     * Número de identificación o SKU (NoIdentificacion).
     */
    public String getSku() {
        return sku;
    }

    public UpdateQuoteParamsItem setSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Cantidad (Cantidad). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public UpdateQuoteParamsItem setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public UpdateQuoteParamsItem setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public UpdateQuoteParamsItem setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    @JsonIgnore
    public UpdateQuoteParamsItem setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
    }

    /**
     * Descuento (Descuento).
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    public UpdateQuoteParamsItem setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    @JsonIgnore
    public UpdateQuoteParamsItem setDiscount(double discount) {
        return setDiscount(BigDecimal.valueOf(discount));
    }

    /**
     * Objeto de impuesto (ObjetoImp), c_ObjetoImp: 01 no objeto, 02 sí objeto (por omisión), 03 sin desglose, 04 no causa…
     * <p>
     * Valores: 01, 02, 03, 04, 05, 06, 07, 08.
     */
    public String getTaxability() {
        return taxability;
    }

    public UpdateQuoteParamsItem setTaxability(String taxability) {
        this.taxability = taxability;
        return this;
    }

    /**
     * Tasa de IVA trasladado: 0.16 (por omisión), 0.08 (región fronteriza), 0 o exento.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    public String getIva() {
        return iva;
    }

    public UpdateQuoteParamsItem setIva(String iva) {
        this.iva = iva;
        return this;
    }

    /**
     * IEPS trasladado: tasa (0.265…) o cuota en pesos por unidad, según ieps_factor.
     */
    public BigDecimal getIeps() {
        return ieps;
    }

    public UpdateQuoteParamsItem setIeps(BigDecimal ieps) {
        this.ieps = ieps;
        return this;
    }

    @JsonIgnore
    public UpdateQuoteParamsItem setIeps(double ieps) {
        return setIeps(BigDecimal.valueOf(ieps));
    }

    /**
     * Tasa o Cuota (TipoFactor del IEPS).
     * <p>
     * Valores: Tasa, Cuota.
     */
    public String getIepsFactor() {
        return iepsFactor;
    }

    public UpdateQuoteParamsItem setIepsFactor(String iepsFactor) {
        this.iepsFactor = iepsFactor;
        return this;
    }

    /**
     * Unidades de IEPS a cuota (litros, cigarros…), si no son la cantidad.
     */
    public BigDecimal getIepsUnits() {
        return iepsUnits;
    }

    public UpdateQuoteParamsItem setIepsUnits(BigDecimal iepsUnits) {
        this.iepsUnits = iepsUnits;
        return this;
    }

    @JsonIgnore
    public UpdateQuoteParamsItem setIepsUnits(double iepsUnits) {
        return setIepsUnits(BigDecimal.valueOf(iepsUnits));
    }

    /**
     * Tasa de IVA retenido (por ejemplo 0.106667, dos terceras partes del 16%).
     */
    public BigDecimal getIvaRetention() {
        return ivaRetention;
    }

    public UpdateQuoteParamsItem setIvaRetention(BigDecimal ivaRetention) {
        this.ivaRetention = ivaRetention;
        return this;
    }

    @JsonIgnore
    public UpdateQuoteParamsItem setIvaRetention(double ivaRetention) {
        return setIvaRetention(BigDecimal.valueOf(ivaRetention));
    }

    /**
     * Tasa de ISR retenido (por ejemplo 0.10 honorarios, 0.0125 RESICO).
     */
    public BigDecimal getIsrRetention() {
        return isrRetention;
    }

    public UpdateQuoteParamsItem setIsrRetention(BigDecimal isrRetention) {
        this.isrRetention = isrRetention;
        return this;
    }

    @JsonIgnore
    public UpdateQuoteParamsItem setIsrRetention(double isrRetention) {
        return setIsrRetention(BigDecimal.valueOf(isrRetention));
    }

    /**
     * Números de cuenta predial (CuentaPredial) en arrendamiento.
     */
    public List<String> getPredial() {
        return predial;
    }

    public UpdateQuoteParamsItem setPredial(List<String> predial) {
        this.predial = predial;
        return this;
    }

    /**
     * Números de pedimento (InformacionAduanera) de mercancía importada.
     */
    public List<String> getPedimentos() {
        return pedimentos;
    }

    public UpdateQuoteParamsItem setPedimentos(List<String> pedimentos) {
        this.pedimentos = pedimentos;
        return this;
    }

    /**
     * A cuenta de terceros (ACuentaTerceros): RFC, nombre, régimen y código postal.
     */
    public UpdateQuoteParamsItemThirdParty getThirdParty() {
        return thirdParty;
    }

    public UpdateQuoteParamsItem setThirdParty(UpdateQuoteParamsItemThirdParty thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }

    /**
     * Complemento de instituciones educativas privadas (IEDU): alumno, CURP, nivel y RVOE.
     */
    public UpdateQuoteParamsItemIedu getIedu() {
        return iedu;
    }

    public UpdateQuoteParamsItem setIedu(UpdateQuoteParamsItemIedu iedu) {
        this.iedu = iedu;
        return this;
    }

    /**
     * Complemento de vehículo usado.
     */
    public UpdateQuoteParamsItemUsedVehicle getUsedVehicle() {
        return usedVehicle;
    }

    public UpdateQuoteParamsItem setUsedVehicle(UpdateQuoteParamsItemUsedVehicle usedVehicle) {
        this.usedVehicle = usedVehicle;
        return this;
    }

    /**
     * Addenda del receptor (Walmart, Soriana…), con sus propios campos.
     */
    public Map<String, String> getAddenda() {
        return addenda;
    }

    public UpdateQuoteParamsItem setAddenda(Map<String, String> addenda) {
        this.addenda = addenda;
        return this;
    }
}
