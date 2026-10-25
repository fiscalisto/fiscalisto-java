// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListReceivablesParams;
import com.fiscalisto.model.Receivable;

/**
 * Cuentas por cobrar: client.receivables().
 */
public final class ReceivablesService {
    private final ApiClient api;

    ReceivablesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver lo que le deben
     * <p>
     * Lo que debe cada cliente, por moneda, de sus facturas abiertas (PPD con saldo y PUE por cobrar), ordenado por RFC. Las facturas de cada uno: GET /v1/invoices?customer=RFC&amp;payment_status=open.
     * <p>
     * GET /v1/receivables
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cuentas-por-cobrar/list-receivables
     */
    public Page<Receivable> list(ListReceivablesParams params, RequestOptions options) {
        return api.list("/v1/receivables", params, Receivable.class, options);
    }

    public Page<Receivable> list(ListReceivablesParams params) {
        return list(params, null);
    }

    public Page<Receivable> list() {
        return list(null, null);
    }

    /** Ver lo que le deben: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Receivable> listAutoPaging(ListReceivablesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Receivable> listAutoPaging(ListReceivablesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Receivable> listAutoPaging() {
        return listAutoPaging(null, null);
    }
}
