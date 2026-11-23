// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetPrepaidExpenseParams;
import com.fiscalisto.model.PrepaidExpense;
import com.fiscalisto.model.RemovePrepaidExpenseParams;
import com.fiscalisto.model.UpdatePrepaidExpenseParams;

/**
 * Contabilidad: client.prepaidExpenses().
 */
public final class PrepaidExpensesService {
    private final ApiClient api;

    PrepaidExpensesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver si una factura se amortiza
     * <p>
     * Si una factura recibida (por su UUID) es un gasto pagado por anticipado y su calendario: una póliza de amortización al final de cada mes que cubre.
     * <p>
     * GET /v1/accounting/prepaid_expenses/{uuid}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-prepaid-expense
     */
    public PrepaidExpense get(String uuid, GetPrepaidExpenseParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/prepaid_expenses/" + ApiClient.encode(uuid), null, params, false, PrepaidExpense.class, options);
    }

    public PrepaidExpense get(String uuid, GetPrepaidExpenseParams params) {
        return get(uuid, params, null);
    }

    public PrepaidExpense get(String uuid) {
        return get(uuid, null, null);
    }

    /**
     * Amortizar una factura pagada por anticipado
     * <p>
     * Su póliza va a pagos anticipados (109.01, 109.05 o 109.23) y los libros la pasan a su gasto al final de cada mes que cubre (NIF C-5). Solo una factura de ingreso recibida que se registra como gasto: un activo fijo, un movimiento o una por aclarar no se amortiza, ni una cuya póliza se editó a mano. Un mes cerrado contesta period_closed. Impuestos no cambia.
     * <p>
     * POST /v1/accounting/prepaid_expenses/{uuid}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/update-prepaid-expense
     */
    public PrepaidExpense update(String uuid, UpdatePrepaidExpenseParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/prepaid_expenses/" + ApiClient.encode(uuid), params, null, true, PrepaidExpense.class, options);
    }

    public PrepaidExpense update(String uuid, UpdatePrepaidExpenseParams params) {
        return update(uuid, params, null);
    }

    /**
     * Dejar de amortizar una factura
     * <p>
     * Vuelve a registrarse como gasto del mes en la cuenta a la que se amortizaba, y sus pólizas de amortización salen de los libros. Un mes cerrado contesta period_closed.
     * <p>
     * DELETE /v1/accounting/prepaid_expenses/{uuid}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/remove-prepaid-expense
     */
    public PrepaidExpense remove(String uuid, RemovePrepaidExpenseParams params, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/prepaid_expenses/" + ApiClient.encode(uuid), null, params, false, PrepaidExpense.class, options);
    }

    public PrepaidExpense remove(String uuid, RemovePrepaidExpenseParams params) {
        return remove(uuid, params, null);
    }

    public PrepaidExpense remove(String uuid) {
        return remove(uuid, null, null);
    }
}
