// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Account;
import com.fiscalisto.model.UpdateAccountParams;

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

    /**
     * Cambiar la versión de la API
     * <p>
     * Mueve la versión de la API de la cuenta: la que reciben sus solicitudes sin el encabezado Fiscalisto-Version y sus webhooks sin api_version propio. Antes, pruebe la nueva mandando Fiscalisto-Version en sus solicitudes. Con una llave de la cuenta con todos los permisos (no de un entorno de prueba). Queda en Desarrolladores › Actividad.
     * <p>
     * POST /v1/account
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cuenta/update-account
     */
    public Account update(UpdateAccountParams params, RequestOptions options) {
        return api.request("POST", "/v1/account", params, null, true, Account.class, options);
    }

    public Account update(UpdateAccountParams params) {
        return update(params, null);
    }
}
