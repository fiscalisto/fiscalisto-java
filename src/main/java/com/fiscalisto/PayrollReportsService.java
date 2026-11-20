// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetPayrollAccumulatedParams;
import com.fiscalisto.model.GetPayrollCostParams;
import com.fiscalisto.model.PayrollAccumulated;
import com.fiscalisto.model.PayrollCost;

/**
 * Nómina: client.payrollReports().
 */
public final class PayrollReportsService {
    private final ApiClient api;

    PayrollReportsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Acumulados de nómina
     * <p>
     * Los acumulados del año de los recibos de nómina timbrados vigentes (ordinarios y extraordinarios, por fecha de pago), como «Nómina › Reportes» de la app: cada percepción, deducción y otro pago por su clave del SAT y la del patrón, mes por mes, y los totales de cada empleado (percepciones gravadas y exentas, ISR e IMSS retenidos, subsidio para el empleo causado y neto). Con employee, solo los de ese empleado.
     * <p>
     * GET /v1/payroll_reports/accumulated
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-payroll-accumulated
     */
    public PayrollAccumulated accumulated(GetPayrollAccumulatedParams params, RequestOptions options) {
        return api.request("GET", "/v1/payroll_reports/accumulated", null, params, false, PayrollAccumulated.class, options);
    }

    public PayrollAccumulated accumulated(GetPayrollAccumulatedParams params) {
        return accumulated(params, null);
    }

    public PayrollAccumulated accumulated() {
        return accumulated(null, null);
    }

    /**
     * Costo de la nómina
     * <p>
     * Lo que cuesta la nómina del año mes por mes: lo pagado a los empleados (percepciones y otros pagos de los recibos timbrados, sin el subsidio para el empleo) más las cuotas del patrón al IMSS, SAR e Infonavit y el impuesto sobre nómina, calculados como GET /v1/accounting/payroll_provisions/{month}. En un año cuyas tasas aún no están cargadas (rates_loaded false), esas columnas y total vienen en null.
     * <p>
     * GET /v1/payroll_reports/cost
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-payroll-cost
     */
    public PayrollCost cost(GetPayrollCostParams params, RequestOptions options) {
        return api.request("GET", "/v1/payroll_reports/cost", null, params, false, PayrollCost.class, options);
    }

    public PayrollCost cost(GetPayrollCostParams params) {
        return cost(params, null);
    }

    public PayrollCost cost() {
        return cost(null, null);
    }
}
