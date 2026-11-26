// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetCompanyReportParams: los campos de «Ver el reporte de la empresa».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCompanyReportParams {
    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Desde este día (AAAA-MM-DD).
     */
    @JsonProperty("date_gte")
    private String dateGte;

    /**
     * Hasta este día (AAAA-MM-DD, completo; hoy a lo más).
     */
    @JsonProperty("date_lte")
    private String dateLte;

    /**
     * full (por omisión) o executive: solo la calificación, los indicadores principales, los años y 5 clientes y proveedores.
     * <p>
     * Valores: full, executive.
     */
    @JsonProperty("version")
    private String version;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetCompanyReportParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Desde este día (AAAA-MM-DD).
     */
    public String getDateGte() {
        return dateGte;
    }

    public GetCompanyReportParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * Hasta este día (AAAA-MM-DD, completo; hoy a lo más).
     */
    public String getDateLte() {
        return dateLte;
    }

    public GetCompanyReportParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * full (por omisión) o executive: solo la calificación, los indicadores principales, los años y 5 clientes y proveedores.
     * <p>
     * Valores: full, executive.
     */
    public String getVersion() {
        return version;
    }

    public GetCompanyReportParams setVersion(String version) {
        this.version = version;
        return this;
    }
}
