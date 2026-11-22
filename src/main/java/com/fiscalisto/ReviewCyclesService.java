// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CalibrateReviewParams;
import com.fiscalisto.model.CreateReviewCycleParams;
import com.fiscalisto.model.ListReviewCyclesParams;
import com.fiscalisto.model.ReviewCycle;
import com.fiscalisto.model.ReviewCycleDeleted;
import com.fiscalisto.model.ReviewResult;
import com.fiscalisto.model.SetReviewParticipantsParams;
import com.fiscalisto.model.SetReviewPeersParams;
import com.fiscalisto.model.UpdateReviewCycleParams;

/**
 * Nómina: client.reviewCycles().
 */
public final class ReviewCyclesService {
    private final ApiClient api;

    ReviewCyclesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar ciclos de evaluación
     * <p>
     * Los ciclos de evaluación de desempeño del emisor (rvc_…), los más recientes primero, con cuántas personas y cuántas evaluaciones van enviadas.
     * <p>
     * GET /v1/review_cycles
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-review-cycles
     */
    public Page<ReviewCycle> list(ListReviewCyclesParams params, RequestOptions options) {
        return api.list("/v1/review_cycles", params, ReviewCycle.class, options);
    }

    public Page<ReviewCycle> list(ListReviewCyclesParams params) {
        return list(params, null);
    }

    public Page<ReviewCycle> list() {
        return list(null, null);
    }

    /** Listar ciclos de evaluación: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ReviewCycle> listAutoPaging(ListReviewCyclesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ReviewCycle> listAutoPaging(ListReviewCyclesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ReviewCycle> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Crear un ciclo de evaluación
     * <p>
     * Lo crea en borrador con todas las personas que trabajan hoy en el emisor, o en la sucursal o el departamento que diga. Ninguna ley pide evaluar el desempeño, así que la escala, quién evalúa, los pesos y las competencias los decide usted; lo que no manda toma los valores por omisión. Ábralo con POST /v1/review_cycles/{id}/open.
     * <p>
     * POST /v1/review_cycles
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-review-cycle
     */
    public ReviewCycle create(CreateReviewCycleParams params, RequestOptions options) {
        return api.request("POST", "/v1/review_cycles", params, null, true, ReviewCycle.class, options);
    }

    public ReviewCycle create(CreateReviewCycleParams params) {
        return create(params, null);
    }

    /**
     * Ver un ciclo de evaluación
     * <p>
     * El ciclo con sus reglas, competencias y cada persona: su jefe, quién la evalúa y si ya envió su evaluación (no qué contestó), sus objetivos y su resultado. Con el ciclo abierto el resultado se calcula con lo que va llegando; al cerrarlo queda guardado.
     * <p>
     * GET /v1/review_cycles/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-review-cycle
     */
    public ReviewCycle get(String id, RequestOptions options) {
        return api.request("GET", "/v1/review_cycles/" + ApiClient.encode(id), null, null, false, ReviewCycle.class, options);
    }

    public ReviewCycle get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar un ciclo de evaluación
     * <p>
     * En borrador cambia todo. Abierto, solo el nombre, el periodo, la fecha límite, compañeros por persona y share_results: la escala, las competencias y quién evalúa ya no cambian porque hay quien ya contestó con ellas. Cerrado ya no cambia.
     * <p>
     * POST /v1/review_cycles/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-review-cycle
     */
    public ReviewCycle update(String id, UpdateReviewCycleParams params, RequestOptions options) {
        return api.request("POST", "/v1/review_cycles/" + ApiClient.encode(id), params, null, true, ReviewCycle.class, options);
    }

    public ReviewCycle update(String id, UpdateReviewCycleParams params) {
        return update(id, params, null);
    }

