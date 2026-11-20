// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ApplyVariableSalaryParams;
import com.fiscalisto.model.GetVariableSalaryParams;
import com.fiscalisto.model.VariableSalary;

/**
 * Nómina: client.variableSalaries().
 */
public final class VariableSalariesService {
    private final ApiClient api;

    VariableSalariesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Salario variable de un bimestre
     * <p>
     * Lo que las horas extra triples, la prima dominical, otros ingresos y lo que los premios de puntualidad y asistencia pasan del 10% del SBC suman al SDI de cada empleado, de los recibos timbrados del bimestre, entre sus días trabajados (artículos 27 y 30 de la LSS). Las horas dobles no cuentan. No cambia nada: aplíquelo con POST /v1/variable_salaries.
     * <p>
     * GET /v1/variable_salaries
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-variable-salary
     */
    public VariableSalary get(GetVariableSalaryParams params, RequestOptions options) {
        return api.request("GET", "/v1/variable_salaries", null, params, false, VariableSalary.class, options);
    }

    public VariableSalary get(GetVariableSalaryParams params) {
        return get(params, null);
    }

    /**
     * Aplicar el salario variable de un bimestre
     * <p>
     * A los empleados que diga: su parte variable del SDI desde el primer día del bimestre siguiente (los recibos de periodos anteriores siguen con la que tenían) y la modificación de salario pendiente de presentar en IDSE (GET /v1/imss_movements), a más tardar el quinto día hábil del mes (artículo 34 de la LSS). Repetirlo no hace nada.
     * <p>
     * POST /v1/variable_salaries
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/apply-variable-salary
     */
    public VariableSalary apply(ApplyVariableSalaryParams params, RequestOptions options) {
        return api.request("POST", "/v1/variable_salaries", params, null, true, VariableSalary.class, options);
    }

    public VariableSalary apply(ApplyVariableSalaryParams params) {
        return apply(params, null);
    }
}
