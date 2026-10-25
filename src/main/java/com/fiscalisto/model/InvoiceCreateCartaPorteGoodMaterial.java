// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCartaPorteGoodMaterial: Tipo de materia (TipoMateria, c_TipoMateria) y su descripción si es «otra».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteGoodMaterial {
    /**
     * Tipo de materia (TipoMateria), c_TipoMateria.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Descripción de la materia (DescripcionMateria), con el tipo 05 otra.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Tipo de materia (TipoMateria), c_TipoMateria.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public InvoiceCreateCartaPorteGoodMaterial setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Descripción de la materia (DescripcionMateria), con el tipo 05 otra.
     */
    public String getDescription() {
        return description;
    }

    public InvoiceCreateCartaPorteGoodMaterial setDescription(String description) {
        this.description = description;
        return this;
    }
}
