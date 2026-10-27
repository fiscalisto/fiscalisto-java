// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * CreateRecurringInvoiceParamsInvoice: La factura que se repite: el cuerpo de POST /v1/invoices, sin issuer, folio, date, global ni metadata. En description puede usar {mes}, {mes anterior}, {mes siguiente}, {año}, {año anterior}, {año siguiente} y {periodo}: cada factura los llena con su fecha.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRecurringInvoiceParamsInvoice {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * Almacén (whs_…) de donde salen sus productos con track_stock. Por omisión, el de su sucursal (o el de la Matriz).
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * Cliente (Receptor): el id de uno de su catálogo (cus_…) o sus datos en un objeto.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("customer")
    private StringOr<InvoiceCreateCustomer> customer;

    /**
     * Conceptos (Conceptos), al menos uno.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("items")
    private List<InvoiceCreateItem> items;

    /**
     * I ingreso (por omisión; con global, factura global) o T traslado. Notas de crédito: POST /v1/credit_notes. Pagos: POST /v1/payments.
     * <p>
     * Valores: I, T.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Complemento Carta Porte 3.1 (traslado de mercancías).
     */
    @JsonProperty("carta_porte")
    private InvoiceCreateCartaPorte cartaPorte;

    /**
     * Complemento INE (procesos electorales).
     */
    @JsonProperty("ine")
    private InvoiceCreateIne ine;

    /**
     * Complemento de leyendas fiscales.
     */
    @JsonProperty("leyendas")
    private List<InvoiceCreateLeyenda> leyendas;

    /**
     * Complemento de donatarias.
     */
    @JsonProperty("donation")
    private InvoiceCreateDonation donation;

    /**
     * Impuestos locales (complemento implocal): traslados y retenciones estatales.
     */
    @JsonProperty("local_taxes")
    private List<InvoiceCreateLocalTax> localTaxes;

    /**
     * Exportación (Exportacion), c_Exportacion: 01 no aplica (por omisión), 02 definitiva…
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    @JsonProperty("export")
    private String export;

    /**
     * Complemento de comercio exterior 2.0.
     */
    @JsonProperty("comercio_exterior")
    private InvoiceCreateComercioExterior comercioExterior;

    /**
     * Factura global a público en general (InformacionGlobal): periodicidad, meses y año.
     */
    @JsonProperty("global")
    private InvoiceCreateGlobal global;

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
     * <p>
     * Valores: PUE, PPD.
     */
    @JsonProperty("payment_method")
    private String paymentMethod;

    /**
     * Con PUE: true si aún no le pagan («Por cobrar» en la app) aunque se pagará este mes.
     */
    @JsonProperty("paid_later")
    private Boolean paidLater;

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    @JsonProperty("series")
    private String series;

    /**
     * Observaciones que aparecen en el PDF (no van en el XML).
     */
    @JsonProperty("notes")
    private String notes;

    /**
     * Idioma del PDF: es (por omisión) o en.
     * <p>
     * Valores: es, en, bi.
     */
    @JsonProperty("pdf_language")
    private String pdfLanguage;

    /**
     * Addenda del receptor (Walmart, Soriana…), con sus propios campos.
     */
    @JsonProperty("addenda")
    private InvoiceCreateAddenda addenda;

    /**
     * CFDI relacionados (CfdiRelacionados): tipo de relación de c_TipoRelacion y los UUID.
     */
    @JsonProperty("related")
    private InvoiceCreateRelated related;

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    @JsonProperty("exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    @JsonProperty("folio")
    private Long folio;

    /**
     * Con un folio elegido: true para que los siguientes sigan desde ese número.
     */
    @JsonProperty("continue_sequence")
    private Boolean continueSequence;

    /**
     * Fecha de emisión (Fecha) si no es ahora, AAAA-MM-DDTHH:MM:SS hora de la Ciudad de México: hasta 72 horas antes.
     */
    @JsonProperty("date")
    private String date;

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Correos con copia, separados por comas.
     */
    @JsonProperty("email_cc")
    private String emailCc;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateRecurringInvoiceParamsInvoice setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    public String getBranch() {
        return branch;
    }

    public CreateRecurringInvoiceParamsInvoice setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Almacén (whs_…) de donde salen sus productos con track_stock. Por omisión, el de su sucursal (o el de la Matriz).
     */
    public String getWarehouse() {
        return warehouse;
    }

    public CreateRecurringInvoiceParamsInvoice setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * Cliente (Receptor): el id de uno de su catálogo (cus_…) o sus datos en un objeto.
     * <p>
     * Obligatorio.
     */
    public StringOr<InvoiceCreateCustomer> getCustomer() {
        return customer;
    }

    public CreateRecurringInvoiceParamsInvoice setCustomer(StringOr<InvoiceCreateCustomer> customer) {
        this.customer = customer;
        return this;
    }

    /** Solo el id. */
    public CreateRecurringInvoiceParamsInvoice setCustomer(String id) {
        return setCustomer(StringOr.<InvoiceCreateCustomer>id(id));
    }

    public CreateRecurringInvoiceParamsInvoice setCustomer(InvoiceCreateCustomer customer) {
        return setCustomer(StringOr.of(customer));
    }

    /**
     * Conceptos (Conceptos), al menos uno.
     * <p>
     * Obligatorio.
     */
    public List<InvoiceCreateItem> getItems() {
        return items;
    }

    public CreateRecurringInvoiceParamsInvoice setItems(List<InvoiceCreateItem> items) {
        this.items = items;
        return this;
    }

    /**
     * I ingreso (por omisión; con global, factura global) o T traslado. Notas de crédito: POST /v1/credit_notes. Pagos: POST /v1/payments.
     * <p>
     * Valores: I, T.
     */
    public String getType() {
        return type;
    }

    public CreateRecurringInvoiceParamsInvoice setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Complemento Carta Porte 3.1 (traslado de mercancías).
     */
    public InvoiceCreateCartaPorte getCartaPorte() {
        return cartaPorte;
    }

    public CreateRecurringInvoiceParamsInvoice setCartaPorte(InvoiceCreateCartaPorte cartaPorte) {
        this.cartaPorte = cartaPorte;
        return this;
    }

    /**
     * Complemento INE (procesos electorales).
     */
    public InvoiceCreateIne getIne() {
        return ine;
    }

    public CreateRecurringInvoiceParamsInvoice setIne(InvoiceCreateIne ine) {
        this.ine = ine;
        return this;
    }

    /**
     * Complemento de leyendas fiscales.
     */
    public List<InvoiceCreateLeyenda> getLeyendas() {
        return leyendas;
    }

    public CreateRecurringInvoiceParamsInvoice setLeyendas(List<InvoiceCreateLeyenda> leyendas) {
        this.leyendas = leyendas;
        return this;
    }

    /**
     * Complemento de donatarias.
     */
    public InvoiceCreateDonation getDonation() {
        return donation;
    }

    public CreateRecurringInvoiceParamsInvoice setDonation(InvoiceCreateDonation donation) {
        this.donation = donation;
        return this;
    }

    /**
     * Impuestos locales (complemento implocal): traslados y retenciones estatales.
     */
    public List<InvoiceCreateLocalTax> getLocalTaxes() {
        return localTaxes;
    }

    public CreateRecurringInvoiceParamsInvoice setLocalTaxes(List<InvoiceCreateLocalTax> localTaxes) {
        this.localTaxes = localTaxes;
        return this;
    }

    /**
     * Exportación (Exportacion), c_Exportacion: 01 no aplica (por omisión), 02 definitiva…
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    public String getExport() {
        return export;
    }

    public CreateRecurringInvoiceParamsInvoice setExport(String export) {
        this.export = export;
        return this;
    }

    /**
     * Complemento de comercio exterior 2.0.
     */
    public InvoiceCreateComercioExterior getComercioExterior() {
        return comercioExterior;
    }

    public CreateRecurringInvoiceParamsInvoice setComercioExterior(InvoiceCreateComercioExterior comercioExterior) {
        this.comercioExterior = comercioExterior;
        return this;
    }

    /**
     * Factura global a público en general (InformacionGlobal): periodicidad, meses y año.
     */
    public InvoiceCreateGlobal getGlobal() {
        return global;
    }

    public CreateRecurringInvoiceParamsInvoice setGlobal(InvoiceCreateGlobal global) {
        this.global = global;
        return this;
    }

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    public String getUse() {
        return use;
    }

    public CreateRecurringInvoiceParamsInvoice setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public CreateRecurringInvoiceParamsInvoice setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Método de pago (MetodoPago): PUE (una sola exhibición, por omisión) o PPD (en parcialidades o diferido, se cobra con complementos de pago).
     * <p>
     * Valores: PUE, PPD.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public CreateRecurringInvoiceParamsInvoice setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Con PUE: true si aún no le pagan («Por cobrar» en la app) aunque se pagará este mes.
     */
    public Boolean getPaidLater() {
        return paidLater;
    }

    public CreateRecurringInvoiceParamsInvoice setPaidLater(Boolean paidLater) {
        this.paidLater = paidLater;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public CreateRecurringInvoiceParamsInvoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    public String getSeries() {
        return series;
    }

    public CreateRecurringInvoiceParamsInvoice setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Observaciones que aparecen en el PDF (no van en el XML).
     */
    public String getNotes() {
        return notes;
    }

    public CreateRecurringInvoiceParamsInvoice setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Idioma del PDF: es (por omisión) o en.
     * <p>
     * Valores: es, en, bi.
     */
    public String getPdfLanguage() {
        return pdfLanguage;
    }

    public CreateRecurringInvoiceParamsInvoice setPdfLanguage(String pdfLanguage) {
        this.pdfLanguage = pdfLanguage;
        return this;
    }

    /**
     * Addenda del receptor (Walmart, Soriana…), con sus propios campos.
     */
    public InvoiceCreateAddenda getAddenda() {
        return addenda;
    }

    public CreateRecurringInvoiceParamsInvoice setAddenda(InvoiceCreateAddenda addenda) {
        this.addenda = addenda;
        return this;
    }

    /**
     * CFDI relacionados (CfdiRelacionados): tipo de relación de c_TipoRelacion y los UUID.
     */
    public InvoiceCreateRelated getRelated() {
        return related;
    }

    public CreateRecurringInvoiceParamsInvoice setRelated(InvoiceCreateRelated related) {
        this.related = related;
        return this;
    }

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public CreateRecurringInvoiceParamsInvoice setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public CreateRecurringInvoiceParamsInvoice setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    public Long getFolio() {
        return folio;
    }

    public CreateRecurringInvoiceParamsInvoice setFolio(Long folio) {
        this.folio = folio;
        return this;
    }

    @JsonIgnore
    public CreateRecurringInvoiceParamsInvoice setFolio(long folio) {
        return setFolio(Long.valueOf(folio));
    }

    /**
     * Con un folio elegido: true para que los siguientes sigan desde ese número.
     */
    public Boolean getContinueSequence() {
        return continueSequence;
    }

    public CreateRecurringInvoiceParamsInvoice setContinueSequence(Boolean continueSequence) {
        this.continueSequence = continueSequence;
        return this;
    }

    /**
     * Fecha de emisión (Fecha) si no es ahora, AAAA-MM-DDTHH:MM:SS hora de la Ciudad de México: hasta 72 horas antes.
     */
    public String getDate() {
        return date;
    }

    public CreateRecurringInvoiceParamsInvoice setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreateRecurringInvoiceParamsInvoice setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Correos con copia, separados por comas.
     */
    public String getEmailCc() {
        return emailCc;
    }

    public CreateRecurringInvoiceParamsInvoice setEmailCc(String emailCc) {
        this.emailCc = emailCc;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreateRecurringInvoiceParamsInvoice setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
