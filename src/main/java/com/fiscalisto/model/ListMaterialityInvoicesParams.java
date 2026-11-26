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
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Facturas con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gte]")
    private String dateGte;

    /**
     * Facturas con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gt]")
    private String dateGt;

    /**
     * Facturas con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lte]")
    private String dateLte;

    /**
     * Facturas con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lt]")
    private String dateLt;

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
     * Igual que date[gte]; se conserva por compatibilidad.
     */
    @JsonProperty("date_gte")
    private String dateGteValue;

    /**
     * Igual que date[lte]; se conserva por compatibilidad.
     */
    @JsonProperty("date_lte")
    private String dateLteValue;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListMaterialityInvoicesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Facturas con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListMaterialityInvoicesParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * Facturas con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGt() {
        return dateGt;
    }

    public ListMaterialityInvoicesParams setDateGt(String dateGt) {
        this.dateGt = dateGt;
        return this;
    }

    /**
     * Facturas con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListMaterialityInvoicesParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * Facturas con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLt() {
        return dateLt;
    }

    public ListMaterialityInvoicesParams setDateLt(String dateLt) {
        this.dateLt = dateLt;
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

    /**
     * Igual que date[gte]; se conserva por compatibilidad.
     */
    public String getDateGteValue() {
        return dateGteValue;
    }

    public ListMaterialityInvoicesParams setDateGteValue(String dateGteValue) {
        this.dateGteValue = dateGteValue;
        return this;
    }

    /**
     * Igual que date[lte]; se conserva por compatibilidad.
     */
    public String getDateLteValue() {
        return dateLteValue;
    }

    public ListMaterialityInvoicesParams setDateLteValue(String dateLteValue) {
        this.dateLteValue = dateLteValue;
        return this;
    }
}
