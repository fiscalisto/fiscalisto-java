// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListPayableInvoicesParams;
import com.fiscalisto.model.PayableInvoice;

/**
 * Pagos a proveedores: client.payableInvoices().
 */
public final class PayableInvoicesService {
    private final ApiClient api;

    PayableInvoicesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar lo que falta por pagar
     * <p>
     * Las facturas recibidas con algo por pagar, como Pagos › Por pagar, las más recientes primero; con uuid, esas facturas (pagadas o no). Lo pagado cuenta complementos, notas de crédito, pagos de Fiscalisto y pagos registrados a mano. Si el emisor no paga con Fintoc, 400 payouts_not_enabled.
     * <p>
     * GET /v1/payable_invoices
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pagos-a-proveedores/list-payable-invoices
     */
    public Page<PayableInvoice> list(ListPayableInvoicesParams params, RequestOptions options) {
        return api.list("/v1/payable_invoices", params, PayableInvoice.class, options);
    }

    public Page<PayableInvoice> list(ListPayableInvoicesParams params) {
        return list(params, null);
    }

    public Page<PayableInvoice> list() {
        return list(null, null);
    }

    /** Listar lo que falta por pagar: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<PayableInvoice> listAutoPaging(ListPayableInvoicesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<PayableInvoice> listAutoPaging(ListPayableInvoicesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<PayableInvoice> listAutoPaging() {
        return listAutoPaging(null, null);
    }
}
