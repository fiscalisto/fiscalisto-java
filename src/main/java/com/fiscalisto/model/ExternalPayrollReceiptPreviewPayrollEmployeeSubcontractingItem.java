// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExternalPayrollReceiptPreviewPayrollEmployeeSubcontractingItem: ExternalPayrollReceiptPreviewPayrollEmployeeSubcontractingItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayrollEmployeeSubcontractingItem {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * percentage.
     */
    @JsonProperty("percentage")
    private BigDecimal percentage;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public ExternalPayrollReceiptPreviewPayrollEmployeeSubcontractingItem setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * percentage.
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    public ExternalPayrollReceiptPreviewPayrollEmployeeSubcontractingItem setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreviewPayrollEmployeeSubcontractingItem setPercentage(double percentage) {
        return setPercentage(BigDecimal.valueOf(percentage));
    }
}
