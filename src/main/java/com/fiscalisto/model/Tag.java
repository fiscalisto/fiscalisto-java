// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Tag: Una etiqueta del emisor: una palabra suya para juntar facturas y órdenes de compra.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tag {
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
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * El emisor de la etiqueta.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cómo la llama su equipo, por ejemplo «Obra Norte».
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su color: info, positive, warning, critical o muted.
     * <p>
     * Valores: info, positive, warning, critical, muted.
     */
    @JsonProperty("color")
    private String color;

    /**
     * Cuántas órdenes de compra la llevan.
     */
    @JsonProperty("purchase_orders")
    private Long purchaseOrders;

    /**
     * Cuántas facturas la llevan, emitidas y recibidas.
     */
    @JsonProperty("invoices")
    private Long invoices;

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

    public Tag setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Tag setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Tag setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public Tag setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * El emisor de la etiqueta.
     */
    public String getIssuer() {
        return issuer;
    }

    public Tag setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cómo la llama su equipo, por ejemplo «Obra Norte».
     */
    public String getName() {
        return name;
    }

    public Tag setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su color: info, positive, warning, critical o muted.
     * <p>
     * Valores: info, positive, warning, critical, muted.
     */
    public String getColor() {
        return color;
    }

    public Tag setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Cuántas órdenes de compra la llevan.
     */
    public Long getPurchaseOrders() {
        return purchaseOrders;
    }

    public Tag setPurchaseOrders(Long purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
        return this;
    }

    @JsonIgnore
    public Tag setPurchaseOrders(long purchaseOrders) {
        return setPurchaseOrders(Long.valueOf(purchaseOrders));
    }

    /**
     * Cuántas facturas la llevan, emitidas y recibidas.
     */
    public Long getInvoices() {
        return invoices;
    }

    public Tag setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public Tag setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Tag setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
