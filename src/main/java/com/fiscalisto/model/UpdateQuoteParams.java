// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdateQuoteParams: los campos de «Cambiar una cotización».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateQuoteParams {
    /**
     * Un cliente de su catálogo (cus_…), uno con sus datos fiscales (como en POST /v1/invoices: se agrega a sus clientes) o solo name y email si aún no los tiene.
     */
    @JsonProperty("customer")
    private Object customer;

    /**
     * Los conceptos, como en POST /v1/invoices.
     */
    @JsonProperty("items")
    private List<UpdateQuoteParamsItem> items;

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
     * Hasta cuándo es válida (AAAA-MM-DD, hasta un año). Por omisión, en 15 días.
     */
    @JsonProperty("valid_until")
    private String validUntil;

    /**
     * Condiciones: tiempo de entrega, anticipo, garantía…
     */
    @JsonProperty("terms")
    private String terms;

    /**
     * Un cliente de su catálogo (cus_…), uno con sus datos fiscales (como en POST /v1/invoices: se agrega a sus clientes) o solo name y email si aún no los tiene.
     */
    public Object getCustomer() {
        return customer;
    }

    public UpdateQuoteParams setCustomer(Object customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Los conceptos, como en POST /v1/invoices.
     */
    public List<UpdateQuoteParamsItem> getItems() {
        return items;
    }

    public UpdateQuoteParams setItems(List<UpdateQuoteParamsItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public UpdateQuoteParams setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Tipo de cambio a pesos (TipoCambio). Obligatorio si la moneda no es MXN; use el del DOF del día anterior.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public UpdateQuoteParams setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public UpdateQuoteParams setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago: 01 efectivo, 03 transferencia, 04 tarjeta de crédito, 28 débito, 99 por definir… Obligatoria con PUE; con PPD es 99.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public UpdateQuoteParams setPaymentForm(String paymentForm) {
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

    public UpdateQuoteParams setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Uso del CFDI (UsoCFDI), clave de c_UsoCFDI. Por omisión G03, o S01 con régimen 616.
     */
    public String getUse() {
        return use;
    }

    public UpdateQuoteParams setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Observaciones que aparecen en el PDF (no van en el XML).
     */
    public String getNotes() {
        return notes;
    }

    public UpdateQuoteParams setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Hasta cuándo es válida (AAAA-MM-DD, hasta un año). Por omisión, en 15 días.
     */
    public String getValidUntil() {
        return validUntil;
    }

    public UpdateQuoteParams setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * Condiciones: tiempo de entrega, anticipo, garantía…
     */
    public String getTerms() {
        return terms;
    }

    public UpdateQuoteParams setTerms(String terms) {
        this.terms = terms;
        return this;
    }
}
