// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StoreImportSkippedItem: StoreImportSkippedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreImportSkippedItem {
    /**
     * El pedido.
     */
    @JsonProperty("order")
    private String order;

    /**
     * Por qué no se volvió ticket.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * El pedido.
     */
    public String getOrder() {
        return order;
    }

    public StoreImportSkippedItem setOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * Por qué no se volvió ticket.
     */
    public String getReason() {
        return reason;
    }

    public StoreImportSkippedItem setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
