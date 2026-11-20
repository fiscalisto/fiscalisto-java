// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CostCenterResults;
import com.fiscalisto.model.GetCostCenterResultsParams;

/**
 * Contabilidad: client.costCenterResults().
 */
public final class CostCenterResultsService {
    private final ApiClient api;

    CostCenterResultsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver el estado de resultados por centro de costo
     * <p>
     * Lo que cada centro de costo dejó de utilidad en el mes y de enero a ese mes: sus ingresos, costo de ventas, gastos y otros, de las facturas que se le pusieron (POST /v1/cost_centers/{id}/invoices) y de los renglones de póliza a mano que lo llevan (lines[].cost_center). Lo que no tiene centro va con cost_center null; todos suman el estado de resultados de la empresa.
     * <p>
     * GET /v1/accounting/cost_center_results/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-cost-center-results
     */
    public CostCenterResults get(String month, GetCostCenterResultsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/cost_center_results/" + ApiClient.encode(month), null, params, false, CostCenterResults.class, options);
    }

    public CostCenterResults get(String month, GetCostCenterResultsParams params) {
        return get(month, params, null);
    }

    public CostCenterResults get(String month) {
        return get(month, null, null);
    }
}
