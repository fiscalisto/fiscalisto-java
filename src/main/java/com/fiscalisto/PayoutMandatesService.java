// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ListPayoutMandatesParams;
import com.fiscalisto.model.PayoutMandateList;

/**
 * Pagos a proveedores: client.payoutMandates().
 */
public final class PayoutMandatesService {
    private final ApiClient api;

    PayoutMandatesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar pagos recurrentes
     * <p>
     * Los pagos recurrentes firmados en la app (o por firmar): a qué cuenta, cuánto como máximo, qué día y qué meses, y los pagos que ya hicieron. Solo lectura.
     * <p>
     * GET /v1/payout_mandates
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pagos-a-proveedores/list-payout-mandates
     */
    public PayoutMandateList list(ListPayoutMandatesParams params, RequestOptions options) {
        return api.request("GET", "/v1/payout_mandates", null, params, false, PayoutMandateList.class, options);
    }

    public PayoutMandateList list(ListPayoutMandatesParams params) {
        return list(params, null);
    }

    public PayoutMandateList list() {
        return list(null, null);
    }
}
