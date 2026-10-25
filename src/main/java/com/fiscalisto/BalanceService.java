// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Balance;

/**
 * Cuenta: client.balance().
 */
public final class BalanceService {
    private final ApiClient api;

    BalanceService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver los timbres
     * <p>
     * Los timbres de producción que le quedan, por paquete. En pruebas se timbra gratis.
     * <p>
     * GET /v1/balance
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cuenta/get-balance
     */
    public Balance get(RequestOptions options) {
        return api.request("GET", "/v1/balance", null, null, false, Balance.class, options);
    }

    public Balance get() {
        return get(null);
    }
}
