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
     * Valores: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, invoice.paid, invoice.partially_paid, invoice.email_bounced, invoice.email_complained, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, payroll_batch.completed, customer_data_request.completed, sat_download.completed, sat_download.failed, sat_declaration.created, sat_declaration.updated, ticket.invoiced, ticket.included_in_global, recurring_invoice.failed, quote.viewed, quote.accepted, quote.changes_requested, quote.rejected, quote.withdrawn, issuer.ready, balance.low, test_clock.ready.
     */
    @JsonProperty("type")
    private String type;

    /**
     * El evento a mandar. Por omisión invoice.stamped.
     * <p>
     * Valores: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, invoice.paid, invoice.partially_paid, invoice.email_bounced, invoice.email_complained, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, payroll_batch.completed, customer_data_request.completed, sat_download.completed, sat_download.failed, sat_declaration.created, sat_declaration.updated, ticket.invoiced, ticket.included_in_global, recurring_invoice.failed, quote.viewed, quote.accepted, quote.changes_requested, quote.rejected, quote.withdrawn, issuer.ready, balance.low, test_clock.ready.
     */
    public String getType() {
        return type;
    }

    public TestWebhookEndpointParams setType(String type) {
        this.type = type;
        return this;
    }
}
