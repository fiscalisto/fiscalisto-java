// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.Candidate;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.HireCandidateParams;
import com.fiscalisto.model.ListCandidatesParams;
import com.fiscalisto.model.UpdateCandidateParams;

/**
 * Nómina: client.candidates().
 */
public final class CandidatesService {
    private final ApiClient api;

    CandidatesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar candidatos
     * <p>
     * Las solicitudes que llegaron por la página de empleos, las más recientes primero, con sus respuestas, su etapa y los requisitos que no cumple.
     * <p>
     * GET /v1/candidates
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-candidates
     */
    public Page<Candidate> list(ListCandidatesParams params, RequestOptions options) {
        return api.list("/v1/candidates", params, Candidate.class, options);
    }

    public Page<Candidate> list(ListCandidatesParams params) {
        return list(params, null);
    }

    public Page<Candidate> list() {
        return list(null, null);
    }

    /** Listar candidatos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Candidate> listAutoPaging(ListCandidatesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Candidate> listAutoPaging(ListCandidatesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Candidate> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un candidato
     * <p>
     * Una solicitud (cnd_…), con las preguntas que contestó y sus archivos.
     * <p>
     * GET /v1/candidates/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-candidate
     */
    public Candidate get(String id, RequestOptions options) {
        return api.request("GET", "/v1/candidates/" + ApiClient.encode(id), null, null, false, Candidate.class, options);
    }

    public Candidate get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar un candidato
     * <p>
     * Lo pasa a otra etapa, lo califica (1 a 5) o le pone una nota de su equipo. Lo que no manda no cambia.
     * <p>
     * POST /v1/candidates/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-candidate
     */
    public Candidate update(String id, UpdateCandidateParams params, RequestOptions options) {
        return api.request("POST", "/v1/candidates/" + ApiClient.encode(id), params, null, true, Candidate.class, options);
    }

    public Candidate update(String id, UpdateCandidateParams params) {
        return update(id, params, null);
    }

    public Candidate update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un candidato
     * <p>
     * Borra la solicitud y sus archivos, por ejemplo cuando el candidato lo pide (derechos ARCO). No se puede deshacer.
     * <p>
     * DELETE /v1/candidates/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-candidate
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/candidates/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Contratar a un candidato
     * <p>
     * Con el empleado ya dado de alta (POST /v1/employees), cubre la vacante de la solicitud (como POST /v1/payroll_org_chart/vacancies/{id}/fill), pasa al candidato a la etapa de contratados y quita la vacante de la página. Falta su alta en el IMSS.
     * <p>
     * POST /v1/candidates/{id}/hire
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/hire-candidate
     */
    public Candidate hire(String id, HireCandidateParams params, RequestOptions options) {
        return api.request("POST", "/v1/candidates/" + ApiClient.encode(id) + "/hire", params, null, true, Candidate.class, options);
    }

    public Candidate hire(String id, HireCandidateParams params) {
        return hire(id, params, null);
    }

    /**
     * Descargar un archivo de un candidato
     * <p>
     * El archivo que subió a una pregunta de tipo file (su CV, por ejemplo), tal como lo subió: PDF, JPG, PNG o Word. answers[].file.url de candidate lleva esta ruta.
     * <p>
     * GET /v1/candidates/{id}/files/{question}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-candidate-file
     */
    public String file(String id, String question, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/candidates/" + ApiClient.encode(id) + "/files/" + ApiClient.encode(question), null, null, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String file(String id, String question) {
        return file(id, question, null);
    }
}
