// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * RuleBacktest: Lo que la regla habría hecho en los últimos días, contado (sin cambiar nada).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleBacktest {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * La regla (rul_…).
     */
    @JsonProperty("rule")
    private String rule;

    /**
     * Cuántos días hacia atrás revisó.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Desde qué día (YYYY-MM-DD, hora de México).
     */
    @JsonProperty("since")
    private String since;

    /**
     * Cuántas facturas, órdenes, movimientos o avisos de su trigger revisó.
     */
    @JsonProperty("records")
    private Long records;

    /**
     * En cuántos se habrían cumplido sus condiciones.
     */
    @JsonProperty("matches")
    private Long matches;

    /**
     * Lo que suman los que cumplen, en pesos; null para los avisos del SAT o si ninguno cumple.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * true: revisó los 2,000 más recientes y se detuvo ahí.
     */
    @JsonProperty("capped")
    private Boolean capped;

    /**
     * Lo que habría hecho con cada uno que cumple, en palabras.
     */
    @JsonProperty("would_do")
    private List<String> wouldDo;

    /**
     * Lo que habría hecho con los demás («Si no se cumple»), en palabras.
     */
    @JsonProperty("else_would_do")
    private List<String> elseWouldDo;

    /**
     * Días que espera y vuelve a revisar antes de actuar (0: actúa en seguida).
     */
    @JsonProperty("wait_days")
    private Long waitDays;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public RuleBacktest setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * La regla (rul_…).
     */
    public String getRule() {
        return rule;
    }

    public RuleBacktest setRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Cuántos días hacia atrás revisó.
     */
    public Long getDays() {
        return days;
    }

    public RuleBacktest setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public RuleBacktest setDays(long days) {
        return setDays(Long.valueOf(days));
    }

    /**
     * Desde qué día (YYYY-MM-DD, hora de México).
     */
    public String getSince() {
        return since;
    }

    public RuleBacktest setSince(String since) {
        this.since = since;
        return this;
    }

    /**
     * Cuántas facturas, órdenes, movimientos o avisos de su trigger revisó.
     */
    public Long getRecords() {
        return records;
    }

    public RuleBacktest setRecords(Long records) {
        this.records = records;
        return this;
    }

    @JsonIgnore
    public RuleBacktest setRecords(long records) {
        return setRecords(Long.valueOf(records));
    }

    /**
     * En cuántos se habrían cumplido sus condiciones.
     */
    public Long getMatches() {
        return matches;
    }

    public RuleBacktest setMatches(Long matches) {
        this.matches = matches;
        return this;
    }

    @JsonIgnore
    public RuleBacktest setMatches(long matches) {
        return setMatches(Long.valueOf(matches));
    }

    /**
     * Lo que suman los que cumplen, en pesos; null para los avisos del SAT o si ninguno cumple.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public RuleBacktest setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public RuleBacktest setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * true: revisó los 2,000 más recientes y se detuvo ahí.
     */
    public Boolean getCapped() {
        return capped;
    }

    public RuleBacktest setCapped(Boolean capped) {
        this.capped = capped;
        return this;
    }

    /**
     * Lo que habría hecho con cada uno que cumple, en palabras.
     */
    public List<String> getWouldDo() {
        return wouldDo;
    }

    public RuleBacktest setWouldDo(List<String> wouldDo) {
        this.wouldDo = wouldDo;
        return this;
    }

    /**
     * Lo que habría hecho con los demás («Si no se cumple»), en palabras.
     */
    public List<String> getElseWouldDo() {
        return elseWouldDo;
    }

    public RuleBacktest setElseWouldDo(List<String> elseWouldDo) {
        this.elseWouldDo = elseWouldDo;
        return this;
    }

    /**
     * Días que espera y vuelve a revisar antes de actuar (0: actúa en seguida).
     */
    public Long getWaitDays() {
        return waitDays;
    }

    public RuleBacktest setWaitDays(Long waitDays) {
        this.waitDays = waitDays;
        return this;
    }

    @JsonIgnore
    public RuleBacktest setWaitDays(long waitDays) {
        return setWaitDays(Long.valueOf(waitDays));
    }
}
