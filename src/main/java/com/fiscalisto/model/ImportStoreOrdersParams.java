// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImportStoreOrdersParams: los campos de «Traer pedidos pagados».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImportStoreOrdersParams {
    /**
     * Desde qué día (AAAA-MM-DD, hasta 31 días atrás). Por omisión, hace 7 días.
     */
    @JsonProperty("since")
    private String since;

    /**
     * Desde qué día (AAAA-MM-DD, hasta 31 días atrás). Por omisión, hace 7 días.
     */
    public String getSince() {
        return since;
    }

    public ImportStoreOrdersParams setSince(String since) {
        this.since = since;
        return this;
    }
}
