// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PurchaseReceiptField: PurchaseReceiptField.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseReceiptField {
    /**
     * Cómo lo llama el ticket (Web ID, Sucursal…).
     */
    @JsonProperty("label")
    private String label;

    /**
     * Lo que dice el ticket en ese dato.
     */
    @JsonProperty("value")
    private String value;

    /**
     * Cómo lo llama el ticket (Web ID, Sucursal…).
     */
    public String getLabel() {
        return label;
    }

    public PurchaseReceiptField setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Lo que dice el ticket en ese dato.
     */
    public String getValue() {
        return value;
    }

    public PurchaseReceiptField setValue(String value) {
        this.value = value;
        return this;
    }
}
