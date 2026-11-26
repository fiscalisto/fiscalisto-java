// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CashFlow;
import com.fiscalisto.model.ComparativeStatements;
import com.fiscalisto.model.ConsolidatedStatements;
import com.fiscalisto.model.CreateLedgerAccountParams;
import com.fiscalisto.model.CrossCheckCfdi;
import com.fiscalisto.model.CrossChecks;
import com.fiscalisto.model.Diot;
import com.fiscalisto.model.EquityChanges;
import com.fiscalisto.model.FinancialRatios;
import com.fiscalisto.model.FinancialStatements;
import com.fiscalisto.model.GeneralLedger;
import com.fiscalisto.model.GetBooksExportParams;
import com.fiscalisto.model.GetCashFlowParams;
import com.fiscalisto.model.GetComparativeStatementsParams;
import com.fiscalisto.model.GetConsolidatedStatementsParams;
import com.fiscalisto.model.GetCrossCheckCfdiParams;
import com.fiscalisto.model.GetCrossChecksParams;
import com.fiscalisto.model.GetDiotFileParams;
import com.fiscalisto.model.GetDiotParams;
import com.fiscalisto.model.GetElectronicAccountingParams;
import com.fiscalisto.model.GetEquityChangesParams;
import com.fiscalisto.model.GetFinancialRatiosParams;
import com.fiscalisto.model.GetFinancialStatementsParams;
import com.fiscalisto.model.GetGeneralLedgerParams;
import com.fiscalisto.model.GetIepsCustomersFileParams;
import com.fiscalisto.model.GetIepsCustomersParams;
import com.fiscalisto.model.GetTrialBalanceParams;
import com.fiscalisto.model.GetVatRefundParams;
import com.fiscalisto.model.IepsCustomers;
import com.fiscalisto.model.JournalEntry;
import com.fiscalisto.model.LedgerAccount;
import com.fiscalisto.model.LedgerAccountList;
import com.fiscalisto.model.ListJournalEntriesParams;
import com.fiscalisto.model.ListLedgerAccountsParams;
import com.fiscalisto.model.TrialBalance;
import com.fiscalisto.model.VatRefund;

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
     * Las pólizas de diario del mes, con sus cuentas y código agrupador del SAT: una por cada CFDI de ingreso o egreso vigente, emitido o recibido (los recibidos con la categoría de su gasto); una por cada pago de un complemento; una por cada recibo de nómina; una con la depreciación de los activos fijos; una por cada venta o baja de un activo, y las capturadas a mano (POST /v1/accounting/manual_entries) con las reversiones de sus provisiones. Un PUE se registra cobrado o pagado según su forma de pago. En pesos; un CFDI en otra moneda sin tipo de cambio no se registra. No incluye movimientos de banco sin CFDI.
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
     * Saldo inicial, cargos, abonos y saldo final de cada cuenta en el mes. Los saldos iniciales se acumulan desde el primer CFDI, o desde los saldos iniciales capturados en la app (las de resultados, desde enero), y los resultados de cada año anterior se cierran a capital.
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
     * Ver el auxiliar de cuentas
     * <p>
     * El libro mayor de un periodo de hasta 12 meses: el saldo inicial de cada cuenta, cada cargo y abono con su póliza (journal_entry, el mismo id de journal_entries), su CFDI y el saldo que deja, y el saldo final. Solo las cuentas que se movieron, o la que pida con account aunque no tenga movimientos; grouping_code lo limita a las de un código agrupador. Una cuenta que no está en el catálogo contesta account_missing.
     * <p>
     * GET /v1/accounting/general_ledger
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-general-ledger
     */
    public GeneralLedger generalLedger(GetGeneralLedgerParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/general_ledger", null, params, false, GeneralLedger.class, options);
    }

    public GeneralLedger generalLedger(GetGeneralLedgerParams params) {
        return generalLedger(params, null);
    }

    /**
     * Ver los estados financieros
     * <p>
     * El estado de resultados (del mes y del año hasta ese mes) y el balance general al cierre del mes, leídos de la misma balanza, así que siempre suman las mismas pólizas.
     * <p>
     * GET /v1/accounting/financial_statements
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-financial-statements
     */
    public FinancialStatements financialStatements(GetFinancialStatementsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/financial_statements", null, params, false, FinancialStatements.class, options);
    }

    public FinancialStatements financialStatements(GetFinancialStatementsParams params) {
        return financialStatements(params, null);
    }

    /**
     * Ver el estado de flujos de efectivo
     * <p>
     * El estado de flujos de efectivo (NIF B-2, método indirecto) del mes o de enero al mes: la utilidad, la depreciación y amortización que se suman, el cambio en capital de trabajo, y las actividades de inversión y de financiamiento, hasta el efectivo al cierre. Cada cuenta va a su actividad por su código agrupador; difference es 0 cuando la balanza cuadra. Como Estados financieros › Flujo de efectivo en la app.
     * <p>
     * GET /v1/accounting/cash_flow
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-cash-flow
     */
    public CashFlow cashFlow(GetCashFlowParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/cash_flow", null, params, false, CashFlow.class, options);
    }

    public CashFlow cashFlow(GetCashFlowParams params) {
        return cashFlow(params, null);
    }

    /**
     * Ver el estado de cambios en el capital contable
     * <p>
     * El estado de cambios en el capital contable (NIF B-4) de enero al mes: cada cuenta de capital del 1 de enero al cierre, con sus aportaciones, retiros, dividendos y traspasos, y el resultado del ejercicio. Como Estados financieros › Capital contable en la app.
     * <p>
     * GET /v1/accounting/equity_changes
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-equity-changes
     */
    public EquityChanges equityChanges(GetEquityChangesParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/equity_changes", null, params, false, EquityChanges.class, options);
    }

    public EquityChanges equityChanges(GetEquityChangesParams params) {
        return equityChanges(params, null);
    }

    /**
     * Comparar los estados financieros con otro mes
     * <p>
     * El estado de resultados (del mes y de enero al mes) y el balance general junto a los del mismo mes del año anterior (compare_to=previous_year, por omisión) o del mes anterior (previous_month), con la variación y su porcentaje por grupo de cuentas. Como Estados financieros › Comparativo en la app.
     * <p>
     * GET /v1/accounting/comparative_statements
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-comparative-statements
     */
    public ComparativeStatements comparativeStatements(GetComparativeStatementsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/comparative_statements", null, params, false, ComparativeStatements.class, options);
    }

    public ComparativeStatements comparativeStatements(GetComparativeStatementsParams params) {
        return comparativeStatements(params, null);
    }

    /**
     * Ver las razones financieras
     * <p>
     * Liquidez, prueba ácida, endeudamiento, apalancamiento, márgenes, rendimiento sobre capital y sobre activo, y días de cobro, de pago y de inventario al cierre del mes, con las cifras de que salen. Rentabilidad y rotación usan los resultados de enero al mes. Como Estados financieros › Razones financieras en la app.
     * <p>
     * GET /v1/accounting/financial_ratios
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-financial-ratios
     */
    public FinancialRatios financialRatios(GetFinancialRatiosParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/financial_ratios", null, params, false, FinancialRatios.class, options);
    }

    public FinancialRatios financialRatios(GetFinancialRatiosParams params) {
        return financialRatios(params, null);
    }

    /**
     * Cruzar lo declarado con lo facturado
     * <p>
     * Cada mes ya vencido del año: el IVA trasladado, acreditable y retenido y los ingresos para ISR que el emisor declaró (de GET /v1/sat_declarations, después de POST /v1/sat_declarations/refresh) contra lo que dicen sus CFDI. Hasta $2 de diferencia es redondeo (las declaraciones van en pesos enteros). Una cifra que la declaración no trae en un renglón reconocible es unreadable con declared null, nunca 0. También el IVA a favor y el régimen con que factura. Gratis: no consulta al SAT.
     * <p>
     * GET /v1/accounting/cross_checks
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-cross-checks
     */
    public CrossChecks crossChecks(GetCrossChecksParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/cross_checks", null, params, false, CrossChecks.class, options);
    }

    public CrossChecks crossChecks(GetCrossChecksParams params) {
        return crossChecks(params, null);
    }

    public CrossChecks crossChecks() {
        return crossChecks(null, null);
    }

    /**
     * Ver el IVA a favor y preparar su devolución
     * <p>
     * El IVA a favor de cada mes de los últimos cinco años (de las declaraciones leídas con POST /v1/sat_declarations/refresh o, sin ellas, de sus CFDI, con estimated en true), cuánto se acreditó después (del saldo más antiguo primero), cuánto queda, qué está en devolución y cuándo prescribe. Con `month`, la revisión de ese mes antes de pedirlo en el SAT: declaración, cruce con CFDI, DIOT, opinión de cumplimiento, Buzón Tributario, e.firma, listas del SAT, CFDI de proveedores con hallazgos y CLABE, con el monto a pedir. No presenta nada en el SAT. Gratis.
     * <p>
     * GET /v1/accounting/vat_refund
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-vat-refund
     */
    public VatRefund vatRefund(GetVatRefundParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/vat_refund", null, params, false, VatRefund.class, options);
    }

    public VatRefund vatRefund(GetVatRefundParams params) {
        return vatRefund(params, null);
    }

    public VatRefund vatRefund() {
        return vatRefund(null, null);
    }

    /**
     * Ver los CFDI de una cifra del cruce
     * <p>
     * Los CFDI que forman lo facturado (invoiced) de una cifra del cruce de un mes, con los mismos cálculos de Impuestos: cada factura PUE o nota de crédito en su mes y cada factura PPD por lo que se pagó en el mes, con lo que aporta. La suma de cfdi más adjustment es invoiced. Sirve para ver por qué una cifra differs: con una diferencia, explanation trae los CFDI cuya combinación la suma (cancelados después, PPD sin cobro en el mes, de los días vecinos de otro mes, notas de crédito, cobros de PPD, repetidos o no declarados) y las posibles causas. Gratis: no consulta al SAT.
     * <p>
     * GET /v1/accounting/cross_checks/cfdi
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-cross-check-cfdi
     */
    public CrossCheckCfdi crossCheckCfdi(GetCrossCheckCfdiParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/cross_checks/cfdi", null, params, false, CrossCheckCfdi.class, options);
    }

    public CrossCheckCfdi crossCheckCfdi(GetCrossCheckCfdiParams params) {
        return crossCheckCfdi(params, null);
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
     * Agregar una cuenta al catálogo
     * <p>
     * Una cuenta propia del emisor, para sus pólizas a mano: su número (que no se repite), su nombre y una subcuenta del código agrupador del SAT. Entra al catálogo de la contabilidad electrónica.
     * <p>
     * POST /v1/accounting/accounts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/create-ledger-account
     */
    public LedgerAccount createAccount(CreateLedgerAccountParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/accounts", params, null, true, LedgerAccount.class, options);
    }

    public LedgerAccount createAccount(CreateLedgerAccountParams params) {
        return createAccount(params, null);
    }

    /**
     * Ver los estados financieros consolidados
     * <p>
     * El estado de resultados y el balance general de varios RFC del espacio del emisor sumados cuenta por cuenta (comparten el catálogo), menos las eliminaciones del mes (POST /v1/accounting/consolidation_eliminations), con la hoja de consolidación (el saldo de cada cuenta en cada RFC, lo eliminado y el consolidado) y lo que los RFC se facturaron entre ellos sin impuestos. Los libros de cada RFC no cambian. Un emisor con un solo RFC contesta parameter_invalid en rfcs.
     * <p>
     * GET /v1/accounting/consolidated_statements
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-consolidated-statements
     */
    public ConsolidatedStatements consolidatedStatements(GetConsolidatedStatementsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/consolidated_statements", null, params, false, ConsolidatedStatements.class, options);
    }

    public ConsolidatedStatements consolidatedStatements(GetConsolidatedStatementsParams params) {
        return consolidatedStatements(params, null);
    }

    /**
     * Descargar la contabilidad electrónica
     * <p>
     * El ZIP del mes para el Buzón Tributario: el catálogo (CT) y la balanza (BN, o BC si es complementaria), cada uno en su ZIP con el nombre que espera el SAT, en el formato 1.3 del Anexo 24. Con journal_request, también las pólizas (PL), que se entregan cuando el SAT las pide. Con month AAAA-13, la balanza de comprobación ajustada al cierre del ejercicio (regla 2.8.1.6 RMF), con los saldos finales de diciembre como saldos iniciales y, con closing_entry, la póliza de cierre, y el catálogo como mes 12 (se envía con ella si no cambió en el ejercicio, fr. I); sin pólizas.
     * <p>
     * GET /v1/accounting/electronic_accounting
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-electronic-accounting
     */
    public byte[] electronicAccounting(GetElectronicAccountingParams params, RequestOptions options) {
        return api.bytes("GET", "/v1/accounting/electronic_accounting", null, params, false, options);
    }

    public byte[] electronicAccounting(GetElectronicAccountingParams params) {
        return electronicAccounting(params, null);
    }

    /**
     * Descargar toda la contabilidad de un periodo
     * <p>
     * Un ZIP para llevar los libros a otro sistema, de from_month a to_month (hasta 24 meses): el catálogo (1-catalogo, Excel con número, nombre, nivel, código agrupador y naturaleza), los saldos iniciales al primer día de from_month en deudor y acreedor (2-saldos-iniciales), las pólizas de todo el periodo para CONTPAQi Contabilidad (un TXT) y para Aspel COI (un Excel por mes), la balanza de comprobación de cada mes (una hoja por mes) y, en contabilidad-electronica, el catálogo (CT) y la balanza de cada mes (BN) en XML 1.3 del Anexo 24. LEEME.txt dice el orden en que se importa. Son los mismos libros de financial_statements y electronic_accounting.
     * <p>
     * GET /v1/accounting/books_export
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-books-export
     */
    public byte[] booksExport(GetBooksExportParams params, RequestOptions options) {
        return api.bytes("GET", "/v1/accounting/books_export", null, params, false, options);
    }

    public byte[] booksExport(GetBooksExportParams params) {
        return booksExport(params, null);
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

    /**
     * Ver los clientes con IEPS desglosado
     * <p>
     * La relación trimestral de los clientes a los que el emisor les trasladó el IEPS por separado (artículo 19, fracción II, tercer párrafo de la Ley del IEPS): bebidas alcohólicas, bebidas energetizantes, bebidas saborizadas y alimentos de alta densidad calórica, de sus facturas de ingreso no canceladas. Público en general y extranjeros no van. Se presenta cada trimestre en el MULTI-IEPS, Anexo 1 (regla 5.2.2 de la RMF 2026), en el mes siguiente al trimestre.
     * <p>
     * GET /v1/accounting/ieps_customers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-ieps-customers
     */
    public IepsCustomers iepsCustomers(GetIepsCustomersParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/ieps_customers", null, params, false, IepsCustomers.class, options);
    }

    public IepsCustomers iepsCustomers(GetIepsCustomersParams params) {
        return iepsCustomers(params, null);
    }

    /**
     * Descargar los clientes con IEPS desglosado
     * <p>
     * La relación de un trimestre en CSV (UTF-8): RFC, nombre, facturas e IEPS trasladado de cada cliente, y el total; la misma que descarga la app en Impuestos.
     * <p>
     * GET /v1/accounting/ieps_customers/file
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-ieps-customers-file
     */
    public String iepsCustomersFile(GetIepsCustomersFileParams params, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/accounting/ieps_customers/file", null, params, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String iepsCustomersFile(GetIepsCustomersFileParams params) {
        return iepsCustomersFile(params, null);
    }
}
