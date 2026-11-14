// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateRoleParams;
import com.fiscalisto.model.DeleteRoleParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListRolesParams;
import com.fiscalisto.model.Role;
import com.fiscalisto.model.RoleList;
import com.fiscalisto.model.UpdateRoleParams;

/**
 * Equipo: client.roles().
 */
public final class RolesService {
    private final ApiClient api;

    RolesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar roles
     * <p>
     * Propietario, los roles de Fiscalisto (como se editaron en la empresa) y los suyos, con sus permisos y cuántas personas los tienen.
     * <p>
     * GET /v1/roles
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/list-roles
     */
    public RoleList list(ListRolesParams params, RequestOptions options) {
        return api.request("GET", "/v1/roles", null, params, false, RoleList.class, options);
    }

    public RoleList list(ListRolesParams params) {
        return list(params, null);
    }

    public RoleList list() {
        return list(null, null);
    }

    /**
     * Crear un rol
     * <p>
     * Un rol de la empresa con su nombre y sus permisos (GET /v1/permissions), como Ajustes › Roles. No puede tener permisos que no tenga quien creó la llave; uno con permisos delicados se hace en la app.
     * <p>
     * POST /v1/roles
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/create-role
     */
    public Role create(CreateRoleParams params, RequestOptions options) {
        return api.request("POST", "/v1/roles", params, null, true, Role.class, options);
    }

    public Role create(CreateRoleParams params) {
        return create(params, null);
    }

    /**
     * Cambiar un rol
     * <p>
     * Su nombre, su descripción o sus permisos; lo que no mande se queda. Cambia el acceso de todos los que lo tienen. Propietario no se cambia.
     * <p>
     * POST /v1/roles/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/update-role
     */
    public Role update(String id, UpdateRoleParams params, RequestOptions options) {
        return api.request("POST", "/v1/roles/" + ApiClient.encode(id), params, null, true, Role.class, options);
    }

    public Role update(String id, UpdateRoleParams params) {
        return update(id, params, null);
    }

    public Role update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un rol
     * <p>
     * Solo uno de la empresa (type custom), cuando nadie lo tiene ni lo da una invitación pendiente.
     * <p>
     * DELETE /v1/roles/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/delete-role
     */
    public Deleted delete(String id, DeleteRoleParams params, RequestOptions options) {
        return api.request("DELETE", "/v1/roles/" + ApiClient.encode(id), null, params, false, Deleted.class, options);
    }

    public Deleted delete(String id, DeleteRoleParams params) {
        return delete(id, params, null);
    }

    public Deleted delete(String id) {
        return delete(id, null, null);
    }
}
