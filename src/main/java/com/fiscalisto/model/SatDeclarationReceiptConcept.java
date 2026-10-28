// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SatDeclarationReceiptConcept: SatDeclarationReceiptConcept.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationReceiptConcept {
    /**
     * El concepto de la línea de captura (ISR, IVA…) como lo da el SAT.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * Lo que resultó a cargo.
     */
    @JsonProperty("due")
    private BigDecimal due;

    /**
     * La cantidad a cargo.
     */
    @JsonProperty("amount_due")
    private BigDecimal amountDue;

    /**
     * La cantidad a pagar.
     */
    @JsonProperty("amount_to_pay")
    private BigDecimal amountToPay;

    /**
     * El concepto de la línea de captura (ISR, IVA…) como lo da el SAT.
     */
    public String getConcept() {
        return concept;
    }

    public SatDeclarationReceiptConcept setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Lo que resultó a cargo.
     */
    public BigDecimal getDue() {
        return due;
    }

    public SatDeclarationReceiptConcept setDue(BigDecimal due) {
        this.due = due;
        return this;
    }

    @JsonIgnore
    public SatDeclarationReceiptConcept setDue(double due) {
        return setDue(BigDecimal.valueOf(due));
    }

    /**
     * La cantidad a cargo.
     */
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public SatDeclarationReceiptConcept setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    @JsonIgnore
    public SatDeclarationReceiptConcept setAmountDue(double amountDue) {
        return setAmountDue(BigDecimal.valueOf(amountDue));
    }

    /**
     * La cantidad a pagar.
     */
    public BigDecimal getAmountToPay() {
        return amountToPay;
    }

    public SatDeclarationReceiptConcept setAmountToPay(BigDecimal amountToPay) {
        this.amountToPay = amountToPay;
        return this;
    }

    @JsonIgnore
    public SatDeclarationReceiptConcept setAmountToPay(double amountToPay) {
        return setAmountToPay(BigDecimal.valueOf(amountToPay));
    }
}
