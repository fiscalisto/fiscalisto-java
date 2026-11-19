// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateTaxDeterminationParams;
import com.fiscalisto.model.DeleteTaxDeterminationParams;
import com.fiscalisto.model.GetTaxDeterminationParams;
import com.fiscalisto.model.TaxDetermination;

/**
 * Contabilidad: client.taxDeterminations().
 */
public final class TaxDeterminationsService {
    private final ApiClient api;

    TaxDeterminationsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver la determinación de impuestos de un mes
     * <p>
     * El IVA cobrado y pagado del mes según sus pólizas (y el que le retuvieron sus clientes), el IVA por pagar o a favor que resulta, el pago provisional de ISR que sugiere Impuestos y la póliza de determinación, si ya se registró. Como Cierre del mes › Impuestos del mes en la app.
     * <p>
     * GET /v1/accounting/tax_determinations/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-tax-determination
     */
    public TaxDetermination get(String month, GetTaxDeterminationParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/tax_determinations/" + ApiClient.encode(month), null, params, false, TaxDetermination.class, options);
    }

    public TaxDetermination get(String month, GetTaxDeterminationParams params) {
        return get(month, params, null);
    }

    public TaxDetermination get(String month) {
        return get(month, null, null);
    }

    /**
     * Registrar la determinación de impuestos de un mes
     * <p>
     * Registra (o reemplaza) la póliza del último día del mes: IVA trasladado cobrado contra IVA acreditable pagado y el IVA retenido por clientes, la diferencia a IVA por pagar o IVA a favor, e isr a Pagos provisionales de ISR contra ISR por pagar. Al pagarlos, registre el retiro del banco contra esas cuentas (POST /v1/accounting/bank_movements/{id}/post). Sin IVA ni ISR contesta parameter_invalid en month; en un mes cerrado, period_closed.
     * <p>
     * POST /v1/accounting/tax_determinations/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/create-tax-determination
     */
    public TaxDetermination create(String month, CreateTaxDeterminationParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/tax_determinations/" + ApiClient.encode(month), params, null, true, TaxDetermination.class, options);
    }

    public TaxDetermination create(String month, CreateTaxDeterminationParams params) {
        return create(month, params, null);
    }

    /**
     * Quitar la determinación de impuestos de un mes
     * <p>
     * Quita la póliza de determinación del mes. En un mes cerrado contesta period_closed.
     * <p>
     * DELETE /v1/accounting/tax_determinations/{month}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/delete-tax-determination
     */
    public TaxDetermination delete(String month, DeleteTaxDeterminationParams params, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/tax_determinations/" + ApiClient.encode(month), null, params, false, TaxDetermination.class, options);
    }

    public TaxDetermination delete(String month, DeleteTaxDeterminationParams params) {
        return delete(month, params, null);
    }

    public TaxDetermination delete(String month) {
        return delete(month, null, null);
    }
}
