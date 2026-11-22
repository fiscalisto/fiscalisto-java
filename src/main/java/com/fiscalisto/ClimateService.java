// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Climate;
import com.fiscalisto.model.GetClimateParams;
import com.fiscalisto.model.UpdateClimatePolicyParams;

/**
 * Nómina: client.climate().
 */
public final class ClimateService {
    private final ApiClient api;

    ClimateService(ApiClient api) {
        this.api = api;
    }

    /**
     * Clima laboral
     * <p>
     * Como «Nómina › Clima laboral» de la app: la política de prevención de riesgos psicosociales y cuántos la leyeron (NOM-035-STPS-2018, numerales 5.1 y 5.7), cada centro de trabajo con la guía que le toca por cuántos trabajan ahí (numeral 7.1) y cuándo le toca la siguiente identificación (cada dos años como mínimo, numeral 7.9), cuántas acciones del Programa de intervención faltan y cuántas quejas del buzón esperan atención.
     * <p>
     * GET /v1/climate
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-climate
     */
    public Climate get(GetClimateParams params, RequestOptions options) {
        return api.request("GET", "/v1/climate", null, params, false, Climate.class, options);
    }

    public Climate get(GetClimateParams params) {
        return get(params, null);
    }

    public Climate get() {
        return get(null, null);
    }

    /**
     * Guardar la política de prevención
     * <p>
     * El texto de la política (numeral 5.1) y con quién más presentar una queja. Con publish true la publica en el portal de cada trabajador como una versión nueva (numeral 5.7) y se les pide leerla otra vez. Lo que no manda no cambia. Contesta climate.
     * <p>
     * POST /v1/climate/policy
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-climate-policy
     */
    public Climate updatePolicy(UpdateClimatePolicyParams params, RequestOptions options) {
        return api.request("POST", "/v1/climate/policy", params, null, true, Climate.class, options);
    }

    public Climate updatePolicy(UpdateClimatePolicyParams params) {
        return updatePolicy(params, null);
    }

    public Climate updatePolicy() {
        return updatePolicy(null, null);
    }
}
