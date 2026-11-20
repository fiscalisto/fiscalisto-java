// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.InflationAccounts;
import com.fiscalisto.model.SaveInflationAccountsParams;

/**
 * Contabilidad: client.inflationAccounts().
 */
public final class InflationAccountsService {
    private final ApiClient api;

    InflationAccountsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Cambiar cómo cuenta una cuenta en el ajuste por inflación
     * <p>
     * Marca cuentas de balance como crédito (credit), deuda (debt) o ninguno (none) para el ajuste anual por inflación, por ejemplo un préstamo a un socio persona moral o una deuda de un gasto no deducible. treatment null regresa al de su código agrupador. Una cuenta de resultados contesta parameter_invalid.
     * <p>
     * POST /v1/accounting/inflation_accounts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/save-inflation-accounts
     */
    public InflationAccounts save(SaveInflationAccountsParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/inflation_accounts", params, null, true, InflationAccounts.class, options);
    }

    public InflationAccounts save(SaveInflationAccountsParams params) {
        return save(params, null);
    }
}
