// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SalesOrderDeliveryItem: SalesOrderDeliveryItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesOrderDeliveryItem {
    /**
     * El concepto del pedido (su items[].id).
     */
    @JsonProperty("line")
    private Long line;

    /**
     * Cuánto salió de él.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * El concepto del pedido (su items[].id).
     */
    public Long getLine() {
        return line;
    }

    public SalesOrderDeliveryItem setLine(Long line) {
        this.line = line;
        return this;
    }

    @JsonIgnore
    public SalesOrderDeliveryItem setLine(long line) {
        return setLine(Long.valueOf(line));
    }

    /**
     * Cuánto salió de él.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public SalesOrderDeliveryItem setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public SalesOrderDeliveryItem setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }
}
