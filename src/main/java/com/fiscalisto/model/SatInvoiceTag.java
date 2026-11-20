// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatInvoiceTag: SatInvoiceTag.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatInvoiceTag {
    /**
     * La etiqueta (tag_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su color.
     */
    @JsonProperty("color")
    private String color;

    /**
     * true si la puso una regla (su orden de compra o Ajustes › Reglas), no una persona.
     */
    @JsonProperty("automatic")
    private Boolean automatic;

    /**
     * La etiqueta (tag_…).
     */
    public String getId() {
        return id;
    }

    public SatInvoiceTag setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public SatInvoiceTag setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su color.
     */
    public String getColor() {
        return color;
    }

    public SatInvoiceTag setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * true si la puso una regla (su orden de compra o Ajustes › Reglas), no una persona.
     */
    public Boolean getAutomatic() {
        return automatic;
    }

    public SatInvoiceTag setAutomatic(Boolean automatic) {
        this.automatic = automatic;
        return this;
    }
}
