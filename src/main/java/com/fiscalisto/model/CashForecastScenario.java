// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CashForecastScenario: El escenario con que se calculó: el de los parámetros de la consulta.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashForecastScenario {
    /**
     * Días que se movieron los cobros (0 como siempre).
     */
    @JsonProperty("customers_pay_days_later")
    private Long customersPayDaysLater;

    /**
     * Días que se movieron los pagos a proveedores.
     */
    @JsonProperty("pay_suppliers_days_later")
    private Long paySuppliersDaysLater;

    /**
     * Si cuenta lo que lleva más de 90 días de atraso.
     */
    @JsonProperty("include_doubtful")
    private Boolean includeDoubtful;

    /**
     * Si cuenta las facturas recurrentes que aún no se emiten.
     */
    @JsonProperty("include_recurring")
    private Boolean includeRecurring;

    /**
     * Por ciento que cambiaron las recurrentes (−20 a +10…).
     */
    @JsonProperty("recurring_sales_change")
    private Long recurringSalesChange;

    /**
     * Días que se movieron los cobros (0 como siempre).
     */
    public Long getCustomersPayDaysLater() {
        return customersPayDaysLater;
    }

    public CashForecastScenario setCustomersPayDaysLater(Long customersPayDaysLater) {
        this.customersPayDaysLater = customersPayDaysLater;
        return this;
    }

    @JsonIgnore
    public CashForecastScenario setCustomersPayDaysLater(long customersPayDaysLater) {
        return setCustomersPayDaysLater(Long.valueOf(customersPayDaysLater));
    }

    /**
     * Días que se movieron los pagos a proveedores.
     */
    public Long getPaySuppliersDaysLater() {
        return paySuppliersDaysLater;
    }

    public CashForecastScenario setPaySuppliersDaysLater(Long paySuppliersDaysLater) {
        this.paySuppliersDaysLater = paySuppliersDaysLater;
        return this;
    }

    @JsonIgnore
    public CashForecastScenario setPaySuppliersDaysLater(long paySuppliersDaysLater) {
        return setPaySuppliersDaysLater(Long.valueOf(paySuppliersDaysLater));
    }

    /**
     * Si cuenta lo que lleva más de 90 días de atraso.
     */
    public Boolean getIncludeDoubtful() {
        return includeDoubtful;
    }

    public CashForecastScenario setIncludeDoubtful(Boolean includeDoubtful) {
        this.includeDoubtful = includeDoubtful;
        return this;
    }

    /**
     * Si cuenta las facturas recurrentes que aún no se emiten.
     */
    public Boolean getIncludeRecurring() {
        return includeRecurring;
    }

    public CashForecastScenario setIncludeRecurring(Boolean includeRecurring) {
        this.includeRecurring = includeRecurring;
        return this;
    }

    /**
     * Por ciento que cambiaron las recurrentes (−20 a +10…).
     */
    public Long getRecurringSalesChange() {
        return recurringSalesChange;
    }

    public CashForecastScenario setRecurringSalesChange(Long recurringSalesChange) {
        this.recurringSalesChange = recurringSalesChange;
        return this;
    }

    @JsonIgnore
    public CashForecastScenario setRecurringSalesChange(long recurringSalesChange) {
        return setRecurringSalesChange(Long.valueOf(recurringSalesChange));
    }
}
