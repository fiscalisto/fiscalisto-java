// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListSatFindingCounterpartiesParams;
import com.fiscalisto.model.SatFindingCounterparty;

/**
 * Cumplimiento SAT: client.satFindingCounterparties().
 */
public final class SatFindingCounterpartiesService {
    private final ApiClient api;

    SatFindingCounterpartiesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar proveedores y clientes con hallazgos
     * <p>
     * Los proveedores (en recibidos) y clientes (en emitidos) con hallazgos sin revisar en los CFDI del emisor, del más grave al más leve y después por cuántos CFDI, cada uno con sus tipos de hallazgo. Con code, quién tiene ese hallazgo. No usa timbres.
     * <p>
     * GET /v1/sat_finding_counterparties
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/list-sat-finding-counterparties
     */
    public Page<SatFindingCounterparty> list(ListSatFindingCounterpartiesParams params, RequestOptions options) {
        return api.list("/v1/sat_finding_counterparties", params, SatFindingCounterparty.class, options);
    }

    public Page<SatFindingCounterparty> list(ListSatFindingCounterpartiesParams params) {
        return list(params, null);
    }

    public Page<SatFindingCounterparty> list() {
        return list(null, null);
    }

    /** Listar proveedores y clientes con hallazgos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SatFindingCounterparty> listAutoPaging(ListSatFindingCounterpartiesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SatFindingCounterparty> listAutoPaging(ListSatFindingCounterpartiesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SatFindingCounterparty> listAutoPaging() {
        return listAutoPaging(null, null);
    }
}
