// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CrossChecksVatBalanceInFavor: El IVA a favor que muestran las declaraciones del año y lo que meses posteriores acreditaron. Una estimación con las declaraciones leídas, no la cuenta del SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossChecksVatBalanceInFavor {
    /**
     * Cada mes con IVA a favor.
     */
    @JsonProperty("periods")
    private List<CrossChecksVatBalanceInFavorPeriod> periods;

    /**
     * La suma del IVA a favor del año.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo que las declaraciones del año acreditaron de saldos a favor de periodos anteriores.
     */
    @JsonProperty("credited")
    private BigDecimal credited;

    /**
     * total menos credited, nunca menos de 0: lo que quedaría por acreditar o pedir en devolución.
     */
    @JsonProperty("remaining")
    private BigDecimal remaining;

    /**
     * Cada mes con IVA a favor.
     */
    public List<CrossChecksVatBalanceInFavorPeriod> getPeriods() {
        return periods;
    }

    public CrossChecksVatBalanceInFavor setPeriods(List<CrossChecksVatBalanceInFavorPeriod> periods) {
        this.periods = periods;
        return this;
    }

    /**
     * La suma del IVA a favor del año.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CrossChecksVatBalanceInFavor setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CrossChecksVatBalanceInFavor setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Lo que las declaraciones del año acreditaron de saldos a favor de periodos anteriores.
     */
    public BigDecimal getCredited() {
        return credited;
    }

    public CrossChecksVatBalanceInFavor setCredited(BigDecimal credited) {
        this.credited = credited;
        return this;
    }

    @JsonIgnore
    public CrossChecksVatBalanceInFavor setCredited(double credited) {
        return setCredited(BigDecimal.valueOf(credited));
    }

    /**
     * total menos credited, nunca menos de 0: lo que quedaría por acreditar o pedir en devolución.
     */
    public BigDecimal getRemaining() {
        return remaining;
    }

    public CrossChecksVatBalanceInFavor setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
        return this;
    }

    @JsonIgnore
    public CrossChecksVatBalanceInFavor setRemaining(double remaining) {
        return setRemaining(BigDecimal.valueOf(remaining));
    }
}
