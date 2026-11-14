// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.PermissionList;

/**
 * Equipo: client.permissions().
 */
public final class PermissionsService {
    private final ApiClient api;

    PermissionsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar permisos
     * <p>
     * Cada permiso que un rol o una persona puede tener, con su nombre en la app, su grupo y si es delicado.
     * <p>
     * GET /v1/permissions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/list-permissions
     */
    public PermissionList list(RequestOptions options) {
        return api.request("GET", "/v1/permissions", null, null, false, PermissionList.class, options);
    }

    public PermissionList list() {
        return list(null);
    }
}
