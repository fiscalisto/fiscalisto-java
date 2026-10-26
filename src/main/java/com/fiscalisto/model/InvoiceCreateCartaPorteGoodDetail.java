// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceCreateCartaPorteGoodDetail: Marítimo: detalle de la mercancía (DetalleMercancia): kilos netos, tara y piezas.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteGoodDetail {
    /**
     * Peso neto en kg (PesoNeto).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("net_kg")
    private BigDecimal netKg;

    /**
     * Tara en kg (PesoTara).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tare_kg")
    private BigDecimal tareKg;

    /**
     * Número de piezas (NumPiezas).
     */
    @JsonProperty("pieces")
    private Long pieces;

    /**
     * Peso neto en kg (PesoNeto).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getNetKg() {
        return netKg;
    }

    public InvoiceCreateCartaPorteGoodDetail setNetKg(BigDecimal netKg) {
        this.netKg = netKg;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteGoodDetail setNetKg(double netKg) {
        return setNetKg(BigDecimal.valueOf(netKg));
    }

    /**
     * Tara en kg (PesoTara).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTareKg() {
        return tareKg;
    }

    public InvoiceCreateCartaPorteGoodDetail setTareKg(BigDecimal tareKg) {
        this.tareKg = tareKg;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteGoodDetail setTareKg(double tareKg) {
        return setTareKg(BigDecimal.valueOf(tareKg));
    }

    /**
     * Número de piezas (NumPiezas).
     */
    public Long getPieces() {
        return pieces;
    }

    public InvoiceCreateCartaPorteGoodDetail setPieces(Long pieces) {
        this.pieces = pieces;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteGoodDetail setPieces(long pieces) {
        return setPieces(Long.valueOf(pieces));
    }
}
