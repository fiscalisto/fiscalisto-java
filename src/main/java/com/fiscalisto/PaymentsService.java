// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreatePaymentParams;
import com.fiscalisto.model.Invoice;

/**
 * Pagos y notas de crédito: client.payments().
 */
public final class PaymentsService {
    private final ApiClient api;

    PaymentsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Timbrar un complemento de pago
     * <p>
     * El recibo de pago (CFDI tipo P, Pagos 2.0) de facturas PPD: parcialidad, saldo anterior e insoluto e impuestos de cada una los calcula Fiscalisto.
     * <p>
     * POST /v1/payments
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pagos-y-notas-de-credito/create-payment
     */
    public Invoice create(CreatePaymentParams params, RequestOptions options) {
        return api.request("POST", "/v1/payments", params, null, true, Invoice.class, options);
    }

    public Invoice create(CreatePaymentParams params) {
        return create(params, null);
    }
}
