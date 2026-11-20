// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollTax: El impuesto sobre nómina de un mes, por estado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollTax {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
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
     * El mes: 2026-11.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Lo que paga en todos los estados.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Cada estado con recibos del mes, de mayor a menor base.
     */
    @JsonProperty("states")
    private List<PayrollTaxState> states;

    /**
     * Las percepciones del mes.
     */
    @JsonProperty("perceptions")
    private List<PayrollTaxPerception> perceptions;

    /**
     * Las percepciones que no suman a la base.
     */
    @JsonProperty("excluded_perception_types")
    private List<String> excludedPerceptionTypes;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollTax setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollTax setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public PayrollTax setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes: 2026-11.
     */
    public String getMonth() {
        return month;
    }

    public PayrollTax setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Lo que paga en todos los estados.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PayrollTax setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayrollTax setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Cada estado con recibos del mes, de mayor a menor base.
     */
    public List<PayrollTaxState> getStates() {
        return states;
    }

    public PayrollTax setStates(List<PayrollTaxState> states) {
        this.states = states;
        return this;
    }

    /**
     * Las percepciones del mes.
     */
    public List<PayrollTaxPerception> getPerceptions() {
        return perceptions;
    }

    public PayrollTax setPerceptions(List<PayrollTaxPerception> perceptions) {
        this.perceptions = perceptions;
        return this;
    }

    /**
     * Las percepciones que no suman a la base.
     */
    public List<String> getExcludedPerceptionTypes() {
        return excludedPerceptionTypes;
    }

    public PayrollTax setExcludedPerceptionTypes(List<String> excludedPerceptionTypes) {
        this.excludedPerceptionTypes = excludedPerceptionTypes;
        return this;
    }
}
