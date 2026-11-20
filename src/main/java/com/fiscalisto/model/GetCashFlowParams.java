// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetCashFlowParams: los campos de «Ver el estado de flujos de efectivo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCashFlowParams {
    /**
     * El mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * month (solo el mes) o year_to_date (de enero al mes, por omisión).
     * <p>
     * Valores: month, year_to_date.
     */
    @JsonProperty("period")
    private String period;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    public String getMonth() {
        return month;
    }

    public GetCashFlowParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * month (solo el mes) o year_to_date (de enero al mes, por omisión).
     * <p>
     * Valores: month, year_to_date.
     */
    public String getPeriod() {
        return period;
    }

    public GetCashFlowParams setPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetCashFlowParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
