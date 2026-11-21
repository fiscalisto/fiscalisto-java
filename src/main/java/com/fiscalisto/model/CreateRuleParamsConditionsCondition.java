// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateRuleParamsConditionsCondition: CreateRuleParamsConditionsCondition.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRuleParamsConditionsCondition {
    /**
     * Qué se revisa. Facturas: supplier, customer, partyName, ownRfc, direction (received/issued, en invoice.paid e invoice.cancelled), category (categoría de gasto), tags (tag_…), total, subtotal, tipo, metodo, forma, uso, moneda, serie, concept, clave, costCenter, ivaRetenido, isrRetenido, hasFindings. Órdenes de compra: supplier, ownRfc, total, category, warehouse, stage, createdBy, moneda, note.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("field")
    private String field;

    /**
     * Listas: is (alguno de values), not (ninguno), set, unset. Montos (MXN): gte, lte, between (value y to). Texto: contains, not_contains, starts (text; sin importar acentos ni mayúsculas), set, unset. Sí/no: yes, no.
     * <p>
     * Valores: is, not, gte, lte, between, contains, not_contains, starts, yes, no, set, unset.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("operator")
    private String operator;

    /**
     * Para is / not: RFC, claves del SAT, ccn_…, whs_… o mem_….
     */
    @JsonProperty("values")
    private List<String> values;

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * Para between: el monto hasta.
     */
    @JsonProperty("to")
    private BigDecimal to;

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    @JsonProperty("text")
    private String text;

    /**
     * Qué se revisa. Facturas: supplier, customer, partyName, ownRfc, direction (received/issued, en invoice.paid e invoice.cancelled), category (categoría de gasto), tags (tag_…), total, subtotal, tipo, metodo, forma, uso, moneda, serie, concept, clave, costCenter, ivaRetenido, isrRetenido, hasFindings. Órdenes de compra: supplier, ownRfc, total, category, warehouse, stage, createdBy, moneda, note.
     * <p>
     * Obligatorio.
     */
    public String getField() {
        return field;
    }

    public CreateRuleParamsConditionsCondition setField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Listas: is (alguno de values), not (ninguno), set, unset. Montos (MXN): gte, lte, between (value y to). Texto: contains, not_contains, starts (text; sin importar acentos ni mayúsculas), set, unset. Sí/no: yes, no.
     * <p>
     * Valores: is, not, gte, lte, between, contains, not_contains, starts, yes, no, set, unset.
     * <p>
     * Obligatorio.
     */
    public String getOperator() {
        return operator;
    }

    public CreateRuleParamsConditionsCondition setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Para is / not: RFC, claves del SAT, ccn_…, whs_… o mem_….
     */
    public List<String> getValues() {
        return values;
    }

    public CreateRuleParamsConditionsCondition setValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    public BigDecimal getValue() {
        return value;
    }

    public CreateRuleParamsConditionsCondition setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public CreateRuleParamsConditionsCondition setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * Para between: el monto hasta.
     */
    public BigDecimal getTo() {
        return to;
    }

    public CreateRuleParamsConditionsCondition setTo(BigDecimal to) {
        this.to = to;
        return this;
    }

    @JsonIgnore
    public CreateRuleParamsConditionsCondition setTo(double to) {
        return setTo(BigDecimal.valueOf(to));
    }

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    public String getText() {
        return text;
    }

    public CreateRuleParamsConditionsCondition setText(String text) {
        this.text = text;
        return this;
    }
}
