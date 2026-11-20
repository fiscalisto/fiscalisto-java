// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ConsolidatedStatementsBalanceSheetEquityGroupAccount: ConsolidatedStatementsBalanceSheetEquityGroupAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedStatementsBalanceSheetEquityGroupAccount {
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

    public ConsolidatedStatementsBalanceSheetEquityGroupAccount setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ConsolidatedStatementsBalanceSheetEquityGroupAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public ConsolidatedStatementsBalanceSheetEquityGroupAccount setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsBalanceSheetEquityGroupAccount setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
