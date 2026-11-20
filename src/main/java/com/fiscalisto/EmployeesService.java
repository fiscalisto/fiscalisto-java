// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateEmployeeParams;
import com.fiscalisto.model.CreateEmployeeRaiseParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.Employee;
import com.fiscalisto.model.EmployeePortal;
import com.fiscalisto.model.EmployeeRaise;
import com.fiscalisto.model.EmployeeVacations;
import com.fiscalisto.model.GetEmployeePayStatementParams;
import com.fiscalisto.model.GetEmployeeVacationCertificateParams;
import com.fiscalisto.model.GetEmployeeVacationsParams;
import com.fiscalisto.model.ListEmployeesParams;
import com.fiscalisto.model.UpdateEmployeeParams;
import com.fiscalisto.model.UpdateEmployeePortalParams;
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
     * Aumento de sueldo
     * <p>
     * Un aumento para varios empleados a la vez, como «Aumento de sueldo» en Nómina › Empleados de la app: percent (porcentaje), amount (pesos más por día) o daily_salary (un salario nuevo). Cada empleado conserva su factor de integración (SDI ÷ salario), y el SDI nuevo queda como modificación de salario con fecha effective_date en Movimientos del IMSS, para presentarla a más tardar en imss_deadline (5 días hábiles, artículo 34 de la Ley del Seguro Social). Rige desde hoy o antes; los periodos ya timbrados desde entonces se pagan con el retroactivo de las incidencias. Si un empleado no puede recibirlo (no es un aumento, queda bajo el salario mínimo, no trabajaba ese día), contesta 400 y no cambia a nadie; dry_run true dice cómo quedaría cada uno, con su error, sin guardar.
     * <p>
     * POST /v1/employee_raises
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-employee-raise
     */
    public EmployeeRaise giveRaise(CreateEmployeeRaiseParams params, RequestOptions options) {
        return api.request("POST", "/v1/employee_raises", params, null, true, EmployeeRaise.class, options);
    }

    public EmployeeRaise giveRaise(CreateEmployeeRaiseParams params) {
        return giveRaise(params, null);
    }

    public EmployeeRaise giveRaise() {
        return giveRaise(null, null);
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

    /**
     * Constancia de vacaciones
     * <p>
     * El PDF de la constancia que el artículo 81 de la LFT pide entregar cada año: su antigüedad al último aniversario, los días de vacaciones que le corresponden (artículo 76) con su prima vacacional, cuándo disfrutarlos (las fechas que mande, o los seis meses siguientes al aniversario) y los días pendientes de años anteriores con cuándo prescriben, con espacio para las firmas. Antes de su primer aniversario dice cuándo lo cumple y cuántos días le tocarán.
     * <p>
     * GET /v1/employees/{id}/vacations/certificate
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-employee-vacation-certificate
     */
    public byte[] vacationCertificate(String id, GetEmployeeVacationCertificateParams params, RequestOptions options) {
        return api.bytes("GET", "/v1/employees/" + ApiClient.encode(id) + "/vacations/certificate", null, params, false, options);
    }

    public byte[] vacationCertificate(String id, GetEmployeeVacationCertificateParams params) {
        return vacationCertificate(id, params, null);
    }

    public byte[] vacationCertificate(String id) {
        return vacationCertificate(id, null, null);
    }

    /**
     * Constancia de sueldos
     * <p>
     * El PDF de lo que se le pagó al empleado en un año, de sus recibos de nómina vigentes por fecha de pago: cada percepción con su parte gravada y exenta, las deducciones (ISR retenido, IMSS y otras), los otros pagos con el subsidio para el empleo causado, y el neto. Resume sus CFDI de nómina, que son el comprobante de lo pagado y retenido (LISR art. 99 fr. III); no los sustituye. El empleado la baja también desde su portal.
     * <p>
     * GET /v1/employees/{id}/pay_statement
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-employee-pay-statement
     */
    public byte[] payStatement(String id, GetEmployeePayStatementParams params, RequestOptions options) {
        return api.bytes("GET", "/v1/employees/" + ApiClient.encode(id) + "/pay_statement", null, params, false, options);
    }

    public byte[] payStatement(String id, GetEmployeePayStatementParams params) {
        return payStatement(id, params, null);
    }

    /**
     * Portal del empleado
     * <p>
     * El enlace personal del empleado (sin cuenta) para ver, descargar y firmar de recibido sus recibos de nómina, ver sus vacaciones y pedir días; los celulares ligados y los recibos que firmó.
     * <p>
     * GET /v1/employees/{id}/portal
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-employee-portal
     */
    public EmployeePortal portal(String id, RequestOptions options) {
        return api.request("GET", "/v1/employees/" + ApiClient.encode(id) + "/portal", null, null, false, EmployeePortal.class, options);
    }

    public EmployeePortal portal(String id) {
        return portal(id, null);
    }

    /**
     * Activar, cambiar o apagar el portal
     * <p>
     * enable crea el enlace (o deja el que tiene), renew hace uno nuevo (el anterior deja de funcionar y sus celulares se desligan) y disable lo apaga. Lo firmado se queda. Con send_email se lo manda a su correo.
     * <p>
     * POST /v1/employees/{id}/portal
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/update-employee-portal
     */
    public EmployeePortal updatePortal(String id, UpdateEmployeePortalParams params, RequestOptions options) {
        return api.request("POST", "/v1/employees/" + ApiClient.encode(id) + "/portal", params, null, true, EmployeePortal.class, options);
    }

    public EmployeePortal updatePortal(String id, UpdateEmployeePortalParams params) {
        return updatePortal(id, params, null);
    }
}
