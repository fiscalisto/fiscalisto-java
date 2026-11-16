// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateCashForecastItemParams: los campos de «Agregar un movimiento previsto».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCashForecastItemParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Qué es: «Renta», «Crédito del banco».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * inflow si es dinero que entra; outflow si sale.
     * <p>
     * Valores: inflow, outflow.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Cuánto, en pesos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El día (o la primera vez, si se repite).
     * <p>
     * Obligatorio.
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
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateCashForecastItemParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Qué es: «Renta», «Crédito del banco».
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public CreateCashForecastItemParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * inflow si es dinero que entra; outflow si sale.
     * <p>
     * Valores: inflow, outflow.
     * <p>
     * Obligatorio.
     */
    public String getDirection() {
        return direction;
    }

    public CreateCashForecastItemParams setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Cuánto, en pesos.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateCashForecastItemParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateCashForecastItemParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El día (o la primera vez, si se repite).
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public CreateCashForecastItemParams setDate(String date) {
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

    public CreateCashForecastItemParams setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * El último día en que se repite; null sin fin.
     */
    public String getUntil() {
        return until;
    }

    public CreateCashForecastItemParams setUntil(String until) {
        this.until = until;
        return this;
    }
}
