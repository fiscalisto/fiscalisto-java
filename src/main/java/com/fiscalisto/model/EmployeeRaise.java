// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * EmployeeRaise: Un aumento de sueldo para varios empleados, con la modificación de salario de cada uno para el IMSS.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeRaise {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * iss_…
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * false con dry_run: no se guardó nada.
     */
    @JsonProperty("applied")
    private Boolean applied;

    /**
     * Desde cuándo rige: la fecha de la modificación de salario.
     */
    @JsonProperty("effective_date")
    private String effectiveDate;

    /**
     * El último día para presentar las modificaciones al IMSS (5 días hábiles).
     */
    @JsonProperty("imss_deadline")
    private String imssDeadline;

    /**
     * Cada empleado del aumento.
     */
    @JsonProperty("employees")
    private List<EmployeeRaiseEmployee> employees;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EmployeeRaise setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public EmployeeRaise setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * iss_…
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public EmployeeRaise setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public EmployeeRaise setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public EmployeeRaise setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * false con dry_run: no se guardó nada.
     */
    public Boolean getApplied() {
        return applied;
    }

    public EmployeeRaise setApplied(Boolean applied) {
        this.applied = applied;
        return this;
    }

    /**
     * Desde cuándo rige: la fecha de la modificación de salario.
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public EmployeeRaise setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * El último día para presentar las modificaciones al IMSS (5 días hábiles).
     */
    public String getImssDeadline() {
        return imssDeadline;
    }

    public EmployeeRaise setImssDeadline(String imssDeadline) {
        this.imssDeadline = imssDeadline;
        return this;
    }

    /**
     * Cada empleado del aumento.
     */
    public List<EmployeeRaiseEmployee> getEmployees() {
        return employees;
    }

    public EmployeeRaise setEmployees(List<EmployeeRaiseEmployee> employees) {
        this.employees = employees;
        return this;
    }
}
