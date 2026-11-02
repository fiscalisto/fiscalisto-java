// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateImssMovementParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ImssMovement;
import com.fiscalisto.model.ImssMovementList;
import com.fiscalisto.model.ListImssMovementsParams;
import com.fiscalisto.model.ReportImssMovementsParams;
import com.fiscalisto.model.UpdateImssMovementParams;

/**
 * Nómina: client.imssMovements().
 */
public final class ImssMovementsService {
    private final ApiClient api;

    ImssMovementsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Agregar un movimiento del IMSS
     * <p>
     * Un movimiento afiliatorio a mano. Casi nunca hace falta: al crear un empleado se registra su alta, al cambiar su integrated_daily_salary la modificación (con fecha de hoy), al ponerle end_date su baja y al volver a contratarlo su reingreso. Queda pendiente de presentar.
     * <p>
     * POST /v1/imss_movements
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-imss-movement
     */
    public ImssMovement create(CreateImssMovementParams params, RequestOptions options) {
        return api.request("POST", "/v1/imss_movements", params, null, true, ImssMovement.class, options);
    }

    public ImssMovement create(CreateImssMovementParams params) {
        return create(params, null);
    }

    /**
     * Listar movimientos del IMSS
     * <p>
     * Los movimientos del emisor por presentar (status=pending, por omisión: todos, del más antiguo al más reciente, como van en los archivos) o ya presentados (status=reported: los 500 más recientes).
     * <p>
     * GET /v1/imss_movements
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-imss-movements
     */
    public Page<ImssMovement> list(ListImssMovementsParams params, RequestOptions options) {
        return api.list("/v1/imss_movements", params, ImssMovement.class, options);
    }

    public Page<ImssMovement> list(ListImssMovementsParams params) {
        return list(params, null);
    }

    public Page<ImssMovement> list() {
        return list(null, null);
    }

    /** Listar movimientos del IMSS: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ImssMovement> listAutoPaging(ListImssMovementsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ImssMovement> listAutoPaging(ListImssMovementsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ImssMovement> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Marcar movimientos como presentados
     * <p>
     * Cuando el IMSS ya los recibió (el acuse de IDSE o la importación en SUA): pasan a reported y ya no cambian ni se borran. Con reported false vuelven a pendientes. Devuelve los movimientos como quedaron.
     * <p>
     * POST /v1/imss_movements/report
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/report-imss-movements
     */
    public ImssMovementList report(ReportImssMovementsParams params, RequestOptions options) {
        return api.request("POST", "/v1/imss_movements/report", params, null, true, ImssMovementList.class, options);
    }

    public ImssMovementList report(ReportImssMovementsParams params) {
        return report(params, null);
    }

    /**
     * Ver un movimiento del IMSS
     * <p>
     * El movimiento con lo que el IMSS rechazaría en problems.
     * <p>
     * GET /v1/imss_movements/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-imss-movement
     */
    public ImssMovement get(String id, RequestOptions options) {
        return api.request("GET", "/v1/imss_movements/" + ApiClient.encode(id), null, null, false, ImssMovement.class, options);
    }

    public ImssMovement get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar un movimiento del IMSS
     * <p>
     * Solo uno pendiente: uno ya presentado se queda como lo tiene el IMSS.
     * <p>
     * POST /v1/imss_movements/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-imss-movement
     */
    public ImssMovement update(String id, UpdateImssMovementParams params, RequestOptions options) {
        return api.request("POST", "/v1/imss_movements/" + ApiClient.encode(id), params, null, true, ImssMovement.class, options);
    }

    public ImssMovement update(String id, UpdateImssMovementParams params) {
        return update(id, params, null);
    }

    public ImssMovement update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un movimiento del IMSS
     * <p>
     * Solo uno pendiente (por ejemplo, un alta registrada por error).
     * <p>
     * DELETE /v1/imss_movements/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-imss-movement
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/imss_movements/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
