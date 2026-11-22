// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ClimateSurvey;
import com.fiscalisto.model.ClimateSurveyDeleted;
import com.fiscalisto.model.ClimateTraumaticEvent;
import com.fiscalisto.model.ClimateTraumaticEventList;
import com.fiscalisto.model.CreateClimateSurveyParams;
import com.fiscalisto.model.ListClimateSurveysParams;
import com.fiscalisto.model.ReferClimateTraumaticEventParams;
import com.fiscalisto.model.UpdateClimateSurveyParams;
import com.fiscalisto.model.UpdateClimateSurveyReportParams;

/**
 * Nómina: client.climateSurveys().
 */
public final class ClimateSurveysService {
    private final ApiClient api;

    ClimateSurveysService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar encuestas de clima laboral
     * <p>
     * Las encuestas NOM-035 y de clima del emisor (cls_…), las más recientes primero, con a cuántos se les pidió y cuántos contestaron.
     * <p>
     * GET /v1/climate_surveys
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-climate-surveys
     */
    public Page<ClimateSurvey> list(ListClimateSurveysParams params, RequestOptions options) {
        return api.list("/v1/climate_surveys", params, ClimateSurvey.class, options);
    }

    public Page<ClimateSurvey> list(ListClimateSurveysParams params) {
        return list(params, null);
    }

    public Page<ClimateSurvey> list() {
        return list(null, null);
    }

    /** Listar encuestas de clima laboral: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ClimateSurvey> listAutoPaging(ListClimateSurveysParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ClimateSurvey> listAutoPaging(ListClimateSurveysParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ClimateSurvey> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Crear una encuesta de clima laboral
     * <p>
     * kind nom035 aplica la guía que le toca al centro de trabajo por cuántos trabajan ahí hoy: la Guía II de 16 a 50 y la Guía III con más de 50 (numeral 7.1), y la Guía I para identificar a quien vivió un acontecimiento traumático severo (numeral 5.5). Un centro tiene una sola encuesta NOM-035 abierta a la vez. kind clima es una encuesta propia con sus preguntas (scale, nps para el eNPS, choice o text). Queda en borrador salvo con open true. Las respuestas llegan solo desde el portal del empleado y nunca con nombre.
     * <p>
     * POST /v1/climate_surveys
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-climate-survey
     */
    public ClimateSurvey create(CreateClimateSurveyParams params, RequestOptions options) {
        return api.request("POST", "/v1/climate_surveys", params, null, true, ClimateSurvey.class, options);
    }

    public ClimateSurvey create(CreateClimateSurveyParams params) {
        return create(params, null);
    }

    /**
     * Ver una encuesta de clima laboral
     * <p>
     * La encuesta con sus resultados: con la NOM-035, la calificación final y la de cada categoría y dominio con su nivel de riesgo según las tablas de la norma, y si pide un Programa de intervención (de medio para arriba, numeral 8.3); con la de clima, cada pregunta y el eNPS. Los resultados se muestran desde 5 respuestas (hidden true antes), y los departamentos con menos se dejan fuera, para que no se distinga lo que contestó cada quien. invites dice a quién se le pidió y si ya contestó, no qué.
     * <p>
     * GET /v1/climate_surveys/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-climate-survey
     */
    public ClimateSurvey get(String id, RequestOptions options) {
        return api.request("GET", "/v1/climate_surveys/" + ApiClient.encode(id), null, null, false, ClimateSurvey.class, options);
    }

    public ClimateSurvey get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar una encuesta de clima laboral
     * <p>
     * Cambia un borrador. Una encuesta abierta o cerrada ya no cambia, porque hay quien contestó esas preguntas: ciérrela y haga otra.
     * <p>
     * POST /v1/climate_surveys/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-climate-survey
     */
    public ClimateSurvey update(String id, UpdateClimateSurveyParams params, RequestOptions options) {
        return api.request("POST", "/v1/climate_surveys/" + ApiClient.encode(id), params, null, true, ClimateSurvey.class, options);
    }

    public ClimateSurvey update(String id, UpdateClimateSurveyParams params) {
        return update(id, params, null);
    }

