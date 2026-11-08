// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpensePerson: Alguien que viaja o gasta por el emisor: un empleado (de Nómina) o alguien por honorarios. Tiene un enlace propio para subir sus facturas sin cuenta.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpensePerson {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor por el que gasta.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * empleado (sueldos y salarios: viáticos exentos en su recibo de nómina) o honorarios.
     * <p>
     * Valores: empleado, honorarios.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Su empleado de Nómina (emp_…), o null si es por honorarios.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su RFC, o null.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su correo, a donde se le manda su enlace y los avisos, o null.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Dónde trabaja: un viaje a más de 50 km de ahí es de viáticos.
     */
    @JsonProperty("base_city")
    private String baseCity;

    /**
     * Su área, o null.
     */
    @JsonProperty("department")
    private String department;

    /**
     * true si tiene un enlace que funciona para subir sus facturas.
     */
    @JsonProperty("link_active")
    private Boolean linkActive;

    /**
     * true si está archivada.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Cuándo se agregó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ExpensePerson setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ExpensePerson setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ExpensePerson setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor por el que gasta.
     */
    public String getIssuer() {
        return issuer;
    }

    public ExpensePerson setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * empleado (sueldos y salarios: viáticos exentos en su recibo de nómina) o honorarios.
     * <p>
     * Valores: empleado, honorarios.
     */
    public String getKind() {
        return kind;
    }

    public ExpensePerson setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Su empleado de Nómina (emp_…), o null si es por honorarios.
     */
    public String getEmployee() {
        return employee;
    }

    public ExpensePerson setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public ExpensePerson setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su RFC, o null.
     */
    public String getTaxId() {
        return taxId;
    }

    public ExpensePerson setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su correo, a donde se le manda su enlace y los avisos, o null.
     */
    public String getEmail() {
        return email;
    }

    public ExpensePerson setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Dónde trabaja: un viaje a más de 50 km de ahí es de viáticos.
     */
    public String getBaseCity() {
        return baseCity;
    }

    public ExpensePerson setBaseCity(String baseCity) {
        this.baseCity = baseCity;
        return this;
    }

    /**
     * Su área, o null.
     */
    public String getDepartment() {
        return department;
    }

    public ExpensePerson setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * true si tiene un enlace que funciona para subir sus facturas.
     */
    public Boolean getLinkActive() {
        return linkActive;
    }

    public ExpensePerson setLinkActive(Boolean linkActive) {
        this.linkActive = linkActive;
        return this;
    }

    /**
     * true si está archivada.
     */
    public Boolean getArchived() {
        return archived;
    }

    public ExpensePerson setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Cuándo se agregó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ExpensePerson setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
