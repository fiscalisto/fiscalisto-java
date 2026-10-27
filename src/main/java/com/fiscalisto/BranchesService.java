// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Branch;
import com.fiscalisto.model.CreateBranchParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListBranchesParams;
import com.fiscalisto.model.UpdateBranchParams;

/**
 * Sucursales: client.branches().
 */
public final class BranchesService {
    private final ApiClient api;

    BranchesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear una sucursal
     * <p>
     * Otro lugar desde donde factura el emisor, con su propio código postal: sus facturas llevan ese CP en LugarExpedicion (y su zona horaria en la Fecha, y el IVA 8 % si es de la franja fronteriza), su dirección en el PDF y, si las da, sus propias series. Un CP que ya tiene otra sucursal contesta branch_exists; el del domicilio fiscal del emisor no es sucursal (es la Matriz). Hasta 200 por emisor.
     * <p>
     * POST /v1/branches
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/sucursales/create-branch
     */
    public Branch create(CreateBranchParams params, RequestOptions options) {
        return api.request("POST", "/v1/branches", params, null, true, Branch.class, options);
    }

    public Branch create(CreateBranchParams params) {
        return create(params, null);
    }

    /**
     * Listar sucursales
     * <p>
     * Las sucursales del emisor, las más recientes primero. Las archivadas solo con include_archived=true.
     * <p>
     * GET /v1/branches
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/sucursales/list-branches
     */
    public Page<Branch> list(ListBranchesParams params, RequestOptions options) {
        return api.list("/v1/branches", params, Branch.class, options);
    }

    public Page<Branch> list(ListBranchesParams params) {
        return list(params, null);
    }

    public Page<Branch> list() {
        return list(null, null);
    }

    /** Listar sucursales: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Branch> listAutoPaging(ListBranchesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Branch> listAutoPaging(ListBranchesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Branch> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una sucursal
     * <p>
     * Una sucursal del emisor.
     * <p>
     * GET /v1/branches/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/sucursales/get-branch
     */
    public Branch get(String id, RequestOptions options) {
        return api.request("GET", "/v1/branches/" + ApiClient.encode(id), null, null, false, Branch.class, options);
    }

    public Branch get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar una sucursal
     * <p>
     * Cambia solo los campos que manda; una serie en null vuelve a la del emisor. archived: true la archiva (ya no se factura desde ella y sus facturas la siguen nombrando), false la restaura. El código postal de una sucursal que ya facturó no cambia: si se mudó, archívela y cree otra.
     * <p>
     * POST /v1/branches/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/sucursales/update-branch
     */
    public Branch update(String id, UpdateBranchParams params, RequestOptions options) {
        return api.request("POST", "/v1/branches/" + ApiClient.encode(id), params, null, true, Branch.class, options);
    }

    public Branch update(String id, UpdateBranchParams params) {
        return update(id, params, null);
    }

    public Branch update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar una sucursal
     * <p>
     * Solo una que nunca facturó; con facturas contesta branch_has_invoices: archívela con archived: true.
     * <p>
     * DELETE /v1/branches/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/sucursales/delete-branch
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/branches/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
