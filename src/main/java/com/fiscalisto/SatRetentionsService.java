// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CancelSatRetentionParams;
import com.fiscalisto.model.ListSatRetentionsParams;
import com.fiscalisto.model.SatRetention;

/**
 * Descargas del SAT: client.satRetentions().
 */
public final class SatRetentionsService {
    private final ApiClient api;

    SatRetentionsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar constancias de retenciones
     * <p>
     * Los CFDI de retenciones e información de pagos del emisor, como los muestra Facturas › Retenciones: los que recibió (descargados del SAT o subidos) o los que emitió, del más reciente al más antiguo, con las canceladas marcadas. Las que emite por la API también están en GET /v1/retentions.
     * <p>
     * GET /v1/sat_retentions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/list-sat-retentions
     */
    public Page<SatRetention> list(ListSatRetentionsParams params, RequestOptions options) {
        return api.list("/v1/sat_retentions", params, SatRetention.class, options);
    }

    public Page<SatRetention> list(ListSatRetentionsParams params) {
        return list(params, null);
    }

    public Page<SatRetention> list() {
        return list(null, null);
    }

    /** Listar constancias de retenciones: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SatRetention> listAutoPaging(ListSatRetentionsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SatRetention> listAutoPaging(ListSatRetentionsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SatRetention> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una constancia de retenciones
     * <p>
     * Una constancia de retenciones del emisor, con sus montos, impuestos y estado.
     * <p>
     * GET /v1/sat_retentions/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/get-sat-retention
     */
    public SatRetention get(String id, RequestOptions options) {
        return api.request("GET", "/v1/sat_retentions/" + ApiClient.encode(id), null, null, false, SatRetention.class, options);
    }

    public SatRetention get(String id) {
        return get(id, null);
    }

    /**
     * Descargar el XML de una constancia de retenciones
     * <p>
     * El CFDI de retenciones tal como llegó.
     * <p>
     * GET /v1/sat_retentions/{id}/xml
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/get-sat-retention-xml
     */
    public String xml(String id, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/sat_retentions/" + ApiClient.encode(id) + "/xml", null, null, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String xml(String id) {
        return xml(id, null);
    }

    /**
     * Descargar el PDF de una constancia de retenciones
     * <p>
     * La constancia en PDF, como la ofrece Facturas › Retenciones. El XML es el documento válido ante el SAT.
     * <p>
     * GET /v1/sat_retentions/{id}/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/get-sat-retention-pdf
     */
    public byte[] pdf(String id, RequestOptions options) {
        return api.bytes("GET", "/v1/sat_retentions/" + ApiClient.encode(id) + "/pdf", null, null, false, options);
    }

    public byte[] pdf(String id) {
        return pdf(id, null);
    }

    /**
     * Cancelar una constancia de retenciones emitida
     * <p>
     * Una que el emisor emitió (direction issued), también si la timbró desde otro sistema con el mismo PAC y solo llegó del SAT. Se cancela en el momento (no espera aceptación) y no usa timbres. Una que timbró otro PAC se cancela en el portal del SAT: contesta cancellation_failed y lo explica. Con motive 01, substitution es la constancia que la sustituye (su srt_… o su UUID).
     * <p>
     * POST /v1/sat_retentions/{id}/cancel
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/descargas-del-sat/cancel-sat-retention
     */
    public SatRetention cancel(String id, CancelSatRetentionParams params, RequestOptions options) {
        return api.request("POST", "/v1/sat_retentions/" + ApiClient.encode(id) + "/cancel", params, null, true, SatRetention.class, options);
    }

    public SatRetention cancel(String id, CancelSatRetentionParams params) {
        return cancel(id, params, null);
    }

    public SatRetention cancel(String id) {
        return cancel(id, null, null);
    }
}
