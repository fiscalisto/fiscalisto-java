// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceConceptsGroup: InvoiceConceptsGroup.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceConceptsGroup {
    /**
     * El nombre del concepto, como «Alimentos y bebidas».
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su ClaveProdServ, o null para la del renglón más grande del grupo.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Su ClaveUnidad, o null para la del renglón más grande.
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Las claves del SAT que toma, completas o su inicio (de 2 a 8 dígitos, como 9010).
     */
    @JsonProperty("sat_keys")
    private List<String> satKeys;

    /**
     * Las categorías de producto que toma, por su ruta («Hotel › Habitaciones»); una categoría toma también las de adentro.
     */
    @JsonProperty("categories")
    private List<String> categories;

    /**
     * El nombre del concepto, como «Alimentos y bebidas».
     */
    public String getName() {
        return name;
    }

    public InvoiceConceptsGroup setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su ClaveProdServ, o null para la del renglón más grande del grupo.
     */
    public String getProductKey() {
        return productKey;
    }

    public InvoiceConceptsGroup setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Su ClaveUnidad, o null para la del renglón más grande.
     */
    public String getUnitKey() {
        return unitKey;
    }

    public InvoiceConceptsGroup setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Las claves del SAT que toma, completas o su inicio (de 2 a 8 dígitos, como 9010).
     */
    public List<String> getSatKeys() {
        return satKeys;
    }

    public InvoiceConceptsGroup setSatKeys(List<String> satKeys) {
        this.satKeys = satKeys;
        return this;
    }

    /**
     * Las categorías de producto que toma, por su ruta («Hotel › Habitaciones»); una categoría toma también las de adentro.
     */
    public List<String> getCategories() {
        return categories;
    }

    public InvoiceConceptsGroup setCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }
}
