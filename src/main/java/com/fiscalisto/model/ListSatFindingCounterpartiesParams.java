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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
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
     * CFDI desde este día (AAAA-MM-DD).
     */
    @JsonProperty("date_gte")
    private String dateGte;

    /**
     * CFDI hasta este día (AAAA-MM-DD, completo).
     */
    @JsonProperty("date_lte")
    private String dateLte;

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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
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
     * CFDI desde este día (AAAA-MM-DD).
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListSatFindingCounterpartiesParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * CFDI hasta este día (AAAA-MM-DD, completo).
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListSatFindingCounterpartiesParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
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
}
