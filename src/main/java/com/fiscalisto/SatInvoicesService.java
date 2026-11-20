// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListSatInvoicesParams;
import com.fiscalisto.model.MarkSatInvoicePaidParams;
import com.fiscalisto.model.SatInvoice;
import com.fiscalisto.model.UpdateSatInvoiceParams;

/**
 * Descargas del SAT: client.satInvoices().
 */
public final class SatInvoicesService {
    private final ApiClient api;

    SatInvoicesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar facturas del SAT
     * <p>
     * Las facturas que trajeron sus descargas (y las demás que Fiscalisto tenga del emisor), de la más reciente a la más antigua por fecha.
     * <p>
     * GET /v1/sat_invoices
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/list-sat-invoices
     */
    public Page<SatInvoice> list(ListSatInvoicesParams params, RequestOptions options) {
        return api.list("/v1/sat_invoices", params, SatInvoice.class, options);
    }

    public Page<SatInvoice> list(ListSatInvoicesParams params) {
        return list(params, null);
    }

    public Page<SatInvoice> list() {
        return list(null, null);
    }

    /** Listar facturas del SAT: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SatInvoice> listAutoPaging(ListSatInvoicesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SatInvoice> listAutoPaging(ListSatInvoicesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SatInvoice> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una factura del SAT
     * <p>
     * Un CFDI que trajo una descarga del SAT, con sus importes y su estado ante el SAT.
     * <p>
     * GET /v1/sat_invoices/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/get-sat-invoice
     */
    public SatInvoice get(String id, RequestOptions options) {
        return api.request("GET", "/v1/sat_invoices/" + ApiClient.encode(id), null, null, false, SatInvoice.class, options);
    }

    public SatInvoice get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar una factura del SAT
     * <p>
     * Lo que se puede cambiar de un CFDI del SAT sin tocarlo: su centro de costo (cost_center, o null para quitárselo), para ver sus gastos por obra, proyecto o área, y sus etiquetas (tags, exactamente las que manda: ids tag_… o nombres; un nombre nuevo crea la etiqueta).
     * <p>
     * POST /v1/sat_invoices/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/update-sat-invoice
     */
    public SatInvoice update(String id, UpdateSatInvoiceParams params, RequestOptions options) {
        return api.request("POST", "/v1/sat_invoices/" + ApiClient.encode(id), params, null, true, SatInvoice.class, options);
    }

    public SatInvoice update(String id, UpdateSatInvoiceParams params) {
        return update(id, params, null);
    }

    public SatInvoice update(String id) {
        return update(id, null, null);
    }

    /**
     * Marcar como pagada una factura recibida
     * <p>
     * Una factura PPD recibida que la empresa pagó (en efectivo, de caja chica, con un reembolso…) y cuyo proveedor no emitió el complemento de pago: sale de Por pagar como pagada sin complemento, con cuándo, cómo y de dónde se pagó. El SAT la sigue viendo sin pagar: el IVA no se acredita ni el gasto se deduce hasta que llegue el complemento. En una PUE recibida, que ya está pagada, solo anota de dónde salió el dinero (money_source). Lo marcado se ve en paid_otherwise.
     * <p>
     * POST /v1/sat_invoices/{id}/mark_paid
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/mark-sat-invoice-paid
     */
    public SatInvoice markPaid(String id, MarkSatInvoicePaidParams params, RequestOptions options) {
        return api.request("POST", "/v1/sat_invoices/" + ApiClient.encode(id) + "/mark_paid", params, null, true, SatInvoice.class, options);
    }

    public SatInvoice markPaid(String id, MarkSatInvoicePaidParams params) {
        return markPaid(id, params, null);
    }

    public SatInvoice markPaid(String id) {
        return markPaid(id, null, null);
    }

    /**
     * Quitar la marca de pagada
     * <p>
     * Deshace mark_paid (o lo que marcó una regla de Pagos sin complemento): una PPD vuelve a Por pagar y una PUE pierde su origen del dinero. Una regla ya no la vuelve a marcar.
     * <p>
     * POST /v1/sat_invoices/{id}/mark_unpaid
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/mark-sat-invoice-unpaid
     */
    public SatInvoice markUnpaid(String id, RequestOptions options) {
        return api.request("POST", "/v1/sat_invoices/" + ApiClient.encode(id) + "/mark_unpaid", null, null, true, SatInvoice.class, options);
    }

    public SatInvoice markUnpaid(String id) {
        return markUnpaid(id, null);
    }

    /**
     * Descargar el XML de una factura del SAT
     * <p>
     * El CFDI tal como lo entregó el SAT.
     * <p>
     * GET /v1/sat_invoices/{id}/xml
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/get-sat-invoice-xml
     */
    public String xml(String id, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/sat_invoices/" + ApiClient.encode(id) + "/xml", null, null, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String xml(String id) {
        return xml(id, null);
    }

    /**
     * Descargar el PDF de una factura del SAT
     * <p>
     * El CFDI en PDF, como lo ofrece Facturas: si se timbró en Fiscalisto, el mismo que recibió el cliente; si no, dibujado con el diseño de PDF del emisor (el de un proveedor, con su estilo y color, nunca con su logo). El XML es el documento válido ante el SAT.
     * <p>
     * GET /v1/sat_invoices/{id}/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/get-sat-invoice-pdf
     */
    public byte[] pdf(String id, RequestOptions options) {
        return api.bytes("GET", "/v1/sat_invoices/" + ApiClient.encode(id) + "/pdf", null, null, false, options);
    }

    public byte[] pdf(String id) {
        return pdf(id, null);
    }
}
