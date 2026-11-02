// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CostCenter;
import com.fiscalisto.model.CreateCostCenterParams;
import com.fiscalisto.model.DeleteCostCenterParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListCostCentersParams;
import com.fiscalisto.model.UpdateCostCenterParams;

/**
 * Centros de costo: client.costCenters().
 */
public final class CostCentersService {
    private final ApiClient api;

    CostCentersService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un centro de costo
     * <p>
     * Una parte del negocio del emisor que quiere ver por separado: una obra, un proyecto, una sucursal, un área. Sus facturas lo toman con cost_center al crearlas, o después con POST /v1/invoices/{id} y POST /v1/sat_invoices/{id}. Un nombre que ya existe contesta cost_center_exists. Hasta 500 por emisor.
     * <p>
     * POST /v1/cost_centers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/centros-de-costo/create-cost-center
     */
    public CostCenter create(CreateCostCenterParams params, RequestOptions options) {
        return api.request("POST", "/v1/cost_centers", params, null, true, CostCenter.class, options);
    }

    public CostCenter create(CreateCostCenterParams params) {
        return create(params, null);
    }

    /**
     * Listar centros de costo
     * <p>
     * Los centros de costo del emisor, los más recientes primero, con cuántas facturas tiene cada uno. Los archivados solo con include_archived=true.
     * <p>
     * GET /v1/cost_centers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/centros-de-costo/list-cost-centers
     */
    public Page<CostCenter> list(ListCostCentersParams params, RequestOptions options) {
        return api.list("/v1/cost_centers", params, CostCenter.class, options);
    }

    public Page<CostCenter> list(ListCostCentersParams params) {
        return list(params, null);
    }

    public Page<CostCenter> list() {
        return list(null, null);
    }

    /** Listar centros de costo: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<CostCenter> listAutoPaging(ListCostCentersParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<CostCenter> listAutoPaging(ListCostCentersParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<CostCenter> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un centro de costo
     * <p>
     * Un centro de costo del emisor.
     * <p>
     * GET /v1/cost_centers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/centros-de-costo/get-cost-center
     */
    public CostCenter get(String id, RequestOptions options) {
        return api.request("GET", "/v1/cost_centers/" + ApiClient.encode(id), null, null, false, CostCenter.class, options);
    }

    public CostCenter get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar un centro de costo
     * <p>
     * Cambia solo lo que manda. archived: true lo archiva (ya no se ponen facturas en él y las suyas lo conservan), false lo restaura.
     * <p>
     * POST /v1/cost_centers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/centros-de-costo/update-cost-center
     */
    public CostCenter update(String id, UpdateCostCenterParams params, RequestOptions options) {
        return api.request("POST", "/v1/cost_centers/" + ApiClient.encode(id), params, null, true, CostCenter.class, options);
    }

    public CostCenter update(String id, UpdateCostCenterParams params) {
        return update(id, params, null);
    }

    public CostCenter update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un centro de costo
     * <p>
     * Sus facturas pasan a move_to (así junta dos en uno) o se quedan sin centro de costo. No se puede deshacer; para dejar de usarlo sin tocar sus facturas, archívelo.
     * <p>
     * DELETE /v1/cost_centers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/centros-de-costo/delete-cost-center
     */
    public Deleted delete(String id, DeleteCostCenterParams params, RequestOptions options) {
        return api.request("DELETE", "/v1/cost_centers/" + ApiClient.encode(id), null, params, false, Deleted.class, options);
    }

    public Deleted delete(String id, DeleteCostCenterParams params) {
        return delete(id, params, null);
    }

    public Deleted delete(String id) {
        return delete(id, null, null);
    }
}
