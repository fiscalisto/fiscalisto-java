// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateSalesOrderDeliveryParams: los campos de «Registrar una entrega».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSalesOrderDeliveryParams {
    /**
     * Cuánto sale de cada concepto. Por omisión, todo lo que falta por entregar.
     */
    @JsonProperty("items")
    private List<CreateSalesOrderDeliveryParamsItem> items;

    /**
     * Por omisión, hoy.
     */
    @JsonProperty("delivered_on")
    private String deliveredOn;

    /**
     * Transporte.
     */
    @JsonProperty("carrier")
    private String carrier;

    /**
     * Número de guía.
     */
    @JsonProperty("tracking")
    private String tracking;

    /**
     * Una nota en la remisión.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Quién recibió, si ya lo sabe (si no, su cliente lo firma en url).
     */
    @JsonProperty("received_by")
    private String receivedBy;

    /**
     * Cuánto sale de cada concepto. Por omisión, todo lo que falta por entregar.
     */
    public List<CreateSalesOrderDeliveryParamsItem> getItems() {
        return items;
    }

    public CreateSalesOrderDeliveryParams setItems(List<CreateSalesOrderDeliveryParamsItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Por omisión, hoy.
     */
    public String getDeliveredOn() {
        return deliveredOn;
    }

    public CreateSalesOrderDeliveryParams setDeliveredOn(String deliveredOn) {
        this.deliveredOn = deliveredOn;
        return this;
    }

    /**
     * Transporte.
     */
    public String getCarrier() {
        return carrier;
    }

    public CreateSalesOrderDeliveryParams setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * Número de guía.
     */
    public String getTracking() {
        return tracking;
    }

    public CreateSalesOrderDeliveryParams setTracking(String tracking) {
        this.tracking = tracking;
        return this;
    }

    /**
     * Una nota en la remisión.
     */
    public String getNote() {
        return note;
    }

    public CreateSalesOrderDeliveryParams setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Quién recibió, si ya lo sabe (si no, su cliente lo firma en url).
     */
    public String getReceivedBy() {
        return receivedBy;
    }

    public CreateSalesOrderDeliveryParams setReceivedBy(String receivedBy) {
        this.receivedBy = receivedBy;
        return this;
    }
}
