// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatDeclarationsParams: los campos de «Listar declaraciones del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatDeclarationsParams {
    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo las de un ejercicio, como 2025.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * monthly (provisionales o definitivas), annual (la anual) o dyp (Declaraciones y pagos).
     * <p>
     * Valores: monthly, annual, dyp.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Solo las de un mes (1 a 12).
     */
    @JsonProperty("month")
    private Long month;

    /**
     * normal o complementary (complementarias).
     * <p>
     * Valores: normal, complementary.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSatDeclarationsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListSatDeclarationsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSatDeclarationsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatDeclarationsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo las de un ejercicio, como 2025.
     */
    public Long getYear() {
        return year;
    }

    public ListSatDeclarationsParams setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public ListSatDeclarationsParams setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * monthly (provisionales o definitivas), annual (la anual) o dyp (Declaraciones y pagos).
     * <p>
     * Valores: monthly, annual, dyp.
     */
    public String getSource() {
        return source;
    }

    public ListSatDeclarationsParams setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Solo las de un mes (1 a 12).
     */
    public Long getMonth() {
        return month;
    }

    public ListSatDeclarationsParams setMonth(Long month) {
        this.month = month;
        return this;
    }

    @JsonIgnore
    public ListSatDeclarationsParams setMonth(long month) {
        return setMonth(Long.valueOf(month));
    }

    /**
     * normal o complementary (complementarias).
     * <p>
     * Valores: normal, complementary.
     */
    public String getType() {
        return type;
    }

    public ListSatDeclarationsParams setType(String type) {
        this.type = type;
        return this;
    }
}
