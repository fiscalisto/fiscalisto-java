// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetDiotFileParams: los campos de «Descargar la DIOT para el SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetDiotFileParams {
    /**
     * El mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * true para agrupar proveedores de hasta $50,000 en el mes (regla 4.5.2).
     */
    @JsonProperty("group_small_suppliers")
    private Boolean groupSmallSuppliers;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    public String getMonth() {
        return month;
    }

    public GetDiotFileParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * true para agrupar proveedores de hasta $50,000 en el mes (regla 4.5.2).
     */
    public Boolean getGroupSmallSuppliers() {
        return groupSmallSuppliers;
    }

    public GetDiotFileParams setGroupSmallSuppliers(Boolean groupSmallSuppliers) {
        this.groupSmallSuppliers = groupSmallSuppliers;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetDiotFileParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
