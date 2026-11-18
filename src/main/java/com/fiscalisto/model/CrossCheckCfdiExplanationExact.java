// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CrossCheckCfdiExplanationExact: CrossCheckCfdiExplanationExact.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossCheckCfdiExplanationExact {
    /**
     * Los CFDI de la combinación.
     */
    @JsonProperty("cfdi")
    private List<CrossCheckCfdiExplanationExactCfdiItem> cfdi;

    /**
     * Lo que queda (redondeo).
     */
    @JsonProperty("remainder")
    private BigDecimal remainder;

    /**
     * Los CFDI de la combinación.
     */
    public List<CrossCheckCfdiExplanationExactCfdiItem> getCfdi() {
        return cfdi;
    }

    public CrossCheckCfdiExplanationExact setCfdi(List<CrossCheckCfdiExplanationExactCfdiItem> cfdi) {
        this.cfdi = cfdi;
        return this;
    }

    /**
     * Lo que queda (redondeo).
     */
    public BigDecimal getRemainder() {
        return remainder;
    }

    public CrossCheckCfdiExplanationExact setRemainder(BigDecimal remainder) {
        this.remainder = remainder;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdiExplanationExact setRemainder(double remainder) {
        return setRemainder(BigDecimal.valueOf(remainder));
    }
}
