// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListMaterialityInvoicesParams;
import com.fiscalisto.model.MaterialityInvoiceList;

/**
 * Cumplimiento SAT: client.materialityInvoices().
 */
public final class MaterialityInvoicesService {
    private final ApiClient api;

    MaterialityInvoicesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar facturas recibidas por probar
     * <p>
     * Las facturas recibidas (ingresos) del emisor en un periodo que no tienen su evidencia completa, de mayor a menor importe, cada una con lo que tiene, lo que le falta y de dónde salió cada evidencia (orden de compra, recepción, complemento de pago, banco, archivos). Con state, solo las de ese estado. Una página, hasta 300; has_more dice que hay más (acorte el periodo o filtre por proveedor). No usa timbres.
     * <p>
     * GET /v1/materiality_invoices
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/list-materiality-invoices
     */
    public MaterialityInvoiceList list(ListMaterialityInvoicesParams params, RequestOptions options) {
        return api.request("GET", "/v1/materiality_invoices", null, params, false, MaterialityInvoiceList.class, options);
    }

    public MaterialityInvoiceList list(ListMaterialityInvoicesParams params) {
        return list(params, null);
    }

    public MaterialityInvoiceList list() {
        return list(null, null);
    }
}
