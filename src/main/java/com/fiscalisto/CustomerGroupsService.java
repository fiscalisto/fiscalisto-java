// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateCustomerGroupParams;
import com.fiscalisto.model.CustomerGroup;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListCustomerGroupsParams;
import com.fiscalisto.model.UpdateCustomerGroupParams;

/**
 * Listas de precios: client.customerGroups().
 */
public final class CustomerGroupsService {
    private final ApiClient api;

    CustomerGroupsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un grupo de clientes
     * <p>
     * Lo que tienen todos sus clientes: price_list, discount_percent (el descuento de cada concepto en el CFDI), credit_days, min_order (antes de IVA, desde el portal) y portal_ordering. Un cliente entra con group en POST /v1/customers/{id}.
     * <p>
     * POST /v1/customer_groups
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/create-customer-group
     */
    public CustomerGroup create(CreateCustomerGroupParams params, RequestOptions options) {
        return api.request("POST", "/v1/customer_groups", params, null, true, CustomerGroup.class, options);
    }

    public CustomerGroup create(CreateCustomerGroupParams params) {
        return create(params, null);
    }

    /**
     * Listar grupos de clientes
     * <p>
     * Los grupos de clientes, con cuántos clientes tiene cada uno.
     * <p>
     * GET /v1/customer_groups
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/list-customer-groups
     */
    public Page<CustomerGroup> list(ListCustomerGroupsParams params, RequestOptions options) {
        return api.list("/v1/customer_groups", params, CustomerGroup.class, options);
    }

    public Page<CustomerGroup> list(ListCustomerGroupsParams params) {
        return list(params, null);
    }

    public Page<CustomerGroup> list() {
        return list(null, null);
    }

    /** Listar grupos de clientes: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<CustomerGroup> listAutoPaging(ListCustomerGroupsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<CustomerGroup> listAutoPaging(ListCustomerGroupsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<CustomerGroup> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un grupo de clientes
     * <p>
     * Un grupo de clientes.
     * <p>
     * GET /v1/customer_groups/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/get-customer-group
     */
    public CustomerGroup get(String id, RequestOptions options) {
        return api.request("GET", "/v1/customer_groups/" + ApiClient.encode(id), null, null, false, CustomerGroup.class, options);
    }

    public CustomerGroup get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar un grupo de clientes
     * <p>
     * Cambia solo lo que manda.
     * <p>
     * POST /v1/customer_groups/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/update-customer-group
     */
    public CustomerGroup update(String id, UpdateCustomerGroupParams params, RequestOptions options) {
        return api.request("POST", "/v1/customer_groups/" + ApiClient.encode(id), params, null, true, CustomerGroup.class, options);
    }

    public CustomerGroup update(String id, UpdateCustomerGroupParams params) {
        return update(id, params, null);
    }

    public CustomerGroup update(String id) {
        return update(id, null, null);
    }

    /**
     * Quitar un grupo de clientes
     * <p>
     * Sus clientes se quedan sin grupo.
     * <p>
     * DELETE /v1/customer_groups/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/delete-customer-group
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/customer_groups/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
