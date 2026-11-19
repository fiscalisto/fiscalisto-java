// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * StartProductionOrderParamsComponent: StartProductionOrderParamsComponent.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StartProductionOrderParamsComponent {
    /**
     * El componente (prd_…) de la orden.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("product")
    private String product;

    /**
     * Lo que de verdad se usó, en la unidad del componente.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("quantity_used")
    private BigDecimal quantityUsed;

    /**
     * El componente (prd_…) de la orden.
     * <p>
     * Obligatorio.
     */
    public String getProduct() {
        return product;
    }

    public StartProductionOrderParamsComponent setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Lo que de verdad se usó, en la unidad del componente.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getQuantityUsed() {
        return quantityUsed;
    }

    public StartProductionOrderParamsComponent setQuantityUsed(BigDecimal quantityUsed) {
        this.quantityUsed = quantityUsed;
        return this;
    }

    @JsonIgnore
    public StartProductionOrderParamsComponent setQuantityUsed(double quantityUsed) {
        return setQuantityUsed(BigDecimal.valueOf(quantityUsed));
    }
}
