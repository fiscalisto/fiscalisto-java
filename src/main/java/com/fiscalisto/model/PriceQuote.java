// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * PriceQuote: Lo que un cliente paga por unos productos a una cantidad: su precio por unidad sin IVA (de su lista), su descuento y el siguiente escalón de mayoreo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceQuote {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El cliente (cus_…) cuyos precios se calcularon.
     */
    @JsonProperty("customer")
    private String customer;

    /**
     * Conceptos (Conceptos), al menos uno.
     */
    @JsonProperty("items")
    private List<PriceQuoteItem> items;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PriceQuote setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PriceQuote setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El cliente (cus_…) cuyos precios se calcularon.
     */
    public String getCustomer() {
        return customer;
    }

    public PriceQuote setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Conceptos (Conceptos), al menos uno.
     */
    public List<PriceQuoteItem> getItems() {
        return items;
    }

    public PriceQuote setItems(List<PriceQuoteItem> items) {
        this.items = items;
        return this;
    }
}
