// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoicePayrollEmployerSncf: Entidad del SNCF (EntidadSNCF).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollEmployerSncf {
    /**
     * Origen del recurso (OrigenRecurso): IP, IF o IM.
     */
    @JsonProperty("resource_origin")
    private String resourceOrigin;

    /**
     * Monto de recursos propios (MontoRecursoPropio), con IM.
     */
    @JsonProperty("own_resource_amount")
    private BigDecimal ownResourceAmount;

    /**
     * Origen del recurso (OrigenRecurso): IP, IF o IM.
     */
    public String getResourceOrigin() {
        return resourceOrigin;
    }

    public InvoicePayrollEmployerSncf setResourceOrigin(String resourceOrigin) {
        this.resourceOrigin = resourceOrigin;
        return this;
    }

    /**
     * Monto de recursos propios (MontoRecursoPropio), con IM.
     */
    public BigDecimal getOwnResourceAmount() {
        return ownResourceAmount;
    }

    public InvoicePayrollEmployerSncf setOwnResourceAmount(BigDecimal ownResourceAmount) {
        this.ownResourceAmount = ownResourceAmount;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollEmployerSncf setOwnResourceAmount(double ownResourceAmount) {
        return setOwnResourceAmount(BigDecimal.valueOf(ownResourceAmount));
    }
}
