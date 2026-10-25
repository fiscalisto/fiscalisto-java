// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateStoreConnectionParams;
import com.fiscalisto.model.ImportStoreOrdersParams;
import com.fiscalisto.model.ListStoreConnectionsParams;
import com.fiscalisto.model.StoreConnection;
import com.fiscalisto.model.StoreImport;
import com.fiscalisto.model.UpdateStoreConnectionParams;

/**
 * Tiendas en línea: client.storeConnections().
 */
public final class StoreConnectionsService {
    private final ApiClient api;

    StoreConnectionsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Conectar una tienda
     * <p>
     * Shopify: con el dominio y las llaves de la app de la tienda (Dev Dashboard, permisos read_orders y write_orders) registra los webhooks y queda active. Mercado Libre: queda pending hasta que el vendedor autorice en authorize_url. Desde entonces cada pedido pagado es un ticket (folio SHOP-1001 o ML-…), que su comprador factura en el portal o entra en la factura global; un pedido cancelado o reembolsado completo cancela su ticket.
     * <p>
     * POST /v1/store_connections
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tiendas-en-linea/create-store-connection
     */
    public StoreConnection create(CreateStoreConnectionParams params, RequestOptions options) {
        return api.request("POST", "/v1/store_connections", params, null, true, StoreConnection.class, options);
    }

    public StoreConnection create(CreateStoreConnectionParams params) {
        return create(params, null);
    }

    /**
     * Listar tiendas
     * <p>
     * Las más recientes primero, también las desconectadas.
     * <p>
     * GET /v1/store_connections
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tiendas-en-linea/list-store-connections
     */
    public Page<StoreConnection> list(ListStoreConnectionsParams params, RequestOptions options) {
        return api.list("/v1/store_connections", params, StoreConnection.class, options);
    }

    public Page<StoreConnection> list(ListStoreConnectionsParams params) {
        return list(params, null);
    }

    public Page<StoreConnection> list() {
        return list(null, null);
    }

    /** Listar tiendas: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<StoreConnection> listAutoPaging(ListStoreConnectionsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<StoreConnection> listAutoPaging(ListStoreConnectionsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<StoreConnection> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una tienda
     * <p>
     * GET /v1/store_connections/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tiendas-en-linea/get-store-connection
     */
    public StoreConnection get(String id, RequestOptions options) {
        return api.request("GET", "/v1/store_connections/" + ApiClient.encode(id), null, null, false, StoreConnection.class, options);
    }

    public StoreConnection get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar cómo se vuelven tickets sus pedidos
     * <p>
     * Cuenta para los pedidos que lleguen; los tickets ya hechos no cambian.
     * <p>
     * POST /v1/store_connections/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tiendas-en-linea/update-store-connection
     */
    public StoreConnection update(String id, UpdateStoreConnectionParams params, RequestOptions options) {
        return api.request("POST", "/v1/store_connections/" + ApiClient.encode(id), params, null, true, StoreConnection.class, options);
    }

    public StoreConnection update(String id, UpdateStoreConnectionParams params) {
        return update(id, params, null);
    }

    /**
     * Desconectar una tienda
     * <p>
     * Sus pedidos dejan de llegar y se borran sus llaves y webhooks. Los tickets que ya hizo siguen.
     * <p>
     * DELETE /v1/store_connections/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tiendas-en-linea/delete-store-connection
     */
    public StoreConnection delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/store_connections/" + ApiClient.encode(id), null, null, false, StoreConnection.class, options);
    }

    public StoreConnection delete(String id) {
        return delete(id, null);
    }

    /**
     * Traer pedidos pagados
     * <p>
     * Los pedidos pagados desde una fecha (hasta 31 días, 200 a la vez) que no llegaron por webhook: la tienda se conectó después o estuvo caída. Un pedido que ya es ticket no se repite.
     * <p>
     * POST /v1/store_connections/{id}/import_orders
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/tiendas-en-linea/import-store-orders
     */
    public StoreImport importOrders(String id, ImportStoreOrdersParams params, RequestOptions options) {
        return api.request("POST", "/v1/store_connections/" + ApiClient.encode(id) + "/import_orders", params, null, true, StoreImport.class, options);
    }

    public StoreImport importOrders(String id, ImportStoreOrdersParams params) {
        return importOrders(id, params, null);
    }

    public StoreImport importOrders(String id) {
        return importOrders(id, null, null);
    }
}
