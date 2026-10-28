// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResetTestDataParams: los campos de «Reiniciar los datos de prueba».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResetTestDataParams {
    /**
     * true (por omisión) para dejarle a cada emisor de pruebas 2 clientes y 3 productos de ejemplo. false para dejarlo vacío.
     */
    @JsonProperty("seed")
    private Boolean seed;

    /**
     * true (por omisión) para dejarle a cada emisor de pruebas 2 clientes y 3 productos de ejemplo. false para dejarlo vacío.
     */
    public Boolean getSeed() {
        return seed;
    }

    public ResetTestDataParams setSeed(Boolean seed) {
        this.seed = seed;
        return this;
    }
}
