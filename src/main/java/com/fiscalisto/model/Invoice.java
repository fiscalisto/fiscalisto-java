// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Invoice: Un CFDI 4.0 emitido: factura de ingreso o global, traslado, nota de crédito (E), complemento de pago (P) o recibo de nómina (N).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Invoice {
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
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * processing: el PAC no ha contestado (se resuelve sola; escuche invoice.stamped). valid: timbrada. pending: timbrada con una cancelación en espera del cliente. rejected: el SAT o el PAC no la aceptaron (ver error). canceled: cancelada.
     * <p>
     * Valores: processing, pending, valid, rejected, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    @JsonProperty("series")
    private String series;

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
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
    private InvoiceCustomer customer;

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
     * Impuestos del comprobante, por tipo.
     */
    @JsonProperty("taxes")
    private InvoiceTaxes taxes;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * CFDI relacionados (CfdiRelacionados): tipo de relación de c_TipoRelacion y los UUID.
     */
    @JsonProperty("related")
    private Map<String, Object> related;

    /**
     * Solo en un complemento de pago (type P).
     */
    @JsonProperty("payment")
    private InvoicePayment payment;

    /**
     * Solo en un recibo de nómina (type N).
     */
    @JsonProperty("payroll")
    private InvoicePayroll payroll;

    /**
     * Solo en una factura global.
     */
    @JsonProperty("global")
    private Map<String, Object> global;

    /**
     * La cancelación, si se pidió: estado, motivo, sustituto y cuándo.
     */
    @JsonProperty("cancellation")
    private InvoiceCancellation cancellation;

    /**
     * El envío por correo: a quién, con copia a quién y cuándo (null si no se ha enviado).
     */
    @JsonProperty("email")
    private InvoiceEmail email;

    /**
     * Por qué el SAT o el PAC no lo aceptaron: mensaje, código del SAT y texto original.
     */
    @JsonProperty("error")
    private InvoiceError error;

    /**
     * La factura recurrente (rin_…) que la timbró sola, o null si se timbró con una llamada.
     */
    @JsonProperty("recurring_invoice")
    private String recurringInvoice;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Avisos que no impidieron timbrar (por ejemplo, el XML se guardará después).
     */
    @JsonProperty("warnings")
    private List<String> warnings;

    /**
     * Por qué no se pudo mandar el correo; el comprobante sí se timbró.
     */
    @JsonProperty("email_error")
    private String emailError;

    /**
     * La factura que esta sustituyó y si quedó cancelada.
     */
    @JsonProperty("substitutes")
    private InvoiceSubstitutes substitutes;

    /**
     * La aplicación del anticipo: método, nota de aplicación y su estado.
     */
    @JsonProperty("advance_application")
    private InvoiceAdvanceApplication advanceApplication;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Invoice setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Invoice setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Invoice setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public Invoice setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: I, E, P, T, N.
     */
    public String getType() {
        return type;
    }

    public Invoice setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * processing: el PAC no ha contestado (se resuelve sola; escuche invoice.stamped). valid: timbrada. pending: timbrada con una cancelación en espera del cliente. rejected: el SAT o el PAC no la aceptaron (ver error). canceled: cancelada.
     * <p>
     * Valores: processing, pending, valid, rejected, canceled.
     */
    public String getStatus() {
        return status;
    }

    public Invoice setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public Invoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    public String getSeries() {
        return series;
    }

    public Invoice setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    public String getFolio() {
        return folio;
    }

    public Invoice setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    public String getDate() {
        return date;
    }

    public Invoice setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Cliente (Receptor): el id de uno de su catálogo (cus_…) o sus datos en un objeto.
     */
    public InvoiceCustomer getCustomer() {
        return customer;
    }

    public Invoice setCustomer(InvoiceCustomer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    public String getUse() {
        return use;
    }

    public Invoice setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public Invoice setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Método de pago (MetodoPago): PUE (una sola exhibición, por omisión) o PPD (en parcialidades o diferido, se cobra con complementos de pago).
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Invoice setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public Invoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public Invoice setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    public Invoice setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Conceptos (Conceptos), al menos uno.
     */
    public List<InvoiceItem> getItems() {
        return items;
    }

    public Invoice setItems(List<InvoiceItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Suma de los importes antes de impuestos y descuentos (SubTotal).
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public Invoice setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public Invoice setSubtotal(double subtotal) {
        return setSubtotal(BigDecimal.valueOf(subtotal));
    }

    /**
     * Descuento (Descuento).
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    public Invoice setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public Invoice setDiscount(double discount) {
        return setDiscount(BigDecimal.valueOf(discount));
    }

    /**
     * Impuestos del comprobante, por tipo.
     */
    public InvoiceTaxes getTaxes() {
        return taxes;
    }

    public Invoice setTaxes(InvoiceTaxes taxes) {
        this.taxes = taxes;
        return this;
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public Invoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public Invoice setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * CFDI relacionados (CfdiRelacionados): tipo de relación de c_TipoRelacion y los UUID.
     */
    public Map<String, Object> getRelated() {
        return related;
    }

    public Invoice setRelated(Map<String, Object> related) {
        this.related = related;
        return this;
    }

    /**
     * Solo en un complemento de pago (type P).
     */
    public InvoicePayment getPayment() {
        return payment;
    }

    public Invoice setPayment(InvoicePayment payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Solo en un recibo de nómina (type N).
     */
    public InvoicePayroll getPayroll() {
        return payroll;
    }

    public Invoice setPayroll(InvoicePayroll payroll) {
        this.payroll = payroll;
        return this;
    }

    /**
     * Solo en una factura global.
     */
    public Map<String, Object> getGlobal() {
        return global;
    }

    public Invoice setGlobal(Map<String, Object> global) {
        this.global = global;
        return this;
    }

    /**
     * La cancelación, si se pidió: estado, motivo, sustituto y cuándo.
     */
    public InvoiceCancellation getCancellation() {
        return cancellation;
    }

    public Invoice setCancellation(InvoiceCancellation cancellation) {
        this.cancellation = cancellation;
        return this;
    }

    /**
     * El envío por correo: a quién, con copia a quién y cuándo (null si no se ha enviado).
     */
    public InvoiceEmail getEmail() {
        return email;
    }

    public Invoice setEmail(InvoiceEmail email) {
        this.email = email;
        return this;
    }

    /**
     * Por qué el SAT o el PAC no lo aceptaron: mensaje, código del SAT y texto original.
     */
    public InvoiceError getError() {
        return error;
    }

    public Invoice setError(InvoiceError error) {
        this.error = error;
        return this;
    }

    /**
     * La factura recurrente (rin_…) que la timbró sola, o null si se timbró con una llamada.
     */
    public String getRecurringInvoice() {
        return recurringInvoice;
    }

    public Invoice setRecurringInvoice(String recurringInvoice) {
        this.recurringInvoice = recurringInvoice;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Invoice setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public Invoice setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Avisos que no impidieron timbrar (por ejemplo, el XML se guardará después).
     */
    public List<String> getWarnings() {
        return warnings;
    }

    public Invoice setWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Por qué no se pudo mandar el correo; el comprobante sí se timbró.
     */
    public String getEmailError() {
        return emailError;
    }

    public Invoice setEmailError(String emailError) {
        this.emailError = emailError;
        return this;
    }

    /**
     * La factura que esta sustituyó y si quedó cancelada.
     */
    public InvoiceSubstitutes getSubstitutes() {
        return substitutes;
    }

    public Invoice setSubstitutes(InvoiceSubstitutes substitutes) {
        this.substitutes = substitutes;
        return this;
    }

    /**
     * La aplicación del anticipo: método, nota de aplicación y su estado.
     */
    public InvoiceAdvanceApplication getAdvanceApplication() {
        return advanceApplication;
    }

    public Invoice setAdvanceApplication(InvoiceAdvanceApplication advanceApplication) {
        this.advanceApplication = advanceApplication;
        return this;
    }
}
