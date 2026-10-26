// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateRecurringInvoiceParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.Invoice;
import com.fiscalisto.model.ListRecurringInvoicesParams;
import com.fiscalisto.model.RecurringInvoice;
import com.fiscalisto.model.UpdateRecurringInvoiceParams;

/**
 * Facturas recurrentes: client.recurringInvoices().
 */
public final class RecurringInvoicesService {
    private final ApiClient api;

    RecurringInvoicesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear una factura recurrente
     * <p>
     * Una factura que el emisor timbra solo en cada fecha (cada interval meses en day_of_month, o cada interval semanas o días), a la hora que elija, con los timbres de su cuenta, y la manda al cliente si send_email. Cada una es una factura normal (invoice.stamped, con recurring_invoice) y nunca se timbra dos veces el mismo periodo. invoice es el cuerpo de POST /v1/invoices: se revisa ahora, con las mismas reglas.
     * <p>
     * POST /v1/recurring_invoices
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas-recurrentes/create-recurring-invoice
     */
    public RecurringInvoice create(CreateRecurringInvoiceParams params, RequestOptions options) {
        return api.request("POST", "/v1/recurring_invoices", params, null, true, RecurringInvoice.class, options);
    }

    public RecurringInvoice create(CreateRecurringInvoiceParams params) {
        return create(params, null);
    }

    /**
     * Listar facturas recurrentes
     * <p>
     * Las más recientes primero.
     * <p>
     * GET /v1/recurring_invoices
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas-recurrentes/list-recurring-invoices
     */
    public Page<RecurringInvoice> list(ListRecurringInvoicesParams params, RequestOptions options) {
        return api.list("/v1/recurring_invoices", params, RecurringInvoice.class, options);
    }

    public Page<RecurringInvoice> list(ListRecurringInvoicesParams params) {
        return list(params, null);
    }

    public Page<RecurringInvoice> list() {
        return list(null, null);
    }

    /** Listar facturas recurrentes: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<RecurringInvoice> listAutoPaging(ListRecurringInvoicesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<RecurringInvoice> listAutoPaging(ListRecurringInvoicesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<RecurringInvoice> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una factura recurrente
     * <p>
     * Una factura recurrente: su calendario, la próxima fecha, la última factura que timbró y, si falló, por qué en last_error.
     * <p>
     * GET /v1/recurring_invoices/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas-recurrentes/get-recurring-invoice
     */
    public RecurringInvoice get(String id, RequestOptions options) {
        return api.request("GET", "/v1/recurring_invoices/" + ApiClient.encode(id), null, null, false, RecurringInvoice.class, options);
    }

    public RecurringInvoice get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar o pausar una factura recurrente
     * <p>
     * Solo lo que mande cambia. invoice reemplaza la factura completa desde la siguiente vez. active: false la pausa; active: true la reanuda desde hoy, sin timbrar las fechas que pasaron en pausa. schedule.start_date mueve la siguiente fecha.
     * <p>
     * POST /v1/recurring_invoices/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas-recurrentes/update-recurring-invoice
     */
    public RecurringInvoice update(String id, UpdateRecurringInvoiceParams params, RequestOptions options) {
        return api.request("POST", "/v1/recurring_invoices/" + ApiClient.encode(id), params, null, true, RecurringInvoice.class, options);
    }

    public RecurringInvoice update(String id, UpdateRecurringInvoiceParams params) {
        return update(id, params, null);
    }

    public RecurringInvoice update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar una factura recurrente
     * <p>
     * Ya no timbra más; las facturas que timbró se quedan.
     * <p>
     * DELETE /v1/recurring_invoices/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas-recurrentes/delete-recurring-invoice
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/recurring_invoices/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Saltar la siguiente factura
     * <p>
     * La siguiente fecha pasa a la que sigue, sin timbrar nada.
     * <p>
     * POST /v1/recurring_invoices/{id}/skip
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas-recurrentes/skip-recurring-invoice
     */
    public RecurringInvoice skip(String id, RequestOptions options) {
        return api.request("POST", "/v1/recurring_invoices/" + ApiClient.encode(id) + "/skip", null, null, true, RecurringInvoice.class, options);
    }

    public RecurringInvoice skip(String id) {
        return skip(id, null);
    }

    /**
     * Timbrar ahora la que toca
     * <p>
     * Timbra el periodo que ya toca (next_invoice_on es hoy o antes) sin esperar su hora. Si no toca aún, 409 recurring_not_due. Si la hora llega mientras tanto, no se timbra dos veces: es el mismo periodo.
     * <p>
     * POST /v1/recurring_invoices/{id}/run
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/facturas-recurrentes/run-recurring-invoice
     */
    public Invoice run(String id, RequestOptions options) {
        return api.request("POST", "/v1/recurring_invoices/" + ApiClient.encode(id) + "/run", null, null, true, Invoice.class, options);
    }

    public Invoice run(String id) {
        return run(id, null);
    }
}
