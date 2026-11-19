// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * CreateFxRevaluationParams: los campos de «Registrar la revaluación cambiaria de un mes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateFxRevaluationParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El tipo de cambio de cierre (pesos por unidad) de cada moneda que aparece en currencies, por ejemplo {"USD": 18.2915}. Por lo general, el FIX que trae closing_rate.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("rates")
    private Map<String, Object> rates;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateFxRevaluationParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El tipo de cambio de cierre (pesos por unidad) de cada moneda que aparece en currencies, por ejemplo {"USD": 18.2915}. Por lo general, el FIX que trae closing_rate.
     * <p>
     * Obligatorio.
     */
    public Map<String, Object> getRates() {
        return rates;
    }

    public CreateFxRevaluationParams setRates(Map<String, Object> rates) {
        this.rates = rates;
        return this;
    }
}
