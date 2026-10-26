// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CrossChecksVatBalanceInFavorPeriod: CrossChecksVatBalanceInFavorPeriod.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossChecksVatBalanceInFavorPeriod {
    /**
     * El mes cuya declaración muestra el IVA a favor.
     */
    @JsonProperty("month")
    private String month;

    /**
     * El IVA a favor de ese mes.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El número de operación de esa declaración.
     */
    @JsonProperty("operation_number")
    private String operationNumber;

    /**
     * El mes cuya declaración muestra el IVA a favor.
     */
    public String getMonth() {
        return month;
    }

    public CrossChecksVatBalanceInFavorPeriod setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El IVA a favor de ese mes.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CrossChecksVatBalanceInFavorPeriod setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CrossChecksVatBalanceInFavorPeriod setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El número de operación de esa declaración.
     */
    public String getOperationNumber() {
        return operationNumber;
    }

    public CrossChecksVatBalanceInFavorPeriod setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
        return this;
    }
}
