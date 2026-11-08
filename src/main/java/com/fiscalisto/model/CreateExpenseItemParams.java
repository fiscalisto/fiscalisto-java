// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateExpenseItemParams: los campos de «Agregar un gasto».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExpenseItemParams {
    /**
     * El UUID de una factura recibida del emisor (GET /v1/sat_invoices): la fecha, el monto, el proveedor y la forma de pago salen de ella.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * De qué es: hospedaje, alimentos, avion, transporte, auto, combustible (gasolina, casetas y estacionamiento), comidas (en restaurante, fuera de viaje), papeleria, mensajeria, software u otros.
     * <p>
     * Valores: hospedaje, alimentos, avion, transporte, auto, combustible, comidas, papeleria, mensajeria, software, otros.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("category")
    private String category;

    /**
     * Cuándo se gastó. Con uuid, la fecha de la factura.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Qué fue (el proveedor). Con uuid, su emisor.
     */
    @JsonProperty("description")
    private String description;

    /**
     * En pesos. Con uuid, el total de la factura.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * En su moneda, si fue en otra.
     */
    @JsonProperty("foreign_amount")
    private BigDecimal foreignAmount;

    /**
     * La moneda (USD, EUR…).
     */
    @JsonProperty("foreign_currency")
    private String foreignCurrency;

    /**
     * En alimentos, cuántas personas comieron: el tope es por persona.
     */
    @JsonProperty("people")
    private Long people;

    /**
     * Cómo se pagó: tarjeta_empresa (no se le reembolsa), tarjeta_propia, efectivo, transferencia u otro.
     * <p>
     * Valores: tarjeta_empresa, tarjeta_propia, efectivo, transferencia, otro.
     */
    @JsonProperty("payment")
    private String payment;

    /**
     * Su comprobante: cfdi, extranjero, ticket o ninguno. Con uuid, cfdi.
     * <p>
     * Valores: cfdi, extranjero, ticket, ninguno.
     */
    @JsonProperty("receipt")
    private String receipt;

    /**
     * Por qué, si pasa la política (la política puede pedirla).
     */
    @JsonProperty("note")
    private String note;

    /**
     * El UUID de una factura recibida del emisor (GET /v1/sat_invoices): la fecha, el monto, el proveedor y la forma de pago salen de ella.
     */
    public String getUuid() {
        return uuid;
    }

    public CreateExpenseItemParams setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * De qué es: hospedaje, alimentos, avion, transporte, auto, combustible (gasolina, casetas y estacionamiento), comidas (en restaurante, fuera de viaje), papeleria, mensajeria, software u otros.
     * <p>
     * Valores: hospedaje, alimentos, avion, transporte, auto, combustible, comidas, papeleria, mensajeria, software, otros.
     * <p>
     * Obligatorio.
     */
    public String getCategory() {
        return category;
    }

    public CreateExpenseItemParams setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Cuándo se gastó. Con uuid, la fecha de la factura.
     */
    public String getDate() {
        return date;
    }

    public CreateExpenseItemParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Qué fue (el proveedor). Con uuid, su emisor.
     */
    public String getDescription() {
        return description;
    }

    public CreateExpenseItemParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * En pesos. Con uuid, el total de la factura.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateExpenseItemParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateExpenseItemParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * En su moneda, si fue en otra.
     */
    public BigDecimal getForeignAmount() {
        return foreignAmount;
    }

    public CreateExpenseItemParams setForeignAmount(BigDecimal foreignAmount) {
        this.foreignAmount = foreignAmount;
        return this;
    }

    @JsonIgnore
    public CreateExpenseItemParams setForeignAmount(double foreignAmount) {
        return setForeignAmount(BigDecimal.valueOf(foreignAmount));
    }

    /**
     * La moneda (USD, EUR…).
     */
    public String getForeignCurrency() {
        return foreignCurrency;
    }

    public CreateExpenseItemParams setForeignCurrency(String foreignCurrency) {
        this.foreignCurrency = foreignCurrency;
        return this;
    }

    /**
     * En alimentos, cuántas personas comieron: el tope es por persona.
     */
    public Long getPeople() {
        return people;
    }

    public CreateExpenseItemParams setPeople(Long people) {
        this.people = people;
        return this;
    }

    @JsonIgnore
    public CreateExpenseItemParams setPeople(long people) {
        return setPeople(Long.valueOf(people));
    }

    /**
     * Cómo se pagó: tarjeta_empresa (no se le reembolsa), tarjeta_propia, efectivo, transferencia u otro.
     * <p>
     * Valores: tarjeta_empresa, tarjeta_propia, efectivo, transferencia, otro.
     */
    public String getPayment() {
        return payment;
    }

    public CreateExpenseItemParams setPayment(String payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Su comprobante: cfdi, extranjero, ticket o ninguno. Con uuid, cfdi.
     * <p>
     * Valores: cfdi, extranjero, ticket, ninguno.
     */
    public String getReceipt() {
        return receipt;
    }

    public CreateExpenseItemParams setReceipt(String receipt) {
        this.receipt = receipt;
        return this;
    }

    /**
     * Por qué, si pasa la política (la política puede pedirla).
     */
    public String getNote() {
        return note;
    }

    public CreateExpenseItemParams setNote(String note) {
        this.note = note;
        return this;
    }
}
