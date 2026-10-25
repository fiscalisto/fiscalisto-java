// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateInvoiceBatchParams;
import com.fiscalisto.model.InvoiceBatch;
import com.fiscalisto.model.ListInvoiceBatchesParams;

/**
 * Lotes: client.invoiceBatches().
 */
public final class InvoiceBatchesService {
    private final ApiClient api;

    InvoiceBatchesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Timbrar un lote de facturas
     * <p>
     * Hasta 1,000 facturas de ingreso de un emisor, timbradas en segundo plano. Se revisan todas antes de empezar: si una no pasa, no se timbra ninguna. Responde 202; escuche invoice_batch.completed o consulte el lote.
     * <p>
     * POST /v1/invoice_batches
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/lotes/create-invoice-batch
     */
    public InvoiceBatch create(CreateInvoiceBatchParams params, RequestOptions options) {
        return api.request("POST", "/v1/invoice_batches", params, null, true, InvoiceBatch.class, options);
    }

    public InvoiceBatch create(CreateInvoiceBatchParams params) {
        return create(params, null);
    }

    /**
     * Listar lotes
     * <p>
     * GET /v1/invoice_batches
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/lotes/list-invoice-batches
     */
    public Page<InvoiceBatch> list(ListInvoiceBatchesParams params, RequestOptions options) {
        return api.list("/v1/invoice_batches", params, InvoiceBatch.class, options);
    }

    public Page<InvoiceBatch> list(ListInvoiceBatchesParams params) {
        return list(params, null);
    }

    public Page<InvoiceBatch> list() {
        return list(null, null);
    }

    /** Listar lotes: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<InvoiceBatch> listAutoPaging(ListInvoiceBatchesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<InvoiceBatch> listAutoPaging(ListInvoiceBatchesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<InvoiceBatch> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un lote
     * <p>
     * Con cada factura: su estado, su id y su error.
     * <p>
     * GET /v1/invoice_batches/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/lotes/get-invoice-batch
     */
    public InvoiceBatch get(String id, RequestOptions options) {
        return api.request("GET", "/v1/invoice_batches/" + ApiClient.encode(id), null, null, false, InvoiceBatch.class, options);
    }

    public InvoiceBatch get(String id) {
        return get(id, null);
    }
}
