// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListWarehouseStockParams;
import com.fiscalisto.model.ListWarehousesParams;
import com.fiscalisto.model.StockLevel;
import com.fiscalisto.model.Warehouse;
import com.fiscalisto.model.WarehouseList;

/**
 * Inventario: client.warehouses().
 */
public final class WarehousesService {
    private final ApiClient api;

    WarehousesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar almacenes
     * <p>
     * Los almacenes del emisor, los más recientes primero: el de la Matriz y uno por sucursal se crean solos. Todos en una página.
     * <p>
     * GET /v1/warehouses
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/list-warehouses
     */
    public WarehouseList list(ListWarehousesParams params, RequestOptions options) {
        return api.request("GET", "/v1/warehouses", null, params, false, WarehouseList.class, options);
    }

    public WarehouseList list(ListWarehousesParams params) {
        return list(params, null);
    }

    public WarehouseList list() {
        return list(null, null);
    }

    /**
     * Ver un almacén
     * <p>
     * Un almacén del emisor.
     * <p>
     * GET /v1/warehouses/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/get-warehouse
     */
    public Warehouse get(String id, RequestOptions options) {
        return api.request("GET", "/v1/warehouses/" + ApiClient.encode(id), null, null, false, Warehouse.class, options);
    }

    public Warehouse get(String id) {
        return get(id, null);
    }

    /**
     * Ver las existencias de un almacén
     * <p>
     * Lo que hay de cada producto en el almacén, el producto más reciente primero. Solo los que tienen existencias, salvo con include_empty=true (todos los que llevan track_stock).
     * <p>
     * GET /v1/warehouses/{id}/stock
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/list-warehouse-stock
     */
    public Page<StockLevel> stock(String id, ListWarehouseStockParams params, RequestOptions options) {
        return api.list("/v1/warehouses/" + ApiClient.encode(id) + "/stock", params, StockLevel.class, options);
    }

    public Page<StockLevel> stock(String id, ListWarehouseStockParams params) {
        return stock(id, params, null);
    }

    public Page<StockLevel> stock(String id) {
        return stock(id, null, null);
    }

    /** Ver las existencias de un almacén: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<StockLevel> stockAutoPaging(String id, ListWarehouseStockParams params, RequestOptions options) {
        return stock(id, params, options).autoPagingIterable();
    }

    public Iterable<StockLevel> stockAutoPaging(String id, ListWarehouseStockParams params) {
        return stockAutoPaging(id, params, null);
    }

    public Iterable<StockLevel> stockAutoPaging() {
        return stockAutoPaging(null, null);
    }
}
