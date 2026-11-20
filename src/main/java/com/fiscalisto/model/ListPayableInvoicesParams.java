// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListPayableInvoicesParams: los campos de «Listar lo que falta por pagar».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListPayableInvoicesParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cuántas, de 1 a 500. Por omisión 100.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * Solo las de este proveedor (su RFC).
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

    /**
     * Solo estas: hasta 100 folios fiscales separados por comas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListPayableInvoicesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cuántas, de 1 a 500. Por omisión 100.
     */
    public Long getLimit() {
        return limit;
    }

    public ListPayableInvoicesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListPayableInvoicesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * Solo las de este proveedor (su RFC).
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public ListPayableInvoicesParams setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }

    /**
     * Solo estas: hasta 100 folios fiscales separados por comas.
     */
    public String getUuid() {
        return uuid;
    }

    public ListPayableInvoicesParams setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
}
