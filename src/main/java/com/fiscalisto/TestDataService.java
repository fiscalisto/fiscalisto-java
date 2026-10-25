// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ResetTestDataParams;
import com.fiscalisto.model.TestDataReset;

/**
 * Cuenta: client.testData().
 */
public final class TestDataService {
    private final ApiClient api;

    TestDataService(ApiClient api) {
        this.api = api;
    }

    /**
     * Reiniciar los datos de prueba
     * <p>
     * Deja el modo de pruebas como nuevo: cada emisor de pruebas conserva su RFC y su CSD de pruebas pero pierde sus facturas, clientes, productos, lotes, ligas y descargas, y se borran los eventos y el registro de solicitudes de pruebas. Las llaves y los webhooks se quedan. Con seed (por omisión) deja 3 clientes y 3 productos de ejemplo. Solo con una llave fk_test_; producción nunca se toca.
     * <p>
     * POST /v1/test_data/reset
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cuenta/reset-test-data
     */
    public TestDataReset reset(ResetTestDataParams params, RequestOptions options) {
        return api.request("POST", "/v1/test_data/reset", params, null, true, TestDataReset.class, options);
    }

    public TestDataReset reset(ResetTestDataParams params) {
        return reset(params, null);
    }

    public TestDataReset reset() {
        return reset(null, null);
    }
}
