// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateTrainingCourseParams;
import com.fiscalisto.model.DeliverTrainingCertificatesParams;
import com.fiscalisto.model.GetTrainingCertificatesPdfParams;
import com.fiscalisto.model.IssueTrainingCertificatesParams;
import com.fiscalisto.model.ListTrainingCoursesParams;
import com.fiscalisto.model.SetTrainingParticipantsParams;
import com.fiscalisto.model.SetTrainingResultsParams;
import com.fiscalisto.model.TrainingCourse;
import com.fiscalisto.model.TrainingCourseDeleted;
import com.fiscalisto.model.UpdateTrainingCourseParams;

/**
 * Nómina: client.trainingCourses().
 */
public final class TrainingCoursesService {
    private final ApiClient api;

    TrainingCoursesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar cursos de capacitación
     * <p>
     * Los cursos del emisor (trc_…), los más recientes primero, con cuántos lo tomaron, aprobaron, tienen su constancia y faltan por entregar (due) o ya pasaron los 20 días hábiles (late).
     * <p>
     * GET /v1/training_courses
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-training-courses
     */
    public Page<TrainingCourse> list(ListTrainingCoursesParams params, RequestOptions options) {
        return api.list("/v1/training_courses", params, TrainingCourse.class, options);
    }

    public Page<TrainingCourse> list(ListTrainingCoursesParams params) {
        return list(params, null);
    }

    public Page<TrainingCourse> list() {
        return list(null, null);
    }

    /** Listar cursos de capacitación: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<TrainingCourse> listAutoPaging(ListTrainingCoursesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<TrainingCourse> listAutoPaging(ListTrainingCoursesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<TrainingCourse> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Registrar un curso de capacitación
     * <p>
     * Lo que pide la constancia DC-3 (artículo 24, fracción IV): nombre, área temática del catálogo de la STPS, horas, periodo y quién lo imparte (con un instructor interno la constancia dice el nombre de la empresa como agente capacitador), con quiénes lo tomaron (employees).
     * <p>
     * POST /v1/training_courses
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-training-course
     */
    public TrainingCourse create(CreateTrainingCourseParams params, RequestOptions options) {
        return api.request("POST", "/v1/training_courses", params, null, true, TrainingCourse.class, options);
    }

    public TrainingCourse create(CreateTrainingCourseParams params) {
        return create(params, null);
    }

    /**
     * Ver un curso de capacitación
     * <p>
     * Un curso (trc_…) con quienes lo tomaron (trp_…): su resultado, el folio de su constancia, el día límite para entregarla (20 días hábiles desde el fin del curso, artículo 24, fracción III), si ya se entregó y, cuando todavía no se puede emitir, por qué (blocker).
     * <p>
     * GET /v1/training_courses/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-training-course
     */
    public TrainingCourse get(String id, RequestOptions options) {
        return api.request("GET", "/v1/training_courses/" + ApiClient.encode(id), null, null, false, TrainingCourse.class, options);
    }

    public TrainingCourse get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar un curso de capacitación
     * <p>
     * Cambia sus datos; employees reemplaza la lista (quien ya tiene su constancia se queda). Las constancias ya emitidas guardan lo que decían.
     * <p>
     * POST /v1/training_courses/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-training-course
     */
    public TrainingCourse update(String id, UpdateTrainingCourseParams params, RequestOptions options) {
        return api.request("POST", "/v1/training_courses/" + ApiClient.encode(id), params, null, true, TrainingCourse.class, options);
    }

    public TrainingCourse update(String id, UpdateTrainingCourseParams params) {
        return update(id, params, null);
    }

