// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ApproveAttendanceOvertimeParams;
import com.fiscalisto.model.AttendanceCalendar;
import com.fiscalisto.model.AttendanceCalendarChange;
import com.fiscalisto.model.AttendanceMark;
import com.fiscalisto.model.AttendanceOvertime;
import com.fiscalisto.model.AttendanceReport;
import com.fiscalisto.model.AttendanceRotation;
import com.fiscalisto.model.AttendanceShift;
import com.fiscalisto.model.CreateAttendanceMarkParams;
import com.fiscalisto.model.CreateAttendanceRotationParams;
import com.fiscalisto.model.CreateAttendanceShiftParams;
import com.fiscalisto.model.GetAttendanceCalendarParams;
import com.fiscalisto.model.GetAttendanceParams;
import com.fiscalisto.model.ListAttendanceRotationsParams;
import com.fiscalisto.model.ListAttendanceShiftsParams;
import com.fiscalisto.model.SetAttendanceCalendarParams;
import com.fiscalisto.model.UpdateAttendanceRotationParams;
import com.fiscalisto.model.UpdateAttendanceShiftParams;
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

    /**
     * Listar los turnos
     * <p>
     * Los turnos de Asistencia › Turnos (ats_…), los archivados también: sus tramos, sus minutos y su jornada por ley (diurna, nocturna o mixta, LFT art. 60) con lo que dice la ley de ellos.
     * <p>
     * GET /v1/attendance/shifts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/list-attendance-shifts
     */
    public Page<AttendanceShift> listShifts(ListAttendanceShiftsParams params, RequestOptions options) {
        return api.list("/v1/attendance/shifts", params, AttendanceShift.class, options);
    }

    public Page<AttendanceShift> listShifts(ListAttendanceShiftsParams params) {
        return listShifts(params, null);
    }

    public Page<AttendanceShift> listShifts() {
        return listShifts(null, null);
    }

    /** Listar los turnos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<AttendanceShift> listShiftsAutoPaging(ListAttendanceShiftsParams params, RequestOptions options) {
        return listShifts(params, options).autoPagingIterable();
    }

    public Iterable<AttendanceShift> listShiftsAutoPaging(ListAttendanceShiftsParams params) {
        return listShiftsAutoPaging(params, null);
    }

    public Iterable<AttendanceShift> listShiftsAutoPaging() {
        return listShiftsAutoPaging(null, null);
    }

    /**
     * Crear un turno
     * <p>
     * Un turno con uno a tres tramos (con dos o tres es partido: el tiempo entre tramos no es jornada); un tramo puede pasar de la medianoche. Se guarda aunque pase de la jornada del art. 61 (con el acuerdo del trabajador, art. 58) y lo dice en warnings.
     * <p>
     * POST /v1/attendance/shifts
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/create-attendance-shift
     */
    public AttendanceShift createShift(CreateAttendanceShiftParams params, RequestOptions options) {
        return api.request("POST", "/v1/attendance/shifts", params, null, true, AttendanceShift.class, options);
    }

    public AttendanceShift createShift(CreateAttendanceShiftParams params) {
        return createShift(params, null);
    }

    /**
     * Cambiar un turno
     * <p>
     * Cambia lo que mande y deja lo demás. Cambiar sus horas cambia los días que lo tienen desde hoy; archived: true lo archiva.
     * <p>
     * POST /v1/attendance/shifts/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/update-attendance-shift
     */
    public AttendanceShift updateShift(String id, UpdateAttendanceShiftParams params, RequestOptions options) {
        return api.request("POST", "/v1/attendance/shifts/" + ApiClient.encode(id), params, null, true, AttendanceShift.class, options);
    }

    public AttendanceShift updateShift(String id, UpdateAttendanceShiftParams params) {
        return updateShift(id, params, null);
    }

    public AttendanceShift updateShift(String id) {
        return updateShift(id, null, null);
    }

    /**
     * Listar los roles de turnos
     * <p>
     * Los roles de turnos (atr_…), los archivados también: el ciclo de turnos y descansos, el promedio a la semana y el aviso del art. 69 si pasan más de seis días de trabajo sin descanso.
     * <p>
     * GET /v1/attendance/rotations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/list-attendance-rotations
     */
    public Page<AttendanceRotation> listRotations(ListAttendanceRotationsParams params, RequestOptions options) {
        return api.list("/v1/attendance/rotations", params, AttendanceRotation.class, options);
    }

    public Page<AttendanceRotation> listRotations(ListAttendanceRotationsParams params) {
        return listRotations(params, null);
    }

    public Page<AttendanceRotation> listRotations() {
        return listRotations(null, null);
    }

    /** Listar los roles de turnos: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<AttendanceRotation> listRotationsAutoPaging(ListAttendanceRotationsParams params, RequestOptions options) {
        return listRotations(params, options).autoPagingIterable();
    }

    public Iterable<AttendanceRotation> listRotationsAutoPaging(ListAttendanceRotationsParams params) {
        return listRotationsAutoPaging(params, null);
    }

    public Iterable<AttendanceRotation> listRotationsAutoPaging() {
        return listRotationsAutoPaging(null, null);
    }

    /**
     * Crear un rol de turnos
     * <p>
     * Un ciclo de turnos y descansos en orden que vuelve a empezar al terminar (4×4: cuatro días un turno y cuatro null). A cada empleado se le pone en la app, en Asistencia › Personas, con el día en que cae su día 1.
     * <p>
     * POST /v1/attendance/rotations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/create-attendance-rotation
     */
    public AttendanceRotation createRotation(CreateAttendanceRotationParams params, RequestOptions options) {
        return api.request("POST", "/v1/attendance/rotations", params, null, true, AttendanceRotation.class, options);
    }

    public AttendanceRotation createRotation(CreateAttendanceRotationParams params) {
        return createRotation(params, null);
    }

    /**
     * Cambiar un rol de turnos
     * <p>
     * Cambia su nombre o su ciclo; archived: true lo archiva.
     * <p>
     * POST /v1/attendance/rotations/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/update-attendance-rotation
     */
    public AttendanceRotation updateRotation(String id, UpdateAttendanceRotationParams params, RequestOptions options) {
        return api.request("POST", "/v1/attendance/rotations/" + ApiClient.encode(id), params, null, true, AttendanceRotation.class, options);
    }

    public AttendanceRotation updateRotation(String id, UpdateAttendanceRotationParams params) {
        return updateRotation(id, params, null);
    }

    public AttendanceRotation updateRotation(String id) {
        return updateRotation(id, null, null);
    }

    /**
     * Ver el calendario de turnos
     * <p>
     * El turno de cada empleado cada día de un mes y de dónde sale: un cambio puesto en el calendario, su rol de turnos o su horario de la semana.
     * <p>
     * GET /v1/attendance/calendar
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/get-attendance-calendar
     */
    public AttendanceCalendar getCalendar(GetAttendanceCalendarParams params, RequestOptions options) {
        return api.request("GET", "/v1/attendance/calendar", null, params, false, AttendanceCalendar.class, options);
    }

    public AttendanceCalendar getCalendar(GetAttendanceCalendarParams params) {
        return getCalendar(params, null);
    }

    /**
     * Poner turnos en el calendario
     * <p>
     * Pone un turno (o descanso, shift null) en unos días de unos empleados, y gana sobre su rol y su horario: un cambio de turno, un descanso extra. clear: true lo quita y esos días vuelven a su rol u horario. Hasta 62 días y 500 empleados a la vez.
     * <p>
     * POST /v1/attendance/calendar
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/asistencia/set-attendance-calendar
     */
    public AttendanceCalendarChange setCalendar(SetAttendanceCalendarParams params, RequestOptions options) {
        return api.request("POST", "/v1/attendance/calendar", params, null, true, AttendanceCalendarChange.class, options);
    }

    public AttendanceCalendarChange setCalendar(SetAttendanceCalendarParams params) {
        return setCalendar(params, null);
    }
}
