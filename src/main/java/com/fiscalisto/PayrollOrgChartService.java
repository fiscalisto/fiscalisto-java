// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.AssignPayrollOrgChartParams;
import com.fiscalisto.model.CreatePayrollVacancyParams;
import com.fiscalisto.model.FillPayrollVacancyParams;
import com.fiscalisto.model.GetPayrollOrgChartParams;
import com.fiscalisto.model.PayrollOrgChart;
import com.fiscalisto.model.RemovePayrollDepartmentParams;
import com.fiscalisto.model.SavePayrollDepartmentParams;
import com.fiscalisto.model.UpdatePayrollVacancyParams;

/**
 * Nómina: client.payrollOrgChart().
 */
public final class PayrollOrgChartService {
    private final ApiClient api;

    PayrollOrgChartService(ApiClient api) {
        this.api = api;
    }

    /**
     * Organigrama
     * <p>
     * Como «Nómina › Organigrama» de la app: los empleados de hoy del emisor con su jefe directo, departamento y sucursal, cuántas personas dependen de cada uno (directas y en toda su cadena), los departamentos con sus subdepartamentos, las vacantes y un resumen (jefes, tramo promedio, quién queda sin jefe o sin departamento). Quien no tiene jefe, o cuyo jefe ya se fue, queda arriba; un círculo que dejó una importación se rompe en el de número más bajo.
     * <p>
     * GET /v1/payroll_org_chart
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-payroll-org-chart
     */
    public PayrollOrgChart get(GetPayrollOrgChartParams params, RequestOptions options) {
        return api.request("GET", "/v1/payroll_org_chart", null, params, false, PayrollOrgChart.class, options);
    }

    public PayrollOrgChart get(GetPayrollOrgChartParams params) {
        return get(params, null);
    }

    public PayrollOrgChart get() {
        return get(null, null);
    }

    /**
     * Cambiar jefe, departamento o sucursal
     * <p>
     * Cambia el jefe directo, el departamento o la sucursal de uno o varios empleados (hasta 500); lo que no manda no cambia. Un jefe que, subiendo por su cadena, depende de alguno de ellos contesta parameter_invalid: quedarían en círculo. El departamento es el que llevan sus recibos (Departamento). Contesta el organigrama ya cambiado.
     * <p>
     * POST /v1/payroll_org_chart/assign
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/assign-payroll-org-chart
     */
    public PayrollOrgChart assign(AssignPayrollOrgChartParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_org_chart/assign", params, null, true, PayrollOrgChart.class, options);
    }

    public PayrollOrgChart assign(AssignPayrollOrgChartParams params) {
        return assign(params, null);
    }

    /**
     * Crear o cambiar un departamento
     * <p>
     * Crea el departamento name o, si ya existe, lo cambia: new_name lo renombra (también en sus empleados y vacantes), parent lo pone dentro de otro y lead le pone responsable. Un parent que ya está dentro de él contesta parameter_invalid. Contesta el organigrama.
     * <p>
     * POST /v1/payroll_org_chart/departments
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/save-payroll-department
     */
    public PayrollOrgChart saveDepartment(SavePayrollDepartmentParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_org_chart/departments", params, null, true, PayrollOrgChart.class, options);
    }

    public PayrollOrgChart saveDepartment(SavePayrollDepartmentParams params) {
        return saveDepartment(params, null);
    }

    /**
     * Quitar un departamento
     * <p>
     * Quita un departamento sin personas; los que estaban dentro de él suben un nivel. Con personas contesta parameter_invalid: cámbielas antes con POST /v1/payroll_org_chart/assign. Contesta el organigrama.
     * <p>
     * POST /v1/payroll_org_chart/departments/remove
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/remove-payroll-department
     */
    public PayrollOrgChart removeDepartment(RemovePayrollDepartmentParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_org_chart/departments/remove", params, null, true, PayrollOrgChart.class, options);
    }

    public PayrollOrgChart removeDepartment(RemovePayrollDepartmentParams params) {
        return removeDepartment(params, null);
    }

    /**
     * Abrir una vacante
     * <p>
     * Un puesto sin persona todavía, bajo un jefe, en un departamento y una sucursal, con el sueldo mensual que ofrece: sale en el organigrama, pero no cuenta como empleado. Queda en pending_approval hasta que alguien con el permiso «Aprobar la prenómina» la aprueba en la app (le llega un aviso); entonces se cubre con POST /v1/payroll_org_chart/vacancies/{id}/fill. Contesta el organigrama, con lo que costaría al mes (monthly_cost).
     * <p>
     * POST /v1/payroll_org_chart/vacancies
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-payroll-vacancy
     */
    public PayrollOrgChart createVacancy(CreatePayrollVacancyParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_org_chart/vacancies", params, null, true, PayrollOrgChart.class, options);
    }

    public PayrollOrgChart createVacancy(CreatePayrollVacancyParams params) {
        return createVacancy(params, null);
    }

    /**
     * Cambiar una vacante
     * <p>
     * Cambia el puesto, departamento, jefe, sucursal o sueldo de una vacante (vac_…); lo que no manda queda vacío. Cambiada, vuelve a pending_approval. Una ya cubierta contesta parameter_invalid.
     * <p>
     * POST /v1/payroll_org_chart/vacancies/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-payroll-vacancy
     */
    public PayrollOrgChart updateVacancy(String id, UpdatePayrollVacancyParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_org_chart/vacancies/" + ApiClient.encode(id), params, null, true, PayrollOrgChart.class, options);
    }

    public PayrollOrgChart updateVacancy(String id, UpdatePayrollVacancyParams params) {
        return updateVacancy(id, params, null);
    }

    /**
     * Cerrar una vacante
     * <p>
     * La quita del organigrama (se cubrió o ya no hace falta). Contesta el organigrama.
     * <p>
     * DELETE /v1/payroll_org_chart/vacancies/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-payroll-vacancy
     */
    public PayrollOrgChart deleteVacancy(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/payroll_org_chart/vacancies/" + ApiClient.encode(id), null, null, false, PayrollOrgChart.class, options);
    }

    public PayrollOrgChart deleteVacancy(String id) {
        return deleteVacancy(id, null);
    }

    /**
     * Cubrir una vacante
     * <p>
     * La cubre con un empleado ya dado de alta (POST /v1/employees): queda con el jefe, el departamento y la sucursal de la vacante, y la vacante sale del organigrama (status filled). Una que espera aprobación o se rechazó contesta parameter_invalid. Falta su alta en el IMSS (GET /v1/imss_movements la propone).
     * <p>
     * POST /v1/payroll_org_chart/vacancies/{id}/fill
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/fill-payroll-vacancy
     */
    public PayrollOrgChart fillVacancy(String id, FillPayrollVacancyParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_org_chart/vacancies/" + ApiClient.encode(id) + "/fill", params, null, true, PayrollOrgChart.class, options);
    }

    public PayrollOrgChart fillVacancy(String id, FillPayrollVacancyParams params) {
        return fillVacancy(id, params, null);
    }
}
