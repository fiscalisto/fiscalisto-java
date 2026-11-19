// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateExtraordinaryPayrollReceiptParams;
import com.fiscalisto.model.CreatePayrollReceiptParams;
import com.fiscalisto.model.ExternalPayrollReceiptCreate;
import com.fiscalisto.model.ExternalPayrollReceiptPreview;
import com.fiscalisto.model.ExtraordinaryPayrollReceiptPreview;
import com.fiscalisto.model.Invoice;
import com.fiscalisto.model.PayrollReceiptPreview;
import com.fiscalisto.model.PreviewExtraordinaryPayrollReceiptParams;
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
     * Nómina ordinaria (Nómina 1.2): Fiscalisto calcula sueldo, ISR con subsidio al empleo e IMSS del empleado y el periodo, con sus incidencias (incidents: horas extra, domingos, vacaciones y premios), como la app: el aguinaldo, la PTU y los finiquitos los calcula POST /v1/payroll_receipts/extraordinary; comisiones, Infonavit o préstamos los calcula su sistema y se timbran con POST /v1/payroll_receipts/external (pedirlos aquí contesta payroll_calculation_unsupported). Revise antes el recibo con POST /v1/payroll_receipts/preview y mande su confirmation_token: así solo se timbra el recibo que revisó (si cambió, 409 payroll_calculation_changed). Queda como factura tipo N (GET /v1/invoices/{id}). El emisor necesita employer_registration.
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
     * El recibo como se timbraría (percepciones con sus incidencias, ISR con el subsidio para el empleo, cuotas IMSS y el neto), sin timbrar ni usar timbres, con el confirmation_token que lo timbra tal cual y los avisos de lo que no incluye (un finiquito, valores del año que aún no se cargan).
     * <p>
     * POST /v1/payroll_receipts/preview
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/preview-payroll-receipt
     */
    public PayrollReceiptPreview preview(PreviewPayrollReceiptParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_receipts/preview", params, null, true, PayrollReceiptPreview.class, options);
    }

    public PayrollReceiptPreview preview(PreviewPayrollReceiptParams params) {
        return preview(params, null);
    }

    /**
     * Timbrar un aguinaldo, PTU o finiquito
     * <p>
     * Nómina extraordinaria (TipoNomina E) que calcula Fiscalisto, como la app en Nómina › Aguinaldo, PTU y finiquitos: el aguinaldo (los días al año del empleado, al menos 15, en proporción a los trabajados, 30 UMA exentas), la PTU (la parte que le toca, 15 UMA exentas) o el finiquito al último día trabajado (end_date): aguinaldo, vacaciones y prima vacacional proporcionales, menos lo que ya se le pagó en el año, y con exit_reason dismissal la indemnización de 3 meses, opcionalmente 20 días por año, y la prima de antigüedad (90 UMA exentas por año de servicio). El ISR de un aguinaldo o PTU, con el cálculo que retenga menos (art. 96 LISR o 174 del Reglamento) salvo que pida uno. Uno por empleado, tipo y año (el finiquito, por fecha de baja): pedirlo otra vez devuelve el mismo; cancelado, se emite de nuevo. Revíselo antes con POST /v1/payroll_receipts/extraordinary/preview y mande su confirmation_token. Queda como factura tipo N.
     * <p>
     * POST /v1/payroll_receipts/extraordinary
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-extraordinary-payroll-receipt
     */
    public Invoice createExtraordinary(CreateExtraordinaryPayrollReceiptParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_receipts/extraordinary", params, null, true, Invoice.class, options);
    }

    public Invoice createExtraordinary(CreateExtraordinaryPayrollReceiptParams params) {
        return createExtraordinary(params, null);
    }

    /**
     * Calcular un aguinaldo, PTU o finiquito sin timbrar
     * <p>
     * El recibo extraordinario como se timbraría (lo que paga, su parte exenta, el ISR con los dos cálculos y el neto), sin timbrar ni usar timbres, con el confirmation_token que lo timbra tal cual.
     * <p>
     * POST /v1/payroll_receipts/extraordinary/preview
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/preview-extraordinary-payroll-receipt
     */
    public ExtraordinaryPayrollReceiptPreview previewExtraordinary(PreviewExtraordinaryPayrollReceiptParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_receipts/extraordinary/preview", params, null, true, ExtraordinaryPayrollReceiptPreview.class, options);
    }

    public ExtraordinaryPayrollReceiptPreview previewExtraordinary(PreviewExtraordinaryPayrollReceiptParams params) {
        return previewExtraordinary(params, null);
    }

    /**
     * Timbrar un recibo calculado por su sistema
     * <p>
     * Para un sistema de nómina que ya calculó el recibo: timbra exactamente sus percepciones (gravado y exento), deducciones, otros pagos, horas extra, incapacidades, separación o jubilación, ordinario (type O) o extraordinario (type E: aguinaldo, PTU, finiquito). Fiscalisto no recalcula ni redondea nada: revisa el XSD, los catálogos del SAT, la Matriz de errores y que sus totales cuadren, y si algo falla responde payroll_invalid con todos los problemas en errors[] (cada uno con su param). Un recibo ordinario por empleado (RFC) y periodo; uno extraordinario por empleado y payroll_run_id. Repetirlo con los mismos importes devuelve el mismo recibo; con otros importes, 409 payroll_receipt_exists (corríjalo con replaces). Queda como factura tipo N.
     * <p>
     * POST /v1/payroll_receipts/external
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-external-payroll-receipt
     */
    public Invoice createExternal(ExternalPayrollReceiptCreate params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_receipts/external", params, null, true, Invoice.class, options);
    }

    public Invoice createExternal(ExternalPayrollReceiptCreate params) {
        return createExternal(params, null);
    }

    /**
     * Revisar un recibo calculado por su sistema, sin timbrar
     * <p>
     * Las mismas revisiones que al timbrar, sin timbrar ni usar timbres: devuelve el recibo como se timbraría, los avisos y el XML sin sellar (unsigned_xml), con sus importes tal cual. Si algo falla, payroll_invalid con errors[].
     * <p>
     * POST /v1/payroll_receipts/external/preview
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/preview-external-payroll-receipt
     */
    public ExternalPayrollReceiptPreview previewExternal(ExternalPayrollReceiptCreate params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_receipts/external/preview", params, null, true, ExternalPayrollReceiptPreview.class, options);
    }

    public ExternalPayrollReceiptPreview previewExternal(ExternalPayrollReceiptCreate params) {
        return previewExternal(params, null);
    }
}
