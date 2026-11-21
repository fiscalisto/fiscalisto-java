// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceOrigin: InvoiceOrigin.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceOrigin {
    /**
     * Qué la timbró: `app` (una persona en Fiscalisto), `api`, `assistant` (un asistente de IA por MCP), `point_of_sale` (una llave de punto de venta), `autofactura` (su cliente con un ticket, o los datos del comprador de Stripe o Mercado Libre), `invoice_link` (su cliente al llenar el enlace de factura), `quote` (su cliente al aceptar la cotización), `recurring_invoice` (una factura recurrente sola) o `global_invoice` (la factura global automática de los tickets).
     * <p>
     * Valores: app, api, assistant, point_of_sale, autofactura, invoice_link, quote, recurring_invoice, global_invoice.
     */
    @JsonProperty("type")
    private String type;

    /**
     * El nombre de la llave de la API o del punto de venta, el asistente («ChatGPT») o de dónde vinieron los datos del comprador en una autofactura («Stripe»).
     */
    @JsonProperty("name")
    private String name;

    /**
     * Qué la timbró: `app` (una persona en Fiscalisto), `api`, `assistant` (un asistente de IA por MCP), `point_of_sale` (una llave de punto de venta), `autofactura` (su cliente con un ticket, o los datos del comprador de Stripe o Mercado Libre), `invoice_link` (su cliente al llenar el enlace de factura), `quote` (su cliente al aceptar la cotización), `recurring_invoice` (una factura recurrente sola) o `global_invoice` (la factura global automática de los tickets).
     * <p>
     * Valores: app, api, assistant, point_of_sale, autofactura, invoice_link, quote, recurring_invoice, global_invoice.
     */
    public String getType() {
        return type;
    }

    public InvoiceOrigin setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * El nombre de la llave de la API o del punto de venta, el asistente («ChatGPT») o de dónde vinieron los datos del comprador en una autofactura («Stripe»).
     */
    public String getName() {
        return name;
    }

    public InvoiceOrigin setName(String name) {
        this.name = name;
        return this;
    }
}
