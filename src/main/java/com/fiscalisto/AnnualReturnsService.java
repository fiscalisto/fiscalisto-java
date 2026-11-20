// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AnnualReturn;
import com.fiscalisto.model.AnnualReturnCarryForward;
import com.fiscalisto.model.CarryForwardAnnualReturnParams;
import com.fiscalisto.model.GetAnnualReturnParams;
import com.fiscalisto.model.SaveAnnualReturnParams;

/**
 * Contabilidad: client.annualReturns().
 */
public final class AnnualReturnsService {
    private final ApiClient api;

    AnnualReturnsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Calcular la declaración anual de una persona moral
     * <p>
     * La declaración anual de una persona moral del régimen general (Título II de la Ley del ISR) desde su contabilidad: la conciliación contable-fiscal (items: partidas de los libros, de los CFDI, de la nómina, el ajuste anual por inflación, la deducción de inversiones y las capturadas), ingresos acumulables y deducciones autorizadas, utilidad o pérdida fiscal después de la PTU pagada (artículo 9), las pérdidas de ejercicios anteriores actualizadas y aplicadas (artículo 57), desde 2027 los límites de los artículos 78-A a 78-D, el resultado fiscal, el ISR del ejercicio menos pagos provisionales y retenciones (balance: positivo a cargo, negativo a favor), el coeficiente de utilidad para el año siguiente (artículo 14), la renta gravable de la PTU, la utilidad fiscal neta (artículo 77) y en tax_accounts la CUFIN y la CUCA con lo que cada dividendo o reembolso saca de ellas, el ISR del artículo 10 y el 10% a retener (artículo 140). Es un papel de trabajo para su contador, no la declaración presentada. Un emisor persona física, RESICO o no lucrativo contesta regime_not_applicable. Como Estados financieros › Declaración anual en la app.
     * <p>
     * GET /v1/accounting/annual_returns/{year}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-annual-return
     */
    public AnnualReturn get(String year, GetAnnualReturnParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/annual_returns/" + ApiClient.encode(year), null, params, false, AnnualReturn.class, options);
    }

    public AnnualReturn get(String year, GetAnnualReturnParams params) {
        return get(year, params, null);
    }

    public AnnualReturn get(String year) {
        return get(year, null, null);
    }

    /**
     * Capturar lo que los libros no dicen de la declaración anual
     * <p>
     * Reemplaza lo capturado para la declaración anual del año: las pérdidas pendientes por ejercicio (con el mes hasta el que están actualizadas), desde 2027 las deducciones pendientes del artículo 78-B, las partidas de la conciliación (como dividendos de personas morales mexicanas, ingreso no acumulable), si está en una excepción del artículo 78-E, el primer mes del ejercicio y, en tax_accounts, la CUFIN y la CUCA (saldos iniciales, dividendos pagados o recibidos, aportaciones y reembolsos; sin tax_accounts se quedan los guardados). Mande la lista completa: lo que no mande se quita. Una pérdida de este año o posterior, un mes de actualización anterior a su ejercicio o dos del mismo ejercicio contestan parameter_invalid. Contesta la declaración recalculada.
     * <p>
     * POST /v1/accounting/annual_returns/{year}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/save-annual-return
     */
    public AnnualReturn save(String year, SaveAnnualReturnParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/annual_returns/" + ApiClient.encode(year), params, null, true, AnnualReturn.class, options);
    }

    public AnnualReturn save(String year, SaveAnnualReturnParams params) {
        return save(year, params, null);
    }

    /**
     * Llevar las pérdidas que quedan al año siguiente
     * <p>
     * Pasa a lo capturado del año siguiente las pérdidas que quedan después de este año (con la de este año, si la hubo, actualizada al último mes del ejercicio) desde 2027 las deducciones pendientes del artículo 78-B, y los saldos de la CUFIN y la CUCA al 31 de diciembre con el ISR de dividendos por acreditar; reemplaza los que tuviera. Si los pagos provisionales del año siguiente no tienen pérdidas en Impuestos, les pone su total (artículo 14, fracción II). Las demás capturas del año siguiente se quedan.
     * <p>
     * POST /v1/accounting/annual_returns/{year}/carry_forward
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/carry-forward-annual-return
     */
    public AnnualReturnCarryForward carryForward(String year, CarryForwardAnnualReturnParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/annual_returns/" + ApiClient.encode(year) + "/carry_forward", params, null, true, AnnualReturnCarryForward.class, options);
    }

    public AnnualReturnCarryForward carryForward(String year, CarryForwardAnnualReturnParams params) {
        return carryForward(year, params, null);
    }

    public AnnualReturnCarryForward carryForward(String year) {
        return carryForward(year, null, null);
    }
}
