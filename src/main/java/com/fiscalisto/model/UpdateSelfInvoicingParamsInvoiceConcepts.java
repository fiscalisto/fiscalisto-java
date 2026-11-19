// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateSelfInvoicingParamsInvoiceConcepts: UpdateSelfInvoicingParamsInvoiceConcepts.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsInvoiceConcepts {
    /**
     * `itemized` (por omisión): un concepto por renglón del ticket (Hospedaje, Restaurante, Bar…). `single`: uno solo, con `description`. `grouped`: los conceptos de `groups`. Un concepto lleva un solo juego de impuestos, así que los renglones con otros (una noche con ISH, IVA 0 %, retenciones) van aparte. El total y los impuestos no cambian.
     * <p>
     * Valores: itemized, single, grouped.
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * `true`: el comprador elige en el portal (también dentro de su sitio) entre `customer_options`, empezando en `mode`.
     */
    @JsonProperty("customer_choice")
    private Boolean customerChoice;

    /**
     * Entre qué puede elegir el comprador, por omisión `itemized` y `single`. `mode` va siempre; `grouped` necesita `groups`.
     */
    @JsonProperty("customer_options")
    private List<String> customerOptions;

    /**
     * La descripción del concepto único, como «Consumo» (por omisión) o «Servicios de hospedaje y alimentos».
     */
    @JsonProperty("description")
    private String description;

    /**
     * La ClaveProdServ del concepto único. `null` (por omisión): la del renglón más grande del ticket.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Su ClaveUnidad, con `product_key`, como `E48`. `null`: la del renglón más grande.
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Los conceptos de `grouped`, hasta 12: cada renglón va al primero que lo toma, por su clave del SAT (`sat_keys`) o la categoría de su producto (`categories`). Reemplaza la lista guardada.
     */
    @JsonProperty("groups")
    private List<UpdateSelfInvoicingParamsInvoiceConceptsGroup> groups;

    /**
     * Con `grouped`, los renglones que ningún grupo toma: `itemized` (por omisión) como vienen, o `group` en un concepto más llamado `ungrouped_name`.
     * <p>
     * Valores: itemized, group.
     */
    @JsonProperty("ungrouped")
    private String ungrouped;

    /**
     * El nombre de ese concepto, por omisión «Otros».
     */
    @JsonProperty("ungrouped_name")
    private String ungroupedName;

    /**
     * `itemized` (por omisión): un concepto por renglón del ticket (Hospedaje, Restaurante, Bar…). `single`: uno solo, con `description`. `grouped`: los conceptos de `groups`. Un concepto lleva un solo juego de impuestos, así que los renglones con otros (una noche con ISH, IVA 0 %, retenciones) van aparte. El total y los impuestos no cambian.
     * <p>
     * Valores: itemized, single, grouped.
     */
    public String getMode() {
        return mode;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * `true`: el comprador elige en el portal (también dentro de su sitio) entre `customer_options`, empezando en `mode`.
     */
    public Boolean getCustomerChoice() {
        return customerChoice;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setCustomerChoice(Boolean customerChoice) {
        this.customerChoice = customerChoice;
        return this;
    }

    /**
     * Entre qué puede elegir el comprador, por omisión `itemized` y `single`. `mode` va siempre; `grouped` necesita `groups`.
     */
    public List<String> getCustomerOptions() {
        return customerOptions;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setCustomerOptions(List<String> customerOptions) {
        this.customerOptions = customerOptions;
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
     * La ClaveProdServ del concepto único. `null` (por omisión): la del renglón más grande del ticket.
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

    /**
     * Los conceptos de `grouped`, hasta 12: cada renglón va al primero que lo toma, por su clave del SAT (`sat_keys`) o la categoría de su producto (`categories`). Reemplaza la lista guardada.
     */
    public List<UpdateSelfInvoicingParamsInvoiceConceptsGroup> getGroups() {
        return groups;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setGroups(List<UpdateSelfInvoicingParamsInvoiceConceptsGroup> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Con `grouped`, los renglones que ningún grupo toma: `itemized` (por omisión) como vienen, o `group` en un concepto más llamado `ungrouped_name`.
     * <p>
     * Valores: itemized, group.
     */
    public String getUngrouped() {
        return ungrouped;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setUngrouped(String ungrouped) {
        this.ungrouped = ungrouped;
        return this;
    }

    /**
     * El nombre de ese concepto, por omisión «Otros».
     */
    public String getUngroupedName() {
        return ungroupedName;
    }

    public UpdateSelfInvoicingParamsInvoiceConcepts setUngroupedName(String ungroupedName) {
        this.ungroupedName = ungroupedName;
        return this;
    }
}
