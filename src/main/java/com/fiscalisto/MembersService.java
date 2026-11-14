// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListMembersParams;
import com.fiscalisto.model.Member;
import com.fiscalisto.model.MemberList;
import com.fiscalisto.model.UpdateMemberParams;

/**
 * Equipo: client.members().
 */
public final class MembersService {
    private final ApiClient api;

    MembersService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar miembros
     * <p>
     * Quién entra a la empresa en la app, con su rol, sus permisos y los RFC y sucursales a su alcance, como Ajustes › Miembros. Todos, los más antiguos primero. Pide que quien creó la llave tenga el permiso de ver el equipo.
     * <p>
     * GET /v1/members
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/list-members
     */
    public MemberList list(ListMembersParams params, RequestOptions options) {
        return api.request("GET", "/v1/members", null, params, false, MemberList.class, options);
    }

    public MemberList list(ListMembersParams params) {
        return list(params, null);
    }

    public MemberList list() {
        return list(null, null);
    }

    /**
     * Ver un miembro
     * <p>
     * Su rol, sus permisos (los agregados, los quitados y los que tiene al final) y su alcance.
     * <p>
     * GET /v1/members/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/get-member
     */
    public Member get(String id, RequestOptions options) {
        return api.request("GET", "/v1/members/" + ApiClient.encode(id), null, null, false, Member.class, options);
    }

    public Member get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar el acceso de un miembro
     * <p>
     * Su rol, los permisos que se le agregan o quitan y los RFC y sucursales a su alcance; lo que no mande se queda como está. Nadie da más de lo que tiene quien creó la llave. Dar, quitar o tocar un permiso delicado (equipo, credenciales, seguridad, plan) contesta 403 team_change_requires_app: se hace en la app, que confirma la identidad.
     * <p>
     * POST /v1/members/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/update-member
     */
    public Member update(String id, UpdateMemberParams params, RequestOptions options) {
        return api.request("POST", "/v1/members/" + ApiClient.encode(id), params, null, true, Member.class, options);
    }

    public Member update(String id, UpdateMemberParams params) {
        return update(id, params, null);
    }

    public Member update(String id) {
        return update(id, null, null);
    }

    /**
     * Quitar a un miembro
     * <p>
     * La persona deja de entrar a la empresa y sus invitaciones se cancelan. Siempre queda al menos un propietario; quitar a alguien con permisos delicados se hace en la app.
     * <p>
     * DELETE /v1/members/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/delete-member
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/members/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
