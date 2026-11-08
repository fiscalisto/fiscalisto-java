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
 * UpdateSalesOrderParams: los campos de «Cambiar un pedido».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSalesOrderParams {
    /**
     * Un cliente de su catálogo (cus_…) o uno con sus datos fiscales (como en POST /v1/invoices: se agrega a sus clientes).
     */
    @JsonProperty("customer")
    private StringOr<UpdateSalesOrderParamsCustomer> customer;

    /**
     * Los conceptos, como en POST /v1/invoices (hasta 200).
     */
    @JsonProperty("items")
    private List<UpdateSalesOrderParamsItem> items;

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
     * Un cliente de su catálogo (cus_…) o uno con sus datos fiscales (como en POST /v1/invoices: se agrega a sus clientes).
     */
    public StringOr<UpdateSalesOrderParamsCustomer> getCustomer() {
        return customer;
    }

    public UpdateSalesOrderParams setCustomer(StringOr<UpdateSalesOrderParamsCustomer> customer) {
        this.customer = customer;
        return this;
    }

    /** Solo el id. */
    public UpdateSalesOrderParams setCustomer(String id) {
        return setCustomer(StringOr.<UpdateSalesOrderParamsCustomer>id(id));
    }

    public UpdateSalesOrderParams setCustomer(UpdateSalesOrderParamsCustomer customer) {
        return setCustomer(StringOr.of(customer));
    }

    /**
     * Los conceptos, como en POST /v1/invoices (hasta 200).
     */
    public List<UpdateSalesOrderParamsItem> getItems() {
        return items;
    }

    public UpdateSalesOrderParams setItems(List<UpdateSalesOrderParamsItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public UpdateSalesOrderParams setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public UpdateSalesOrderParams setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public UpdateSalesOrderParams setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public UpdateSalesOrderParams setPaymentForm(String paymentForm) {
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

    public UpdateSalesOrderParams setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    public String getUse() {
        return use;
    }

    public UpdateSalesOrderParams setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Observaciones que aparecen en el PDF (no van en el XML).
     */
    public String getNotes() {
        return notes;
    }

    public UpdateSalesOrderParams setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * El número de orden de compra de su cliente (va en la nota de cada factura).
     */
    public String getCustomerPo() {
        return customerPo;
    }

    public UpdateSalesOrderParams setCustomerPo(String customerPo) {
        this.customerPo = customerPo;
        return this;
    }

    /**
     * A dónde mandarle el pedido y sus remisiones (hasta 5 correos, separados por comas). Por omisión, el del cliente.
     */
    public String getEmail() {
        return email;
    }

    public UpdateSalesOrderParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Entrega estimada (AAAA-MM-DD).
     */
    public String getExpectedOn() {
        return expectedOn;
    }

    public UpdateSalesOrderParams setExpectedOn(String expectedOn) {
        this.expectedOn = expectedOn;
        return this;
    }

    /**
     * Días de crédito (0: de contado).
     */
    public Long getPaymentDays() {
        return paymentDays;
    }

    public UpdateSalesOrderParams setPaymentDays(Long paymentDays) {
        this.paymentDays = paymentDays;
        return this;
    }

    @JsonIgnore
    public UpdateSalesOrderParams setPaymentDays(long paymentDays) {
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

    public UpdateSalesOrderParams setInvoicePolicy(String invoicePolicy) {
        this.invoicePolicy = invoicePolicy;
        return this;
    }

    /**
     * Dónde se entrega.
     */
    public String getShipTo() {
        return shipTo;
    }

    public UpdateSalesOrderParams setShipTo(String shipTo) {
        this.shipTo = shipTo;
        return this;
    }

    /**
     * Condiciones del pedido.
     */
    public String getTerms() {
        return terms;
    }

    public UpdateSalesOrderParams setTerms(String terms) {
        this.terms = terms;
        return this;
    }

    /**
     * Nota interna (su cliente no la ve).
     */
    public String getInternalNote() {
        return internalNote;
    }

    public UpdateSalesOrderParams setInternalNote(String internalNote) {
        this.internalNote = internalNote;
        return this;
    }
}
