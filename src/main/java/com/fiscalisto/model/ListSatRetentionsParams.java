// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatRetentionsParams: los campos de «Listar constancias de retenciones».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatRetentionsParams {
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
     * received (por omisión) o issued.
     * <p>
     * Valores: received, issued.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * active o canceled. Sin él, las dos.
     * <p>
     * Valores: active, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El RFC de quien retuvo (recibidas) o a quien le retuvo (emitidas).
     */
    @JsonProperty("counterparty_tax_id")
    private String counterpartyTaxId;

    /**
     * Clave de la retención (CveRetenc) de dos dígitos, como 16 o 26.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Solo las de un ejercicio, como 2025.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Solo las que cubren este mes (1 a 12): una anual de enero a diciembre cubre todos.
     */
    @JsonProperty("month")
    private Long month;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSatRetentionsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListSatRetentionsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSatRetentionsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatRetentionsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * received (por omisión) o issued.
     * <p>
     * Valores: received, issued.
     */
    public String getDirection() {
        return direction;
    }

    public ListSatRetentionsParams setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * active o canceled. Sin él, las dos.
     * <p>
     * Valores: active, canceled.
     */
    public String getStatus() {
        return status;
    }

    public ListSatRetentionsParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El RFC de quien retuvo (recibidas) o a quien le retuvo (emitidas).
     */
    public String getCounterpartyTaxId() {
        return counterpartyTaxId;
    }

    public ListSatRetentionsParams setCounterpartyTaxId(String counterpartyTaxId) {
        this.counterpartyTaxId = counterpartyTaxId;
        return this;
    }

    /**
     * Clave de la retención (CveRetenc) de dos dígitos, como 16 o 26.
     */
    public String getCode() {
        return code;
    }

    public ListSatRetentionsParams setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Solo las de un ejercicio, como 2025.
     */
    public Long getYear() {
        return year;
    }

    public ListSatRetentionsParams setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public ListSatRetentionsParams setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Solo las que cubren este mes (1 a 12): una anual de enero a diciembre cubre todos.
     */
    public Long getMonth() {
        return month;
    }

    public ListSatRetentionsParams setMonth(Long month) {
        this.month = month;
        return this;
    }

    @JsonIgnore
    public ListSatRetentionsParams setMonth(long month) {
        return setMonth(Long.valueOf(month));
    }
}
