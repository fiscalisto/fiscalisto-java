// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListPayeeAccountsParams;
import com.fiscalisto.model.PayeeAccountList;

/**
 * Pagos a proveedores: client.payeeAccounts().
 */
public final class PayeeAccountsService {
    private final ApiClient api;

    PayeeAccountsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar cuentas de proveedores
     * <p>
     * Las cuentas a las que se les paga a sus proveedores, verificadas con el banco, y si ya se les puede pagar. Solo lectura: agregar o cambiar una CLABE se hace en la app, con su espera y su aprobación.
     * <p>
     * GET /v1/payee_accounts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pagos-a-proveedores/list-payee-accounts
     */
    public PayeeAccountList list(ListPayeeAccountsParams params, RequestOptions options) {
        return api.request("GET", "/v1/payee_accounts", null, params, false, PayeeAccountList.class, options);
    }

    public PayeeAccountList list(ListPayeeAccountsParams params) {
        return list(params, null);
    }

    public PayeeAccountList list() {
        return list(null, null);
    }
}
