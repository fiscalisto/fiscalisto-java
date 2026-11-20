// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetVariableSalaryParams: los campos de «Salario variable de un bimestre».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetVariableSalaryParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * AAAA-B: 2026-5 es septiembre–octubre de 2026.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("bimester")
    private String bimester;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetVariableSalaryParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * AAAA-B: 2026-5 es septiembre–octubre de 2026.
     * <p>
     * Obligatorio.
     */
    public String getBimester() {
        return bimester;
    }

    public GetVariableSalaryParams setBimester(String bimester) {
        this.bimester = bimester;
        return this;
    }
}
