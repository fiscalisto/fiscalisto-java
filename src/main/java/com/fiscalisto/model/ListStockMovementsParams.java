// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListStockMovementsParams: los campos de «Listar movimientos (kárdex)».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListStockMovementsParams {
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
     * Solo los de este producto (prd_…).
     */
    @JsonProperty("product")
    private String product;

    /**
     * Solo los de este almacén (whs_…).
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * Solo los de este tipo.
     * <p>
     * Valores: sale, purchase, customer_return, supplier_return, adjustment, count, transfer_out, transfer_in, production_consumption, production_output, initial, cost, reversal.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gte]")
    private String dateGte;

    /**
     * Con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gt]")
    private String dateGt;

    /**
     * Con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lte]")
    private String dateLte;

    /**
     * Con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lt]")
    private String dateLt;

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gte]")
    private String createdGte;

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gt]")
    private String createdGt;

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lte]")
    private String createdLte;

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lt]")
    private String createdLt;

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
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListStockMovementsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListStockMovementsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListStockMovementsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListStockMovementsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo los de este producto (prd_…).
     */
    public String getProduct() {
        return product;
    }

    public ListStockMovementsParams setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Solo los de este almacén (whs_…).
     */
    public String getWarehouse() {
        return warehouse;
    }

    public ListStockMovementsParams setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * Solo los de este tipo.
     * <p>
     * Valores: sale, purchase, customer_return, supplier_return, adjustment, count, transfer_out, transfer_in, production_consumption, production_output, initial, cost, reversal.
     */
    public String getType() {
        return type;
    }

    public ListStockMovementsParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListStockMovementsParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * Con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGt() {
        return dateGt;
    }

    public ListStockMovementsParams setDateGt(String dateGt) {
        this.dateGt = dateGt;
        return this;
    }

    /**
     * Con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListStockMovementsParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * Con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLt() {
        return dateLt;
    }

    public ListStockMovementsParams setDateLt(String dateLt) {
        this.dateLt = dateLt;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListStockMovementsParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListStockMovementsParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListStockMovementsParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListStockMovementsParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }

    /**
     * Igual que date[gte]; se conserva por compatibilidad.
     */
    public String getDateGteValue() {
        return dateGteValue;
    }

    public ListStockMovementsParams setDateGteValue(String dateGteValue) {
        this.dateGteValue = dateGteValue;
        return this;
    }

    /**
     * Igual que date[lte]; se conserva por compatibilidad.
     */
    public String getDateLteValue() {
        return dateLteValue;
    }

    public ListStockMovementsParams setDateLteValue(String dateLteValue) {
        this.dateLteValue = dateLteValue;
        return this;
    }
}
