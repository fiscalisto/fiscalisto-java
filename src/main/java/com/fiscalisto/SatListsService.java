// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CheckSatListsParams;
import com.fiscalisto.model.SatListCheck;
import com.fiscalisto.model.SatListCheckList;

/**
 * Listas del SAT: client.satLists().
 */
public final class SatListsService {
    private final ApiClient api;

    SatListsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Revisar un RFC en las listas del SAT
     * <p>
     * Si el RFC aparece en la lista 69-B (operaciones simuladas), 69-B Bis o del art. 69 (no localizados, créditos firmes, exigibles, cancelados, sentencias, CSD sin efectos). Las listas se actualizan cada día con los archivos del SAT. No usa timbres.
     * <p>
     * GET /v1/sat_lists/{tax_id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-del-sat/get-sat-list-check
     */
    public SatListCheck get(String taxId, RequestOptions options) {
        return api.request("GET", "/v1/sat_lists/" + ApiClient.encode(taxId), null, null, false, SatListCheck.class, options);
    }

    public SatListCheck get(String taxId) {
        return get(taxId, null);
    }

    /**
     * Revisar varios RFC en las listas del SAT
     * <p>
     * Hasta 1,000 RFC en una solicitud, en el mismo orden en que los mandó (sin repetidos). No usa timbres.
     * <p>
     * POST /v1/sat_lists/check
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-del-sat/check-sat-lists
     */
    public SatListCheckList check(CheckSatListsParams params, RequestOptions options) {
        return api.request("POST", "/v1/sat_lists/check", params, null, false, SatListCheckList.class, options);
    }

    public SatListCheckList check(CheckSatListsParams params) {
        return check(params, null);
    }
}
