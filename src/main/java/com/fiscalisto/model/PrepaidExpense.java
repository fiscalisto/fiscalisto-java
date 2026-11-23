// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PrepaidExpense: Un gasto pagado por anticipado (NIF C-5): una factura recibida de un seguro, una renta adelantada o una licencia que cubre varios meses. Queda en pagos anticipados y pasa a su gasto al final de cada mes que cubre. Impuestos no cambia.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrepaidExpense {
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El UUID de la factura recibida.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * true si se amortiza; false si se registra como gasto del mes.
     */
    @JsonProperty("active")
    private Boolean active;

    /**
     * Qué pagó: insurance (seguros y fianzas), rent (rentas) u other.
     * <p>
     * Valores: insurance, rent, other.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * La cuenta de pagos anticipados (código agrupador 109) a la que va su póliza.
     */
    @JsonProperty("account")
    private String account;

    /**
     * La cuenta de costos o gastos a la que se amortiza.
     */
    @JsonProperty("expense_account")
    private String expenseAccount;

    /**
     * Su nombre en el catálogo.
     */
    @JsonProperty("expense_account_name")
    private String expenseAccountName;

    /**
     * Primer mes que cubre, AAAA-MM.
     */
    @JsonProperty("start_month")
    private String startMonth;

    /**
     * Cuántos meses cubre, de 1 a 120: una póliza de amortización por mes.
     */
    @JsonProperty("months")
    private Long months;

    /**
     * Por fechas: el primer día que cubre, AAAA-MM-DD; cada mes se lleva lo de sus días. null: por meses completos, todos iguales.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Por fechas: el último día que cubre, incluido. null: por meses completos.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Pesos que se amortizan en total: lo que su póliza carga a la cuenta 109 (sin el IVA acreditable).
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Lo que queda en la cuenta 109: las pólizas de los meses que no han terminado.
     */
    @JsonProperty("pending")
    private BigDecimal pending;

    /**
     * Una póliza de amortización por mes: cargo a su gasto, abono a la cuenta 109. Todas iguales al centavo; la última lleva el redondeo.
     */
    @JsonProperty("schedule")
    private List<PrepaidExpenseScheduleItem> schedule;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PrepaidExpense setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PrepaidExpense setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public PrepaidExpense setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El UUID de la factura recibida.
     */
    public String getUuid() {
        return uuid;
    }

    public PrepaidExpense setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * true si se amortiza; false si se registra como gasto del mes.
     */
    public Boolean getActive() {
        return active;
    }

    public PrepaidExpense setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Qué pagó: insurance (seguros y fianzas), rent (rentas) u other.
     * <p>
     * Valores: insurance, rent, other.
     */
    public String getKind() {
        return kind;
    }

    public PrepaidExpense setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * La cuenta de pagos anticipados (código agrupador 109) a la que va su póliza.
     */
    public String getAccount() {
        return account;
    }

    public PrepaidExpense setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * La cuenta de costos o gastos a la que se amortiza.
     */
    public String getExpenseAccount() {
        return expenseAccount;
    }

    public PrepaidExpense setExpenseAccount(String expenseAccount) {
        this.expenseAccount = expenseAccount;
        return this;
    }

    /**
     * Su nombre en el catálogo.
     */
    public String getExpenseAccountName() {
        return expenseAccountName;
    }

    public PrepaidExpense setExpenseAccountName(String expenseAccountName) {
        this.expenseAccountName = expenseAccountName;
        return this;
    }

    /**
     * Primer mes que cubre, AAAA-MM.
     */
    public String getStartMonth() {
        return startMonth;
    }

    public PrepaidExpense setStartMonth(String startMonth) {
        this.startMonth = startMonth;
        return this;
    }

    /**
     * Cuántos meses cubre, de 1 a 120: una póliza de amortización por mes.
     */
    public Long getMonths() {
        return months;
    }

    public PrepaidExpense setMonths(Long months) {
        this.months = months;
        return this;
    }

    @JsonIgnore
    public PrepaidExpense setMonths(long months) {
        return setMonths(Long.valueOf(months));
    }

    /**
     * Por fechas: el primer día que cubre, AAAA-MM-DD; cada mes se lleva lo de sus días. null: por meses completos, todos iguales.
     */
    public String getStartDate() {
        return startDate;
    }

    public PrepaidExpense setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Por fechas: el último día que cubre, incluido. null: por meses completos.
     */
    public String getEndDate() {
        return endDate;
    }

    public PrepaidExpense setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Pesos que se amortizan en total: lo que su póliza carga a la cuenta 109 (sin el IVA acreditable).
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PrepaidExpense setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PrepaidExpense setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Lo que queda en la cuenta 109: las pólizas de los meses que no han terminado.
     */
    public BigDecimal getPending() {
        return pending;
    }

    public PrepaidExpense setPending(BigDecimal pending) {
        this.pending = pending;
        return this;
    }

    @JsonIgnore
    public PrepaidExpense setPending(double pending) {
        return setPending(BigDecimal.valueOf(pending));
    }

    /**
     * Una póliza de amortización por mes: cargo a su gasto, abono a la cuenta 109. Todas iguales al centavo; la última lleva el redondeo.
     */
    public List<PrepaidExpenseScheduleItem> getSchedule() {
        return schedule;
    }

    public PrepaidExpense setSchedule(List<PrepaidExpenseScheduleItem> schedule) {
        this.schedule = schedule;
        return this;
    }
}
