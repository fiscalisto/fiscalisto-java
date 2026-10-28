// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateExternalPayrollReceiptParamsEmployeeSubcontractingItem: CreateExternalPayrollReceiptParamsEmployeeSubcontractingItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExternalPayrollReceiptParamsEmployeeSubcontractingItem {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * PorcentajeTiempo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("percentage")
    private BigDecimal percentage;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public CreateExternalPayrollReceiptParamsEmployeeSubcontractingItem setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * PorcentajeTiempo.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    public CreateExternalPayrollReceiptParamsEmployeeSubcontractingItem setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
        return this;
    }

    @JsonIgnore
    public CreateExternalPayrollReceiptParamsEmployeeSubcontractingItem setPercentage(double percentage) {
        return setPercentage(BigDecimal.valueOf(percentage));
    }
}
