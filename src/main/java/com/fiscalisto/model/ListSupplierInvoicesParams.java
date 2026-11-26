// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSupplierInvoicesParams: los campos de «Listar facturas de proveedores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSupplierInvoicesParams {
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
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo las que estén en este estado.
     * <p>
     * Valores: received, approved, scheduled, paid, rejected.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Solo las de este proveedor (sup_…).
     */
    @JsonProperty("supplier")
    private String supplier;

    /**
     * Llegadas desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("received[gte]")
    private String receivedGte;

    /**
     * Llegadas después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("received[gt]")
    private String receivedGt;

    /**
     * Llegadas hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("received[lte]")
    private String receivedLte;

    /**
     * Llegadas antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("received[lt]")
    private String receivedLt;

    /**
     * Igual que received[gte]; se conserva por compatibilidad.
     */
    @JsonProperty("received_since")
    private String receivedSince;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSupplierInvoicesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListSupplierInvoicesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSupplierInvoicesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSupplierInvoicesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo las que estén en este estado.
     * <p>
     * Valores: received, approved, scheduled, paid, rejected.
     */
    public String getStatus() {
        return status;
    }

    public ListSupplierInvoicesParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Solo las de este proveedor (sup_…).
     */
    public String getSupplier() {
        return supplier;
    }

    public ListSupplierInvoicesParams setSupplier(String supplier) {
        this.supplier = supplier;
        return this;
    }

    /**
     * Llegadas desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getReceivedGte() {
        return receivedGte;
    }

    public ListSupplierInvoicesParams setReceivedGte(String receivedGte) {
        this.receivedGte = receivedGte;
        return this;
    }

    /**
     * Llegadas después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getReceivedGt() {
        return receivedGt;
    }

    public ListSupplierInvoicesParams setReceivedGt(String receivedGt) {
        this.receivedGt = receivedGt;
        return this;
    }

    /**
     * Llegadas hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getReceivedLte() {
        return receivedLte;
    }

    public ListSupplierInvoicesParams setReceivedLte(String receivedLte) {
        this.receivedLte = receivedLte;
        return this;
    }

    /**
     * Llegadas antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getReceivedLt() {
        return receivedLt;
    }

    public ListSupplierInvoicesParams setReceivedLt(String receivedLt) {
        this.receivedLt = receivedLt;
        return this;
    }

    /**
     * Igual que received[gte]; se conserva por compatibilidad.
     */
    public String getReceivedSince() {
        return receivedSince;
    }

    public ListSupplierInvoicesParams setReceivedSince(String receivedSince) {
        this.receivedSince = receivedSince;
        return this;
    }
}
