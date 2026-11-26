// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatReviewsParams: los campos de «Listar revisiones del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatReviewsParams {
    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo las de este estado: open, answered, concluded, assessed, in_defense o closed.
     * <p>
     * Valores: open, answered, concluded, assessed, in_defense, closed.
     */
    @JsonProperty("status")
    private String status;

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
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatReviewsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo las de este estado: open, answered, concluded, assessed, in_defense o closed.
     * <p>
     * Valores: open, answered, concluded, assessed, in_defense, closed.
     */
    public String getStatus() {
        return status;
    }

    public ListSatReviewsParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListSatReviewsParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListSatReviewsParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListSatReviewsParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListSatReviewsParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }
}
