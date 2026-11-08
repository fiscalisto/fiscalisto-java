// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ExpensePolicy;
import com.fiscalisto.model.GetExpensePolicyParams;
import com.fiscalisto.model.UpdateExpensePolicyParams;

/**
 * Viáticos y gastos: client.expensePolicy().
 */
public final class ExpensePolicyService {
    private final ApiClient api;

    ExpensePolicyService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver la política
     * <p>
     * La política de viáticos y gastos del emisor: topes por categoría, hasta cuánto sin factura y los días para comprobar.
     * <p>
     * GET /v1/expense_policy
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/get-expense-policy
     */
    public ExpensePolicy get(GetExpensePolicyParams params, RequestOptions options) {
        return api.request("GET", "/v1/expense_policy", null, params, false, ExpensePolicy.class, options);
    }

    public ExpensePolicy get(GetExpensePolicyParams params) {
        return get(params, null);
    }

    public ExpensePolicy get() {
        return get(null, null);
    }

    /**
     * Cambiar la política
     * <p>
     * Cambia solo lo que manda; en limits, una categoría con null deja de tener tope. Un gasto que pasa un tope no se rechaza: se marca para quien aprueba.
     * <p>
     * POST /v1/expense_policy
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/update-expense-policy
     */
    public ExpensePolicy update(UpdateExpensePolicyParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_policy", params, null, true, ExpensePolicy.class, options);
    }

    public ExpensePolicy update(UpdateExpensePolicyParams params) {
        return update(params, null);
    }

    public ExpensePolicy update() {
        return update(null, null);
    }
}
