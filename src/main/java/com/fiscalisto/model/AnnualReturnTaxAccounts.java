// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * AnnualReturnTaxAccounts: La CUFIN (artículo 77) y la CUCA (artículo 78) del año, con sus dividendos y movimientos de capital.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnTaxAccounts {
    /**
     * true si no se han capturado los saldos al cierre del año anterior: se calcula desde cero.
     */
    @JsonProperty("opening_missing")
    private Boolean openingMissing;

    /**
     * Los saldos al inicio del año.
     */
    @JsonProperty("opening")
    private AnnualReturnTaxAccountsOpening opening;

    /**
     * Cada movimiento del año, en orden de fecha.
     */
    @JsonProperty("movements")
    private List<AnnualReturnTaxAccountsMovement> movements;

    /**
     * El ISR del artículo 10 de los movimientos del año.
     */
    @JsonProperty("dividend_tax")
    private BigDecimal dividendTax;

    /**
     * Los saldos al 31 de diciembre, actualizados y con la utilidad fiscal neta del año.
     */
    @JsonProperty("year_end")
    private AnnualReturnTaxAccountsYearEnd yearEnd;

    /**
     * Lo que una utilidad fiscal neta negativa de años anteriores restó a la de este año.
     */
    @JsonProperty("negative_net_tax_profit_applied")
    private BigDecimal negativeNetTaxProfitApplied;

    /**
     * Lo que pasa al año siguiente además de los saldos.
     */
    @JsonProperty("next_year")
    private AnnualReturnTaxAccountsNextYear nextYear;

    /**
     * true si no se han capturado los saldos al cierre del año anterior: se calcula desde cero.
     */
    public Boolean getOpeningMissing() {
        return openingMissing;
    }

    public AnnualReturnTaxAccounts setOpeningMissing(Boolean openingMissing) {
        this.openingMissing = openingMissing;
        return this;
    }

    /**
     * Los saldos al inicio del año.
     */
    public AnnualReturnTaxAccountsOpening getOpening() {
        return opening;
    }

    public AnnualReturnTaxAccounts setOpening(AnnualReturnTaxAccountsOpening opening) {
        this.opening = opening;
        return this;
    }

    /**
     * Cada movimiento del año, en orden de fecha.
     */
    public List<AnnualReturnTaxAccountsMovement> getMovements() {
        return movements;
    }

    public AnnualReturnTaxAccounts setMovements(List<AnnualReturnTaxAccountsMovement> movements) {
        this.movements = movements;
        return this;
    }

    /**
     * El ISR del artículo 10 de los movimientos del año.
     */
    public BigDecimal getDividendTax() {
        return dividendTax;
    }

    public AnnualReturnTaxAccounts setDividendTax(BigDecimal dividendTax) {
        this.dividendTax = dividendTax;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccounts setDividendTax(double dividendTax) {
        return setDividendTax(BigDecimal.valueOf(dividendTax));
    }

    /**
     * Los saldos al 31 de diciembre, actualizados y con la utilidad fiscal neta del año.
     */
    public AnnualReturnTaxAccountsYearEnd getYearEnd() {
        return yearEnd;
    }

    public AnnualReturnTaxAccounts setYearEnd(AnnualReturnTaxAccountsYearEnd yearEnd) {
        this.yearEnd = yearEnd;
        return this;
    }

    /**
     * Lo que una utilidad fiscal neta negativa de años anteriores restó a la de este año.
     */
    public BigDecimal getNegativeNetTaxProfitApplied() {
        return negativeNetTaxProfitApplied;
    }

    public AnnualReturnTaxAccounts setNegativeNetTaxProfitApplied(BigDecimal negativeNetTaxProfitApplied) {
        this.negativeNetTaxProfitApplied = negativeNetTaxProfitApplied;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccounts setNegativeNetTaxProfitApplied(double negativeNetTaxProfitApplied) {
        return setNegativeNetTaxProfitApplied(BigDecimal.valueOf(negativeNetTaxProfitApplied));
    }

    /**
     * Lo que pasa al año siguiente además de los saldos.
     */
    public AnnualReturnTaxAccountsNextYear getNextYear() {
        return nextYear;
    }

    public AnnualReturnTaxAccounts setNextYear(AnnualReturnTaxAccountsNextYear nextYear) {
        this.nextYear = nextYear;
        return this;
    }
}
