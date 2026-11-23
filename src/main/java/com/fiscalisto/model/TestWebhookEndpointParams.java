// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TestWebhookEndpointParams: los campos de «Mandar un evento de prueba».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestWebhookEndpointParams {
    /**
     * El evento a mandar. Por omisión invoice.stamped.
     * <p>
     * Valores: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, invoice.cancellation_failed, invoice.paid, invoice.partially_paid, invoice.email_bounced, invoice.email_complained, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, payroll_batch.completed, customer.created, customer.updated, customer.deleted, product.created, product.updated, product.deleted, customer_data_request.completed, sat_download.completed, sat_download.failed, sat_declaration.created, sat_declaration.updated, sat_refresh.completed, sat_refresh.failed, ticket.invoiced, ticket.included_in_global, recurring_invoice.failed, quote.viewed, quote.accepted, quote.changes_requested, quote.rejected, quote.withdrawn, sales_order.confirmed, sales_order.customer_confirmed, sales_order.delivered, sales_order.paid, sales_order.canceled, supplier_invoice.received, supplier_invoice.approved, supplier_invoice.rejected, supplier_invoice.scheduled, supplier_invoice.paid, portal_supplier.approved, payout.approved, payout.paid, payout.partially_paid, payout.failed, payout.canceled, payout_transfer.succeeded, payout_transfer.failed, payout_transfer.returned, issuer.ready, balance.low, usage.high, test_clock.ready, rule.matched.
     */
    @JsonProperty("type")
    private String type;

    /**
     * El evento a mandar. Por omisión invoice.stamped.
     * <p>
     * Valores: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, invoice.cancellation_failed, invoice.paid, invoice.partially_paid, invoice.email_bounced, invoice.email_complained, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, payroll_batch.completed, customer.created, customer.updated, customer.deleted, product.created, product.updated, product.deleted, customer_data_request.completed, sat_download.completed, sat_download.failed, sat_declaration.created, sat_declaration.updated, sat_refresh.completed, sat_refresh.failed, ticket.invoiced, ticket.included_in_global, recurring_invoice.failed, quote.viewed, quote.accepted, quote.changes_requested, quote.rejected, quote.withdrawn, sales_order.confirmed, sales_order.customer_confirmed, sales_order.delivered, sales_order.paid, sales_order.canceled, supplier_invoice.received, supplier_invoice.approved, supplier_invoice.rejected, supplier_invoice.scheduled, supplier_invoice.paid, portal_supplier.approved, payout.approved, payout.paid, payout.partially_paid, payout.failed, payout.canceled, payout_transfer.succeeded, payout_transfer.failed, payout_transfer.returned, issuer.ready, balance.low, usage.high, test_clock.ready, rule.matched.
     */
    public String getType() {
        return type;
    }

    public TestWebhookEndpointParams setType(String type) {
        this.type = type;
        return this;
    }
}
