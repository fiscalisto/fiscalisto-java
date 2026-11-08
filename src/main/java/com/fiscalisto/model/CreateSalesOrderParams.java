// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateSalesOrderParams: los campos de «Crear un pedido».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSalesOrderParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Hacerlo de una cotización (quo_…): toma su cliente y sus conceptos, y la cotización queda aceptada. Sin customer ni items.
     */
    @JsonProperty("quote")
    private String quote;

    /**
     * Un cliente de su catálogo (cus_…) o uno con sus datos fiscales (como en POST /v1/invoices: se agrega a sus clientes).
     */
    @JsonProperty("customer")
    private StringOr<CreateSalesOrderParamsCustomer> customer;

    /**
     * Los conceptos, como en POST /v1/invoices (hasta 200).
     */
    @JsonProperty("items")
    private List<CreateSalesOrderParamsItem> items;

    /**
     * Confirmarlo en el mismo paso (por omisión false: queda en draft). Confirmado, aparta lo pedido en el almacén.
     */
    @JsonProperty("confirm")
    private Boolean confirm;

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
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    @JsonProperty("use")
    private String use;

    /**
     * Observaciones que aparecen en el PDF (no van en el XML).
     */
    @JsonProperty("notes")
    private String notes;

    /**
     * El número de orden de compra de su cliente (va en la nota de cada factura).
     */
    @JsonProperty("customer_po")
    private String customerPo;

    /**
     * A dónde mandarle el pedido y sus remisiones (hasta 5 correos, separados por comas). Por omisión, el del cliente.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Entrega estimada (AAAA-MM-DD).
     */
    @JsonProperty("expected_on")
    private String expectedOn;

    /**
     * Días de crédito (0: de contado).
     */
    @JsonProperty("payment_days")
    private Long paymentDays;

    /**
     * Qué se factura: delivered (por omisión), lo ya entregado; ordered, todo lo pedido desde el inicio (por ejemplo con pago por adelantado).
     * <p>
     * Valores: delivered, ordered.
     */
    @JsonProperty("invoice_policy")
    private String invoicePolicy;

    /**
     * Dónde se entrega.
     */
    @JsonProperty("ship_to")
    private String shipTo;

    /**
     * Condiciones del pedido.
     */
    @JsonProperty("terms")
    private String terms;

    /**
     * Nota interna (su cliente no la ve).
     */
    @JsonProperty("internal_note")
    private String internalNote;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateSalesOrderParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Hacerlo de una cotización (quo_…): toma su cliente y sus conceptos, y la cotización queda aceptada. Sin customer ni items.
     */
    public String getQuote() {
        return quote;
    }

    public CreateSalesOrderParams setQuote(String quote) {
        this.quote = quote;
        return this;
    }

    /**
     * Un cliente de su catálogo (cus_…) o uno con sus datos fiscales (como en POST /v1/invoices: se agrega a sus clientes).
     */
    public StringOr<CreateSalesOrderParamsCustomer> getCustomer() {
        return customer;
    }

    public CreateSalesOrderParams setCustomer(StringOr<CreateSalesOrderParamsCustomer> customer) {
        this.customer = customer;
        return this;
    }

    /** Solo el id. */
    public CreateSalesOrderParams setCustomer(String id) {
        return setCustomer(StringOr.<CreateSalesOrderParamsCustomer>id(id));
    }

    public CreateSalesOrderParams setCustomer(CreateSalesOrderParamsCustomer customer) {
        return setCustomer(StringOr.of(customer));
    }

    /**
     * Los conceptos, como en POST /v1/invoices (hasta 200).
     */
    public List<CreateSalesOrderParamsItem> getItems() {
        return items;
    }

    public CreateSalesOrderParams setItems(List<CreateSalesOrderParamsItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Confirmarlo en el mismo paso (por omisión false: queda en draft). Confirmado, aparta lo pedido en el almacén.
     */
    public Boolean getConfirm() {
        return confirm;
    }

    public CreateSalesOrderParams setConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public CreateSalesOrderParams setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public CreateSalesOrderParams setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public CreateSalesOrderParams setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public CreateSalesOrderParams setPaymentForm(String paymentForm) {
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

    public CreateSalesOrderParams setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    public String getUse() {
        return use;
    }

    public CreateSalesOrderParams setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Observaciones que aparecen en el PDF (no van en el XML).
     */
    public String getNotes() {
        return notes;
    }

    public CreateSalesOrderParams setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * El número de orden de compra de su cliente (va en la nota de cada factura).
     */
    public String getCustomerPo() {
        return customerPo;
    }

    public CreateSalesOrderParams setCustomerPo(String customerPo) {
        this.customerPo = customerPo;
        return this;
    }

    /**
     * A dónde mandarle el pedido y sus remisiones (hasta 5 correos, separados por comas). Por omisión, el del cliente.
     */
    public String getEmail() {
        return email;
    }

    public CreateSalesOrderParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Entrega estimada (AAAA-MM-DD).
     */
    public String getExpectedOn() {
        return expectedOn;
    }

    public CreateSalesOrderParams setExpectedOn(String expectedOn) {
        this.expectedOn = expectedOn;
        return this;
    }

    /**
     * Días de crédito (0: de contado).
     */
    public Long getPaymentDays() {
        return paymentDays;
    }

    public CreateSalesOrderParams setPaymentDays(Long paymentDays) {
        this.paymentDays = paymentDays;
        return this;
    }

    @JsonIgnore
    public CreateSalesOrderParams setPaymentDays(long paymentDays) {
        return setPaymentDays(Long.valueOf(paymentDays));
    }

    /**
     * Qué se factura: delivered (por omisión), lo ya entregado; ordered, todo lo pedido desde el inicio (por ejemplo con pago por adelantado).
     * <p>
     * Valores: delivered, ordered.
     */
    public String getInvoicePolicy() {
        return invoicePolicy;
    }

    public CreateSalesOrderParams setInvoicePolicy(String invoicePolicy) {
        this.invoicePolicy = invoicePolicy;
        return this;
    }

    /**
     * Dónde se entrega.
     */
    public String getShipTo() {
        return shipTo;
    }

    public CreateSalesOrderParams setShipTo(String shipTo) {
        this.shipTo = shipTo;
        return this;
    }

    /**
     * Condiciones del pedido.
     */
    public String getTerms() {
        return terms;
    }

    public CreateSalesOrderParams setTerms(String terms) {
        this.terms = terms;
        return this;
    }

    /**
     * Nota interna (su cliente no la ve).
     */
    public String getInternalNote() {
        return internalNote;
    }

    public CreateSalesOrderParams setInternalNote(String internalNote) {
        this.internalNote = internalNote;
        return this;
    }
}
