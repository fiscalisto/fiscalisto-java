// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateExpensePersonParams: los campos de «Agregar a una persona».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExpensePersonParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * empleado (sus viáticos van en su recibo de nómina; sus facturas pueden ir a su nombre en un viaje) o honorarios (sus facturas deben ir a nombre del emisor).
     * <p>
     * Valores: empleado, honorarios.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Un empleado de Nómina (emp_…): su nombre, RFC y correo se toman de ahí y sus viáticos van en su recibo. Solo con kind empleado.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su nombre. Obligatorio sin employee.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su RFC.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su correo: para mandarle su enlace y avisarle cuando se aprueba o se le paga.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Dónde trabaja (por ejemplo «Guadalajara, Jal.»): un viaje a menos de 50 km no es deducible como viáticos.
     */
    @JsonProperty("base_city")
    private String baseCity;

    /**
     * Su área.
     */
    @JsonProperty("department")
    private String department;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateExpensePersonParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * empleado (sus viáticos van en su recibo de nómina; sus facturas pueden ir a su nombre en un viaje) o honorarios (sus facturas deben ir a nombre del emisor).
     * <p>
     * Valores: empleado, honorarios.
     * <p>
     * Obligatorio.
     */
    public String getKind() {
        return kind;
    }

    public CreateExpensePersonParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Un empleado de Nómina (emp_…): su nombre, RFC y correo se toman de ahí y sus viáticos van en su recibo. Solo con kind empleado.
     */
    public String getEmployee() {
        return employee;
    }

    public CreateExpensePersonParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su nombre. Obligatorio sin employee.
     */
    public String getName() {
        return name;
    }

    public CreateExpensePersonParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public CreateExpensePersonParams setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su correo: para mandarle su enlace y avisarle cuando se aprueba o se le paga.
     */
    public String getEmail() {
        return email;
    }

    public CreateExpensePersonParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Dónde trabaja (por ejemplo «Guadalajara, Jal.»): un viaje a menos de 50 km no es deducible como viáticos.
     */
    public String getBaseCity() {
        return baseCity;
    }

    public CreateExpensePersonParams setBaseCity(String baseCity) {
        this.baseCity = baseCity;
        return this;
    }

    /**
     * Su área.
     */
    public String getDepartment() {
        return department;
    }

    public CreateExpensePersonParams setDepartment(String department) {
        this.department = department;
        return this;
    }
}
