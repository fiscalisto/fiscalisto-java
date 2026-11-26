// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;

/**
 * PayrollOrgChartVacancy: PayrollOrgChartVacancy.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollOrgChartVacancy {
    /**
     * La vacante (vac_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * El puesto.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Departamento (Departamento).
     */
    @JsonProperty("department")
    private String department;

    /**
     * Bajo qué jefe (emp_…).
     */
    @JsonProperty("manager")
    private StringOr<Employee> manager;

    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * Desde cuándo está abierta (YYYY-MM-DD).
     */
    @JsonProperty("opened_on")
    private String openedOn;

    /**
     * pending_approval espera el visto bueno de alguien con el permiso «Aprobar la prenómina» (las que abre una llave de API, y las que abre o cambia quien no lo tiene); approved ya se puede cubrir. En el organigrama salen solo estas dos.
     * <p>
     * Valores: pending_approval, approved, rejected, filled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Sueldo mensual bruto que ofrece, desde.
     */
    @JsonProperty("salary_min")
    private BigDecimal salaryMin;

    /**
     * Sueldo mensual bruto que ofrece, hasta.
     */
    @JsonProperty("salary_max")
    private BigDecimal salaryMax;

    /**
     * Estado donde trabajará (c_Estado), si se dijo.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Lo que costaría a la empresa al mes: el sueldo, las cuotas patronales (primer año, prestaciones de ley, la prima de riesgo del emisor) y el impuesto sobre nómina de su estado. null sin sueldo.
     */
    @JsonProperty("monthly_cost")
    private PayrollOrgChartVacancyMonthlyCost monthlyCost;

    /**
     * La vacante (vac_…).
     */
    public String getId() {
        return id;
    }

    public PayrollOrgChartVacancy setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * El puesto.
     */
    public String getTitle() {
        return title;
    }

    public PayrollOrgChartVacancy setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Departamento (Departamento).
     */
    public String getDepartment() {
        return department;
    }

    public PayrollOrgChartVacancy setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Bajo qué jefe (emp_…).
     */
    public StringOr<Employee> getManager() {
        return manager;
    }

    public PayrollOrgChartVacancy setManager(StringOr<Employee> manager) {
        this.manager = manager;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public PayrollOrgChartVacancy setManager(String id) {
        return setManager(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public PayrollOrgChartVacancy setManager(Employee manager) {
        return setManager(StringOr.of(manager));
    }

    /**
     * Sucursal (brn_…) desde donde se factura: su código postal va en LugarExpedicion, su dirección en el PDF y, si las tiene, sus series. Sin ella, el domicilio fiscal del emisor (la Matriz).
     */
    public String getBranch() {
        return branch;
    }

    public PayrollOrgChartVacancy setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Desde cuándo está abierta (YYYY-MM-DD).
     */
    public String getOpenedOn() {
        return openedOn;
    }

    public PayrollOrgChartVacancy setOpenedOn(String openedOn) {
        this.openedOn = openedOn;
        return this;
    }

    /**
     * pending_approval espera el visto bueno de alguien con el permiso «Aprobar la prenómina» (las que abre una llave de API, y las que abre o cambia quien no lo tiene); approved ya se puede cubrir. En el organigrama salen solo estas dos.
     * <p>
     * Valores: pending_approval, approved, rejected, filled.
     */
    public String getStatus() {
        return status;
    }

    public PayrollOrgChartVacancy setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Sueldo mensual bruto que ofrece, desde.
     */
    public BigDecimal getSalaryMin() {
        return salaryMin;
    }

    public PayrollOrgChartVacancy setSalaryMin(BigDecimal salaryMin) {
        this.salaryMin = salaryMin;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartVacancy setSalaryMin(double salaryMin) {
        return setSalaryMin(BigDecimal.valueOf(salaryMin));
    }

    /**
     * Sueldo mensual bruto que ofrece, hasta.
     */
    public BigDecimal getSalaryMax() {
        return salaryMax;
    }

    public PayrollOrgChartVacancy setSalaryMax(BigDecimal salaryMax) {
        this.salaryMax = salaryMax;
        return this;
    }

    @JsonIgnore
    public PayrollOrgChartVacancy setSalaryMax(double salaryMax) {
        return setSalaryMax(BigDecimal.valueOf(salaryMax));
    }

    /**
     * Estado donde trabajará (c_Estado), si se dijo.
     */
    public String getState() {
        return state;
    }

    public PayrollOrgChartVacancy setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Lo que costaría a la empresa al mes: el sueldo, las cuotas patronales (primer año, prestaciones de ley, la prima de riesgo del emisor) y el impuesto sobre nómina de su estado. null sin sueldo.
     */
    public PayrollOrgChartVacancyMonthlyCost getMonthlyCost() {
        return monthlyCost;
    }

    public PayrollOrgChartVacancy setMonthlyCost(PayrollOrgChartVacancyMonthlyCost monthlyCost) {
        this.monthlyCost = monthlyCost;
        return this;
    }
}
