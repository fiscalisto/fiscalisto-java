// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * EmployeeVacations: Las vacaciones de un empleado por año de servicio (LFT 76, 81 y 516).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeVacations {
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
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private StringOr<Employee> employee;

    /**
     * El día del saldo.
     */
    @JsonProperty("as_of")
    private String asOf;

    /**
     * Los días de años de servicio cumplidos que le quedan y no han prescrito: los que paga el finiquito.
     */
    @JsonProperty("pending_days")
    private BigDecimal pendingDays;

    /**
     * El año de servicio en curso.
     */
    @JsonProperty("current_year")
    private EmployeeVacationsCurrentYear currentYear;

    /**
     * Cada año de servicio cumplido, del más antiguo al más reciente.
     */
    @JsonProperty("years")
    private List<EmployeeVacationsYear> years;

    /**
     * El saldo de antes de Fiscalisto, o null.
     */
    @JsonProperty("opening")
    private EmployeeVacationsOpening opening;

    /**
     * Los días de vacaciones de sus recibos timbrados.
     */
    @JsonProperty("taken")
    private List<EmployeeVacationsTakenItem> taken;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EmployeeVacations setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public EmployeeVacations setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public StringOr<Employee> getEmployee() {
        return employee;
    }

    public EmployeeVacations setEmployee(StringOr<Employee> employee) {
        this.employee = employee;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public EmployeeVacations setEmployee(String id) {
        return setEmployee(StringOr.<Employee>id(id));
    }

    @JsonIgnore
    public EmployeeVacations setEmployee(Employee employee) {
        return setEmployee(StringOr.of(employee));
    }

    /**
     * El día del saldo.
     */
    public String getAsOf() {
        return asOf;
    }

    public EmployeeVacations setAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }

    /**
     * Los días de años de servicio cumplidos que le quedan y no han prescrito: los que paga el finiquito.
     */
    public BigDecimal getPendingDays() {
        return pendingDays;
    }

    public EmployeeVacations setPendingDays(BigDecimal pendingDays) {
        this.pendingDays = pendingDays;
        return this;
    }

    @JsonIgnore
    public EmployeeVacations setPendingDays(double pendingDays) {
        return setPendingDays(BigDecimal.valueOf(pendingDays));
    }

    /**
     * El año de servicio en curso.
     */
    public EmployeeVacationsCurrentYear getCurrentYear() {
        return currentYear;
    }

    public EmployeeVacations setCurrentYear(EmployeeVacationsCurrentYear currentYear) {
        this.currentYear = currentYear;
        return this;
    }

    /**
     * Cada año de servicio cumplido, del más antiguo al más reciente.
     */
    public List<EmployeeVacationsYear> getYears() {
        return years;
    }

    public EmployeeVacations setYears(List<EmployeeVacationsYear> years) {
        this.years = years;
        return this;
    }

    /**
     * El saldo de antes de Fiscalisto, o null.
     */
    public EmployeeVacationsOpening getOpening() {
        return opening;
    }

    public EmployeeVacations setOpening(EmployeeVacationsOpening opening) {
        this.opening = opening;
        return this;
    }

    /**
     * Los días de vacaciones de sus recibos timbrados.
     */
    public List<EmployeeVacationsTakenItem> getTaken() {
        return taken;
    }

    public EmployeeVacations setTaken(List<EmployeeVacationsTakenItem> taken) {
        this.taken = taken;
        return this;
    }
}
