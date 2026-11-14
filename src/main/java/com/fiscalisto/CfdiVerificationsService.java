// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CfdiVerification;
import com.fiscalisto.model.VerifyCfdiParams;

/**
 * Verificar comprobantes: client.cfdiVerifications().
 */
public final class CfdiVerificationsService {
    private final ApiClient api;

    CfdiVerificationsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Verificar un CFDI en el SAT
     * <p>
     * Si cualquier CFDI (suyo, de un proveedor o de un cliente) existe en el SAT y está vigente o cancelado, si se puede cancelar, y si su emisor y su receptor están en las listas del SAT. Mande su XML, el texto de su QR, o el UUID con los dos RFC y el total. Consulta el servicio público del SAT, sin e.firma. No usa timbres. En pruebas también consulta el SAT real: los comprobantes de prueba no están ahí y responden not_found.
     * <p>
     * POST /v1/cfdi_verifications
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/verificar-comprobantes/verify-cfdi
     */
    public CfdiVerification create(VerifyCfdiParams params, RequestOptions options) {
        return api.request("POST", "/v1/cfdi_verifications", params, null, true, CfdiVerification.class, options);
    }

    public CfdiVerification create(VerifyCfdiParams params) {
        return create(params, null);
    }

    public CfdiVerification create() {
        return create(null, null);
    }
}
