// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoicePreview: Una factura revisada y sin timbrar: lo que se timbraría ahora con POST /v1/invoices y el mismo cuerpo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePreview {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: I, E, T.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    @JsonProperty("series")
    private String series;

    /**
     * El folio que tendría si se timbrara ahora; otra factura timbrada antes puede tomarlo.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Cliente (Receptor): el id de uno de su catálogo (cus_…) o sus datos en un objeto.
     */
    @JsonProperty("customer")
    private InvoicePreviewCustomer customer;

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    @JsonProperty("use")
    private String use;

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * Método de pago (MetodoPago): PUE (una sola exhibición, por omisión) o PPD (en parcialidades o diferido, se cobra con complementos de pago).
     */
    @JsonProperty("payment_method")
    private String paymentMethod;

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    @JsonProperty("exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * Conceptos (Conceptos), al menos uno.
     */
    @JsonProperty("items")
    private List<InvoiceItem> items;

    /**
     * Suma de los importes antes de impuestos y descuentos (SubTotal).
     */
    @JsonProperty("subtotal")
    private BigDecimal subtotal;

    /**
     * Descuento (Descuento).
     */
    @JsonProperty("discount")
    private BigDecimal discount;

    /**
     * Los impuestos de la factura, por tipo: IVA e IEPS trasladados, IVA e ISR retenidos e impuestos locales.
     */
    @JsonProperty("taxes")
    private InvoicePreviewTaxes taxes;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo que conviene revisar antes de timbrar (un cliente en las listas 69 o 69-B del SAT, una factura que parece duplicada); no impide timbrar.
     */
    @JsonProperty("warnings")
    private List<InvoicePreviewWarning> warnings;

    /**
     * El XML que se mandaría al PAC, sin sello ni timbre.
     */
    @JsonProperty("unsigned_xml")
    private String unsignedXml;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public InvoicePreview setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public InvoicePreview setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public InvoicePreview setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    public String getBranch() {
        return branch;
    }

    public InvoicePreview setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: I, E, T.
     */
    public String getType() {
        return type;
    }

    public InvoicePreview setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    public String getSeries() {
        return series;
    }

    public InvoicePreview setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * El folio que tendría si se timbrara ahora; otra factura timbrada antes puede tomarlo.
     */
    public String getFolio() {
        return folio;
    }

    public InvoicePreview setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    public String getDate() {
        return date;
    }

    public InvoicePreview setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Cliente (Receptor): el id de uno de su catálogo (cus_…) o sus datos en un objeto.
     */
    public InvoicePreviewCustomer getCustomer() {
        return customer;
    }

    public InvoicePreview setCustomer(InvoicePreviewCustomer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    public String getUse() {
        return use;
    }

    public InvoicePreview setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public InvoicePreview setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Método de pago (MetodoPago): PUE (una sola exhibición, por omisión) o PPD (en parcialidades o diferido, se cobra con complementos de pago).
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public InvoicePreview setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public InvoicePreview setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public InvoicePreview setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public InvoicePreview setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Conceptos (Conceptos), al menos uno.
     */
    public List<InvoiceItem> getItems() {
        return items;
    }

    public InvoicePreview setItems(List<InvoiceItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Suma de los importes antes de impuestos y descuentos (SubTotal).
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public InvoicePreview setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    @JsonIgnore
    public InvoicePreview setSubtotal(double subtotal) {
        return setSubtotal(BigDecimal.valueOf(subtotal));
    }

    /**
     * Descuento (Descuento).
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    public InvoicePreview setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    @JsonIgnore
    public InvoicePreview setDiscount(double discount) {
        return setDiscount(BigDecimal.valueOf(discount));
    }

    /**
     * Los impuestos de la factura, por tipo: IVA e IEPS trasladados, IVA e ISR retenidos e impuestos locales.
     */
    public InvoicePreviewTaxes getTaxes() {
        return taxes;
    }

    public InvoicePreview setTaxes(InvoicePreviewTaxes taxes) {
        this.taxes = taxes;
        return this;
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public InvoicePreview setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public InvoicePreview setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Lo que conviene revisar antes de timbrar (un cliente en las listas 69 o 69-B del SAT, una factura que parece duplicada); no impide timbrar.
     */
    public List<InvoicePreviewWarning> getWarnings() {
        return warnings;
    }

    public InvoicePreview setWarnings(List<InvoicePreviewWarning> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * El XML que se mandaría al PAC, sin sello ni timbre.
     */
    public String getUnsignedXml() {
        return unsignedXml;
    }

    public InvoicePreview setUnsignedXml(String unsignedXml) {
        this.unsignedXml = unsignedXml;
        return this;
    }
}
