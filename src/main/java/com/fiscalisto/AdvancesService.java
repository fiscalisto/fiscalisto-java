// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AdvanceList;
import com.fiscalisto.model.ApplyAdvanceParams;
import com.fiscalisto.model.CreateAdvanceParams;
import com.fiscalisto.model.Invoice;
import com.fiscalisto.model.ListAdvancesParams;

/**
 * Anticipos: client.advances().
 */
public final class AdvancesService {
    private final ApiClient api;

    AdvancesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Timbrar un anticipo
     * <p>
     * La factura del anticipo: un concepto «Anticipo del bien o servicio» (84111506, ACT). amount es lo que pagó el cliente con IVA.
     * <p>
     * POST /v1/advances
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/anticipos/create-advance
     */
    public Invoice create(CreateAdvanceParams params, RequestOptions options) {
        return api.request("POST", "/v1/advances", params, null, true, Invoice.class, options);
    }

    public Invoice create(CreateAdvanceParams params) {
        return create(params, null);
    }

    /**
     * Listar anticipos sin aplicar
     * <p>
     * GET /v1/advances
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/anticipos/list-advances
     */
    public AdvanceList list(ListAdvancesParams params, RequestOptions options) {
        return api.request("GET", "/v1/advances", null, params, false, AdvanceList.class, options);
    }

    public AdvanceList list(ListAdvancesParams params) {
        return list(params, null);
    }

    public AdvanceList list() {
        return list(null, null);
    }

    /**
     * Aplicar un anticipo
     * <p>
     * Timbra la factura de lo vendido (el cuerpo de POST /v1/invoices) relacionada 07 al anticipo. Con method egreso, también la nota de aplicación. La misma Idempotency-Key continúa donde se quedó.
     * <p>
     * POST /v1/advances/{id}/apply
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/anticipos/apply-advance
     */
    public Invoice apply(String id, ApplyAdvanceParams params, RequestOptions options) {
        return api.request("POST", "/v1/advances/" + ApiClient.encode(id) + "/apply", params, null, true, Invoice.class, options);
    }

    public Invoice apply(String id, ApplyAdvanceParams params) {
        return apply(id, params, null);
    }
}
