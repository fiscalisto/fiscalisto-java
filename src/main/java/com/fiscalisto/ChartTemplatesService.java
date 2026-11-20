// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ApplyChartTemplateParams;
import com.fiscalisto.model.ChartTemplateList;
import com.fiscalisto.model.ChartTemplateResult;
import com.fiscalisto.model.ListChartTemplatesParams;

/**
 * Contabilidad: client.chartTemplates().
 */
public final class ChartTemplatesService {
    private final ApiClient api;

    ChartTemplatesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar los catálogos por giro
     * <p>
     * Los catálogos por giro (comercio, restaurante, construcción, servicios profesionales, manufactura, transporte, arrendamiento, agropecuario) con las cuentas que agregaría cada uno a su catálogo y cuáles ya tiene.
     * <p>
     * GET /v1/accounting/chart_templates
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-chart-templates
     */
    public ChartTemplateList list(ListChartTemplatesParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/chart_templates", null, params, false, ChartTemplateList.class, options);
    }

    public ChartTemplateList list(ListChartTemplatesParams params) {
        return list(params, null);
    }

    public ChartTemplateList list() {
        return list(null, null);
    }

    /**
     * Agregar las cuentas de un giro
     * <p>
     * Agrega a su catálogo las cuentas del giro que faltan, cada una bajo su código agrupador. Un código que ya tiene cuenta la conserva y nada se borra ni se renombra, así que se puede llamar otra vez sin duplicar.
     * <p>
     * POST /v1/accounting/chart_templates/{id}/apply
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/apply-chart-template
     */
    public ChartTemplateResult apply(String id, ApplyChartTemplateParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/chart_templates/" + ApiClient.encode(id) + "/apply", params, null, true, ChartTemplateResult.class, options);
    }

    public ChartTemplateResult apply(String id, ApplyChartTemplateParams params) {
        return apply(id, params, null);
    }

    public ChartTemplateResult apply(String id) {
        return apply(id, null, null);
    }
}
