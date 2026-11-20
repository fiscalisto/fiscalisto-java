// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * AnnualReturnCarryForward: Lo que pasó al año siguiente de la declaración anual.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnCarryForward {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El ejercicio del que salen.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * El ejercicio al que pasan.
     */
    @JsonProperty("to_year")
    private Long toYear;

    /**
     * Las pérdidas que pasaron.
     */
    @JsonProperty("losses")
    private List<AnnualReturnCarryForwardLoss> losses;

    /**
     * Las deducciones pendientes del artículo 78-B que pasaron.
     */
    @JsonProperty("pending_deductions")
    private List<AnnualReturnCarryForwardPendingDeduction> pendingDeductions;

    /**
     * La suma de las pérdidas que pasaron.
     */
    @JsonProperty("total_losses")
    private BigDecimal totalLosses;

    /**
     * true si se pusieron en los pagos provisionales del año siguiente (no tenían pérdidas en Impuestos).
     */
    @JsonProperty("provisional_payments_updated")
    private Boolean provisionalPaymentsUpdated;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AnnualReturnCarryForward setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AnnualReturnCarryForward setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public AnnualReturnCarryForward setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio del que salen.
     */
    public Long getYear() {
        return year;
    }

    public AnnualReturnCarryForward setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public AnnualReturnCarryForward setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * El ejercicio al que pasan.
     */
    public Long getToYear() {
        return toYear;
    }

    public AnnualReturnCarryForward setToYear(Long toYear) {
        this.toYear = toYear;
        return this;
    }

    @JsonIgnore
    public AnnualReturnCarryForward setToYear(long toYear) {
        return setToYear(Long.valueOf(toYear));
    }

    /**
     * Las pérdidas que pasaron.
     */
    public List<AnnualReturnCarryForwardLoss> getLosses() {
        return losses;
    }

    public AnnualReturnCarryForward setLosses(List<AnnualReturnCarryForwardLoss> losses) {
        this.losses = losses;
        return this;
    }

    /**
     * Las deducciones pendientes del artículo 78-B que pasaron.
     */
    public List<AnnualReturnCarryForwardPendingDeduction> getPendingDeductions() {
        return pendingDeductions;
    }

    public AnnualReturnCarryForward setPendingDeductions(List<AnnualReturnCarryForwardPendingDeduction> pendingDeductions) {
        this.pendingDeductions = pendingDeductions;
        return this;
    }

    /**
     * La suma de las pérdidas que pasaron.
     */
    public BigDecimal getTotalLosses() {
        return totalLosses;
    }

    public AnnualReturnCarryForward setTotalLosses(BigDecimal totalLosses) {
        this.totalLosses = totalLosses;
        return this;
    }

    @JsonIgnore
    public AnnualReturnCarryForward setTotalLosses(double totalLosses) {
        return setTotalLosses(BigDecimal.valueOf(totalLosses));
    }

    /**
     * true si se pusieron en los pagos provisionales del año siguiente (no tenían pérdidas en Impuestos).
     */
    public Boolean getProvisionalPaymentsUpdated() {
        return provisionalPaymentsUpdated;
    }

    public AnnualReturnCarryForward setProvisionalPaymentsUpdated(Boolean provisionalPaymentsUpdated) {
        this.provisionalPaymentsUpdated = provisionalPaymentsUpdated;
        return this;
    }
}
