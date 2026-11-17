// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CompanyReportSuppliersParty: CompanyReportSuppliersParty.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportSuppliersParty {
    /**
     * Su RFC. XAXX010101000 y XEXX010101000 son una sola fila cada uno («Público en general», «Residentes en el extranjero») con todas las personas que facturaron con ese RFC.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Lo facturado en el periodo, sin impuestos.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Por ciento del total.
     */
    @JsonProperty("share")
    private BigDecimal share;

    /**
     * Cuántas facturas del periodo.
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * Lo pendiente de cobrar o pagar.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * Su RFC. XAXX010101000 y XEXX010101000 son una sola fila cada uno («Público en general», «Residentes en el extranjero») con todas las personas que facturaron con ese RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public CompanyReportSuppliersParty setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public CompanyReportSuppliersParty setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Lo facturado en el periodo, sin impuestos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CompanyReportSuppliersParty setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CompanyReportSuppliersParty setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Por ciento del total.
     */
    public BigDecimal getShare() {
        return share;
    }

    public CompanyReportSuppliersParty setShare(BigDecimal share) {
        this.share = share;
        return this;
    }

    @JsonIgnore
    public CompanyReportSuppliersParty setShare(double share) {
        return setShare(BigDecimal.valueOf(share));
    }

    /**
     * Cuántas facturas del periodo.
     */
    public Long getInvoices() {
        return invoices;
    }

    public CompanyReportSuppliersParty setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public CompanyReportSuppliersParty setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * Lo pendiente de cobrar o pagar.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public CompanyReportSuppliersParty setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public CompanyReportSuppliersParty setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }
}
