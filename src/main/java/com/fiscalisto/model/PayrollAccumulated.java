// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollAccumulated: Los acumulados de nómina del año: por concepto, mes por mes, y por empleado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollAccumulated {
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
    private String issuer;

    /**
     * Año (Ejercicio).
     */
    @JsonProperty("year")
    private BigDecimal year;

    /**
     * El empleado que pidió (emp_…), o null.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Los recibos vigentes con fecha de pago en el año.
     */
    @JsonProperty("receipts")
    private BigDecimal receipts;

    /**
     * Percepciones, luego deducciones y otros pagos, por clave del SAT.
     */
    @JsonProperty("concepts")
    private List<PayrollAccumulatedConcept> concepts;

    /**
     * Cada empleado, de más a menos percepciones.
     */
    @JsonProperty("employees")
    private List<PayrollAccumulatedEmployee> employees;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollAccumulated setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollAccumulated setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * iss_…
     */
    public String getIssuer() {
        return issuer;
    }

    public PayrollAccumulated setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Año (Ejercicio).
     */
    public BigDecimal getYear() {
        return year;
    }

    public PayrollAccumulated setYear(BigDecimal year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulated setYear(double year) {
        return setYear(BigDecimal.valueOf(year));
    }

    /**
     * El empleado que pidió (emp_…), o null.
     */
    public String getEmployee() {
        return employee;
    }

    public PayrollAccumulated setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Los recibos vigentes con fecha de pago en el año.
     */
    public BigDecimal getReceipts() {
        return receipts;
    }

    public PayrollAccumulated setReceipts(BigDecimal receipts) {
        this.receipts = receipts;
        return this;
    }

    @JsonIgnore
    public PayrollAccumulated setReceipts(double receipts) {
        return setReceipts(BigDecimal.valueOf(receipts));
    }

    /**
     * Percepciones, luego deducciones y otros pagos, por clave del SAT.
     */
    public List<PayrollAccumulatedConcept> getConcepts() {
        return concepts;
    }

    public PayrollAccumulated setConcepts(List<PayrollAccumulatedConcept> concepts) {
        this.concepts = concepts;
        return this;
    }

    /**
     * Cada empleado, de más a menos percepciones.
     */
    public List<PayrollAccumulatedEmployee> getEmployees() {
        return employees;
    }

    public PayrollAccumulated setEmployees(List<PayrollAccumulatedEmployee> employees) {
        this.employees = employees;
        return this;
    }
}
