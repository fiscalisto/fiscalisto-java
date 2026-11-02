// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreatePurchaseReceiptParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListPurchaseReceiptsParams;
import com.fiscalisto.model.MarkPurchaseReceiptInvoicedParams;
import com.fiscalisto.model.PurchaseReceipt;
import com.fiscalisto.model.RequestPurchaseReceiptInvoiceParams;
import com.fiscalisto.model.UpdatePurchaseReceiptParams;

/**
 * Tickets de compra: client.purchaseReceipts().
 */
public final class PurchaseReceiptsService {
    private final ApiClient api;

    PurchaseReceiptsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Guardar un ticket de compra
     * <p>
     * La foto o el PDF de un ticket que el emisor pagó sin factura, en base64. La IA lee la tienda, su RFC, la fecha, el total, la forma de pago, el folio, los datos que pide su portal y la liga de facturación; lo que usted mande gana a lo que se lea. El mismo archivo dos veces devuelve el ticket que ya estaba, sin leerlo otra vez. Si llega una factura de esa tienda por el mismo total con las descargas del SAT, el ticket queda invoiced solo.
     * <p>
     * POST /v1/purchase_receipts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/create-purchase-receipt
     */
    public PurchaseReceipt create(CreatePurchaseReceiptParams params, RequestOptions options) {
        return api.request("POST", "/v1/purchase_receipts", params, null, true, PurchaseReceipt.class, options);
    }

    public PurchaseReceipt create(CreatePurchaseReceiptParams params) {
        return create(params, null);
    }

    /**
     * Listar tickets de compra
     * <p>
     * Los más recientes primero.
     * <p>
     * GET /v1/purchase_receipts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/list-purchase-receipts
     */
    public Page<PurchaseReceipt> list(ListPurchaseReceiptsParams params, RequestOptions options) {
        return api.list("/v1/purchase_receipts", params, PurchaseReceipt.class, options);
    }

    public Page<PurchaseReceipt> list(ListPurchaseReceiptsParams params) {
        return list(params, null);
    }

    public Page<PurchaseReceipt> list() {
        return list(null, null);
    }

    /** Listar tickets de compra: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<PurchaseReceipt> listAutoPaging(ListPurchaseReceiptsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<PurchaseReceipt> listAutoPaging(ListPurchaseReceiptsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<PurchaseReceipt> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un ticket de compra
     * <p>
     * Con la factura recibida que lo cubre, si ya llegó.
     * <p>
     * GET /v1/purchase_receipts/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/get-purchase-receipt
     */
    public PurchaseReceipt get(String id, RequestOptions options) {
        return api.request("GET", "/v1/purchase_receipts/" + ApiClient.encode(id), null, null, false, PurchaseReceipt.class, options);
    }

    public PurchaseReceipt get(String id) {
        return get(id, null);
    }

    /**
     * Corregir un ticket de compra
     * <p>
     * Corrige o llena sus datos; solo cambia lo que mande (null borra un dato). Con store_tax_id y total corregidos se vuelve a buscar su factura.
     * <p>
     * POST /v1/purchase_receipts/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/update-purchase-receipt
     */
    public PurchaseReceipt update(String id, UpdatePurchaseReceiptParams params, RequestOptions options) {
        return api.request("POST", "/v1/purchase_receipts/" + ApiClient.encode(id), params, null, true, PurchaseReceipt.class, options);
    }

    public PurchaseReceipt update(String id, UpdatePurchaseReceiptParams params) {
        return update(id, params, null);
    }

    public PurchaseReceipt update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un ticket de compra
     * <p>
     * El ticket y su archivo, para siempre.
     * <p>
     * DELETE /v1/purchase_receipts/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/delete-purchase-receipt
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/purchase_receipts/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Leer el ticket de nuevo
     * <p>
     * La IA vuelve a leer el archivo y llena solo los datos que siguen vacíos. Cuenta en el límite diario de tickets de compra.
     * <p>
     * POST /v1/purchase_receipts/{id}/read
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/read-purchase-receipt
     */
    public PurchaseReceipt read(String id, RequestOptions options) {
        return api.request("POST", "/v1/purchase_receipts/" + ApiClient.encode(id) + "/read", null, null, true, PurchaseReceipt.class, options);
    }

    public PurchaseReceipt read(String id) {
        return read(id, null);
    }

    /**
     * Pedir la factura a la tienda
     * <p>
     * fiscalisto: la tienda factura con Fiscalisto (store.on_fiscalisto), se timbra al momento con los datos fiscales del emisor y el ticket queda invoiced. email: le manda a la tienda los datos fiscales y la foto; las respuestas van a reply_to. portal o manual: usted la pidió, solo queda requested. Pide el uso de use (G03 por omisión).
     * <p>
     * POST /v1/purchase_receipts/{id}/request
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/request-purchase-receipt-invoice
     */
    public PurchaseReceipt requestInvoice(String id, RequestPurchaseReceiptInvoiceParams params, RequestOptions options) {
        return api.request("POST", "/v1/purchase_receipts/" + ApiClient.encode(id) + "/request", params, null, true, PurchaseReceipt.class, options);
    }

    public PurchaseReceipt requestInvoice(String id, RequestPurchaseReceiptInvoiceParams params) {
        return requestInvoice(id, params, null);
    }

    /**
     * Ya llegó la factura
     * <p>
     * Para una factura que llegó por otro lado. Con invoice (sat_… o UUID), la factura recibida que lo cubre; una factura cubre un solo ticket.
     * <p>
     * POST /v1/purchase_receipts/{id}/mark_invoiced
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/mark-purchase-receipt-invoiced
     */
    public PurchaseReceipt markInvoiced(String id, MarkPurchaseReceiptInvoicedParams params, RequestOptions options) {
        return api.request("POST", "/v1/purchase_receipts/" + ApiClient.encode(id) + "/mark_invoiced", params, null, true, PurchaseReceipt.class, options);
    }

    public PurchaseReceipt markInvoiced(String id, MarkPurchaseReceiptInvoicedParams params) {
        return markInvoiced(id, params, null);
    }

    public PurchaseReceipt markInvoiced(String id) {
        return markInvoiced(id, null, null);
    }

    /**
     * Marcar como no deducible
     * <p>
     * La tienda no dio factura: el gasto queda como no deducible.
     * <p>
     * POST /v1/purchase_receipts/{id}/mark_non_deductible
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/mark-purchase-receipt-non-deductible
     */
    public PurchaseReceipt markNonDeductible(String id, RequestOptions options) {
        return api.request("POST", "/v1/purchase_receipts/" + ApiClient.encode(id) + "/mark_non_deductible", null, null, true, PurchaseReceipt.class, options);
    }

    public PurchaseReceipt markNonDeductible(String id) {
        return markNonDeductible(id, null);
    }

    /**
     * Volver a pedir la factura
     * <p>
     * Deshace mark_non_deductible o mark_invoiced: vuelve a requested si ya se había pedido, si no a pending.
     * <p>
     * POST /v1/purchase_receipts/{id}/reopen
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tickets-de-compra/reopen-purchase-receipt
     */
    public PurchaseReceipt reopen(String id, RequestOptions options) {
        return api.request("POST", "/v1/purchase_receipts/" + ApiClient.encode(id) + "/reopen", null, null, true, PurchaseReceipt.class, options);
    }

    public PurchaseReceipt reopen(String id) {
        return reopen(id, null);
    }
}
