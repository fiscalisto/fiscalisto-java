// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetCashForecastParams: los campos de «Ver el flujo de efectivo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCashForecastParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Escenario: sus clientes le pagan estos días después (0 a 120).
     */
    @JsonProperty("customers_pay_days_later")
    private Long customersPayDaysLater;

    /**
     * Escenario: usted paga a sus proveedores estos días después (0 a 120).
     */
    @JsonProperty("pay_suppliers_days_later")
    private Long paySuppliersDaysLater;

    /**
     * true cuenta lo que lleva más de 90 días de atraso (por omisión no).
     */
    @JsonProperty("include_doubtful")
    private Boolean includeDoubtful;

    /**
     * false deja fuera las facturas recurrentes que aún no se emiten.
     */
    @JsonProperty("include_recurring")
    private Boolean includeRecurring;

    /**
     * Escenario: por ciento que cambian sus recurrentes (−100 a 100).
     */
    @JsonProperty("recurring_sales_change")
    private Long recurringSalesChange;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetCashForecastParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Escenario: sus clientes le pagan estos días después (0 a 120).
     */
    public Long getCustomersPayDaysLater() {
        return customersPayDaysLater;
    }

    public GetCashForecastParams setCustomersPayDaysLater(Long customersPayDaysLater) {
        this.customersPayDaysLater = customersPayDaysLater;
        return this;
    }

    @JsonIgnore
    public GetCashForecastParams setCustomersPayDaysLater(long customersPayDaysLater) {
        return setCustomersPayDaysLater(Long.valueOf(customersPayDaysLater));
    }

    /**
     * Escenario: usted paga a sus proveedores estos días después (0 a 120).
     */
    public Long getPaySuppliersDaysLater() {
        return paySuppliersDaysLater;
    }

    public GetCashForecastParams setPaySuppliersDaysLater(Long paySuppliersDaysLater) {
        this.paySuppliersDaysLater = paySuppliersDaysLater;
        return this;
    }

    @JsonIgnore
    public GetCashForecastParams setPaySuppliersDaysLater(long paySuppliersDaysLater) {
        return setPaySuppliersDaysLater(Long.valueOf(paySuppliersDaysLater));
    }

    /**
     * true cuenta lo que lleva más de 90 días de atraso (por omisión no).
     */
    public Boolean getIncludeDoubtful() {
        return includeDoubtful;
    }

    public GetCashForecastParams setIncludeDoubtful(Boolean includeDoubtful) {
        this.includeDoubtful = includeDoubtful;
        return this;
    }

    /**
     * false deja fuera las facturas recurrentes que aún no se emiten.
     */
    public Boolean getIncludeRecurring() {
        return includeRecurring;
    }

    public GetCashForecastParams setIncludeRecurring(Boolean includeRecurring) {
        this.includeRecurring = includeRecurring;
        return this;
    }

    /**
     * Escenario: por ciento que cambian sus recurrentes (−100 a 100).
     */
    public Long getRecurringSalesChange() {
        return recurringSalesChange;
    }

    public GetCashForecastParams setRecurringSalesChange(Long recurringSalesChange) {
        this.recurringSalesChange = recurringSalesChange;
        return this;
    }

    @JsonIgnore
    public GetCashForecastParams setRecurringSalesChange(long recurringSalesChange) {
        return setRecurringSalesChange(Long.valueOf(recurringSalesChange));
    }
}
