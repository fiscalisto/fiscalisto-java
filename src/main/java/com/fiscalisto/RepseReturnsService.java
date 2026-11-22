// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetRepseReturnParams;
import com.fiscalisto.model.RepseReturn;

/**
 * Nómina: client.repseReturns().
 */
public final class RepseReturnsService {
    private final ApiClient api;

    RepseReturnsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Informes ICSOE y SISUB de un cuatrimestre
     * <p>
     * Lo que se presenta del cuatrimestre (AAAA-1 enero a abril, AAAA-2 mayo a agosto, AAAA-3 septiembre a diciembre) a más tardar el día 17 del mes siguiente, o el siguiente día hábil: por contrato, sus trabajadores con NSS, CURP y último salario base de cotización (ICSOE, LSS art. 15-A), y por trabajador y bimestre las percepciones, el salario topado a 25 UMA, la aportación del 5% y la amortización de su crédito (SISUB, Ley del Infonavit art. 29 Bis), calculados de los recibos timbrados. files trae los archivos para subir: los tres del SISUB y uno del ICSOE por contrato. problems dice lo que falta para presentarlos.
     * <p>
     * GET /v1/repse_returns/{period}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-repse-return
     */
    public RepseReturn get(String period, GetRepseReturnParams params, RequestOptions options) {
        return api.request("GET", "/v1/repse_returns/" + ApiClient.encode(period), null, params, false, RepseReturn.class, options);
    }

    public RepseReturn get(String period, GetRepseReturnParams params) {
        return get(period, params, null);
    }

    public RepseReturn get(String period) {
        return get(period, null, null);
    }
}
