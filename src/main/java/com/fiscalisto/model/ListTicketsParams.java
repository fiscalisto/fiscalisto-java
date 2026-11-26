// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * ListTicketsParams: los campos de «Listar tickets».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListTicketsParams {
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
     * pending, invoiced, global o canceled (también se acepta cancelled).
     * <p>
     * Valores: pending, invoiced, global, canceled, cancelled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Vendidos desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("sold_at[gte]")
    private String soldAtGte;

    /**
     * Vendidos después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("sold_at[gt]")
    private String soldAtGt;

    /**
     * Vendidos hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("sold_at[lte]")
    private String soldAtLte;

    /**
     * Vendidos antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("sold_at[lt]")
    private String soldAtLt;

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
     * Solo los que tienen este valor en esta llave de su metadata: metadata[pedido]=A-1042. Hasta 10 llaves, todas deben coincidir.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Igual que sold_at[gte]; se conserva por compatibilidad.
     */
    @JsonProperty("sold_at_gte")
    private String soldAtGteValue;

    /**
     * Igual que sold_at[lte]; se conserva por compatibilidad.
     */
    @JsonProperty("sold_at_lte")
    private String soldAtLteValue;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListTicketsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListTicketsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListTicketsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListTicketsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * pending, invoiced, global o canceled (también se acepta cancelled).
     * <p>
     * Valores: pending, invoiced, global, canceled, cancelled.
     */
    public String getStatus() {
        return status;
    }

    public ListTicketsParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Vendidos desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getSoldAtGte() {
        return soldAtGte;
    }

    public ListTicketsParams setSoldAtGte(String soldAtGte) {
        this.soldAtGte = soldAtGte;
        return this;
    }

    /**
     * Vendidos después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getSoldAtGt() {
        return soldAtGt;
    }

    public ListTicketsParams setSoldAtGt(String soldAtGt) {
        this.soldAtGt = soldAtGt;
        return this;
    }

    /**
     * Vendidos hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getSoldAtLte() {
        return soldAtLte;
    }

    public ListTicketsParams setSoldAtLte(String soldAtLte) {
        this.soldAtLte = soldAtLte;
        return this;
    }

    /**
     * Vendidos antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getSoldAtLt() {
        return soldAtLt;
    }

    public ListTicketsParams setSoldAtLt(String soldAtLt) {
        this.soldAtLt = soldAtLt;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListTicketsParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListTicketsParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListTicketsParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListTicketsParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }

    /**
     * Solo los que tienen este valor en esta llave de su metadata: metadata[pedido]=A-1042. Hasta 10 llaves, todas deben coincidir.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public ListTicketsParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Igual que sold_at[gte]; se conserva por compatibilidad.
     */
    public String getSoldAtGteValue() {
        return soldAtGteValue;
    }

    public ListTicketsParams setSoldAtGteValue(String soldAtGteValue) {
        this.soldAtGteValue = soldAtGteValue;
        return this;
    }

    /**
     * Igual que sold_at[lte]; se conserva por compatibilidad.
     */
    public String getSoldAtLteValue() {
        return soldAtLteValue;
    }

    public ListTicketsParams setSoldAtLteValue(String soldAtLteValue) {
        this.soldAtLteValue = soldAtLteValue;
        return this;
    }
}
