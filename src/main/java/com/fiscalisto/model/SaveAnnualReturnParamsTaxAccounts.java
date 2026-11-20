// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SaveAnnualReturnParamsTaxAccounts: La CUFIN y la CUCA (artículos 77 y 78): saldos iniciales y movimientos del año. Sin este campo se quedan los guardados.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveAnnualReturnParamsTaxAccounts {
    /**
     * Los saldos al cierre del año anterior; null si no se conocen. carry_forward los pone en el año siguiente.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("opening")
    private SaveAnnualReturnParamsTaxAccountsOpening opening;

    /**
     * Los dividendos, aportaciones y reembolsos del año.
     */
    @JsonProperty("movements")
    private List<SaveAnnualReturnParamsTaxAccountsMovement> movements;

    /**
     * El ISR del artículo 10 pagado en los dos años anteriores que falta acreditar.
     */
    @JsonProperty("pending_dividend_tax")
    private List<SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem> pendingDividendTax;

    /**
     * Los saldos al cierre del año anterior; null si no se conocen. carry_forward los pone en el año siguiente.
     * <p>
     * Obligatorio.
     */
    public SaveAnnualReturnParamsTaxAccountsOpening getOpening() {
        return opening;
    }

    public SaveAnnualReturnParamsTaxAccounts setOpening(SaveAnnualReturnParamsTaxAccountsOpening opening) {
        this.opening = opening;
        return this;
    }

    /**
     * Los dividendos, aportaciones y reembolsos del año.
     */
    public List<SaveAnnualReturnParamsTaxAccountsMovement> getMovements() {
        return movements;
    }

    public SaveAnnualReturnParamsTaxAccounts setMovements(List<SaveAnnualReturnParamsTaxAccountsMovement> movements) {
        this.movements = movements;
        return this;
    }

    /**
     * El ISR del artículo 10 pagado en los dos años anteriores que falta acreditar.
     */
    public List<SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem> getPendingDividendTax() {
        return pendingDividendTax;
    }

    public SaveAnnualReturnParamsTaxAccounts setPendingDividendTax(List<SaveAnnualReturnParamsTaxAccountsPendingDividendTaxItem> pendingDividendTax) {
        this.pendingDividendTax = pendingDividendTax;
        return this;
    }
}
