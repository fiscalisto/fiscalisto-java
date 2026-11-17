// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SatAnnualPreloadPersonalDeductions: SatAnnualPreloadPersonalDeductions.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatAnnualPreloadPersonalDeductions {
    /**
     * Cuándo actualizó el SAT el visor.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Cuándo se leyó del SAT.
     */
    @JsonProperty("read_at")
    private String readAt;

    /**
     * Las deducciones personales que el SAT precarga.
     */
    @JsonProperty("total_taken")
    private BigDecimal totalTaken;

    /**
     * Lo que podría deducirse y el SAT no toma (gastos factibles de ser deducción personal).
     */
    @JsonProperty("total_possible")
    private BigDecimal totalPossible;

    /**
     * Lo que toma, por tipo de deducción.
     */
    @JsonProperty("taken")
    private List<SatAnnualPreloadPersonalDeductionsTakenItem> taken;

    /**
     * Lo que no toma, por el tipo de deducción que parece.
     */
    @JsonProperty("possible")
    private List<SatAnnualPreloadPersonalDeductionsPossibleItem> possible;

    /**
     * Cada CFDI que el visor considera.
     */
    @JsonProperty("invoices")
    private List<SatAnnualPreloadPersonalDeductionsInvoice> invoices;

    /**
     * Cuándo actualizó el SAT el visor.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public SatAnnualPreloadPersonalDeductions setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Cuándo se leyó del SAT.
     */
    public String getReadAt() {
        return readAt;
    }

    public SatAnnualPreloadPersonalDeductions setReadAt(String readAt) {
        this.readAt = readAt;
        return this;
    }

    /**
     * Las deducciones personales que el SAT precarga.
     */
    public BigDecimal getTotalTaken() {
        return totalTaken;
    }

    public SatAnnualPreloadPersonalDeductions setTotalTaken(BigDecimal totalTaken) {
        this.totalTaken = totalTaken;
        return this;
    }

    @JsonIgnore
    public SatAnnualPreloadPersonalDeductions setTotalTaken(double totalTaken) {
        return setTotalTaken(BigDecimal.valueOf(totalTaken));
    }

    /**
     * Lo que podría deducirse y el SAT no toma (gastos factibles de ser deducción personal).
     */
    public BigDecimal getTotalPossible() {
        return totalPossible;
    }

    public SatAnnualPreloadPersonalDeductions setTotalPossible(BigDecimal totalPossible) {
        this.totalPossible = totalPossible;
        return this;
    }

    @JsonIgnore
    public SatAnnualPreloadPersonalDeductions setTotalPossible(double totalPossible) {
        return setTotalPossible(BigDecimal.valueOf(totalPossible));
    }

    /**
     * Lo que toma, por tipo de deducción.
     */
    public List<SatAnnualPreloadPersonalDeductionsTakenItem> getTaken() {
        return taken;
    }

    public SatAnnualPreloadPersonalDeductions setTaken(List<SatAnnualPreloadPersonalDeductionsTakenItem> taken) {
        this.taken = taken;
        return this;
    }

    /**
     * Lo que no toma, por el tipo de deducción que parece.
     */
    public List<SatAnnualPreloadPersonalDeductionsPossibleItem> getPossible() {
        return possible;
    }

    public SatAnnualPreloadPersonalDeductions setPossible(List<SatAnnualPreloadPersonalDeductionsPossibleItem> possible) {
        this.possible = possible;
        return this;
    }

    /**
     * Cada CFDI que el visor considera.
     */
    public List<SatAnnualPreloadPersonalDeductionsInvoice> getInvoices() {
        return invoices;
    }

    public SatAnnualPreloadPersonalDeductions setInvoices(List<SatAnnualPreloadPersonalDeductionsInvoice> invoices) {
        this.invoices = invoices;
        return this;
    }
}
