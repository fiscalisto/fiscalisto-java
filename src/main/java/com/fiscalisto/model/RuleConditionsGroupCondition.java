// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * RuleConditionsGroupCondition: RuleConditionsGroupCondition.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleConditionsGroupCondition {
    /**
     * Qué se revisa (supplier, total, metodo, category…).
     */
    @JsonProperty("field")
    private String field;

    /**
     * Cómo se compara.
     * <p>
     * Valores: is, not, gte, lte, between, contains, not_contains, starts, yes, no, set, unset.
     */
    @JsonProperty("operator")
    private String operator;

    /**
     * Para is / not: los valores (RFC, claves, ccn_…).
     */
    @JsonProperty("values")
    private List<String> values;

    /**
     * Para gte, lte y between: el monto en pesos.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * Para between: el monto hasta.
     */
    @JsonProperty("to")
    private BigDecimal to;

    /**
     * Para contains, not_contains y starts.
     */
    @JsonProperty("text")
    private String text;

    /**
     * Qué se revisa (supplier, total, metodo, category…).
     */
    public String getField() {
        return field;
    }

    public RuleConditionsGroupCondition setField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Cómo se compara.
     * <p>
     * Valores: is, not, gte, lte, between, contains, not_contains, starts, yes, no, set, unset.
     */
    public String getOperator() {
        return operator;
    }

    public RuleConditionsGroupCondition setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Para is / not: los valores (RFC, claves, ccn_…).
     */
    public List<String> getValues() {
        return values;
    }

    public RuleConditionsGroupCondition setValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Para gte, lte y between: el monto en pesos.
     */
    public BigDecimal getValue() {
        return value;
    }

    public RuleConditionsGroupCondition setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public RuleConditionsGroupCondition setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * Para between: el monto hasta.
     */
    public BigDecimal getTo() {
        return to;
    }

    public RuleConditionsGroupCondition setTo(BigDecimal to) {
        this.to = to;
        return this;
    }

    @JsonIgnore
    public RuleConditionsGroupCondition setTo(double to) {
        return setTo(BigDecimal.valueOf(to));
    }

    /**
     * Para contains, not_contains y starts.
     */
    public String getText() {
        return text;
    }

    public RuleConditionsGroupCondition setText(String text) {
        this.text = text;
        return this;
    }
}
