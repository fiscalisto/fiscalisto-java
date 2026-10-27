// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Branch: Una sucursal del emisor: otro lugar desde donde factura, con su código postal (LugarExpedicion), su dirección en el PDF y sus series.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Branch {
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
     * El emisor de la sucursal.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cómo la llama su equipo; va en el PDF.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su código postal: el LugarExpedicion de sus CFDI.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * Su dirección, en el PDF de sus facturas.
     */
    @JsonProperty("address")
    private BranchAddress address;

    /**
     * Teléfono, en el PDF, o null.
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * Correo, en el PDF, o null.
     */
    @JsonProperty("email")
    private String email;

    /**
     * La serie de cada tipo de CFDI que se timbra desde ella; null usa la del emisor.
     */
    @JsonProperty("series")
    private BranchSeries series;

    /**
     * true si está archivada: ya no se factura desde ella.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Cuándo se creó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo cambió por última vez.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Branch setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Branch setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Branch setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor de la sucursal.
     */
    public String getIssuer() {
        return issuer;
    }

    public Branch setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cómo la llama su equipo; va en el PDF.
     */
    public String getName() {
        return name;
    }

    public Branch setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su código postal: el LugarExpedicion de sus CFDI.
     */
    public String getZip() {
        return zip;
    }

    public Branch setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Su dirección, en el PDF de sus facturas.
     */
    public BranchAddress getAddress() {
        return address;
    }

    public Branch setAddress(BranchAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Teléfono, en el PDF, o null.
     */
    public String getPhone() {
        return phone;
    }

    public Branch setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Correo, en el PDF, o null.
     */
    public String getEmail() {
        return email;
    }

    public Branch setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * La serie de cada tipo de CFDI que se timbra desde ella; null usa la del emisor.
     */
    public BranchSeries getSeries() {
        return series;
    }

    public Branch setSeries(BranchSeries series) {
        this.series = series;
        return this;
    }

    /**
     * true si está archivada: ya no se factura desde ella.
     */
    public Boolean getArchived() {
        return archived;
    }

    public Branch setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Branch setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo cambió por última vez.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public Branch setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
