// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StockMovementSource: Lo que lo causó: type invoice (id es el UUID del CFDI), adjustment (adj_…), receipt, transfer, count o ticket.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockMovementSource {
    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     */
    public String getType() {
        return type;
    }

    public StockMovementSource setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public StockMovementSource setId(String id) {
        this.id = id;
        return this;
    }
}
