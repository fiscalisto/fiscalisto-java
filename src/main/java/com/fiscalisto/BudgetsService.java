// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Budget;
import com.fiscalisto.model.GetBudgetParams;
import com.fiscalisto.model.SaveBudgetParams;

/**
 * Contabilidad: client.budgets().
 */
public final class BudgetsService {
    private final ApiClient api;

    BudgetsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver el presupuesto de un año contra lo real
     * <p>
     * El presupuesto del año por cuenta de resultados y mes, y la comparación con lo real de sus pólizas: el mes y de enero a ese mes, con la variación, su porcentaje y si es favorable (deja más utilidad que lo planeado). Con cost_center, el presupuesto y lo real de ese centro de costo; sin él, de toda la empresa. Como Estados financieros › Presupuesto en la app.
     * <p>
     * GET /v1/accounting/budgets/{year}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-budget
     */
    public Budget get(String year, GetBudgetParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/budgets/" + ApiClient.encode(year), null, params, false, Budget.class, options);
    }

    public Budget get(String year, GetBudgetParams params) {
        return get(year, params, null);
    }

    public Budget get(String year) {
        return get(year, null, null);
    }

    /**
     * Guardar el presupuesto de un año
     * <p>
     * Reemplaza el presupuesto del año (de toda la empresa, o del centro de costo de cost_center) con las cuentas que mande: cada una con sus 12 meses en la naturaleza de la cuenta. Solo cuentas de resultados (códigos agrupadores 4 a 7); una cuenta dos veces contesta parameter_invalid en lines. Una lista vacía borra el presupuesto.
     * <p>
     * POST /v1/accounting/budgets/{year}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/save-budget
     */
    public Budget save(String year, SaveBudgetParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/budgets/" + ApiClient.encode(year), params, null, true, Budget.class, options);
    }

    public Budget save(String year, SaveBudgetParams params) {
        return save(year, params, null);
    }
}
