// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreatePayrollPayoutParams;
import com.fiscalisto.model.PayrollPayout;

/**
 * Nómina: client.payrollPayouts().
 */
public final class PayrollPayoutsService {
    private final ApiClient api;

    PayrollPayoutsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Pagar la nómina por transferencia
     * <p>
     * Como «Pagar por transferencia» en la app: el neto de cada recibo de nómina timbrado (y no cancelado) con esa fecha de pago, menos los vales de despensa, a la CLABE de cada empleado, en un pago a proveedores en borrador (Pagos). Nunca sale solo: alguien del equipo lo abre en app_url y lo firma con su llave de acceso. Solo se le paga a una CLABE ya registrada en Pagos, aprobada y pasada su espera: la API no registra CLABEs, así que cambiar la clabe de un empleado no desvía su nómina (se registra en la app y espera como cualquier cuenta). Quien no se puede pagar va en excluded con su razón; quien ya va en otro pago de esta nómina no se paga dos veces. Solo si la empresa paga con Fintoc y deja que la API prepare pagos en Pagos › Configurar pagos (si no, 403 payouts_api_disabled); si nadie se puede pagar contesta 400 parameter_invalid con el motivo. Pide Idempotency-Key: si la respuesta se pierde, repítala con el mismo valor y contesta el mismo pago; la misma llave con otra fecha contesta 409 idempotency_key_reused.
     * <p>
     * POST /v1/payroll_payouts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-payroll-payout
     */
    public PayrollPayout create(CreatePayrollPayoutParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_payouts", params, null, true, PayrollPayout.class, options);
    }

    public PayrollPayout create(CreatePayrollPayoutParams params) {
        return create(params, null);
    }
}
