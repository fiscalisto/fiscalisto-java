// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateEmployeeDeductionParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.EmployeeDeduction;
import com.fiscalisto.model.EmployeeDeductionList;
import com.fiscalisto.model.ListEmployeeDeductionsParams;
import com.fiscalisto.model.UpdateEmployeeDeductionParams;

/**
 * Nómina: client.employeeDeductions().
 */
public final class EmployeeDeductionsService {
    private final ApiClient api;

    EmployeeDeductionsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Agregar un descuento a un empleado
     * <p>
     * Infonavit, Fonacot, pensión alimenticia, préstamo o anticipo del patrón, caja de ahorro o cuota sindical. Cada recibo ordinario desde start_date lo toma solo (POST /v1/payroll_receipts), con los límites de la Ley Federal del Trabajo: Infonavit por cada día del periodo aunque haya faltas, más $15 de seguro de daños por bimestre; Fonacot hasta el 20% del sueldo; préstamos, anticipos y caja hasta el 30% de lo que el sueldo excede del salario mínimo; del salario mínimo solo la pensión, Infonavit (20%) y Fonacot (10%). La pensión va primero, y lo que no alcanza del neto no se descuenta.
     * <p>
     * POST /v1/employee_deductions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-employee-deduction
     */
    public EmployeeDeduction create(CreateEmployeeDeductionParams params, RequestOptions options) {
        return api.request("POST", "/v1/employee_deductions", params, null, true, EmployeeDeduction.class, options);
    }

    public EmployeeDeduction create(CreateEmployeeDeductionParams params) {
        return create(params, null);
    }

    /**
     * Listar descuentos
     * <p>
     * Los descuentos vigentes del emisor, o de un empleado con employee.
     * <p>
     * GET /v1/employee_deductions
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-employee-deductions
     */
    public EmployeeDeductionList list(ListEmployeeDeductionsParams params, RequestOptions options) {
        return api.request("GET", "/v1/employee_deductions", null, params, false, EmployeeDeductionList.class, options);
    }

    public EmployeeDeductionList list(ListEmployeeDeductionsParams params) {
        return list(params, null);
    }

    public EmployeeDeductionList list() {
        return list(null, null);
    }

    /**
     * Ver un descuento
     * <p>
     * El descuento con lo que ya tomaron los recibos (paid) y lo que falta de un préstamo (balance).
     * <p>
     * GET /v1/employee_deductions/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-employee-deduction
     */
    public EmployeeDeduction get(String id, RequestOptions options) {
        return api.request("GET", "/v1/employee_deductions/" + ApiClient.encode(id), null, null, false, EmployeeDeduction.class, options);
    }

    public EmployeeDeduction get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar un descuento
     * <p>
     * Desde el siguiente recibo; los timbrados se quedan como están.
     * <p>
     * POST /v1/employee_deductions/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-employee-deduction
     */
    public EmployeeDeduction update(String id, UpdateEmployeeDeductionParams params, RequestOptions options) {
        return api.request("POST", "/v1/employee_deductions/" + ApiClient.encode(id), params, null, true, EmployeeDeduction.class, options);
    }

    public EmployeeDeduction update(String id, UpdateEmployeeDeductionParams params) {
        return update(id, params, null);
    }

    public EmployeeDeduction update(String id) {
        return update(id, null, null);
    }

    /**
     * Quitar un descuento
     * <p>
     * Los recibos siguientes ya no lo toman; los timbrados lo conservan.
     * <p>
     * DELETE /v1/employee_deductions/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-employee-deduction
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/employee_deductions/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
