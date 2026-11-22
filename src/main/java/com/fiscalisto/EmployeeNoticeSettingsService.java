// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.EmployeeNoticeSettings;
import com.fiscalisto.model.GetEmployeeNoticeSettingsParams;
import com.fiscalisto.model.UpdateEmployeeNoticeSettingsParams;

/**
 * Nómina: client.employeeNoticeSettings().
 */
public final class EmployeeNoticeSettingsService {
    private final ApiClient api;

    EmployeeNoticeSettingsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Avisos a empleados
     * <p>
     * Qué avisos les llegan a los empleados del emisor en Mi nómina: recibo nuevo, recibo cancelado, la respuesta a sus vacaciones y el recordatorio de firmar. Llegan al celular de quien instaló Mi nómina y activó sus avisos; si no, a su correo (email_fallback).
     * <p>
     * GET /v1/employee_notice_settings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-employee-notice-settings
     */
    public EmployeeNoticeSettings get(GetEmployeeNoticeSettingsParams params, RequestOptions options) {
        return api.request("GET", "/v1/employee_notice_settings", null, params, false, EmployeeNoticeSettings.class, options);
    }

    public EmployeeNoticeSettings get(GetEmployeeNoticeSettingsParams params) {
        return get(params, null);
    }

    public EmployeeNoticeSettings get() {
        return get(null, null);
    }

    /**
     * Cambiar los avisos a empleados
     * <p>
     * Lo que no mande se queda como estaba. Cada empleado puede, además, apagar los suyos desde su enlace.
     * <p>
     * POST /v1/employee_notice_settings
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-employee-notice-settings
     */
    public EmployeeNoticeSettings update(UpdateEmployeeNoticeSettingsParams params, RequestOptions options) {
        return api.request("POST", "/v1/employee_notice_settings", params, null, true, EmployeeNoticeSettings.class, options);
    }

    public EmployeeNoticeSettings update(UpdateEmployeeNoticeSettingsParams params) {
        return update(params, null);
    }

    public EmployeeNoticeSettings update() {
        return update(null, null);
    }
}
