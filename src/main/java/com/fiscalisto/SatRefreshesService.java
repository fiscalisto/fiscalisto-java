// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListSatRefreshesParams;
import com.fiscalisto.model.SatRefresh;

/**
 * Declaraciones del SAT: client.satRefreshes().
 */
public final class SatRefreshesService {
    private final ApiClient api;

    SatRefreshesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar consultas al SAT
     * <p>
     * Las consultas al SAT que pidió (declaraciones, opinión de cumplimiento, constancia y buzón), de la más reciente a la más antigua, con cómo van. No usa timbres.
     * <p>
     * GET /v1/sat_refreshes
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/declaraciones-del-sat/list-sat-refreshes
     */
    public Page<SatRefresh> list(ListSatRefreshesParams params, RequestOptions options) {
        return api.list("/v1/sat_refreshes", params, SatRefresh.class, options);
    }

    public Page<SatRefresh> list(ListSatRefreshesParams params) {
        return list(params, null);
    }

    public Page<SatRefresh> list() {
        return list(null, null);
    }

    /** Listar consultas al SAT: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SatRefresh> listAutoPaging(ListSatRefreshesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SatRefresh> listAutoPaging(ListSatRefreshesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SatRefresh> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una consulta al SAT
     * <p>
     * Cómo va una consulta al SAT (srf_…): processing mientras se consulta, completed con lo que trajo en result o failed con el motivo en error (su timbre regresó). No usa timbres.
     * <p>
     * GET /v1/sat_refreshes/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/declaraciones-del-sat/get-sat-refresh
     */
    public SatRefresh get(String id, RequestOptions options) {
        return api.request("GET", "/v1/sat_refreshes/" + ApiClient.encode(id), null, null, false, SatRefresh.class, options);
    }

    public SatRefresh get(String id) {
        return get(id, null);
    }
}
