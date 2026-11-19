// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CompleteProductionOrderParams: los campos de «Terminar una orden de producción».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompleteProductionOrderParams {
    /**
     * Cuántas unidades salieron. Por omisión, quantity.
     */
    @JsonProperty("quantity_made")
    private BigDecimal quantityMade;

    /**
     * El lote de lo producido, si el producto lleva lotes. Por omisión, OP-&lt;folio&gt;.
     */
    @JsonProperty("lot")
    private String lot;

    /**
     * La caducidad de ese lote (AAAA-MM-DD).
     */
    @JsonProperty("expires_on")
    private String expiresOn;

    /**
     * Los otros costos como de verdad fueron; por omisión, los de la receta.
     */
    @JsonProperty("other_costs")
    private List<CompleteProductionOrderParamsOtherCost> otherCosts;

    /**
     * Cuántas unidades salieron. Por omisión, quantity.
     */
    public BigDecimal getQuantityMade() {
        return quantityMade;
    }

    public CompleteProductionOrderParams setQuantityMade(BigDecimal quantityMade) {
        this.quantityMade = quantityMade;
        return this;
    }

    @JsonIgnore
    public CompleteProductionOrderParams setQuantityMade(double quantityMade) {
        return setQuantityMade(BigDecimal.valueOf(quantityMade));
    }

    /**
     * El lote de lo producido, si el producto lleva lotes. Por omisión, OP-&lt;folio&gt;.
     */
    public String getLot() {
        return lot;
    }

    public CompleteProductionOrderParams setLot(String lot) {
        this.lot = lot;
        return this;
    }

    /**
     * La caducidad de ese lote (AAAA-MM-DD).
     */
    public String getExpiresOn() {
        return expiresOn;
    }

    public CompleteProductionOrderParams setExpiresOn(String expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Los otros costos como de verdad fueron; por omisión, los de la receta.
     */
    public List<CompleteProductionOrderParamsOtherCost> getOtherCosts() {
        return otherCosts;
    }

    public CompleteProductionOrderParams setOtherCosts(List<CompleteProductionOrderParamsOtherCost> otherCosts) {
        this.otherCosts = otherCosts;
        return this;
    }
}
