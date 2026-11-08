// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CancelSalesOrderDeliveryParams;
import com.fiscalisto.model.CancelSalesOrderParams;
import com.fiscalisto.model.CloseSalesOrderParams;
import com.fiscalisto.model.CreateSalesOrderDeliveryParams;
import com.fiscalisto.model.CreateSalesOrderParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.Invoice;
import com.fiscalisto.model.InvoiceSalesOrderParams;
import com.fiscalisto.model.ListSalesOrdersParams;
import com.fiscalisto.model.SalesOrder;
import com.fiscalisto.model.SendSalesOrderParams;
import com.fiscalisto.model.UpdateSalesOrderParams;

/**
 * Pedidos: client.salesOrders().
 */
public final class SalesOrdersService {
    private final ApiClient api;

    SalesOrdersService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un pedido
     * <p>
     * Lo que su cliente le pidió, con los conceptos y las condiciones de pago de una factura (se revisan con las mismas reglas, así que cada factura que sale de él timbra). customer es un cliente de su catálogo o uno con sus datos fiscales (se agrega a sus clientes). Con quote (quo_…) lo hace de una cotización. Queda en draft, o confirmado con confirm: true (llega sales_order.confirmed y se aparta lo pedido en el almacén).
     * <p>
     * POST /v1/sales_orders
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/create-sales-order
     */
    public SalesOrder create(CreateSalesOrderParams params, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders", params, null, true, SalesOrder.class, options);
    }

    public SalesOrder create(CreateSalesOrderParams params) {
        return create(params, null);
    }

    public SalesOrder create() {
        return create(null, null);
    }

    /**
     * Listar pedidos
     * <p>
     * Los más recientes primero.
     * <p>
     * GET /v1/sales_orders
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/list-sales-orders
     */
    public Page<SalesOrder> list(ListSalesOrdersParams params, RequestOptions options) {
        return api.list("/v1/sales_orders", params, SalesOrder.class, options);
    }

    public Page<SalesOrder> list(ListSalesOrdersParams params) {
        return list(params, null);
    }

    public Page<SalesOrder> list() {
        return list(null, null);
    }

    /** Listar pedidos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SalesOrder> listAutoPaging(ListSalesOrdersParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SalesOrder> listAutoPaging(ListSalesOrdersParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SalesOrder> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un pedido
     * <p>
     * Con sus entregas, sus facturas y lo que se ha pagado de ellas.
     * <p>
     * GET /v1/sales_orders/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/get-sales-order
     */
    public SalesOrder get(String id, RequestOptions options) {
        return api.request("GET", "/v1/sales_orders/" + ApiClient.encode(id), null, null, false, SalesOrder.class, options);
    }

