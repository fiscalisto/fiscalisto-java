// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreatePriceListParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListPriceListsParams;
import com.fiscalisto.model.PriceList;
import com.fiscalisto.model.UpdatePriceListParams;

/**
 * Listas de precios: client.priceLists().
 */
public final class PriceListsService {
    private final ApiClient api;

    PriceListsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear una lista de precios
     * <p>
     * Parte del precio del catálogo (o de base_list, otra lista), lo mueve adjust_percent y lo redondea a round_to; con starts_on y ends_on es una promoción. items le pone precios propios por producto, por presentación (unit, una caja) y desde min_quantity (escalones de mayoreo), cada uno con unit_price o discount_percent. is_default: la tienen los clientes sin otra. Hasta 100.
     * <p>
     * POST /v1/price_lists
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/create-price-list
     */
    public PriceList create(CreatePriceListParams params, RequestOptions options) {
        return api.request("POST", "/v1/price_lists", params, null, true, PriceList.class, options);
    }

    public PriceList create(CreatePriceListParams params) {
        return create(params, null);
    }

    /**
     * Listar listas de precios
     * <p>
     * Las listas de precios en el orden de la app, con cuántos grupos y clientes la tienen. items viene al ver una.
     * <p>
     * GET /v1/price_lists
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/list-price-lists
     */
    public Page<PriceList> list(ListPriceListsParams params, RequestOptions options) {
        return api.list("/v1/price_lists", params, PriceList.class, options);
    }

    public Page<PriceList> list(ListPriceListsParams params) {
        return list(params, null);
    }

    public Page<PriceList> list() {
        return list(null, null);
    }

    /** Listar listas de precios: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<PriceList> listAutoPaging(ListPriceListsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<PriceList> listAutoPaging(ListPriceListsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<PriceList> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una lista de precios
     * <p>
     * Una lista de precios con sus precios propios (items).
     * <p>
     * GET /v1/price_lists/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/get-price-list
     */
    public PriceList get(String id, RequestOptions options) {
        return api.request("GET", "/v1/price_lists/" + ApiClient.encode(id), null, null, false, PriceList.class, options);
    }

    public PriceList get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar una lista de precios
     * <p>
     * Cambia solo lo que manda; items reemplaza todos sus precios propios. Las facturas, cotizaciones y pedidos ya hechos no cambian.
     * <p>
     * POST /v1/price_lists/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/update-price-list
     */
    public PriceList update(String id, UpdatePriceListParams params, RequestOptions options) {
        return api.request("POST", "/v1/price_lists/" + ApiClient.encode(id), params, null, true, PriceList.class, options);
    }

    public PriceList update(String id, UpdatePriceListParams params) {
        return update(id, params, null);
    }

    public PriceList update(String id) {
        return update(id, null, null);
    }

    /**
     * Quitar una lista de precios
     * <p>
     * La archiva: sus grupos y clientes pasan a la lista que aplica a todos (o al precio del catálogo).
     * <p>
     * DELETE /v1/price_lists/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/delete-price-list
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/price_lists/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
