// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListSettingChangesParams;
import com.fiscalisto.model.SettingChange;

/**
 * Emisores: client.settingChanges().
 */
public final class SettingChangesService {
    private final ApiClient api;

    SettingChangesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar los cambios a los ajustes
     * <p>
     * Como Ajustes › Cambios en la app: cada ajuste de la empresa que alguien cambió (por ahora la cobranza automática y los horarios), de qué a qué, quién, por dónde y cuándo, del más reciente al más antiguo. Valen para toda la empresa: cualquiera de sus emisores lee los mismos.
     * <p>
     * GET /v1/setting_changes
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/list-setting-changes
     */
    public Page<SettingChange> list(ListSettingChangesParams params, RequestOptions options) {
        return api.list("/v1/setting_changes", params, SettingChange.class, options);
    }

    public Page<SettingChange> list(ListSettingChangesParams params) {
        return list(params, null);
    }

    public Page<SettingChange> list() {
        return list(null, null);
    }

    /** Listar los cambios a los ajustes: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SettingChange> listAutoPaging(ListSettingChangesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SettingChange> listAutoPaging(ListSettingChangesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SettingChange> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Deshacer un cambio a un ajuste
     * <p>
     * Regresa el ajuste al valor que tenía antes de ese cambio, como «Deshacer» en la app, y devuelve el cambio nuevo que eso hizo (que también se puede deshacer). Solo el cambio más reciente de cada ajuste y mientras conserve el valor que dejó: si no, 400 setting_change_not_undoable.
     * <p>
     * POST /v1/setting_changes/{id}/undo
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/undo-setting-change
     */
    public SettingChange undo(String id, RequestOptions options) {
        return api.request("POST", "/v1/setting_changes/" + ApiClient.encode(id) + "/undo", null, null, true, SettingChange.class, options);
    }

    public SettingChange undo(String id) {
        return undo(id, null);
    }
}
