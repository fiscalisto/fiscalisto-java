// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateCreditNoteParams;
import com.fiscalisto.model.Invoice;

/**
 * Pagos y notas de crédito: client.creditNotes().
 */
public final class CreditNotesService {
    private final ApiClient api;

    CreditNotesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Timbrar una nota de crédito
     * <p>
     * Un egreso (tipo E) relacionado 01 (o 03, devolución) a una factura, con su IVA y retenciones en la misma proporción. amount es antes de impuestos.
     * <p>
     * POST /v1/credit_notes
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pagos-y-notas-de-credito/create-credit-note
     */
    public Invoice create(CreateCreditNoteParams params, RequestOptions options) {
        return api.request("POST", "/v1/credit_notes", params, null, true, Invoice.class, options);
    }

    public Invoice create(CreateCreditNoteParams params) {
        return create(params, null);
    }
}
