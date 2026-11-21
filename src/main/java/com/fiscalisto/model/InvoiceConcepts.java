// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceConcepts: Los conceptos de la factura que se hace el comprador en el portal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceConcepts {
    /**
     * itemized: un concepto por renglón del ticket; single: uno solo; grouped: uno por cada grupo de groups. Lo que lleva otro juego de impuestos (como una noche con ISH) va siempre en su propio concepto.
     * <p>
     * Valores: itemized, single, grouped.
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * Si el comprador puede elegir en el portal entre las opciones de customer_options.
     */
    @JsonProperty("customer_choice")
    private Boolean customerChoice;

    /**
     * Las opciones que ve el comprador cuando puede elegir (incluye siempre mode, que llega elegida).
     */
    @JsonProperty("customer_options")
    private List<String> customerOptions;

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
     * Los grupos de «Por categoría», en orden: cada renglón va en el primero que lo tome.
     */
    @JsonProperty("groups")
    private List<InvoiceConceptsGroup> groups;

    /**
     * Lo que ningún grupo toma: itemized, desglosado; group, en un concepto más llamado ungrouped_name.
     * <p>
     * Valores: itemized, group.
     */
    @JsonProperty("ungrouped")
    private String ungrouped;

    /**
     * El nombre del concepto para lo que ningún grupo toma.
     */
    @JsonProperty("ungrouped_name")
    private String ungroupedName;

    /**
     * Qué pasa con el detail de cada línea del ticket: customer, el comprador ve la casilla sin marcar y la marca si lo quiere; always, va siempre después de la descripción; never, no va nunca.
     * <p>
     * Valores: customer, always, never.
     */
    @JsonProperty("line_detail")
    private String lineDetail;

    /**
     * itemized: un concepto por renglón del ticket; single: uno solo; grouped: uno por cada grupo de groups. Lo que lleva otro juego de impuestos (como una noche con ISH) va siempre en su propio concepto.
     * <p>
     * Valores: itemized, single, grouped.
     */
    public String getMode() {
        return mode;
    }

    public InvoiceConcepts setMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Si el comprador puede elegir en el portal entre las opciones de customer_options.
     */
    public Boolean getCustomerChoice() {
        return customerChoice;
    }

    public InvoiceConcepts setCustomerChoice(Boolean customerChoice) {
        this.customerChoice = customerChoice;
        return this;
    }

    /**
     * Las opciones que ve el comprador cuando puede elegir (incluye siempre mode, que llega elegida).
     */
    public List<String> getCustomerOptions() {
        return customerOptions;
    }

    public InvoiceConcepts setCustomerOptions(List<String> customerOptions) {
        this.customerOptions = customerOptions;
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

    /**
     * Los grupos de «Por categoría», en orden: cada renglón va en el primero que lo tome.
     */
    public List<InvoiceConceptsGroup> getGroups() {
        return groups;
    }

    public InvoiceConcepts setGroups(List<InvoiceConceptsGroup> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Lo que ningún grupo toma: itemized, desglosado; group, en un concepto más llamado ungrouped_name.
     * <p>
     * Valores: itemized, group.
     */
    public String getUngrouped() {
        return ungrouped;
    }

    public InvoiceConcepts setUngrouped(String ungrouped) {
        this.ungrouped = ungrouped;
        return this;
    }

    /**
     * El nombre del concepto para lo que ningún grupo toma.
     */
    public String getUngroupedName() {
        return ungroupedName;
    }

    public InvoiceConcepts setUngroupedName(String ungroupedName) {
        this.ungroupedName = ungroupedName;
        return this;
    }

    /**
     * Qué pasa con el detail de cada línea del ticket: customer, el comprador ve la casilla sin marcar y la marca si lo quiere; always, va siempre después de la descripción; never, no va nunca.
     * <p>
     * Valores: customer, always, never.
     */
    public String getLineDetail() {
        return lineDetail;
    }

    public InvoiceConcepts setLineDetail(String lineDetail) {
        this.lineDetail = lineDetail;
        return this;
    }
}
