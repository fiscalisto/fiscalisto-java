// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreatePayrollProvisionParams;
import com.fiscalisto.model.DeletePayrollProvisionParams;
import com.fiscalisto.model.GetPayrollProvisionParams;
import com.fiscalisto.model.PayrollProvision;

/**
 * Contabilidad: client.payrollProvisions().
 */
public final class PayrollProvisionsService {
    private final ApiClient api;

    PayrollProvisionsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver las cuotas patronales de un mes
     * <p>
     * Lo que la empresa debe al IMSS, al SAR y al Infonavit por los días del mes, calculado de sus recibos de nómina timbrados (su salario base de cotización y sus días, con faltas e incapacidades como dice la Ley del Seguro Social), el impuesto sobre nómina del mes y la póliza de provisión, si ya se registró. Como Cierre del mes › Cuotas patronales del mes en la app. Se calcula con las tasas de 2026; otro año contesta parameter_invalid en month.
     * <p>
     * GET /v1/accounting/payroll_provisions/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-payroll-provision
     */
    public PayrollProvision get(String month, GetPayrollProvisionParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/payroll_provisions/" + ApiClient.encode(month), null, params, false, PayrollProvision.class, options);
    }

    public PayrollProvision get(String month, GetPayrollProvisionParams params) {
        return get(month, params, null);
    }

    public PayrollProvision get(String month) {
        return get(month, null, null);
    }

    /**
     * Registrar las cuotas patronales de un mes
     * <p>
     * Registra (o reemplaza) la provisión del último día del mes: Cuotas patronales al IMSS (601.26), Aportaciones patronales al Infonavit (601.27), al SAR (601.28) e Impuesto sobre nómina (601.29) contra IMSS, SAR e Infonavit por pagar (211.01 a 211.03) e Impuesto sobre nómina por pagar (213.04). Los importes que mande reemplazan los calculados; employer_risk_premium se guarda para los meses siguientes. Al pagarlos, registre el retiro del banco contra esas cuentas. Sin recibos ni importes contesta parameter_invalid en month; en un mes cerrado, period_closed.
     * <p>
     * POST /v1/accounting/payroll_provisions/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/create-payroll-provision
     */
    public PayrollProvision create(String month, CreatePayrollProvisionParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/payroll_provisions/" + ApiClient.encode(month), params, null, true, PayrollProvision.class, options);
    }

    public PayrollProvision create(String month, CreatePayrollProvisionParams params) {
        return create(month, params, null);
    }

    public PayrollProvision create(String month) {
        return create(month, null, null);
    }

    /**
     * Quitar las cuotas patronales de un mes
     * <p>
     * Quita la póliza de provisión del mes. En un mes cerrado contesta period_closed.
     * <p>
     * DELETE /v1/accounting/payroll_provisions/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/delete-payroll-provision
     */
    public PayrollProvision delete(String month, DeletePayrollProvisionParams params, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/payroll_provisions/" + ApiClient.encode(month), null, params, false, PayrollProvision.class, options);
    }

    public PayrollProvision delete(String month, DeletePayrollProvisionParams params) {
        return delete(month, params, null);
    }

    public PayrollProvision delete(String month) {
        return delete(month, null, null);
    }
}
