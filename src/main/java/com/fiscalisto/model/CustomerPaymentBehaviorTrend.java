// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CustomerPaymentBehaviorTrend: CustomerPaymentBehaviorTrend.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerPaymentBehaviorTrend {
    /**
     * slower: tarda 7 días o más que antes; faster: 7 o más menos.
     * <p>
     * Valores: slower, faster, steady.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Días promedio para pagar de los últimos 3 meses.
     */
    @JsonProperty("recent_days")
    private BigDecimal recentDays;

    /**
     * Días promedio de los 9 meses anteriores.
     */
    @JsonProperty("earlier_days")
    private BigDecimal earlierDays;

    /**
     * slower: tarda 7 días o más que antes; faster: 7 o más menos.
     * <p>
     * Valores: slower, faster, steady.
     */
    public String getDirection() {
        return direction;
    }

    public CustomerPaymentBehaviorTrend setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Días promedio para pagar de los últimos 3 meses.
     */
    public BigDecimal getRecentDays() {
        return recentDays;
    }

    public CustomerPaymentBehaviorTrend setRecentDays(BigDecimal recentDays) {
        this.recentDays = recentDays;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehaviorTrend setRecentDays(double recentDays) {
        return setRecentDays(BigDecimal.valueOf(recentDays));
    }

    /**
     * Días promedio de los 9 meses anteriores.
     */
    public BigDecimal getEarlierDays() {
        return earlierDays;
    }

    public CustomerPaymentBehaviorTrend setEarlierDays(BigDecimal earlierDays) {
        this.earlierDays = earlierDays;
        return this;
    }

    @JsonIgnore
    public CustomerPaymentBehaviorTrend setEarlierDays(double earlierDays) {
        return setEarlierDays(BigDecimal.valueOf(earlierDays));
    }
}
