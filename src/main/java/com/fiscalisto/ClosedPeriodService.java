// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ClosedPeriod;
import com.fiscalisto.model.GetClosedPeriodParams;
import com.fiscalisto.model.SetClosedPeriodParams;

/**
 * Contabilidad: client.closedPeriod().
 */
public final class ClosedPeriodService {
    private final ApiClient api;

    ClosedPeriodService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver hasta qué mes está cerrada la contabilidad
     * <p>
     * El último mes cerrado del emisor (closed_through), como Cierre del mes › Cerrar la contabilidad en la app.
     * <p>
     * GET /v1/accounting/closed_period
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-closed-period
     */
    public ClosedPeriod get(GetClosedPeriodParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/closed_period", null, params, false, ClosedPeriod.class, options);
    }

    public ClosedPeriod get(GetClosedPeriodParams params) {
        return get(params, null);
    }

    public ClosedPeriod get() {
        return get(null, null);
    }

    /**
     * Cerrar o reabrir meses de la contabilidad
     * <p>
     * Cierra la contabilidad hasta closed_through (y los meses anteriores), o la reabre con un mes anterior o null. En un mes cerrado, crear, corregir o borrar una póliza a mano, registrar o quitar la póliza de un movimiento de banco y dar de baja un activo contestan period_closed. Las facturas siguen llegando del SAT.
     * <p>
     * POST /v1/accounting/closed_period
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/set-closed-period
     */
    public ClosedPeriod set(SetClosedPeriodParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/closed_period", params, null, true, ClosedPeriod.class, options);
    }

    public ClosedPeriod set(SetClosedPeriodParams params) {
        return set(params, null);
    }
}
