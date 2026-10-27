// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateRetentionParamsPrize: Complemento de premios (Premios 1.0), obligatorio con code 20. Sus montos son los de totals.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsPrize {
    /**
     * Entidad federativa donde se paga el premio (EntidadFederativa), c_EntidadesFederativas de catRetenciones: 01 Aguascalientes … 09 Ciudad de México … 32 Zacatecas.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Entidad federativa donde se paga el premio (EntidadFederativa), c_EntidadesFederativas de catRetenciones: 01 Aguascalientes … 09 Ciudad de México … 32 Zacatecas.
     * <p>
     * Obligatorio.
     */
    public String getState() {
        return state;
    }

    public CreateRetentionParamsPrize setState(String state) {
        this.state = state;
        return this;
    }
}
