// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InflationAdjustment: El ajuste anual por inflación de una persona moral (artículo 44 de la Ley del ISR), con el promedio de los saldos mensuales de sus créditos y sus deudas.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InflationAdjustment {
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
     * El primer mes del ejercicio (1, o el mes en que empezó si fue en el año).
     */
    @JsonProperty("from_month")
    private Long fromMonth;

    /**
     * El último mes calculado: 12, o uno anterior para una estimación.
     */
    @JsonProperty("through_month")
    private Long throughMonth;

    /**
     * Cuántos meses se promediaron.
     */
    @JsonProperty("months")
    private Long months;

    /**
     * Cada cuenta de balance con saldo en el ejercicio.
     */
    @JsonProperty("accounts")
    private List<InflationAdjustmentAccount> accounts;

    /**
     * Los créditos al último día de cada mes.
     */
    @JsonProperty("credits_by_month")
    private List<BigDecimal> creditsByMonth;

    /**
     * Las deudas al último día de cada mes.
     */
    @JsonProperty("debts_by_month")
    private List<BigDecimal> debtsByMonth;

    /**
     * El saldo promedio anual de los créditos.
     */
    @JsonProperty("average_credits")
    private BigDecimal averageCredits;

    /**
     * El saldo promedio anual de las deudas.
     */
    @JsonProperty("average_debts")
    private BigDecimal averageDebts;

    /**
     * La diferencia entre los dos promedios, en positivo.
     */
    @JsonProperty("difference")
    private BigDecimal difference;

    /**
     * El factor de ajuste anual: INPC del último mes entre el del último mes del ejercicio anterior, menos 1, al diezmilésimo. null sin INPC publicado.
     */
    @JsonProperty("factor")
    private BigDecimal factor;

    /**
     * El INPC de la base.
     */
    @JsonProperty("inpc_start")
    private BigDecimal inpcStart;

    /**
     * El INPC del último mes.
     */
    @JsonProperty("inpc_end")
    private BigDecimal inpcEnd;

    /**
     * De qué mes es inpc_end (AAAA-MM): diciembre, o el último publicado en una estimación.
     */
    @JsonProperty("inpc_end_month")
    private String inpcEndMonth;

    /**
     * true mientras no hay saldos de diciembre o INPC de diciembre: una estimación.
     */
    @JsonProperty("estimated")
    private Boolean estimated;

    /**
     * taxable (acumulable, art. 18 fr. X) cuando las deudas son mayores; deductible (art. 25 fr. VIII) cuando los créditos lo son.
     * <p>
     * Valores: taxable, deductible.
     */
    @JsonProperty("type")
    private String type;

    /**
     * El ajuste anual por inflación: difference × factor.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public InflationAdjustment setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public InflationAdjustment setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public InflationAdjustment setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio.
     */
    public Long getYear() {
        return year;
    }

    public InflationAdjustment setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * El primer mes del ejercicio (1, o el mes en que empezó si fue en el año).
     */
    public Long getFromMonth() {
        return fromMonth;
    }

    public InflationAdjustment setFromMonth(Long fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setFromMonth(long fromMonth) {
        return setFromMonth(Long.valueOf(fromMonth));
    }

    /**
     * El último mes calculado: 12, o uno anterior para una estimación.
     */
    public Long getThroughMonth() {
        return throughMonth;
    }

    public InflationAdjustment setThroughMonth(Long throughMonth) {
        this.throughMonth = throughMonth;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setThroughMonth(long throughMonth) {
        return setThroughMonth(Long.valueOf(throughMonth));
    }

    /**
     * Cuántos meses se promediaron.
     */
    public Long getMonths() {
        return months;
    }

    public InflationAdjustment setMonths(Long months) {
        this.months = months;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setMonths(long months) {
        return setMonths(Long.valueOf(months));
    }

    /**
     * Cada cuenta de balance con saldo en el ejercicio.
     */
    public List<InflationAdjustmentAccount> getAccounts() {
        return accounts;
    }

    public InflationAdjustment setAccounts(List<InflationAdjustmentAccount> accounts) {
        this.accounts = accounts;
        return this;
    }

    /**
     * Los créditos al último día de cada mes.
     */
    public List<BigDecimal> getCreditsByMonth() {
        return creditsByMonth;
    }

    public InflationAdjustment setCreditsByMonth(List<BigDecimal> creditsByMonth) {
        this.creditsByMonth = creditsByMonth;
        return this;
    }

    /**
     * Las deudas al último día de cada mes.
     */
    public List<BigDecimal> getDebtsByMonth() {
        return debtsByMonth;
    }

    public InflationAdjustment setDebtsByMonth(List<BigDecimal> debtsByMonth) {
        this.debtsByMonth = debtsByMonth;
        return this;
    }

    /**
     * El saldo promedio anual de los créditos.
     */
    public BigDecimal getAverageCredits() {
        return averageCredits;
    }

    public InflationAdjustment setAverageCredits(BigDecimal averageCredits) {
        this.averageCredits = averageCredits;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setAverageCredits(double averageCredits) {
        return setAverageCredits(BigDecimal.valueOf(averageCredits));
    }

    /**
     * El saldo promedio anual de las deudas.
     */
    public BigDecimal getAverageDebts() {
        return averageDebts;
    }

    public InflationAdjustment setAverageDebts(BigDecimal averageDebts) {
        this.averageDebts = averageDebts;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setAverageDebts(double averageDebts) {
        return setAverageDebts(BigDecimal.valueOf(averageDebts));
    }

    /**
     * La diferencia entre los dos promedios, en positivo.
     */
    public BigDecimal getDifference() {
        return difference;
    }

    public InflationAdjustment setDifference(BigDecimal difference) {
        this.difference = difference;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setDifference(double difference) {
        return setDifference(BigDecimal.valueOf(difference));
    }

    /**
     * El factor de ajuste anual: INPC del último mes entre el del último mes del ejercicio anterior, menos 1, al diezmilésimo. null sin INPC publicado.
     */
    public BigDecimal getFactor() {
        return factor;
    }

    public InflationAdjustment setFactor(BigDecimal factor) {
        this.factor = factor;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setFactor(double factor) {
        return setFactor(BigDecimal.valueOf(factor));
    }

    /**
     * El INPC de la base.
     */
    public BigDecimal getInpcStart() {
        return inpcStart;
    }

    public InflationAdjustment setInpcStart(BigDecimal inpcStart) {
        this.inpcStart = inpcStart;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setInpcStart(double inpcStart) {
        return setInpcStart(BigDecimal.valueOf(inpcStart));
    }

    /**
     * El INPC del último mes.
     */
    public BigDecimal getInpcEnd() {
        return inpcEnd;
    }

    public InflationAdjustment setInpcEnd(BigDecimal inpcEnd) {
        this.inpcEnd = inpcEnd;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setInpcEnd(double inpcEnd) {
        return setInpcEnd(BigDecimal.valueOf(inpcEnd));
    }

    /**
     * De qué mes es inpc_end (AAAA-MM): diciembre, o el último publicado en una estimación.
     */
    public String getInpcEndMonth() {
        return inpcEndMonth;
    }

    public InflationAdjustment setInpcEndMonth(String inpcEndMonth) {
        this.inpcEndMonth = inpcEndMonth;
        return this;
    }

    /**
     * true mientras no hay saldos de diciembre o INPC de diciembre: una estimación.
     */
    public Boolean getEstimated() {
        return estimated;
    }

    public InflationAdjustment setEstimated(Boolean estimated) {
        this.estimated = estimated;
        return this;
    }

    /**
     * taxable (acumulable, art. 18 fr. X) cuando las deudas son mayores; deductible (art. 25 fr. VIII) cuando los créditos lo son.
     * <p>
     * Valores: taxable, deductible.
     */
    public String getType() {
        return type;
    }

    public InflationAdjustment setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * El ajuste anual por inflación: difference × factor.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public InflationAdjustment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public InflationAdjustment setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
