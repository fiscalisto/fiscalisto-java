// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.PriceQuote;
import com.fiscalisto.model.QuotePricesParams;

/**
 * Listas de precios: client.prices().
 */
public final class PricesService {
    private final ApiClient api;

    PricesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver los precios de un cliente
     * <p>
     * Lo que un cliente paga por unos productos a una cantidad: el precio por unidad sin IVA de su lista (la suya, la de su grupo o la de todos), su descuento y el siguiente escalón de mayoreo. No guarda nada.
     * <p>
     * POST /v1/prices
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/listas-de-precios/quote-prices
     */
    public PriceQuote quote(QuotePricesParams params, RequestOptions options) {
        return api.request("POST", "/v1/prices", params, null, true, PriceQuote.class, options);
    }

    public PriceQuote quote(QuotePricesParams params) {
        return quote(params, null);
    }
}
