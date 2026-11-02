// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdatePurchaseReceiptParamsField: UpdatePurchaseReceiptParamsField.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatePurchaseReceiptParamsField {
    /**
     * Cómo lo llama el ticket (Web ID, Sucursal…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Lo que dice el ticket en ese dato.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("value")
    private String value;

    /**
     * Cómo lo llama el ticket (Web ID, Sucursal…).
     * <p>
     * Obligatorio.
     */
    public String getLabel() {
        return label;
    }

    public UpdatePurchaseReceiptParamsField setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Lo que dice el ticket en ese dato.
     * <p>
     * Obligatorio.
     */
    public String getValue() {
        return value;
    }

    public UpdatePurchaseReceiptParamsField setValue(String value) {
        this.value = value;
        return this;
    }
}
