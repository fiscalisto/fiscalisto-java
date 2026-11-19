// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * StartProductionOrderParams: los campos de «Iniciar una orden de producción».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StartProductionOrderParams {
    /**
     * Lo que de verdad se usó de algún componente; los que no mande salen como dice la orden.
     */
    @JsonProperty("components")
    private List<StartProductionOrderParamsComponent> components;

    /**
     * Lo que de verdad se usó de algún componente; los que no mande salen como dice la orden.
     */
    public List<StartProductionOrderParamsComponent> getComponents() {
        return components;
    }

    public StartProductionOrderParams setComponents(List<StartProductionOrderParamsComponent> components) {
        this.components = components;
        return this;
    }
}
