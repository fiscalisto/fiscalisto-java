// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateEmployeeParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.Employee;
import com.fiscalisto.model.EmployeeVacations;
import com.fiscalisto.model.GetEmployeeVacationsParams;
import com.fiscalisto.model.ListEmployeesParams;
import com.fiscalisto.model.UpdateEmployeeParams;
import com.fiscalisto.model.UpdateEmployeeVacationsParams;

/**
 * Nómina: client.employees().
 */
public final class EmployeesService {
    private final ApiClient api;

    EmployeesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un empleado
     * <p>
     * Un empleado del emisor para sus recibos de nómina: RFC, CURP, NSS, salario diario, salario diario integrado y periodicidad. Lo que no mande tiene el valor usual (contrato indefinido, jornada diurna, quincenal, riesgo clase I). warnings dice lo que el SAT podría rechazar.
     * <p>
     * POST /v1/employees
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-employee
     */
    public Employee create(CreateEmployeeParams params, RequestOptions options) {
        return api.request("POST", "/v1/employees", params, null, true, Employee.class, options);
    }

    public Employee create(CreateEmployeeParams params) {
        return create(params, null);
    }

    /**
     * Listar empleados
     * <p>
     * Los empleados del emisor, los más recientes primero.
     * <p>
     * GET /v1/employees
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-employees
     */
    public Page<Employee> list(ListEmployeesParams params, RequestOptions options) {
        return api.list("/v1/employees", params, Employee.class, options);
    }

    public Page<Employee> list(ListEmployeesParams params) {
        return list(params, null);
    }

    public Page<Employee> list() {
        return list(null, null);
    }

    /** Listar empleados: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Employee> listAutoPaging(ListEmployeesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Employee> listAutoPaging(ListEmployeesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Employee> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un empleado
     * <p>
     * Un empleado con sus datos y lo que el SAT podría rechazar en warnings.
     * <p>
     * GET /v1/employees/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-employee
     */
    public Employee get(String id, RequestOptions options) {
        return api.request("GET", "/v1/employees/" + ApiClient.encode(id), null, null, false, Employee.class, options);
    }

    public Employee get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar un empleado
     * <p>
     * Cambia solo los campos que manda; los recibos ya timbrados no cambian.
     * <p>
     * POST /v1/employees/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-employee
     */
    public Employee update(String id, UpdateEmployeeParams params, RequestOptions options) {
        return api.request("POST", "/v1/employees/" + ApiClient.encode(id), params, null, true, Employee.class, options);
    }

    public Employee update(String id, UpdateEmployeeParams params) {
        return update(id, params, null);
    }

    public Employee update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar un empleado
     * <p>
     * Sus recibos timbrados se quedan.
     * <p>
     * DELETE /v1/employees/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/delete-employee
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/employees/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Vacaciones de un empleado
     * <p>
     * Los días de vacaciones de cada año de servicio (artículo 76 de la LFT: 12 el primero, dos más cada año hasta 20 y luego dos más cada cinco), los que tomó (los días de vacaciones de sus recibos timbrados, restados del año más antiguo que le quede), hasta cuándo dárselos (seis meses después del aniversario, artículo 81) y cuándo prescriben (un año después, artículo 516). pending_days son los de años cumplidos que no han prescrito: los que paga el finiquito.
     * <p>
     * GET /v1/employees/{id}/vacations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-employee-vacations
     */
    public EmployeeVacations vacations(String id, GetEmployeeVacationsParams params, RequestOptions options) {
        return api.request("GET", "/v1/employees/" + ApiClient.encode(id) + "/vacations", null, params, false, EmployeeVacations.class, options);
    }

    public EmployeeVacations vacations(String id, GetEmployeeVacationsParams params) {
        return vacations(id, params, null);
    }

    public EmployeeVacations vacations(String id) {
        return vacations(id, null, null);
    }

    /**
     * Saldo de vacaciones antes de Fiscalisto
     * <p>
     * Guarda lo que el empleado tenía en un día según sus registros: los días que le quedaban de años cumplidos y los que ya había tomado del año en curso. Los recibos timbrados antes de ese día no se cuentan. opening_date null lo quita.
     * <p>
     * POST /v1/employees/{id}/vacations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-employee-vacations
     */
    public EmployeeVacations updateVacations(String id, UpdateEmployeeVacationsParams params, RequestOptions options) {
        return api.request("POST", "/v1/employees/" + ApiClient.encode(id) + "/vacations", params, null, true, EmployeeVacations.class, options);
    }

    public EmployeeVacations updateVacations(String id, UpdateEmployeeVacationsParams params) {
        return updateVacations(id, params, null);
    }
}
