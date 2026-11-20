// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateSatReviewParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListSatReviewsParams;
import com.fiscalisto.model.SatReview;
import com.fiscalisto.model.SatReviewList;
import com.fiscalisto.model.UpdateSatReviewParams;

/**
 * Cumplimiento SAT: client.satReviews().
 */
public final class SatReviewsService {
    private final ApiClient api;

    SatReviewsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Registrar una revisión del SAT
     * <p>
     * Como «Registrar oficio» en Revisiones del SAT: una carta invitación, requerimiento u oficio que el SAT mandó al RFC del emisor, con la fecha en que se lo notificaron. Fiscalisto calcula el plazo en días hábiles desde que surte efectos la notificación (sin sábados, domingos ni los inhábiles del SAT) y avisa por correo 5, 3 y 1 día hábil antes. Sin requests, lleva lo que el SAT suele pedir en ese tipo. No responde nada al SAT. No usa timbres.
     * <p>
     * POST /v1/sat_reviews
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/create-sat-review
     */
    public SatReview create(CreateSatReviewParams params, RequestOptions options) {
        return api.request("POST", "/v1/sat_reviews", params, null, true, SatReview.class, options);
    }

    public SatReview create(CreateSatReviewParams params) {
        return create(params, null);
    }

    /**
     * Listar revisiones del SAT
     * <p>
     * Las revisiones del RFC del emisor, primero las que siguen abiertas, después las más recientes, cada una con su plazo y lo que pide. Una página, hasta 500.
     * <p>
     * GET /v1/sat_reviews
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/list-sat-reviews
     */
    public SatReviewList list(ListSatReviewsParams params, RequestOptions options) {
        return api.request("GET", "/v1/sat_reviews", null, params, false, SatReviewList.class, options);
    }

    public SatReviewList list(ListSatReviewsParams params) {
        return list(params, null);
    }

    public SatReviewList list() {
        return list(null, null);
    }

    /**
     * Ver una revisión del SAT
     * <p>
     * Una revisión con cada oficio y su plazo, lo que pide con cuánto de eso tiene Fiscalisto (ready de total) y su última respuesta armada.
     * <p>
     * GET /v1/sat_reviews/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/get-sat-review
     */
    public SatReview get(String id, RequestOptions options) {
        return api.request("GET", "/v1/sat_reviews/" + ApiClient.encode(id), null, null, false, SatReview.class, options);
    }

    public SatReview get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar una revisión del SAT
     * <p>
     * Cambia solo lo que manda. notices y requests reemplazan la lista: mande todos sus oficios (con answered_on en el que ya respondió) y todo lo que pide (con done en lo que ya tiene).
     * <p>
     * POST /v1/sat_reviews/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/update-sat-review
     */
    public SatReview update(String id, UpdateSatReviewParams params, RequestOptions options) {
        return api.request("POST", "/v1/sat_reviews/" + ApiClient.encode(id), params, null, true, SatReview.class, options);
    }

    public SatReview update(String id, UpdateSatReviewParams params) {
        return update(id, params, null);
    }

    public SatReview update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar una revisión del SAT
     * <p>
     * Borra de Fiscalisto el seguimiento, sus avisos y los enlaces de sus asesores; su trámite en el SAT sigue igual. No se puede deshacer.
     * <p>
     * DELETE /v1/sat_reviews/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/delete-sat-review
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/sat_reviews/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Armar la respuesta
     * <p>
     * Como «Armar respuesta»: arma en segundo plano un ZIP con lo que la revisión pide: los XML y la relación de CFDI del periodo, el papel de trabajo, la contabilidad electrónica con el número de orden, las declaraciones, los documentos subidos en la app y un índice de qué archivo responde a cada cosa. Contesta la revisión con answer.status processing; consulte GET /v1/sat_reviews/{id} hasta que sea completed y descárguelo con GET /v1/sat_reviews/{id}/answer. Una a la vez (answer_running). No usa timbres.
     * <p>
     * POST /v1/sat_reviews/{id}/answer
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/arm-sat-review-answer
     */
    public SatReview armAnswer(String id, RequestOptions options) {
        return api.request("POST", "/v1/sat_reviews/" + ApiClient.encode(id) + "/answer", null, null, true, SatReview.class, options);
    }

    public SatReview armAnswer(String id) {
        return armAnswer(id, null);
    }

    /**
     * Descargar la respuesta
     * <p>
     * El ZIP de la última respuesta armada, cuando answer.status es completed (si no, answer_not_ready). Se guarda 30 días.
     * <p>
     * GET /v1/sat_reviews/{id}/answer
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/download-sat-review-answer
     */
    public String downloadAnswer(String id, RequestOptions options) {
        return new String(api.bytes("GET", "/v1/sat_reviews/" + ApiClient.encode(id) + "/answer", null, null, false, options), java.nio.charset.StandardCharsets.UTF_8);
    }

    public String downloadAnswer(String id) {
        return downloadAnswer(id, null);
    }
}
