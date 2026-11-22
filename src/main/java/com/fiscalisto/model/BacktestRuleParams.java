// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BacktestRuleParams: los campos de «Probar una regla en los últimos días».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BacktestRuleParams {
    /**
     * Cuántos días hacia atrás (90 por omisión, hasta 90).
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Cuántos días hacia atrás (90 por omisión, hasta 90).
     */
    public Long getDays() {
        return days;
    }

    public BacktestRuleParams setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public BacktestRuleParams setDays(long days) {
        return setDays(Long.valueOf(days));
    }
}
