// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateCustomerParams;
import com.fiscalisto.model.Customer;
import com.fiscalisto.model.CustomerPaymentBehavior;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListCustomersParams;
import com.fiscalisto.model.UpdateCustomerParams;

/**
 * Cuentas por cobrar: client.customers().
 */
public final class CustomersService {
    private final ApiClient api;

    CustomersService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver cómo paga un cliente
     * <p>
     * Cuántos días tarda en pagar, qué parte llega a tiempo con sus días de crédito, si paga más lento que antes, cómo le paga y cuándo le llegaría lo que debe. De sus facturas a crédito (PPD) de los últimos 12 meses y sus complementos de pago, como «Cómo paga» en la app. No aplica a XAXX010101000 ni XEXX010101000.
     * <p>
     * GET /v1/customers/{id}/payment_behavior
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cuentas-por-cobrar/get-customer-payment-behavior
     */
    public CustomerPaymentBehavior paymentBehavior(String id, RequestOptions options) {
        return api.request("GET", "/v1/customers/" + ApiClient.encode(id) + "/payment_behavior", null, null, false, CustomerPaymentBehavior.class, options);
    }

    public CustomerPaymentBehavior paymentBehavior(String id) {
        return paymentBehavior(id, null);
    }

    /**
     * Crear un cliente
     * <p>
     * Un cliente del catálogo del emisor, con sus datos fiscales como vienen en su constancia. Un RFC que ya está en el catálogo contesta customer_exists.
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
     * Los clientes del emisor, los más recientes primero. Con tax_id, el de ese RFC.
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
     * Un cliente del catálogo.
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
     * Cambia solo los campos que manda. Las facturas ya timbradas no cambian.
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
     * Lo quita del catálogo. Sus facturas timbradas siguen igual.
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
