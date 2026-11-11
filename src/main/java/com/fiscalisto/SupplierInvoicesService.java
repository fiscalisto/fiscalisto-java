// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListSupplierInvoicesParams;
import com.fiscalisto.model.MarkSupplierInvoicePaidParams;
import com.fiscalisto.model.ScheduleSupplierInvoiceParams;
import com.fiscalisto.model.SupplierInvoice;

/**
 * Portal de proveedores: client.supplierInvoices().
 */
public final class SupplierInvoicesService {
    private final ApiClient api;

    SupplierInvoicesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar facturas de proveedores
     * <p>
     * Las facturas que mandaron sus proveedores por el portal, las más recientes primero. Para llevar a su ERP lo aprobado: status=approved, o escuche supplier_invoice.approved.
     * <p>
     * GET /v1/supplier_invoices
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/portal-de-proveedores/list-supplier-invoices
     */
    public Page<SupplierInvoice> list(ListSupplierInvoicesParams params, RequestOptions options) {
        return api.list("/v1/supplier_invoices", params, SupplierInvoice.class, options);
    }

    public Page<SupplierInvoice> list(ListSupplierInvoicesParams params) {
        return list(params, null);
    }

    public Page<SupplierInvoice> list() {
        return list(null, null);
    }

    /** Listar facturas de proveedores: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SupplierInvoice> listAutoPaging(ListSupplierInvoicesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SupplierInvoice> listAutoPaging(ListSupplierInvoicesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SupplierInvoice> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una factura de proveedor
     * <p>
     * Con su estado, su orden de compra, su contrarecibo y sus fechas de pago. Su XML y su PDF: GET /v1/sat_invoices/{sat_invoice}/xml y /pdf.
     * <p>
     * GET /v1/supplier_invoices/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/portal-de-proveedores/get-supplier-invoice
     */
    public SupplierInvoice get(String id, RequestOptions options) {
        return api.request("GET", "/v1/supplier_invoices/" + ApiClient.encode(id), null, null, false, SupplierInvoice.class, options);
    }

    public SupplierInvoice get(String id) {
        return get(id, null);
    }

    /**
     * Programar el pago de una factura de proveedor
     * <p>
     * El día en que la pagará, como «Programar pago» en la app: el proveedor lo ve en su portal y llega supplier_invoice.scheduled. Solo una aprobada o ya programada; si el SAT la reporta cancelada, 400 supplier_invoice_invalid.
     * <p>
     * POST /v1/supplier_invoices/{id}/schedule
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/portal-de-proveedores/schedule-supplier-invoice
     */
    public SupplierInvoice schedule(String id, ScheduleSupplierInvoiceParams params, RequestOptions options) {
        return api.request("POST", "/v1/supplier_invoices/" + ApiClient.encode(id) + "/schedule", params, null, true, SupplierInvoice.class, options);
    }

    public SupplierInvoice schedule(String id, ScheduleSupplierInvoiceParams params) {
        return schedule(id, params, null);
    }

    /**
     * Marcar pagada una factura de proveedor
     * <p>
     * El pago que hizo su ERP o su banco, como «Marcar pagada» en la app: el proveedor lo ve, y si es PPD le pedimos su complemento de pago. Llega supplier_invoice.paid.
     * <p>
     * POST /v1/supplier_invoices/{id}/mark_paid
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/portal-de-proveedores/mark-supplier-invoice-paid
     */
    public SupplierInvoice markPaid(String id, MarkSupplierInvoicePaidParams params, RequestOptions options) {
        return api.request("POST", "/v1/supplier_invoices/" + ApiClient.encode(id) + "/mark_paid", params, null, true, SupplierInvoice.class, options);
    }

    public SupplierInvoice markPaid(String id, MarkSupplierInvoicePaidParams params) {
        return markPaid(id, params, null);
    }
}
