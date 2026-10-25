// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateCustomerParams;
import com.fiscalisto.model.Customer;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListCustomersParams;
import com.fiscalisto.model.UpdateCustomerParams;

/**
 * Clientes: client.customers().
 */
public final class CustomersService {
    private final ApiClient api;

    CustomersService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un cliente
     * <p>
     * POST /v1/customers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/create-customer
     */
    public Customer create(CreateCustomerParams params, RequestOptions options) {
        return api.request("POST", "/v1/customers", params, null, true, Customer.class, options);
    }

    public Customer create(CreateCustomerParams params) {
        return create(params, null);
    }

    /**
     * Listar clientes
     * <p>
     * GET /v1/customers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/list-customers
     */
    public Page<Customer> list(ListCustomersParams params, RequestOptions options) {
        return api.list("/v1/customers", params, Customer.class, options);
    }

    public Page<Customer> list(ListCustomersParams params) {
        return list(params, null);
    }

    public Page<Customer> list() {
        return list(null, null);
    }

    /** Listar clientes: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Customer> listAutoPaging(ListCustomersParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Customer> listAutoPaging(ListCustomersParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Customer> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un cliente
     * <p>
     * GET /v1/customers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/get-customer
     */
    public Customer get(String id, RequestOptions options) {
        return api.request("GET", "/v1/customers/" + ApiClient.encode(id), null, null, false, Customer.class, options);
    }

    public Customer get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar un cliente
     * <p>
     * POST /v1/customers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/update-customer
     */
    public Customer update(String id, UpdateCustomerParams params, RequestOptions options) {
        return api.request("POST", "/v1/customers/" + ApiClient.encode(id), params, null, true, Customer.class, options);
    }

    public Customer update(String id, UpdateCustomerParams params) {
        return update(id, params, null);
    }

    public Customer update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un cliente
     * <p>
     * DELETE /v1/customers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/delete-customer
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/customers/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
