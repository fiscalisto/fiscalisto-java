// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListPortalSuppliersParams;
import com.fiscalisto.model.PortalSupplier;

/**
 * Portal de proveedores: client.portalSuppliers().
 */
public final class PortalSuppliersService {
    private final ApiClient api;

    PortalSuppliersService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar proveedores del portal
     * <p>
     * Los proveedores invitados o registrados en el Portal de proveedores del emisor, los más recientes primero: su alta, sus documentos, la cuenta a la que se le paga y su calificación.
     * <p>
     * GET /v1/portal_suppliers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/portal-de-proveedores/list-portal-suppliers
     */
    public Page<PortalSupplier> list(ListPortalSuppliersParams params, RequestOptions options) {
        return api.list("/v1/portal_suppliers", params, PortalSupplier.class, options);
    }

    public Page<PortalSupplier> list(ListPortalSuppliersParams params) {
        return list(params, null);
    }

    public Page<PortalSupplier> list() {
        return list(null, null);
    }

    /** Listar proveedores del portal: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<PortalSupplier> listAutoPaging(ListPortalSuppliersParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<PortalSupplier> listAutoPaging(ListPortalSuppliersParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<PortalSupplier> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un proveedor del portal
     * <p>
     * Su alta, sus documentos, su cuenta bancaria y su calificación por partes.
     * <p>
     * GET /v1/portal_suppliers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/portal-de-proveedores/get-portal-supplier
     */
    public PortalSupplier get(String id, RequestOptions options) {
        return api.request("GET", "/v1/portal_suppliers/" + ApiClient.encode(id), null, null, false, PortalSupplier.class, options);
    }

    public PortalSupplier get(String id) {
        return get(id, null);
    }
}
