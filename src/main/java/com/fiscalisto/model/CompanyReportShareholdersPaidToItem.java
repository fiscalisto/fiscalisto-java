// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CompanyReportShareholdersPaidToItem: CompanyReportShareholdersPaidToItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportShareholdersPaidToItem {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Los dividendos de sus CFDI de retenciones, en pesos.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * El día del más reciente.
     */
    @JsonProperty("last_date")
    private String lastDate;

    /**
     * Cuántos CFDI de retenciones.
     */
    @JsonProperty("retentions")
    private Long retentions;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public CompanyReportShareholdersPaidToItem setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public CompanyReportShareholdersPaidToItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Los dividendos de sus CFDI de retenciones, en pesos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CompanyReportShareholdersPaidToItem setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CompanyReportShareholdersPaidToItem setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * El día del más reciente.
     */
    public String getLastDate() {
        return lastDate;
    }

    public CompanyReportShareholdersPaidToItem setLastDate(String lastDate) {
        this.lastDate = lastDate;
        return this;
    }

    /**
     * Cuántos CFDI de retenciones.
     */
    public Long getRetentions() {
        return retentions;
    }

    public CompanyReportShareholdersPaidToItem setRetentions(Long retentions) {
        this.retentions = retentions;
        return this;
    }

    @JsonIgnore
    public CompanyReportShareholdersPaidToItem setRetentions(long retentions) {
        return setRetentions(Long.valueOf(retentions));
    }
}
