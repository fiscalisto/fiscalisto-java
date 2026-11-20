// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetComparativeStatementsParams: los campos de «Comparar los estados financieros con otro mes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetComparativeStatementsParams {
    /**
     * El mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * previous_year (el mismo mes del año anterior, por omisión) o previous_month.
     * <p>
     * Valores: previous_year, previous_month.
     */
    @JsonProperty("compare_to")
    private String compareTo;

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

    public GetComparativeStatementsParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * previous_year (el mismo mes del año anterior, por omisión) o previous_month.
     * <p>
     * Valores: previous_year, previous_month.
     */
    public String getCompareTo() {
        return compareTo;
    }

    public GetComparativeStatementsParams setCompareTo(String compareTo) {
        this.compareTo = compareTo;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetComparativeStatementsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
