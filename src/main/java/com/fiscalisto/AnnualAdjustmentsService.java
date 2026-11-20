// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AnnualAdjustment;
import com.fiscalisto.model.GetAnnualAdjustmentParams;
import com.fiscalisto.model.UpdateAnnualAdjustmentParams;

/**
 * Nómina: client.annualAdjustments().
 */
public final class AnnualAdjustmentsService {
    private final ApiClient api;

    AnnualAdjustmentsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ajuste anual del ISR
     * <p>
     * El ISR del ejercicio de cada empleado (tarifa del artículo 152 sobre lo gravado de sus recibos timbrados del año, menos el subsidio para el empleo del año) contra lo que le retuvieron (artículo 97 de la Ley del ISR). balance positivo es a cargo del empleado; negativo, a su favor. excluded dice por qué no se le calcula. No cambia nada: aplíquelo con POST /v1/annual_adjustments.
     * <p>
     * GET /v1/annual_adjustments
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-annual-adjustment
     */
    public AnnualAdjustment get(GetAnnualAdjustmentParams params, RequestOptions options) {
        return api.request("GET", "/v1/annual_adjustments", null, params, false, AnnualAdjustment.class, options);
    }

    public AnnualAdjustment get(GetAnnualAdjustmentParams params) {
        return get(params, null);
    }

    /**
     * Aplicar el ajuste anual
     * <p>
     * action apply: la diferencia de cada empleado va en sus siguientes recibos ordinarios pagados desde el 1 de enero del año siguiente: a cargo como Deducción 101 (hasta su neto; el resto, en el siguiente), a favor como OtroPago 004 con CompensacionSaldosAFavor. Repetirlo no hace nada. undo la quita mientras ningún recibo timbrado la lleve. files_own_return y no_own_return marcan si el empleado presentará su propia declaración anual.
     * <p>
     * POST /v1/annual_adjustments
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-annual-adjustment
     */
    public AnnualAdjustment update(UpdateAnnualAdjustmentParams params, RequestOptions options) {
        return api.request("POST", "/v1/annual_adjustments", params, null, true, AnnualAdjustment.class, options);
    }

    public AnnualAdjustment update(UpdateAnnualAdjustmentParams params) {
        return update(params, null);
    }
}
