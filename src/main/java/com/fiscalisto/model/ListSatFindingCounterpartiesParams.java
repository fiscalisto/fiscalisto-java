// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatFindingCounterpartiesParams: los campos de «Listar proveedores y clientes con hallazgos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatFindingCounterpartiesParams {
    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

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
     * issued (emitidos: clientes) o received (recibidos: proveedores); sin él, los dos.
     * <p>
     * Valores: issued, received.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * De los CFDI con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gte]")
    private String dateGte;

    /**
     * De los CFDI con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gt]")
    private String dateGt;

    /**
     * De los CFDI con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lte]")
    private String dateLte;

    /**
     * De los CFDI con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lt]")
    private String dateLt;

    /**
     * Solo los de esta gravedad: critical, warning o info.
     * <p>
     * Valores: critical, warning, info.
     */
    @JsonProperty("severity")
    private String severity;

    /**
     * Solo quienes tienen este hallazgo (efos_definitivo, cancelado, regla_12…; el code de GET /v1/sat_findings).
     */
    @JsonProperty("code")
    private String code;

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

    public ListSatFindingCounterpartiesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSatFindingCounterpartiesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListSatFindingCounterpartiesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSatFindingCounterpartiesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * issued (emitidos: clientes) o received (recibidos: proveedores); sin él, los dos.
     * <p>
     * Valores: issued, received.
     */
    public String getDirection() {
        return direction;
    }

    public ListSatFindingCounterpartiesParams setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * De los CFDI con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListSatFindingCounterpartiesParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * De los CFDI con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGt() {
        return dateGt;
    }

    public ListSatFindingCounterpartiesParams setDateGt(String dateGt) {
        this.dateGt = dateGt;
        return this;
    }

    /**
     * De los CFDI con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListSatFindingCounterpartiesParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * De los CFDI con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLt() {
        return dateLt;
    }

    public ListSatFindingCounterpartiesParams setDateLt(String dateLt) {
        this.dateLt = dateLt;
        return this;
    }

    /**
     * Solo los de esta gravedad: critical, warning o info.
     * <p>
     * Valores: critical, warning, info.
     */
    public String getSeverity() {
        return severity;
    }

    public ListSatFindingCounterpartiesParams setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Solo quienes tienen este hallazgo (efos_definitivo, cancelado, regla_12…; el code de GET /v1/sat_findings).
     */
    public String getCode() {
        return code;
    }

    public ListSatFindingCounterpartiesParams setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Igual que date[gte]; se conserva por compatibilidad.
     */
    public String getDateGteValue() {
        return dateGteValue;
    }

    public ListSatFindingCounterpartiesParams setDateGteValue(String dateGteValue) {
        this.dateGteValue = dateGteValue;
        return this;
    }

    /**
     * Igual que date[lte]; se conserva por compatibilidad.
     */
    public String getDateLteValue() {
        return dateLteValue;
    }

    public ListSatFindingCounterpartiesParams setDateLteValue(String dateLteValue) {
        this.dateLteValue = dateLteValue;
        return this;
    }
}
