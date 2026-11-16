// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AdjustCashForecastParams: los campos de «Cambiar un renglón del flujo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdjustCashForecastParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El renglón (lines[].line de GET /v1/cash_forecast).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("line")
    private String line;

    /**
     * Otro día para ese renglón; null el estimado.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Otro monto, en pesos; null el estimado.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * true para no contarlo.
     */
    @JsonProperty("excluded")
    private Boolean excluded;

    /**
     * Por qué (lo ve quien abra la semana en la app).
     */
    @JsonProperty("note")
    private String note;

    /**
     * true lo regresa a lo estimado; lo demás se ignora.
     */
    @JsonProperty("reset")
    private Boolean reset;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public AdjustCashForecastParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El renglón (lines[].line de GET /v1/cash_forecast).
     * <p>
     * Obligatorio.
     */
    public String getLine() {
        return line;
    }

    public AdjustCashForecastParams setLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * Otro día para ese renglón; null el estimado.
     */
    public String getDate() {
        return date;
    }

    public AdjustCashForecastParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Otro monto, en pesos; null el estimado.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AdjustCashForecastParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AdjustCashForecastParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * true para no contarlo.
     */
    public Boolean getExcluded() {
        return excluded;
    }

    public AdjustCashForecastParams setExcluded(Boolean excluded) {
        this.excluded = excluded;
        return this;
    }

    /**
     * Por qué (lo ve quien abra la semana en la app).
     */
    public String getNote() {
        return note;
    }

    public AdjustCashForecastParams setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * true lo regresa a lo estimado; lo demás se ignora.
     */
    public Boolean getReset() {
        return reset;
    }

    public AdjustCashForecastParams setReset(Boolean reset) {
        this.reset = reset;
        return this;
    }
}
