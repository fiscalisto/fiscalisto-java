// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoicePayrollEmployeeSubcontractingItem: InvoicePayrollEmployeeSubcontractingItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollEmployeeSubcontractingItem {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Porcentaje de tiempo (PorcentajeTiempo).
     */
    @JsonProperty("percentage")
    private BigDecimal percentage;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public InvoicePayrollEmployeeSubcontractingItem setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Porcentaje de tiempo (PorcentajeTiempo).
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    public InvoicePayrollEmployeeSubcontractingItem setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
        return this;
    }

    @JsonIgnore
    public InvoicePayrollEmployeeSubcontractingItem setPercentage(double percentage) {
        return setPercentage(BigDecimal.valueOf(percentage));
    }
}
