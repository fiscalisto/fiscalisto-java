// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * BankTransaction: Un depósito de la cuenta del emisor, y las facturas que pagó.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankTransaction {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El día del depósito (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * Lo depositado, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El concepto del banco.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La referencia o clave de rastreo, o null.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * Los últimos 4 dígitos de la cuenta, o null.
     */
    @JsonProperty("account")
    private String account;

    /**
     * El RFC de quien depositó, si se sabe.
     */
    @JsonProperty("payer_tax_id")
    private String payerTaxId;

    /**
     * open (sin conciliar), matched (pagó facturas) o classified (no es de una factura).
     * <p>
     * Valores: open, matched, classified.
     */
    @JsonProperty("status")
    private String status;

    /**
     * classified: venta (aún sin facturar), prestamo, traspaso o devolucion; si no, null.
     * <p>
     * Valores: venta, prestamo, traspaso, devolucion.
     */
    @JsonProperty("classification")
    private String classification;

    /**
     * Una nota al clasificarlo, o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Las facturas (inv_…) que pagó, si está conciliado.
     */
    @JsonProperty("invoices")
    private List<String> invoices;

    /**
     * El complemento de pago (inv_…) timbrado con él, o null.
     */
    @JsonProperty("payment")
    private String payment;

    /**
     * Si está abierto, las facturas que parece pagar (por monto, RFC, folio en el concepto y fecha): invoices, lo que toca a cada una (amounts), method, confidence (high o medium) y por qué (reasons). null si ninguna encaja.
     */
    @JsonProperty("suggested_match")
    private BankTransactionSuggestedMatch suggestedMatch;

    /**
     * Cuándo se mandó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public BankTransaction setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public BankTransaction setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public BankTransaction setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public BankTransaction setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El día del depósito (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public BankTransaction setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Lo depositado, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public BankTransaction setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public BankTransaction setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El concepto del banco.
     */
    public String getDescription() {
        return description;
    }

    public BankTransaction setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * La referencia o clave de rastreo, o null.
     */
    public String getReference() {
        return reference;
    }

    public BankTransaction setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Los últimos 4 dígitos de la cuenta, o null.
     */
    public String getAccount() {
        return account;
    }

    public BankTransaction setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El RFC de quien depositó, si se sabe.
     */
    public String getPayerTaxId() {
        return payerTaxId;
    }

    public BankTransaction setPayerTaxId(String payerTaxId) {
        this.payerTaxId = payerTaxId;
        return this;
    }

    /**
     * open (sin conciliar), matched (pagó facturas) o classified (no es de una factura).
     * <p>
     * Valores: open, matched, classified.
     */
    public String getStatus() {
        return status;
    }

    public BankTransaction setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * classified: venta (aún sin facturar), prestamo, traspaso o devolucion; si no, null.
     * <p>
     * Valores: venta, prestamo, traspaso, devolucion.
     */
    public String getClassification() {
        return classification;
    }

    public BankTransaction setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Una nota al clasificarlo, o null.
     */
    public String getNote() {
        return note;
    }

    public BankTransaction setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Las facturas (inv_…) que pagó, si está conciliado.
     */
    public List<String> getInvoices() {
        return invoices;
    }

    public BankTransaction setInvoices(List<String> invoices) {
        this.invoices = invoices;
        return this;
    }

    /**
     * El complemento de pago (inv_…) timbrado con él, o null.
     */
    public String getPayment() {
        return payment;
    }

    public BankTransaction setPayment(String payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Si está abierto, las facturas que parece pagar (por monto, RFC, folio en el concepto y fecha): invoices, lo que toca a cada una (amounts), method, confidence (high o medium) y por qué (reasons). null si ninguna encaja.
     */
    public BankTransactionSuggestedMatch getSuggestedMatch() {
        return suggestedMatch;
    }

    public BankTransaction setSuggestedMatch(BankTransactionSuggestedMatch suggestedMatch) {
        this.suggestedMatch = suggestedMatch;
        return this;
    }

    /**
     * Cuándo se mandó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public BankTransaction setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
