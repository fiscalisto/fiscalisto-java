// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * PayrollOrgChart: El organigrama de los empleados del emisor: jefes, departamentos, sucursales y vacantes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollOrgChart {
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * El día del organigrama (YYYY-MM-DD): salen quienes trabajan ese día.
     */
    @JsonProperty("as_of")
    private String asOf;

    /**
     * Las cuentas del organigrama y lo que conviene revisar.
     */
    @JsonProperty("summary")
    private PayrollOrgChartSummary summary;

    /**
     * Los empleados arriba de todo (sin jefe), el del equipo más grande primero.
     */
    @JsonProperty("top")
    private List<String> top;

    /**
     * Los empleados de hoy, cada uno con su jefe y su equipo.
     */
    @JsonProperty("employees")
    private List<PayrollOrgChartEmployee> employees;

    /**
     * Los departamentos, cada uno después del de arriba.
     */
    @JsonProperty("departments")
    private List<PayrollOrgChartDepartment> departments;

    /**
     * Los puestos sin persona todavía.
     */
    @JsonProperty("vacancies")
    private List<PayrollOrgChartVacancy> vacancies;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollOrgChart setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollOrgChart setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public PayrollOrgChart setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public PayrollOrgChart setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public PayrollOrgChart setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * El día del organigrama (YYYY-MM-DD): salen quienes trabajan ese día.
     */
    public String getAsOf() {
        return asOf;
    }

    public PayrollOrgChart setAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }

    /**
     * Las cuentas del organigrama y lo que conviene revisar.
     */
    public PayrollOrgChartSummary getSummary() {
        return summary;
    }

    public PayrollOrgChart setSummary(PayrollOrgChartSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Los empleados arriba de todo (sin jefe), el del equipo más grande primero.
     */
    public List<String> getTop() {
        return top;
    }

    public PayrollOrgChart setTop(List<String> top) {
        this.top = top;
        return this;
    }

    /**
     * Los empleados de hoy, cada uno con su jefe y su equipo.
     */
    public List<PayrollOrgChartEmployee> getEmployees() {
        return employees;
    }

    public PayrollOrgChart setEmployees(List<PayrollOrgChartEmployee> employees) {
        this.employees = employees;
        return this;
    }

    /**
     * Los departamentos, cada uno después del de arriba.
     */
    public List<PayrollOrgChartDepartment> getDepartments() {
        return departments;
    }

    public PayrollOrgChart setDepartments(List<PayrollOrgChartDepartment> departments) {
        this.departments = departments;
        return this;
    }

    /**
     * Los puestos sin persona todavía.
     */
    public List<PayrollOrgChartVacancy> getVacancies() {
        return vacancies;
    }

    public PayrollOrgChart setVacancies(List<PayrollOrgChartVacancy> vacancies) {
        this.vacancies = vacancies;
        return this;
    }
}
