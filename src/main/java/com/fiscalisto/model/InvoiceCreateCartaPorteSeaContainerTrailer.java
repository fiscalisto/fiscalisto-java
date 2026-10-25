// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCartaPorteSeaContainerTrailer: InvoiceCreateCartaPorteSeaContainerTrailer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteSeaContainerTrailer {
    /**
     * Subtipo de remolque (SubTipoRem), c_SubTipoRem.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Placa del remolque (Placa).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("plate")
    private String plate;

    /**
     * Subtipo de remolque (SubTipoRem), c_SubTipoRem.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public InvoiceCreateCartaPorteSeaContainerTrailer setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Placa del remolque (Placa).
     * <p>
     * Obligatorio.
     */
    public String getPlate() {
        return plate;
    }

    public InvoiceCreateCartaPorteSeaContainerTrailer setPlate(String plate) {
        this.plate = plate;
        return this;
    }
}
