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
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * De las facturas con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gte]")
    private String dateGte;

    /**
     * De las facturas con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gt]")
    private String dateGt;

    /**
     * De las facturas con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lte]")
    private String dateLte;

    /**
     * De las facturas con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lt]")
    private String dateLt;

    /**
     * Solo este proveedor (su RFC).
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

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

    public ListMaterialitySuppliersParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * De las facturas con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListMaterialitySuppliersParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * De las facturas con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGt() {
        return dateGt;
    }

    public ListMaterialitySuppliersParams setDateGt(String dateGt) {
        this.dateGt = dateGt;
        return this;
    }

    /**
     * De las facturas con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListMaterialitySuppliersParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * De las facturas con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLt() {
        return dateLt;
    }

    public ListMaterialitySuppliersParams setDateLt(String dateLt) {
        this.dateLt = dateLt;
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

    /**
     * Igual que date[gte]; se conserva por compatibilidad.
     */
    public String getDateGteValue() {
        return dateGteValue;
    }

    public ListMaterialitySuppliersParams setDateGteValue(String dateGteValue) {
        this.dateGteValue = dateGteValue;
        return this;
    }

    /**
     * Igual que date[lte]; se conserva por compatibilidad.
     */
    public String getDateLteValue() {
        return dateLteValue;
    }

    public ListMaterialitySuppliersParams setDateLteValue(String dateLteValue) {
        this.dateLteValue = dateLteValue;
        return this;
    }
}
