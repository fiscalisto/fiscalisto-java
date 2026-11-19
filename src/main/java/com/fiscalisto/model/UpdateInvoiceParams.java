// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInvoiceParams: los campos de «Actualizar una factura».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParams {
    /**
     * Su centro de costo (ccn_…), o null para quitárselo. Solo facturas, notas de crédito y recibos de nómina timbrados.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * Nota para el cliente en el PDF (hasta 1,000 caracteres), o null para quitarla. No va en el XML: la factura timbrada no cambia y el siguiente PDF (GET /v1/invoices/{id}/pdf, el correo) ya la lleva. Cada cambio queda en el historial de la factura en Fiscalisto.
     */
    @JsonProperty("notes")
    private String notes;

    /**
     * Su centro de costo (ccn_…), o null para quitárselo. Solo facturas, notas de crédito y recibos de nómina timbrados.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public UpdateInvoiceParams setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Nota para el cliente en el PDF (hasta 1,000 caracteres), o null para quitarla. No va en el XML: la factura timbrada no cambia y el siguiente PDF (GET /v1/invoices/{id}/pdf, el correo) ya la lleva. Cada cambio queda en el historial de la factura en Fiscalisto.
     */
    public String getNotes() {
        return notes;
    }

    public UpdateInvoiceParams setNotes(String notes) {
        this.notes = notes;
        return this;
    }
}
