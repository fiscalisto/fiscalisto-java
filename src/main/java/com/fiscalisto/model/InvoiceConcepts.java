// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceConcepts: Los conceptos de la factura que se hace el comprador en el portal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceConcepts {
    /**
     * itemized: un concepto por renglón del ticket; single: uno solo (más uno por cada otro juego de impuestos, como una noche con ISH).
     * <p>
     * Valores: itemized, single.
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * Si el comprador puede elegir en el portal entre desglosados y un solo concepto.
     */
    @JsonProperty("customer_choice")
    private Boolean customerChoice;

    /**
     * La descripción del concepto único, como «Consumo».
     */
    @JsonProperty("description")
    private String description;

    /**
     * La ClaveProdServ del concepto único, o null para la del renglón más grande.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Su ClaveUnidad, o null para la del renglón más grande.
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * itemized: un concepto por renglón del ticket; single: uno solo (más uno por cada otro juego de impuestos, como una noche con ISH).
     * <p>
     * Valores: itemized, single.
     */
    public String getMode() {
        return mode;
    }

    public InvoiceConcepts setMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Si el comprador puede elegir en el portal entre desglosados y un solo concepto.
     */
    public Boolean getCustomerChoice() {
        return customerChoice;
    }

    public InvoiceConcepts setCustomerChoice(Boolean customerChoice) {
        this.customerChoice = customerChoice;
        return this;
    }

    /**
     * La descripción del concepto único, como «Consumo».
     */
    public String getDescription() {
        return description;
    }

    public InvoiceConcepts setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * La ClaveProdServ del concepto único, o null para la del renglón más grande.
     */
    public String getProductKey() {
        return productKey;
    }

    public InvoiceConcepts setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Su ClaveUnidad, o null para la del renglón más grande.
     */
    public String getUnitKey() {
        return unitKey;
    }

    public InvoiceConcepts setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }
}
