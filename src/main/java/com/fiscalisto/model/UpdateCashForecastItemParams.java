// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateCashForecastItemParams: los campos de «Cambiar un movimiento previsto».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateCashForecastItemParams {
    /**
     * Qué es: «Renta», «Crédito del banco».
     */
    @JsonProperty("description")
    private String description;

    /**
     * inflow si es dinero que entra; outflow si sale.
     * <p>
     * Valores: inflow, outflow.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Cuánto, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El día (o la primera vez, si se repite).
     */
    @JsonProperty("date")
    private String date;

    /**
     * once (por omisión), weekly, biweekly (cada dos semanas) o monthly.
     * <p>
     * Valores: once, weekly, biweekly, monthly.
     */
    @JsonProperty("frequency")
    private String frequency;

    /**
     * El último día en que se repite; null sin fin.
     */
    @JsonProperty("until")
    private String until;

    /**
     * Qué es: «Renta», «Crédito del banco».
     */
    public String getDescription() {
        return description;
    }

    public UpdateCashForecastItemParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * inflow si es dinero que entra; outflow si sale.
     * <p>
     * Valores: inflow, outflow.
     */
    public String getDirection() {
        return direction;
    }

    public UpdateCashForecastItemParams setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Cuánto, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public UpdateCashForecastItemParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public UpdateCashForecastItemParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El día (o la primera vez, si se repite).
     */
    public String getDate() {
        return date;
    }

    public UpdateCashForecastItemParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * once (por omisión), weekly, biweekly (cada dos semanas) o monthly.
     * <p>
     * Valores: once, weekly, biweekly, monthly.
     */
    public String getFrequency() {
        return frequency;
    }

    public UpdateCashForecastItemParams setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * El último día en que se repite; null sin fin.
     */
    public String getUntil() {
        return until;
    }

    public UpdateCashForecastItemParams setUntil(String until) {
        this.until = until;
        return this;
    }
}
