// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListRetentionsParams: los campos de «Listar constancias».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListRetentionsParams {
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
     * valid, canceled, rejected o processing.
     * <p>
     * Valores: valid, canceled, rejected, processing.
     */
    @JsonProperty("status")
    private String status;

    /**
     * RFC del receptor.
     */
    @JsonProperty("recipient")
    private String recipient;

    /**
     * Ejercicio, 4 dígitos.
     */
    @JsonProperty("year")
    private String year;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListRetentionsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListRetentionsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListRetentionsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListRetentionsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * valid, canceled, rejected o processing.
     * <p>
     * Valores: valid, canceled, rejected, processing.
     */
    public String getStatus() {
        return status;
    }

    public ListRetentionsParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * RFC del receptor.
     */
    public String getRecipient() {
        return recipient;
    }

    public ListRetentionsParams setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Ejercicio, 4 dígitos.
     */
    public String getYear() {
        return year;
    }

    public ListRetentionsParams setYear(String year) {
        this.year = year;
        return this;
    }
}
