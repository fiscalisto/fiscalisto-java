// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateExpensePersonParams: los campos de «Actualizar una persona».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateExpensePersonParams {
    /**
     * empleado (sus viáticos van en su recibo de nómina; sus facturas pueden ir a su nombre en un viaje) o honorarios (sus facturas deben ir a nombre del emisor).
     * <p>
     * Valores: empleado, honorarios.
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
     * true la archiva (y apaga su enlace): ya no se le abren comprobaciones. false la restaura.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * empleado (sus viáticos van en su recibo de nómina; sus facturas pueden ir a su nombre en un viaje) o honorarios (sus facturas deben ir a nombre del emisor).
     * <p>
     * Valores: empleado, honorarios.
     */
    public String getKind() {
        return kind;
    }

    public UpdateExpensePersonParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Un empleado de Nómina (emp_…): su nombre, RFC y correo se toman de ahí y sus viáticos van en su recibo. Solo con kind empleado.
     */
    public String getEmployee() {
        return employee;
    }

    public UpdateExpensePersonParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su nombre. Obligatorio sin employee.
     */
    public String getName() {
        return name;
    }

    public UpdateExpensePersonParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public UpdateExpensePersonParams setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su correo: para mandarle su enlace y avisarle cuando se aprueba o se le paga.
     */
    public String getEmail() {
        return email;
    }

    public UpdateExpensePersonParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Dónde trabaja (por ejemplo «Guadalajara, Jal.»): un viaje a menos de 50 km no es deducible como viáticos.
     */
    public String getBaseCity() {
        return baseCity;
    }

    public UpdateExpensePersonParams setBaseCity(String baseCity) {
        this.baseCity = baseCity;
        return this;
    }

    /**
     * Su área.
     */
    public String getDepartment() {
        return department;
    }

    public UpdateExpensePersonParams setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * true la archiva (y apaga su enlace): ya no se le abren comprobaciones. false la restaura.
     */
    public Boolean getArchived() {
        return archived;
    }

    public UpdateExpensePersonParams setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
}
