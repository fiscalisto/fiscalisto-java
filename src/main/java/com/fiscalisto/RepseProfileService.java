// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetRepseProfileParams;
import com.fiscalisto.model.RepseProfile;
import com.fiscalisto.model.UpdateRepseProfileParams;

/**
 * Nómina: client.repseProfile().
 */
public final class RepseProfileService {
    private final ApiClient api;

    RepseProfileService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver los datos del sujeto obligado
     * <p>
     * Los datos del emisor que pide el SISUB del Infonavit y no están en Fiscalisto: folio del REPSE, correo, teléfono, domicilio, representante legal y, de una persona moral, su acta constitutiva y folio mercantil. Como «Datos del sujeto obligado» en «Nómina › REPSE».
     * <p>
     * GET /v1/repse_profile
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-repse-profile
     */
    public RepseProfile get(GetRepseProfileParams params, RequestOptions options) {
        return api.request("GET", "/v1/repse_profile", null, params, false, RepseProfile.class, options);
    }

    public RepseProfile get(GetRepseProfileParams params) {
        return get(params, null);
    }

    public RepseProfile get() {
        return get(null, null);
    }

    /**
     * Guardar los datos del sujeto obligado
     * <p>
     * Cambia lo que mande; lo demás queda y "" lo vacía. El teléfono va con 10 dígitos y deed_date como AAAA-MM-DD; si no, contesta parameter_invalid en ese campo.
     * <p>
     * POST /v1/repse_profile
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-repse-profile
     */
    public RepseProfile update(UpdateRepseProfileParams params, RequestOptions options) {
        return api.request("POST", "/v1/repse_profile", params, null, true, RepseProfile.class, options);
    }

    public RepseProfile update(UpdateRepseProfileParams params) {
        return update(params, null);
    }

    public RepseProfile update() {
        return update(null, null);
    }
}
