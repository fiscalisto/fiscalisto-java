// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * FinancialStatementsBalanceSheetLiabilitiesGroupAccount: FinancialStatementsBalanceSheetLiabilitiesGroupAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialStatementsBalanceSheetLiabilitiesGroupAccount {
    /**
     * Número de empleado (NumEmpleado).
     */
    @JsonProperty("number")
    private String number;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Número de empleado (NumEmpleado).
     */
    public String getNumber() {
        return number;
    }

    public FinancialStatementsBalanceSheetLiabilitiesGroupAccount setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public FinancialStatementsBalanceSheetLiabilitiesGroupAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public FinancialStatementsBalanceSheetLiabilitiesGroupAccount setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public FinancialStatementsBalanceSheetLiabilitiesGroupAccount setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
