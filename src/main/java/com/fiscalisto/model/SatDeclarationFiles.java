// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatDeclarationFiles: Qué archivos ya tiene: pdf (GET …/pdf), receipt (GET …/receipt) y financial_statements (GET …/financial_statements, solo en la anual de persona moral).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationFiles {
    /**
     * Si ya tiene la declaración en PDF (GET …/pdf).
     */
    @JsonProperty("pdf")
    private Boolean pdf;

    /**
     * Si ya tiene el acuse (GET …/receipt).
     */
    @JsonProperty("receipt")
    private Boolean receipt;

    /**
     * Si ya tiene el Excel de estados financieros (GET …/financial_statements), solo en la anual de persona moral.
     */
    @JsonProperty("financial_statements")
    private Boolean financialStatements;

    /**
     * Si ya tiene la declaración en PDF (GET …/pdf).
     */
    public Boolean getPdf() {
        return pdf;
    }

    public SatDeclarationFiles setPdf(Boolean pdf) {
        this.pdf = pdf;
        return this;
    }

    /**
     * Si ya tiene el acuse (GET …/receipt).
     */
    public Boolean getReceipt() {
        return receipt;
    }

    public SatDeclarationFiles setReceipt(Boolean receipt) {
        this.receipt = receipt;
        return this;
    }

    /**
     * Si ya tiene el Excel de estados financieros (GET …/financial_statements), solo en la anual de persona moral.
     */
    public Boolean getFinancialStatements() {
        return financialStatements;
    }

    public SatDeclarationFiles setFinancialStatements(Boolean financialStatements) {
        this.financialStatements = financialStatements;
        return this;
    }
}
