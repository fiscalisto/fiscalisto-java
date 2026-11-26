// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatDeclarationsParams: los campos de «Listar declaraciones del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatDeclarationsParams {
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
     * Solo las de un ejercicio, como 2025.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * monthly (provisionales o definitivas), annual (la anual) o dyp (Declaraciones y pagos).
     * <p>
     * Valores: monthly, annual, dyp.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Solo las de un mes (1 a 12).
     */
    @JsonProperty("month")
    private Long month;

    /**
     * normal o complementary (complementarias).
     * <p>
     * Valores: normal, complementary.
     */
    @JsonProperty("type")
    private String type;

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
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSatDeclarationsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListSatDeclarationsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSatDeclarationsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatDeclarationsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo las de un ejercicio, como 2025.
     */
    public Long getYear() {
        return year;
    }

    public ListSatDeclarationsParams setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public ListSatDeclarationsParams setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * monthly (provisionales o definitivas), annual (la anual) o dyp (Declaraciones y pagos).
     * <p>
     * Valores: monthly, annual, dyp.
     */
    public String getSource() {
        return source;
    }

    public ListSatDeclarationsParams setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Solo las de un mes (1 a 12).
     */
    public Long getMonth() {
        return month;
    }

    public ListSatDeclarationsParams setMonth(Long month) {
        this.month = month;
        return this;
    }

    @JsonIgnore
    public ListSatDeclarationsParams setMonth(long month) {
        return setMonth(Long.valueOf(month));
    }

    /**
     * normal o complementary (complementarias).
     * <p>
     * Valores: normal, complementary.
     */
    public String getType() {
        return type;
    }

    public ListSatDeclarationsParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListSatDeclarationsParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListSatDeclarationsParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListSatDeclarationsParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListSatDeclarationsParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }
}
