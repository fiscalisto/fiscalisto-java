// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.BookDepreciationRate;
import com.fiscalisto.model.SaveBookDepreciationRateParams;

/**
 * Contabilidad: client.bookDepreciationRates().
 */
public final class BookDepreciationRatesService {
    private final ApiClient api;

    BookDepreciationRatesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Fijar la tasa de depreciación contable
     * <p>
     * Fija la tasa anual y el valor residual con que los libros deprecian un activo (fixed_asset) o todos los de un tipo (cfdi_use) desde from_month en adelante (NIF C-6); la del activo gana sobre la de su tipo. Los meses anteriores no cambian, y la deducción fiscal sigue con la tasa del artículo 34. annual_rate null quita la de ese mes. Un mes cerrado contesta parameter_invalid en from_month.
     * <p>
     * POST /v1/accounting/book_depreciation_rates
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/save-book-depreciation-rate
     */
    public BookDepreciationRate save(SaveBookDepreciationRateParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/book_depreciation_rates", params, null, true, BookDepreciationRate.class, options);
    }

    public BookDepreciationRate save(SaveBookDepreciationRateParams params) {
        return save(params, null);
    }
}
