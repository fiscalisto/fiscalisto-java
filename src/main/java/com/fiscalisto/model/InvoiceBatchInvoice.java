// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceBatchInvoice: InvoiceBatchInvoice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceBatchInvoice {
    /**
     * Su posición en invoices, desde 0.
     */
    @JsonProperty("index")
    private Long index;

    /**
     * Su identificador de esta factura (su número de pedido), hasta 100 caracteres.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * processing, valid (timbrada) o failed (no se timbró; ver error).
     * <p>
     * Valores: processing, valid, failed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La factura timbrada (inv_…).
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Por qué no se timbró.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Su posición en invoices, desde 0.
     */
    public Long getIndex() {
        return index;
    }

    public InvoiceBatchInvoice setIndex(Long index) {
        this.index = index;
        return this;
    }

    public InvoiceBatchInvoice setIndex(long index) {
        return setIndex(Long.valueOf(index));
    }

    /**
     * Su identificador de esta factura (su número de pedido), hasta 100 caracteres.
     */
    public String getReference() {
        return reference;
    }

    public InvoiceBatchInvoice setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * processing, valid (timbrada) o failed (no se timbró; ver error).
     * <p>
     * Valores: processing, valid, failed.
     */
    public String getStatus() {
        return status;
    }

    public InvoiceBatchInvoice setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La factura timbrada (inv_…).
     */
    public String getInvoice() {
        return invoice;
    }

    public InvoiceBatchInvoice setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public InvoiceBatchInvoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public InvoiceBatchInvoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public InvoiceBatchInvoice setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Por qué no se timbró.
     */
    public String getError() {
        return error;
    }

    public InvoiceBatchInvoice setError(String error) {
        this.error = error;
        return this;
    }
}
