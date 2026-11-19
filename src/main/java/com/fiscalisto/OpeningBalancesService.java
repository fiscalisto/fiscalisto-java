// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetOpeningBalancesParams;
import com.fiscalisto.model.OpeningBalances;
import com.fiscalisto.model.SetOpeningBalancesParams;

/**
 * Contabilidad: client.openingBalances().
 */
public final class OpeningBalancesService {
    private final ApiClient api;

    OpeningBalancesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver los saldos iniciales
     * <p>
     * Los saldos de cada cuenta con los que empiezan los libros del emisor (date), como Estados financieros › Saldos iniciales en la app. Sin saldos iniciales, date es null.
     * <p>
     * GET /v1/accounting/opening_balances
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-opening-balances
     */
    public OpeningBalances get(GetOpeningBalancesParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/opening_balances", null, params, false, OpeningBalances.class, options);
    }

    public OpeningBalances get(GetOpeningBalancesParams params) {
        return get(params, null);
    }

    public OpeningBalances get() {
        return get(null, null);
    }

    /**
     * Guardar los saldos iniciales
     * <p>
     * Reemplaza los saldos iniciales: el día 1 del mes en que empiezan sus libros y el saldo deudor o acreedor de cada cuenta (por su número); las dos columnas suman lo mismo o contesta entry_unbalanced. Son los saldos finales de la balanza de su sistema anterior. Sin renglones, los borra. Nada antes de esa fecha cuenta.
     * <p>
     * POST /v1/accounting/opening_balances
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/set-opening-balances
     */
    public OpeningBalances set(SetOpeningBalancesParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/opening_balances", params, null, true, OpeningBalances.class, options);
    }

    public OpeningBalances set(SetOpeningBalancesParams params) {
        return set(params, null);
    }
}
