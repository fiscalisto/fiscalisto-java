// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Diot;
import com.fiscalisto.model.GetDiotFileParams;
import com.fiscalisto.model.GetDiotParams;
import com.fiscalisto.model.GetElectronicAccountingParams;
import com.fiscalisto.model.GetTrialBalanceParams;
import com.fiscalisto.model.JournalEntry;
import com.fiscalisto.model.LedgerAccountList;
import com.fiscalisto.model.ListJournalEntriesParams;
import com.fiscalisto.model.ListLedgerAccountsParams;
import com.fiscalisto.model.TrialBalance;

/**
 * Contabilidad: client.accounting().
 */
public final class AccountingService {
    private final ApiClient api;

    AccountingService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar las pólizas de un mes
     * <p>
     * Una póliza de diario por cada CFDI de ingreso o egreso vigente del mes, emitido o recibido (los recibidos con la categoría de su gasto), con sus cuentas y código agrupador del SAT. En pesos; un CFDI en otra moneda sin tipo de cambio no se registra. Es un punto de partida para su contador: no incluye bancos, nómina ni depreciaciones.
     * <p>
     * GET /v1/accounting/journal_entries
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-journal-entries
     */
    public Page<JournalEntry> journalEntries(ListJournalEntriesParams params, RequestOptions options) {
        return api.list("/v1/accounting/journal_entries", params, JournalEntry.class, options);
    }

    public Page<JournalEntry> journalEntries(ListJournalEntriesParams params) {
        return journalEntries(params, null);
    }

    /** Listar las pólizas de un mes: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<JournalEntry> journalEntriesAutoPaging(ListJournalEntriesParams params, RequestOptions options) {
        return journalEntries(params, options).autoPagingIterable();
    }

    public Iterable<JournalEntry> journalEntriesAutoPaging(ListJournalEntriesParams params) {
        return journalEntriesAutoPaging(params, null);
    }

    /**
     * Ver la balanza de comprobación
     * <p>
     * Saldo inicial, cargos, abonos y saldo final de cada cuenta en el mes. Los saldos iniciales se acumulan desde el primer CFDI (las de resultados, desde enero), y los resultados de cada año anterior se cierran a capital.
     * <p>
     * GET /v1/accounting/trial_balance
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-trial-balance
     */
    public TrialBalance trialBalance(GetTrialBalanceParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/trial_balance", null, params, false, TrialBalance.class, options);
    }

    public TrialBalance trialBalance(GetTrialBalanceParams params) {
        return trialBalance(params, null);
    }

    /**
     * Ver el catálogo de cuentas
     * <p>
     * Las cuentas que usan las pólizas, con su código agrupador del SAT.
     * <p>
     * GET /v1/accounting/accounts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-ledger-accounts
     */
    public LedgerAccountList accounts(ListLedgerAccountsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/accounts", null, params, false, LedgerAccountList.class, options);
    }

    public LedgerAccountList accounts(ListLedgerAccountsParams params) {
        return accounts(params, null);
    }

    public LedgerAccountList accounts() {
        return accounts(null, null);
    }

    /**
     * Descargar la contabilidad electrónica
     * <p>
     * El ZIP del mes para el Buzón Tributario: el catálogo (CT) y la balanza (BN, o BC si es complementaria), cada uno en su ZIP con el nombre que espera el SAT, en el formato 1.3 del Anexo 24. Con journal_request, también las pólizas (PL), que se entregan cuando el SAT las pide.
     * <p>
     * GET /v1/accounting/electronic_accounting
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-electronic-accounting
     */
    public String electronicAccounting(GetElectronicAccountingParams params, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/accounting/electronic_accounting", null, params, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String electronicAccounting(GetElectronicAccountingParams params) {
        return electronicAccounting(params, null);
    }

    /**
     * Ver la DIOT de un mes
     * <p>
     * Lo efectivamente pagado a cada proveedor en el mes (facturas PUE y complementos de pago recibidos), con sus notas de crédito como devoluciones, por tipo de operación. Sale de las facturas recibidas que trajo de las descargas del SAT. Desde enero de 2025 (formato 2025).
     * <p>
     * GET /v1/accounting/diot
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-diot
     */
    public Diot diot(GetDiotParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/diot", null, params, false, Diot.class, options);
    }

    public Diot diot(GetDiotParams params) {
        return diot(params, null);
    }

    /**
     * Descargar la DIOT para el SAT
     * <p>
     * El TXT de carga masiva de la DIOT 2025: 54 campos separados por |, pesos enteros. Con group_small_suppliers=true junta en una línea global a los proveedores chicos (regla 4.5.2 RMF). Un mes sin pagos a proveedores responde diot_empty: esa se presenta sin operaciones en el portal del SAT.
     * <p>
     * GET /v1/accounting/diot/file
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-diot-file
     */
    public String diotFile(GetDiotFileParams params, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/accounting/diot/file", null, params, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String diotFile(GetDiotFileParams params) {
        return diotFile(params, null);
    }
}
