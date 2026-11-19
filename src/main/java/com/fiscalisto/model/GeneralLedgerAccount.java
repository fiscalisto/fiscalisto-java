// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * GeneralLedgerAccount: GeneralLedgerAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralLedgerAccount {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Número de empleado (NumEmpleado).
     */
    @JsonProperty("number")
    private String number;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El código agrupador del SAT.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * debit (deudora) o credit (acreedora).
     * <p>
     * Valores: debit, credit.
     */
    @JsonProperty("nature")
    private String nature;

    /**
     * El saldo al empezar el mes.
     */
    @JsonProperty("opening_balance")
    private BigDecimal openingBalance;

    /**
     * Los cargos del mes.
     */
    @JsonProperty("debit")
    private BigDecimal debit;

    /**
     * Los abonos del mes.
     */
    @JsonProperty("credit")
    private BigDecimal credit;

    /**
     * El saldo al terminar el mes.
     */
    @JsonProperty("closing_balance")
    private BigDecimal closingBalance;

    /**
     * Cada cargo y abono de la cuenta en el periodo, en el orden de sus pólizas, con el saldo que deja.
     */
    @JsonProperty("movements")
    private List<GeneralLedgerAccountMovement> movements;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public GeneralLedgerAccount setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Número de empleado (NumEmpleado).
     */
    public String getNumber() {
        return number;
    }

    public GeneralLedgerAccount setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public GeneralLedgerAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public GeneralLedgerAccount setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * debit (deudora) o credit (acreedora).
     * <p>
     * Valores: debit, credit.
     */
    public String getNature() {
        return nature;
    }

    public GeneralLedgerAccount setNature(String nature) {
        this.nature = nature;
        return this;
    }

    /**
     * El saldo al empezar el mes.
     */
    public BigDecimal getOpeningBalance() {
        return openingBalance;
    }

    public GeneralLedgerAccount setOpeningBalance(BigDecimal openingBalance) {
        this.openingBalance = openingBalance;
        return this;
    }

    @JsonIgnore
    public GeneralLedgerAccount setOpeningBalance(double openingBalance) {
        return setOpeningBalance(BigDecimal.valueOf(openingBalance));
    }

    /**
     * Los cargos del mes.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public GeneralLedgerAccount setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public GeneralLedgerAccount setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * Los abonos del mes.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public GeneralLedgerAccount setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public GeneralLedgerAccount setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }

    /**
     * El saldo al terminar el mes.
     */
    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    public GeneralLedgerAccount setClosingBalance(BigDecimal closingBalance) {
        this.closingBalance = closingBalance;
        return this;
    }

    @JsonIgnore
    public GeneralLedgerAccount setClosingBalance(double closingBalance) {
        return setClosingBalance(BigDecimal.valueOf(closingBalance));
    }

    /**
     * Cada cargo y abono de la cuenta en el periodo, en el orden de sus pólizas, con el saldo que deja.
     */
    public List<GeneralLedgerAccountMovement> getMovements() {
        return movements;
    }

    public GeneralLedgerAccount setMovements(List<GeneralLedgerAccountMovement> movements) {
        this.movements = movements;
        return this;
    }
}
