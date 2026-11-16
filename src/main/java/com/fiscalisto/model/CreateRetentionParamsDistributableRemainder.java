// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsDistributableRemainder: Complemento de dividendos con su nodo Remanente (remanente distribuible), obligatorio con code 15. Si no lo manda, va sin proporción.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsDistributableRemainder {
    /**
     * Porcentaje de participación del integrante o socio en el remanente (ProporcionRem), opcional.
     */
    @JsonProperty("proportion")
    private BigDecimal proportion;

    /**
     * Porcentaje de participación del integrante o socio en el remanente (ProporcionRem), opcional.
     */
    public BigDecimal getProportion() {
        return proportion;
    }

    public CreateRetentionParamsDistributableRemainder setProportion(BigDecimal proportion) {
        this.proportion = proportion;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsDistributableRemainder setProportion(double proportion) {
        return setProportion(BigDecimal.valueOf(proportion));
    }
}
