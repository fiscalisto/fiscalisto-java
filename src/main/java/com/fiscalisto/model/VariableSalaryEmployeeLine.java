// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * VariableSalaryEmployeeLine: VariableSalaryEmployeeLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariableSalaryEmployeeLine {
    /**
     * El tipo de percepción (019, 020, 010, 049, 038).
     */
    @JsonProperty("type")
    private String type;

    /**
     * Qué es.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Lo que se integra.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El tipo de percepción (019, 020, 010, 049, 038).
     */
    public String getType() {
        return type;
    }

    public VariableSalaryEmployeeLine setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Qué es.
     */
    public String getLabel() {
        return label;
    }

    public VariableSalaryEmployeeLine setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Lo que se integra.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public VariableSalaryEmployeeLine setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public VariableSalaryEmployeeLine setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
