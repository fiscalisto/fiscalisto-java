// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenumberAccountsParamsMappingItem: RenumberAccountsParamsMappingItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RenumberAccountsParamsMappingItem {
    /**
     * El número de hoy.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Su número nuevo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("to")
    private String to;

    /**
     * El número de hoy.
     * <p>
     * Obligatorio.
     */
    public String getFrom() {
        return from;
    }

    public RenumberAccountsParamsMappingItem setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Su número nuevo.
     * <p>
     * Obligatorio.
     */
    public String getTo() {
        return to;
    }

    public RenumberAccountsParamsMappingItem setTo(String to) {
        this.to = to;
        return this;
    }
}
