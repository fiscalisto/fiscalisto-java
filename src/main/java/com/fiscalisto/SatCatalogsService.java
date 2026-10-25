// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetSatCatalogParams;
import com.fiscalisto.model.SatCatalogEntryList;

/**
 * Catálogos del SAT: client.satCatalogs().
 */
public final class SatCatalogsService {
    private final ApiClient api;

    SatCatalogsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Consultar un catálogo del SAT
     * <p>
     * product_keys y unit_keys se buscan con q (texto o clave). Los demás vienen completos: tax_systems, cfdi_uses, payment_forms, payment_methods, relationship_types, cancellation_motives, export_types, tax_objects, retention_codes.
     * <p>
     * GET /v1/sat_catalogs/{name}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/catalogos-del-sat/get-sat-catalog
     */
    public SatCatalogEntryList get(String name, GetSatCatalogParams params, RequestOptions options) {
        return api.request("GET", "/v1/sat_catalogs/" + ApiClient.encode(name), null, params, false, SatCatalogEntryList.class, options);
    }

    public SatCatalogEntryList get(String name, GetSatCatalogParams params) {
        return get(name, params, null);
    }

    public SatCatalogEntryList get(String name) {
        return get(name, null, null);
    }
}
