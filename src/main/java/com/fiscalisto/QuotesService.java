// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateQuoteParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.Invoice;
import com.fiscalisto.model.ListQuotesParams;
import com.fiscalisto.model.Quote;
import com.fiscalisto.model.SendQuoteParams;
import com.fiscalisto.model.UpdateQuoteParams;

/**
 * Cotizaciones: client.quotes().
 */
public final class QuotesService {
    private final ApiClient api;

    QuotesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear una cotización
     * <p>
     * Una cotización en borrador, con los conceptos y las condiciones de pago de una factura (se revisan con las mismas reglas, así que siempre se puede facturar). customer es un cliente de su catálogo, uno con sus datos fiscales (se agrega a sus clientes) o solo name y email si aún no los tiene. Se manda con POST /v1/quotes/{id}/send.
     * <p>
     * POST /v1/quotes
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cotizaciones/create-quote
     */
    public Quote create(CreateQuoteParams params, RequestOptions options) {
        return api.request("POST", "/v1/quotes", params, null, true, Quote.class, options);
    }

    public Quote create(CreateQuoteParams params) {
        return create(params, null);
    }

    /**
     * Listar cotizaciones
     * <p>
     * Las más recientes primero, cada una en su última versión.
     * <p>
     * GET /v1/quotes
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cotizaciones/list-quotes
     */
    public Page<Quote> list(ListQuotesParams params, RequestOptions options) {
        return api.list("/v1/quotes", params, Quote.class, options);
    }

    public Page<Quote> list(ListQuotesParams params) {
        return list(params, null);
    }

    public Page<Quote> list() {
        return list(null, null);
    }

    /** Listar cotizaciones: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Quote> listAutoPaging(ListQuotesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Quote> listAutoPaging(ListQuotesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Quote> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una cotización
     * <p>
     * Su última versión.
     * <p>
     * GET /v1/quotes/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cotizaciones/get-quote
     */
    public Quote get(String id, RequestOptions options) {
        return api.request("GET", "/v1/quotes/" + ApiClient.encode(id), null, null, false, Quote.class, options);
    }

    public Quote get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar una cotización
     * <p>
     * Solo lo que mande cambia. Un borrador cambia ahí mismo; una que ya se envió se vuelve una versión nueva en borrador (mismo número, version + 1) que el cliente ve al mandarla; mientras, su liga muestra la anterior. Una aceptada, rechazada o facturada ya no cambia.
     * <p>
     * POST /v1/quotes/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cotizaciones/update-quote
     */
    public Quote update(String id, UpdateQuoteParams params, RequestOptions options) {
        return api.request("POST", "/v1/quotes/" + ApiClient.encode(id), params, null, true, Quote.class, options);
    }

    public Quote update(String id, UpdateQuoteParams params) {
        return update(id, params, null);
    }

    public Quote update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar una cotización
     * <p>
     * Solo una que nunca se envió; si no, 400 quote_not_draft.
     * <p>
     * DELETE /v1/quotes/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cotizaciones/delete-quote
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/quotes/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Mandar una cotización
     * <p>
     * La manda por correo con su PDF y la liga donde el cliente la ve, la acepta, pide cambios o la rechaza. Con send_email: false solo se marca enviada y contesta url, para que usted la mande por WhatsApp o su propio correo.
     * <p>
     * POST /v1/quotes/{id}/send
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cotizaciones/send-quote
     */
    public Quote send(String id, SendQuoteParams params, RequestOptions options) {
        return api.request("POST", "/v1/quotes/" + ApiClient.encode(id) + "/send", params, null, true, Quote.class, options);
    }

    public Quote send(String id, SendQuoteParams params) {
        return send(id, params, null);
    }

    public Quote send(String id) {
        return send(id, null, null);
    }

    /**
     * Marcar aceptada
     * <p>
     * El cliente le dijo que sí por teléfono, en persona… Llega quote.accepted. No timbra: para eso, POST /v1/quotes/{id}/invoice.
     * <p>
     * POST /v1/quotes/{id}/accept
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cotizaciones/accept-quote
     */
    public Quote accept(String id, RequestOptions options) {
        return api.request("POST", "/v1/quotes/" + ApiClient.encode(id) + "/accept", null, null, true, Quote.class, options);
    }

    public Quote accept(String id) {
        return accept(id, null);
    }

    /**
     * Facturar una cotización
     * <p>
     * Timbra la factura con los conceptos de la cotización y los datos fiscales del cliente, y la deja facturada (invoice). Si no estaba aceptada, la marca aceptada. Una en otra moneda va al tipo de cambio de hoy. Sin los datos fiscales del cliente, 400 quote_customer_missing; rechazada o vencida, 400 quote_not_invoiceable. Si ya se facturó, contesta esa factura.
     * <p>
     * POST /v1/quotes/{id}/invoice
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cotizaciones/invoice-quote
     */
    public Invoice invoice(String id, RequestOptions options) {
        return api.request("POST", "/v1/quotes/" + ApiClient.encode(id) + "/invoice", null, null, true, Invoice.class, options);
    }

    public Invoice invoice(String id) {
        return invoice(id, null);
    }

    /**
     * Descargar el PDF
     * <p>
     * El PDF de su última versión, con el diseño de PDF del emisor.
     * <p>
     * GET /v1/quotes/{id}/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cotizaciones/get-quote-pdf
     */
    public byte[] pdf(String id, RequestOptions options) {
        return api.bytes("GET", "/v1/quotes/" + ApiClient.encode(id) + "/pdf", null, null, false, options);
    }

    public byte[] pdf(String id) {
        return pdf(id, null);
    }
}
