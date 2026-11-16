// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListMaterialityInvoicesParams: los campos de «Listar facturas recibidas por probar».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListMaterialityInvoicesParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Facturas desde este día (AAAA-MM-DD).
     */
    @JsonProperty("date_gte")
    private String dateGte;

    /**
     * Facturas hasta este día (AAAA-MM-DD, completo).
     */
    @JsonProperty("date_lte")
    private String dateLte;

    /**
     * Solo las de este proveedor (su RFC).
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

    /**
     * Solo las de este estado: complete, partial o none. Sin él, las que no están completas.
     * <p>
     * Valores: complete, partial, none.
     */
    @JsonProperty("state")
    private String state;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListMaterialityInvoicesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Facturas desde este día (AAAA-MM-DD).
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListMaterialityInvoicesParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * Facturas hasta este día (AAAA-MM-DD, completo).
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListMaterialityInvoicesParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * Solo las de este proveedor (su RFC).
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public ListMaterialityInvoicesParams setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }

    /**
     * Solo las de este estado: complete, partial o none. Sin él, las que no están completas.
     * <p>
     * Valores: complete, partial, none.
     */
    public String getState() {
        return state;
    }

    public ListMaterialityInvoicesParams setState(String state) {
        this.state = state;
        return this;
    }
}
