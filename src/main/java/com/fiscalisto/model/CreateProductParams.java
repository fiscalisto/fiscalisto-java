// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateProductParams: los campos de «Crear un producto».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateProductParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Nombre corto para encontrarlo, solo para usted; en el CFDI va description.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Descripción.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     * <p>
     * Obligatorio.
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
     * Precio abierto: sin precio fijo (una noche de hotel que cambia cada día); cada factura manda su unit_price.
     */
    @JsonProperty("open_price")
    private Boolean openPrice;

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
     * Impuestos locales que lleva, como el ISH 3% de hospedaje: van en cada factura con él, sobre sus conceptos.
     */
    @JsonProperty("local_taxes")
    private List<CreateProductParamsLocalTax> localTaxes;

    /**
     * Lleva existencias (Inventario): cada factura que lo vende las saca del almacén de su sucursal, y una cancelada las regresa. Ver GET /v1/products/{id}/stock.
     */
    @JsonProperty("track_stock")
    private Boolean trackStock;

    /**
     * Su costo por unidad en pesos sin IVA, hasta que sus compras den otro: vale las existencias que entran sin unit_cost.
     */
    @JsonProperty("cost")
    private BigDecimal cost;

    /**
     * Código de barras (EAN, UPC o el suyo). Una factura cuyo concepto lo trae como NoIdentificacion saca existencias de este producto.
     */
    @JsonProperty("barcode")
    private String barcode;

    /**
     * Existencia mínima: por debajo, el aviso de existencias bajas lo incluye.
     */
    @JsonProperty("min_stock")
    private BigDecimal minStock;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateProductParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre corto para encontrarlo, solo para usted; en el CFDI va description.
     */
    public String getName() {
        return name;
    }

    public CreateProductParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Descripción.
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public CreateProductParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Clave del producto o servicio (ClaveProdServ), 8 dígitos de c_ClaveProdServ. Búsquela con GET /v1/sat_catalogs/product_keys?q=…
     * <p>
     * Obligatorio.
     */
    public String getProductKey() {
        return productKey;
    }

    public CreateProductParams setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Clave de unidad (ClaveUnidad) de c_ClaveUnidad: E48 unidad de servicio (por omisión), H87 pieza, ACT actividad…
     */
    public String getUnitKey() {
        return unitKey;
    }

    public CreateProductParams setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Nombre de la unidad (Unidad), hasta 20 caracteres.
     */
    public String getUnitName() {
        return unitName;
    }

    public CreateProductParams setUnitName(String unitName) {
        this.unitName = unitName;
        return this;
    }

    /**
     * Número de identificación o SKU (NoIdentificacion).
     */
    public String getSku() {
        return sku;
    }

    public CreateProductParams setSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Precio unitario antes de impuestos (ValorUnitario).
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public CreateProductParams setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    @JsonIgnore
    public CreateProductParams setUnitPrice(double unitPrice) {
        return setUnitPrice(BigDecimal.valueOf(unitPrice));
    }

    /**
     * Precio abierto: sin precio fijo (una noche de hotel que cambia cada día); cada factura manda su unit_price.
     */
    public Boolean getOpenPrice() {
        return openPrice;
    }

    public CreateProductParams setOpenPrice(Boolean openPrice) {
        this.openPrice = openPrice;
        return this;
    }

    /**
     * Objeto de impuesto (ObjetoImp), c_ObjetoImp: 01 no objeto, 02 sí objeto (por omisión), 03 sin desglose, 04 no causa…
     * <p>
     * Valores: 01, 02, 03, 04, 05, 06, 07, 08.
     */
    public String getTaxability() {
        return taxability;
    }

    public CreateProductParams setTaxability(String taxability) {
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

    public CreateProductParams setIva(String iva) {
        this.iva = iva;
        return this;
    }

    /**
     * IEPS trasladado: tasa (0.265…) o cuota en pesos por unidad, según ieps_factor.
     */
    public BigDecimal getIeps() {
        return ieps;
    }

    public CreateProductParams setIeps(BigDecimal ieps) {
        this.ieps = ieps;
        return this;
    }

    @JsonIgnore
    public CreateProductParams setIeps(double ieps) {
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

    public CreateProductParams setIepsFactor(String iepsFactor) {
        this.iepsFactor = iepsFactor;
        return this;
    }

    /**
     * Tasa de IVA retenido (por ejemplo 0.106667, dos terceras partes del 16%).
     */
    public BigDecimal getIvaRetention() {
        return ivaRetention;
    }

    public CreateProductParams setIvaRetention(BigDecimal ivaRetention) {
        this.ivaRetention = ivaRetention;
        return this;
    }

    @JsonIgnore
    public CreateProductParams setIvaRetention(double ivaRetention) {
        return setIvaRetention(BigDecimal.valueOf(ivaRetention));
    }

    /**
     * Tasa de ISR retenido (por ejemplo 0.10 honorarios, 0.0125 RESICO).
     */
    public BigDecimal getIsrRetention() {
        return isrRetention;
    }

    public CreateProductParams setIsrRetention(BigDecimal isrRetention) {
        this.isrRetention = isrRetention;
        return this;
    }

    @JsonIgnore
    public CreateProductParams setIsrRetention(double isrRetention) {
        return setIsrRetention(BigDecimal.valueOf(isrRetention));
    }

    /**
     * Impuestos locales que lleva, como el ISH 3% de hospedaje: van en cada factura con él, sobre sus conceptos.
     */
    public List<CreateProductParamsLocalTax> getLocalTaxes() {
        return localTaxes;
    }

    public CreateProductParams setLocalTaxes(List<CreateProductParamsLocalTax> localTaxes) {
        this.localTaxes = localTaxes;
        return this;
    }

    /**
     * Lleva existencias (Inventario): cada factura que lo vende las saca del almacén de su sucursal, y una cancelada las regresa. Ver GET /v1/products/{id}/stock.
     */
    public Boolean getTrackStock() {
        return trackStock;
    }

    public CreateProductParams setTrackStock(Boolean trackStock) {
        this.trackStock = trackStock;
        return this;
    }

    /**
     * Su costo por unidad en pesos sin IVA, hasta que sus compras den otro: vale las existencias que entran sin unit_cost.
     */
    public BigDecimal getCost() {
        return cost;
    }

    public CreateProductParams setCost(BigDecimal cost) {
        this.cost = cost;
        return this;
    }

    @JsonIgnore
    public CreateProductParams setCost(double cost) {
        return setCost(BigDecimal.valueOf(cost));
    }

    /**
     * Código de barras (EAN, UPC o el suyo). Una factura cuyo concepto lo trae como NoIdentificacion saca existencias de este producto.
     */
    public String getBarcode() {
        return barcode;
    }

    public CreateProductParams setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    /**
     * Existencia mínima: por debajo, el aviso de existencias bajas lo incluye.
     */
    public BigDecimal getMinStock() {
        return minStock;
    }

    public CreateProductParams setMinStock(BigDecimal minStock) {
        this.minStock = minStock;
        return this;
    }

    @JsonIgnore
    public CreateProductParams setMinStock(double minStock) {
        return setMinStock(BigDecimal.valueOf(minStock));
    }
}
