// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CashForecastLine: CashForecastLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashForecastLine {
    /**
     * El renglón, para cambiarlo con POST /v1/cash_forecast/adjustments.
     */
    @JsonProperty("line")
    private String line;

    /**
     * receivable: lo que le deben sus clientes; recurring_invoice: lo que facturarán sus recurrentes; planned_inflow / planned_outflow: un movimiento previsto que usted agregó; payable: lo que debe a proveedores; payroll: la nómina; taxes: las declaraciones mensuales.
     * <p>
     * Valores: receivable, recurring_invoice, planned_inflow, payable, payroll, taxes, planned_outflow.
     */
    @JsonProperty("type")
    private String type;

    /**
     * inflow entra; outflow sale.
     * <p>
     * Valores: inflow, outflow.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * El día en que se cuenta, con cambios y escenario.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El día que se estimó.
     */
    @JsonProperty("estimated_date")
    private String estimatedDate;

    /**
     * La semana en que cae; null si se dejó fuera (left_out).
     */
    @JsonProperty("week")
    private Long week;

    /**
     * Lo que se cuenta, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Lo que se estimó, en pesos.
     */
    @JsonProperty("estimated_amount")
    private BigDecimal estimatedAmount;

    /**
     * Qué es, como en la app.
     */
    @JsonProperty("description")
    private String description;

    /**
     * El RFC del cliente o proveedor, o null.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Cuántas facturas suma, o null.
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * Cuándo vencía, o null.
     */
    @JsonProperty("due_date")
    private String dueDate;

    /**
     * Días de atraso si ya pasó el día esperado, o null.
     */
    @JsonProperty("days_overdue")
    private Long daysOverdue;

    /**
     * Cómo se estimó, en palabras.
     */
    @JsonProperty("basis")
    private String basis;

    /**
     * high: un monto y día conocidos; medium: un promedio; low: atrasado o sin historial.
     * <p>
     * Valores: high, medium, low.
     */
    @JsonProperty("confidence")
    private String confidence;

    /**
     * Por qué no cuenta: excluded usted lo quitó; doubtful más de 90 días de atraso; scenario el escenario lo quitó; after_horizon cae después de la semana 13. null si cuenta.
     * <p>
     * Valores: excluded, doubtful, scenario, after_horizon.
     */
    @JsonProperty("left_out")
    private String leftOut;

    /**
     * true si usted le cambió el día, monto o lo quitó.
     */
    @JsonProperty("adjusted")
    private Boolean adjusted;

    /**
     * El movimiento previsto (cfi_…) del que viene, o null.
     */
    @JsonProperty("planned_item")
    private String plannedItem;

    /**
     * El renglón, para cambiarlo con POST /v1/cash_forecast/adjustments.
     */
    public String getLine() {
        return line;
    }

    public CashForecastLine setLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * receivable: lo que le deben sus clientes; recurring_invoice: lo que facturarán sus recurrentes; planned_inflow / planned_outflow: un movimiento previsto que usted agregó; payable: lo que debe a proveedores; payroll: la nómina; taxes: las declaraciones mensuales.
     * <p>
     * Valores: receivable, recurring_invoice, planned_inflow, payable, payroll, taxes, planned_outflow.
     */
    public String getType() {
        return type;
    }

    public CashForecastLine setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * inflow entra; outflow sale.
     * <p>
     * Valores: inflow, outflow.
     */
    public String getDirection() {
        return direction;
    }

    public CashForecastLine setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * El día en que se cuenta, con cambios y escenario.
     */
    public String getDate() {
        return date;
    }

    public CashForecastLine setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El día que se estimó.
     */
    public String getEstimatedDate() {
        return estimatedDate;
    }

    public CashForecastLine setEstimatedDate(String estimatedDate) {
        this.estimatedDate = estimatedDate;
        return this;
    }

    /**
     * La semana en que cae; null si se dejó fuera (left_out).
     */
    public Long getWeek() {
        return week;
    }

    public CashForecastLine setWeek(Long week) {
        this.week = week;
        return this;
    }

    @JsonIgnore
    public CashForecastLine setWeek(long week) {
        return setWeek(Long.valueOf(week));
    }

    /**
     * Lo que se cuenta, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CashForecastLine setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CashForecastLine setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Lo que se estimó, en pesos.
     */
    public BigDecimal getEstimatedAmount() {
        return estimatedAmount;
    }

    public CashForecastLine setEstimatedAmount(BigDecimal estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
        return this;
    }

    @JsonIgnore
    public CashForecastLine setEstimatedAmount(double estimatedAmount) {
        return setEstimatedAmount(BigDecimal.valueOf(estimatedAmount));
    }

    /**
     * Qué es, como en la app.
     */
    public String getDescription() {
        return description;
    }

    public CashForecastLine setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * El RFC del cliente o proveedor, o null.
     */
    public String getTaxId() {
        return taxId;
    }

    public CashForecastLine setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Cuántas facturas suma, o null.
     */
    public Long getInvoices() {
        return invoices;
    }

    public CashForecastLine setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public CashForecastLine setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * Cuándo vencía, o null.
     */
    public String getDueDate() {
        return dueDate;
    }

    public CashForecastLine setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Días de atraso si ya pasó el día esperado, o null.
     */
    public Long getDaysOverdue() {
        return daysOverdue;
    }

    public CashForecastLine setDaysOverdue(Long daysOverdue) {
        this.daysOverdue = daysOverdue;
        return this;
    }

    @JsonIgnore
    public CashForecastLine setDaysOverdue(long daysOverdue) {
        return setDaysOverdue(Long.valueOf(daysOverdue));
    }

    /**
     * Cómo se estimó, en palabras.
     */
    public String getBasis() {
        return basis;
    }

    public CashForecastLine setBasis(String basis) {
        this.basis = basis;
        return this;
    }

    /**
     * high: un monto y día conocidos; medium: un promedio; low: atrasado o sin historial.
     * <p>
     * Valores: high, medium, low.
     */
    public String getConfidence() {
        return confidence;
    }

    public CashForecastLine setConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Por qué no cuenta: excluded usted lo quitó; doubtful más de 90 días de atraso; scenario el escenario lo quitó; after_horizon cae después de la semana 13. null si cuenta.
     * <p>
     * Valores: excluded, doubtful, scenario, after_horizon.
     */
    public String getLeftOut() {
        return leftOut;
    }

    public CashForecastLine setLeftOut(String leftOut) {
        this.leftOut = leftOut;
        return this;
    }

    /**
     * true si usted le cambió el día, monto o lo quitó.
     */
    public Boolean getAdjusted() {
        return adjusted;
    }

    public CashForecastLine setAdjusted(Boolean adjusted) {
        this.adjusted = adjusted;
        return this;
    }

    /**
     * El movimiento previsto (cfi_…) del que viene, o null.
     */
    public String getPlannedItem() {
        return plannedItem;
    }

    public CashForecastLine setPlannedItem(String plannedItem) {
        this.plannedItem = plannedItem;
        return this;
    }
}
