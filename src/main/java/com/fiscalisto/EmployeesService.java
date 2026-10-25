// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateEmployeeParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.Employee;
import com.fiscalisto.model.ListEmployeesParams;
import com.fiscalisto.model.UpdateEmployeeParams;

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
}
