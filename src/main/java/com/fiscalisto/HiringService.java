// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateJobFormParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.GetHiringParams;
import com.fiscalisto.model.Hiring;
import com.fiscalisto.model.JobForm;
import com.fiscalisto.model.UpdateHiringSettingsParams;
import com.fiscalisto.model.UpdateJobFormParams;

/**
 * Nómina: client.hiring().
 */
public final class HiringService {
    private final ApiClient api;

    HiringService(ApiClient api) {
        this.api = api;
    }

    /**
     * Página de empleos
     * <p>
     * Como «Nómina › Empleos» de la app: la página de empleos del emisor (careers_url, si se ve, su texto, el correo de contacto), las etapas de sus candidatos, qué hacer con quien no cumple un requisito, sus formularios (jbf_…) y sus vacantes con lo que publican y cuántos candidatos hay en cada etapa.
     * <p>
     * GET /v1/hiring
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-hiring
     */
    public Hiring get(GetHiringParams params, RequestOptions options) {
        return api.request("GET", "/v1/hiring", null, params, false, Hiring.class, options);
    }

    public Hiring get(GetHiringParams params) {
        return get(params, null);
    }

    public Hiring get() {
        return get(null, null);
    }

    /**
     * Configurar la página de empleos
     * <p>
     * Enciende o apaga la página, cambia su texto y correo de contacto, las etapas de los candidatos (al menos dos; la primera es donde llegan), unmet_requirements y el formulario predeterminado. Lo que no manda no cambia. Contesta hiring.
     * <p>
     * POST /v1/hiring/settings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-hiring-settings
     */
    public Hiring updateSettings(UpdateHiringSettingsParams params, RequestOptions options) {
        return api.request("POST", "/v1/hiring/settings", params, null, true, Hiring.class, options);
    }

    public Hiring updateSettings(UpdateHiringSettingsParams params) {
        return updateSettings(params, null);
    }

    public Hiring updateSettings() {
        return updateSettings(null, null);
    }

    /**
     * Crear un formulario de solicitud
     * <p>
     * Las preguntas que llena quien se postula, del tipo que sea (texto, párrafo, número, fecha, lista, varias opciones, sí o no, correo, teléfono, enlace o archivo), obligatorias u opcionales, con sus reglas y las que son requisito. nombre y correo van siempre. Una pregunta que la Ley Federal del Trabajo no deja pedir (art. 133: edad, género, estado civil, embarazo…) se guarda, pero la app la señala.
     * <p>
     * POST /v1/hiring/forms
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-job-form
     */
    public JobForm createForm(CreateJobFormParams params, RequestOptions options) {
        return api.request("POST", "/v1/hiring/forms", params, null, true, JobForm.class, options);
    }

    public JobForm createForm(CreateJobFormParams params) {
        return createForm(params, null);
    }

    /**
     * Cambiar un formulario de solicitud
     * <p>
     * Cambia su nombre y sus preguntas. Las solicitudes que ya llegaron conservan las preguntas que contestaron.
     * <p>
     * POST /v1/hiring/forms/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-job-form
     */
    public JobForm updateForm(String id, UpdateJobFormParams params, RequestOptions options) {
        return api.request("POST", "/v1/hiring/forms/" + ApiClient.encode(id), params, null, true, JobForm.class, options);
    }

    public JobForm updateForm(String id, UpdateJobFormParams params) {
        return updateForm(id, params, null);
    }

    /**
     * Archivar un formulario de solicitud
     * <p>
     * Deja de usarse: sus vacantes piden el predeterminado desde ahora. Las solicitudes que ya llegaron no cambian.
     * <p>
     * DELETE /v1/hiring/forms/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-job-form
     */
    public Deleted deleteForm(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/hiring/forms/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted deleteForm(String id) {
        return deleteForm(id, null);
    }
}
