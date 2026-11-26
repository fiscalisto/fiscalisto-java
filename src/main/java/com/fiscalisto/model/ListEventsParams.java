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
     * Un evento (evt_…): contesta los limit que llegaron justo después de él, los más recientes primero; has_more dice si hay más nuevos. Para la página siguiente hacia adelante use el primero de data. No va con starting_after.
     */
    @JsonProperty("ending_before")
    private String endingBefore;

    /**
     * Solo de este tipo (invoice.stamped), o todos los de un recurso con un comodín (invoice.*).
     * <p>
     * Valores: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, invoice.cancellation_failed, invoice.paid, invoice.partially_paid, invoice.email_bounced, invoice.email_complained, invoice.draft_created, invoice.draft_updated, invoice.draft_deleted, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, payroll_batch.completed, customer.created, customer.updated, customer.deleted, product.created, product.updated, product.deleted, customer_data_request.completed, sat_download.completed, sat_download.failed, sat_declaration.created, sat_declaration.updated, sat_refresh.completed, sat_refresh.failed, ticket.invoiced, ticket.included_in_global, recurring_invoice.failed, quote.viewed, quote.accepted, quote.changes_requested, quote.rejected, quote.withdrawn, sales_order.confirmed, sales_order.customer_confirmed, sales_order.delivered, sales_order.paid, sales_order.canceled, supplier_invoice.received, supplier_invoice.approved, supplier_invoice.rejected, supplier_invoice.scheduled, supplier_invoice.paid, portal_supplier.approved, payout.approved, payout.paid, payout.partially_paid, payout.failed, payout.canceled, payout_transfer.succeeded, payout_transfer.failed, payout_transfer.returned, issuer.ready, balance.low, usage.high, test_clock.ready, rule.matched, invoice.*, invoice_batch.*, payroll_batch.*, recurring_invoice.*, quote.*, sales_order.*, supplier_invoice.*, portal_supplier.*, payout.*, payout_transfer.*, ticket.*, retention.*, customer.*, product.*, customer_data_request.*, sat_download.*, sat_declaration.*, sat_refresh.*, issuer.*, balance.*, usage.*, test_clock.*, rule.*.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Solo los de este objeto (inv_…, ret_…, bat_…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * false: los que algún webhook no recibió (su último intento falló). true: los que recibieron todos los webhooks a los que se mandaron.
     */
    @JsonProperty("delivery_success")
    private Boolean deliverySuccess;

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gte]")
    private String createdGte;

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gt]")
    private String createdGt;

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lte]")
    private String createdLte;

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lt]")
    private String createdLt;

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
     * Un evento (evt_…): contesta los limit que llegaron justo después de él, los más recientes primero; has_more dice si hay más nuevos. Para la página siguiente hacia adelante use el primero de data. No va con starting_after.
     */
    public String getEndingBefore() {
        return endingBefore;
    }

    public ListEventsParams setEndingBefore(String endingBefore) {
        this.endingBefore = endingBefore;
        return this;
    }

    /**
     * Solo de este tipo (invoice.stamped), o todos los de un recurso con un comodín (invoice.*).
     * <p>
     * Valores: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, invoice.cancellation_failed, invoice.paid, invoice.partially_paid, invoice.email_bounced, invoice.email_complained, invoice.draft_created, invoice.draft_updated, invoice.draft_deleted, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, payroll_batch.completed, customer.created, customer.updated, customer.deleted, product.created, product.updated, product.deleted, customer_data_request.completed, sat_download.completed, sat_download.failed, sat_declaration.created, sat_declaration.updated, sat_refresh.completed, sat_refresh.failed, ticket.invoiced, ticket.included_in_global, recurring_invoice.failed, quote.viewed, quote.accepted, quote.changes_requested, quote.rejected, quote.withdrawn, sales_order.confirmed, sales_order.customer_confirmed, sales_order.delivered, sales_order.paid, sales_order.canceled, supplier_invoice.received, supplier_invoice.approved, supplier_invoice.rejected, supplier_invoice.scheduled, supplier_invoice.paid, portal_supplier.approved, payout.approved, payout.paid, payout.partially_paid, payout.failed, payout.canceled, payout_transfer.succeeded, payout_transfer.failed, payout_transfer.returned, issuer.ready, balance.low, usage.high, test_clock.ready, rule.matched, invoice.*, invoice_batch.*, payroll_batch.*, recurring_invoice.*, quote.*, sales_order.*, supplier_invoice.*, portal_supplier.*, payout.*, payout_transfer.*, ticket.*, retention.*, customer.*, product.*, customer_data_request.*, sat_download.*, sat_declaration.*, sat_refresh.*, issuer.*, balance.*, usage.*, test_clock.*, rule.*.
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

    /**
     * false: los que algún webhook no recibió (su último intento falló). true: los que recibieron todos los webhooks a los que se mandaron.
     */
    public Boolean getDeliverySuccess() {
        return deliverySuccess;
    }

    public ListEventsParams setDeliverySuccess(Boolean deliverySuccess) {
        this.deliverySuccess = deliverySuccess;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListEventsParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListEventsParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListEventsParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListEventsParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }
}
