// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CompanyReport;
import com.fiscalisto.model.GetCompanyReportParams;

/**
 * Cumplimiento SAT: client.companyReport().
 */
public final class CompanyReportService {
    private final ApiClient api;

    CompanyReportService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver el reporte de la empresa
     * <p>
     * Como Impuestos y SAT › Reporte de la empresa en la app: la salud fiscal del emisor en una calificación de 0 a 1,000 con la razón de cada factor, los indicadores de riesgo contra su umbral, los años lado a lado (ingresos, gastos, PUE y PPD, días de cobro y pago, margen), sus principales clientes y proveedores con su concentración (HHI), sus socios por los CFDI de retenciones por dividendos y los clientes y proveedores que publicaron su liquidación o fusión. Sale de lo que Fiscalisto ya tiene: no consulta al SAT y no usa timbres. Sin fechas, los últimos 12 meses.
     * <p>
     * GET /v1/company_report
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/get-company-report
     */
    public CompanyReport get(GetCompanyReportParams params, RequestOptions options) {
        return api.request("GET", "/v1/company_report", null, params, false, CompanyReport.class, options);
    }

    public CompanyReport get(GetCompanyReportParams params) {
        return get(params, null);
    }

    public CompanyReport get() {
        return get(null, null);
    }
}