    /**
     * Borrar un ciclo de evaluación
     * <p>
     * Lo borra con sus personas y objetivos si nadie ha enviado una evaluación. Con evaluaciones, ciérrelo.
     * <p>
     * DELETE /v1/review_cycles/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-review-cycle
     */
    public ReviewCycleDeleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/review_cycles/" + ApiClient.encode(id), null, null, false, ReviewCycleDeleted.class, options);
    }

    public ReviewCycleDeleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Abrir un ciclo de evaluación
     * <p>
     * Arma quién evalúa a quién: la persona misma, su jefe en el organigrama, sus compañeros (los elegidos o, si no, peers_count al azar entre quienes tienen el mismo jefe) y las personas a su cargo, según rules.raters. A cada evaluador le aparece en su portal lo que le toca, con el aviso review si lo tiene encendido.
     * <p>
     * POST /v1/review_cycles/{id}/open
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/open-review-cycle
     */
    public ReviewCycle open(String id, RequestOptions options) {
        return api.request("POST", "/v1/review_cycles/" + ApiClient.encode(id) + "/open", null, null, true, ReviewCycle.class, options);
    }

    public ReviewCycle open(String id) {
        return open(id, null);
    }

    /**
     * Cerrar un ciclo de evaluación
     * <p>
     * Deja de recibir evaluaciones y guarda el resultado de cada persona como quedó. Con share_results, cada persona lo ve en su portal.
     * <p>
     * POST /v1/review_cycles/{id}/close
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/close-review-cycle
     */
    public ReviewCycle close(String id, RequestOptions options) {
        return api.request("POST", "/v1/review_cycles/" + ApiClient.encode(id) + "/close", null, null, true, ReviewCycle.class, options);
    }

    public ReviewCycle close(String id) {
        return close(id, null);
    }

    /**
     * Elegir a quién se evalúa
     * <p>
     * En borrador: reemplaza la lista de personas del ciclo. Quien sale pierde sus objetivos en el ciclo.
     * <p>
     * POST /v1/review_cycles/{id}/participants
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/set-review-participants
     */
    public ReviewCycle setParticipants(String id, SetReviewParticipantsParams params, RequestOptions options) {
        return api.request("POST", "/v1/review_cycles/" + ApiClient.encode(id) + "/participants", params, null, true, ReviewCycle.class, options);
    }

    public ReviewCycle setParticipants(String id, SetReviewParticipantsParams params) {
        return setParticipants(id, params, null);
    }

    /**
     * Elegir los compañeros que evalúan a alguien
     * <p>
     * Los compañeros que evalúan a una persona. Con el ciclo abierto agrega las evaluaciones de los nuevos y quita las que no se han enviado de los que salen.
     * <p>
     * POST /v1/review_cycles/{id}/peers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/set-review-peers
     */
    public ReviewCycle setPeers(String id, SetReviewPeersParams params, RequestOptions options) {
        return api.request("POST", "/v1/review_cycles/" + ApiClient.encode(id) + "/peers", params, null, true, ReviewCycle.class, options);
    }

    public ReviewCycle setPeers(String id, SetReviewPeersParams params) {
        return setPeers(id, params, null);
    }

    /**
     * Calibrar el resultado de una persona
     * <p>
     * Con el ciclo abierto o cerrado: una calificación calibrada en lugar de la calculada (con la nota de por qué cambia) y su potencial para la matriz de 9 cuadros. Lo que no manda no cambia.
     * <p>
     * POST /v1/review_cycles/{id}/calibrations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/calibrate-review
     */
    public ReviewCycle calibrate(String id, CalibrateReviewParams params, RequestOptions options) {
        return api.request("POST", "/v1/review_cycles/" + ApiClient.encode(id) + "/calibrations", params, null, true, ReviewCycle.class, options);
    }

    public ReviewCycle calibrate(String id, CalibrateReviewParams params) {
        return calibrate(id, params, null);
    }

    /**
     * Ver el resultado de una persona
     * <p>
     * Su calificación por competencia y por tipo de evaluador, y los comentarios. Compañeros y personas a su cargo se promedian juntos y nunca llevan nombre; con menos respuestas que rules.anonymous_min no cuentan ni se muestran.
     * <p>
     * GET /v1/review_cycles/{id}/results/{employee}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-review-result
     */
    public ReviewResult result(String id, String employee, RequestOptions options) {
        return api.request("GET", "/v1/review_cycles/" + ApiClient.encode(id) + "/results/" + ApiClient.encode(employee), null, null, false, ReviewResult.class, options);
    }

    public ReviewResult result(String id, String employee) {
        return result(id, employee, null);
    }
}
