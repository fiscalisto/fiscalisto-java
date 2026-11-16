// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AdjustCashForecastParams;
import com.fiscalisto.model.CashForecast;
import com.fiscalisto.model.CashForecastItem;
import com.fiscalisto.model.CreateCashForecastItemParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.GetCashForecastParams;
import com.fiscalisto.model.UpdateCashForecastItemParams;
import com.fiscalisto.model.UpdateCashForecastParams;

/**
 * Flujo de efectivo: client.cashForecast().
 */
public final class CashForecastService {
    private final ApiClient api;

    CashForecastService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver el flujo de efectivo
     * <p>
     * Las próximas 13 semanas del emisor, como «Flujo de efectivo» en la app: lo que le deben, con lo que cada cliente suele tardar en pagar; lo que debe a proveedores; la nómina; las declaraciones mensuales; las facturas recurrentes y sus movimientos previstos, desde el saldo que dio. Trae avisos con lo que puede hacer, y con los parámetros, un escenario (no se guarda). Una estimación: nada cambia solo.
     * <p>
     * GET /v1/cash_forecast
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/flujo-de-efectivo/get-cash-forecast
     */
    public CashForecast get(GetCashForecastParams params, RequestOptions options) {
        return api.request("GET", "/v1/cash_forecast", null, params, false, CashForecast.class, options);
    }

    public CashForecast get(GetCashForecastParams params) {
        return get(params, null);
    }

    public CashForecast get() {
        return get(null, null);
    }

    /**
     * Dar el saldo de hoy
     * <p>
     * El saldo de hoy en sus cuentas de banco (de donde parte el flujo) y lo menos que quiere tener. Solo lo que mande cambia. Responde el flujo con el saldo nuevo.
     * <p>
     * POST /v1/cash_forecast
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/flujo-de-efectivo/update-cash-forecast
     */
    public CashForecast update(UpdateCashForecastParams params, RequestOptions options) {
        return api.request("POST", "/v1/cash_forecast", params, null, true, CashForecast.class, options);
    }

    public CashForecast update(UpdateCashForecastParams params) {
        return update(params, null);
    }

    public CashForecast update() {
        return update(null, null);
    }

    /**
     * Agregar un movimiento previsto
     * <p>
     * Algo que espera pagar o cobrar y que ninguna factura dice: una renta, un crédito, una venta de contado. Una vez o cada semana, dos semanas o mes. Hasta 200.
     * <p>
     * POST /v1/cash_forecast/planned_items
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/flujo-de-efectivo/create-cash-forecast-item
     */
    public CashForecastItem createItem(CreateCashForecastItemParams params, RequestOptions options) {
        return api.request("POST", "/v1/cash_forecast/planned_items", params, null, true, CashForecastItem.class, options);
    }

    public CashForecastItem createItem(CreateCashForecastItemParams params) {
        return createItem(params, null);
    }

    /**
     * Cambiar un movimiento previsto
     * <p>
     * Solo lo que mande cambia.
     * <p>
     * POST /v1/cash_forecast/planned_items/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/flujo-de-efectivo/update-cash-forecast-item
     */
    public CashForecastItem updateItem(String id, UpdateCashForecastItemParams params, RequestOptions options) {
        return api.request("POST", "/v1/cash_forecast/planned_items/" + ApiClient.encode(id), params, null, true, CashForecastItem.class, options);
    }

    public CashForecastItem updateItem(String id, UpdateCashForecastItemParams params) {
        return updateItem(id, params, null);
    }

    public CashForecastItem updateItem(String id) {
        return updateItem(id, null, null);
    }

    /**
     * Borrar un movimiento previsto
     * <p>
     * Ya no cuenta en el flujo.
     * <p>
     * DELETE /v1/cash_forecast/planned_items/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/flujo-de-efectivo/delete-cash-forecast-item
     */
    public Deleted deleteItem(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/cash_forecast/planned_items/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted deleteItem(String id) {
        return deleteItem(id, null);
    }

    /**
     * Cambiar un renglón del flujo
     * <p>
     * Otro día o monto para un renglón (lines[].line), o no contarlo: un cliente le avisó que paga después, o una factura ya se pagó por fuera. Solo cambia el pronóstico, nunca la factura. reset: true lo regresa a lo estimado. Responde el flujo con el cambio.
     * <p>
     * POST /v1/cash_forecast/adjustments
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/flujo-de-efectivo/adjust-cash-forecast
     */
    public CashForecast adjust(AdjustCashForecastParams params, RequestOptions options) {
        return api.request("POST", "/v1/cash_forecast/adjustments", params, null, true, CashForecast.class, options);
    }

    public CashForecast adjust(AdjustCashForecastParams params) {
        return adjust(params, null);
    }
}
