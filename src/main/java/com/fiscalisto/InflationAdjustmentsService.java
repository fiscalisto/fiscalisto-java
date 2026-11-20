// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetInflationAdjustmentParams;
import com.fiscalisto.model.InflationAdjustment;

/**
 * Contabilidad: client.inflationAdjustments().
 */
public final class InflationAdjustmentsService {
    private final ApiClient api;

    InflationAdjustmentsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Calcular el ajuste anual por inflación
     * <p>
     * El ajuste anual por inflación de una persona moral (artículo 44 de la Ley del ISR): la suma de los saldos al último día de cada mes de sus créditos y de sus deudas entre los meses del ejercicio, y la diferencia por el factor de ajuste anual. Deudas mayores dan un ajuste acumulable (taxable); créditos mayores, uno deducible. Cada cuenta cuenta por su código agrupador (con la razón en reason) o como la marcó con POST /v1/accounting/inflation_accounts. En el año en curso es una estimación hasta el mes actual. Como Estados financieros › Ajuste por inflación en la app.
     * <p>
     * GET /v1/accounting/inflation_adjustments/{year}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-inflation-adjustment
     */
    public InflationAdjustment get(String year, GetInflationAdjustmentParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/inflation_adjustments/" + ApiClient.encode(year), null, params, false, InflationAdjustment.class, options);
    }

    public InflationAdjustment get(String year, GetInflationAdjustmentParams params) {
        return get(year, params, null);
    }

    public InflationAdjustment get(String year) {
        return get(year, null, null);
    }
}
