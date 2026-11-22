// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ClimateComplaint;
import com.fiscalisto.model.ListClimateComplaintsParams;
import com.fiscalisto.model.UpdateClimateComplaintParams;

/**
 * Nómina: client.climateComplaints().
 */
public final class ClimateComplaintsService {
    private final ApiClient api;

    ClimateComplaintsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar quejas del buzón
     * <p>
     * Las quejas que mandaron los trabajadores desde su portal (numeral 8.1 b)): de violencia laboral, del entorno u otra. Llevan nombre solo si quien la mandó la firmó.
     * <p>
     * GET /v1/climate_complaints
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-climate-complaints
     */
    public Page<ClimateComplaint> list(ListClimateComplaintsParams params, RequestOptions options) {
        return api.list("/v1/climate_complaints", params, ClimateComplaint.class, options);
    }

    public Page<ClimateComplaint> list(ListClimateComplaintsParams params) {
        return list(params, null);
    }

    public Page<ClimateComplaint> list() {
        return list(null, null);
    }

    /** Listar quejas del buzón: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ClimateComplaint> listAutoPaging(ListClimateComplaintsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ClimateComplaint> listAutoPaging(ListClimateComplaintsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ClimateComplaint> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Atender una queja del buzón
     * <p>
     * Su estado y qué se hizo. Al marcarla atendida se anota el día. Lo que no manda no cambia.
     * <p>
     * POST /v1/climate_complaints/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-climate-complaint
     */
    public ClimateComplaint update(String id, UpdateClimateComplaintParams params, RequestOptions options) {
        return api.request("POST", "/v1/climate_complaints/" + ApiClient.encode(id), params, null, true, ClimateComplaint.class, options);
    }

    public ClimateComplaint update(String id, UpdateClimateComplaintParams params) {
        return update(id, params, null);
    }

    public ClimateComplaint update(String id) {
        return update(id, null, null);
    }
}
