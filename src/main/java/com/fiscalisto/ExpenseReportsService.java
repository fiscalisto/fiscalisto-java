// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ApproveExpenseReportParams;
import com.fiscalisto.model.CreateExpenseItemParams;
import com.fiscalisto.model.CreateExpenseMovementParams;
import com.fiscalisto.model.CreateExpenseReportParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ExpenseReport;
import com.fiscalisto.model.ListExpenseReportsParams;
import com.fiscalisto.model.ReturnExpenseReportParams;
import com.fiscalisto.model.UpdateExpenseItemParams;
import com.fiscalisto.model.UpdateExpenseReportParams;

/**
 * Viáticos y gastos: client.expenseReports().
 */
public final class ExpenseReportsService {
    private final ApiClient api;

    ExpenseReportsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Abrir una comprobación
     * <p>
     * Una por viaje (kind viaje) o una por periodo de gastos de oficina que la empresa reembolsa (kind gastos). Queda abierta (draft): se le agregan gastos y anticipos, y se envía con POST /v1/expense_reports/{id}/submit.
     * <p>
     * POST /v1/expense_reports
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/create-expense-report
     */
    public ExpenseReport create(CreateExpenseReportParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_reports", params, null, true, ExpenseReport.class, options);
    }

    public ExpenseReport create(CreateExpenseReportParams params) {
        return create(params, null);
    }

    /**
     * Listar comprobaciones
     * <p>
     * Las comprobaciones del emisor, las más recientes primero, con sus gastos y movimientos.
     * <p>
     * GET /v1/expense_reports
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/list-expense-reports
     */
    public Page<ExpenseReport> list(ListExpenseReportsParams params, RequestOptions options) {
        return api.list("/v1/expense_reports", params, ExpenseReport.class, options);
    }

    public Page<ExpenseReport> list(ListExpenseReportsParams params) {
        return list(params, null);
    }

    public Page<ExpenseReport> list() {
        return list(null, null);
    }

    /** Listar comprobaciones: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ExpenseReport> listAutoPaging(ListExpenseReportsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ExpenseReport> listAutoPaging(ListExpenseReportsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ExpenseReport> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una comprobación
     * <p>
     * Una comprobación con sus gastos, lo deducible de cada uno, sus avisos (issues) contra la ley y la política, y su saldo.
     * <p>
     * GET /v1/expense_reports/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/get-expense-report
     */
    public ExpenseReport get(String id, RequestOptions options) {
        return api.request("GET", "/v1/expense_reports/" + ApiClient.encode(id), null, null, false, ExpenseReport.class, options);
    }

    public ExpenseReport get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar una comprobación
     * <p>
     * Cambia solo lo que manda: su nombre, el propósito, el destino y las fechas. Mientras no esté aprobada.
     * <p>
     * POST /v1/expense_reports/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/update-expense-report
     */
    public ExpenseReport update(String id, UpdateExpenseReportParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_reports/" + ApiClient.encode(id), params, null, true, ExpenseReport.class, options);
    }

    public ExpenseReport update(String id, UpdateExpenseReportParams params) {
        return update(id, params, null);
    }

    public ExpenseReport update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar una comprobación
     * <p>
     * Una que no esté aprobada y no tenga anticipos ni pagos (quítelos antes). No se puede deshacer.
     * <p>
     * DELETE /v1/expense_reports/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/delete-expense-report
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/expense_reports/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Enviar a aprobar
     * <p>
     * La persona termina: pasa a submitted (por aprobar). Contesta expense_report_invalid si un gasto tiene un error (issues con level error).
     * <p>
     * POST /v1/expense_reports/{id}/submit
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/submit-expense-report
     */
    public ExpenseReport submit(String id, RequestOptions options) {
        return api.request("POST", "/v1/expense_reports/" + ApiClient.encode(id) + "/submit", null, null, true, ExpenseReport.class, options);
    }

    public ExpenseReport submit(String id) {
        return submit(id, null);
    }

    /**
     * Aprobar una comprobación
     * <p>
     * Pasa a approved (por liquidar): sus facturas se deducen en los impuestos del emisor y entra en las pólizas contra 107.01 Funcionarios y empleados. Con el saldo en cero se cierra sola; si no, liquide con un reembolso o una devolución.
     * <p>
     * POST /v1/expense_reports/{id}/approve
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/approve-expense-report
     */
    public ExpenseReport approve(String id, ApproveExpenseReportParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_reports/" + ApiClient.encode(id) + "/approve", params, null, true, ExpenseReport.class, options);
    }

    public ExpenseReport approve(String id, ApproveExpenseReportParams params) {
        return approve(id, params, null);
    }

    public ExpenseReport approve(String id) {
        return approve(id, null, null);
    }

