// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CancelPayoutParams;
import com.fiscalisto.model.CreatePayoutParams;
import com.fiscalisto.model.ListPayoutsParams;
import com.fiscalisto.model.Payout;

/**
 * Pagos a proveedores: client.payouts().
 */
public final class PayoutsService {
    private final ApiClient api;

    PayoutsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Preparar un pago a proveedores
     * <p>
     * Un pago en borrador con estas facturas, revisado como en la app: las reglas antes de pagar, los límites y las cuentas aprobadas de cada proveedor. Las de un proveedor van en una transferencia. Nunca sale solo: alguien del equipo lo abre en app_url y lo firma con su llave de acceso. Solo si la empresa lo permite en Pagos › Configurar pagos (si no, 403 payouts_api_disabled); lo que no se puede pagar contesta 400 payout_invalid con el motivo. Pide Idempotency-Key: si la respuesta se pierde, repítala con el mismo valor y contesta el mismo pago, nunca uno nuevo.
     * <p>
     * POST /v1/payouts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pagos-a-proveedores/create-payout
     */
    public Payout create(CreatePayoutParams params, RequestOptions options) {
        return api.request("POST", "/v1/payouts", params, null, true, Payout.class, options);
    }

    public Payout create(CreatePayoutParams params) {
        return create(params, null);
    }

    /**
     * Listar pagos a proveedores
     * <p>
     * Los pagos del emisor, hechos en la app o por la API, los más recientes primero, con sus transferencias.
     * <p>
     * GET /v1/payouts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pagos-a-proveedores/list-payouts
     */
    public Page<Payout> list(ListPayoutsParams params, RequestOptions options) {
        return api.list("/v1/payouts", params, Payout.class, options);
    }

    public Page<Payout> list(ListPayoutsParams params) {
        return list(params, null);
    }

    public Page<Payout> list() {
        return list(null, null);
    }

    /** Listar pagos a proveedores: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Payout> listAutoPaging(ListPayoutsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Payout> listAutoPaging(ListPayoutsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Payout> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un pago a proveedores
     * <p>
     * Con sus firmas, cada transferencia, su clave de rastreo y su CEP cuando llega.
     * <p>
     * GET /v1/payouts/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pagos-a-proveedores/get-payout
     */
    public Payout get(String id, RequestOptions options) {
        return api.request("GET", "/v1/payouts/" + ApiClient.encode(id), null, null, false, Payout.class, options);
    }

    public Payout get(String id) {
        return get(id, null);
    }

    /**
     * Cancelar un pago a proveedores
     * <p>
     * Uno que preparó la API, mientras no ha salido nada (draft, pending_approval o approved): sus facturas vuelven a Por pagar y llega payout.canceled. Uno preparado en la app se cancela en la app (400 payout_not_from_api).
     * <p>
     * POST /v1/payouts/{id}/cancel
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/pagos-a-proveedores/cancel-payout
     */
    public Payout cancel(String id, CancelPayoutParams params, RequestOptions options) {
        return api.request("POST", "/v1/payouts/" + ApiClient.encode(id) + "/cancel", params, null, true, Payout.class, options);
    }

    public Payout cancel(String id, CancelPayoutParams params) {
        return cancel(id, params, null);
    }

    public Payout cancel(String id) {
        return cancel(id, null, null);
    }
}
