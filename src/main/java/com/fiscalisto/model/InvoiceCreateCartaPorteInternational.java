// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceCreateCartaPorteInternational: Transporte internacional (TranspInternac Sí): entrada o salida, país, vía y regímenes aduaneros.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteInternational {
    /**
     * EntradaSalidaMerc: Entrada o Salida.
     * <p>
     * Valores: Entrada, Salida.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * País de origen o destino (PaisOrigenDestino), c_Pais.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("country")
    private String country;

    /**
     * Vía de entrada o salida (ViaEntradaSalida), c_CveTransporte (05 ducto incluido).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("via")
    private String via;

    /**
     * Regímenes aduaneros (RegimenAduanero), c_RegimenAduanero.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("regimes")
    private List<String> regimes;

    /**
     * EntradaSalidaMerc: Entrada o Salida.
     * <p>
     * Valores: Entrada, Salida.
     * <p>
     * Obligatorio.
     */
    public String getDirection() {
        return direction;
    }

    public InvoiceCreateCartaPorteInternational setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * País de origen o destino (PaisOrigenDestino), c_Pais.
     * <p>
     * Obligatorio.
     */
    public String getCountry() {
        return country;
    }

    public InvoiceCreateCartaPorteInternational setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Vía de entrada o salida (ViaEntradaSalida), c_CveTransporte (05 ducto incluido).
     * <p>
     * Obligatorio.
     */
    public String getVia() {
        return via;
    }

    public InvoiceCreateCartaPorteInternational setVia(String via) {
        this.via = via;
        return this;
    }

    /**
     * Regímenes aduaneros (RegimenAduanero), c_RegimenAduanero.
     * <p>
     * Obligatorio.
     */
    public List<String> getRegimes() {
        return regimes;
    }

    public InvoiceCreateCartaPorteInternational setRegimes(List<String> regimes) {
        this.regimes = regimes;
        return this;
    }
}
