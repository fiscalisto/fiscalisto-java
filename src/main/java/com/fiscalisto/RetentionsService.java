// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CancelRetentionParams;
import com.fiscalisto.model.CreateRetentionParams;
import com.fiscalisto.model.GetRetentionParams;
import com.fiscalisto.model.GetRetentionPdfParams;
import com.fiscalisto.model.GetRetentionXmlParams;
import com.fiscalisto.model.ListRetentionsParams;
import com.fiscalisto.model.Retention;
import com.fiscalisto.model.SendRetentionParams;

/**
 * Retenciones: client.retentions().
 */
public final class RetentionsService {
    private final ApiClient api;

    RetentionsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Timbrar una constancia de retenciones
     * <p>
     * Timbra una constancia de retenciones e información de pagos (Retenciones 2.0) con los folios RET1, RET2… del emisor. Una vez por Idempotency-Key; con send_email y email la manda al receptor al timbrarla.
     * <p>
     * POST /v1/retentions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/retenciones/create-retention
     */
    public Retention create(CreateRetentionParams params, RequestOptions options) {
        return api.request("POST", "/v1/retentions", params, null, true, Retention.class, options);
    }

    public Retention create(CreateRetentionParams params) {
        return create(params, null);
    }

    /**
     * Listar constancias
     * <p>
     * Las constancias del emisor, las más recientes primero.
     * <p>
     * GET /v1/retentions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/retenciones/list-retentions
     */
    public Page<Retention> list(ListRetentionsParams params, RequestOptions options) {
        return api.list("/v1/retentions", params, Retention.class, options);
    }

    public Page<Retention> list(ListRetentionsParams params) {
        return list(params, null);
    }

    public Page<Retention> list() {
        return list(null, null);
    }

    /** Listar constancias: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Retention> listAutoPaging(ListRetentionsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Retention> listAutoPaging(ListRetentionsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Retention> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una constancia
     * <p>
     * Una constancia de retenciones con su estado, sus impuestos retenidos y, si se mandó, a quién.
     * <p>
     * GET /v1/retentions/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/retenciones/get-retention
     */
    public Retention get(String id, GetRetentionParams params, RequestOptions options) {
        return api.request("GET", "/v1/retentions/" + ApiClient.encode(id), null, params, false, Retention.class, options);
    }

    public Retention get(String id, GetRetentionParams params) {
        return get(id, params, null);
    }

    public Retention get(String id) {
        return get(id, null, null);
    }

    /**
     * Descargar el PDF
     * <p>
     * La representación impresa de la constancia.
     * <p>
     * GET /v1/retentions/{id}/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/retenciones/get-retention-pdf
     */
    public byte[] pdf(String id, GetRetentionPdfParams params, RequestOptions options) {
        return api.bytes("GET", "/v1/retentions/" + ApiClient.encode(id) + "/pdf", null, params, false, options);
    }

    public byte[] pdf(String id, GetRetentionPdfParams params) {
        return pdf(id, params, null);
    }

    public byte[] pdf(String id) {
        return pdf(id, null, null);
    }

    /**
     * Descargar el XML
     * <p>
     * El XML timbrado de la constancia, tal como lo tiene el SAT.
     * <p>
     * GET /v1/retentions/{id}/xml
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/retenciones/get-retention-xml
     */
    public String xml(String id, GetRetentionXmlParams params, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/retentions/" + ApiClient.encode(id) + "/xml", null, params, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String xml(String id, GetRetentionXmlParams params) {
        return xml(id, params, null);
    }

    public String xml(String id) {
        return xml(id, null, null);
    }

    /**
     * Enviar por correo
     * <p>
     * Manda el PDF y el XML de la constancia a los correos de to (o al que se dio al timbrarla). Dos envíos a la vez de la misma constancia: el segundo contesta email_failed.
     * <p>
     * POST /v1/retentions/{id}/send
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/retenciones/send-retention
     */
    public Retention send(String id, SendRetentionParams params, RequestOptions options) {
        return api.request("POST", "/v1/retentions/" + ApiClient.encode(id) + "/send", params, null, true, Retention.class, options);
    }

    public Retention send(String id, SendRetentionParams params) {
        return send(id, params, null);
    }

    public Retention send(String id) {
        return send(id, null, null);
    }

    /**
     * Cancelar una constancia
     * <p>
     * Se cancela en el momento (no espera aceptación). No usa timbres.
     * <p>
     * POST /v1/retentions/{id}/cancel
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/retenciones/cancel-retention
     */
    public Retention cancel(String id, CancelRetentionParams params, RequestOptions options) {
        return api.request("POST", "/v1/retentions/" + ApiClient.encode(id) + "/cancel", params, null, true, Retention.class, options);
    }

    public Retention cancel(String id, CancelRetentionParams params) {
        return cancel(id, params, null);
    }

    public Retention cancel(String id) {
        return cancel(id, null, null);
    }
}
