// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateExportParams;
import com.fiscalisto.model.Export;
import com.fiscalisto.model.ListExportsParams;

/**
 * Exportaciones: client.exports().
 */
public final class ExportsService {
    private final ApiClient api;

    ExportsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Exportar las facturas de un mes
     * <p>
     * Un ZIP con el XML (y si quiere el PDF) de cada factura que el emisor emitió o recibió en un mes o un periodo, o un Excel con una fila por factura: los mismos archivos que Facturas › Exportar en la app, para su contador, un respaldo o una auditoría. Contesta 202 de inmediato con status processing; consulte GET /v1/exports/{id} hasta completed y descárguelo con GET /v1/exports/{id}/download durante 30 días. No usa timbres y sirve con una llave de solo lectura.
     * <p>
     * POST /v1/exports
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/exportaciones/create-export
     */
    public Export create(CreateExportParams params, RequestOptions options) {
        return api.request("POST", "/v1/exports", params, null, true, Export.class, options);
    }

    public Export create(CreateExportParams params) {
        return create(params, null);
    }

    public Export create() {
        return create(null, null);
    }

    /**
     * Listar exportaciones
     * <p>
     * Las exportaciones del emisor pedidas por la API, las más recientes primero.
     * <p>
     * GET /v1/exports
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/exportaciones/list-exports
     */
    public Page<Export> list(ListExportsParams params, RequestOptions options) {
        return api.list("/v1/exports", params, Export.class, options);
    }

    public Page<Export> list(ListExportsParams params) {
        return list(params, null);
    }

    public Page<Export> list() {
        return list(null, null);
    }

    /** Listar exportaciones: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Export> listAutoPaging(ListExportsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Export> listAutoPaging(ListExportsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Export> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una exportación
     * <p>
     * Su estado (processing, completed, failed o expired), cuántas facturas lleva, su tamaño y hasta cuándo se descarga.
     * <p>
     * GET /v1/exports/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/exportaciones/get-export
     */
    public Export get(String id, RequestOptions options) {
        return api.request("GET", "/v1/exports/" + ApiClient.encode(id), null, null, false, Export.class, options);
    }

    public Export get(String id) {
        return get(id, null);
    }

    /**
     * Descargar una exportación
     * <p>
     * El ZIP o el Excel, cuando status es completed. Antes, 409 export_not_ready; pasados 30 días, 410 export_expired.
     * <p>
     * GET /v1/exports/{id}/download
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/exportaciones/download-export
     */
    public byte[] download(String id, RequestOptions options) {
        return api.bytes("GET", "/v1/exports/" + ApiClient.encode(id) + "/download", null, null, false, options);
    }

    public byte[] download(String id) {
        return download(id, null);
    }
}
