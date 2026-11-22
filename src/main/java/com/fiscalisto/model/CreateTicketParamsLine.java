// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateTicketParamsLine: CreateTicketParamsLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTicketParamsLine {
    /**
     * Un producto (prd_…) de su catálogo: sus claves, IVA e impuestos locales.
     */
    @JsonProperty("product")
    private String product;

    /**
     * El concepto. Con `product`, reemplaza su descripción; sin él, va con `product_key`.
     */
    @JsonProperty("description")
    private String description;

    /**
     * c_ClaveProdServ (8 dígitos), si no usa `product`.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * c_ClaveUnidad. Por omisión, la de la clave del producto.
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Tasa de IVA incluida en su total. Por omisión 0.16.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    @JsonProperty("iva")
    private String iva;

    /**
     * Impuestos locales incluidos en su total, como el ISH 3.5% de hospedaje, con `product_key` (un producto lleva los suyos). Cada uno se calcula sobre la base de este concepto y la factura los suma por nombre y tasa en el complemento de impuestos locales.
     */
    @JsonProperty("local_taxes")
    private List<CreateTicketParamsLineLocalTax> localTaxes;

    /**
     * IEPS incluido en su total, con `product_key` (un producto lleva el suyo): una tasa de c_TasaOCuota como 0.08 (botanas) o, con `ieps_factor` `Cuota`, pesos por unidad. La factura global lo desglosa aparte (RMF 2026 regla 2.7.1.21); la factura de un cliente que no paga IEPS lo lleva dentro del precio (LIEPS art. 19 fr. II).
     */
    @JsonProperty("ieps")
    private BigDecimal ieps;

    /**
     * `Tasa` (por omisión) o `Cuota` (pesos por unidad).
     * <p>
     * Valores: Tasa, Cuota.
     */
    @JsonProperty("ieps_factor")
    private String iepsFactor;

    /**
     * Lo que solo dice esta venta, como las noches, fechas y número de reservación de una estancia. Con él, la factura dice «Hospedaje · 6 noches, del 14 al 20 de noviembre»; cuándo va lo decide `invoice_concepts.line_detail` de la autofactura (por omisión, el cliente lo elige en el portal).
     */
    @JsonProperty("detail")
    private String detail;

    /**
     * Unidades (noches, piezas). Por omisión 1.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Lo que se cobró por este concepto, impuestos incluidos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Un producto (prd_…) de su catálogo: sus claves, IVA e impuestos locales.
     */
    public String getProduct() {
        return product;
    }

    public CreateTicketParamsLine setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * El concepto. Con `product`, reemplaza su descripción; sin él, va con `product_key`.
     */
    public String getDescription() {
        return description;
    }

    public CreateTicketParamsLine setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * c_ClaveProdServ (8 dígitos), si no usa `product`.
     */
    public String getProductKey() {
        return productKey;
    }

    public CreateTicketParamsLine setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * c_ClaveUnidad. Por omisión, la de la clave del producto.
     */
    public String getUnitKey() {
        return unitKey;
    }

    public CreateTicketParamsLine setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Tasa de IVA incluida en su total. Por omisión 0.16.
     * <p>
     * Valores: 0, 0.16, 0.08, exento.
     */
    public String getIva() {
        return iva;
    }

    public CreateTicketParamsLine setIva(String iva) {
        this.iva = iva;
        return this;
    }

    /**
     * Impuestos locales incluidos en su total, como el ISH 3.5% de hospedaje, con `product_key` (un producto lleva los suyos). Cada uno se calcula sobre la base de este concepto y la factura los suma por nombre y tasa en el complemento de impuestos locales.
     */
    public List<CreateTicketParamsLineLocalTax> getLocalTaxes() {
        return localTaxes;
    }

    public CreateTicketParamsLine setLocalTaxes(List<CreateTicketParamsLineLocalTax> localTaxes) {
        this.localTaxes = localTaxes;
        return this;
    }

    /**
     * IEPS incluido en su total, con `product_key` (un producto lleva el suyo): una tasa de c_TasaOCuota como 0.08 (botanas) o, con `ieps_factor` `Cuota`, pesos por unidad. La factura global lo desglosa aparte (RMF 2026 regla 2.7.1.21); la factura de un cliente que no paga IEPS lo lleva dentro del precio (LIEPS art. 19 fr. II).
     */
    public BigDecimal getIeps() {
        return ieps;
    }

    public CreateTicketParamsLine setIeps(BigDecimal ieps) {
        this.ieps = ieps;
        return this;
    }

    @JsonIgnore
    public CreateTicketParamsLine setIeps(double ieps) {
        return setIeps(BigDecimal.valueOf(ieps));
    }

    /**
     * `Tasa` (por omisión) o `Cuota` (pesos por unidad).
     * <p>
     * Valores: Tasa, Cuota.
     */
    public String getIepsFactor() {
        return iepsFactor;
    }

    public CreateTicketParamsLine setIepsFactor(String iepsFactor) {
        this.iepsFactor = iepsFactor;
        return this;
    }

    /**
     * Lo que solo dice esta venta, como las noches, fechas y número de reservación de una estancia. Con él, la factura dice «Hospedaje · 6 noches, del 14 al 20 de noviembre»; cuándo va lo decide `invoice_concepts.line_detail` de la autofactura (por omisión, el cliente lo elige en el portal).
     */
    public String getDetail() {
        return detail;
    }

    public CreateTicketParamsLine setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Unidades (noches, piezas). Por omisión 1.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public CreateTicketParamsLine setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public CreateTicketParamsLine setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Lo que se cobró por este concepto, impuestos incluidos.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CreateTicketParamsLine setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CreateTicketParamsLine setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