    /**
     * Borrar una encuesta de clima laboral
     * <p>
     * La borra si nadie la ha contestado. Con respuestas se conserva: los resultados se guardan al menos un año (numeral 5.8).
     * <p>
     * DELETE /v1/climate_surveys/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-climate-survey
     */
    public ClimateSurveyDeleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/climate_surveys/" + ApiClient.encode(id), null, null, false, ClimateSurveyDeleted.class, options);
    }

    public ClimateSurveyDeleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Abrir una encuesta de clima laboral
     * <p>
     * Invita a quien trabaja hoy en el centro (o a la muestra, con sample) y la encuesta aparece en su portal. Con la NOM-035 no se abre si el centro ya tiene otra abierta.
     * <p>
     * POST /v1/climate_surveys/{id}/open
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/open-climate-survey
     */
    public ClimateSurvey open(String id, RequestOptions options) {
        return api.request("POST", "/v1/climate_surveys/" + ApiClient.encode(id) + "/open", null, null, true, ClimateSurvey.class, options);
    }

    public ClimateSurvey open(String id) {
        return open(id, null);
    }

    /**
     * Cerrar una encuesta de clima laboral
     * <p>
     * Deja de recibir respuestas. Una NOM-035 cerrada cuenta como la identificación del centro de trabajo, y la siguiente toca dos años después (numeral 7.9).
     * <p>
     * POST /v1/climate_surveys/{id}/close
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/close-climate-survey
     */
    public ClimateSurvey close(String id, RequestOptions options) {
        return api.request("POST", "/v1/climate_surveys/" + ApiClient.encode(id) + "/close", null, null, true, ClimateSurvey.class, options);
    }

    public ClimateSurvey close(String id) {
        return close(id, null);
    }

    /**
     * Guardar el informe de una encuesta
     * <p>
     * Solo de la NOM-035: lo que pide el informe de resultados además de lo que calcula Fiscalisto (numeral 7.7): domicilio y actividad del centro, objetivo, actividades, conclusiones y el responsable de la evaluación. Lo que no manda no cambia.
     * <p>
     * POST /v1/climate_surveys/{id}/report
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-climate-survey-report
     */
    public ClimateSurvey updateReport(String id, UpdateClimateSurveyReportParams params, RequestOptions options) {
        return api.request("POST", "/v1/climate_surveys/" + ApiClient.encode(id) + "/report", params, null, true, ClimateSurvey.class, options);
    }

    public ClimateSurvey updateReport(String id, UpdateClimateSurveyReportParams params) {
        return updateReport(id, params, null);
    }

    public ClimateSurvey updateReport(String id) {
        return updateReport(id, null, null);
    }

    /**
     * Listar acontecimientos traumáticos
     * <p>
     * Quienes contestaron «Sí» en la Guía I, con su nombre, porque el patrón debe canalizar a quien lo requiera para su atención (numeral 5.5), y si requiere valoración clínica según la guía. Es lo único de una encuesta que lleva nombre.
     * <p>
     * GET /v1/climate_surveys/{id}/traumatic_events
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-climate-traumatic-events
     */
    public ClimateTraumaticEventList traumaticEvents(String id, RequestOptions options) {
        return api.request("GET", "/v1/climate_surveys/" + ApiClient.encode(id) + "/traumatic_events", null, null, false, ClimateTraumaticEventList.class, options);
    }

    public ClimateTraumaticEventList traumaticEvents(String id) {
        return traumaticEvents(id, null);
    }

    /**
     * Anotar a dónde se canalizó a un trabajador
     * <p>
     * A dónde se canalizó a quien vivió un acontecimiento traumático severo (el IMSS, un médico, un psicólogo), cuándo y una nota. Lo que no manda se borra.
     * <p>
     * POST /v1/climate_surveys/{id}/referrals
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/refer-climate-traumatic-event
     */
    public ClimateTraumaticEvent refer(String id, ReferClimateTraumaticEventParams params, RequestOptions options) {
        return api.request("POST", "/v1/climate_surveys/" + ApiClient.encode(id) + "/referrals", params, null, true, ClimateTraumaticEvent.class, options);
    }

    public ClimateTraumaticEvent refer(String id, ReferClimateTraumaticEventParams params) {
        return refer(id, params, null);
    }
}
