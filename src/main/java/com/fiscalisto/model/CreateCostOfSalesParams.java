// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateCostOfSalesParams: los campos de «Registrar el costo de ventas de un mes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCostOfSalesParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Lo que vale el inventario al cierre del mes en pesos (0 si no hay). Por lo general, suggested_ending_inventory o el de su conteo físico.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("ending_inventory")
    private BigDecimal endingInventory;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateCostOfSalesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Lo que vale el inventario al cierre del mes en pesos (0 si no hay). Por lo general, suggested_ending_inventory o el de su conteo físico.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getEndingInventory() {
        return endingInventory;
    }

    public CreateCostOfSalesParams setEndingInventory(BigDecimal endingInventory) {
        this.endingInventory = endingInventory;
        return this;
    }

    @JsonIgnore
    public CreateCostOfSalesParams setEndingInventory(double endingInventory) {
        return setEndingInventory(BigDecimal.valueOf(endingInventory));
    }
}
