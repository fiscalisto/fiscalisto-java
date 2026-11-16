// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAttendanceMarkParams: los campos de «Registrar una marca».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateAttendanceMarkParams {
    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * in: entrada; out: salida.
     * <p>
     * Valores: in, out.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Cuándo marcó, con su zona horaria (2027-01-04T09:02:00-06:00). No en el futuro ni de hace más de 400 días.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("at")
    private String at;

    /**
     * Por qué se registra (se guarda y el empleado lo ve en su enlace). Por omisión «Registrada por la API».
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public CreateAttendanceMarkParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * in: entrada; out: salida.
     * <p>
     * Valores: in, out.
     * <p>
     * Obligatorio.
     */
    public String getKind() {
        return kind;
    }

    public CreateAttendanceMarkParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Cuándo marcó, con su zona horaria (2027-01-04T09:02:00-06:00). No en el futuro ni de hace más de 400 días.
     * <p>
     * Obligatorio.
     */
    public String getAt() {
        return at;
    }

    public CreateAttendanceMarkParams setAt(String at) {
        this.at = at;
        return this;
    }

    /**
     * Por qué se registra (se guarda y el empleado lo ve en su enlace). Por omisión «Registrada por la API».
     */
    public String getReason() {
        return reason;
    }

    public CreateAttendanceMarkParams setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
