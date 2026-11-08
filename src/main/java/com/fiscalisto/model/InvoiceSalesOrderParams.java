// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceSalesOrderParams: los campos de «Facturar un pedido».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceSalesOrderParams {
    /**
     * Cuánto facturar de cada concepto. Por omisión, lo entregado sin facturar (o todo lo pedido con invoice_policy ordered).
     */
    @JsonProperty("items")
    private List<InvoiceSalesOrderParamsItem> items;

    /**
     * Facturar también lo que aún no se entrega (con invoice_policy delivered).
     */
    @JsonProperty("include_undelivered")
    private Boolean includeUndelivered;

    /**
     * Registrar también la entrega de lo que lleva la factura al timbrarla (venta de mostrador).
     */
    @JsonProperty("deliver")
    private Boolean deliver;

    /**
     * Cuánto facturar de cada concepto. Por omisión, lo entregado sin facturar (o todo lo pedido con invoice_policy ordered).
     */
    public List<InvoiceSalesOrderParamsItem> getItems() {
        return items;
    }

    public InvoiceSalesOrderParams setItems(List<InvoiceSalesOrderParamsItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Facturar también lo que aún no se entrega (con invoice_policy delivered).
     */
    public Boolean getIncludeUndelivered() {
        return includeUndelivered;
    }

    public InvoiceSalesOrderParams setIncludeUndelivered(Boolean includeUndelivered) {
        this.includeUndelivered = includeUndelivered;
        return this;
    }

    /**
     * Registrar también la entrega de lo que lleva la factura al timbrarla (venta de mostrador).
     */
    public Boolean getDeliver() {
        return deliver;
    }

    public InvoiceSalesOrderParams setDeliver(Boolean deliver) {
        this.deliver = deliver;
        return this;
    }
}
