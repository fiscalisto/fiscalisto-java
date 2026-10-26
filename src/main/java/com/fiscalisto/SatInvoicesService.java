// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListSatInvoicesParams;
import com.fiscalisto.model.SatInvoice;

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
}
