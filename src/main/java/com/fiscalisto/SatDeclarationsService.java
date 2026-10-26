// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListSatDeclarationsParams;
import com.fiscalisto.model.RefreshSatDeclarationsParams;
import com.fiscalisto.model.SatDeclaration;
import com.fiscalisto.model.SatDeclarationsRefresh;

/**
 * Declaraciones del SAT: client.satDeclarations().
 */
public final class SatDeclarationsService {
    private final ApiClient api;

    SatDeclarationsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Consultar las declaraciones de un emisor en el SAT
     * <p>
     * Entra al SAT con la e.firma guardada del emisor y trae las declaraciones que presentó: provisionales o definitivas (desde 2022), la anual de persona moral (desde 2019) y las del servicio anterior Declaraciones y pagos, con su PDF, su acuse y sus cifras. La primera consulta trae todos los años que el SAT conserva; las siguientes, este año y el anterior. Solo consulta: nunca presenta ni firma nada. En producción usa 1 timbre por consulta (regresa si el SAT no contesta) y se puede hacer una vez cada 10 minutos por emisor. Contesta en menos de un minuto; si queda algo por bajar (status processing), sigue solo en la siguiente hora sin otro timbre. En pruebas no se le pregunta al SAT: trae declaraciones de ejemplo al instante.
     * <p>
     * POST /v1/sat_declarations/refresh
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/declaraciones-del-sat/refresh-sat-declarations
     */
    public SatDeclarationsRefresh refresh(RefreshSatDeclarationsParams params, RequestOptions options) {
        return api.request("POST", "/v1/sat_declarations/refresh", params, null, true, SatDeclarationsRefresh.class, options);
    }

    public SatDeclarationsRefresh refresh(RefreshSatDeclarationsParams params) {
        return refresh(params, null);
    }

    public SatDeclarationsRefresh refresh() {
        return refresh(null, null);
    }

    /**
     * Listar declaraciones del SAT
     * <p>
     * Las declaraciones que trajeron sus consultas, del ejercicio y mes más recientes a los más antiguos (la anual antes de los meses de su año). No usa timbres.
     * <p>
     * GET /v1/sat_declarations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/declaraciones-del-sat/list-sat-declarations
     */
    public Page<SatDeclaration> list(ListSatDeclarationsParams params, RequestOptions options) {
        return api.list("/v1/sat_declarations", params, SatDeclaration.class, options);
    }

    public Page<SatDeclaration> list(ListSatDeclarationsParams params) {
        return list(params, null);
    }

    public Page<SatDeclaration> list() {
        return list(null, null);
    }

    /** Listar declaraciones del SAT: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SatDeclaration> listAutoPaging(ListSatDeclarationsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SatDeclaration> listAutoPaging(ListSatDeclarationsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SatDeclaration> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una declaración del SAT
     * <p>
     * GET /v1/sat_declarations/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/declaraciones-del-sat/get-sat-declaration
     */
    public SatDeclaration get(String id, RequestOptions options) {
        return api.request("GET", "/v1/sat_declarations/" + ApiClient.encode(id), null, null, false, SatDeclaration.class, options);
    }

    public SatDeclaration get(String id) {
        return get(id, null);
    }

    /**
     * Descargar el PDF de una declaración
     * <p>
     * La declaración como la da el SAT. No usa timbres.
     * <p>
     * GET /v1/sat_declarations/{id}/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/declaraciones-del-sat/get-sat-declaration-pdf
     */
    public byte[] pdf(String id, RequestOptions options) {
        return api.bytes("GET", "/v1/sat_declarations/" + ApiClient.encode(id) + "/pdf", null, null, false, options);
    }

    public byte[] pdf(String id) {
        return pdf(id, null);
    }

    /**
     * Descargar el acuse de una declaración
     * <p>
     * El acuse de recibo, con la línea de captura si hay algo a pagar. No usa timbres.
     * <p>
     * GET /v1/sat_declarations/{id}/receipt
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/declaraciones-del-sat/get-sat-declaration-receipt
     */
    public byte[] receipt(String id, RequestOptions options) {
        return api.bytes("GET", "/v1/sat_declarations/" + ApiClient.encode(id) + "/receipt", null, null, false, options);
    }

    public byte[] receipt(String id) {
        return receipt(id, null);
    }

    /**
     * Descargar los estados financieros de una anual
     * <p>
     * El Excel de estados financieros de la anual de persona moral, como lo da el SAT. No usa timbres.
     * <p>
     * GET /v1/sat_declarations/{id}/financial_statements
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/declaraciones-del-sat/get-sat-declaration-financial-statements
     */
    public String financialStatements(String id, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/sat_declarations/" + ApiClient.encode(id) + "/financial_statements", null, null, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String financialStatements(String id) {
        return financialStatements(id, null);
    }
}
