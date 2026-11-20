// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListPayeeAccountsParams: los campos de «Listar cuentas de proveedores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListPayeeAccountsParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo las de este proveedor (su RFC).
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListPayeeAccountsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo las de este proveedor (su RFC).
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public ListPayeeAccountsParams setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }
}
