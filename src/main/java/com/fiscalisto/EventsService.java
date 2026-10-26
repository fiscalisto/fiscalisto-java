// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Event;
import com.fiscalisto.model.ListEventsParams;

/**
 * Eventos: client.events().
 */
public final class EventsService {
    private final ApiClient api;

    EventsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar eventos
     * <p>
     * Los de los últimos 30 días, los más recientes primero.
     * <p>
     * GET /v1/events
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/eventos/list-events
     */
    public Page<Event> list(ListEventsParams params, RequestOptions options) {
        return api.list("/v1/events", params, Event.class, options);
    }

    public Page<Event> list(ListEventsParams params) {
        return list(params, null);
    }

    public Page<Event> list() {
        return list(null, null);
    }

    /** Listar eventos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Event> listAutoPaging(ListEventsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Event> listAutoPaging(ListEventsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Event> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un evento
     * <p>
     * Un evento de los últimos 30 días, con el objeto como estaba cuando pasó.
     * <p>
     * GET /v1/events/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/eventos/get-event
     */
    public Event get(String id, RequestOptions options) {
        return api.request("GET", "/v1/events/" + ApiClient.encode(id), null, null, false, Event.class, options);
    }

    public Event get(String id) {
        return get(id, null);
    }
}
