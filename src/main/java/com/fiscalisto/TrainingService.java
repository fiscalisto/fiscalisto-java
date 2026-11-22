// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetTrainingParams;
import com.fiscalisto.model.ListTrainingCertificatesParams;
import com.fiscalisto.model.Training;
import com.fiscalisto.model.TrainingCertificateList;
import com.fiscalisto.model.UpdateTrainingSettingsParams;

/**
 * Nómina: client.training().
 */
public final class TrainingService {
    private final ApiClient api;

    TrainingService(ApiClient api) {
        this.api = api;
    }

    /**
     * Capacitación
     * <p>
     * Como «Nómina › Capacitación» de la app: quién firma las constancias DC-3 (con hasta 50 trabajadores el patrón o su representante legal; con más, el representante del patrón y el de los trabajadores ante la comisión mixta: Acuerdo de la STPS del 14 de junio de 2013, artículo 24, fracción II), cuántos trabajadores cuenta, los años del plan de capacitación con el día límite del aviso a la STPS de cada uno (60 días hábiles, artículo 26, fracción I), las constancias por renovar y cuántas faltan por entregar.
     * <p>
     * GET /v1/training
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-training
     */
    public Training get(GetTrainingParams params, RequestOptions options) {
        return api.request("GET", "/v1/training", null, params, false, Training.class, options);
    }

    public Training get(GetTrainingParams params) {
        return get(params, null);
    }

    public Training get() {
        return get(null, null);
    }

    /**
     * Configurar la capacitación
     * <p>
     * Quién firma las constancias, la comisión mixta (LFT 153-E: igual número por cada parte), cuántos trabajadores contar si no todos están en Nómina, las fechas del plan (dos años como máximo, LFT 153-H) y la ocupación del Catálogo Nacional de Ocupaciones de cada puesto. Lo que no manda no cambia. Contesta training.
     * <p>
     * POST /v1/training/settings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-training-settings
     */
    public Training updateSettings(UpdateTrainingSettingsParams params, RequestOptions options) {
        return api.request("POST", "/v1/training/settings", params, null, true, Training.class, options);
    }

    public Training updateSettings(UpdateTrainingSettingsParams params) {
        return updateSettings(params, null);
    }

    public Training updateSettings() {
        return updateSettings(null, null);
    }

    /**
     * Constancias para el aviso a la STPS
     * <p>
     * Las constancias DC-3 emitidas de los cursos que terminaron entre from y to, con lo que pide el aviso a la STPS (artículo 26, fracción I: nombre, CURP, ocupación, puesto, estudios, curso, área temática, horas, fechas y agente capacitador), ordenadas por folio. El día límite para presentarlo de cada año del plan viene en plan_years de GET /v1/training. El aviso se presenta en el sistema de la STPS, que no tiene API.
     * <p>
     * GET /v1/training/certificates
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-training-certificates
     */
    public TrainingCertificateList certificates(ListTrainingCertificatesParams params, RequestOptions options) {
        return api.request("GET", "/v1/training/certificates", null, params, false, TrainingCertificateList.class, options);
    }

    public TrainingCertificateList certificates(ListTrainingCertificatesParams params) {
        return certificates(params, null);
    }
}
