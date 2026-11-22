// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AccountingBankMovement;
import com.fiscalisto.model.AccountingBankMovementList;
import com.fiscalisto.model.ListBankMovementsParams;
import com.fiscalisto.model.MarkBankMovementParams;
import com.fiscalisto.model.PostBankMovementParams;

/**
 * Contabilidad: client.bankMovements().
 */
public final class BankMovementsService {
    private final ApiClient api;

    BankMovementsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar los movimientos de banco sin factura
     * <p>
     * Los movimientos de banco de un mes que ninguna factura explica: los retiros de los estados de cuenta importados en la conciliación (comisiones, impuestos, pagos de préstamos, traspasos) y los depósitos que ahí se clasificaron como préstamo, traspaso, devolución o intereses. Cada uno con su póliza, si ya se registró, y la cuenta sugerida. Lo que pagó o cobró una factura ya está en la contabilidad por su CFDI.
     * <p>
     * GET /v1/accounting/bank_movements
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-bank-movements
     */
    public AccountingBankMovementList list(ListBankMovementsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/bank_movements", null, params, false, AccountingBankMovementList.class, options);
    }

    public AccountingBankMovementList list(ListBankMovementsParams params) {
        return list(params, null);
    }

    public AccountingBankMovementList list() {
        return list(null, null);
    }

    /**
     * Registrar un movimiento de banco
     * <p>
     * Le hace su póliza con fecha del movimiento: de ingresos (Bancos contra account) a un depósito, de egresos (account contra Bancos) a un retiro. Entra a la balanza, el auxiliar y la contabilidad electrónica como cualquier póliza capturada (manual_entry). Uno ya registrado contesta bank_movement_posted; un depósito sin clasificar o un retiro marcado, bank_movement_not_bookable.
     * <p>
     * POST /v1/accounting/bank_movements/{id}/post
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/post-bank-movement
     */
    public AccountingBankMovement post(String id, PostBankMovementParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/bank_movements/" + ApiClient.encode(id) + "/post", params, null, true, AccountingBankMovement.class, options);
    }

    public AccountingBankMovement post(String id, PostBankMovementParams params) {
        return post(id, params, null);
    }

    /**
     * Quitar la póliza de un movimiento de banco
     * <p>
     * Su póliza sale de la contabilidad y el movimiento vuelve a pending. Sin póliza contesta bank_movement_not_posted.
     * <p>
     * DELETE /v1/accounting/bank_movements/{id}/post
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/unpost-bank-movement
     */
    public AccountingBankMovement unpost(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/bank_movements/" + ApiClient.encode(id) + "/post", null, null, false, AccountingBankMovement.class, options);
    }

    public AccountingBankMovement unpost(String id) {
        return unpost(id, null);
    }

    /**
     * Marcar un retiro
     * <p>
     * paid_invoices: pagó facturas que ya están en la contabilidad por su CFDI; ignored: no se registra; pending: vuelve a por registrar. Solo retiros sin póliza.
     * <p>
     * POST /v1/accounting/bank_movements/{id}/mark
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/mark-bank-movement
     */
    public AccountingBankMovement mark(String id, MarkBankMovementParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/bank_movements/" + ApiClient.encode(id) + "/mark", params, null, true, AccountingBankMovement.class, options);
    }

    public AccountingBankMovement mark(String id, MarkBankMovementParams params) {
        return mark(id, params, null);
    }
}
