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
 * TaxDiscrepancy: La discrepancia fiscal de una persona física en un año (art. 91 LISR): lo que gastó y recibió en sus cuentas contra lo que declaró.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxDiscrepancy {
    /**
     * Siempre tax_discrepancy.
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…), una persona física.
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * Su RFC (13 caracteres).
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * El ejercicio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Gastos con CFDI a su nombre (recibidos, sin cancelados, menos notas de crédito).
     */
    @JsonProperty("spending")
    private BigDecimal spending;

    /**
     * Depósitos en sus cuentas (de los estados de cuenta en Conciliación).
     */
    @JsonProperty("deposits")
    private BigDecimal deposits;

    /**
     * Traspasos entre sus cuentas, que la ley deja fuera (art. 91 LISR).
     */
    @JsonProperty("own_transfers")
    private BigDecimal ownTransfers;

    /**
     * Préstamos que clasificó.
     */
    @JsonProperty("loans")
    private BigDecimal loans;

    /**
     * Devoluciones que clasificó.
     */
    @JsonProperty("refunds")
    private BigDecimal refunds;

    /**
     * Erogaciones: gastos más depósitos, menos traspasos.
     */
    @JsonProperty("outflows")
    private BigDecimal outflows;

    /**
     * Los ingresos declarados que se restan.
     */
    @JsonProperty("declared_income")
    private BigDecimal declaredIncome;

    /**
     * De dónde salen: tax_returns (sus declaraciones), payroll (sus recibos de nómina), declared_income (el que mandó) o none.
     * <p>
     * Valores: tax_returns, payroll, declared_income, none.
     */
    @JsonProperty("declared_income_source")
    private String declaredIncomeSource;

    /**
     * Erogaciones menos préstamos, devoluciones e ingresos declarados, si es positivo: lo que el SAT presumiría ingreso.
     */
    @JsonProperty("discrepancy")
    private BigDecimal discrepancy;

    /**
     * Depósitos sin clasificar en Conciliación («Por aclarar»): cada uno que explique baja la discrepancia.
     */
    @JsonProperty("unclassified_deposits")
    private BigDecimal unclassifiedDeposits;

    /**
     * Si sus préstamos pasan de $600,000 en el año: solo cuentan si los informó en su declaración anual (art. 90 LISR).
     */
    @JsonProperty("loans_to_report")
    private Boolean loansToReport;

    /**
     * Si hay estados de cuenta del año; sin ellos solo cuentan los gastos con CFDI.
     */
    @JsonProperty("bank_statements")
    private Boolean bankStatements;

    /**
     * El cálculo mes por mes.
     */
    @JsonProperty("months")
    private List<TaxDiscrepancyMonth> months;

    /**
     * Siempre tax_discrepancy.
     */
    public String getObject() {
        return object;
    }

    public TaxDiscrepancy setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public TaxDiscrepancy setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…), una persona física.
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public TaxDiscrepancy setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public TaxDiscrepancy setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public TaxDiscrepancy setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Su RFC (13 caracteres).
     */
    public String getTaxId() {
        return taxId;
    }

    public TaxDiscrepancy setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El ejercicio.
     */
    public Long getYear() {
        return year;
    }

    public TaxDiscrepancy setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Gastos con CFDI a su nombre (recibidos, sin cancelados, menos notas de crédito).
     */
    public BigDecimal getSpending() {
        return spending;
    }

    public TaxDiscrepancy setSpending(BigDecimal spending) {
        this.spending = spending;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setSpending(double spending) {
        return setSpending(BigDecimal.valueOf(spending));
    }

    /**
     * Depósitos en sus cuentas (de los estados de cuenta en Conciliación).
     */
    public BigDecimal getDeposits() {
        return deposits;
    }

    public TaxDiscrepancy setDeposits(BigDecimal deposits) {
        this.deposits = deposits;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setDeposits(double deposits) {
        return setDeposits(BigDecimal.valueOf(deposits));
    }

    /**
     * Traspasos entre sus cuentas, que la ley deja fuera (art. 91 LISR).
     */
    public BigDecimal getOwnTransfers() {
        return ownTransfers;
    }

    public TaxDiscrepancy setOwnTransfers(BigDecimal ownTransfers) {
        this.ownTransfers = ownTransfers;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setOwnTransfers(double ownTransfers) {
        return setOwnTransfers(BigDecimal.valueOf(ownTransfers));
    }

    /**
     * Préstamos que clasificó.
     */
    public BigDecimal getLoans() {
        return loans;
    }

    public TaxDiscrepancy setLoans(BigDecimal loans) {
        this.loans = loans;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setLoans(double loans) {
        return setLoans(BigDecimal.valueOf(loans));
    }

    /**
     * Devoluciones que clasificó.
     */
    public BigDecimal getRefunds() {
        return refunds;
    }

    public TaxDiscrepancy setRefunds(BigDecimal refunds) {
        this.refunds = refunds;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setRefunds(double refunds) {
        return setRefunds(BigDecimal.valueOf(refunds));
    }

    /**
     * Erogaciones: gastos más depósitos, menos traspasos.
     */
    public BigDecimal getOutflows() {
        return outflows;
    }

    public TaxDiscrepancy setOutflows(BigDecimal outflows) {
        this.outflows = outflows;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setOutflows(double outflows) {
        return setOutflows(BigDecimal.valueOf(outflows));
    }

    /**
     * Los ingresos declarados que se restan.
     */
    public BigDecimal getDeclaredIncome() {
        return declaredIncome;
    }

    public TaxDiscrepancy setDeclaredIncome(BigDecimal declaredIncome) {
        this.declaredIncome = declaredIncome;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setDeclaredIncome(double declaredIncome) {
        return setDeclaredIncome(BigDecimal.valueOf(declaredIncome));
    }

    /**
     * De dónde salen: tax_returns (sus declaraciones), payroll (sus recibos de nómina), declared_income (el que mandó) o none.
     * <p>
     * Valores: tax_returns, payroll, declared_income, none.
     */
    public String getDeclaredIncomeSource() {
        return declaredIncomeSource;
    }

    public TaxDiscrepancy setDeclaredIncomeSource(String declaredIncomeSource) {
        this.declaredIncomeSource = declaredIncomeSource;
        return this;
    }

    /**
     * Erogaciones menos préstamos, devoluciones e ingresos declarados, si es positivo: lo que el SAT presumiría ingreso.
     */
    public BigDecimal getDiscrepancy() {
        return discrepancy;
    }

    public TaxDiscrepancy setDiscrepancy(BigDecimal discrepancy) {
        this.discrepancy = discrepancy;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setDiscrepancy(double discrepancy) {
        return setDiscrepancy(BigDecimal.valueOf(discrepancy));
    }

    /**
     * Depósitos sin clasificar en Conciliación («Por aclarar»): cada uno que explique baja la discrepancia.
     */
    public BigDecimal getUnclassifiedDeposits() {
        return unclassifiedDeposits;
    }

    public TaxDiscrepancy setUnclassifiedDeposits(BigDecimal unclassifiedDeposits) {
        this.unclassifiedDeposits = unclassifiedDeposits;
        return this;
    }

    @JsonIgnore
    public TaxDiscrepancy setUnclassifiedDeposits(double unclassifiedDeposits) {
        return setUnclassifiedDeposits(BigDecimal.valueOf(unclassifiedDeposits));
    }

    /**
     * Si sus préstamos pasan de $600,000 en el año: solo cuentan si los informó en su declaración anual (art. 90 LISR).
     */
    public Boolean getLoansToReport() {
        return loansToReport;
    }

    public TaxDiscrepancy setLoansToReport(Boolean loansToReport) {
        this.loansToReport = loansToReport;
        return this;
    }

    /**
     * Si hay estados de cuenta del año; sin ellos solo cuentan los gastos con CFDI.
     */
    public Boolean getBankStatements() {
        return bankStatements;
    }

    public TaxDiscrepancy setBankStatements(Boolean bankStatements) {
        this.bankStatements = bankStatements;
        return this;
    }

    /**
     * El cálculo mes por mes.
     */
    public List<TaxDiscrepancyMonth> getMonths() {
        return months;
    }

    public TaxDiscrepancy setMonths(List<TaxDiscrepancyMonth> months) {
        this.months = months;
        return this;
    }
}
