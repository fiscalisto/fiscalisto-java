// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ExpenseItem: Un gasto de una comprobación.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpenseItem {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Cuándo se gastó (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * De qué es: hospedaje, alimentos, avion, transporte, auto, combustible, comidas, papeleria, mensajeria, software u otros.
     * <p>
     * Valores: hospedaje, alimentos, avion, transporte, auto, combustible, comidas, papeleria, mensajeria, software, otros.
     */
    @JsonProperty("category")
    private String category;

    /**
     * Qué fue (el proveedor), o null.
     */
    @JsonProperty("description")
    private String description;

    /**
     * En pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * En su moneda, o null.
     */
    @JsonProperty("foreign_amount")
    private BigDecimal foreignAmount;

    /**
     * Su moneda (USD, EUR…), o null.
     */
    @JsonProperty("foreign_currency")
    private String foreignCurrency;

    /**
     * Cuántas personas comieron (en alimentos el tope es por persona).
     */
    @JsonProperty("people")
    private Long people;

    /**
     * Cómo se pagó: tarjeta_empresa, tarjeta_propia, efectivo, transferencia u otro, o null.
     * <p>
     * Valores: tarjeta_empresa, tarjeta_propia, efectivo, transferencia, otro.
     */
    @JsonProperty("payment")
    private String payment;

    /**
     * Su comprobante: cfdi, extranjero, ticket o ninguno.
     * <p>
     * Valores: cfdi, extranjero, ticket, ninguno.
     */
    @JsonProperty("receipt")
    private String receipt;

    /**
     * El UUID de su factura, o null.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * La nota de la persona, o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * true si quien aprueba lo rechazó.
     */
    @JsonProperty("rejected")
    private Boolean rejected;

    /**
     * Por qué se rechazó, o null.
     */
    @JsonProperty("reject_reason")
    private String rejectReason;

    /**
     * Lo que se deduce de este gasto.
     */
    @JsonProperty("deductible")
    private BigDecimal deductible;

    /**
     * Lo que no se deduce.
     */
    @JsonProperty("non_deductible")
    private BigDecimal nonDeductible;

    /**
     * true si pasa un tope de la política.
     */
    @JsonProperty("over_policy")
    private Boolean overPolicy;

    /**
     * Sus avisos contra la ley y la política.
     */
    @JsonProperty("issues")
    private List<ExpenseItemIssue> issues;

    /**
     * Cuándo se agregó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ExpenseItem setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ExpenseItem setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Cuándo se gastó (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public ExpenseItem setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * De qué es: hospedaje, alimentos, avion, transporte, auto, combustible, comidas, papeleria, mensajeria, software u otros.
     * <p>
     * Valores: hospedaje, alimentos, avion, transporte, auto, combustible, comidas, papeleria, mensajeria, software, otros.
     */
    public String getCategory() {
        return category;
    }

    public ExpenseItem setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Qué fue (el proveedor), o null.
     */
    public String getDescription() {
        return description;
    }

    public ExpenseItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * En pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public ExpenseItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public ExpenseItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * En su moneda, o null.
     */
    public BigDecimal getForeignAmount() {
        return foreignAmount;
    }

    public ExpenseItem setForeignAmount(BigDecimal foreignAmount) {
        this.foreignAmount = foreignAmount;
        return this;
    }

    @JsonIgnore
    public ExpenseItem setForeignAmount(double foreignAmount) {
        return setForeignAmount(BigDecimal.valueOf(foreignAmount));
    }

    /**
     * Su moneda (USD, EUR…), o null.
     */
    public String getForeignCurrency() {
        return foreignCurrency;
    }

    public ExpenseItem setForeignCurrency(String foreignCurrency) {
        this.foreignCurrency = foreignCurrency;
        return this;
    }

    /**
     * Cuántas personas comieron (en alimentos el tope es por persona).
     */
    public Long getPeople() {
        return people;
    }

    public ExpenseItem setPeople(Long people) {
        this.people = people;
        return this;
    }

    @JsonIgnore
    public ExpenseItem setPeople(long people) {
        return setPeople(Long.valueOf(people));
    }

    /**
     * Cómo se pagó: tarjeta_empresa, tarjeta_propia, efectivo, transferencia u otro, o null.
     * <p>
     * Valores: tarjeta_empresa, tarjeta_propia, efectivo, transferencia, otro.
     */
    public String getPayment() {
        return payment;
    }

    public ExpenseItem setPayment(String payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Su comprobante: cfdi, extranjero, ticket o ninguno.
     * <p>
     * Valores: cfdi, extranjero, ticket, ninguno.
     */
    public String getReceipt() {
        return receipt;
    }

    public ExpenseItem setReceipt(String receipt) {
        this.receipt = receipt;
        return this;
    }

    /**
     * El UUID de su factura, o null.
     */
    public String getUuid() {
        return uuid;
    }

    public ExpenseItem setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * La nota de la persona, o null.
     */
    public String getNote() {
        return note;
    }

    public ExpenseItem setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * true si quien aprueba lo rechazó.
     */
    public Boolean getRejected() {
        return rejected;
    }

    public ExpenseItem setRejected(Boolean rejected) {
        this.rejected = rejected;
        return this;
    }

    /**
     * Por qué se rechazó, o null.
     */
    public String getRejectReason() {
        return rejectReason;
    }

    public ExpenseItem setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    /**
     * Lo que se deduce de este gasto.
     */
    public BigDecimal getDeductible() {
        return deductible;
    }

    public ExpenseItem setDeductible(BigDecimal deductible) {
        this.deductible = deductible;
        return this;
    }

    @JsonIgnore
    public ExpenseItem setDeductible(double deductible) {
        return setDeductible(BigDecimal.valueOf(deductible));
    }

    /**
     * Lo que no se deduce.
     */
    public BigDecimal getNonDeductible() {
        return nonDeductible;
    }

    public ExpenseItem setNonDeductible(BigDecimal nonDeductible) {
        this.nonDeductible = nonDeductible;
        return this;
    }

    @JsonIgnore
    public ExpenseItem setNonDeductible(double nonDeductible) {
        return setNonDeductible(BigDecimal.valueOf(nonDeductible));
    }

    /**
     * true si pasa un tope de la política.
     */
    public Boolean getOverPolicy() {
        return overPolicy;
    }

    public ExpenseItem setOverPolicy(Boolean overPolicy) {
        this.overPolicy = overPolicy;
        return this;
    }

    /**
     * Sus avisos contra la ley y la política.
     */
    public List<ExpenseItemIssue> getIssues() {
        return issues;
    }

    public ExpenseItem setIssues(List<ExpenseItemIssue> issues) {
        this.issues = issues;
        return this;
    }

    /**
     * Cuándo se agregó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ExpenseItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
