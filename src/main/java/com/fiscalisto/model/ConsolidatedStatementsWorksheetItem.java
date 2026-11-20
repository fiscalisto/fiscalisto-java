// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * ConsolidatedStatementsWorksheetItem: ConsolidatedStatementsWorksheetItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedStatementsWorksheetItem {
    /**
     * El número de la cuenta.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su código agrupador del SAT.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * Su saldo final en cada RFC, por RFC (las acreedoras en positivo).
     */
    @JsonProperty("by_rfc")
    private Map<String, Object> byRfc;

    /**
     * Lo que las eliminaciones le suman (positivo) o restan.
     */
    @JsonProperty("eliminations")
    private BigDecimal eliminations;

    /**
     * Su saldo final consolidado.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * El número de la cuenta.
     */
    public String getNumber() {
        return number;
    }

    public ConsolidatedStatementsWorksheetItem setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public ConsolidatedStatementsWorksheetItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public ConsolidatedStatementsWorksheetItem setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Su saldo final en cada RFC, por RFC (las acreedoras en positivo).
     */
    public Map<String, Object> getByRfc() {
        return byRfc;
    }

    public ConsolidatedStatementsWorksheetItem setByRfc(Map<String, Object> byRfc) {
        this.byRfc = byRfc;
        return this;
    }

    /**
     * Lo que las eliminaciones le suman (positivo) o restan.
     */
    public BigDecimal getEliminations() {
        return eliminations;
    }

    public ConsolidatedStatementsWorksheetItem setEliminations(BigDecimal eliminations) {
        this.eliminations = eliminations;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsWorksheetItem setEliminations(double eliminations) {
        return setEliminations(BigDecimal.valueOf(eliminations));
    }

    /**
     * Su saldo final consolidado.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public ConsolidatedStatementsWorksheetItem setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsWorksheetItem setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }
}
