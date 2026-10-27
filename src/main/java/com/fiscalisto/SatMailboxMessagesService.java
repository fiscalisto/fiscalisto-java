// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListSatMailboxMessagesParams;
import com.fiscalisto.model.SatMailboxMessage;

/**
 * Cumplimiento SAT: client.satMailboxMessages().
 */
public final class SatMailboxMessagesService {
    private final ApiClient api;

    SatMailboxMessagesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar avisos del buzón tributario
     * <p>
     * Los avisos que trajo del buzón del emisor, los más recientes primero. No usa timbres.
     * <p>
     * GET /v1/sat_mailbox_messages
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/list-sat-mailbox-messages
     */
    public Page<SatMailboxMessage> list(ListSatMailboxMessagesParams params, RequestOptions options) {
        return api.list("/v1/sat_mailbox_messages", params, SatMailboxMessage.class, options);
    }

    public Page<SatMailboxMessage> list(ListSatMailboxMessagesParams params) {
        return list(params, null);
    }

    public Page<SatMailboxMessage> list() {
        return list(null, null);
    }

    /** Listar avisos del buzón tributario: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SatMailboxMessage> listAutoPaging(ListSatMailboxMessagesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SatMailboxMessage> listAutoPaging(ListSatMailboxMessagesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SatMailboxMessage> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un aviso del buzón tributario
     * <p>
     * Un aviso del buzón, con su urgencia y si pide hacer algo.
     * <p>
     * GET /v1/sat_mailbox_messages/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/get-sat-mailbox-message
     */
    public SatMailboxMessage get(String id, RequestOptions options) {
        return api.request("GET", "/v1/sat_mailbox_messages/" + ApiClient.encode(id), null, null, false, SatMailboxMessage.class, options);
    }

    public SatMailboxMessage get(String id) {
        return get(id, null);
    }
}
