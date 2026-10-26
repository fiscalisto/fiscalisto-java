// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceCreateCartaPorteRailRight: InvoiceCreateCartaPorteRailRight.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteRailRight {
    /**
     * Tipo de derecho de paso (TipoDerechoDePaso), c_DerechosDePaso.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Kilometraje pagado (KilometrajePagado).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("km")
    private BigDecimal km;

    /**
     * Tipo de derecho de paso (TipoDerechoDePaso), c_DerechosDePaso.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public InvoiceCreateCartaPorteRailRight setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Kilometraje pagado (KilometrajePagado).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getKm() {
        return km;
    }

    public InvoiceCreateCartaPorteRailRight setKm(BigDecimal km) {
        this.km = km;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteRailRight setKm(double km) {
        return setKm(BigDecimal.valueOf(km));
    }
}
