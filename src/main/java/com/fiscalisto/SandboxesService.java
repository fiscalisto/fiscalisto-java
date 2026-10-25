// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateSandboxParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.Sandbox;
import com.fiscalisto.model.SandboxList;

/**
 * Entornos de prueba: client.sandboxes().
 */
public final class SandboxesService {
    private final ApiClient api;

    SandboxesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un entorno de prueba
     * <p>
     * Un modo de pruebas propio para una persona o un proyecto: nace con el emisor de pruebas del SAT y una llave fk_test_ (key.secret, una sola vez) que solo ve los emisores, webhooks y eventos del entorno, y que reinicia solo los suyos. Se crea con una llave de pruebas de la cuenta (no de otro entorno ni limitada a emisores). Hasta 25 por cuenta.
     * <p>
     * POST /v1/sandboxes
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/entornos-de-prueba/create-sandbox
     */
    public Sandbox create(CreateSandboxParams params, RequestOptions options) {
        return api.request("POST", "/v1/sandboxes", params, null, true, Sandbox.class, options);
    }

    public Sandbox create(CreateSandboxParams params) {
        return create(params, null);
    }

    /**
     * Listar entornos de prueba
     * <p>
     * GET /v1/sandboxes
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/entornos-de-prueba/list-sandboxes
     */
    public SandboxList list(RequestOptions options) {
        return api.request("GET", "/v1/sandboxes", null, null, false, SandboxList.class, options);
    }

    public SandboxList list() {
        return list(null);
    }

    /**
     * Ver un entorno de prueba
     * <p>
     * GET /v1/sandboxes/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/entornos-de-prueba/get-sandbox
     */
    public Sandbox get(String id, RequestOptions options) {
        return api.request("GET", "/v1/sandboxes/" + ApiClient.encode(id), null, null, false, Sandbox.class, options);
    }

    public Sandbox get(String id) {
        return get(id, null);
    }

    /**
     * Borrar un entorno de prueba
     * <p>
     * Sus llaves dejan de funcionar al momento, sus emisores se archivan y sus webhooks se borran. No toca nada de la cuenta ni de otros entornos.
     * <p>
     * DELETE /v1/sandboxes/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/entornos-de-prueba/delete-sandbox
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/sandboxes/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
