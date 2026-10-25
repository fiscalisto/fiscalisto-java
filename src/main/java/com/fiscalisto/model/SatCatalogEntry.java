// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatCatalogEntry: Una clave de un catálogo del SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatCatalogEntry {
    /**
     * La clave en el catálogo del SAT.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Su descripción en el catálogo.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La clave en el catálogo del SAT.
     */
    public String getCode() {
        return code;
    }

    public SatCatalogEntry setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Su descripción en el catálogo.
     */
    public String getDescription() {
        return description;
    }

    public SatCatalogEntry setDescription(String description) {
        this.description = description;
        return this;
    }
}
