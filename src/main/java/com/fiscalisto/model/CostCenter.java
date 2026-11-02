// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CostCenter: Un centro de costo del emisor: una obra, proyecto, sucursal o área por la que separa sus ingresos y gastos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CostCenter {
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
     * El emisor del centro de costo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cómo lo llama su equipo, por ejemplo «Obra Norte».
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su clave (por ejemplo «CC-01»), o null.
     */
    @JsonProperty("code")
    private String code;

    /**
     * true si está archivado: ya no se ponen facturas en él, pero las suyas lo conservan.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Cuántas facturas tiene, emitidas y recibidas.
     */
    @JsonProperty("invoices")
    private Long invoices;

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

    public CostCenter setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CostCenter setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CostCenter setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor del centro de costo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CostCenter setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cómo lo llama su equipo, por ejemplo «Obra Norte».
     */
    public String getName() {
        return name;
    }

    public CostCenter setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su clave (por ejemplo «CC-01»), o null.
     */
    public String getCode() {
        return code;
    }

    public CostCenter setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * true si está archivado: ya no se ponen facturas en él, pero las suyas lo conservan.
     */
    public Boolean getArchived() {
        return archived;
    }

    public CostCenter setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Cuántas facturas tiene, emitidas y recibidas.
     */
    public Long getInvoices() {
        return invoices;
    }

    public CostCenter setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public CostCenter setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public CostCenter setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo cambió por última vez.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public CostCenter setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
