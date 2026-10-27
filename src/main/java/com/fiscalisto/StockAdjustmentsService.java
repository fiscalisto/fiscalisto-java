// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateStockAdjustmentParams;
import com.fiscalisto.model.ListStockAdjustmentsParams;
import com.fiscalisto.model.StockAdjustment;

/**
 * Inventario: client.stockAdjustments().
 */
public final class StockAdjustmentsService {
    private final ApiClient api;

    StockAdjustmentsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ajustar existencias
     * <p>
     * Mete o saca existencias de un almacén con su motivo: el inventario inicial, una merma, un robo, un sobrante. Las entradas valen su unit_cost (o el costo promedio), las salidas el costo del emisor (promedio o PEPS). Los productos deben llevar track_stock: true. Se aplica al momento (status applied).
     * <p>
     * POST /v1/stock_adjustments
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/create-stock-adjustment
     */
    public StockAdjustment create(CreateStockAdjustmentParams params, RequestOptions options) {
        return api.request("POST", "/v1/stock_adjustments", params, null, true, StockAdjustment.class, options);
    }

    public StockAdjustment create(CreateStockAdjustmentParams params) {
        return create(params, null);
    }

    /**
     * Listar ajustes
     * <p>
     * Los ajustes del emisor, los más recientes primero.
     * <p>
     * GET /v1/stock_adjustments
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/list-stock-adjustments
     */
    public Page<StockAdjustment> list(ListStockAdjustmentsParams params, RequestOptions options) {
        return api.list("/v1/stock_adjustments", params, StockAdjustment.class, options);
    }

    public Page<StockAdjustment> list(ListStockAdjustmentsParams params) {
        return list(params, null);
    }

    public Page<StockAdjustment> list() {
        return list(null, null);
    }

    /** Listar ajustes: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<StockAdjustment> listAutoPaging(ListStockAdjustmentsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<StockAdjustment> listAutoPaging(ListStockAdjustmentsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<StockAdjustment> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un ajuste
     * <p>
     * Un ajuste de existencias, con sus líneas.
     * <p>
     * GET /v1/stock_adjustments/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/get-stock-adjustment
     */
    public StockAdjustment get(String id, RequestOptions options) {
        return api.request("GET", "/v1/stock_adjustments/" + ApiClient.encode(id), null, null, false, StockAdjustment.class, options);
    }

    public StockAdjustment get(String id) {
        return get(id, null);
    }
}
