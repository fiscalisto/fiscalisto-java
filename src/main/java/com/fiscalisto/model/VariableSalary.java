// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * VariableSalary: La parte variable del SDI de un bimestre (artículo 30 de la LSS): las horas extra triples, la prima dominical, otros ingresos y lo que los premios de puntualidad y asistencia pasan del 10% del SBC, entre los días trabajados.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariableSalary {
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
     * AAAA-B: 1 es enero–febrero, 6 noviembre–diciembre.
     */
    @JsonProperty("bimester")
    private String bimester;

    /**
     * El primer día del bimestre.
     */
    @JsonProperty("period_start")
    private String periodStart;

    /**
     * El último día del bimestre.
     */
    @JsonProperty("period_end")
    private String periodEnd;

    /**
     * Desde cuándo aplica: el primer día del bimestre siguiente.
     */
    @JsonProperty("effective_date")
    private String effectiveDate;

    /**
     * El último día para presentar la modificación en IDSE: el quinto día hábil del mes (artículo 34 de la LSS).
     */
    @JsonProperty("deadline")
    private String deadline;

    /**
     * Cada empleado con ingresos variables, o con una parte variable que cambia.
     */
    @JsonProperty("employees")
    private List<VariableSalaryEmployee> employees;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public VariableSalary setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public VariableSalary setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public VariableSalary setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public VariableSalary setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public VariableSalary setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * AAAA-B: 1 es enero–febrero, 6 noviembre–diciembre.
     */
    public String getBimester() {
        return bimester;
    }

    public VariableSalary setBimester(String bimester) {
        this.bimester = bimester;
        return this;
    }

    /**
     * El primer día del bimestre.
     */
    public String getPeriodStart() {
        return periodStart;
    }

    public VariableSalary setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
     * El último día del bimestre.
     */
    public String getPeriodEnd() {
        return periodEnd;
    }

    public VariableSalary setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    /**
     * Desde cuándo aplica: el primer día del bimestre siguiente.
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public VariableSalary setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * El último día para presentar la modificación en IDSE: el quinto día hábil del mes (artículo 34 de la LSS).
     */
    public String getDeadline() {
        return deadline;
    }

    public VariableSalary setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }

    /**
     * Cada empleado con ingresos variables, o con una parte variable que cambia.
     */
    public List<VariableSalaryEmployee> getEmployees() {
        return employees;
    }

    public VariableSalary setEmployees(List<VariableSalaryEmployee> employees) {
        this.employees = employees;
        return this;
    }
}
