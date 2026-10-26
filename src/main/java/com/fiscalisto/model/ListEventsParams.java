// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListEventsParams: los campos de «Listar eventos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListEventsParams {
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
     * Solo de este tipo.
     * <p>
     * Valores: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, invoice.paid, invoice.partially_paid, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, customer_data_request.completed, sat_download.completed, sat_download.failed, ticket.invoiced, ticket.included_in_global, recurring_invoice.failed, quote.viewed, quote.accepted, quote.changes_requested, quote.rejected, issuer.ready, balance.low, test_clock.ready.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Solo los de este objeto (inv_…, ret_…, bat_…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListEventsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListEventsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListEventsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo de este tipo.
     * <p>
     * Valores: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, invoice.paid, invoice.partially_paid, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, customer_data_request.completed, sat_download.completed, sat_download.failed, ticket.invoiced, ticket.included_in_global, recurring_invoice.failed, quote.viewed, quote.accepted, quote.changes_requested, quote.rejected, issuer.ready, balance.low, test_clock.ready.
     */
    public String getType() {
        return type;
    }

    public ListEventsParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Solo los de este objeto (inv_…, ret_…, bat_…).
     */
    public String getObject() {
        return object;
    }

    public ListEventsParams setObject(String object) {
        this.object = object;
        return this;
    }
}
