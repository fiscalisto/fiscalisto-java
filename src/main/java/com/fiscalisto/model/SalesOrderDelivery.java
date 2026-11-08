// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SalesOrderDelivery: Una entrega del pedido, con su remisión (REM-1): lo que salió del almacén.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesOrderDelivery {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Su remisión (REM-1).
     */
    @JsonProperty("number")
    private String number;

    /**
     * delivered, o canceled (la mercancía regresó al almacén).
     * <p>
     * Valores: delivered, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El día en que salió (AAAA-MM-DD).
     */
    @JsonProperty("delivered_on")
    private String deliveredOn;

    /**
     * El transporte, o null.
     */
    @JsonProperty("carrier")
    private String carrier;

    /**
     * El número de guía, o null.
     */
    @JsonProperty("tracking")
    private String tracking;

    /**
     * Una nota, o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Quién recibió (lo firmó en la liga o lo anotó usted), o null.
     */
    @JsonProperty("received_by")
    private String receivedBy;

    /**
     * Cuándo se recibió, o null.
     */
    @JsonProperty("received_at")
    private String receivedAt;

    /**
     * Cuánto salió de cada concepto (line es items[].id del pedido).
     */
    @JsonProperty("items")
    private List<SalesOrderDeliveryItem> items;

    /**
     * Cuándo se registró.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public SalesOrderDelivery setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SalesOrderDelivery setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Su remisión (REM-1).
     */
    public String getNumber() {
        return number;
    }

    public SalesOrderDelivery setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * delivered, o canceled (la mercancía regresó al almacén).
     * <p>
     * Valores: delivered, canceled.
     */
    public String getStatus() {
        return status;
    }

    public SalesOrderDelivery setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El día en que salió (AAAA-MM-DD).
     */
    public String getDeliveredOn() {
        return deliveredOn;
    }

    public SalesOrderDelivery setDeliveredOn(String deliveredOn) {
        this.deliveredOn = deliveredOn;
        return this;
    }

    /**
     * El transporte, o null.
     */
    public String getCarrier() {
        return carrier;
    }

    public SalesOrderDelivery setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * El número de guía, o null.
     */
    public String getTracking() {
        return tracking;
    }

    public SalesOrderDelivery setTracking(String tracking) {
        this.tracking = tracking;
        return this;
    }

    /**
     * Una nota, o null.
     */
    public String getNote() {
        return note;
    }

    public SalesOrderDelivery setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Quién recibió (lo firmó en la liga o lo anotó usted), o null.
     */
    public String getReceivedBy() {
        return receivedBy;
    }

    public SalesOrderDelivery setReceivedBy(String receivedBy) {
        this.receivedBy = receivedBy;
        return this;
    }

    /**
     * Cuándo se recibió, o null.
     */
    public String getReceivedAt() {
        return receivedAt;
    }

    public SalesOrderDelivery setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Cuánto salió de cada concepto (line es items[].id del pedido).
     */
    public List<SalesOrderDeliveryItem> getItems() {
        return items;
    }

    public SalesOrderDelivery setItems(List<SalesOrderDeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Cuándo se registró.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public SalesOrderDelivery setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
