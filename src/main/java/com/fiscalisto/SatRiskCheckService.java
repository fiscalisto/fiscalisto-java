// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetSatRiskCheckParams;
import com.fiscalisto.model.SatRiskCheck;

/**
 * Cumplimiento SAT: client.satRiskCheck().
 */
public final class SatRiskCheckService {
    private final ApiClient api;

    SatRiskCheckService(ApiClient api) {
        this.api = api;
    }

    /**
     * Revisar como el SAT
     * <p>
     * Como «Revise como el SAT»: lo que los sistemas del SAT cruzan para mandar cartas invitación y escoger a quién revisar (plazos de revisiones abiertas, Buzón Tributario, CFDI contra declaraciones, declaraciones omitidas, opinión de cumplimiento, listas del SAT, proveedores en 69-B, materialidad, depósitos sin aclarar, discrepancia fiscal y vigencia de la e.firma), con lo que Fiscalisto ya leyó. No consulta al SAT y no usa timbres.
     * <p>
     * GET /v1/sat_risk_check
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/get-sat-risk-check
     */
    public SatRiskCheck get(GetSatRiskCheckParams params, RequestOptions options) {
        return api.request("GET", "/v1/sat_risk_check", null, params, false, SatRiskCheck.class, options);
    }

    public SatRiskCheck get(GetSatRiskCheckParams params) {
        return get(params, null);
    }

    public SatRiskCheck get() {
        return get(null, null);
    }
}
