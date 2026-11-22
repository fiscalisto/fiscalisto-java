// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateSupplierGroupParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListSupplierGroupsParams;
import com.fiscalisto.model.SupplierGroup;
import com.fiscalisto.model.UpdateSupplierGroupParams;

/**
 * Reglas: client.supplierGroups().
 */
public final class SupplierGroupsService {
    private final ApiClient api;

    SupplierGroupsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un grupo de proveedores
     * <p>
     * Un grupo de proveedores (fletes, materia prima…), como Proveedores › Grupos en la app. Cada proveedor está en un solo grupo: los de suppliers salen del que tenían. Una regla vale para todo el grupo con la condición supplierGroup.
     * <p>
     * POST /v1/supplier_groups
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/create-supplier-group
     */
    public SupplierGroup create(CreateSupplierGroupParams params, RequestOptions options) {
        return api.request("POST", "/v1/supplier_groups", params, null, true, SupplierGroup.class, options);
    }

    public SupplierGroup create(CreateSupplierGroupParams params) {
        return create(params, null);
    }

    /**
     * Listar grupos de proveedores
     * <p>
     * Los grupos de proveedores, con cuántos proveedores tiene cada uno.
     * <p>
     * GET /v1/supplier_groups
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/list-supplier-groups
     */
    public Page<SupplierGroup> list(ListSupplierGroupsParams params, RequestOptions options) {
        return api.list("/v1/supplier_groups", params, SupplierGroup.class, options);
    }

    public Page<SupplierGroup> list(ListSupplierGroupsParams params) {
        return list(params, null);
    }

    public Page<SupplierGroup> list() {
        return list(null, null);
    }

    /** Listar grupos de proveedores: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<SupplierGroup> listAutoPaging(ListSupplierGroupsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<SupplierGroup> listAutoPaging(ListSupplierGroupsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<SupplierGroup> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un grupo de proveedores
     * <p>
     * Un grupo de proveedores.
     * <p>
     * GET /v1/supplier_groups/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/get-supplier-group
     */
    public SupplierGroup get(String id, RequestOptions options) {
        return api.request("GET", "/v1/supplier_groups/" + ApiClient.encode(id), null, null, false, SupplierGroup.class, options);
    }

    public SupplierGroup get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar un grupo de proveedores
     * <p>
     * Cambia solo lo que manda: su nombre, su color, los proveedores que entran (add_suppliers) y los que salen (remove_suppliers).
     * <p>
     * POST /v1/supplier_groups/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/update-supplier-group
     */
    public SupplierGroup update(String id, UpdateSupplierGroupParams params, RequestOptions options) {
        return api.request("POST", "/v1/supplier_groups/" + ApiClient.encode(id), params, null, true, SupplierGroup.class, options);
    }

    public SupplierGroup update(String id, UpdateSupplierGroupParams params) {
        return update(id, params, null);
    }

    public SupplierGroup update(String id) {
        return update(id, null, null);
    }

    /**
     * Quitar un grupo de proveedores
     * <p>
     * Sus proveedores se quedan sin grupo, y las reglas que lo usan ya no aplican a nadie.
     * <p>
     * DELETE /v1/supplier_groups/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/delete-supplier-group
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/supplier_groups/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
