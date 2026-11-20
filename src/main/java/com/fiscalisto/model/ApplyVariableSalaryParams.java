// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ApplyVariableSalaryParams: los campos de «Aplicar el salario variable de un bimestre».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplyVariableSalaryParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El bimestre: AAAA-B, de 1 (enero–febrero) a 6 (noviembre–diciembre).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("bimester")
    private String bimester;

    /**
     * Los empleados (emp_…) a los que se aplica.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public ApplyVariableSalaryParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El bimestre: AAAA-B, de 1 (enero–febrero) a 6 (noviembre–diciembre).
     * <p>
     * Obligatorio.
     */
    public String getBimester() {
        return bimester;
    }

    public ApplyVariableSalaryParams setBimester(String bimester) {
        this.bimester = bimester;
        return this;
    }

    /**
     * Los empleados (emp_…) a los que se aplica.
     * <p>
     * Obligatorio.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public ApplyVariableSalaryParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }
}
