// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListStockMovementsParams;
import com.fiscalisto.model.StockMovement;

/**
 * Inventario: client.stockMovements().
 */
public final class StockMovementsService {
    private final ApiClient api;

    StockMovementsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar movimientos (kárdex)
     * <p>
     * Cada entrada y salida de existencias, la más reciente primero: ventas (de sus facturas), compras, ajustes, traspasos y lo que deshizo una cancelación.
     * <p>
     * GET /v1/stock_movements
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/list-stock-movements
     */
    public Page<StockMovement> list(ListStockMovementsParams params, RequestOptions options) {
        return api.list("/v1/stock_movements", params, StockMovement.class, options);
    }

    public Page<StockMovement> list(ListStockMovementsParams params) {
        return list(params, null);
    }

    public Page<StockMovement> list() {
        return list(null, null);
    }

    /** Listar movimientos (kárdex): todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<StockMovement> listAutoPaging(ListStockMovementsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<StockMovement> listAutoPaging(ListStockMovementsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<StockMovement> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un movimiento
     * <p>
     * Una entrada o salida de existencias, con lo que la causó (source).
     * <p>
     * GET /v1/stock_movements/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/get-stock-movement
     */
    public StockMovement get(String id, RequestOptions options) {
        return api.request("GET", "/v1/stock_movements/" + ApiClient.encode(id), null, null, false, StockMovement.class, options);
    }

    public StockMovement get(String id) {
        return get(id, null);
    }
}
