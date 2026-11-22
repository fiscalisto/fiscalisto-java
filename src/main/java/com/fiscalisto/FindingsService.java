// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Finding;
import com.fiscalisto.model.ListFindingsParams;
import com.fiscalisto.model.ReviewFindingParams;

/**
 * Hallazgos: client.findings().
 */
public final class FindingsService {
    private final ApiClient api;

    FindingsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar hallazgos
     * <p>
     * Lo que Fiscalisto encontró en las órdenes de compra, pagos, proveedores, contabilidad, viáticos y tickets de compra del emisor, el más reciente primero: una factura que no coincide con su orden, un proveedor en la lista 69-B, un documento vencido, Caja con saldo acreedor, una comprobación vencida, un ticket sin factura. Sin status, los que nadie ha revisado. Los de facturas están en GET /v1/sat_findings. No usa timbres.
     * <p>
     * GET /v1/findings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/hallazgos/list-findings
     */
    public Page<Finding> list(ListFindingsParams params, RequestOptions options) {
        return api.list("/v1/findings", params, Finding.class, options);
    }

    public Page<Finding> list(ListFindingsParams params) {
        return list(params, null);
    }

    public Page<Finding> list() {
        return list(null, null);
    }

    /** Listar hallazgos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Finding> listAutoPaging(ListFindingsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Finding> listAutoPaging(ListFindingsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Finding> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un hallazgo
     * <p>
     * Un hallazgo, con su registro y si lo revisaron.
     * <p>
     * GET /v1/findings/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/hallazgos/get-finding
     */
    public Finding get(String id, RequestOptions options) {
        return api.request("GET", "/v1/findings/" + ApiClient.encode(id), null, null, false, Finding.class, options);
    }

    public Finding get(String id) {
        return get(id, null);
    }

    /**
     * Marcar un hallazgo como revisado
     * <p>
     * Como «Revisado» en la app: alguien vio el hallazgo y está bien, con una nota opcional de por qué. Si detenía su registro, ya no lo detiene. Uno ya revisado cambia su nota. Uno que ya no aplica contesta finding_resolved. Si lo que lo causó cambia después, vuelve a abrirse solo.
     * <p>
     * POST /v1/findings/{id}/review
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/hallazgos/review-finding
     */
    public Finding review(String id, ReviewFindingParams params, RequestOptions options) {
        return api.request("POST", "/v1/findings/" + ApiClient.encode(id) + "/review", params, null, true, Finding.class, options);
    }

    public Finding review(String id, ReviewFindingParams params) {
        return review(id, params, null);
    }

    public Finding review(String id) {
        return review(id, null, null);
    }

    /**
     * Volver a abrir un hallazgo
     * <p>
     * Como «Deshacer» en la app: un hallazgo revisado vuelve a «Sin revisar», sin su nota, y si su ajuste es detener el registro, lo vuelve a detener.
     * <p>
     * POST /v1/findings/{id}/reopen
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/hallazgos/reopen-finding
     */
    public Finding reopen(String id, RequestOptions options) {
        return api.request("POST", "/v1/findings/" + ApiClient.encode(id) + "/reopen", null, null, true, Finding.class, options);
    }

    public Finding reopen(String id) {
        return reopen(id, null);
    }
}
