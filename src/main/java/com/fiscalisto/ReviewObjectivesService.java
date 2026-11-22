// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateReviewObjectiveParams;
import com.fiscalisto.model.ReviewObjective;
import com.fiscalisto.model.ReviewObjectiveDeleted;
import com.fiscalisto.model.UpdateReviewObjectiveParams;

/**
 * Nómina: client.reviewObjectives().
 */
public final class ReviewObjectivesService {
    private final ApiClient api;

    ReviewObjectivesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Agregar un objetivo
     * <p>
     * Un objetivo de una persona en un ciclo, con su meta, unidad y peso (hasta 20 por persona). Su jefe lo califica al evaluarla y la persona anota su avance en su portal. Ya no se agregan cuando el jefe la evaluó.
     * <p>
     * POST /v1/review_objectives
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-review-objective
     */
    public ReviewObjective create(CreateReviewObjectiveParams params, RequestOptions options) {
        return api.request("POST", "/v1/review_objectives", params, null, true, ReviewObjective.class, options);
    }

    public ReviewObjective create(CreateReviewObjectiveParams params) {
        return create(params, null);
    }

    /**
     * Cambiar un objetivo
     * <p>
     * Reemplaza el objetivo con lo que manda: lo que no manda queda vacío o con su valor por omisión.
     * <p>
     * POST /v1/review_objectives/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-review-objective
     */
    public ReviewObjective update(String id, UpdateReviewObjectiveParams params, RequestOptions options) {
        return api.request("POST", "/v1/review_objectives/" + ApiClient.encode(id), params, null, true, ReviewObjective.class, options);
    }

    public ReviewObjective update(String id, UpdateReviewObjectiveParams params) {
        return update(id, params, null);
    }

    /**
     * Borrar un objetivo
     * <p>
     * Lo borra, salvo que su jefe ya lo haya calificado.
     * <p>
     * DELETE /v1/review_objectives/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-review-objective
     */
    public ReviewObjectiveDeleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/review_objectives/" + ApiClient.encode(id), null, null, false, ReviewObjectiveDeleted.class, options);
    }

    public ReviewObjectiveDeleted delete(String id) {
        return delete(id, null);
    }
}
