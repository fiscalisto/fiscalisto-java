// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Product: Un producto o servicio del catálogo de un emisor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
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
     * Cuándo cambió por última vez, ISO 8601 (-06:00).
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
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

    public Product setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
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

    public Product setIsrRetention(double isrRetention) {
        return setIsrRetention(BigDecimal.valueOf(isrRetention));
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
