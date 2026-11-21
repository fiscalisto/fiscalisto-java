// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RuleActionColumns: RuleActionColumns.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleActionColumns {
    /**
     * Columnas de {tabla_facturas}, en su orden.
     */
    @JsonProperty("tabla_facturas")
    private List<String> tablaFacturas;

    /**
     * Columnas de {tabla_conceptos}, en su orden.
     */
    @JsonProperty("tabla_conceptos")
    private List<String> tablaConceptos;

    /**
     * Columnas de {tabla_productos}, en su orden.
     */
    @JsonProperty("tabla_productos")
    private List<String> tablaProductos;

    /**
     * Columnas de {tabla_facturas}, en su orden.
     */
    public List<String> getTablaFacturas() {
        return tablaFacturas;
    }

    public RuleActionColumns setTablaFacturas(List<String> tablaFacturas) {
        this.tablaFacturas = tablaFacturas;
        return this;
    }

    /**
     * Columnas de {tabla_conceptos}, en su orden.
     */
    public List<String> getTablaConceptos() {
        return tablaConceptos;
    }

    public RuleActionColumns setTablaConceptos(List<String> tablaConceptos) {
        this.tablaConceptos = tablaConceptos;
        return this;
    }

    /**
     * Columnas de {tabla_productos}, en su orden.
     */
    public List<String> getTablaProductos() {
        return tablaProductos;
    }

    public RuleActionColumns setTablaProductos(List<String> tablaProductos) {
        this.tablaProductos = tablaProductos;
        return this;
    }
}
