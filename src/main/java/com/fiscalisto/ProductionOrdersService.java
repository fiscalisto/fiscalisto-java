// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CompleteProductionOrderParams;
import com.fiscalisto.model.CreateProductionOrderParams;
import com.fiscalisto.model.ListProductionOrdersParams;
import com.fiscalisto.model.ProductionOrder;
import com.fiscalisto.model.StartProductionOrderParams;

/**
 * Inventario: client.productionOrders().
 */
public final class ProductionOrdersService {
    private final ApiClient api;

    ProductionOrdersService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear una orden de producción
     * <p>
     * Una orden en borrador (status draft) para producir quantity de un producto con receta: sus components salen de la receta (la hoja de costo de Compras › Costos y márgenes) con su merma y rendimiento, y sus other_costs se escalan a la cantidad. Nada se mueve hasta iniciarla. Enciende Producción en el inventario si estaba apagada. Un producto sin receta: 400 inventory_refused.
     * <p>
     * POST /v1/production_orders
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/create-production-order
     */
    public ProductionOrder create(CreateProductionOrderParams params, RequestOptions options) {
        return api.request("POST", "/v1/production_orders", params, null, true, ProductionOrder.class, options);
    }

    public ProductionOrder create(CreateProductionOrderParams params) {
        return create(params, null);
    }

    /**
     * Listar órdenes de producción
     * <p>
     * Las órdenes del emisor, las más recientes primero.
     * <p>
     * GET /v1/production_orders
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/list-production-orders
     */
    public Page<ProductionOrder> list(ListProductionOrdersParams params, RequestOptions options) {
        return api.list("/v1/production_orders", params, ProductionOrder.class, options);
    }

    public Page<ProductionOrder> list(ListProductionOrdersParams params) {
        return list(params, null);
    }

    public Page<ProductionOrder> list() {
        return list(null, null);
    }

    /** Listar órdenes de producción: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ProductionOrder> listAutoPaging(ListProductionOrdersParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ProductionOrder> listAutoPaging(ListProductionOrdersParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ProductionOrder> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una orden de producción
     * <p>
     * Una orden con sus componentes, sus otros costos y, al terminar, su costo por unidad.
     * <p>
     * GET /v1/production_orders/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/get-production-order
     */
    public ProductionOrder get(String id, RequestOptions options) {
        return api.request("GET", "/v1/production_orders/" + ApiClient.encode(id), null, null, false, ProductionOrder.class, options);
    }

    public ProductionOrder get(String id) {
        return get(id, null);
    }

    /**
     * Iniciar una orden de producción
     * <p>
     * Los componentes salen del almacén (status in_process), cada lote el que caduca primero, al costo del emisor (promedio o PEPS). Mande components para lo que de verdad se usó de alguno. Con existencias negativas en «No permitir», uno que no alcanza: 400 inventory_refused.
     * <p>
     * POST /v1/production_orders/{id}/start
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/start-production-order
     */
    public ProductionOrder start(String id, StartProductionOrderParams params, RequestOptions options) {
        return api.request("POST", "/v1/production_orders/" + ApiClient.encode(id) + "/start", params, null, true, ProductionOrder.class, options);
    }

    public ProductionOrder start(String id, StartProductionOrderParams params) {
        return start(id, params, null);
    }

    public ProductionOrder start(String id) {
        return start(id, null, null);
    }

    /**
     * Terminar una orden de producción
     * <p>
     * Lo producido entra al almacén destino a su costo real: (materials_cost + other_costs) ÷ quantity_made (status completed). Una en borrador se inicia antes con lo planeado.
     * <p>
     * POST /v1/production_orders/{id}/complete
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/complete-production-order
     */
    public ProductionOrder complete(String id, CompleteProductionOrderParams params, RequestOptions options) {
        return api.request("POST", "/v1/production_orders/" + ApiClient.encode(id) + "/complete", params, null, true, ProductionOrder.class, options);
    }

    public ProductionOrder complete(String id, CompleteProductionOrderParams params) {
        return complete(id, params, null);
    }

    public ProductionOrder complete(String id) {
        return complete(id, null, null);
    }

    /**
     * Cancelar una orden de producción
     * <p>
     * Los componentes regresan a su almacén y lo producido sale (status cancelled). Una ya cancelada: 400 inventory_refused.
     * <p>
     * POST /v1/production_orders/{id}/cancel
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/cancel-production-order
     */
    public ProductionOrder cancel(String id, RequestOptions options) {
        return api.request("POST", "/v1/production_orders/" + ApiClient.encode(id) + "/cancel", null, null, true, ProductionOrder.class, options);
    }

    public ProductionOrder cancel(String id) {
        return cancel(id, null);
    }
}
