// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AccountingSettings;
import com.fiscalisto.model.GetAccountingSettingsParams;
import com.fiscalisto.model.UpdateAccountingSettingsParams;

/**
 * Contabilidad: client.accountingSettings().
 */
public final class AccountingSettingsService {
    private final ApiClient api;

    AccountingSettingsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver cómo se lleva la contabilidad
     * <p>
     * Si cada cliente y cada proveedor tiene su propia subcuenta (party_subaccounts), como Catálogo de cuentas › Subcuentas por cliente y proveedor en la app.
     * <p>
     * GET /v1/accounting/settings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-accounting-settings
     */
    public AccountingSettings get(GetAccountingSettingsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/settings", null, params, false, AccountingSettings.class, options);
    }

    public AccountingSettings get(GetAccountingSettingsParams params) {
        return get(params, null);
    }

    public AccountingSettings get() {
        return get(null, null);
    }

    /**
     * Cambiar cómo se lleva la contabilidad
     * <p>
     * Con party_subaccounts en true, lo que debe cada cliente va a su subcuenta de Clientes (105-01-0001, 105-01-0002…) y lo que se le debe a cada proveedor a la suya de Proveedores (201-01-0001…), numeradas una vez en el orden en que aparecen sus CFDI y con su nombre; la balanza, los auxiliares, las pólizas y la contabilidad electrónica las usan. En false, sus saldos vuelven a Clientes y Proveedores; los números se conservan si se vuelve a activar. Aplica a toda la empresa del emisor y va a la bitácora.
     * <p>
     * POST /v1/accounting/settings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/update-accounting-settings
     */
    public AccountingSettings update(UpdateAccountingSettingsParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/settings", params, null, true, AccountingSettings.class, options);
    }

    public AccountingSettings update(UpdateAccountingSettingsParams params) {
        return update(params, null);
    }
}
