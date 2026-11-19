// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateSelfInvoicingParamsInvoiceConceptsGroup: UpdateSelfInvoicingParamsInvoiceConceptsGroup.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsInvoiceConceptsGroup {
    /**
     * La descripción del concepto, como «Alimentos y bebidas».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su ClaveProdServ. `null` (por omisión): la de su renglón más grande.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Su ClaveUnidad, con `product_key`, como `E48`.
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Los renglones cuya clave del SAT empieza así: `9010` toma 90101501 (restaurante) y 90101503 (bar); `90111800`, solo hospedaje.
     */
    @JsonProperty("sat_keys")
    private List<String> satKeys;

    /**
     * Los renglones de los productos de estas categorías y sus subcategorías, por su ruta como la da `category` del producto («Alimentos › Bebidas»).
     */
    @JsonProperty("categories")
    private List<String> categories;

    /**
     * La descripción del concepto, como «Alimentos y bebidas».
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public UpdateSelfInvoicingParamsInvoiceConceptsGroup setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su ClaveProdServ. `null` (por omisión): la de su renglón más grande.
     */
    public String getProductKey() {
        return productKey;
    }

    public UpdateSelfInvoicingParamsInvoiceConceptsGroup setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Su ClaveUnidad, con `product_key`, como `E48`.
     */
    public String getUnitKey() {
        return unitKey;
    }

    public UpdateSelfInvoicingParamsInvoiceConceptsGroup setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Los renglones cuya clave del SAT empieza así: `9010` toma 90101501 (restaurante) y 90101503 (bar); `90111800`, solo hospedaje.
     */
    public List<String> getSatKeys() {
        return satKeys;
    }

    public UpdateSelfInvoicingParamsInvoiceConceptsGroup setSatKeys(List<String> satKeys) {
        this.satKeys = satKeys;
        return this;
    }

    /**
     * Los renglones de los productos de estas categorías y sus subcategorías, por su ruta como la da `category` del producto («Alimentos › Bebidas»).
     */
    public List<String> getCategories() {
        return categories;
    }

    public UpdateSelfInvoicingParamsInvoiceConceptsGroup setCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }
}
