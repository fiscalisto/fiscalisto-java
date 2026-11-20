// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CashFlow: El estado de flujos de efectivo (NIF B-2, método indirecto) del mes o de enero al mes, leído de la balanza: cada cuenta va a operación, inversión o financiamiento por su código agrupador.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashFlow {
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
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * El mes solo (month) o de enero al mes (year_to_date).
     * <p>
     * Valores: month, year_to_date.
     */
    @JsonProperty("period")
    private String period;

    /**
     * La utilidad (o pérdida) antes de impuestos del periodo.
     */
    @JsonProperty("net_income")
    private BigDecimal netIncome;

    /**
     * Actividades de operación.
     */
    @JsonProperty("operating")
    private CashFlowOperating operating;

    /**
     * Actividades de inversión: activos fijos, terrenos, diferidos e inversiones permanentes.
     */
    @JsonProperty("investing")
    private CashFlowInvesting investing;

    /**
     * Actividades de financiamiento: préstamos bancarios, dividendos, aportaciones y capital.
     */
    @JsonProperty("financing")
    private CashFlowFinancing financing;

    /**
     * Aumento (o disminución) neto de efectivo.
     */
    @JsonProperty("net_change")
    private BigDecimal netChange;

    /**
     * Caja, bancos e inversiones (101 a 103) al inicio del periodo.
     */
    @JsonProperty("cash_beginning")
    private BigDecimal cashBeginning;

    /**
     * Caja, bancos e inversiones al cierre del periodo.
     */
    @JsonProperty("cash_end")
    private BigDecimal cashEnd;

    /**
     * cash_end − (cash_beginning + net_change): 0 cuando la balanza cuadra.
     */
    @JsonProperty("difference")
    private BigDecimal difference;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CashFlow setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CashFlow setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CashFlow setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public CashFlow setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El mes solo (month) o de enero al mes (year_to_date).
     * <p>
     * Valores: month, year_to_date.
     */
    public String getPeriod() {
        return period;
    }

    public CashFlow setPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * La utilidad (o pérdida) antes de impuestos del periodo.
     */
    public BigDecimal getNetIncome() {
        return netIncome;
    }

    public CashFlow setNetIncome(BigDecimal netIncome) {
        this.netIncome = netIncome;
        return this;
    }

    @JsonIgnore
    public CashFlow setNetIncome(double netIncome) {
        return setNetIncome(BigDecimal.valueOf(netIncome));
    }

    /**
     * Actividades de operación.
     */
    public CashFlowOperating getOperating() {
        return operating;
    }

    public CashFlow setOperating(CashFlowOperating operating) {
        this.operating = operating;
        return this;
    }

    /**
     * Actividades de inversión: activos fijos, terrenos, diferidos e inversiones permanentes.
     */
    public CashFlowInvesting getInvesting() {
        return investing;
    }

    public CashFlow setInvesting(CashFlowInvesting investing) {
        this.investing = investing;
        return this;
    }

    /**
     * Actividades de financiamiento: préstamos bancarios, dividendos, aportaciones y capital.
     */
    public CashFlowFinancing getFinancing() {
        return financing;
    }

    public CashFlow setFinancing(CashFlowFinancing financing) {
        this.financing = financing;
        return this;
    }

    /**
     * Aumento (o disminución) neto de efectivo.
     */
    public BigDecimal getNetChange() {
        return netChange;
    }

    public CashFlow setNetChange(BigDecimal netChange) {
        this.netChange = netChange;
        return this;
    }

    @JsonIgnore
    public CashFlow setNetChange(double netChange) {
        return setNetChange(BigDecimal.valueOf(netChange));
    }

    /**
     * Caja, bancos e inversiones (101 a 103) al inicio del periodo.
     */
    public BigDecimal getCashBeginning() {
        return cashBeginning;
    }

    public CashFlow setCashBeginning(BigDecimal cashBeginning) {
        this.cashBeginning = cashBeginning;
        return this;
    }

    @JsonIgnore
    public CashFlow setCashBeginning(double cashBeginning) {
        return setCashBeginning(BigDecimal.valueOf(cashBeginning));
    }

    /**
     * Caja, bancos e inversiones al cierre del periodo.
     */
    public BigDecimal getCashEnd() {
        return cashEnd;
    }

    public CashFlow setCashEnd(BigDecimal cashEnd) {
        this.cashEnd = cashEnd;
        return this;
    }

    @JsonIgnore
    public CashFlow setCashEnd(double cashEnd) {
        return setCashEnd(BigDecimal.valueOf(cashEnd));
    }

    /**
     * cash_end − (cash_beginning + net_change): 0 cuando la balanza cuadra.
     */
    public BigDecimal getDifference() {
        return difference;
    }

    public CashFlow setDifference(BigDecimal difference) {
        this.difference = difference;
        return this;
    }

    @JsonIgnore
    public CashFlow setDifference(double difference) {
        return setDifference(BigDecimal.valueOf(difference));
    }
}
