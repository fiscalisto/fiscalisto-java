// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateManualEntryParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ImportManualEntriesParams;
import com.fiscalisto.model.ListManualEntriesParams;
import com.fiscalisto.model.ManualEntryImport;
import com.fiscalisto.model.ManualJournalEntry;
import com.fiscalisto.model.UpdateManualEntryParams;

/**
 * Contabilidad: client.manualEntries().
 */
public final class ManualEntriesService {
    private final ApiClient api;

    ManualEntriesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Capturar una póliza
     * <p>
     * Una póliza a mano: un ajuste, una provisión (reverse_next_month la revierte el día 1 del mes siguiente), una reclasificación. Cada renglón lleva una cuenta del catálogo por su número y un cargo o un abono; si no cuadran contesta entry_unbalanced, y una cuenta que no existe, account_missing. Entra a journal_entries, trial_balance, financial_statements y electronic_accounting de su mes. No puede ser antes de los saldos iniciales.
     * <p>
     * POST /v1/accounting/manual_entries
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/create-manual-entry
     */
    public ManualJournalEntry create(CreateManualEntryParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/manual_entries", params, null, true, ManualJournalEntry.class, options);
    }

    public ManualJournalEntry create(CreateManualEntryParams params) {
        return create(params, null);
    }

    /**
     * Listar las pólizas capturadas
     * <p>
     * Las pólizas capturadas a mano del emisor, las más recientes primero.
     * <p>
     * GET /v1/accounting/manual_entries
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-manual-entries
     */
    public Page<ManualJournalEntry> list(ListManualEntriesParams params, RequestOptions options) {
        return api.list("/v1/accounting/manual_entries", params, ManualJournalEntry.class, options);
    }

    public Page<ManualJournalEntry> list(ListManualEntriesParams params) {
        return list(params, null);
    }

    public Page<ManualJournalEntry> list() {
        return list(null, null);
    }

    /** Listar las pólizas capturadas: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ManualJournalEntry> listAutoPaging(ListManualEntriesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ManualJournalEntry> listAutoPaging(ListManualEntriesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ManualJournalEntry> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una póliza capturada
     * <p>
     * Una póliza capturada a mano.
     * <p>
     * GET /v1/accounting/manual_entries/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-manual-entry
     */
    public ManualJournalEntry get(String id, RequestOptions options) {
        return api.request("GET", "/v1/accounting/manual_entries/" + ApiClient.encode(id), null, null, false, ManualJournalEntry.class, options);
    }

    public ManualJournalEntry get(String id) {
        return get(id, null);
    }

    /**
     * Corregir una póliza capturada
     * <p>
     * La reemplaza con lo que manda, con las mismas reglas que al capturarla.
     * <p>
     * POST /v1/accounting/manual_entries/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/update-manual-entry
     */
    public ManualJournalEntry update(String id, UpdateManualEntryParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/manual_entries/" + ApiClient.encode(id), params, null, true, ManualJournalEntry.class, options);
    }

    public ManualJournalEntry update(String id, UpdateManualEntryParams params) {
        return update(id, params, null);
    }

    /**
     * Borrar una póliza capturada
     * <p>
     * Sale de la contabilidad con su reversión, si tenía.
     * <p>
     * DELETE /v1/accounting/manual_entries/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/delete-manual-entry
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/manual_entries/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Importar pólizas de otro sistema
     * <p>
     * Hasta 3,000 pólizas de una vez (las de CONTPAQi, COI o una hoja de cálculo), todas o ninguna: cada una con las reglas de POST /v1/accounting/manual_entries, y el error dice cuál (param entries[i].…). Entran como kind other. Una con el mismo number, fecha, tipo y total que una ya importada se salta (duplicates). DELETE /v1/accounting/manual_entry_imports/{id} quita las de una importación.
     * <p>
     * POST /v1/accounting/manual_entry_imports
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/import-manual-entries
     */
    public ManualEntryImport importEntries(ImportManualEntriesParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/manual_entry_imports", params, null, true, ManualEntryImport.class, options);
    }

    public ManualEntryImport importEntries(ImportManualEntriesParams params) {
        return importEntries(params, null);
    }

    /**
     * Deshacer una importación de pólizas
     * <p>
     * Borra todas las pólizas que trajo esa importación (mji_…). No se puede si alguna es de un mes cerrado (period_closed).
     * <p>
     * DELETE /v1/accounting/manual_entry_imports/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/undo-manual-entries-import
     */
    public Deleted undoImport(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/manual_entry_imports/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted undoImport(String id) {
        return undoImport(id, null);
    }
}
