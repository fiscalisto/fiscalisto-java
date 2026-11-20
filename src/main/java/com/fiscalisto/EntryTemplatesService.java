// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ApplyEntryTemplateParams;
import com.fiscalisto.model.CreateEntryTemplateParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.EntryTemplate;
import com.fiscalisto.model.EntryTemplateLines;
import com.fiscalisto.model.EntryTemplateList;
import com.fiscalisto.model.ListEntryTemplatesParams;
import com.fiscalisto.model.UpdateEntryTemplateParams;

/**
 * Contabilidad: client.entryTemplates().
 */
public final class EntryTemplatesService {
    private final ApiClient api;

    EntryTemplatesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar las pólizas modelo
     * <p>
     * Las pólizas modelo del emisor, por nombre: las cuentas de una póliza que captura seguido con el porcentaje del total de cada renglón. Como «Usar un modelo» en Nueva póliza.
     * <p>
     * GET /v1/accounting/entry_templates
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-entry-templates
     */
    public EntryTemplateList list(ListEntryTemplatesParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/entry_templates", null, params, false, EntryTemplateList.class, options);
    }

    public EntryTemplateList list(ListEntryTemplatesParams params) {
        return list(params, null);
    }

    public EntryTemplateList list() {
        return list(null, null);
    }

    /**
     * Guardar una póliza modelo
     * <p>
     * Guarda las cuentas de una póliza bajo un nombre, cada renglón en su lado con el porcentaje del total (percentage), un importe fijo (amount) o ninguno, para escribirlo cada vez. Los porcentajes de un lado suman hasta 100. El nombre es único en el emisor.
     * <p>
     * POST /v1/accounting/entry_templates
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/create-entry-template
     */
    public EntryTemplate create(CreateEntryTemplateParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/entry_templates", params, null, true, EntryTemplate.class, options);
    }

    public EntryTemplate create(CreateEntryTemplateParams params) {
        return create(params, null);
    }

    /**
     * Cambiar una póliza modelo
     * <p>
     * La reemplaza con lo que manda. Las pólizas que ya se hicieron con ella no cambian.
     * <p>
     * POST /v1/accounting/entry_templates/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/update-entry-template
     */
    public EntryTemplate update(String id, UpdateEntryTemplateParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/entry_templates/" + ApiClient.encode(id), params, null, true, EntryTemplate.class, options);
    }

    public EntryTemplate update(String id, UpdateEntryTemplateParams params) {
        return update(id, params, null);
    }

    /**
     * Borrar una póliza modelo
     * <p>
     * Las pólizas que ya se hicieron con ella no cambian.
     * <p>
     * DELETE /v1/accounting/entry_templates/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/delete-entry-template
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/entry_templates/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Calcular los renglones de una póliza modelo
     * <p>
     * Los renglones de la póliza modelo para un total: cada porcentaje al centavo, los importes fijos como están y 0 donde no hay ninguno. El centavo del redondeo va al renglón más grande de un lado que suma 100%, para que cuadre. Mándelos como lines en POST /v1/accounting/manual_entries; aquí no se guarda nada.
     * <p>
     * POST /v1/accounting/entry_templates/{id}/apply
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/apply-entry-template
     */
    public EntryTemplateLines apply(String id, ApplyEntryTemplateParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/entry_templates/" + ApiClient.encode(id) + "/apply", params, null, true, EntryTemplateLines.class, options);
    }

    public EntryTemplateLines apply(String id, ApplyEntryTemplateParams params) {
        return apply(id, params, null);
    }
}
