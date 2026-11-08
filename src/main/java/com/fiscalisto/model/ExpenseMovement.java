// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExpenseMovement: Dinero que se le dio a la persona (anticipo, reembolso) o que devolvió.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpenseMovement {
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
     * anticipo, reembolso o devolucion.
     * <p>
     * Valores: anticipo, reembolso, devolucion.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * En pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Cuándo se pagó (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * transferencia, efectivo, tarjeta o nomina (en su recibo de nómina).
     * <p>
     * Valores: transferencia, efectivo, tarjeta, nomina.
     */
    @JsonProperty("method")
    private String method;

    /**
     * Su referencia, o null.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * true si ya se pagó en un recibo de nómina.
     */
    @JsonProperty("in_payroll")
    private Boolean inPayroll;

    /**
     * Cuándo se registró.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ExpenseMovement setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ExpenseMovement setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * anticipo, reembolso o devolucion.
     * <p>
     * Valores: anticipo, reembolso, devolucion.
     */
    public String getKind() {
        return kind;
    }

    public ExpenseMovement setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * En pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public ExpenseMovement setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public ExpenseMovement setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Cuándo se pagó (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public ExpenseMovement setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * transferencia, efectivo, tarjeta o nomina (en su recibo de nómina).
     * <p>
     * Valores: transferencia, efectivo, tarjeta, nomina.
     */
    public String getMethod() {
        return method;
    }

    public ExpenseMovement setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Su referencia, o null.
     */
    public String getReference() {
        return reference;
    }

    public ExpenseMovement setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * true si ya se pagó en un recibo de nómina.
     */
    public Boolean getInPayroll() {
        return inPayroll;
    }

    public ExpenseMovement setInPayroll(Boolean inPayroll) {
        this.inPayroll = inPayroll;
        return this;
    }

    /**
     * Cuándo se registró.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ExpenseMovement setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
