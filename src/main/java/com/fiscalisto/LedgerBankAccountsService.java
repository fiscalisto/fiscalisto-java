// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.LedgerBankAccount;
import com.fiscalisto.model.LedgerBankAccountList;
import com.fiscalisto.model.ListLedgerBankAccountsParams;
import com.fiscalisto.model.UpdateLedgerBankAccountParams;

/**
 * Contabilidad: client.ledgerBankAccounts().
 */
public final class LedgerBankAccountsService {
    private final ApiClient api;

    LedgerBankAccountsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar las cuentas de banco de la contabilidad
     * <p>
     * Las cuentas de banco del emisor que la contabilidad lleva aparte, cada una su propia subcuenta de Bancos (102-01-&lt;últimos 4&gt;): las de sus cuentas bancarias y las que ya tienen pólizas. Lo que la conciliación identifica en el estado de cuenta (depósitos ligados a su CFDI, retiros marcados como pago de facturas) pasa de Bancos a esa cuenta; lo que ningún estado de cuenta explica se queda en Bancos.
     * <p>
     * GET /v1/accounting/bank_accounts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-ledger-bank-accounts
     */
    public LedgerBankAccountList list(ListLedgerBankAccountsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/bank_accounts", null, params, false, LedgerBankAccountList.class, options);
    }

    public LedgerBankAccountList list(ListLedgerBankAccountsParams params) {
        return list(params, null);
    }

    public LedgerBankAccountList list() {
        return list(null, null);
    }

    /**
     * Cambiar la moneda de una cuenta de banco
     * <p>
     * Cambia la moneda (y el nombre) de una cuenta de banco de la contabilidad, por sus últimos 4 dígitos. Una cuenta en otra moneda se revalúa en las revaluaciones cambiarias con el saldo de su último estado de cuenta.
     * <p>
     * POST /v1/accounting/bank_accounts/{last_four}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/update-ledger-bank-account
     */
    public LedgerBankAccount update(String lastFour, UpdateLedgerBankAccountParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/bank_accounts/" + ApiClient.encode(lastFour), params, null, true, LedgerBankAccount.class, options);
    }

    public LedgerBankAccount update(String lastFour, UpdateLedgerBankAccountParams params) {
        return update(lastFour, params, null);
    }
}
