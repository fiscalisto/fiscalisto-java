// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceTaxes: InvoiceTaxes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceTaxes {
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
     * Impuestos locales trasladados.
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

    public InvoiceTaxes setIva(BigDecimal iva) {
        this.iva = iva;
        return this;
    }

    @JsonIgnore
    public InvoiceTaxes setIva(double iva) {
        return setIva(BigDecimal.valueOf(iva));
    }

    /**
     * IEPS trasladado.
     */
    public BigDecimal getIeps() {
        return ieps;
    }

    public InvoiceTaxes setIeps(BigDecimal ieps) {
        this.ieps = ieps;
        return this;
    }

    @JsonIgnore
    public InvoiceTaxes setIeps(double ieps) {
        return setIeps(BigDecimal.valueOf(ieps));
    }

    /**
     * IVA retenido.
     */
    public BigDecimal getIvaWithheld() {
        return ivaWithheld;
    }

    public InvoiceTaxes setIvaWithheld(BigDecimal ivaWithheld) {
        this.ivaWithheld = ivaWithheld;
        return this;
    }

    @JsonIgnore
    public InvoiceTaxes setIvaWithheld(double ivaWithheld) {
        return setIvaWithheld(BigDecimal.valueOf(ivaWithheld));
    }

    /**
     * ISR retenido.
     */
    public BigDecimal getIsrWithheld() {
        return isrWithheld;
    }

    public InvoiceTaxes setIsrWithheld(BigDecimal isrWithheld) {
        this.isrWithheld = isrWithheld;
        return this;
    }

    @JsonIgnore
    public InvoiceTaxes setIsrWithheld(double isrWithheld) {
        return setIsrWithheld(BigDecimal.valueOf(isrWithheld));
    }

    /**
     * Impuestos locales trasladados.
     */
    public BigDecimal getLocalTransferred() {
        return localTransferred;
    }

    public InvoiceTaxes setLocalTransferred(BigDecimal localTransferred) {
        this.localTransferred = localTransferred;
        return this;
    }

    @JsonIgnore
    public InvoiceTaxes setLocalTransferred(double localTransferred) {
        return setLocalTransferred(BigDecimal.valueOf(localTransferred));
    }

    /**
     * Impuestos locales retenidos.
     */
    public BigDecimal getLocalWithheld() {
        return localWithheld;
    }

    public InvoiceTaxes setLocalWithheld(BigDecimal localWithheld) {
        this.localWithheld = localWithheld;
        return this;
    }

    @JsonIgnore
    public InvoiceTaxes setLocalWithheld(double localWithheld) {
        return setLocalWithheld(BigDecimal.valueOf(localWithheld));
    }
}
