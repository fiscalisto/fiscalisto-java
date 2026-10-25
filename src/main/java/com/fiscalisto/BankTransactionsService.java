// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.BankImport;
import com.fiscalisto.model.BankTransaction;
import com.fiscalisto.model.ClassifyBankTransactionParams;
import com.fiscalisto.model.CreateBankTransactionsParams;
import com.fiscalisto.model.ListBankTransactionsParams;
import com.fiscalisto.model.MatchBankTransactionParams;

/**
 * Conciliación bancaria: client.bankTransactions().
 */
public final class BankTransactionsService {
    private final ApiClient api;

    BankTransactionsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Mandar depósitos
     * <p>
     * Los depósitos de la cuenta del emisor (de la API de su banco o de un estado de cuenta), hasta 1,000 por solicitud. Uno que ya mandó (mismo día, monto, referencia y concepto) se omite, así que puede mandar periodos que se enciman. Cada uno trae suggested_match: las facturas que parece pagar.
     * <p>
     * POST /v1/bank_transactions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/conciliacion-bancaria/create-bank-transactions
     */
    public BankImport create(CreateBankTransactionsParams params, RequestOptions options) {
        return api.request("POST", "/v1/bank_transactions", params, null, false, BankImport.class, options);
    }

    public BankImport create(CreateBankTransactionsParams params) {
        return create(params, null);
    }

    /**
     * Listar depósitos
     * <p>
     * Los más recientes primero; los abiertos con su suggested_match.
     * <p>
     * GET /v1/bank_transactions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/conciliacion-bancaria/list-bank-transactions
     */
    public Page<BankTransaction> list(ListBankTransactionsParams params, RequestOptions options) {
        return api.list("/v1/bank_transactions", params, BankTransaction.class, options);
    }

    public Page<BankTransaction> list(ListBankTransactionsParams params) {
        return list(params, null);
    }

    public Page<BankTransaction> list() {
        return list(null, null);
    }

    /** Listar depósitos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<BankTransaction> listAutoPaging(ListBankTransactionsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<BankTransaction> listAutoPaging(ListBankTransactionsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<BankTransaction> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un depósito
     * <p>
     * GET /v1/bank_transactions/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/conciliacion-bancaria/get-bank-transaction
     */
    public BankTransaction get(String id, RequestOptions options) {
        return api.request("GET", "/v1/bank_transactions/" + ApiClient.encode(id), null, null, false, BankTransaction.class, options);
    }

    public BankTransaction get(String id) {
        return get(id, null);
    }

    /**
     * Conciliar un depósito
     * <p>
     * El depósito pagó estas facturas (de un mismo cliente), o sin invoices, las de suggested_match. Sus facturas PUE por cobrar quedan pagadas (invoice.paid). No timbra: para pagar una PPD con este depósito, POST /v1/payments con bank_transaction.
     * <p>
     * POST /v1/bank_transactions/{id}/match
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/conciliacion-bancaria/match-bank-transaction
     */
    public BankTransaction match(String id, MatchBankTransactionParams params, RequestOptions options) {
        return api.request("POST", "/v1/bank_transactions/" + ApiClient.encode(id) + "/match", params, null, false, BankTransaction.class, options);
    }

    public BankTransaction match(String id, MatchBankTransactionParams params) {
        return match(id, params, null);
    }

    public BankTransaction match(String id) {
        return match(id, null, null);
    }

    /**
     * Explicar un depósito sin factura
     * <p>
     * Un depósito que ninguna factura explica: venta (aún sin facturar), prestamo, traspaso o devolucion. El SAT puede presumir ingreso un depósito sin explicar (CFF art. 59 fr. III).
     * <p>
     * POST /v1/bank_transactions/{id}/classify
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/conciliacion-bancaria/classify-bank-transaction
     */
    public BankTransaction classify(String id, ClassifyBankTransactionParams params, RequestOptions options) {
        return api.request("POST", "/v1/bank_transactions/" + ApiClient.encode(id) + "/classify", params, null, false, BankTransaction.class, options);
    }

    public BankTransaction classify(String id, ClassifyBankTransactionParams params) {
        return classify(id, params, null);
    }

    /**
     * Deshacer la conciliación
     * <p>
     * Vuelve a open, y sus facturas vuelven a deber. Si se pagó con un complemento vigente, cancélelo antes.
     * <p>
     * POST /v1/bank_transactions/{id}/reopen
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/conciliacion-bancaria/reopen-bank-transaction
     */
    public BankTransaction reopen(String id, RequestOptions options) {
        return api.request("POST", "/v1/bank_transactions/" + ApiClient.encode(id) + "/reopen", null, null, false, BankTransaction.class, options);
    }

    public BankTransaction reopen(String id) {
        return reopen(id, null);
    }
}