    public SalesOrder get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar un pedido
     * <p>
     * Solo lo que mande cambia. Los conceptos cambian mientras no tengan entregas ni facturas; si no, 400 sales_order_invalid.
     * <p>
     * POST /v1/sales_orders/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/update-sales-order
     */
    public SalesOrder update(String id, UpdateSalesOrderParams params, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id), params, null, true, SalesOrder.class, options);
    }

    public SalesOrder update(String id, UpdateSalesOrderParams params) {
        return update(id, params, null);
    }

    public SalesOrder update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un pedido
     * <p>
     * Solo un borrador. Uno confirmado se cancela con POST /v1/sales_orders/{id}/cancel: 400 sales_order_not_deletable.
     * <p>
     * DELETE /v1/sales_orders/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/delete-sales-order
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/sales_orders/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Confirmar un pedido
     * <p>
     * Es un pedido en firme: se aparta lo pedido en el almacén y ya se puede entregar y facturar. Llega sales_order.confirmed.
     * <p>
     * POST /v1/sales_orders/{id}/confirm
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/confirm-sales-order
     */
    public SalesOrder confirm(String id, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id) + "/confirm", null, null, true, SalesOrder.class, options);
    }

    public SalesOrder confirm(String id) {
        return confirm(id, null);
    }

    /**
     * Registrar una entrega
     * <p>
     * Lo que salió, con su remisión (REM-1, REM-2…): la mercancía sale del almacén con la entrega, no con la factura. Por omisión, todo lo que falta. Si el emisor no vende sin existencias, no sale más de lo que hay (400 sales_order_invalid). Cuando ya salió todo llega sales_order.delivered.
     * <p>
     * POST /v1/sales_orders/{id}/deliveries
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/create-sales-order-delivery
     */
    public SalesOrder deliver(String id, CreateSalesOrderDeliveryParams params, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id) + "/deliveries", params, null, true, SalesOrder.class, options);
    }

    public SalesOrder deliver(String id, CreateSalesOrderDeliveryParams params) {
        return deliver(id, params, null);
    }

    public SalesOrder deliver(String id) {
        return deliver(id, null, null);
    }

    /**
     * Cancelar una entrega
     * <p>
     * La mercancía regresa al almacén y lo entregado vuelve a quedar pendiente.
     * <p>
     * POST /v1/sales_orders/{id}/deliveries/{delivery}/cancel
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/cancel-sales-order-delivery
     */
    public SalesOrder cancelDelivery(String id, String delivery, CancelSalesOrderDeliveryParams params, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id) + "/deliveries/" + ApiClient.encode(delivery) + "/cancel", params, null, true, SalesOrder.class, options);
    }

    public SalesOrder cancelDelivery(String id, String delivery, CancelSalesOrderDeliveryParams params) {
        return cancelDelivery(id, delivery, params, null);
    }

    public SalesOrder cancelDelivery(String id, String delivery) {
        return cancelDelivery(id, delivery, null, null);
    }

    /**
     * Facturar un pedido
     * <p>
     * Timbra una factura con lo entregado y no facturado (o lo que diga items; con invoice_policy ordered, lo pedido), con los datos fiscales del cliente de hoy y la nota «Pedido PED-…» con su orden de compra. Se factura en varias partes: cada llamada, con su Idempotency-Key, timbra la que sigue. Si no queda nada, 400 sales_order_invalid. Cuando sus facturas se pagan llega sales_order.paid.
     * <p>
     * POST /v1/sales_orders/{id}/invoice
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/invoice-sales-order
     */
    public Invoice invoice(String id, InvoiceSalesOrderParams params, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id) + "/invoice", params, null, true, Invoice.class, options);
    }

    public Invoice invoice(String id, InvoiceSalesOrderParams params) {
        return invoice(id, params, null);
    }

    public Invoice invoice(String id) {
        return invoice(id, null, null);
    }

    /**
     * Mandar un pedido
     * <p>
     * Por correo, con su PDF y la liga donde su cliente lo confirma (llega sales_order.customer_confirmed), firma cada entrega y abre sus facturas. Con send_email: false solo contesta url. En borrador, 400 sales_order_draft.
     * <p>
     * POST /v1/sales_orders/{id}/send
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/send-sales-order
     */
    public SalesOrder send(String id, SendSalesOrderParams params, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id) + "/send", params, null, true, SalesOrder.class, options);
    }

    public SalesOrder send(String id, SendSalesOrderParams params) {
        return send(id, params, null);
    }

    public SalesOrder send(String id) {
        return send(id, null, null);
    }

    /**
     * Ya no entregar lo pendiente
     * <p>
     * El pedido se queda con lo ya entregado (lo demás pasa a canceled en cada concepto) y se libera lo apartado.
     * <p>
     * POST /v1/sales_orders/{id}/cancel_remaining
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/cancel-sales-order-remaining
     */
    public SalesOrder cancelRemaining(String id, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id) + "/cancel_remaining", null, null, true, SalesOrder.class, options);
    }

    public SalesOrder cancelRemaining(String id) {
        return cancelRemaining(id, null);
    }

    /**
     * Cerrar un pedido
     * <p>
     * Lo da por terminado aunque quede algo pendiente, y libera lo apartado.
     * <p>
     * POST /v1/sales_orders/{id}/close
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/close-sales-order
     */
    public SalesOrder close(String id, CloseSalesOrderParams params, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id) + "/close", params, null, true, SalesOrder.class, options);
    }

    public SalesOrder close(String id, CloseSalesOrderParams params) {
        return close(id, params, null);
    }

    public SalesOrder close(String id) {
        return close(id, null, null);
    }

    /**
     * Cancelar un pedido
     * <p>
     * Solo sin entregas ni facturas timbradas (cancele primero las entregas, y las facturas con POST /v1/invoices/{id}/cancel). Borra sus facturas en borrador y libera lo apartado. Llega sales_order.canceled.
     * <p>
     * POST /v1/sales_orders/{id}/cancel
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/cancel-sales-order
     */
    public SalesOrder cancel(String id, CancelSalesOrderParams params, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id) + "/cancel", params, null, true, SalesOrder.class, options);
    }

    public SalesOrder cancel(String id, CancelSalesOrderParams params) {
        return cancel(id, params, null);
    }

    public SalesOrder cancel(String id) {
        return cancel(id, null, null);
    }

    /**
     * Reabrir un pedido
     * <p>
     * Uno cerrado o cancelado vuelve a estar abierto.
     * <p>
     * POST /v1/sales_orders/{id}/reopen
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/reopen-sales-order
     */
    public SalesOrder reopen(String id, RequestOptions options) {
        return api.request("POST", "/v1/sales_orders/" + ApiClient.encode(id) + "/reopen", null, null, true, SalesOrder.class, options);
    }

    public SalesOrder reopen(String id) {
        return reopen(id, null);
    }

    /**
     * Descargar el PDF
     * <p>
     * El PDF del pedido, con el diseño de PDF del emisor.
     * <p>
     * GET /v1/sales_orders/{id}/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pedidos/get-sales-order-pdf
     */
    public byte[] pdf(String id, RequestOptions options) {
        return api.bytes("GET", "/v1/sales_orders/" + ApiClient.encode(id) + "/pdf", null, null, false, options);
    }

    public byte[] pdf(String id) {
        return pdf(id, null);
    }
}
