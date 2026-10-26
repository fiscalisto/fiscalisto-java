// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * SatDeclarationSectionField: SatDeclarationSectionField.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationSectionField {
    /**
     * El renglón como lo imprime el SAT.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    @JsonProperty("value")
    private JsonNode value;

    /**
     * El renglón como lo imprime el SAT.
     */
    public String getLabel() {
        return label;
    }

    public SatDeclarationSectionField setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    public JsonNode getValue() {
        return value;
    }

    public SatDeclarationSectionField setValue(JsonNode value) {
        this.value = value;
        return this;
    }
}
