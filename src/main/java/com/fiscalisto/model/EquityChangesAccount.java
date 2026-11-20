// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * EquityChangesAccount: EquityChangesAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EquityChangesAccount {
    /**
     * El código agrupador (301 capital social, 304 resultados de ejercicios anteriores…).
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Al 1 de enero.
     */
    @JsonProperty("beginning")
    private BigDecimal beginning;

    /**
     * Aportaciones, retiros, dividendos y traspasos de enero al mes.
     */
    @JsonProperty("movements")
    private BigDecimal movements;

    /**
     * Al cierre del mes.
     */
    @JsonProperty("ending")
    private BigDecimal ending;

    /**
     * El código agrupador (301 capital social, 304 resultados de ejercicios anteriores…).
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public EquityChangesAccount setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public EquityChangesAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Al 1 de enero.
     */
    public BigDecimal getBeginning() {
        return beginning;
    }

    public EquityChangesAccount setBeginning(BigDecimal beginning) {
        this.beginning = beginning;
        return this;
    }

    @JsonIgnore
    public EquityChangesAccount setBeginning(double beginning) {
        return setBeginning(BigDecimal.valueOf(beginning));
    }

    /**
     * Aportaciones, retiros, dividendos y traspasos de enero al mes.
     */
    public BigDecimal getMovements() {
        return movements;
    }

    public EquityChangesAccount setMovements(BigDecimal movements) {
        this.movements = movements;
        return this;
    }

    @JsonIgnore
    public EquityChangesAccount setMovements(double movements) {
        return setMovements(BigDecimal.valueOf(movements));
    }

    /**
     * Al cierre del mes.
     */
    public BigDecimal getEnding() {
        return ending;
    }

    public EquityChangesAccount setEnding(BigDecimal ending) {
        this.ending = ending;
        return this;
    }

    @JsonIgnore
    public EquityChangesAccount setEnding(double ending) {
        return setEnding(BigDecimal.valueOf(ending));
    }
}
