// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreatePayrollApprovalParams;
import com.fiscalisto.model.ListPayrollApprovalsParams;
import com.fiscalisto.model.PayrollApproval;

/**
 * Nómina: client.payrollApprovals().
 */
public final class PayrollApprovalsService {
    private final ApiClient api;

    PayrollApprovalsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Pedir aprobación de la prenómina
     * <p>
     * Para un emisor que pide aprobar la prenómina antes de timbrar (Ajustes › Aprobaciones › Prenómina en la app): manda la nómina del periodo a aprobación. Calcula cada recibo como lo timbraría POST /v1/payroll_receipts y guarda sus importes; reemplaza la que se haya pedido antes para el mismo periodo, y avisa a quienes pueden aprobarla. La aprueba o rechaza una persona en Nómina › Emitir recibos (no una llave). Mientras no esté aprobada, POST /v1/payroll_receipts y POST /v1/payroll_batches de ese periodo contestan payroll_approval_required; aprobada, timbran solo los recibos de ella con los mismos importes y fecha de pago.
     * <p>
     * POST /v1/payroll_approvals
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-payroll-approval
     */
    public PayrollApproval create(CreatePayrollApprovalParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_approvals", params, null, true, PayrollApproval.class, options);
    }

    public PayrollApproval create(CreatePayrollApprovalParams params) {
        return create(params, null);
    }

    /**
     * Listar prenóminas por aprobar
     * <p>
     * Las prenóminas pedidas para aprobación, las más recientes primero.
     * <p>
     * GET /v1/payroll_approvals
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-payroll-approvals
     */
    public Page<PayrollApproval> list(ListPayrollApprovalsParams params, RequestOptions options) {
        return api.list("/v1/payroll_approvals", params, PayrollApproval.class, options);
    }

    public Page<PayrollApproval> list(ListPayrollApprovalsParams params) {
        return list(params, null);
    }

    public Page<PayrollApproval> list() {
        return list(null, null);
    }

    /** Listar prenóminas por aprobar: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<PayrollApproval> listAutoPaging(ListPayrollApprovalsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<PayrollApproval> listAutoPaging(ListPayrollApprovalsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<PayrollApproval> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una prenómina por aprobar
     * <p>
     * Con su estado y los importes de cada recibo.
     * <p>
     * GET /v1/payroll_approvals/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-payroll-approval
     */
    public PayrollApproval get(String id, RequestOptions options) {
        return api.request("GET", "/v1/payroll_approvals/" + ApiClient.encode(id), null, null, false, PayrollApproval.class, options);
    }

    public PayrollApproval get(String id) {
        return get(id, null);
    }

    /**
     * Retirar una prenómina por aprobar
     * <p>
     * Retira una que espera aprobación (status withdrawn), para corregirla y pedirla de nuevo, o porque no se pagará.
     * <p>
     * POST /v1/payroll_approvals/{id}/cancel
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/cancel-payroll-approval
     */
    public PayrollApproval cancel(String id, RequestOptions options) {
        return api.request("POST", "/v1/payroll_approvals/" + ApiClient.encode(id) + "/cancel", null, null, true, PayrollApproval.class, options);
    }

    public PayrollApproval cancel(String id) {
        return cancel(id, null);
    }
}
