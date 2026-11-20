// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayoutTransfer: Una transferencia SPEI de un pago a proveedores: a una cuenta de un proveedor, con las facturas que paga, su clave de rastreo y su CEP.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayoutTransfer {
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
     * El emisor (iss_…) que paga.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El pago (pyo_…) al que pertenece.
     */
    @JsonProperty("payout")
    private String payout;

    /**
     * El RFC del proveedor.
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

    /**
     * El nombre del proveedor, o null.
     */
    @JsonProperty("supplier_name")
    private String supplierName;

    /**
     * La cuenta del proveedor (pya_…) a la que va.
     */
    @JsonProperty("payee_account")
    private String payeeAccount;

    /**
     * La CLABE de 18 dígitos a la que va.
     */
    @JsonProperty("clabe")
    private String clabe;

    /**
     * El banco de la CLABE, o null.
     */
    @JsonProperty("bank")
    private String bank;

    /**
     * Cuánto, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Siempre MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * El concepto que ve el proveedor en su banco.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * La referencia numérica SPEI, o null.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * queued (por salir), sending, in_transit (en camino), unknown (por confirmar con el banco), succeeded (llegó), failed (no salió), returning (el banco la está devolviendo), returned (la devolvieron), not_sent o removed (se quitó del pago).
     * <p>
     * Valores: queued, sending, in_transit, unknown, succeeded, failed, returning, returned, not_sent, removed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La clave de rastreo SPEI, o null antes de salir.
     */
    @JsonProperty("tracking_key")
    private String trackingKey;

    /**
     * La liga al CEP de Banxico, o null mientras no llega.
     */
    @JsonProperty("cep_url")
    private String cepUrl;

    /**
     * Por qué no salió o por qué la devolvieron, o null.
     */
    @JsonProperty("failure_reason")
    private String failureReason;

    /**
     * Lo que paga: cada factura (uuid) con su monto en su moneda, o un pago sin factura (without_invoice, con description).
     */
    @JsonProperty("invoices")
    private List<PayoutTransferInvoice> invoices;

    /**
     * Cuándo salió, o null.
     */
    @JsonProperty("sent_at")
    private String sentAt;

    /**
     * Cuándo llegó o se resolvió, o null.
     */
    @JsonProperty("settled_at")
    private String settledAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public PayoutTransfer setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayoutTransfer setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayoutTransfer setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…) que paga.
     */
    public String getIssuer() {
        return issuer;
    }

    public PayoutTransfer setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El pago (pyo_…) al que pertenece.
     */
    public String getPayout() {
        return payout;
    }

    public PayoutTransfer setPayout(String payout) {
        this.payout = payout;
        return this;
    }

    /**
     * El RFC del proveedor.
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public PayoutTransfer setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }

    /**
     * El nombre del proveedor, o null.
     */
    public String getSupplierName() {
        return supplierName;
    }

    public PayoutTransfer setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }

    /**
     * La cuenta del proveedor (pya_…) a la que va.
     */
    public String getPayeeAccount() {
        return payeeAccount;
    }

    public PayoutTransfer setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
        return this;
    }

    /**
     * La CLABE de 18 dígitos a la que va.
     */
    public String getClabe() {
        return clabe;
    }

    public PayoutTransfer setClabe(String clabe) {
        this.clabe = clabe;
        return this;
    }

    /**
     * El banco de la CLABE, o null.
     */
    public String getBank() {
        return bank;
    }

    public PayoutTransfer setBank(String bank) {
        this.bank = bank;
        return this;
    }

    /**
     * Cuánto, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayoutTransfer setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayoutTransfer setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Siempre MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public PayoutTransfer setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * El concepto que ve el proveedor en su banco.
     */
    public String getConcept() {
        return concept;
    }

    public PayoutTransfer setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * La referencia numérica SPEI, o null.
     */
    public String getReference() {
        return reference;
    }

    public PayoutTransfer setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * queued (por salir), sending, in_transit (en camino), unknown (por confirmar con el banco), succeeded (llegó), failed (no salió), returning (el banco la está devolviendo), returned (la devolvieron), not_sent o removed (se quitó del pago).
     * <p>
     * Valores: queued, sending, in_transit, unknown, succeeded, failed, returning, returned, not_sent, removed.
     */
    public String getStatus() {
        return status;
    }

    public PayoutTransfer setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La clave de rastreo SPEI, o null antes de salir.
     */
    public String getTrackingKey() {
        return trackingKey;
    }

    public PayoutTransfer setTrackingKey(String trackingKey) {
        this.trackingKey = trackingKey;
        return this;
    }

    /**
     * La liga al CEP de Banxico, o null mientras no llega.
     */
    public String getCepUrl() {
        return cepUrl;
    }

    public PayoutTransfer setCepUrl(String cepUrl) {
        this.cepUrl = cepUrl;
        return this;
    }

    /**
     * Por qué no salió o por qué la devolvieron, o null.
     */
    public String getFailureReason() {
        return failureReason;
    }

    public PayoutTransfer setFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * Lo que paga: cada factura (uuid) con su monto en su moneda, o un pago sin factura (without_invoice, con description).
     */
    public List<PayoutTransferInvoice> getInvoices() {
        return invoices;
    }

    public PayoutTransfer setInvoices(List<PayoutTransferInvoice> invoices) {
        this.invoices = invoices;
        return this;
    }

    /**
     * Cuándo salió, o null.
     */
    public String getSentAt() {
        return sentAt;
    }

    public PayoutTransfer setSentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Cuándo llegó o se resolvió, o null.
     */
    public String getSettledAt() {
        return settledAt;
    }

    public PayoutTransfer setSettledAt(String settledAt) {
        this.settledAt = settledAt;
        return this;
    }
}