    /**
     * Borrar un curso de capacitación
     * <p>
     * Lo borra si nadie tiene su constancia; si alguien la tiene, lo cancela (canceled true), porque las copias se conservan a disposición de la STPS (artículo 26, fracción III).
     * <p>
     * DELETE /v1/training_courses/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-training-course
     */
    public TrainingCourseDeleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/training_courses/" + ApiClient.encode(id), null, null, false, TrainingCourseDeleted.class, options);
    }

    public TrainingCourseDeleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Quién tomó un curso
     * <p>
     * Reemplaza la lista de quienes lo tomaron (emp_…). Quien ya tiene su constancia se queda.
     * <p>
     * POST /v1/training_courses/{id}/participants
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/set-training-participants
     */
    public TrainingCourse setParticipants(String id, SetTrainingParticipantsParams params, RequestOptions options) {
        return api.request("POST", "/v1/training_courses/" + ApiClient.encode(id) + "/participants", params, null, true, TrainingCourse.class, options);
    }

    public TrainingCourse setParticipants(String id, SetTrainingParticipantsParams params) {
        return setParticipants(id, params, null);
    }

    /**
     * Calificar un curso
     * <p>
     * El resultado de cada quien: pending, passed, failed o sufficiency (aprobó el examen de suficiencia, artículo 24, fracción III, inciso b), con su calificación. A quien ya tiene su constancia no se le puede poner failed.
     * <p>
     * POST /v1/training_courses/{id}/results
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/set-training-results
     */
    public TrainingCourse setResults(String id, SetTrainingResultsParams params, RequestOptions options) {
        return api.request("POST", "/v1/training_courses/" + ApiClient.encode(id) + "/results", params, null, true, TrainingCourse.class, options);
    }

    public TrainingCourse setResults(String id, SetTrainingResultsParams params) {
        return setResults(id, params, null);
    }

    /**
     * Emitir constancias DC-3
     * <p>
     * Emite la constancia de quienes aprobaron (o de los que mande en employees), cada una con el folio siguiente del emisor. Pide que el curso haya terminado (salvo el examen de suficiencia), el CURP y la ocupación de cada quien y quién firma; lo que falte se lee en blocker de cada participante.
     * <p>
     * POST /v1/training_courses/{id}/issue
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/issue-training-certificates
     */
    public TrainingCourse issue(String id, IssueTrainingCertificatesParams params, RequestOptions options) {
        return api.request("POST", "/v1/training_courses/" + ApiClient.encode(id) + "/issue", params, null, true, TrainingCourse.class, options);
    }

    public TrainingCourse issue(String id, IssueTrainingCertificatesParams params) {
        return issue(id, params, null);
    }

    public TrainingCourse issue(String id) {
        return issue(id, null, null);
    }

    /**
     * Marcar constancias como entregadas
     * <p>
     * Anota que se entregaron (en papel, por correo o en el portal del empleado) y el día. Por omisión todas las emitidas sin entregar.
     * <p>
     * POST /v1/training_courses/{id}/deliver
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/deliver-training-certificates
     */
    public TrainingCourse deliver(String id, DeliverTrainingCertificatesParams params, RequestOptions options) {
        return api.request("POST", "/v1/training_courses/" + ApiClient.encode(id) + "/deliver", params, null, true, TrainingCourse.class, options);
    }

    public TrainingCourse deliver(String id, DeliverTrainingCertificatesParams params) {
        return deliver(id, params, null);
    }

    public TrainingCourse deliver(String id) {
        return deliver(id, null, null);
    }

    /**
     * Descargar constancias DC-3
     * <p>
     * Las constancias emitidas del curso en el formato DC-3 de la STPS, una página cada una con su reverso de catálogos, listas para firmar. El logo de la empresa va si lo tiene (artículo 25: solo logotipos).
     * <p>
     * GET /v1/training_courses/{id}/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-training-certificates-pdf
     */
    public byte[] pdf(String id, GetTrainingCertificatesPdfParams params, RequestOptions options) {
        return api.bytes("GET", "/v1/training_courses/" + ApiClient.encode(id) + "/pdf", null, params, false, options);
    }

    public byte[] pdf(String id, GetTrainingCertificatesPdfParams params) {
        return pdf(id, params, null);
    }

    public byte[] pdf(String id) {
        return pdf(id, null, null);
    }
}
