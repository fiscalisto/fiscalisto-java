// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ReportImssMovementsParams: los campos de «Marcar movimientos como presentados».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportImssMovementsParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Los movimientos (imv_…) que el IMSS ya recibió, hasta 1,000.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("movements")
    private List<String> movements;

    /**
     * true (por omisión): marcarlos como presentados; false: devolverlos a pendientes (si los marcó por error).
     */
    @JsonProperty("reported")
    private Boolean reported;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public ReportImssMovementsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Los movimientos (imv_…) que el IMSS ya recibió, hasta 1,000.
     * <p>
     * Obligatorio.
     */
    public List<String> getMovements() {
        return movements;
    }

    public ReportImssMovementsParams setMovements(List<String> movements) {
        this.movements = movements;
        return this;
    }

    /**
     * true (por omisión): marcarlos como presentados; false: devolverlos a pendientes (si los marcó por error).
     */
    public Boolean getReported() {
        return reported;
    }

    public ReportImssMovementsParams setReported(Boolean reported) {
        this.reported = reported;
        return this;
    }
}
