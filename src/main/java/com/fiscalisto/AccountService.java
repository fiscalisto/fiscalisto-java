// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Account;

/**
 * Cuenta: client.account().
 */
public final class AccountService {
    private final ApiClient api;

    AccountService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver la cuenta
     * <p>
     * La cuenta API y la llave con que se hizo la solicitud. Útil para probar la llave.
     * <p>
     * GET /v1/account
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cuenta/get-account
     */
    public Account get(RequestOptions options) {
        return api.request("GET", "/v1/account", null, null, false, Account.class, options);
    }

    public Account get() {
        return get(null);
    }
}
