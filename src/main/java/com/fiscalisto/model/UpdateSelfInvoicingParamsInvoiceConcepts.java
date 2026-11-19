// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsInvoiceConcepts: UpdateSelfInvoicingParamsInvoiceConcepts.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsInvoiceConcepts {
    /**
     * `itemized` (por omisión): un concepto por renglón del ticket (Hospedaje, Restaurante, Bar…). `single`: uno solo, con `description`; los renglones con otros impuestos (una noche con ISH, IVA 0 %, retenciones) van en su propio concepto, porque un concepto lleva un solo juego de impuestos. El total y los impuestos no cambian.
     * <p>
     * Valores: itemized, single.
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * `true`: el comprador elige en el portal entre desglosados y un solo concepto (empieza en `mode`), también en el portal dentro de su sitio.
     */
    @JsonProperty("customer_choice")
    private Boolean customerChoice;

    /**
     * La descripción del concepto único, como «Consumo» (por omisión) o «Servicios de hospedaje y alimentos».
     */
    @JsonProperty("description")
    private String description;

    /**
     * Su ClaveProdServ. `null` (por omisión): la del renglón más grande del ticket.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Su ClaveUnidad, con `product_key`, como `E48`. `null`: la del renglón más grande.
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * `itemized` (por omisión): un concepto por renglón del ticket (Hospedaje, Restaurante, Bar…). `single`: uno solo, con `description`; los renglones con otros impuestos (una noche con ISH, IVA 0 %, retenciones) van en su propio concepto, porque un concepto lleva un solo juego de impuestos. El total y los impuestos no cambian.
     * <p>
     * Valores: itemized, single.
     */
    public String getMode() {
        return mode;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * `true`: el comprador elige en el portal entre desglosados y un solo concepto (empieza en `mode`), también en el portal dentro de su sitio.
     */
    public Boolean getCustomerChoice() {
        return customerChoice;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setCustomerChoice(Boolean customerChoice) {
        this.customerChoice = customerChoice;
        return this;
    }

    /**
     * La descripción del concepto único, como «Consumo» (por omisión) o «Servicios de hospedaje y alimentos».
     */
    public String getDescription() {
        return description;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Su ClaveProdServ. `null` (por omisión): la del renglón más grande del ticket.
     */
    public String getProductKey() {
        return productKey;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Su ClaveUnidad, con `product_key`, como `E48`. `null`: la del renglón más grande.
     */
    public String getUnitKey() {
        return unitKey;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }
}
