// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateProductParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListProductsParams;
import com.fiscalisto.model.Product;
import com.fiscalisto.model.StockLevelList;
import com.fiscalisto.model.UpdateProductParams;

/**
 * Productos: client.products().
 */
public final class ProductsService {
    private final ApiClient api;

    ProductsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un producto
     * <p>
     * Un producto o servicio del catálogo del emisor, con su clave del SAT, su unidad, su precio y sus impuestos, para usarlo en items con product.
     * <p>
     * POST /v1/products
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/productos/create-product
     */
    public Product create(CreateProductParams params, RequestOptions options) {
        return api.request("POST", "/v1/products", params, null, true, Product.class, options);
    }

    public Product create(CreateProductParams params) {
        return create(params, null);
    }

    /**
     * Listar productos
     * <p>
     * Los productos del emisor, los más recientes primero. Filtre por sku o product_key.
     * <p>
     * GET /v1/products
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/productos/list-products
     */
    public Page<Product> list(ListProductsParams params, RequestOptions options) {
        return api.list("/v1/products", params, Product.class, options);
    }

    public Page<Product> list(ListProductsParams params) {
        return list(params, null);
    }

    public Page<Product> list() {
        return list(null, null);
    }

    /** Listar productos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Product> listAutoPaging(ListProductsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Product> listAutoPaging(ListProductsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Product> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un producto
     * <p>
     * Un producto del catálogo.
     * <p>
     * GET /v1/products/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/productos/get-product
     */
    public Product get(String id, RequestOptions options) {
        return api.request("GET", "/v1/products/" + ApiClient.encode(id), null, null, false, Product.class, options);
    }

    public Product get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar un producto
     * <p>
     * Cambia solo los campos que manda. Las facturas ya timbradas no cambian.
     * <p>
     * POST /v1/products/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/productos/update-product
     */
    public Product update(String id, UpdateProductParams params, RequestOptions options) {
        return api.request("POST", "/v1/products/" + ApiClient.encode(id), params, null, true, Product.class, options);
    }

    public Product update(String id, UpdateProductParams params) {
        return update(id, params, null);
    }

    public Product update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un producto
     * <p>
     * Lo quita del catálogo. Las facturas que lo usaron siguen igual.
     * <p>
     * DELETE /v1/products/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/productos/delete-product
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/products/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Ver las existencias de un producto
     * <p>
     * Lo que hay del producto en cada almacén del emisor (también en 0), apartado por cotizaciones y disponible.
     * <p>
     * GET /v1/products/{id}/stock
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/inventario/get-product-stock
     */
    public StockLevelList stock(String id, RequestOptions options) {
        return api.request("GET", "/v1/products/" + ApiClient.encode(id) + "/stock", null, null, false, StockLevelList.class, options);
    }

    public StockLevelList stock(String id) {
        return stock(id, null);
    }
}
