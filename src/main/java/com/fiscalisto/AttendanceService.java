// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ApproveAttendanceOvertimeParams;
import com.fiscalisto.model.AttendanceMark;
import com.fiscalisto.model.AttendanceOvertime;
import com.fiscalisto.model.AttendanceReport;
import com.fiscalisto.model.CreateAttendanceMarkParams;
import com.fiscalisto.model.GetAttendanceParams;
import com.fiscalisto.model.VoidAttendanceMarkParams;

/**
 * Asistencia: client.attendance().
 */
public final class AttendanceService {
    private final ApiClient api;

    AttendanceService(ApiClient api) {
        this.api = api;
    }

    /**
     * Ver la asistencia de un periodo
     * <p>
     * El registro de jornada del emisor (LFT art. 132) del periodo, por empleado: minutos trabajados contra su horario, faltas, retardos, días sin salida, marcas con notas y horas extra dobles y triples por semana. Con employee, también cada día y cada marca (con sus correcciones). Hasta 92 días a la vez.
     * <p>
     * GET /v1/attendance
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/get-attendance
     */
    public AttendanceReport get(GetAttendanceParams params, RequestOptions options) {
        return api.request("GET", "/v1/attendance", null, params, false, AttendanceReport.class, options);
    }

    public AttendanceReport get(GetAttendanceParams params) {
        return get(params, null);
    }

    /**
     * Registrar una marca
     * <p>
     * Una entrada o salida que viene de otro reloj checador. Queda con method api y su motivo, y el empleado la ve en su enlace. Una marca igual del mismo empleado dentro de 60 segundos no se duplica.
     * <p>
     * POST /v1/attendance/marks
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/create-attendance-mark
     */
    public AttendanceMark createMark(CreateAttendanceMarkParams params, RequestOptions options) {
        return api.request("POST", "/v1/attendance/marks", params, null, true, AttendanceMark.class, options);
    }

    public AttendanceMark createMark(CreateAttendanceMarkParams params) {
        return createMark(params, null);
    }

    /**
     * Quitar una marca
     * <p>
     * La marca deja de contar y queda tachada con su motivo, quién y cuándo (nunca se borra). En la app se puede restaurar.
     * <p>
     * POST /v1/attendance/marks/{id}/void
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/void-attendance-mark
     */
    public AttendanceMark voidMark(String id, VoidAttendanceMarkParams params, RequestOptions options) {
        return api.request("POST", "/v1/attendance/marks/" + ApiClient.encode(id) + "/void", params, null, true, AttendanceMark.class, options);
    }

    public AttendanceMark voidMark(String id, VoidAttendanceMarkParams params) {
        return voidMark(id, params, null);
    }

    /**
     * Autorizar o rechazar horas extra
     * <p>
     * Hasta cuántos minutos de horas extra de un día de un empleado cuentan para la nómina, antes o después de ese día, o rechazarlas todas (rejected: true, con comment). minutes null quita la decisión. Con la regla de horas extra «Necesitan autorización», lo que nadie autorizó queda en el registro como sin autorizar.
     * <p>
     * POST /v1/attendance/overtime
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/approve-attendance-overtime
     */
    public AttendanceOvertime approveOvertime(ApproveAttendanceOvertimeParams params, RequestOptions options) {
        return api.request("POST", "/v1/attendance/overtime", params, null, true, AttendanceOvertime.class, options);
    }

    public AttendanceOvertime approveOvertime(ApproveAttendanceOvertimeParams params) {
        return approveOvertime(params, null);
    }
}
