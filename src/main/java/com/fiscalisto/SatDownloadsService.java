// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateSatDownloadParams;
import com.fiscalisto.model.ListSatDownloadsParams;
import com.fiscalisto.model.SatDownload;

/**
 * Descargas del SAT: client.satDownloads().
 */
public final class SatDownloadsService {
    private final ApiClient api;

    SatDownloadsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Pedirle al SAT las facturas de un emisor
     * <p>
     * La descarga masiva del SAT: las facturas que el emisor recibió (o emitió) en un periodo de hasta un año, con su XML. Contesta 202 de inmediato; el SAT tarda de minutos a horas y al terminar llega sat_download.completed (o sat_download.failed) y las facturas quedan en GET /v1/sat_invoices. En producción necesita la e.firma guardada del emisor; en pruebas no se le pregunta al SAT: la descarga trae facturas de ejemplo al instante. No usa timbres.
     * <p>
     * POST /v1/sat_downloads
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/create-sat-download
     */
    public SatDownload create(CreateSatDownloadParams params, RequestOptions options) {
        return api.request("POST", "/v1/sat_downloads", params, null, false, SatDownload.class, options);
    }

    public SatDownload create(CreateSatDownloadParams params) {
        return create(params, null);
    }

    /**
     * Listar descargas del SAT
     * <p>
     * GET /v1/sat_downloads
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/list-sat-downloads
     */
    public Page<SatDownload> list(ListSatDownloadsParams params, RequestOptions options) {
        return api.list("/v1/sat_downloads", params, SatDownload.class, options);
    }

    public Page<SatDownload> list(ListSatDownloadsParams params) {
        return list(params, null);
    }

    public Page<SatDownload> list() {
        return list(null, null);
    }

    /** Listar descargas del SAT: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SatDownload> listAutoPaging(ListSatDownloadsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SatDownload> listAutoPaging(ListSatDownloadsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SatDownload> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una descarga del SAT
     * <p>
     * GET /v1/sat_downloads/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/get-sat-download
     */
    public SatDownload get(String id, RequestOptions options) {
        return api.request("GET", "/v1/sat_downloads/" + ApiClient.encode(id), null, null, false, SatDownload.class, options);
    }

    public SatDownload get(String id) {
        return get(id, null);
    }
}
