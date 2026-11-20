// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AccountRenumbering;
import com.fiscalisto.model.RenumberAccountsParams;

/**
 * Contabilidad: client.accountRenumberings().
 */
public final class AccountRenumberingsService {
    private final ApiClient api;

    AccountRenumberingsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Renumerar el catálogo
     * <p>
     * Cambia el número de todas las cuentas a la vez: con separator y widths (cada nivel rellenado con ceros) o con mapping (el número nuevo de cada una). Las pólizas, saldos iniciales y presupuestos siguen en las mismas cuentas. Si alguna no puede tomar su número (un nivel que no cabe, el de una cuenta de mayor, dos cuentas en un número) no cambia ninguna y contesta parameter_invalid; con dry_run solo dice qué cambiaría. Las subcuentas de banco conservan el suyo.
     * <p>
     * POST /v1/accounting/account_renumberings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/renumber-accounts
     */
    public AccountRenumbering create(RenumberAccountsParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/account_renumberings", params, null, true, AccountRenumbering.class, options);
    }

    public AccountRenumbering create(RenumberAccountsParams params) {
        return create(params, null);
    }

    public AccountRenumbering create() {
        return create(null, null);
    }
}
