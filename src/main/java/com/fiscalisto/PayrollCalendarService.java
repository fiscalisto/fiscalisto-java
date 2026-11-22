// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.GetPayrollCalendarParams;
import com.fiscalisto.model.MarkPayrollCalendarEventParams;
import com.fiscalisto.model.PayrollCalendar;
import com.fiscalisto.model.PayrollCalendarEvent;

/**
 * Nómina: client.payrollCalendar().
 */
public final class PayrollCalendarService {
    private final ApiClient api;

    PayrollCalendarService(ApiClient api) {
        this.api = api;
    }

    /**
     * Calendario de nómina
     * <p>
     * Como «Nómina › Calendario» de la app: cada nómina en su fecha de pago (con cuántos de sus recibos están timbrados y el último día para timbrarlos), y lo que se paga por ella, con el artículo de la ley de cada fecha: cuotas del IMSS (día 17 del mes siguiente, LSS art. 39), RCV e Infonavit (bimestrales, día 17), impuesto sobre nómina de cada estado donde trabajan sus empleados, aguinaldo (antes del 20 de diciembre), PTU, prima de riesgo de trabajo (febrero) y ajuste anual. Una fecha de pago al IMSS que cae en día inhábil o viernes pasa al siguiente día hábil (CFF art. 12, RACERF art. 3).
     * <p>
     * GET /v1/payroll_calendar
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-payroll-calendar
     */
    public PayrollCalendar get(GetPayrollCalendarParams params, RequestOptions options) {
        return api.request("GET", "/v1/payroll_calendar", null, params, false, PayrollCalendar.class, options);
    }

    public PayrollCalendar get(GetPayrollCalendarParams params) {
        return get(params, null);
    }

    public PayrollCalendar get() {
        return get(null, null);
    }

    /**
     * Marcar un pago de nómina como pagado
     * <p>
     * Marca (paid true) o desmarca (false) un pago del calendario de nómina: imss, rcv_infonavit, isn, aguinaldo, ptu, prima_riesgo, ajuste_anual, icsoe o sisub, con su key como lo da GET /v1/payroll_calendar. Una nómina (pago) queda hecha al timbrar sus recibos.
     * <p>
     * POST /v1/payroll_calendar/mark
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/mark-payroll-calendar-event
     */
    public PayrollCalendarEvent mark(MarkPayrollCalendarEventParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_calendar/mark", params, null, true, PayrollCalendarEvent.class, options);
    }

    public PayrollCalendarEvent mark(MarkPayrollCalendarEventParams params) {
        return mark(params, null);
    }
}
