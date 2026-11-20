// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.DepreciationReconciliation;
import com.fiscalisto.model.GetDepreciationReconciliationParams;

/**
 * Contabilidad: client.depreciationReconciliations().
 */
public final class DepreciationReconciliationsService {
    private final ApiClient api;

    DepreciationReconciliationsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Comparar la depreciación contable con la fiscal
     * <p>
     * La depreciación contable del año de cada activo fijo contra su deducción fiscal (artículo 34 de la Ley del ISR, actualizada con el INPC del artículo 31) y la diferencia, que es partida de la conciliación contable-fiscal de la declaración anual. Las notas de crédito sobre un activo van en su propio renglón. Como Activos fijos › Contable contra fiscal en la app.
     * <p>
     * GET /v1/accounting/depreciation_reconciliations/{year}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-depreciation-reconciliation
     */
    public DepreciationReconciliation get(String year, GetDepreciationReconciliationParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/depreciation_reconciliations/" + ApiClient.encode(year), null, params, false, DepreciationReconciliation.class, options);
    }

    public DepreciationReconciliation get(String year, GetDepreciationReconciliationParams params) {
        return get(year, params, null);
    }

    public DepreciationReconciliation get(String year) {
        return get(year, null, null);
    }
}
