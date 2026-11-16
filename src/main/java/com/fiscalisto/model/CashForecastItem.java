// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CashForecastItem: Algo que espera pagar o cobrar y que ninguna factura dice (una renta, un crédito, una venta de contado), que cuenta en el flujo de efectivo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashForecastItem {
    /**
     * El movimiento previsto (cfi_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Siempre cash_forecast_item.
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Qué es: «Renta», «Crédito del banco».
     */
    @JsonProperty("description")
    private String description;

    /**
     * inflow entra dinero; outflow sale.
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
     * El día (AAAA-MM-DD), o la primera vez si se repite.
     */
    @JsonProperty("date")
    private String date;

    /**
     * once una vez; weekly cada semana; biweekly cada dos; monthly cada mes.
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
     * El movimiento previsto (cfi_…).
     */
    public String getId() {
        return id;
    }

    public CashForecastItem setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Siempre cash_forecast_item.
     */
    public String getObject() {
        return object;
    }

    public CashForecastItem setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CashForecastItem setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public CashForecastItem setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Qué es: «Renta», «Crédito del banco».
     */
    public String getDescription() {
        return description;
    }

    public CashForecastItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * inflow entra dinero; outflow sale.
     * <p>
     * Valores: inflow, outflow.
     */
    public String getDirection() {
        return direction;
    }

    public CashForecastItem setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Cuánto, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CashForecastItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CashForecastItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El día (AAAA-MM-DD), o la primera vez si se repite.
     */
    public String getDate() {
        return date;
    }

    public CashForecastItem setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * once una vez; weekly cada semana; biweekly cada dos; monthly cada mes.
     * <p>
     * Valores: once, weekly, biweekly, monthly.
     */
    public String getFrequency() {
        return frequency;
    }

    public CashForecastItem setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * El último día en que se repite; null sin fin.
     */
    public String getUntil() {
        return until;
    }

    public CashForecastItem setUntil(String until) {
        this.until = until;
        return this;
    }
}
