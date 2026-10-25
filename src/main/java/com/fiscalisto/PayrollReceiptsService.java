// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreatePayrollReceiptParams;
import com.fiscalisto.model.Invoice;
import com.fiscalisto.model.PayrollReceiptPreview;
import com.fiscalisto.model.PreviewPayrollReceiptParams;

/**
 * Nómina: client.payrollReceipts().
 */
public final class PayrollReceiptsService {
    private final ApiClient api;

    PayrollReceiptsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Timbrar un recibo de nómina
     * <p>
     * Nómina ordinaria (Nómina 1.2): Fiscalisto calcula sueldo, ISR con subsidio al empleo e IMSS del empleado y el periodo, como la app. Queda como factura tipo N (GET /v1/invoices/{id}). El emisor necesita employer_registration.
     * <p>
     * POST /v1/payroll_receipts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-payroll-receipt
     */
    public Invoice create(CreatePayrollReceiptParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_receipts", params, null, true, Invoice.class, options);
    }

    public Invoice create(CreatePayrollReceiptParams params) {
        return create(params, null);
    }

    /**
     * Calcular un recibo sin timbrar
     * <p>
     * POST /v1/payroll_receipts/preview
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/preview-payroll-receipt
     */
    public PayrollReceiptPreview preview(PreviewPayrollReceiptParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_receipts/preview", params, null, false, PayrollReceiptPreview.class, options);
    }

    public PayrollReceiptPreview preview(PreviewPayrollReceiptParams params) {
        return preview(params, null);
    }
}
