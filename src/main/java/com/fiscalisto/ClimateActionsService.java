// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ClimateAction;
import com.fiscalisto.model.ClimateActionDeleted;
import com.fiscalisto.model.CreateClimateActionParams;
import com.fiscalisto.model.ListClimateActionsParams;
import com.fiscalisto.model.UpdateClimateActionParams;

/**
 * Nómina: client.climateActions().
 */
public final class ClimateActionsService {
    private final ApiClient api;

    ClimateActionsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar acciones del Programa de intervención
     * <p>
     * Las acciones del emisor (cla_…), las pendientes primero y por fecha, o solo las de una encuesta con survey.
     * <p>
     * GET /v1/climate_actions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-climate-actions
     */
    public Page<ClimateAction> list(ListClimateActionsParams params, RequestOptions options) {
        return api.list("/v1/climate_actions", params, ClimateAction.class, options);
    }

    public Page<ClimateAction> list(ListClimateActionsParams params) {
        return list(params, null);
    }

    public Page<ClimateAction> list() {
        return list(null, null);
    }

    /** Listar acciones del Programa de intervención: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ClimateAction> listAutoPaging(ListClimateActionsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ClimateAction> listAutoPaging(ListClimateActionsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ClimateAction> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Agregar una acción del Programa de intervención
     * <p>
     * Lo que pide el programa (numeral 8.4): el área que atiende, la acción, su nivel (primer nivel la organización, segundo los grupos, tercero cada persona, numeral 8.5), el responsable y la fecha. Al marcarla done se anota el día, y evaluation dice cómo resultó.
     * <p>
     * POST /v1/climate_actions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-climate-action
     */
    public ClimateAction create(CreateClimateActionParams params, RequestOptions options) {
        return api.request("POST", "/v1/climate_actions", params, null, true, ClimateAction.class, options);
    }

    public ClimateAction create(CreateClimateActionParams params) {
        return create(params, null);
    }

    /**
     * Cambiar una acción del Programa de intervención
     * <p>
     * Reemplaza la acción con lo que manda: lo que no manda queda vacío o con su valor por omisión.
     * <p>
     * POST /v1/climate_actions/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-climate-action
     */
    public ClimateAction update(String id, UpdateClimateActionParams params, RequestOptions options) {
        return api.request("POST", "/v1/climate_actions/" + ApiClient.encode(id), params, null, true, ClimateAction.class, options);
    }

    public ClimateAction update(String id, UpdateClimateActionParams params) {
        return update(id, params, null);
    }

    /**
     * Borrar una acción del Programa de intervención
     * <p>
     * La borra. No se puede deshacer.
     * <p>
     * DELETE /v1/climate_actions/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-climate-action
     */
    public ClimateActionDeleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/climate_actions/" + ApiClient.encode(id), null, null, false, ClimateActionDeleted.class, options);
    }

    public ClimateActionDeleted delete(String id) {
        return delete(id, null);
    }
}
