// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetScheduleSettingsParams;
import com.fiscalisto.model.ScheduleSettings;
import com.fiscalisto.model.UpdateScheduleSettingsParams;

/**
 * Emisores: client.scheduleSettings().
 */
public final class ScheduleSettingsService {
    private final ApiClient api;

    ScheduleSettingsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver los horarios
     * <p>
     * Los horarios de la empresa, como Ajustes › Horarios en la app: cuántos días vale una cotización nueva y a qué hora vence, y a qué hora corren las reglas «Cada mañana», la revisión diaria de hallazgos y el resumen semanal de los lunes, todo en su zona horaria (time_zone). Valen para toda la empresa: cualquiera de sus emisores lee los mismos.
     * <p>
     * GET /v1/schedule_settings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/get-schedule-settings
     */
    public ScheduleSettings get(GetScheduleSettingsParams params, RequestOptions options) {
        return api.request("GET", "/v1/schedule_settings", null, params, false, ScheduleSettings.class, options);
    }

    public ScheduleSettings get(GetScheduleSettingsParams params) {
        return get(params, null);
    }

    public ScheduleSettings get() {
        return get(null, null);
    }

    /**
     * Cambiar los horarios
     * <p>
     * Cambia los horarios de la empresa (para todos sus emisores). Lo que no mande se queda como está. Un cliente o su grupo pueden tener su propia vigencia de cotizaciones (quote_valid_days), que gana a la de la empresa.
     * <p>
     * POST /v1/schedule_settings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/update-schedule-settings
     */
    public ScheduleSettings update(UpdateScheduleSettingsParams params, RequestOptions options) {
        return api.request("POST", "/v1/schedule_settings", params, null, true, ScheduleSettings.class, options);
    }

    public ScheduleSettings update(UpdateScheduleSettingsParams params) {
        return update(params, null);
    }

    public ScheduleSettings update() {
        return update(null, null);
    }
}
