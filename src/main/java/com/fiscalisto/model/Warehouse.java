// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Warehouse: Un almacén del emisor: el de la Matriz y uno por sucursal se crean solos; cada factura saca existencias del de su sucursal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Warehouse {
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
     * El emisor del almacén.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su nombre («Matriz», el de su sucursal, o el que le dieron en la app).
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su clave corta, o null.
     */
    @JsonProperty("code")
    private String code;

    /**
     * warehouse (almacén propio) o consignment (mercancía en consignación con un cliente, todavía suya).
     * <p>
     * Valores: warehouse, consignment.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Su sucursal (brn_…), o null si es de la Matriz.
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * true si es el almacén del que vende y recibe su sucursal.
     */
    @JsonProperty("default")
    private Boolean default_;

    /**
     * true si está archivado.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Cuándo se creó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Warehouse setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Warehouse setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Warehouse setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor del almacén.
     */
    public String getIssuer() {
        return issuer;
    }

    public Warehouse setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su nombre («Matriz», el de su sucursal, o el que le dieron en la app).
     */
    public String getName() {
        return name;
    }

    public Warehouse setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su clave corta, o null.
     */
    public String getCode() {
        return code;
    }

    public Warehouse setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * warehouse (almacén propio) o consignment (mercancía en consignación con un cliente, todavía suya).
     * <p>
     * Valores: warehouse, consignment.
     */
    public String getType() {
        return type;
    }

    public Warehouse setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Su sucursal (brn_…), o null si es de la Matriz.
     */
    public String getBranch() {
        return branch;
    }

    public Warehouse setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * true si es el almacén del que vende y recibe su sucursal.
     */
    public Boolean getDefault() {
        return default_;
    }

    public Warehouse setDefault(Boolean default_) {
        this.default_ = default_;
        return this;
    }

    /**
     * true si está archivado.
     */
    public Boolean getArchived() {
        return archived;
    }

    public Warehouse setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Warehouse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
