// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateCostCenterParams: los campos de «Crear un centro de costo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCostCenterParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cómo lo llama su equipo, por ejemplo «Obra Norte». No se repite en el emisor (sin importar mayúsculas).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su clave, si su contabilidad usa claves (por ejemplo «CC-01»).
     */
    @JsonProperty("code")
    private String code;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateCostCenterParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cómo lo llama su equipo, por ejemplo «Obra Norte». No se repite en el emisor (sin importar mayúsculas).
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateCostCenterParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su clave, si su contabilidad usa claves (por ejemplo «CC-01»).
     */
    public String getCode() {
        return code;
    }

    public CreateCostCenterParams setCode(String code) {
        this.code = code;
        return this;
    }
}
