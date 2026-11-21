// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreatePayoutParams: los campos de «Preparar un pago a proveedores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayoutParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El día en que sale (AAAA-MM-DD, hoy o después). Por omisión, hoy: sale en cuanto lo firmen.
     */
    @JsonProperty("pay_on")
    private String payOn;

    /**
     * El nombre del lote («Fletes»), para encontrarlo en la app entre los lotes abiertos. Sin nombre, la app lo llama por su día («Lote del jueves 27 nov»).
     */
    @JsonProperty("name")
    private String name;

    /**
     * Una nota para quien lo revisa y lo firma.
     */
    @JsonProperty("note")
    private String note;

    /**
     * En un pago programado con facturas en otra moneda: official (el tipo de cambio oficial; si al salir se movió más de la tolerancia de Configurar pagos, se detiene hasta firmarlo de nuevo) o fixed (sale al tipo de cambio de hoy, se mueva o no). Por omisión, lo que diga Configurar pagos.
     * <p>
     * Valores: official, fixed.
     */
    @JsonProperty("exchange_rate")
    private String exchangeRate;

    /**
     * Las facturas recibidas a pagar (de 1 a 500). Las de un mismo proveedor van en una sola transferencia a su cuenta aprobada.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("invoices")
    private List<CreatePayoutParamsInvoice> invoices;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePayoutParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El día en que sale (AAAA-MM-DD, hoy o después). Por omisión, hoy: sale en cuanto lo firmen.
     */
    public String getPayOn() {
        return payOn;
    }

    public CreatePayoutParams setPayOn(String payOn) {
        this.payOn = payOn;
        return this;
    }

    /**
     * El nombre del lote («Fletes»), para encontrarlo en la app entre los lotes abiertos. Sin nombre, la app lo llama por su día («Lote del jueves 27 nov»).
     */
    public String getName() {
        return name;
    }

    public CreatePayoutParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Una nota para quien lo revisa y lo firma.
     */
    public String getNote() {
        return note;
    }

    public CreatePayoutParams setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * En un pago programado con facturas en otra moneda: official (el tipo de cambio oficial; si al salir se movió más de la tolerancia de Configurar pagos, se detiene hasta firmarlo de nuevo) o fixed (sale al tipo de cambio de hoy, se mueva o no). Por omisión, lo que diga Configurar pagos.
     * <p>
     * Valores: official, fixed.
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    public CreatePayoutParams setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * Las facturas recibidas a pagar (de 1 a 500). Las de un mismo proveedor van en una sola transferencia a su cuenta aprobada.
     * <p>
     * Obligatorio.
     */
    public List<CreatePayoutParamsInvoice> getInvoices() {
        return invoices;
    }

    public CreatePayoutParams setInvoices(List<CreatePayoutParamsInvoice> invoices) {
        this.invoices = invoices;
        return this;
    }
}
