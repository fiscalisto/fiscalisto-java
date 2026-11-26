// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * UpdateInvoiceParamsAddenda: Addenda del receptor (Walmart, Soriana…), con sus propios campos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsAddenda {
    /**
     * type.
     * <p>
     * Valores: walmart, soriana, liverpool, homedepot, chedraui, generic.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * values.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("values")
    private Map<String, String> values;

    /**
     * customer.
     */
    @JsonProperty("customer")
    private Map<String, String> customer;

    /**
     * type.
     * <p>
     * Valores: walmart, soriana, liverpool, homedepot, chedraui, generic.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public UpdateInvoiceParamsAddenda setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * values.
     * <p>
     * Obligatorio.
     */
    public Map<String, String> getValues() {
        return values;
    }

    public UpdateInvoiceParamsAddenda setValues(Map<String, String> values) {
        this.values = values;
        return this;
    }

    /**
     * customer.
     */
    public Map<String, String> getCustomer() {
        return customer;
    }

    public UpdateInvoiceParamsAddenda setCustomer(Map<String, String> customer) {
        this.customer = customer;
        return this;
    }
}
