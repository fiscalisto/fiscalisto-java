// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetPayrollTaxParams;
import com.fiscalisto.model.PayrollTax;
import com.fiscalisto.model.PayrollTaxSettings;
import com.fiscalisto.model.UpdatePayrollTaxSettingsParams;

/**
 * Nómina: client.payrollTaxes().
 */
public final class PayrollTaxesService {
    private final ApiClient api;

    PayrollTaxesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Impuesto sobre nómina del mes
     * <p>
     * El impuesto sobre nómina de cada estado: la suma de los recibos timbrados con fecha de pago en el mes, por el estado donde trabaja cada empleado (ClaveEntFed), menos las percepciones de excluded_perception_types, por la tasa del estado y sus sobretasas. Se declara y paga en el portal de finanzas de cada estado.
     * <p>
     * GET /v1/payroll_taxes
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-payroll-tax
     */
    public PayrollTax get(GetPayrollTaxParams params, RequestOptions options) {
        return api.request("GET", "/v1/payroll_taxes", null, params, false, PayrollTax.class, options);
    }

    public PayrollTax get(GetPayrollTaxParams params) {
        return get(params, null);
    }

    /**
     * Qué no grava el impuesto sobre nómina
     * <p>
     * Las percepciones que no suman a la base (por omisión, las que casi todos los estados dejan fuera: PTU, reembolsos, indemnizaciones, primas de antigüedad, jubilaciones, cuotas de seguridad social pagadas por el patrón y viáticos) y la opción de tasa de cada estado que la tiene, guardadas para el emisor. Lo que no mande se queda como estaba.
     * <p>
     * POST /v1/payroll_taxes/settings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-payroll-tax-settings
     */
    public PayrollTaxSettings updateSettings(UpdatePayrollTaxSettingsParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_taxes/settings", params, null, true, PayrollTaxSettings.class, options);
    }

    public PayrollTaxSettings updateSettings(UpdatePayrollTaxSettingsParams params) {
        return updateSettings(params, null);
    }

    public PayrollTaxSettings updateSettings() {
        return updateSettings(null, null);
    }
}
