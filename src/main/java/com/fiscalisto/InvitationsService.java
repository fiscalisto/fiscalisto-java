// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateInvitationParams;
import com.fiscalisto.model.Invitation;
import com.fiscalisto.model.InvitationList;
import com.fiscalisto.model.ListInvitationsParams;

/**
 * Equipo: client.invitations().
 */
public final class InvitationsService {
    private final ApiClient api;

    InvitationsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar invitaciones
     * <p>
     * Las invitaciones pendientes de la empresa, las más antiguas primero.
     * <p>
     * GET /v1/invitations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/list-invitations
     */
    public InvitationList list(ListInvitationsParams params, RequestOptions options) {
        return api.request("GET", "/v1/invitations", null, params, false, InvitationList.class, options);
    }

    public InvitationList list(ListInvitationsParams params) {
        return list(params, null);
    }

    public InvitationList list() {
        return list(null, null);
    }

    /**
     * Invitar a alguien a la empresa
     * <p>
     * Le manda un correo con un enlace para entrar a la empresa con ese rol, válido 7 días, como Invitar en Ajustes › Miembros. Invitar otra vez al mismo correo reemplaza la invitación. Una invitación con permisos delicados (equipo, credenciales, seguridad, plan) o como propietario se hace en la app.
     * <p>
     * POST /v1/invitations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/create-invitation
     */
    public Invitation create(CreateInvitationParams params, RequestOptions options) {
        return api.request("POST", "/v1/invitations", params, null, true, Invitation.class, options);
    }

    public Invitation create(CreateInvitationParams params) {
        return create(params, null);
    }

    /**
     * Cancelar una invitación
     * <p>
     * Su enlace deja de servir. Contesta la invitación con status canceled.
     * <p>
     * DELETE /v1/invitations/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/equipo/cancel-invitation
     */
    public Invitation cancel(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/invitations/" + ApiClient.encode(id), null, null, false, Invitation.class, options);
    }

    public Invitation cancel(String id) {
        return cancel(id, null);
    }
}
