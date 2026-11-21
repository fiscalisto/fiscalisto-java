// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreatePayoutParamsPayment: CreatePayoutParamsPayment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayoutParamsPayment {
    /**
     * El RFC de quien recibe (un proveedor o una persona), con una cuenta aprobada en Cuentas de proveedores.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su nombre, como se ve en el pago.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cuánto mandarle, en pesos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Qué se paga («Nómina 1.ª quincena de noviembre», «Anticipo»). Si Configurar pagos lo pide, es obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Si nunca llevará factura (una nómina, cuyo CFDI es el recibo; un reembolso), por qué: no se le pide factura ni aparece en Pagos sin factura. Sin él, se le pide como a cualquier pago sin factura.
     */
    @JsonProperty("no_invoice_reason")
    private String noInvoiceReason;

    /**
     * El RFC de quien recibe (un proveedor o una persona), con una cuenta aprobada en Cuentas de proveedores.
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public CreatePayoutParamsPayment setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su nombre, como se ve en el pago.
     */
    public String getName() {
        return name;
    }

    public CreatePayoutParamsPayment setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cuánto mandarle, en pesos.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreatePayoutParamsPayment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreatePayoutParamsPayment setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Qué se paga («Nómina 1.ª quincena de noviembre», «Anticipo»). Si Configurar pagos lo pide, es obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public CreatePayoutParamsPayment setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Si nunca llevará factura (una nómina, cuyo CFDI es el recibo; un reembolso), por qué: no se le pide factura ni aparece en Pagos sin factura. Sin él, se le pide como a cualquier pago sin factura.
     */
    public String getNoInvoiceReason() {
        return noInvoiceReason;
    }

    public CreatePayoutParamsPayment setNoInvoiceReason(String noInvoiceReason) {
        this.noInvoiceReason = noInvoiceReason;
        return this;
    }
}
