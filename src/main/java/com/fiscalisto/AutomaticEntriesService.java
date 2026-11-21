// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AutomaticJournalEntry;
import com.fiscalisto.model.GetAutomaticEntryParams;
import com.fiscalisto.model.RevertAutomaticEntryParams;
import com.fiscalisto.model.UpdateAutomaticEntryParams;

/**
 * Contabilidad: client.automaticEntries().
 */
public final class AutomaticEntriesService {
    private final ApiClient api;

    AutomaticEntriesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver la póliza de un CFDI
     * <p>
     * La póliza que arma Fiscalisto para una factura, nota de crédito o recibo de nómina del emisor (por el UUID del CFDI), con su edición a mano si la tiene. Un pago no tiene una propia que se edite: se corrige con una póliza capturada.
     * <p>
     * GET /v1/accounting/automatic_entries/{uuid}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-automatic-entry
     */
    public AutomaticJournalEntry get(String uuid, GetAutomaticEntryParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/automatic_entries/" + ApiClient.encode(uuid), null, params, false, AutomaticJournalEntry.class, options);
    }

    public AutomaticJournalEntry get(String uuid, GetAutomaticEntryParams params) {
        return get(uuid, params, null);
    }

    public AutomaticJournalEntry get(String uuid) {
        return get(uuid, null, null);
    }

    /**
     * Editar la póliza de un CFDI
     * <p>
     * Sus renglones (y su concepto) en lugar de los que arma Fiscalisto, con las reglas de una póliza capturada: cuentas del catálogo y cargos que suman lo mismo que los abonos (entry_unbalanced). Se queda aunque el CFDI se vuelva a descargar, en su mes y en los saldos de los siguientes, y va a la bitácora. Un mes cerrado contesta period_closed. Los mismos renglones que la original quitan la edición.
     * <p>
     * POST /v1/accounting/automatic_entries/{uuid}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/update-automatic-entry
     */
    public AutomaticJournalEntry update(String uuid, UpdateAutomaticEntryParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/automatic_entries/" + ApiClient.encode(uuid), params, null, true, AutomaticJournalEntry.class, options);
    }

    public AutomaticJournalEntry update(String uuid, UpdateAutomaticEntryParams params) {
        return update(uuid, params, null);
    }

    /**
     * Volver a la póliza original de un CFDI
     * <p>
     * Quita la edición a mano: los libros vuelven a usar los renglones que arma Fiscalisto. Un mes cerrado contesta period_closed.
     * <p>
     * DELETE /v1/accounting/automatic_entries/{uuid}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/revert-automatic-entry
     */
    public AutomaticJournalEntry revert(String uuid, RevertAutomaticEntryParams params, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/automatic_entries/" + ApiClient.encode(uuid), null, params, false, AutomaticJournalEntry.class, options);
    }

    public AutomaticJournalEntry revert(String uuid, RevertAutomaticEntryParams params) {
        return revert(uuid, params, null);
    }

    public AutomaticJournalEntry revert(String uuid) {
        return revert(uuid, null, null);
    }
}
