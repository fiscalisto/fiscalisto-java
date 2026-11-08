// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CustomerPaymentBehavior: Cómo paga un cliente: de sus facturas a crédito (PPD) de los últimos 12 meses y sus complementos de pago, en pesos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerPaymentBehavior {
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
     * El cliente (cus_…).
     */
    @JsonProperty("customer")
    private String customer;

    /**
     * Su RFC.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Sus días de crédito: los suyos (Clientes) o los de la empresa (Ajustes › Cobranza automática). Contra ellos se mide el atraso.
     */
    @JsonProperty("credit_days")
    private Long creditDays;

    /**
     * on_time (80 % o más llega a tiempo y atraso promedio de 5 días o menos), sometimes_late (hasta 15 días), late (hasta 45), very_late (más) o no_history (menos de 2 facturas pagadas y nada vencido).
     * <p>
     * Valores: on_time, sometimes_late, late, very_late, no_history.
     */
    @JsonProperty("rating")
    private String rating;

    /**
     * Facturas PPD con un pago en los últimos 12 meses.
     */
    @JsonProperty("paid_invoices")
    private Long paidInvoices;

    /**
     * Días de la factura a su pago, en promedio por monto; null sin pagos.
     */
    @JsonProperty("average_days_to_pay")
    private BigDecimal averageDaysToPay;

    /**
     * La factura típica: la mitad se pagó en estos días o menos.
     */
    @JsonProperty("median_days_to_pay")
    private Long medianDaysToPay;

    /**
     * 3 de cada 4 facturas se pagaron en estos días o menos.
     */
    @JsonProperty("p75_days_to_pay")
    private Long p75DaysToPay;

    /**
     * La parte (0 a 1) de lo pagado que llegó antes de vencer; lo vencido sin pagar cuenta como tarde.
     */
    @JsonProperty("on_time_share")
    private BigDecimal onTimeShare;

    /**
     * Días después del vencimiento, en promedio por monto; lo vencido sin pagar cuenta con sus días de atraso hasta hoy.
     */
    @JsonProperty("average_days_late")
    private BigDecimal averageDaysLate;

    /**
     * Los últimos 3 meses contra los 9 anteriores; null con menos de 2 facturas pagadas en cada lado.
     */
    @JsonProperty("trend")
    private CustomerPaymentBehaviorTrend trend;

    /**
     * Lo que debe ya vencido, en pesos.
     */
    @JsonProperty("overdue_amount")
    private BigDecimal overdueAmount;

    /**
     * Cuántas facturas tiene vencidas.
     */
    @JsonProperty("overdue_invoices")
    private Long overdueInvoices;

    /**
     * Cómo le pagó, la mayor primero.
     */
    @JsonProperty("payment_forms")
    private List<CustomerPaymentBehaviorPaymentForm> paymentForms;

    /**
     * Cada uno de los últimos 12 meses, el más antiguo primero.
     */
    @JsonProperty("months")
    private List<CustomerPaymentBehaviorMonth> months;

    /**
     * Su último pago; null sin pagos en 12 meses.
     */
    @JsonProperty("last_payment")
    private CustomerPaymentBehaviorLastPayment lastPayment;

    /**
     * Facturas de contado (PUE) de los últimos 12 meses: se pagan al emitirse y no cuentan en lo demás.
     */
    @JsonProperty("cash_invoices")
    private Long cashInvoices;

    /**
     * Lo que debe ahora, la factura más antigua primero.
     */
    @JsonProperty("open_invoices")
    private List<CustomerPaymentBehaviorOpenInvoice> openInvoices;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CustomerPaymentBehavior setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CustomerPaymentBehavior setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CustomerPaymentBehavior setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El cliente (cus_…).
     */
    public String getCustomer() {
        return customer;
    }

    public CustomerPaymentBehavior setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Su RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public CustomerPaymentBehavior setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Sus días de crédito: los suyos (Clientes) o los de la empresa (Ajustes › Cobranza automática). Contra ellos se mide el atraso.
     */
    public Long getCreditDays() {
        return creditDays;
    }

    public CustomerPaymentBehavior setCreditDays(Long creditDays) {
        this.creditDays = creditDays;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setCreditDays(long creditDays) {
        return setCreditDays(Long.valueOf(creditDays));
    }

    /**
     * on_time (80 % o más llega a tiempo y atraso promedio de 5 días o menos), sometimes_late (hasta 15 días), late (hasta 45), very_late (más) o no_history (menos de 2 facturas pagadas y nada vencido).
     * <p>
     * Valores: on_time, sometimes_late, late, very_late, no_history.
     */
    public String getRating() {
        return rating;
    }

    public CustomerPaymentBehavior setRating(String rating) {
        this.rating = rating;
        return this;
    }

    /**
     * Facturas PPD con un pago en los últimos 12 meses.
     */
    public Long getPaidInvoices() {
        return paidInvoices;
    }

    public CustomerPaymentBehavior setPaidInvoices(Long paidInvoices) {
        this.paidInvoices = paidInvoices;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setPaidInvoices(long paidInvoices) {
        return setPaidInvoices(Long.valueOf(paidInvoices));
    }

    /**
     * Días de la factura a su pago, en promedio por monto; null sin pagos.
     */
    public BigDecimal getAverageDaysToPay() {
        return averageDaysToPay;
    }

    public CustomerPaymentBehavior setAverageDaysToPay(BigDecimal averageDaysToPay) {
        this.averageDaysToPay = averageDaysToPay;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setAverageDaysToPay(double averageDaysToPay) {
        return setAverageDaysToPay(BigDecimal.valueOf(averageDaysToPay));
    }

    /**
     * La factura típica: la mitad se pagó en estos días o menos.
     */
    public Long getMedianDaysToPay() {
        return medianDaysToPay;
    }

    public CustomerPaymentBehavior setMedianDaysToPay(Long medianDaysToPay) {
        this.medianDaysToPay = medianDaysToPay;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setMedianDaysToPay(long medianDaysToPay) {
        return setMedianDaysToPay(Long.valueOf(medianDaysToPay));
    }

    /**
     * 3 de cada 4 facturas se pagaron en estos días o menos.
     */
    public Long getP75DaysToPay() {
        return p75DaysToPay;
    }

    public CustomerPaymentBehavior setP75DaysToPay(Long p75DaysToPay) {
        this.p75DaysToPay = p75DaysToPay;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setP75DaysToPay(long p75DaysToPay) {
        return setP75DaysToPay(Long.valueOf(p75DaysToPay));
    }

    /**
     * La parte (0 a 1) de lo pagado que llegó antes de vencer; lo vencido sin pagar cuenta como tarde.
     */
    public BigDecimal getOnTimeShare() {
        return onTimeShare;
    }

    public CustomerPaymentBehavior setOnTimeShare(BigDecimal onTimeShare) {
        this.onTimeShare = onTimeShare;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setOnTimeShare(double onTimeShare) {
        return setOnTimeShare(BigDecimal.valueOf(onTimeShare));
    }

    /**
     * Días después del vencimiento, en promedio por monto; lo vencido sin pagar cuenta con sus días de atraso hasta hoy.
     */
    public BigDecimal getAverageDaysLate() {
        return averageDaysLate;
    }

    public CustomerPaymentBehavior setAverageDaysLate(BigDecimal averageDaysLate) {
        this.averageDaysLate = averageDaysLate;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setAverageDaysLate(double averageDaysLate) {
        return setAverageDaysLate(BigDecimal.valueOf(averageDaysLate));
    }

    /**
     * Los últimos 3 meses contra los 9 anteriores; null con menos de 2 facturas pagadas en cada lado.
     */
    public CustomerPaymentBehaviorTrend getTrend() {
        return trend;
    }

    public CustomerPaymentBehavior setTrend(CustomerPaymentBehaviorTrend trend) {
        this.trend = trend;
        return this;
    }

    /**
     * Lo que debe ya vencido, en pesos.
     */
    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    public CustomerPaymentBehavior setOverdueAmount(BigDecimal overdueAmount) {
        this.overdueAmount = overdueAmount;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setOverdueAmount(double overdueAmount) {
        return setOverdueAmount(BigDecimal.valueOf(overdueAmount));
    }

    /**
     * Cuántas facturas tiene vencidas.
     */
    public Long getOverdueInvoices() {
        return overdueInvoices;
    }

    public CustomerPaymentBehavior setOverdueInvoices(Long overdueInvoices) {
        this.overdueInvoices = overdueInvoices;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setOverdueInvoices(long overdueInvoices) {
        return setOverdueInvoices(Long.valueOf(overdueInvoices));
    }

    /**
     * Cómo le pagó, la mayor primero.
     */
    public List<CustomerPaymentBehaviorPaymentForm> getPaymentForms() {
        return paymentForms;
    }

    public CustomerPaymentBehavior setPaymentForms(List<CustomerPaymentBehaviorPaymentForm> paymentForms) {
        this.paymentForms = paymentForms;
        return this;
    }

    /**
     * Cada uno de los últimos 12 meses, el más antiguo primero.
     */
    public List<CustomerPaymentBehaviorMonth> getMonths() {
        return months;
    }

    public CustomerPaymentBehavior setMonths(List<CustomerPaymentBehaviorMonth> months) {
        this.months = months;
        return this;
    }

    /**
     * Su último pago; null sin pagos en 12 meses.
     */
    public CustomerPaymentBehaviorLastPayment getLastPayment() {
        return lastPayment;
    }

    public CustomerPaymentBehavior setLastPayment(CustomerPaymentBehaviorLastPayment lastPayment) {
        this.lastPayment = lastPayment;
        return this;
    }

    /**
     * Facturas de contado (PUE) de los últimos 12 meses: se pagan al emitirse y no cuentan en lo demás.
     */
    public Long getCashInvoices() {
        return cashInvoices;
    }

    public CustomerPaymentBehavior setCashInvoices(Long cashInvoices) {
        this.cashInvoices = cashInvoices;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehavior setCashInvoices(long cashInvoices) {
        return setCashInvoices(Long.valueOf(cashInvoices));
    }

    /**
     * Lo que debe ahora, la factura más antigua primero.
     */
    public List<CustomerPaymentBehaviorOpenInvoice> getOpenInvoices() {
        return openInvoices;
    }

    public CustomerPaymentBehavior setOpenInvoices(List<CustomerPaymentBehaviorOpenInvoice> openInvoices) {
        this.openInvoices = openInvoices;
        return this;
    }
}
