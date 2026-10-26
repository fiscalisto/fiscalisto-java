// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceCreateCartaPorteGoodQuantity: InvoiceCreateCartaPorteGoodQuantity.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteGoodQuantity {
    /**
     * Cantidad que va a ese destino.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * El destino, por su posición en destinations (desde 0).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("destination")
    private Long destination;

    /**
     * Medio en que va esa cantidad (CvesTransporte), c_CveTransporte.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * Cantidad que va a ese destino.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public InvoiceCreateCartaPorteGoodQuantity setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteGoodQuantity setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * El destino, por su posición en destinations (desde 0).
     * <p>
     * Obligatorio.
     */
    public Long getDestination() {
        return destination;
    }

    public InvoiceCreateCartaPorteGoodQuantity setDestination(Long destination) {
        this.destination = destination;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteGoodQuantity setDestination(long destination) {
        return setDestination(Long.valueOf(destination));
    }

    /**
     * Medio en que va esa cantidad (CvesTransporte), c_CveTransporte.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    public String getMode() {
        return mode;
    }

    public InvoiceCreateCartaPorteGoodQuantity setMode(String mode) {
        this.mode = mode;
        return this;
    }
}
