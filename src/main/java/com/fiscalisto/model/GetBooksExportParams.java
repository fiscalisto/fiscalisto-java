// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetBooksExportParams: los campos de «Descargar toda la contabilidad de un periodo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBooksExportParams {
    /**
     * El primer mes (AAAA-MM), de 2015-01 al mes actual.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("from_month")
    private String fromMonth;

    /**
     * El último mes (AAAA-MM), hasta 24 meses después y no después del mes actual; por omisión, from_month.
     */
    @JsonProperty("to_month")
    private String toMonth;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El primer mes (AAAA-MM), de 2015-01 al mes actual.
     * <p>
     * Obligatorio.
     */
    public String getFromMonth() {
        return fromMonth;
    }

    public GetBooksExportParams setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    /**
     * El último mes (AAAA-MM), hasta 24 meses después y no después del mes actual; por omisión, from_month.
     */
    public String getToMonth() {
        return toMonth;
    }

    public GetBooksExportParams setToMonth(String toMonth) {
        this.toMonth = toMonth;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetBooksExportParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
