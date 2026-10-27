// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatFindingsParams: los campos de «Listar hallazgos en los CFDI».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatFindingsParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * issued (emitidos) o received (recibidos); sin él, los dos.
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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatFindingsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * issued (emitidos) o received (recibidos); sin él, los dos.
     * <p>
     * Valores: issued, received.
     */
    public String getDirection() {
        return direction;
    }

    public ListSatFindingsParams setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * CFDI desde este día (AAAA-MM-DD).
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListSatFindingsParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * CFDI hasta este día (AAAA-MM-DD, completo).
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListSatFindingsParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }
}
