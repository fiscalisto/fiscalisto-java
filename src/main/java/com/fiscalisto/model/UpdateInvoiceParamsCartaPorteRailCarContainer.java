// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateInvoiceParamsCartaPorteRailCarContainer: UpdateInvoiceParamsCartaPorteRailCarContainer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorteRailCarContainer {
    /**
     * Tipo de contenedor (TipoContenedor), c_ContenedorMaritimo o c_Contenedor en ferroviario.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Peso del contenedor vacío en kg (PesoContenedorVacio).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("empty_kg")
    private BigDecimal emptyKg;

    /**
     * Peso neto en kg (PesoNeto).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("net_kg")
    private BigDecimal netKg;

    /**
     * Tipo de contenedor (TipoContenedor), c_ContenedorMaritimo o c_Contenedor en ferroviario.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public UpdateInvoiceParamsCartaPorteRailCarContainer setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Peso del contenedor vacío en kg (PesoContenedorVacio).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getEmptyKg() {
        return emptyKg;
    }

    public UpdateInvoiceParamsCartaPorteRailCarContainer setEmptyKg(BigDecimal emptyKg) {
        this.emptyKg = emptyKg;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteRailCarContainer setEmptyKg(double emptyKg) {
        return setEmptyKg(BigDecimal.valueOf(emptyKg));
    }

    /**
     * Peso neto en kg (PesoNeto).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getNetKg() {
        return netKg;
    }

    public UpdateInvoiceParamsCartaPorteRailCarContainer setNetKg(BigDecimal netKg) {
        this.netKg = netKg;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteRailCarContainer setNetKg(double netKg) {
        return setNetKg(BigDecimal.valueOf(netKg));
    }
}
