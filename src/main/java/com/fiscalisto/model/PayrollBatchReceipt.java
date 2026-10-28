// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollBatchReceipt: PayrollBatchReceipt.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollBatchReceipt {
    /**
     * Su posición en receipts (o external_receipts), desde 0.
     */
    @JsonProperty("index")
    private Long index;

    /**
     * Su identificador de esta factura (su número de pedido), hasta 100 caracteres.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * El empleado (emp_…), cuando Fiscalisto calculó el recibo.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * El RFC del empleado.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Estado del objeto.
     * <p>
     * Valores: processing, valid, failed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El recibo (inv_…, una factura tipo N); también el que el SAT rechazó.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El neto del recibo timbrado.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Por qué no se timbró este recibo: su código y su mensaje.
     */
    @JsonProperty("error")
    private PayrollBatchReceiptError error;

    /**
     * Su posición en receipts (o external_receipts), desde 0.
     */
    public Long getIndex() {
        return index;
    }

    public PayrollBatchReceipt setIndex(Long index) {
        this.index = index;
        return this;
    }

    @JsonIgnore
    public PayrollBatchReceipt setIndex(long index) {
        return setIndex(Long.valueOf(index));
    }

    /**
     * Su identificador de esta factura (su número de pedido), hasta 100 caracteres.
     */
    public String getReference() {
        return reference;
    }

    public PayrollBatchReceipt setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * El empleado (emp_…), cuando Fiscalisto calculó el recibo.
     */
    public String getEmployee() {
        return employee;
    }

    public PayrollBatchReceipt setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * El RFC del empleado.
     */
    public String getTaxId() {
        return taxId;
    }

    public PayrollBatchReceipt setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollBatchReceipt setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Estado del objeto.
     * <p>
     * Valores: processing, valid, failed.
     */
    public String getStatus() {
        return status;
    }

    public PayrollBatchReceipt setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El recibo (inv_…, una factura tipo N); también el que el SAT rechazó.
     */
    public String getInvoice() {
        return invoice;
    }

    public PayrollBatchReceipt setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public PayrollBatchReceipt setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * El neto del recibo timbrado.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PayrollBatchReceipt setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayrollBatchReceipt setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Por qué no se timbró este recibo: su código y su mensaje.
     */
    public PayrollBatchReceiptError getError() {
        return error;
    }

    public PayrollBatchReceipt setError(PayrollBatchReceiptError error) {
        this.error = error;
        return this;
    }
}
