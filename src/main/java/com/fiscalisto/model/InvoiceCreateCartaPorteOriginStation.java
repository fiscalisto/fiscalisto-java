// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCartaPorteOriginStation: Estación, puerto o aeropuerto (TipoEstacion y NumEstacion de c_Estaciones). Solo sin autotransporte.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteOriginStation {
    /**
     * Tipo de estación (TipoEstacion): 01 origen, 02 intermedia, 03 destino final.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Clave de la estación, puerto o aeropuerto (NumEstacion), c_Estaciones.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Nombre de la estación (NombreEstacion).
     */
    @JsonProperty("name")
    private String name;

    /**
     * true si la estación está en el extranjero (va sin TipoEstacion).
     */
    @JsonProperty("foreign")
    private Boolean foreign;

    /**
     * Tipo de estación (TipoEstacion): 01 origen, 02 intermedia, 03 destino final.
     */
    public String getType() {
        return type;
    }

    public InvoiceCreateCartaPorteOriginStation setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Clave de la estación, puerto o aeropuerto (NumEstacion), c_Estaciones.
     */
    public String getNumber() {
        return number;
    }

    public InvoiceCreateCartaPorteOriginStation setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre de la estación (NombreEstacion).
     */
    public String getName() {
        return name;
    }

    public InvoiceCreateCartaPorteOriginStation setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * true si la estación está en el extranjero (va sin TipoEstacion).
     */
    public Boolean getForeign() {
        return foreign;
    }

    public InvoiceCreateCartaPorteOriginStation setForeign(Boolean foreign) {
        this.foreign = foreign;
        return this;
    }
}