    /**
     * Devolver para corregir
     * <p>
     * Regresa a la persona (rejected, «Devuelta») con una nota de qué corregir. La corrige y la vuelve a enviar.
     * <p>
     * POST /v1/expense_reports/{id}/return
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/return-expense-report
     */
    public ExpenseReport sendBack(String id, ReturnExpenseReportParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_reports/" + ApiClient.encode(id) + "/return", params, null, true, ExpenseReport.class, options);
    }

    public ExpenseReport sendBack(String id, ReturnExpenseReportParams params) {
        return sendBack(id, params, null);
    }

    /**
     * Reabrir una comprobación
     * <p>
     * Una aprobada vuelve a abierta: sus facturas dejan de deducirse y sale de las pólizas. No si ya se reportó en la nómina.
     * <p>
     * POST /v1/expense_reports/{id}/reopen
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/reopen-expense-report
     */
    public ExpenseReport reopen(String id, RequestOptions options) {
        return api.request("POST", "/v1/expense_reports/" + ApiClient.encode(id) + "/reopen", null, null, true, ExpenseReport.class, options);
    }

    public ExpenseReport reopen(String id) {
        return reopen(id, null);
    }

    /**
     * Agregar un gasto
     * <p>
     * Con uuid, una factura recibida del emisor (GET /v1/sat_invoices): la fecha, el monto y el proveedor salen de ella. Sin uuid, un gasto con su category, date y amount (un ticket, un comprobante del extranjero). Contesta la comprobación revisada.
     * <p>
     * POST /v1/expense_reports/{id}/items
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/create-expense-item
     */
    public ExpenseReport createItem(String id, CreateExpenseItemParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_reports/" + ApiClient.encode(id) + "/items", params, null, true, ExpenseReport.class, options);
    }

    public ExpenseReport createItem(String id, CreateExpenseItemParams params) {
        return createItem(id, params, null);
    }

    /**
     * Actualizar un gasto
     * <p>
     * Cambia solo lo que manda. Al revisarla, rejected: true con reject_reason rechaza el gasto (no se paga ni se deduce) y false lo vuelve a incluir.
     * <p>
     * POST /v1/expense_reports/{id}/items/{item}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/update-expense-item
     */
    public ExpenseReport updateItem(String id, String item, UpdateExpenseItemParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_reports/" + ApiClient.encode(id) + "/items/" + ApiClient.encode(item), params, null, true, ExpenseReport.class, options);
    }

    public ExpenseReport updateItem(String id, String item, UpdateExpenseItemParams params) {
        return updateItem(id, item, params, null);
    }

    public ExpenseReport updateItem(String id, String item) {
        return updateItem(id, item, null, null);
    }

    /**
     * Quitar un gasto
     * <p>
     * Lo quita de la comprobación mientras no esté aprobada. Contesta la comprobación.
     * <p>
     * DELETE /v1/expense_reports/{id}/items/{item}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/delete-expense-item
     */
    public ExpenseReport deleteItem(String id, String item, RequestOptions options) {
        return api.request("DELETE", "/v1/expense_reports/" + ApiClient.encode(id) + "/items/" + ApiClient.encode(item), null, null, false, ExpenseReport.class, options);
    }

    public ExpenseReport deleteItem(String id, String item) {
        return deleteItem(id, item, null);
    }

    /**
     * Registrar dinero dado o devuelto
     * <p>
     * Un anticipo (antes de aprobarla), un reembolso o una devolución (ya aprobada). Con method nomina va en el siguiente recibo de nómina del empleado. Con el saldo en cero, una aprobada se cierra.
     * <p>
     * POST /v1/expense_reports/{id}/movements
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/create-expense-movement
     */
    public ExpenseReport createMovement(String id, CreateExpenseMovementParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_reports/" + ApiClient.encode(id) + "/movements", params, null, true, ExpenseReport.class, options);
    }

    public ExpenseReport createMovement(String id, CreateExpenseMovementParams params) {
        return createMovement(id, params, null);
    }

    /**
     * Deshacer un movimiento
     * <p>
     * Lo quita (una cerrada vuelve a por liquidar). No uno que ya se pagó en la nómina.
     * <p>
     * DELETE /v1/expense_reports/{id}/movements/{movement}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/delete-expense-movement
     */
    public ExpenseReport deleteMovement(String id, String movement, RequestOptions options) {
        return api.request("DELETE", "/v1/expense_reports/" + ApiClient.encode(id) + "/movements/" + ApiClient.encode(movement), null, null, false, ExpenseReport.class, options);
    }

    public ExpenseReport deleteMovement(String id, String movement) {
        return deleteMovement(id, movement, null);
    }
}
