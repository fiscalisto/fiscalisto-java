// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollTaxState: PayrollTaxState.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollTaxState {
    /**
     * El estado donde trabajan (c_Estado de ClaveEntFed): CMX.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Los empleados con recibo.
     */
    @JsonProperty("employees")
    private Long employees;

    /**
     * Los recibos timbrados.
     */
    @JsonProperty("receipts")
    private Long receipts;

    /**
     * Lo que pagaron sus percepciones, gravado y exento.
     */
    @JsonProperty("paid")
    private BigDecimal paid;

    /**
     * Lo de excluded_perception_types: no suma a la base.
     */
    @JsonProperty("excluded")
    private BigDecimal excluded;

    /**
     * paid menos excluded.
     */
    @JsonProperty("base")
    private BigDecimal base;

    /**
     * La tasa (0.03 es 3%); en Sinaloa, la efectiva de su tabla.
     */
    @JsonProperty("rate")
    private BigDecimal rate;

    /**
     * El impuesto sobre nómina: base por rate.
     */
    @JsonProperty("tax")
    private BigDecimal tax;

    /**
     * Las sobretasas del estado sobre el impuesto o la base.
     */
    @JsonProperty("surcharges")
    private List<PayrollTaxStateSurcharge> surcharges;

    /**
     * tax más surcharges.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * La opción de tasa elegida, en los estados que la tienen.
     */
    @JsonProperty("option")
    private String option;

    /**
     * Las opciones de tasa del estado (tamaño de la empresa), o null.
     */
    @JsonProperty("options")
    private List<PayrollTaxStateOption> options;

    /**
     * El artículo que lo cobra.
     */
    @JsonProperty("law")
    private String law;

    /**
     * El estado donde trabajan (c_Estado de ClaveEntFed): CMX.
     */
    public String getState() {
        return state;
    }

    public PayrollTaxState setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollTaxState setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Los empleados con recibo.
     */
    public Long getEmployees() {
        return employees;
    }

    public PayrollTaxState setEmployees(Long employees) {
        this.employees = employees;
        return this;
    }

    @JsonIgnore
    public PayrollTaxState setEmployees(long employees) {
        return setEmployees(Long.valueOf(employees));
    }

    /**
     * Los recibos timbrados.
     */
    public Long getReceipts() {
        return receipts;
    }

    public PayrollTaxState setReceipts(Long receipts) {
        this.receipts = receipts;
        return this;
    }

    @JsonIgnore
    public PayrollTaxState setReceipts(long receipts) {
        return setReceipts(Long.valueOf(receipts));
    }

    /**
     * Lo que pagaron sus percepciones, gravado y exento.
     */
    public BigDecimal getPaid() {
        return paid;
    }

    public PayrollTaxState setPaid(BigDecimal paid) {
        this.paid = paid;
        return this;
    }

    @JsonIgnore
    public PayrollTaxState setPaid(double paid) {
        return setPaid(BigDecimal.valueOf(paid));
    }

    /**
     * Lo de excluded_perception_types: no suma a la base.
     */
    public BigDecimal getExcluded() {
        return excluded;
    }

    public PayrollTaxState setExcluded(BigDecimal excluded) {
        this.excluded = excluded;
        return this;
    }

    @JsonIgnore
    public PayrollTaxState setExcluded(double excluded) {
        return setExcluded(BigDecimal.valueOf(excluded));
    }

    /**
     * paid menos excluded.
     */
    public BigDecimal getBase() {
        return base;
    }

    public PayrollTaxState setBase(BigDecimal base) {
        this.base = base;
        return this;
    }

    @JsonIgnore
    public PayrollTaxState setBase(double base) {
        return setBase(BigDecimal.valueOf(base));
    }

    /**
     * La tasa (0.03 es 3%); en Sinaloa, la efectiva de su tabla.
     */
    public BigDecimal getRate() {
        return rate;
    }

    public PayrollTaxState setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    @JsonIgnore
    public PayrollTaxState setRate(double rate) {
        return setRate(BigDecimal.valueOf(rate));
    }

    /**
     * El impuesto sobre nómina: base por rate.
     */
    public BigDecimal getTax() {
        return tax;
    }

    public PayrollTaxState setTax(BigDecimal tax) {
        this.tax = tax;
        return this;
    }

    @JsonIgnore
    public PayrollTaxState setTax(double tax) {
        return setTax(BigDecimal.valueOf(tax));
    }

    /**
     * Las sobretasas del estado sobre el impuesto o la base.
     */
    public List<PayrollTaxStateSurcharge> getSurcharges() {
        return surcharges;
    }

    public PayrollTaxState setSurcharges(List<PayrollTaxStateSurcharge> surcharges) {
        this.surcharges = surcharges;
        return this;
    }

    /**
     * tax más surcharges.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PayrollTaxState setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayrollTaxState setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * La opción de tasa elegida, en los estados que la tienen.
     */
    public String getOption() {
        return option;
    }

    public PayrollTaxState setOption(String option) {
        this.option = option;
        return this;
    }

    /**
     * Las opciones de tasa del estado (tamaño de la empresa), o null.
     */
    public List<PayrollTaxStateOption> getOptions() {
        return options;
    }

    public PayrollTaxState setOptions(List<PayrollTaxStateOption> options) {
        this.options = options;
        return this;
    }

    /**
     * El artículo que lo cobra.
     */
    public String getLaw() {
        return law;
    }

    public PayrollTaxState setLaw(String law) {
        this.law = law;
        return this;
    }
}
