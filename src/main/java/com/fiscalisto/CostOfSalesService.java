// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CostOfSales;
import com.fiscalisto.model.CreateCostOfSalesParams;
import com.fiscalisto.model.DeleteCostOfSalesParams;
import com.fiscalisto.model.GetCostOfSalesParams;

/**
 * Contabilidad: client.costOfSales().
 */
public final class CostOfSalesService {
    private final ApiClient api;

    CostOfSalesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver el costo de ventas de un mes
     * <p>
     * Las compras netas del mes según sus pólizas, el inventario en libros, lo que vale el inventario según Inventario y la póliza de costo de ventas, si ya se registró. Como Cierre del mes › Inventario y costo de ventas en la app.
     * <p>
     * GET /v1/accounting/cost_of_sales/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-cost-of-sales
     */
    public CostOfSales get(String month, GetCostOfSalesParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/cost_of_sales/" + ApiClient.encode(month), null, params, false, CostOfSales.class, options);
    }

    public CostOfSales get(String month, GetCostOfSalesParams params) {
        return get(month, params, null);
    }

    public CostOfSales get(String month) {
        return get(month, null, null);
    }

    /**
     * Registrar el costo de ventas de un mes
     * <p>
     * Registra (o reemplaza) la póliza del último día del mes en el sistema de inventarios periódico: Inventario queda en ending_inventory, las compras (502) y sus devoluciones (503) se cancelan y la diferencia va a Costo de ventas (501.01): inventario inicial + compras netas − inventario final, el costo de lo vendido que se deduce (LISR arts. 25-II y 39). Sin compras ni cambio de inventario contesta parameter_invalid en month; en un mes cerrado, period_closed.
     * <p>
     * POST /v1/accounting/cost_of_sales/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/create-cost-of-sales
     */
    public CostOfSales create(String month, CreateCostOfSalesParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/cost_of_sales/" + ApiClient.encode(month), params, null, true, CostOfSales.class, options);
    }

    public CostOfSales create(String month, CreateCostOfSalesParams params) {
        return create(month, params, null);
    }

    /**
     * Quitar el costo de ventas de un mes
     * <p>
     * Quita la póliza de costo de ventas del mes. En un mes cerrado contesta period_closed.
     * <p>
     * DELETE /v1/accounting/cost_of_sales/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/delete-cost-of-sales
     */
    public CostOfSales delete(String month, DeleteCostOfSalesParams params, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/cost_of_sales/" + ApiClient.encode(month), null, params, false, CostOfSales.class, options);
    }

    public CostOfSales delete(String month, DeleteCostOfSalesParams params) {
        return delete(month, params, null);
    }

    public CostOfSales delete(String month) {
        return delete(month, null, null);
    }
}
