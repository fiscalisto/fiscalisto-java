// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * AnnualReturnLimit78b: AnnualReturnLimit78b.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnLimit78b {
    /**
     * Las deducciones del año más las pendientes de años anteriores.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * El 96.67% de los ingresos acumulables.
     */
    @JsonProperty("threshold")
    private BigDecimal threshold;

    /**
     * I: total hasta threshold, se deduce el 99%. II: total mayor, se deduce threshold.
     * <p>
     * Valores: I, II.
     */
    @JsonProperty("fraction")
    private String fraction;

    /**
     * Lo que se deduce.
     */
    @JsonProperty("limit")
    private BigDecimal limit;

    /**
     * Las deducciones pendientes de años anteriores, aplicadas primero.
     */
    @JsonProperty("pending_deductions")
    private List<AnnualReturnLimit78bPendingDeduction> pendingDeductions;

    /**
     * Lo de este año que pasa a los 20 ejercicios siguientes.
     */
    @JsonProperty("not_deducted")
    private BigDecimal notDeducted;

    /**
     * Las deducciones del año más las pendientes de años anteriores.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public AnnualReturnLimit78b setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLimit78b setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * El 96.67% de los ingresos acumulables.
     */
    public BigDecimal getThreshold() {
        return threshold;
    }

    public AnnualReturnLimit78b setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLimit78b setThreshold(double threshold) {
        return setThreshold(BigDecimal.valueOf(threshold));
    }

    /**
     * I: total hasta threshold, se deduce el 99%. II: total mayor, se deduce threshold.
     * <p>
     * Valores: I, II.
     */
    public String getFraction() {
        return fraction;
    }

    public AnnualReturnLimit78b setFraction(String fraction) {
        this.fraction = fraction;
        return this;
    }

    /**
     * Lo que se deduce.
     */
    public BigDecimal getLimit() {
        return limit;
    }

    public AnnualReturnLimit78b setLimit(BigDecimal limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLimit78b setLimit(double limit) {
        return setLimit(BigDecimal.valueOf(limit));
    }

    /**
     * Las deducciones pendientes de años anteriores, aplicadas primero.
     */
    public List<AnnualReturnLimit78bPendingDeduction> getPendingDeductions() {
        return pendingDeductions;
    }

    public AnnualReturnLimit78b setPendingDeductions(List<AnnualReturnLimit78bPendingDeduction> pendingDeductions) {
        this.pendingDeductions = pendingDeductions;
        return this;
    }

    /**
     * Lo de este año que pasa a los 20 ejercicios siguientes.
     */
    public BigDecimal getNotDeducted() {
        return notDeducted;
    }

    public AnnualReturnLimit78b setNotDeducted(BigDecimal notDeducted) {
        this.notDeducted = notDeducted;
        return this;
    }

    @JsonIgnore
    public AnnualReturnLimit78b setNotDeducted(double notDeducted) {
        return setNotDeducted(BigDecimal.valueOf(notDeducted));
    }
}
