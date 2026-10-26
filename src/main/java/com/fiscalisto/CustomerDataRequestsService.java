// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateCustomerDataRequestParams;
import com.fiscalisto.model.CustomerDataRequest;
import com.fiscalisto.model.ListCustomerDataRequestsParams;

/**
 * Clientes: client.customerDataRequests().
 */
public final class CustomerDataRequestsService {
    private final ApiClient api;

    CustomerDataRequestsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Pedirle sus datos fiscales a un cliente
     * <p>
     * Una liga (url) que usted le manda a su cliente: la abre en fiscalisto.com y da su RFC, nombre, régimen, código postal y uso, escritos o leídos de su constancia, revisados antes de aceptarlos. Al mandarlos llega customer_data_request.completed. Un cliente nuevo queda en el catálogo del emisor; si ya existía con otros datos, los nuevos vienen en submission para que usted los aplique.
     * <p>
     * POST /v1/customer_data_requests
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/create-customer-data-request
     */
    public CustomerDataRequest create(CreateCustomerDataRequestParams params, RequestOptions options) {
        return api.request("POST", "/v1/customer_data_requests", params, null, true, CustomerDataRequest.class, options);
    }

    public CustomerDataRequest create(CreateCustomerDataRequestParams params) {
        return create(params, null);
    }

    public CustomerDataRequest create() {
        return create(null, null);
    }

    /**
     * Listar solicitudes de datos
     * <p>
     * Las ligas para pedir datos fiscales, las más recientes primero, con su estado.
     * <p>
     * GET /v1/customer_data_requests
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/list-customer-data-requests
     */
    public Page<CustomerDataRequest> list(ListCustomerDataRequestsParams params, RequestOptions options) {
        return api.list("/v1/customer_data_requests", params, CustomerDataRequest.class, options);
    }

    public Page<CustomerDataRequest> list(ListCustomerDataRequestsParams params) {
        return list(params, null);
    }

    public Page<CustomerDataRequest> list() {
        return list(null, null);
    }

    /** Listar solicitudes de datos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<CustomerDataRequest> listAutoPaging(ListCustomerDataRequestsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<CustomerDataRequest> listAutoPaging(ListCustomerDataRequestsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<CustomerDataRequest> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una solicitud de datos
     * <p>
     * Una solicitud de datos: su liga y, si el cliente ya contestó, sus datos fiscales y el cliente que se guardó.
     * <p>
     * GET /v1/customer_data_requests/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/get-customer-data-request
     */
    public CustomerDataRequest get(String id, RequestOptions options) {
        return api.request("GET", "/v1/customer_data_requests/" + ApiClient.encode(id), null, null, false, CustomerDataRequest.class, options);
    }

    public CustomerDataRequest get(String id) {
        return get(id, null);
    }

    /**
     * Cancelar una solicitud de datos
     * <p>
     * La liga deja de funcionar. Una que el cliente ya contestó no se cancela.
     * <p>
     * DELETE /v1/customer_data_requests/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/cancel-customer-data-request
     */
    public CustomerDataRequest cancel(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/customer_data_requests/" + ApiClient.encode(id), null, null, false, CustomerDataRequest.class, options);
    }

    public CustomerDataRequest cancel(String id) {
        return cancel(id, null);
    }
}
