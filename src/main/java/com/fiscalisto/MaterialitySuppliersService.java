// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListMaterialitySuppliersParams;
import com.fiscalisto.model.MaterialitySupplierList;

/**
 * Cumplimiento SAT: client.materialitySuppliers().
 */
public final class MaterialitySuppliersService {
    private final ApiClient api;

    MaterialitySuppliersService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar la materialidad por proveedor
     * <p>
     * Como Materialidad en la app: los proveedores de las facturas recibidas (ingresos) del emisor en un periodo, con cuánto de lo que facturaron tiene evidencia completa de que la operación existió (acuerdo, entrega y pago). Primero los que están en 69-B definitivo (corre su plazo de 30 días hábiles), después los de más importe sin probar. Una página, hasta 500. Sin fechas, este año hasta hoy. No usa timbres.
     * <p>
     * GET /v1/materiality_suppliers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/list-materiality-suppliers
     */
    public MaterialitySupplierList list(ListMaterialitySuppliersParams params, RequestOptions options) {
        return api.request("GET", "/v1/materiality_suppliers", null, params, false, MaterialitySupplierList.class, options);
    }

    public MaterialitySupplierList list(ListMaterialitySuppliersParams params) {
        return list(params, null);
    }

    public MaterialitySupplierList list() {
        return list(null, null);
    }
}
