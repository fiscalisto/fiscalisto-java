// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * IepsCustomersQuarterCustomer: IepsCustomersQuarterCustomer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IepsCustomersQuarterCustomer {
    /**
     * El RFC del cliente.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su nombre como viene en sus facturas.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cuántas facturas del trimestre llevan ese IEPS.
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * El IEPS que se le trasladó en el trimestre, en pesos.
     */
    @JsonProperty("ieps")
    private BigDecimal ieps;

    /**
     * El RFC del cliente.
     */
    public String getTaxId() {
        return taxId;
    }

    public IepsCustomersQuarterCustomer setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su nombre como viene en sus facturas.
     */
    public String getName() {
        return name;
    }

    public IepsCustomersQuarterCustomer setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cuántas facturas del trimestre llevan ese IEPS.
     */
    public Long getInvoices() {
        return invoices;
    }

    public IepsCustomersQuarterCustomer setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public IepsCustomersQuarterCustomer setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * El IEPS que se le trasladó en el trimestre, en pesos.
     */
    public BigDecimal getIeps() {
        return ieps;
    }

    public IepsCustomersQuarterCustomer setIeps(BigDecimal ieps) {
        this.ieps = ieps;
        return this;
    }

    @JsonIgnore
    public IepsCustomersQuarterCustomer setIeps(double ieps) {
        return setIeps(BigDecimal.valueOf(ieps));
    }
}
