// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListPortalSuppliersParams: los campos de «Listar proveedores del portal».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListPortalSuppliersParams {
    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo los que estén en este estado.
     * <p>
     * Valores: invited, onboarding, in_review, approved, rejected, suspended.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Solo el de este RFC.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListPortalSuppliersParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListPortalSuppliersParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListPortalSuppliersParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListPortalSuppliersParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo los que estén en este estado.
     * <p>
     * Valores: invited, onboarding, in_review, approved, rejected, suspended.
     */
    public String getStatus() {
        return status;
    }

    public ListPortalSuppliersParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Solo el de este RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public ListPortalSuppliersParams setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }
}
