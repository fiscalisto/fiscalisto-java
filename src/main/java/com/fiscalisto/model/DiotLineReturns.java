// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * DiotLineReturns: Las devoluciones (notas de crédito) del mes, por tasa.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiotLineReturns {
    /**
     * Valor de los actos al 16 %.
     */
    @JsonProperty("base_16")
    private BigDecimal base16;

    /**
     * Valor de los actos al 8 % (región fronteriza).
     */
    @JsonProperty("base_8")
    private BigDecimal base8;

    /**
     * Valor de los actos al 0 %.
     */
    @JsonProperty("base_0")
    private BigDecimal base0;

    /**
     * Valor de las devoluciones exentas.
     */
    @JsonProperty("exempt")
    private BigDecimal exempt;

    /**
     * Valor de los actos no objeto de IVA.
     */
    @JsonProperty("not_taxable")
    private BigDecimal notTaxable;

    /**
     * El IVA de esos actos.
     */
    @JsonProperty("vat")
    private BigDecimal vat;

    /**
     * Valor de los actos al 16 %.
     */
    public BigDecimal getBase16() {
        return base16;
    }

    public DiotLineReturns setBase16(BigDecimal base16) {
        this.base16 = base16;
        return this;
    }

    @JsonIgnore
    public DiotLineReturns setBase16(double base16) {
        return setBase16(BigDecimal.valueOf(base16));
    }

    /**
     * Valor de los actos al 8 % (región fronteriza).
     */
    public BigDecimal getBase8() {
        return base8;
    }

    public DiotLineReturns setBase8(BigDecimal base8) {
        this.base8 = base8;
        return this;
    }

    @JsonIgnore
    public DiotLineReturns setBase8(double base8) {
        return setBase8(BigDecimal.valueOf(base8));
    }

    /**
     * Valor de los actos al 0 %.
     */
    public BigDecimal getBase0() {
        return base0;
    }

    public DiotLineReturns setBase0(BigDecimal base0) {
        this.base0 = base0;
        return this;
    }

    @JsonIgnore
    public DiotLineReturns setBase0(double base0) {
        return setBase0(BigDecimal.valueOf(base0));
    }

    /**
     * Valor de las devoluciones exentas.
     */
    public BigDecimal getExempt() {
        return exempt;
    }

    public DiotLineReturns setExempt(BigDecimal exempt) {
        this.exempt = exempt;
        return this;
    }

    @JsonIgnore
    public DiotLineReturns setExempt(double exempt) {
        return setExempt(BigDecimal.valueOf(exempt));
    }

    /**
     * Valor de los actos no objeto de IVA.
     */
    public BigDecimal getNotTaxable() {
        return notTaxable;
    }

    public DiotLineReturns setNotTaxable(BigDecimal notTaxable) {
        this.notTaxable = notTaxable;
        return this;
    }

    @JsonIgnore
    public DiotLineReturns setNotTaxable(double notTaxable) {
        return setNotTaxable(BigDecimal.valueOf(notTaxable));
    }

    /**
     * El IVA de esos actos.
     */
    public BigDecimal getVat() {
        return vat;
    }

    public DiotLineReturns setVat(BigDecimal vat) {
        this.vat = vat;
        return this;
    }

    @JsonIgnore
    public DiotLineReturns setVat(double vat) {
        return setVat(BigDecimal.valueOf(vat));
    }
}
