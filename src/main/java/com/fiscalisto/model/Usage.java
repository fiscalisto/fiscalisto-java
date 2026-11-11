// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Usage: Las solicitudes de producción de los últimos 30 días contra las que tiene.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Usage {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Siempre true: solo cuenta producción.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Los días que cuenta: los últimos 30.
     */
    @JsonProperty("period_days")
    private Long periodDays;

    /**
     * Solicitudes de producción en esos días.
     */
    @JsonProperty("requests")
    private Long requests;

    /**
     * Las que tiene: 10,000 en el plan Gratis o 100,000 con un plan de paga, más 500 por cada timbre de la API que usó en esos días.
     */
    @JsonProperty("allowance")
    private Long allowance;

    /**
     * Llega al usar el 80 % y otra vez al 100 %.
     */
    @JsonProperty("percent_used")
    private JsonNode percentUsed;

    /**
     * free: la empresa está en Gratis (o en su prueba); paid: tiene un plan de paga.
     * <p>
     * Valores: free, paid.
     */
    @JsonProperty("plan")
    private String plan;

    /**
     * Qué pasa al pasarlas: refused (Gratis: 429 monthly_allowance) o slowed (de paga: 10 solicitudes cada 10 segundos).
     * <p>
     * Valores: refused, slowed.
     */
    @JsonProperty("over_allowance")
    private String overAllowance;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Usage setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Siempre true: solo cuenta producción.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Usage setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Los días que cuenta: los últimos 30.
     */
    public Long getPeriodDays() {
        return periodDays;
    }

    public Usage setPeriodDays(Long periodDays) {
        this.periodDays = periodDays;
        return this;
    }

    @JsonIgnore
    public Usage setPeriodDays(long periodDays) {
        return setPeriodDays(Long.valueOf(periodDays));
    }

    /**
     * Solicitudes de producción en esos días.
     */
    public Long getRequests() {
        return requests;
    }

    public Usage setRequests(Long requests) {
        this.requests = requests;
        return this;
    }

    @JsonIgnore
    public Usage setRequests(long requests) {
        return setRequests(Long.valueOf(requests));
    }

    /**
     * Las que tiene: 10,000 en el plan Gratis o 100,000 con un plan de paga, más 500 por cada timbre de la API que usó en esos días.
     */
    public Long getAllowance() {
        return allowance;
    }

    public Usage setAllowance(Long allowance) {
        this.allowance = allowance;
        return this;
    }

    @JsonIgnore
    public Usage setAllowance(long allowance) {
        return setAllowance(Long.valueOf(allowance));
    }

    /**
     * Llega al usar el 80 % y otra vez al 100 %.
     */
    public JsonNode getPercentUsed() {
        return percentUsed;
    }

    public Usage setPercentUsed(JsonNode percentUsed) {
        this.percentUsed = percentUsed;
        return this;
    }

    /**
     * free: la empresa está en Gratis (o en su prueba); paid: tiene un plan de paga.
     * <p>
     * Valores: free, paid.
     */
    public String getPlan() {
        return plan;
    }

    public Usage setPlan(String plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Qué pasa al pasarlas: refused (Gratis: 429 monthly_allowance) o slowed (de paga: 10 solicitudes cada 10 segundos).
     * <p>
     * Valores: refused, slowed.
     */
    public String getOverAllowance() {
        return overAllowance;
    }

    public Usage setOverAllowance(String overAllowance) {
        this.overAllowance = overAllowance;
        return this;
    }
}
