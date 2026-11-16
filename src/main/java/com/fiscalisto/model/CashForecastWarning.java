// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CashForecastWarning: CashForecastWarning.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashForecastWarning {
    /**
     * no_starting_balance: falta el saldo de hoy; stale_starting_balance: tiene más de 7 días; shortfall: una semana cierra debajo del mínimo; overdue_receivables: mucho por cobrar está atrasado; customer_concentration: un cliente es 40 % o más de lo que entra; doubtful_left_out: se dejó fuera lo de más de 90 días.
     * <p>
     * Valores: no_starting_balance, stale_starting_balance, shortfall, overdue_receivables, customer_concentration, doubtful_left_out.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Qué tan urgente es.
     * <p>
     * Valores: critical, warning, info.
     */
    @JsonProperty("severity")
    private String severity;

    /**
     * El aviso, en palabras.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Qué puede hacer; nada cambia solo.
     */
    @JsonProperty("detail")
    private String detail;

    /**
     * La semana, o null.
     */
    @JsonProperty("week")
    private Long week;

    /**
     * Lo que faltaría, en pesos, o null.
     */
    @JsonProperty("shortfall")
    private BigDecimal shortfall;

    /**
     * no_starting_balance: falta el saldo de hoy; stale_starting_balance: tiene más de 7 días; shortfall: una semana cierra debajo del mínimo; overdue_receivables: mucho por cobrar está atrasado; customer_concentration: un cliente es 40 % o más de lo que entra; doubtful_left_out: se dejó fuera lo de más de 90 días.
     * <p>
     * Valores: no_starting_balance, stale_starting_balance, shortfall, overdue_receivables, customer_concentration, doubtful_left_out.
     */
    public String getType() {
        return type;
    }

    public CashForecastWarning setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Qué tan urgente es.
     * <p>
     * Valores: critical, warning, info.
     */
    public String getSeverity() {
        return severity;
    }

    public CashForecastWarning setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * El aviso, en palabras.
     */
    public String getTitle() {
        return title;
    }

    public CashForecastWarning setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Qué puede hacer; nada cambia solo.
     */
    public String getDetail() {
        return detail;
    }

    public CashForecastWarning setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * La semana, o null.
     */
    public Long getWeek() {
        return week;
    }

    public CashForecastWarning setWeek(Long week) {
        this.week = week;
        return this;
    }

    @JsonIgnore
    public CashForecastWarning setWeek(long week) {
        return setWeek(Long.valueOf(week));
    }

    /**
     * Lo que faltaría, en pesos, o null.
     */
    public BigDecimal getShortfall() {
        return shortfall;
    }

    public CashForecastWarning setShortfall(BigDecimal shortfall) {
        this.shortfall = shortfall;
        return this;
    }

    @JsonIgnore
    public CashForecastWarning setShortfall(double shortfall) {
        return setShortfall(BigDecimal.valueOf(shortfall));
    }
}
