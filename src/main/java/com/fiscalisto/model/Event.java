// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Event: Algo que pasó en su cuenta: el objeto completo como quedó. Se manda a sus webhooks firmado (Standard Webhooks).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Qué pasó: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, customer_data_request.completed, sat_download.completed, sat_download.failed, ticket.invoiced, ticket.included_in_global, issuer.ready o balance.low.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Versión de la API con que se armó el objeto.
     */
    @JsonProperty("api_version")
    private String apiVersion;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Lo que cambió, en data.object: el comprobante (o el lote) completo, como lo contesta su GET.
     */
    @JsonProperty("data")
    private EventData data;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Event setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Event setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Qué pasó: invoice.stamped, invoice.failed, invoice.canceled, invoice.cancellation_pending, invoice.cancellation_rejected, retention.stamped, retention.failed, retention.canceled, invoice_batch.completed, customer_data_request.completed, sat_download.completed, sat_download.failed, ticket.invoiced, ticket.included_in_global, issuer.ready o balance.low.
     */
    public String getType() {
        return type;
    }

    public Event setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Versión de la API con que se armó el objeto.
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public Event setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Event setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Event setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Lo que cambió, en data.object: el comprobante (o el lote) completo, como lo contesta su GET.
     */
    public EventData getData() {
        return data;
    }

    public Event setData(EventData data) {
        this.data = data;
        return this;
    }

    /**
     * data.object como su clase: Invoice en invoice.*, Retention en retention.*, InvoiceBatch en
     * invoice_batch.*, Balance en balance.low…
     * <p>
     * {@code Invoice invoice = event.dataObject(Invoice.class);}
     */
    public <T> T dataObject(Class<T> type) {
        if (data == null || data.getObject() == null) throw new IllegalStateException("El evento no trae data.object.");
        return com.fiscalisto.ApiClient.MAPPER.convertValue(data.getObject(), type);
    }
}
