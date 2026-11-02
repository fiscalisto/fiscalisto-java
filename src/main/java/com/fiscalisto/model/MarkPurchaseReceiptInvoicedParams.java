// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MarkPurchaseReceiptInvoicedParams: los campos de «Ya llegó la factura».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkPurchaseReceiptInvoicedParams {
    /**
     * La factura recibida que lo cubre: su id (sat_…) o su folio fiscal (UUID). Sin ella, solo se marca facturado.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * La factura recibida que lo cubre: su id (sat_…) o su folio fiscal (UUID). Sin ella, solo se marca facturado.
     */
    public String getInvoice() {
        return invoice;
    }

    public MarkPurchaseReceiptInvoicedParams setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }
}
