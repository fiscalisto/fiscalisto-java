// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptPreviewPayrollEmployerSncf: ExternalPayrollReceiptPreviewPayrollEmployerSncf.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayrollEmployerSncf {
    /**
     * resource_origin.
     */
    @JsonProperty("resource_origin")
    private String resourceOrigin;

    /**
     * own_resource_amount.
     */
    @JsonProperty("own_resource_amount")
    private BigDecimal ownResourceAmount;

    /**
     * resource_origin.
     */
    public String getResourceOrigin() {
        return resourceOrigin;
    }

    public ExternalPayrollReceiptPreviewPayrollEmployerSncf setResourceOrigin(String resourceOrigin) {
        this.resourceOrigin = resourceOrigin;
        return this;
    }

    /**
     * own_resource_amount.
     */
    public BigDecimal getOwnResourceAmount() {
        return ownResourceAmount;
    }

    public ExternalPayrollReceiptPreviewPayrollEmployerSncf setOwnResourceAmount(BigDecimal ownResourceAmount) {
        this.ownResourceAmount = ownResourceAmount;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollEmployerSncf setOwnResourceAmount(double ownResourceAmount) {
        return setOwnResourceAmount(BigDecimal.valueOf(ownResourceAmount));
    }
}
