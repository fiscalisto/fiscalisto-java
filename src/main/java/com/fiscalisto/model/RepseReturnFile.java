// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RepseReturnFile: RepseReturnFile.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseReturnFile {
    /**
     * Nombre del archivo.
     */
    @JsonProperty("name")
    private String name;

    /**
     * sisub (Infonavit) o icsoe (IMSS).
     * <p>
     * Valores: sisub, icsoe.
     */
    @JsonProperty("system")
    private String system;

    /**
     * El CSV, en texto.
     */
    @JsonProperty("content")
    private String content;

    /**
     * Nombre del archivo.
     */
    public String getName() {
        return name;
    }

    public RepseReturnFile setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * sisub (Infonavit) o icsoe (IMSS).
     * <p>
     * Valores: sisub, icsoe.
     */
    public String getSystem() {
        return system;
    }

    public RepseReturnFile setSystem(String system) {
        this.system = system;
        return this;
    }

    /**
     * El CSV, en texto.
     */
    public String getContent() {
        return content;
    }

    public RepseReturnFile setContent(String content) {
        this.content = content;
        return this;
    }
}
