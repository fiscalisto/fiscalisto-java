// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateTicketParams;
import com.fiscalisto.model.ListTicketsParams;
import com.fiscalisto.model.Ticket;

/**
 * Autofactura: client.tickets().
 */
public final class TicketsService {
    private final ApiClient api;

    TicketsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Registrar un ticket
     * <p>
     * Una venta que su comprador factura él mismo: con el código (code) y el total en el portal del emisor (url, que puede incrustar en su página con fiscalisto.js), da sus datos fiscales y la factura se timbra al momento con los timbres de su cuenta. Lo que nadie factura entra solo en la factura global del periodo. Registrar otra vez el mismo folio con el mismo total contesta el ticket que ya existe (los reintentos son seguros); con otro total, 409. Una venta de varios conceptos (el folio de un hotel) va en lines, cada uno con su clave SAT, descripción, impuestos y monto.
     * <p>
     * POST /v1/tickets
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/autofactura/create-ticket
     */
    public Ticket create(CreateTicketParams params, RequestOptions options) {
        return api.request("POST", "/v1/tickets", params, null, true, Ticket.class, options);
    }

    public Ticket create(CreateTicketParams params) {
        return create(params, null);
    }

    /**
     * Listar tickets
     * <p>
     * Del más reciente al más antiguo por fecha de venta.
     * <p>
     * GET /v1/tickets
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/autofactura/list-tickets
     */
    public Page<Ticket> list(ListTicketsParams params, RequestOptions options) {
        return api.list("/v1/tickets", params, Ticket.class, options);
    }

    public Page<Ticket> list(ListTicketsParams params) {
        return list(params, null);
    }

    public Page<Ticket> list() {
        return list(null, null);
    }

    /** Listar tickets: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Ticket> listAutoPaging(ListTicketsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Ticket> listAutoPaging(ListTicketsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Ticket> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un ticket
     * <p>
     * Un ticket de autofactura: si ya se facturó (invoice) o entró en la factura global (global_invoice).
     * <p>
     * GET /v1/tickets/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/autofactura/get-ticket
     */
    public Ticket get(String id, RequestOptions options) {
        return api.request("GET", "/v1/tickets/" + ApiClient.encode(id), null, null, false, Ticket.class, options);
    }

    public Ticket get(String id) {
        return get(id, null);
    }

    /**
     * Cancelar un ticket
     * <p>
     * Una venta que no se hizo (devolución, error): ya no se puede facturar ni entra en la factura global. Solo mientras esté pendiente.
     * <p>
     * DELETE /v1/tickets/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/autofactura/cancel-ticket
     */
    public Ticket cancel(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/tickets/" + ApiClient.encode(id), null, null, false, Ticket.class, options);
    }

    public Ticket cancel(String id) {
        return cancel(id, null);
    }
}
