// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * ApplyAdvanceParams: El cuerpo de POST /v1/invoices (la factura de lo vendido) con method y remainder.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplyAdvanceParams {
    /**
     * egreso (la factura completa y después una nota de crédito por el anticipo, opción A) o remanente (la factura solo por lo que falta, opción B).
     * <p>
     * Valores: egreso, remanente.
     */
    @JsonProperty("method")
    private String method;

    /**
     * Cómo se paga lo que falta del anticipo: ahora con su forma de pago, o después (PPD).
     */
    @JsonProperty("remainder")
    private ApplyAdvanceParamsRemainder remainder;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

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
     * egreso (la factura completa y después una nota de crédito por el anticipo, opción A) o remanente (la factura solo por lo que falta, opción B).
     * <p>
     * Valores: egreso, remanente.
     */
    public String getMethod() {
        return method;
    }

    public ApplyAdvanceParams setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Cómo se paga lo que falta del anticipo: ahora con su forma de pago, o después (PPD).
     */
    public ApplyAdvanceParamsRemainder getRemainder() {
        return remainder;
    }

    public ApplyAdvanceParams setRemainder(ApplyAdvanceParamsRemainder remainder) {
        this.remainder = remainder;
        return this;
    }

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public ApplyAdvanceParams setIssuer(String issuer) {
        this.issuer = issuer;
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

    public ApplyAdvanceParams setCustomer(StringOr<InvoiceCreateCustomer> customer) {
        this.customer = customer;
        return this;
    }

    /** Solo el id. */
    public ApplyAdvanceParams setCustomer(String id) {
        return setCustomer(StringOr.<InvoiceCreateCustomer>id(id));
    }

    public ApplyAdvanceParams setCustomer(InvoiceCreateCustomer customer) {
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

    public ApplyAdvanceParams setItems(List<InvoiceCreateItem> items) {
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

    public ApplyAdvanceParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Complemento Carta Porte 3.1 (traslado de mercancías).
     */
    public InvoiceCreateCartaPorte getCartaPorte() {
        return cartaPorte;
    }

    public ApplyAdvanceParams setCartaPorte(InvoiceCreateCartaPorte cartaPorte) {
        this.cartaPorte = cartaPorte;
        return this;
    }

    /**
     * Complemento INE (procesos electorales).
     */
    public InvoiceCreateIne getIne() {
        return ine;
    }

    public ApplyAdvanceParams setIne(InvoiceCreateIne ine) {
        this.ine = ine;
        return this;
    }

    /**
     * Complemento de leyendas fiscales.
     */
    public List<InvoiceCreateLeyenda> getLeyendas() {
        return leyendas;
    }

    public ApplyAdvanceParams setLeyendas(List<InvoiceCreateLeyenda> leyendas) {
        this.leyendas = leyendas;
        return this;
    }

    /**
     * Complemento de donatarias.
     */
    public InvoiceCreateDonation getDonation() {
        return donation;
    }

    public ApplyAdvanceParams setDonation(InvoiceCreateDonation donation) {
        this.donation = donation;
        return this;
    }

    /**
     * Impuestos locales (complemento implocal): traslados y retenciones estatales.
     */
    public List<InvoiceCreateLocalTax> getLocalTaxes() {
        return localTaxes;
    }

    public ApplyAdvanceParams setLocalTaxes(List<InvoiceCreateLocalTax> localTaxes) {
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

    public ApplyAdvanceParams setExport(String export) {
        this.export = export;
        return this;
    }

    /**
     * Complemento de comercio exterior 2.0.
     */
    public InvoiceCreateComercioExterior getComercioExterior() {
        return comercioExterior;
    }

    public ApplyAdvanceParams setComercioExterior(InvoiceCreateComercioExterior comercioExterior) {
        this.comercioExterior = comercioExterior;
        return this;
    }

    /**
     * Factura global a público en general (InformacionGlobal): periodicidad, meses y año.
     */
    public InvoiceCreateGlobal getGlobal() {
        return global;
    }

    public ApplyAdvanceParams setGlobal(InvoiceCreateGlobal global) {
        this.global = global;
        return this;
    }

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    public String getUse() {
        return use;
    }

    public ApplyAdvanceParams setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public ApplyAdvanceParams setPaymentForm(String paymentForm) {
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

    public ApplyAdvanceParams setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Con PUE: true si aún no le pagan («Por cobrar» en la app) aunque se pagará este mes.
     */
    public Boolean getPaidLater() {
        return paidLater;
    }

    public ApplyAdvanceParams setPaidLater(Boolean paidLater) {
        this.paidLater = paidLater;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public ApplyAdvanceParams setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    public String getSeries() {
        return series;
    }

    public ApplyAdvanceParams setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Observaciones que aparecen en el PDF (no van en el XML).
     */
    public String getNotes() {
        return notes;
    }

    public ApplyAdvanceParams setNotes(String notes) {
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

    public ApplyAdvanceParams setPdfLanguage(String pdfLanguage) {
        this.pdfLanguage = pdfLanguage;
        return this;
    }

    /**
     * Addenda del receptor (Walmart, Soriana…), con sus propios campos.
     */
    public InvoiceCreateAddenda getAddenda() {
        return addenda;
    }

    public ApplyAdvanceParams setAddenda(InvoiceCreateAddenda addenda) {
        this.addenda = addenda;
        return this;
    }

    /**
     * CFDI relacionados (CfdiRelacionados): tipo de relación de c_TipoRelacion y los UUID.
     */
    public InvoiceCreateRelated getRelated() {
        return related;
    }

    public ApplyAdvanceParams setRelated(InvoiceCreateRelated related) {
        this.related = related;
        return this;
    }

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public ApplyAdvanceParams setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    public ApplyAdvanceParams setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    public Long getFolio() {
        return folio;
    }

    public ApplyAdvanceParams setFolio(Long folio) {
        this.folio = folio;
        return this;
    }

    public ApplyAdvanceParams setFolio(long folio) {
        return setFolio(Long.valueOf(folio));
    }

    /**
     * Con un folio elegido: true para que los siguientes sigan desde ese número.
     */
    public Boolean getContinueSequence() {
        return continueSequence;
    }

    public ApplyAdvanceParams setContinueSequence(Boolean continueSequence) {
        this.continueSequence = continueSequence;
        return this;
    }

    /**
     * Fecha de emisión (Fecha) si no es ahora, AAAA-MM-DDTHH:MM:SS hora de la Ciudad de México: hasta 72 horas antes.
     */
    public String getDate() {
        return date;
    }

    public ApplyAdvanceParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public ApplyAdvanceParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Correos con copia, separados por comas.
     */
    public String getEmailCc() {
        return emailCc;
    }

    public ApplyAdvanceParams setEmailCc(String emailCc) {
        this.emailCc = emailCc;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public ApplyAdvanceParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
