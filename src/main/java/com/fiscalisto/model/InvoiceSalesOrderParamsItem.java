// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceSalesOrderParamsItem: InvoiceSalesOrderParamsItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceSalesOrderParamsItem {
    /**
     * El id del concepto (items[].id).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("line")
    private Long line;

    /**
     * Cantidad (Cantidad). Por omisión 1.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * El id del concepto (items[].id).
     * <p>
     * Obligatorio.
     */
    public Long getLine() {
        return line;
    }

    public InvoiceSalesOrderParamsItem setLine(Long line) {
        this.line = line;
        return this;
    }

    @JsonIgnore
    public InvoiceSalesOrderParamsItem setLine(long line) {
        return setLine(Long.valueOf(line));
    }

    /**
     * Cantidad (Cantidad). Por omisión 1.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public InvoiceSalesOrderParamsItem setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public InvoiceSalesOrderParamsItem setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }
}
