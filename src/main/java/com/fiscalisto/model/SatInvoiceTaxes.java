// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SatInvoiceTaxes: Impuestos del comprobante: trasladados (iva, ieps), retenidos (iva_withheld, isr_withheld, ieps_withheld) y locales.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatInvoiceTaxes {
    /**
     * IVA trasladado.
     */
    @JsonProperty("iva")
    private BigDecimal iva;

    /**
     * IEPS trasladado.
     */
    @JsonProperty("ieps")
    private BigDecimal ieps;

    /**
     * IVA retenido.
     */
    @JsonProperty("iva_withheld")
    private BigDecimal ivaWithheld;

    /**
     * ISR retenido.
     */
    @JsonProperty("isr_withheld")
    private BigDecimal isrWithheld;

    /**
     * IEPS retenido.
     */
    @JsonProperty("ieps_withheld")
    private BigDecimal iepsWithheld;

    /**
     * Impuestos locales trasladados (ISH y similares).
     */
    @JsonProperty("local_transferred")
    private BigDecimal localTransferred;

    /**
     * Impuestos locales retenidos.
     */
    @JsonProperty("local_withheld")
    private BigDecimal localWithheld;

    /**
     * IVA trasladado.
     */
    public BigDecimal getIva() {
        return iva;
    }

    public SatInvoiceTaxes setIva(BigDecimal iva) {
        this.iva = iva;
        return this;
    }

    @JsonIgnore
    public SatInvoiceTaxes setIva(double iva) {
        return setIva(BigDecimal.valueOf(iva));
    }

    /**
     * IEPS trasladado.
     */
    public BigDecimal getIeps() {
        return ieps;
    }

    public SatInvoiceTaxes setIeps(BigDecimal ieps) {
        this.ieps = ieps;
        return this;
    }

    @JsonIgnore
    public SatInvoiceTaxes setIeps(double ieps) {
        return setIeps(BigDecimal.valueOf(ieps));
    }

    /**
     * IVA retenido.
     */
    public BigDecimal getIvaWithheld() {
        return ivaWithheld;
    }

    public SatInvoiceTaxes setIvaWithheld(BigDecimal ivaWithheld) {
        this.ivaWithheld = ivaWithheld;
        return this;
    }

    @JsonIgnore
    public SatInvoiceTaxes setIvaWithheld(double ivaWithheld) {
        return setIvaWithheld(BigDecimal.valueOf(ivaWithheld));
    }

    /**
     * ISR retenido.
     */
    public BigDecimal getIsrWithheld() {
        return isrWithheld;
    }

    public SatInvoiceTaxes setIsrWithheld(BigDecimal isrWithheld) {
        this.isrWithheld = isrWithheld;
        return this;
    }

    @JsonIgnore
    public SatInvoiceTaxes setIsrWithheld(double isrWithheld) {
        return setIsrWithheld(BigDecimal.valueOf(isrWithheld));
    }

    /**
     * IEPS retenido.
     */
    public BigDecimal getIepsWithheld() {
        return iepsWithheld;
    }

    public SatInvoiceTaxes setIepsWithheld(BigDecimal iepsWithheld) {
        this.iepsWithheld = iepsWithheld;
        return this;
    }

    @JsonIgnore
    public SatInvoiceTaxes setIepsWithheld(double iepsWithheld) {
        return setIepsWithheld(BigDecimal.valueOf(iepsWithheld));
    }

    /**
     * Impuestos locales trasladados (ISH y similares).
     */
    public BigDecimal getLocalTransferred() {
        return localTransferred;
    }

    public SatInvoiceTaxes setLocalTransferred(BigDecimal localTransferred) {
        this.localTransferred = localTransferred;
        return this;
    }

    @JsonIgnore
    public SatInvoiceTaxes setLocalTransferred(double localTransferred) {
        return setLocalTransferred(BigDecimal.valueOf(localTransferred));
    }

    /**
     * Impuestos locales retenidos.
     */
    public BigDecimal getLocalWithheld() {
        return localWithheld;
    }

    public SatInvoiceTaxes setLocalWithheld(BigDecimal localWithheld) {
        this.localWithheld = localWithheld;
        return this;
    }

    @JsonIgnore
    public SatInvoiceTaxes setLocalWithheld(double localWithheld) {
        return setLocalWithheld(BigDecimal.valueOf(localWithheld));
    }
}
