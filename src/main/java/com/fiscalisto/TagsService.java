// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateTagParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListTagsParams;
import com.fiscalisto.model.Tag;
import com.fiscalisto.model.UpdateTagParams;

/**
 * Etiquetas: client.tags().
 */
public final class TagsService {
    private final ApiClient api;

    TagsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear una etiqueta
     * <p>
     * Una palabra suya para juntar facturas y órdenes de compra: una obra, un evento, un cliente, «Urgente». Es la misma lista de Etiquetas en la app. Un nombre que ya existe (sin importar mayúsculas ni acentos) contesta tag_exists con su id. Hasta 200 por empresa.
     * <p>
     * POST /v1/tags
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/etiquetas/create-tag
     */
    public Tag create(CreateTagParams params, RequestOptions options) {
        return api.request("POST", "/v1/tags", params, null, true, Tag.class, options);
    }

    public Tag create(CreateTagParams params) {
        return create(params, null);
    }

    /**
     * Listar etiquetas
     * <p>
     * Las etiquetas del emisor, las más recientes primero, con cuántas órdenes de compra y facturas lleva cada una.
     * <p>
     * GET /v1/tags
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/etiquetas/list-tags
     */
    public Page<Tag> list(ListTagsParams params, RequestOptions options) {
        return api.list("/v1/tags", params, Tag.class, options);
    }

    public Page<Tag> list(ListTagsParams params) {
        return list(params, null);
    }

    public Page<Tag> list() {
        return list(null, null);
    }

    /** Listar etiquetas: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Tag> listAutoPaging(ListTagsParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Tag> listAutoPaging(ListTagsParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Tag> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una etiqueta
     * <p>
     * Una etiqueta del emisor.
     * <p>
     * GET /v1/tags/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/etiquetas/get-tag
     */
    public Tag get(String id, RequestOptions options) {
        return api.request("GET", "/v1/tags/" + ApiClient.encode(id), null, null, false, Tag.class, options);
    }

    public Tag get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar una etiqueta
     * <p>
     * Cambia su nombre o su color; se ve así en todas sus facturas y órdenes. Un nombre que ya tiene otra contesta tag_exists.
     * <p>
     * POST /v1/tags/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/etiquetas/update-tag
     */
    public Tag update(String id, UpdateTagParams params, RequestOptions options) {
        return api.request("POST", "/v1/tags/" + ApiClient.encode(id), params, null, true, Tag.class, options);
    }

    public Tag update(String id, UpdateTagParams params) {
        return update(id, params, null);
    }

    public Tag update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar una etiqueta
     * <p>
     * Se quita de sus facturas y órdenes de compra, que no cambian en nada más, y se borran sus etiquetas automáticas. No se puede deshacer.
     * <p>
     * DELETE /v1/tags/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/etiquetas/delete-tag
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/tags/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
