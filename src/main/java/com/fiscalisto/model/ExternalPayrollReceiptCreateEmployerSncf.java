// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptCreateEmployerSncf: EntidadSNCF, solo para entidades adheridas al SNCF.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptCreateEmployerSncf {
    /**
     * OrigenRecurso: IP, IF o IM.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("resource_origin")
    private String resourceOrigin;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("own_resource_amount")
    private BigDecimal ownResourceAmount;

    /**
     * OrigenRecurso: IP, IF o IM.
     * <p>
     * Obligatorio.
     */
    public String getResourceOrigin() {
        return resourceOrigin;
    }

    public ExternalPayrollReceiptCreateEmployerSncf setResourceOrigin(String resourceOrigin) {
        this.resourceOrigin = resourceOrigin;
        return this;
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getOwnResourceAmount() {
        return ownResourceAmount;
    }

    public ExternalPayrollReceiptCreateEmployerSncf setOwnResourceAmount(BigDecimal ownResourceAmount) {
        this.ownResourceAmount = ownResourceAmount;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptCreateEmployerSncf setOwnResourceAmount(double ownResourceAmount) {
        return setOwnResourceAmount(BigDecimal.valueOf(ownResourceAmount));
    }
}
