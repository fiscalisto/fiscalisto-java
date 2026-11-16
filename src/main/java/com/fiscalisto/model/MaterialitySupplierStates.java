// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MaterialitySupplierStates: Cuántas facturas están complete (acuerdo, entrega y pago), partial (alguna) y none (ninguna).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaterialitySupplierStates {
    /**
     * Facturas con acuerdo, entrega y pago.
     */
    @JsonProperty("complete")
    private Long complete;

    /**
     * Facturas con alguna de las tres pruebas, no todas.
     */
    @JsonProperty("partial")
    private Long partial;

    /**
     * Facturas sin ninguna prueba.
     */
    @JsonProperty("none")
    private Long none;

    /**
     * Facturas con acuerdo, entrega y pago.
     */
    public Long getComplete() {
        return complete;
    }

    public MaterialitySupplierStates setComplete(Long complete) {
        this.complete = complete;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplierStates setComplete(long complete) {
        return setComplete(Long.valueOf(complete));
    }

    /**
     * Facturas con alguna de las tres pruebas, no todas.
     */
    public Long getPartial() {
        return partial;
    }

    public MaterialitySupplierStates setPartial(Long partial) {
        this.partial = partial;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplierStates setPartial(long partial) {
        return setPartial(Long.valueOf(partial));
    }

    /**
     * Facturas sin ninguna prueba.
     */
    public Long getNone() {
        return none;
    }

    public MaterialitySupplierStates setNone(Long none) {
        this.none = none;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplierStates setNone(long none) {
        return setNone(Long.valueOf(none));
    }
}
