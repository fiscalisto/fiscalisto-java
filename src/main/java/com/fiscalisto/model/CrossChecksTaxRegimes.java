// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CrossChecksTaxRegimes: Los regímenes del emisor (registered, de su constancia) y con cuáles facturó en el año.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossChecksTaxRegimes {
    /**
     * Los regímenes de su constancia (c_RegimenFiscal), capturados en la app.
     */
    @JsonProperty("registered")
    private List<String> registered;

    /**
     * Cada régimen con que facturó en el año (RegimenFiscal del emisor).
     */
    @JsonProperty("invoiced")
    private List<CrossChecksTaxRegimesInvoicedItem> invoiced;

    /**
     * Los regímenes de su constancia (c_RegimenFiscal), capturados en la app.
     */
    public List<String> getRegistered() {
        return registered;
    }

    public CrossChecksTaxRegimes setRegistered(List<String> registered) {
        this.registered = registered;
        return this;
    }

    /**
     * Cada régimen con que facturó en el año (RegimenFiscal del emisor).
     */
    public List<CrossChecksTaxRegimesInvoicedItem> getInvoiced() {
        return invoiced;
    }

    public CrossChecksTaxRegimes setInvoiced(List<CrossChecksTaxRegimesInvoicedItem> invoiced) {
        this.invoiced = invoiced;
        return this;
    }
}
