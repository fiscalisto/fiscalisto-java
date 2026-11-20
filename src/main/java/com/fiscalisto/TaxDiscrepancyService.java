// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetTaxDiscrepancyParams;
import com.fiscalisto.model.TaxDiscrepancy;

/**
 * Cumplimiento SAT: client.taxDiscrepancy().
 */
public final class TaxDiscrepancyService {
    private final ApiClient api;

    TaxDiscrepancyService(ApiClient api) {
        this.api = api;
    }

    /**
     * Calcular la discrepancia fiscal
     * <p>
     * Como «Discrepancia fiscal» (personas físicas, art. 91 LISR): gastos con CFDI a su nombre y depósitos en sus cuentas del año, menos traspasos entre sus cuentas, préstamos y devoluciones, contra los ingresos declarados; lo que queda es lo que el SAT presumiría ingreso. Un emisor persona moral contesta parameter_invalid. No usa timbres.
     * <p>
     * GET /v1/tax_discrepancy
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/get-tax-discrepancy
     */
    public TaxDiscrepancy get(GetTaxDiscrepancyParams params, RequestOptions options) {
        return api.request("GET", "/v1/tax_discrepancy", null, params, false, TaxDiscrepancy.class, options);
    }

    public TaxDiscrepancy get(GetTaxDiscrepancyParams params) {
        return get(params, null);
    }

    public TaxDiscrepancy get() {
        return get(null, null);
    }
}
