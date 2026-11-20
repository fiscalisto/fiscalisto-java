// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ApplyEntryTemplateParams: los campos de «Calcular los renglones de una póliza modelo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplyEntryTemplateParams {
    /**
     * El total de la póliza: cada porcentaje se calcula sobre él, al centavo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * El total de la póliza: cada porcentaje se calcula sobre él, al centavo.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public ApplyEntryTemplateParams setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public ApplyEntryTemplateParams setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
