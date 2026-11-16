// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListMaterialitySuppliersParams: los campos de «Listar la materialidad por proveedor».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListMaterialitySuppliersParams {
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
     * Solo este proveedor (su RFC).
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListMaterialitySuppliersParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Facturas desde este día (AAAA-MM-DD).
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListMaterialitySuppliersParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * Facturas hasta este día (AAAA-MM-DD, completo).
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListMaterialitySuppliersParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * Solo este proveedor (su RFC).
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public ListMaterialitySuppliersParams setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }
}
