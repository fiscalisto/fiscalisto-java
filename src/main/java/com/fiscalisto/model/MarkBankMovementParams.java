// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MarkBankMovementParams: los campos de «Marcar un retiro».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkBankMovementParams {
    /**
     * paid_invoices: pagó facturas que ya están en la contabilidad; ignored: no se registra; pending: vuelve a por registrar. Solo retiros.
     * <p>
     * Valores: pending, paid_invoices, ignored.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("status")
    private String status;

    /**
     * paid_invoices: pagó facturas que ya están en la contabilidad; ignored: no se registra; pending: vuelve a por registrar. Solo retiros.
     * <p>
     * Valores: pending, paid_invoices, ignored.
     * <p>
     * Obligatorio.
     */
    public String getStatus() {
        return status;
    }

    public MarkBankMovementParams setStatus(String status) {
        this.status = status;
        return this;
    }
}
