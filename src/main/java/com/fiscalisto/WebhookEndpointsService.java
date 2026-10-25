// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateWebhookEndpointParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListWebhookEndpointsParams;
import com.fiscalisto.model.RollWebhookSecretParams;
import com.fiscalisto.model.TestWebhookEndpointParams;
import com.fiscalisto.model.UpdateWebhookEndpointParams;
import com.fiscalisto.model.WebhookEndpoint;
import com.fiscalisto.model.WebhookTest;

/**
 * Webhooks: client.webhookEndpoints().
 */
public final class WebhookEndpointsService {
    private final ApiClient api;

    WebhookEndpointsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un webhook
     * <p>
     * La respuesta trae el secreto de firma (secret) una sola vez.
     * <p>
     * POST /v1/webhook_endpoints
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/webhooks/create-webhook-endpoint
     */
    public WebhookEndpoint create(CreateWebhookEndpointParams params, RequestOptions options) {
        return api.request("POST", "/v1/webhook_endpoints", params, null, true, WebhookEndpoint.class, options);
    }

    public WebhookEndpoint create(CreateWebhookEndpointParams params) {
        return create(params, null);
    }

    /**
     * Listar webhooks
     * <p>
     * GET /v1/webhook_endpoints
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/webhooks/list-webhook-endpoints
     */
    public Page<WebhookEndpoint> list(ListWebhookEndpointsParams params, RequestOptions options) {
        return api.list("/v1/webhook_endpoints", params, WebhookEndpoint.class, options);
    }

    public Page<WebhookEndpoint> list(ListWebhookEndpointsParams params) {
        return list(params, null);
    }

    public Page<WebhookEndpoint> list() {
        return list(null, null);
    }

    /** Listar webhooks: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<WebhookEndpoint> listAutoPaging(ListWebhookEndpointsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<WebhookEndpoint> listAutoPaging(ListWebhookEndpointsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<WebhookEndpoint> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un webhook
     * <p>
     * GET /v1/webhook_endpoints/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/webhooks/get-webhook-endpoint
     */
    public WebhookEndpoint get(String id, RequestOptions options) {
        return api.request("GET", "/v1/webhook_endpoints/" + ApiClient.encode(id), null, null, false, WebhookEndpoint.class, options);
    }

    public WebhookEndpoint get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar un webhook
     * <p>
     * POST /v1/webhook_endpoints/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/webhooks/update-webhook-endpoint
     */
    public WebhookEndpoint update(String id, UpdateWebhookEndpointParams params, RequestOptions options) {
        return api.request("POST", "/v1/webhook_endpoints/" + ApiClient.encode(id), params, null, true, WebhookEndpoint.class, options);
    }

    public WebhookEndpoint update(String id, UpdateWebhookEndpointParams params) {
        return update(id, params, null);
    }

    public WebhookEndpoint update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un webhook
     * <p>
     * DELETE /v1/webhook_endpoints/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/webhooks/delete-webhook-endpoint
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/webhook_endpoints/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Cambiar el secreto
     * <p>
     * Un secreto nuevo, que la respuesta trae una sola vez. El anterior sigue firmando (una segunda firma en webhook-signature) el tiempo que elija, 24 horas por omisión, para que cambie su servidor sin rechazar eventos. Si se filtró, mande previous_secret_expires_in: 0.
     * <p>
     * POST /v1/webhook_endpoints/{id}/roll_secret
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/webhooks/roll-webhook-secret
     */
    public WebhookEndpoint rollSecret(String id, RollWebhookSecretParams params, RequestOptions options) {
        return api.request("POST", "/v1/webhook_endpoints/" + ApiClient.encode(id) + "/roll_secret", params, null, true, WebhookEndpoint.class, options);
    }

    public WebhookEndpoint rollSecret(String id, RollWebhookSecretParams params) {
        return rollSecret(id, params, null);
    }

    public WebhookEndpoint rollSecret(String id) {
        return rollSecret(id, null, null);
    }

    /**
     * Mandar un evento de prueba
     * <p>
     * Manda ahora, una sola vez y sin reintentos, un evento del tipo que elija con un objeto de ejemplo (sus id no existen), firmado como los reales, aunque el webhook no escuche ese tipo. La respuesta trae lo que contestó su servidor. El evento no sale en GET /v1/events, pero sí en las entregas del webhook.
     * <p>
     * POST /v1/webhook_endpoints/{id}/test
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/webhooks/test-webhook-endpoint
     */
    public WebhookTest test(String id, TestWebhookEndpointParams params, RequestOptions options) {
        return api.request("POST", "/v1/webhook_endpoints/" + ApiClient.encode(id) + "/test", params, null, true, WebhookTest.class, options);
    }

    public WebhookTest test(String id, TestWebhookEndpointParams params) {
        return test(id, params, null);
    }

    public WebhookTest test(String id) {
        return test(id, null, null);
    }
}
