// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateRepseContractParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListRepseContractsParams;
import com.fiscalisto.model.RepseContract;
import com.fiscalisto.model.UpdateRepseContractParams;

/**
 * Nómina: client.repseContracts().
 */
public final class RepseContractsService {
    private final ApiClient api;

    RepseContractsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Registrar un contrato de servicios especializados
     * <p>
     * Un contrato de servicios u obras especializadas (LFT art. 15 y 15-A) con su cliente, el centro de trabajo y quién trabaja en él y desde cuándo, como «Nómina › REPSE › + Contrato» en la app. Con él se arman los informes cuatrimestrales ICSOE del IMSS (LSS art. 15-A) y SISUB del Infonavit (Ley del Infonavit art. 29 Bis) de GET /v1/repse_returns/{period}, y aparecen sus fechas en el calendario de nómina. Un número de contrato que ya usó contesta parameter_invalid en number; un trabajador de otro emisor, en workers.
     * <p>
     * POST /v1/repse_contracts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-repse-contract
     */
    public RepseContract create(CreateRepseContractParams params, RequestOptions options) {
        return api.request("POST", "/v1/repse_contracts", params, null, true, RepseContract.class, options);
    }

    public RepseContract create(CreateRepseContractParams params) {
        return create(params, null);
    }

    /**
     * Listar contratos de servicios especializados
     * <p>
     * Los contratos del emisor que no ha archivado, por fecha de inicio (el más antiguo primero) y número.
     * <p>
     * GET /v1/repse_contracts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-repse-contracts
     */
    public Page<RepseContract> list(ListRepseContractsParams params, RequestOptions options) {
        return api.list("/v1/repse_contracts", params, RepseContract.class, options);
    }

    public Page<RepseContract> list(ListRepseContractsParams params) {
        return list(params, null);
    }

    public Page<RepseContract> list() {
        return list(null, null);
    }

    /** Listar contratos de servicios especializados: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<RepseContract> listAutoPaging(ListRepseContractsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<RepseContract> listAutoPaging(ListRepseContractsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<RepseContract> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un contrato de servicios especializados
     * <p>
     * Un contrato con su cliente, centro de trabajo y trabajadores.
     * <p>
     * GET /v1/repse_contracts/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-repse-contract
     */
    public RepseContract get(String id, RequestOptions options) {
        return api.request("GET", "/v1/repse_contracts/" + ApiClient.encode(id), null, null, false, RepseContract.class, options);
    }

    public RepseContract get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar un contrato de servicios especializados
     * <p>
     * Cambia lo que mande; lo demás queda. workers reemplaza la lista completa: para que alguien deje el contrato, póngale end_date en vez de quitarlo, así sigue en los informes de los meses que trabajó. Un contrato que terminó lleva su end_date.
     * <p>
     * POST /v1/repse_contracts/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-repse-contract
     */
    public RepseContract update(String id, UpdateRepseContractParams params, RequestOptions options) {
        return api.request("POST", "/v1/repse_contracts/" + ApiClient.encode(id), params, null, true, RepseContract.class, options);
    }

    public RepseContract update(String id, UpdateRepseContractParams params) {
        return update(id, params, null);
    }

    public RepseContract update(String id) {
        return update(id, null, null);
    }

    /**
     * Archivar un contrato de servicios especializados
     * <p>
     * Lo archiva: sale de la lista y de todos los informes, también de los pasados. Para un contrato que terminó, mejor póngale end_date con POST /v1/repse_contracts/{id}.
     * <p>
     * DELETE /v1/repse_contracts/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-repse-contract
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/repse_contracts/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
