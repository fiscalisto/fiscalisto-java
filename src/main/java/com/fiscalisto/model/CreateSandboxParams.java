// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateSandboxParams: los campos de «Crear un entorno de prueba».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSandboxParams {
    /**
     * Para quién o para qué es, por ejemplo el nombre de quien lo usa.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Para quién o para qué es, por ejemplo el nombre de quien lo usa.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateSandboxParams setName(String name) {
        this.name = name;
        return this;
    }
}
