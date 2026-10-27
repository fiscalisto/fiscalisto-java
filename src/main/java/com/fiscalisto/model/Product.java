// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Product: Un producto o servicio del catálogo de un emisor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Nombre corto para encontrarlo, solo para usted.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Descripción que va en el CFDI (Descripcion).
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
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;

    /**
     * Precio abierto: el producto no tiene precio fijo y cada concepto con él manda su unit_price.
     */
    @JsonProperty("open_price")
    private Boolean openPrice;

    /**
     * Objeto de impuesto (ObjetoImp), c_ObjetoImp: 01 no objeto, 02 sí objeto (por omisión), 03 sin desglose, 04 no causa…
     */
    @JsonProperty("taxability")
    private String taxability;

    /**
     * Tasa de IVA trasladado: 0.16 (por omisión), 0.08 (región fronteriza), 0 o exento.
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
     */
    @JsonProperty("ieps_factor")
    private String iepsFactor;

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
     * Impuestos locales (complemento implocal): traslados y retenciones estatales.
     */
    @JsonProperty("local_taxes")
    private List<ProductLocalTax> localTaxes;

    /**
     * true si lleva existencias (Inventario).
     */
    @JsonProperty("track_stock")
    private Boolean trackStock;

    /**
     * Su costo por unidad en pesos sin IVA, o null.
     */
    @JsonProperty("cost")
    private BigDecimal cost;

    /**
     * Su código de barras, o null.
     */
    @JsonProperty("barcode")
    private String barcode;

    /**
     * Su existencia mínima, o null.
     */
    @JsonProperty("min_stock")
    private BigDecimal minStock;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo cambió por última vez, ISO 8601 (-06:00).
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Product setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Product setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Product setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public Product setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre corto para encontrarlo, solo para usted.
     */
    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Descripción que va en el CFDI (Descripcion).
     */
    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     */
    public String getProductKey() {
        return productKey;
    }

    public Product setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Clave de unidad (ClaveUnidad) de c_ClaveUnidad: E48 unidad de servicio (por omisión), H87 pieza, ACT actividad…
     */
    public String getUnitKey() {
        return unitKey;
    }

    public Product setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Nombre de la unidad (Unidad), hasta 20 caracteres.
     */
    public String getUnitName() {
        return unitName;
    }

    public Product setUnitName(String unitName) {
        this.unitName = unitName;
        return this;
    }

    /**
     * Número de identificación o SKU (NoIdentificacion).
     */
    public String getSku() {
        return sku;
    }

    public Product setSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public Product setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    @JsonIgnore
    public Product setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
    }

    /**
     * Precio abierto: el producto no tiene precio fijo y cada concepto con él manda su unit_price.
     */
    public Boolean getOpenPrice() {
        return openPrice;
    }

    public Product setOpenPrice(Boolean openPrice) {
        this.openPrice = openPrice;
        return this;
    }

    /**
     * Objeto de impuesto (ObjetoImp), c_ObjetoImp: 01 no objeto, 02 sí objeto (por omisión), 03 sin desglose, 04 no causa…
     */
    public String getTaxability() {
        return taxability;
    }

    public Product setTaxability(String taxability) {
        this.taxability = taxability;
        return this;
    }

    /**
     * Tasa de IVA trasladado: 0.16 (por omisión), 0.08 (región fronteriza), 0 o exento.
     */
    public String getIva() {
        return iva;
    }

    public Product setIva(String iva) {
        this.iva = iva;
        return this;
    }

    /**
     * IEPS trasladado: tasa (0.265…) o cuota en pesos por unidad, según ieps_factor.
     */
    public BigDecimal getIeps() {
        return ieps;
    }

    public Product setIeps(BigDecimal ieps) {
        this.ieps = ieps;
        return this;
    }

    @JsonIgnore
    public Product setIeps(double ieps) {
        return setIeps(BigDecimal.valueOf(ieps));
    }

    /**
     * Tasa o Cuota (TipoFactor del IEPS).
     */
    public String getIepsFactor() {
        return iepsFactor;
    }

    public Product setIepsFactor(String iepsFactor) {
        this.iepsFactor = iepsFactor;
        return this;
    }

    /**
     * Tasa de IVA retenido (por ejemplo 0.106667, dos terceras partes del 16%).
     */
    public BigDecimal getIvaRetention() {
        return ivaRetention;
    }

    public Product setIvaRetention(BigDecimal ivaRetention) {
        this.ivaRetention = ivaRetention;
        return this;
    }

    @JsonIgnore
    public Product setIvaRetention(double ivaRetention) {
        return setIvaRetention(BigDecimal.valueOf(ivaRetention));
    }

    /**
     * Tasa de ISR retenido (por ejemplo 0.10 honorarios, 0.0125 RESICO).
     */
    public BigDecimal getIsrRetention() {
        return isrRetention;
    }

    public Product setIsrRetention(BigDecimal isrRetention) {
        this.isrRetention = isrRetention;
        return this;
    }

    @JsonIgnore
    public Product setIsrRetention(double isrRetention) {
        return setIsrRetention(BigDecimal.valueOf(isrRetention));
    }

    /**
     * Impuestos locales (complemento implocal): traslados y retenciones estatales.
     */
    public List<ProductLocalTax> getLocalTaxes() {
        return localTaxes;
    }

    public Product setLocalTaxes(List<ProductLocalTax> localTaxes) {
        this.localTaxes = localTaxes;
        return this;
    }

    /**
     * true si lleva existencias (Inventario).
     */
    public Boolean getTrackStock() {
        return trackStock;
    }

    public Product setTrackStock(Boolean trackStock) {
        this.trackStock = trackStock;
        return this;
    }

    /**
     * Su costo por unidad en pesos sin IVA, o null.
     */
    public BigDecimal getCost() {
        return cost;
    }

    public Product setCost(BigDecimal cost) {
        this.cost = cost;
        return this;
    }

    @JsonIgnore
    public Product setCost(double cost) {
        return setCost(BigDecimal.valueOf(cost));
    }

    /**
     * Su código de barras, o null.
     */
    public String getBarcode() {
        return barcode;
    }

    public Product setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    /**
     * Su existencia mínima, o null.
     */
    public BigDecimal getMinStock() {
        return minStock;
    }

    public Product setMinStock(BigDecimal minStock) {
        this.minStock = minStock;
        return this;
    }

    @JsonIgnore
    public Product setMinStock(double minStock) {
        return setMinStock(BigDecimal.valueOf(minStock));
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Product setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo cambió por última vez, ISO 8601 (-06:00).
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public Product setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
