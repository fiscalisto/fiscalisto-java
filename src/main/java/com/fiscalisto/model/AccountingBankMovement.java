// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AccountingBankMovement: Un movimiento de banco que ninguna factura explica (un retiro, o un depósito clasificado como préstamo, traspaso o devolución) y su póliza de ingresos o egresos contra Bancos, cuando ya se registró.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountingBankMovement {
    /**
     * btx_… para un depósito (el mismo de la conciliación) o bwd_… para un retiro.
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
     * deposit (depósito) o withdrawal (retiro).
     * <p>
     * Valores: deposit, withdrawal.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * El día del movimiento (AAAA-MM-DD), que es el de su póliza.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El texto del banco, como vino en el estado de cuenta.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La referencia o clave de rastreo, si la trae.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * El importe, en positivo.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El banco del estado de cuenta.
     */
    @JsonProperty("bank")
    private String bank;

    /**
     * Los últimos 4 dígitos de la cuenta, si se sabe.
     */
    @JsonProperty("bank_account")
    private String bankAccount;

    /**
     * Un depósito: lo que dijo la conciliación (loan, transfer o refund). null en un retiro.
     * <p>
     * Valores: loan, transfer, refund.
     */
    @JsonProperty("classification")
    private String classification;

    /**
     * pending (por registrar), posted (con póliza), paid_invoices (pagó facturas que ya están en la contabilidad) o ignored (no se registra).
     * <p>
     * Valores: pending, posted, paid_invoices, ignored.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Su póliza (mje_…), que se ve y se corrige como cualquier póliza capturada, o null.
     */
    @JsonProperty("manual_entry")
    private String manualEntry;

    /**
     * El número de la cuenta que va contra Bancos en su póliza, o null.
     */
    @JsonProperty("account")
    private String account;

    /**
     * La cuenta que sugiere un movimiento anterior con el mismo texto registrado con remember, o null.
     */
    @JsonProperty("suggested_account")
    private String suggestedAccount;

    /**
     * btx_… para un depósito (el mismo de la conciliación) o bwd_… para un retiro.
     */
    public String getId() {
        return id;
    }

    public AccountingBankMovement setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AccountingBankMovement setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AccountingBankMovement setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public AccountingBankMovement setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * deposit (depósito) o withdrawal (retiro).
     * <p>
     * Valores: deposit, withdrawal.
     */
    public String getDirection() {
        return direction;
    }

    public AccountingBankMovement setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * El día del movimiento (AAAA-MM-DD), que es el de su póliza.
     */
    public String getDate() {
        return date;
    }

    public AccountingBankMovement setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El texto del banco, como vino en el estado de cuenta.
     */
    public String getDescription() {
        return description;
    }

    public AccountingBankMovement setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * La referencia o clave de rastreo, si la trae.
     */
    public String getReference() {
        return reference;
    }

    public AccountingBankMovement setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * El importe, en positivo.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AccountingBankMovement setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AccountingBankMovement setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El banco del estado de cuenta.
     */
    public String getBank() {
        return bank;
    }

    public AccountingBankMovement setBank(String bank) {
        this.bank = bank;
        return this;
    }

    /**
     * Los últimos 4 dígitos de la cuenta, si se sabe.
     */
    public String getBankAccount() {
        return bankAccount;
    }

    public AccountingBankMovement setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }

    /**
     * Un depósito: lo que dijo la conciliación (loan, transfer o refund). null en un retiro.
     * <p>
     * Valores: loan, transfer, refund.
     */
    public String getClassification() {
        return classification;
    }

    public AccountingBankMovement setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * pending (por registrar), posted (con póliza), paid_invoices (pagó facturas que ya están en la contabilidad) o ignored (no se registra).
     * <p>
     * Valores: pending, posted, paid_invoices, ignored.
     */
    public String getStatus() {
        return status;
    }

    public AccountingBankMovement setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Su póliza (mje_…), que se ve y se corrige como cualquier póliza capturada, o null.
     */
    public String getManualEntry() {
        return manualEntry;
    }

    public AccountingBankMovement setManualEntry(String manualEntry) {
        this.manualEntry = manualEntry;
        return this;
    }

    /**
     * El número de la cuenta que va contra Bancos en su póliza, o null.
     */
    public String getAccount() {
        return account;
    }

    public AccountingBankMovement setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * La cuenta que sugiere un movimiento anterior con el mismo texto registrado con remember, o null.
     */
    public String getSuggestedAccount() {
        return suggestedAccount;
    }

    public AccountingBankMovement setSuggestedAccount(String suggestedAccount) {
        this.suggestedAccount = suggestedAccount;
        return this;
    }
}
