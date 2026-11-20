// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * AnnualReturn: La declaración anual de una persona moral del régimen general, desde su contabilidad: un papel de trabajo para su contador.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturn {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El ejercicio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * El último mes calculado.
     */
    @JsonProperty("through_month")
    private Long throughMonth;

    /**
     * true si es una estimación: el año sigue o through_month es menor que 12.
     */
    @JsonProperty("estimated")
    private Boolean estimated;

    /**
     * La utilidad contable (negativa si es pérdida) antes de la conciliación.
     */
    @JsonProperty("book_profit")
    private BigDecimal bookProfit;

    /**
     * Las partidas de la conciliación contable-fiscal.
     */
    @JsonProperty("items")
    private List<AnnualReturnItem> items;

    /**
     * Los ingresos acumulables.
     */
    @JsonProperty("taxable_income")
    private BigDecimal taxableIncome;

    /**
     * Los ingresos nominales del artículo 14: los acumulables sin el ajuste anual por inflación acumulable.
     */
    @JsonProperty("nominal_income")
    private BigDecimal nominalIncome;

    /**
     * Las deducciones autorizadas, después del límite del artículo 78-B.
     */
    @JsonProperty("deductions")
    private BigDecimal deductions;

    /**
     * true si le aplican los límites del Capítulo X (desde 2027: más de $50 millones de ingresos, con utilidad fiscal y sin excepción del artículo 78-E).
     */
    @JsonProperty("subject_to_78a")
    private Boolean subjectTo78a;

    /**
     * El límite del artículo 78-B; null si no aplica.
     */
    @JsonProperty("limit_78b")
    private AnnualReturnLimit78b limit78b;

    /**
     * La PTU pagada en el ejercicio (artículo 9).
     */
    @JsonProperty("ptu_paid")
    private BigDecimal ptuPaid;

    /**
     * La utilidad fiscal (0 si hubo pérdida).
     */
    @JsonProperty("tax_profit")
    private BigDecimal taxProfit;

    /**
     * La pérdida fiscal (0 si hubo utilidad).
     */
    @JsonProperty("tax_loss")
    private BigDecimal taxLoss;

    /**
     * La pérdida de este año actualizada al último mes del ejercicio (artículo 57), lista para el siguiente.
     */
    @JsonProperty("new_loss")
    private AnnualReturnNewLoss newLoss;

    /**
     * Las pérdidas de ejercicios anteriores, de la más vieja a la más nueva.
     */
    @JsonProperty("losses")
    private AnnualReturnLosses losses;

    /**
     * El resultado fiscal.
     */
    @JsonProperty("tax_result")
    private BigDecimal taxResult;

    /**
     * El ISR del ejercicio: 30% del resultado fiscal.
     */
    @JsonProperty("income_tax")
    private BigDecimal incomeTax;

    /**
     * Los pagos provisionales del ejercicio.
     */
    @JsonProperty("provisional_payments")
    private BigDecimal provisionalPayments;

    /**
     * Los meses sin pago provisional capturado ni leído del SAT.
     */
    @JsonProperty("missing_provisional_months")
    private List<Long> missingProvisionalMonths;

    /**
     * El ISR que le retuvieron.
     */
    @JsonProperty("withheld_tax")
    private BigDecimal withheldTax;

    /**
     * Positivo: ISR a cargo. Negativo: saldo a favor.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * El coeficiente de utilidad para los pagos provisionales del año siguiente (artículo 14), al diezmilésimo. null sin utilidad fiscal: se usa el del último ejercicio que la tuvo, de hasta cinco años atrás.
     */
    @JsonProperty("profit_ratio")
    private BigDecimal profitRatio;

    /**
     * La base de la PTU.
     */
    @JsonProperty("ptu")
    private AnnualReturnPtu ptu;

    /**
     * El ISR del artículo 10 (dividendos que no salieron de la CUFIN, de este año y los dos anteriores) acreditado contra el ISR del ejercicio; ya restado en balance.
     */
    @JsonProperty("dividend_tax_credited")
    private BigDecimal dividendTaxCredited;

    /**
     * La utilidad fiscal neta.
     */
    @JsonProperty("net_tax_profit")
    private AnnualReturnNetTaxProfit netTaxProfit;

    /**
     * La CUFIN (artículo 77) y la CUCA (artículo 78) del año, con sus dividendos y movimientos de capital.
     */
    @JsonProperty("tax_accounts")
    private AnnualReturnTaxAccounts taxAccounts;

    /**
     * Lo que pasa al año siguiente: las pérdidas que quedan (con la de este año) y desde 2027 las deducciones pendientes del artículo 78-B.
     */
    @JsonProperty("next_year")
    private AnnualReturnNextYear nextYear;

    /**
     * Lo capturado con POST /v1/accounting/annual_returns/{year}.
     */
    @JsonProperty("captured")
    private AnnualReturnCaptured captured;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AnnualReturn setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AnnualReturn setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public AnnualReturn setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio.
     */
    public Long getYear() {
        return year;
    }

    public AnnualReturn setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * El último mes calculado.
     */
    public Long getThroughMonth() {
        return throughMonth;
    }

    public AnnualReturn setThroughMonth(Long throughMonth) {
        this.throughMonth = throughMonth;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setThroughMonth(long throughMonth) {
        return setThroughMonth(Long.valueOf(throughMonth));
    }

    /**
     * true si es una estimación: el año sigue o through_month es menor que 12.
     */
    public Boolean getEstimated() {
        return estimated;
    }

    public AnnualReturn setEstimated(Boolean estimated) {
        this.estimated = estimated;
        return this;
    }

    /**
     * La utilidad contable (negativa si es pérdida) antes de la conciliación.
     */
    public BigDecimal getBookProfit() {
        return bookProfit;
    }

    public AnnualReturn setBookProfit(BigDecimal bookProfit) {
        this.bookProfit = bookProfit;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setBookProfit(double bookProfit) {
        return setBookProfit(BigDecimal.valueOf(bookProfit));
    }

    /**
     * Las partidas de la conciliación contable-fiscal.
     */
    public List<AnnualReturnItem> getItems() {
        return items;
    }

    public AnnualReturn setItems(List<AnnualReturnItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Los ingresos acumulables.
     */
    public BigDecimal getTaxableIncome() {
        return taxableIncome;
    }

    public AnnualReturn setTaxableIncome(BigDecimal taxableIncome) {
        this.taxableIncome = taxableIncome;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setTaxableIncome(double taxableIncome) {
        return setTaxableIncome(BigDecimal.valueOf(taxableIncome));
    }

    /**
     * Los ingresos nominales del artículo 14: los acumulables sin el ajuste anual por inflación acumulable.
     */
    public BigDecimal getNominalIncome() {
        return nominalIncome;
    }

    public AnnualReturn setNominalIncome(BigDecimal nominalIncome) {
        this.nominalIncome = nominalIncome;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setNominalIncome(double nominalIncome) {
        return setNominalIncome(BigDecimal.valueOf(nominalIncome));
    }

    /**
     * Las deducciones autorizadas, después del límite del artículo 78-B.
     */
    public BigDecimal getDeductions() {
        return deductions;
    }

    public AnnualReturn setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setDeductions(double deductions) {
        return setDeductions(BigDecimal.valueOf(deductions));
    }

    /**
     * true si le aplican los límites del Capítulo X (desde 2027: más de $50 millones de ingresos, con utilidad fiscal y sin excepción del artículo 78-E).
     */
    public Boolean getSubjectTo78a() {
        return subjectTo78a;
    }

    public AnnualReturn setSubjectTo78a(Boolean subjectTo78a) {
        this.subjectTo78a = subjectTo78a;
        return this;
    }

    /**
     * El límite del artículo 78-B; null si no aplica.
     */
    public AnnualReturnLimit78b getLimit78b() {
        return limit78b;
    }

    public AnnualReturn setLimit78b(AnnualReturnLimit78b limit78b) {
        this.limit78b = limit78b;
        return this;
    }

    /**
     * La PTU pagada en el ejercicio (artículo 9).
     */
    public BigDecimal getPtuPaid() {
        return ptuPaid;
    }

    public AnnualReturn setPtuPaid(BigDecimal ptuPaid) {
        this.ptuPaid = ptuPaid;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setPtuPaid(double ptuPaid) {
        return setPtuPaid(BigDecimal.valueOf(ptuPaid));
    }

    /**
     * La utilidad fiscal (0 si hubo pérdida).
     */
    public BigDecimal getTaxProfit() {
        return taxProfit;
    }

    public AnnualReturn setTaxProfit(BigDecimal taxProfit) {
        this.taxProfit = taxProfit;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setTaxProfit(double taxProfit) {
        return setTaxProfit(BigDecimal.valueOf(taxProfit));
    }

    /**
     * La pérdida fiscal (0 si hubo utilidad).
     */
    public BigDecimal getTaxLoss() {
        return taxLoss;
    }

    public AnnualReturn setTaxLoss(BigDecimal taxLoss) {
        this.taxLoss = taxLoss;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setTaxLoss(double taxLoss) {
        return setTaxLoss(BigDecimal.valueOf(taxLoss));
    }

    /**
     * La pérdida de este año actualizada al último mes del ejercicio (artículo 57), lista para el siguiente.
     */
    public AnnualReturnNewLoss getNewLoss() {
        return newLoss;
    }

    public AnnualReturn setNewLoss(AnnualReturnNewLoss newLoss) {
        this.newLoss = newLoss;
        return this;
    }

    /**
     * Las pérdidas de ejercicios anteriores, de la más vieja a la más nueva.
     */
    public AnnualReturnLosses getLosses() {
        return losses;
    }

    public AnnualReturn setLosses(AnnualReturnLosses losses) {
        this.losses = losses;
        return this;
    }

    /**
     * El resultado fiscal.
     */
    public BigDecimal getTaxResult() {
        return taxResult;
    }

    public AnnualReturn setTaxResult(BigDecimal taxResult) {
        this.taxResult = taxResult;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setTaxResult(double taxResult) {
        return setTaxResult(BigDecimal.valueOf(taxResult));
    }

    /**
     * El ISR del ejercicio: 30% del resultado fiscal.
     */
    public BigDecimal getIncomeTax() {
        return incomeTax;
    }

    public AnnualReturn setIncomeTax(BigDecimal incomeTax) {
        this.incomeTax = incomeTax;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setIncomeTax(double incomeTax) {
        return setIncomeTax(BigDecimal.valueOf(incomeTax));
    }

    /**
     * Los pagos provisionales del ejercicio.
     */
    public BigDecimal getProvisionalPayments() {
        return provisionalPayments;
    }

    public AnnualReturn setProvisionalPayments(BigDecimal provisionalPayments) {
        this.provisionalPayments = provisionalPayments;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setProvisionalPayments(double provisionalPayments) {
        return setProvisionalPayments(BigDecimal.valueOf(provisionalPayments));
    }

    /**
     * Los meses sin pago provisional capturado ni leído del SAT.
     */
    public List<Long> getMissingProvisionalMonths() {
        return missingProvisionalMonths;
    }

    public AnnualReturn setMissingProvisionalMonths(List<Long> missingProvisionalMonths) {
        this.missingProvisionalMonths = missingProvisionalMonths;
        return this;
    }

    /**
     * El ISR que le retuvieron.
     */
    public BigDecimal getWithheldTax() {
        return withheldTax;
    }

    public AnnualReturn setWithheldTax(BigDecimal withheldTax) {
        this.withheldTax = withheldTax;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setWithheldTax(double withheldTax) {
        return setWithheldTax(BigDecimal.valueOf(withheldTax));
    }

    /**
     * Positivo: ISR a cargo. Negativo: saldo a favor.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public AnnualReturn setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }

    /**
     * El coeficiente de utilidad para los pagos provisionales del año siguiente (artículo 14), al diezmilésimo. null sin utilidad fiscal: se usa el del último ejercicio que la tuvo, de hasta cinco años atrás.
     */
    public BigDecimal getProfitRatio() {
        return profitRatio;
    }

    public AnnualReturn setProfitRatio(BigDecimal profitRatio) {
        this.profitRatio = profitRatio;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setProfitRatio(double profitRatio) {
        return setProfitRatio(BigDecimal.valueOf(profitRatio));
    }

    /**
     * La base de la PTU.
     */
    public AnnualReturnPtu getPtu() {
        return ptu;
    }

    public AnnualReturn setPtu(AnnualReturnPtu ptu) {
        this.ptu = ptu;
        return this;
    }

    /**
     * El ISR del artículo 10 (dividendos que no salieron de la CUFIN, de este año y los dos anteriores) acreditado contra el ISR del ejercicio; ya restado en balance.
     */
    public BigDecimal getDividendTaxCredited() {
        return dividendTaxCredited;
    }

    public AnnualReturn setDividendTaxCredited(BigDecimal dividendTaxCredited) {
        this.dividendTaxCredited = dividendTaxCredited;
        return this;
    }

    @JsonIgnore
    public AnnualReturn setDividendTaxCredited(double dividendTaxCredited) {
        return setDividendTaxCredited(BigDecimal.valueOf(dividendTaxCredited));
    }

    /**
     * La utilidad fiscal neta.
     */
    public AnnualReturnNetTaxProfit getNetTaxProfit() {
        return netTaxProfit;
    }

    public AnnualReturn setNetTaxProfit(AnnualReturnNetTaxProfit netTaxProfit) {
        this.netTaxProfit = netTaxProfit;
        return this;
    }

    /**
     * La CUFIN (artículo 77) y la CUCA (artículo 78) del año, con sus dividendos y movimientos de capital.
     */
    public AnnualReturnTaxAccounts getTaxAccounts() {
        return taxAccounts;
    }

    public AnnualReturn setTaxAccounts(AnnualReturnTaxAccounts taxAccounts) {
        this.taxAccounts = taxAccounts;
        return this;
    }

    /**
     * Lo que pasa al año siguiente: las pérdidas que quedan (con la de este año) y desde 2027 las deducciones pendientes del artículo 78-B.
     */
    public AnnualReturnNextYear getNextYear() {
        return nextYear;
    }

    public AnnualReturn setNextYear(AnnualReturnNextYear nextYear) {
        this.nextYear = nextYear;
        return this;
    }

    /**
     * Lo capturado con POST /v1/accounting/annual_returns/{year}.
     */
    public AnnualReturnCaptured getCaptured() {
        return captured;
    }

    public AnnualReturn setCaptured(AnnualReturnCaptured captured) {
        this.captured = captured;
        return this;
    }
}
