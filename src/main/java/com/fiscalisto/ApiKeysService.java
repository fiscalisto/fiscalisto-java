// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ApiKey;
import com.fiscalisto.model.CreateApiKeyParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListApiKeysParams;
import com.fiscalisto.model.RollApiKeyParams;
import com.fiscalisto.model.UpdateApiKeyParams;

/**
 * Llaves de API: client.apiKeys().
 */
public final class ApiKeysService {
    private final ApiClient api;

    ApiKeysService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear una llave
     * <p>
     * Una llave nueva con permisos por recurso, para dar a cada uno de sus clientes (o a cada servidor) la suya. La respuesta trae la llave completa (secret) una sola vez. Nunca tiene más que la llave que la crea: el mismo modo y entorno de prueba, en cada recurso como mucho su acceso, dentro de sus emisores y sus IP, y vence antes o al mismo tiempo. Una llave de producción solo la crea otra de producción. Hasta 30 por hora por cuenta.
     * <p>
     * POST /v1/api_keys
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/llaves-de-api/create-api-key
     */
    public ApiKey create(CreateApiKeyParams params, RequestOptions options) {
        return api.request("POST", "/v1/api_keys", params, null, true, ApiKey.class, options);
    }

    public ApiKey create(CreateApiKeyParams params) {
        return create(params, null);
    }

    /**
     * Listar llaves
     * <p>
     * Las llaves vigentes del modo que la llave puede manejar (las que no tienen más que ella), la más nueva primero. Sin el secreto. Hasta 50 por modo.
     * <p>
     * GET /v1/api_keys
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/llaves-de-api/list-api-keys
     */
    public Page<ApiKey> list(ListApiKeysParams params, RequestOptions options) {
        return api.list("/v1/api_keys", params, ApiKey.class, options);
    }

    public Page<ApiKey> list(ListApiKeysParams params) {
        return list(params, null);
    }

    public Page<ApiKey> list() {
        return list(null, null);
    }

    /** Listar llaves: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ApiKey> listAutoPaging(ListApiKeysParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ApiKey> listAutoPaging(ListApiKeysParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ApiKey> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una llave
     * <p>
     * Sus permisos, emisores, IP, vencimiento y último uso. El secreto solo viene al crearla o cambiarla.
     * <p>
     * GET /v1/api_keys/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/llaves-de-api/get-api-key
     */
    public ApiKey get(String id, RequestOptions options) {
        return api.request("GET", "/v1/api_keys/" + ApiClient.encode(id), null, null, false, ApiKey.class, options);
    }

    public ApiKey get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar una llave
     * <p>
     * Cambia su nombre, sus permisos, sus emisores o sus IP, con el mismo secreto. Solo cambia lo que mande, con los mismos límites que al crearla. Su vencimiento no se cambia.
     * <p>
     * POST /v1/api_keys/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/llaves-de-api/update-api-key
     */
    public ApiKey update(String id, UpdateApiKeyParams params, RequestOptions options) {
        return api.request("POST", "/v1/api_keys/" + ApiClient.encode(id), params, null, true, ApiKey.class, options);
    }

    public ApiKey update(String id, UpdateApiKeyParams params) {
        return update(id, params, null);
    }

    public ApiKey update(String id) {
        return update(id, null, null);
    }

    /**
     * Revocar una llave
     * <p>
     * Deja de funcionar en ese momento. No se puede deshacer.
     * <p>
     * DELETE /v1/api_keys/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/llaves-de-api/revoke-api-key
     */
    public Deleted revoke(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/api_keys/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted revoke(String id) {
        return revoke(id, null);
    }

    /**
     * Cambiar una llave
     * <p>
     * Una llave nueva con el mismo nombre, permisos, emisores, IP y duración, que la respuesta trae una sola vez. La anterior sigue funcionando el tiempo que elija (expires_in), 24 horas por omisión, para que la cambie sin cortar el servicio. Si se filtró, mande expires_in: 0.
     * <p>
     * POST /v1/api_keys/{id}/roll
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/llaves-de-api/roll-api-key
     */
    public ApiKey roll(String id, RollApiKeyParams params, RequestOptions options) {
        return api.request("POST", "/v1/api_keys/" + ApiClient.encode(id) + "/roll", params, null, true, ApiKey.class, options);
    }

    public ApiKey roll(String id, RollApiKeyParams params) {
        return roll(id, params, null);
    }

    public ApiKey roll(String id) {
        return roll(id, null, null);
    }
}
