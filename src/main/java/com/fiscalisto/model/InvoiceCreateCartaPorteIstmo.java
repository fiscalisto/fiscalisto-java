// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCartaPorteIstmo: Corredor Interoceánico del Istmo de Tehuantepec: polos de origen y destino (c_RegistroISTMO).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteIstmo {
    /**
     * Polo de origen (UbicacionPoloOrigen).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("origin")
    private String origin;

    /**
     * Polo de destino (UbicacionPoloDestino).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("destination")
    private String destination;

    /**
     * Polo de origen (UbicacionPoloOrigen).
     * <p>
     * Obligatorio.
     */
    public String getOrigin() {
        return origin;
    }

    public InvoiceCreateCartaPorteIstmo setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Polo de destino (UbicacionPoloDestino).
     * <p>
     * Obligatorio.
     */
    public String getDestination() {
        return destination;
    }

    public InvoiceCreateCartaPorteIstmo setDestination(String destination) {
        this.destination = destination;
        return this;
    }
}
