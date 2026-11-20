// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * GeneralLedgerAccountMovement: GeneralLedgerAccountMovement.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralLedgerAccountMovement {
    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    @JsonProperty("date")
    private String date;

    /**
     * La póliza (el mismo id de GET /v1/accounting/journal_entries).
     */
    @JsonProperty("journal_entry")
    private String journalEntry;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: invoice, payment_received, payment_made, payroll, employee_expenses, depreciation, manual, asset_disposal, bank_identification.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El cargo.
     */
    @JsonProperty("debit")
    private BigDecimal debit;

    /**
     * El abono.
     */
    @JsonProperty("credit")
    private BigDecimal credit;

    /**
     * El saldo de la cuenta después de este movimiento, en su naturaleza.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    public String getDate() {
        return date;
    }

    public GeneralLedgerAccountMovement setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * La póliza (el mismo id de GET /v1/accounting/journal_entries).
     */
    public String getJournalEntry() {
        return journalEntry;
    }

    public GeneralLedgerAccountMovement setJournalEntry(String journalEntry) {
        this.journalEntry = journalEntry;
        return this;
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: invoice, payment_received, payment_made, payroll, employee_expenses, depreciation, manual, asset_disposal, bank_identification.
     */
    public String getType() {
        return type;
    }

    public GeneralLedgerAccountMovement setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public GeneralLedgerAccountMovement setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public GeneralLedgerAccountMovement setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public GeneralLedgerAccountMovement setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * El cargo.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public GeneralLedgerAccountMovement setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public GeneralLedgerAccountMovement setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public GeneralLedgerAccountMovement setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public GeneralLedgerAccountMovement setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }

    /**
     * El saldo de la cuenta después de este movimiento, en su naturaleza.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public GeneralLedgerAccountMovement setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public GeneralLedgerAccountMovement setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }
}
