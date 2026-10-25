// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CancelInvoiceParams;
import com.fiscalisto.model.GetInvoiceParams;
import com.fiscalisto.model.GetInvoicePdfParams;
import com.fiscalisto.model.GetInvoiceXmlParams;
import com.fiscalisto.model.Invoice;
import com.fiscalisto.model.InvoiceCreate;
import com.fiscalisto.model.ListInvoicesParams;
import com.fiscalisto.model.SendInvoiceParams;

/**
 * Facturas: client.invoices().
 */
public final class InvoicesService {
    private final ApiClient api;

    InvoicesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Timbrar una factura
     * <p>
     * Revisa la factura con las reglas del SAT, la sella y la timbra en una sola llamada. Responde con la factura timbrada (status valid) o, si el PAC tarda, en processing (escuche invoice.stamped). Lo que puede omitir tiene el valor usual: PUE, MXN, uso G03 (S01 con régimen 616), objeto de impuesto 02, IVA 16%, cantidad 1, unidad E48.
     * <p>
     * POST /v1/invoices
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas/create-invoice
     */
    public Invoice create(InvoiceCreate params, RequestOptions options) {
        return api.request("POST", "/v1/invoices", params, null, true, Invoice.class, options);
    }

    public Invoice create(InvoiceCreate params) {
        return create(params, null);
    }

    /**
     * Listar facturas
     * <p>
     * Las más recientes primero.
     * <p>
     * GET /v1/invoices
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas/list-invoices
     */
    public Page<Invoice> list(ListInvoicesParams params, RequestOptions options) {
        return api.list("/v1/invoices", params, Invoice.class, options);
    }

    public Page<Invoice> list(ListInvoicesParams params) {
        return list(params, null);
    }

    public Page<Invoice> list() {
        return list(null, null);
    }

    /** Listar facturas: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Invoice> listAutoPaging(ListInvoicesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Invoice> listAutoPaging(ListInvoicesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Invoice> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una factura
     * <p>
     * Por su id (inv_…) o por su folio fiscal (UUID).
     * <p>
     * GET /v1/invoices/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas/get-invoice
     */
    public Invoice get(String id, GetInvoiceParams params, RequestOptions options) {
        return api.request("GET", "/v1/invoices/" + ApiClient.encode(id), null, params, false, Invoice.class, options);
    }

    public Invoice get(String id, GetInvoiceParams params) {
        return get(id, params, null);
    }

    public Invoice get(String id) {
        return get(id, null, null);
    }

    /**
     * Descargar el PDF
     * <p>
     * GET /v1/invoices/{id}/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas/get-invoice-pdf
     */
    public byte[] pdf(String id, GetInvoicePdfParams params, RequestOptions options) {
        return api.bytes("GET", "/v1/invoices/" + ApiClient.encode(id) + "/pdf", null, params, false, options);
    }

    public byte[] pdf(String id, GetInvoicePdfParams params) {
        return pdf(id, params, null);
    }

    public byte[] pdf(String id) {
        return pdf(id, null, null);
    }

    /**
     * Descargar el XML
     * <p>
     * El CFDI timbrado, tal como lo tiene el SAT.
     * <p>
     * GET /v1/invoices/{id}/xml
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas/get-invoice-xml
     */
    public String xml(String id, GetInvoiceXmlParams params, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/invoices/" + ApiClient.encode(id) + "/xml", null, params, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String xml(String id, GetInvoiceXmlParams params) {
        return xml(id, params, null);
    }

    public String xml(String id) {
        return xml(id, null, null);
    }

    /**
     * Enviar por correo
     * <p>
     * Manda el PDF y el XML con el diseño de Fiscalisto. Sin `to`, al correo del cliente. Con la misma Idempotency-Key no se manda dos veces.
     * <p>
     * POST /v1/invoices/{id}/send
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas/send-invoice
     */
    public Invoice send(String id, SendInvoiceParams params, RequestOptions options) {
        return api.request("POST", "/v1/invoices/" + ApiClient.encode(id) + "/send", params, null, true, Invoice.class, options);
    }

    public Invoice send(String id, SendInvoiceParams params) {
        return send(id, params, null);
    }

    public Invoice send(String id) {
        return send(id, null, null);
    }

    /**
     * Cancelar una factura
     * <p>
     * Pide la cancelación al SAT. Si el cliente debe aceptarla queda en pending (escuche invoice.canceled o invoice.cancellation_rejected). Usa un timbre la primera vez que el SAT acepta la solicitud; repetirla, o pedirla otra vez después de un rechazo, no. Nunca se niega por falta de timbres.
     * <p>
     * POST /v1/invoices/{id}/cancel
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas/cancel-invoice
     */
    public Invoice cancel(String id, CancelInvoiceParams params, RequestOptions options) {
        return api.request("POST", "/v1/invoices/" + ApiClient.encode(id) + "/cancel", params, null, false, Invoice.class, options);
    }

    public Invoice cancel(String id, CancelInvoiceParams params) {
        return cancel(id, params, null);
    }

    public Invoice cancel(String id) {
        return cancel(id, null, null);
    }

    /**
     * Sustituir una factura
     * <p>
     * Timbra la factura corregida (el mismo cuerpo que POST /v1/invoices, relacionada 04) y cancela la anterior con motivo 01.
     * <p>
     * POST /v1/invoices/{id}/substitute
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas/substitute-invoice
     */
    public Invoice substitute(String id, InvoiceCreate params, RequestOptions options) {
        return api.request("POST", "/v1/invoices/" + ApiClient.encode(id) + "/substitute", params, null, true, Invoice.class, options);
    }

    public Invoice substitute(String id, InvoiceCreate params) {
        return substitute(id, params, null);
    }
}
