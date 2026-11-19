// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * FxRevaluationCurrency: FxRevaluationCurrency.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FxRevaluationCurrency {
    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Lo que le deben sus clientes al cierre, en esa moneda.
     */
    @JsonProperty("receivable")
    private BigDecimal receivable;

    /**
     * Lo que usted debe a sus proveedores al cierre, en esa moneda.
     */
    @JsonProperty("payable")
    private BigDecimal payable;

    /**
     * El tipo de cambio de cierre que sugerimos (pesos por unidad): el FIX publicado en el DOF el día hábil siguiente al cierre, o null si no se pudo leer.
     */
    @JsonProperty("closing_rate")
    private BigDecimal closingRate;

    /**
     * El día en que se publicó ese FIX, o null.
     */
    @JsonProperty("closing_rate_date")
    private String closingRateDate;

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public FxRevaluationCurrency setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Lo que le deben sus clientes al cierre, en esa moneda.
     */
    public BigDecimal getReceivable() {
        return receivable;
    }

    public FxRevaluationCurrency setReceivable(BigDecimal receivable) {
        this.receivable = receivable;
        return this;
    }

    @JsonIgnore
    public FxRevaluationCurrency setReceivable(double receivable) {
        return setReceivable(BigDecimal.valueOf(receivable));
    }

    /**
     * Lo que usted debe a sus proveedores al cierre, en esa moneda.
     */
    public BigDecimal getPayable() {
        return payable;
    }

    public FxRevaluationCurrency setPayable(BigDecimal payable) {
        this.payable = payable;
        return this;
    }

    @JsonIgnore
    public FxRevaluationCurrency setPayable(double payable) {
        return setPayable(BigDecimal.valueOf(payable));
    }

    /**
     * El tipo de cambio de cierre que sugerimos (pesos por unidad): el FIX publicado en el DOF el día hábil siguiente al cierre, o null si no se pudo leer.
     */
    public BigDecimal getClosingRate() {
        return closingRate;
    }

    public FxRevaluationCurrency setClosingRate(BigDecimal closingRate) {
        this.closingRate = closingRate;
        return this;
    }

    @JsonIgnore
    public FxRevaluationCurrency setClosingRate(double closingRate) {
        return setClosingRate(BigDecimal.valueOf(closingRate));
    }

    /**
     * El día en que se publicó ese FIX, o null.
     */
    public String getClosingRateDate() {
        return closingRateDate;
    }

    public FxRevaluationCurrency setClosingRateDate(String closingRateDate) {
        this.closingRateDate = closingRateDate;
        return this;
    }
}
