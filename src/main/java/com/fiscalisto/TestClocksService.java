// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AdvanceTestClockParams;
import com.fiscalisto.model.CreateTestClockParams;
import com.fiscalisto.model.TestClock;

/**
 * Entornos de prueba: client.testClocks().
 */
public final class TestClocksService {
    private final ApiClient api;

    TestClocksService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un reloj de prueba
     * <p>
     * Le da a un emisor de pruebas su propia hora, congelada en frozen_time (ahora, si no la manda): sus facturas recurrentes, cotizaciones, cuentas por cobrar y tickets cuentan los días con ella, y nada de eso corre solo hasta que usted lo adelanta. Para ver en segundos lo que pasa en meses. Solo emisores de prueba; uno por emisor.
     * <p>
     * POST /v1/issuers/{id}/test_clock
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/entornos-de-prueba/create-test-clock
     */
    public TestClock create(String id, CreateTestClockParams params, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/test_clock", params, null, true, TestClock.class, options);
    }

    public TestClock create(String id, CreateTestClockParams params) {
        return create(id, params, null);
    }

    public TestClock create(String id) {
        return create(id, null, null);
    }

    /**
     * Ver el reloj de prueba
     * <p>
     * La hora que es «hoy» para un emisor de prueba y hasta dónde se ha adelantado. Solo emisores de prueba.
     * <p>
     * GET /v1/issuers/{id}/test_clock
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/entornos-de-prueba/get-test-clock
     */
    public TestClock get(String id, RequestOptions options) {
        return api.request("GET", "/v1/issuers/" + ApiClient.encode(id) + "/test_clock", null, null, false, TestClock.class, options);
    }

    public TestClock get(String id) {
        return get(id, null);
    }

    /**
     * Borrar el reloj de prueba
     * <p>
     * El emisor vuelve a la hora real; lo que el reloj dejó pendiente lo hacen los procesos diarios.
     * <p>
     * DELETE /v1/issuers/{id}/test_clock
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/entornos-de-prueba/delete-test-clock
     */
    public TestClock delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/issuers/" + ApiClient.encode(id) + "/test_clock", null, null, false, TestClock.class, options);
    }

    public TestClock delete(String id) {
        return delete(id, null);
    }

    /**
     * Adelantar el reloj de prueba
     * <p>
     * Mueve el reloj hasta frozen_time haciendo, día por día, lo que habría pasado: timbra las facturas recurrentes de cada periodo, vence las cotizaciones y hace las facturas globales de tickets, con sus eventos. Contesta cuando terminó, con lo que hizo en advanced, y llega test_clock.ready. Hasta 25 comprobantes por solicitud: si se detiene antes, stopped_early y otra llamada sigue. Los CFDI se timbran con la fecha real (el SAT solo acepta la de hoy); el periodo, los vencimientos y los eventos siguen al reloj.
     * <p>
     * POST /v1/issuers/{id}/test_clock/advance
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/entornos-de-prueba/advance-test-clock
     */
    public TestClock advance(String id, AdvanceTestClockParams params, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/test_clock/advance", params, null, true, TestClock.class, options);
    }

    public TestClock advance(String id, AdvanceTestClockParams params) {
        return advance(id, params, null);
    }
}
