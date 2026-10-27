// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListSatFindingsParams;
import com.fiscalisto.model.SatFindingList;

/**
 * Cumplimiento SAT: client.satFindings().
 */
public final class SatFindingsService {
    private final ApiClient api;

    SatFindingsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar hallazgos en los CFDI
     * <p>
     * Lo que Fiscalisto encontró en los CFDI del emisor (los suyos y los descargados del SAT) y nadie ha revisado, por tipo y del más grave al más leve: proveedores en la lista 69-B, CFDI cancelados, pagos en efectivo de más de $2,000, errores de CFDI 4.0. Todos en una página. No usa timbres.
     * <p>
     * GET /v1/sat_findings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/list-sat-findings
     */
    public SatFindingList list(ListSatFindingsParams params, RequestOptions options) {
        return api.request("GET", "/v1/sat_findings", null, params, false, SatFindingList.class, options);
    }

    public SatFindingList list(ListSatFindingsParams params) {
        return list(params, null);
    }

    public SatFindingList list() {
        return list(null, null);
    }
}
