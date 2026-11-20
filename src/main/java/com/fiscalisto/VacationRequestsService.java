// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ApproveVacationRequestParams;
import com.fiscalisto.model.ListVacationRequestsParams;
import com.fiscalisto.model.RejectVacationRequestParams;
import com.fiscalisto.model.VacationRequest;
import com.fiscalisto.model.VacationRequestList;

/**
 * Nómina: client.vacationRequests().
 */
public final class VacationRequestsService {
    private final ApiClient api;

    VacationRequestsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar solicitudes de vacaciones
     * <p>
     * Los días que los empleados pidieron desde su enlace, las más recientes primero.
     * <p>
     * GET /v1/vacation_requests
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-vacation-requests
     */
    public VacationRequestList list(ListVacationRequestsParams params, RequestOptions options) {
        return api.request("GET", "/v1/vacation_requests", null, params, false, VacationRequestList.class, options);
    }

    public VacationRequestList list(ListVacationRequestsParams params) {
        return list(params, null);
    }

    public VacationRequestList list() {
        return list(null, null);
    }

    /**
     * Ver una solicitud de vacaciones
     * <p>
     * Una solicitud de vacaciones con su estado.
     * <p>
     * GET /v1/vacation_requests/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-vacation-request
     */
    public VacationRequest get(String id, RequestOptions options) {
        return api.request("GET", "/v1/vacation_requests/" + ApiClient.encode(id), null, null, false, VacationRequest.class, options);
    }

    public VacationRequest get(String id) {
        return get(id, null);
    }

    /**
     * Aprobar una solicitud de vacaciones
     * <p>
     * La aprueba con los días calculados o los que mande en days. Los días aprobados se sugieren en las Incidencias del recibo del periodo; no se agregan solos.
     * <p>
     * POST /v1/vacation_requests/{id}/approve
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/approve-vacation-request
     */
    public VacationRequest approve(String id, ApproveVacationRequestParams params, RequestOptions options) {
        return api.request("POST", "/v1/vacation_requests/" + ApiClient.encode(id) + "/approve", params, null, true, VacationRequest.class, options);
    }

    public VacationRequest approve(String id, ApproveVacationRequestParams params) {
        return approve(id, params, null);
    }

    public VacationRequest approve(String id) {
        return approve(id, null, null);
    }

    /**
     * Rechazar una solicitud de vacaciones
     * <p>
     * La rechaza; note (por qué) es obligatoria y el empleado la ve.
     * <p>
     * POST /v1/vacation_requests/{id}/reject
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/reject-vacation-request
     */
    public VacationRequest reject(String id, RejectVacationRequestParams params, RequestOptions options) {
        return api.request("POST", "/v1/vacation_requests/" + ApiClient.encode(id) + "/reject", params, null, true, VacationRequest.class, options);
    }

    public VacationRequest reject(String id, RejectVacationRequestParams params) {
        return reject(id, params, null);
    }
}
