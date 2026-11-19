// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateFxRevaluationParams;
import com.fiscalisto.model.DeleteFxRevaluationParams;
import com.fiscalisto.model.FxRevaluation;
import com.fiscalisto.model.GetFxRevaluationParams;

/**
 * Contabilidad: client.fxRevaluations().
 */
public final class FxRevaluationsService {
    private final ApiClient api;

    FxRevaluationsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver la revaluación cambiaria de un mes
     * <p>
     * Las facturas PPD en otra moneda que seguían pendientes al cierre del mes, lo pendiente por moneda con el tipo de cambio de cierre que sugerimos (el FIX del DOF) y la póliza de revaluación, si ya se registró. Como Cierre del mes › Revaluación cambiaria en la app.
     * <p>
     * GET /v1/accounting/fx_revaluations/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-fx-revaluation
     */
    public FxRevaluation get(String month, GetFxRevaluationParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/fx_revaluations/" + ApiClient.encode(month), null, params, false, FxRevaluation.class, options);
    }

    public FxRevaluation get(String month, GetFxRevaluationParams params) {
        return get(month, params, null);
    }

    public FxRevaluation get(String month) {
        return get(month, null, null);
    }

    /**
     * Registrar la revaluación cambiaria de un mes
     * <p>
     * Registra (o reemplaza) la póliza de ajuste del último día del mes que lleva lo pendiente en otra moneda al tipo de cambio de cierre (rates): Clientes contra Utilidad o Pérdida cambiaria, y Proveedores contra Pérdida o Utilidad cambiaria. Se revierte sola el día 1 del mes siguiente, para que cada pago siga calculando su diferencia cambiaria desde el tipo de cambio de la factura. Sin facturas pendientes, o sin diferencia a esos tipos de cambio, contesta parameter_invalid en month; en un mes cerrado, period_closed.
     * <p>
     * POST /v1/accounting/fx_revaluations/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/create-fx-revaluation
     */
    public FxRevaluation create(String month, CreateFxRevaluationParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/fx_revaluations/" + ApiClient.encode(month), params, null, true, FxRevaluation.class, options);
    }

    public FxRevaluation create(String month, CreateFxRevaluationParams params) {
        return create(month, params, null);
    }

    /**
     * Quitar la revaluación cambiaria de un mes
     * <p>
     * Quita la póliza de revaluación del mes y su reversión. En un mes cerrado contesta period_closed.
     * <p>
     * DELETE /v1/accounting/fx_revaluations/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/delete-fx-revaluation
     */
    public FxRevaluation delete(String month, DeleteFxRevaluationParams params, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/fx_revaluations/" + ApiClient.encode(month), null, params, false, FxRevaluation.class, options);
    }

    public FxRevaluation delete(String month, DeleteFxRevaluationParams params) {
        return delete(month, params, null);
    }

    public FxRevaluation delete(String month) {
        return delete(month, null, null);
    }
}
