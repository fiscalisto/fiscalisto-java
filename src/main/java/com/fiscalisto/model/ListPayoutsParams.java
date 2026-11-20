// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListPayoutsParams: los campos de «Listar pagos a proveedores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListPayoutsParams {
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
     * Solo los que estén en este estado.
     * <p>
     * Valores: draft, pending_approval, approved, sending, paid, partially_paid, failed, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Solo los que salen desde este día (AAAA-MM-DD).
     */
    @JsonProperty("pay_on_from")
    private String payOnFrom;

    /**
     * Solo los que salen hasta este día (AAAA-MM-DD).
     */
    @JsonProperty("pay_on_to")
    private String payOnTo;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListPayoutsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListPayoutsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListPayoutsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListPayoutsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo los que estén en este estado.
     * <p>
     * Valores: draft, pending_approval, approved, sending, paid, partially_paid, failed, canceled.
     */
    public String getStatus() {
        return status;
    }

    public ListPayoutsParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Solo los que salen desde este día (AAAA-MM-DD).
     */
    public String getPayOnFrom() {
        return payOnFrom;
    }

    public ListPayoutsParams setPayOnFrom(String payOnFrom) {
        this.payOnFrom = payOnFrom;
        return this;
    }

    /**
     * Solo los que salen hasta este día (AAAA-MM-DD).
     */
    public String getPayOnTo() {
        return payOnTo;
    }

    public ListPayoutsParams setPayOnTo(String payOnTo) {
        this.payOnTo = payOnTo;
        return this;
    }
}
