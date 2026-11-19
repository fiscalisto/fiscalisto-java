// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ExtraordinaryPayrollReceiptPreviewIsr: El cálculo del ISR del periodo: base, tarifa, subsidio y resultado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtraordinaryPayrollReceiptPreviewIsr {
    /**
     * ISR retenido.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * aguinaldo y ptu: ISR con la parte gravada sumada al sueldo del mes.
     */
    @JsonProperty("art96")
    private BigDecimal art96;

    /**
     * aguinaldo y ptu: ISR con el procedimiento del art. 174 del Reglamento.
     */
    @JsonProperty("art174")
    private BigDecimal art174;

    /**
     * aguinaldo y ptu: el cálculo que se aplicó.
     * <p>
     * Valores: art96, art174.
     */
    @JsonProperty("method")
    private String method;

    /**
     * ISR retenido.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public ExtraordinaryPayrollReceiptPreviewIsr setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewIsr setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * aguinaldo y ptu: ISR con la parte gravada sumada al sueldo del mes.
     */
    public BigDecimal getArt96() {
        return art96;
    }

    public ExtraordinaryPayrollReceiptPreviewIsr setArt96(BigDecimal art96) {
        this.art96 = art96;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewIsr setArt96(double art96) {
        return setArt96(BigDecimal.valueOf(art96));
    }

    /**
     * aguinaldo y ptu: ISR con el procedimiento del art. 174 del Reglamento.
     */
    public BigDecimal getArt174() {
        return art174;
    }

    public ExtraordinaryPayrollReceiptPreviewIsr setArt174(BigDecimal art174) {
        this.art174 = art174;
        return this;
    }

    @JsonIgnore
    public ExtraordinaryPayrollReceiptPreviewIsr setArt174(double art174) {
        return setArt174(BigDecimal.valueOf(art174));
    }

    /**
     * aguinaldo y ptu: el cálculo que se aplicó.
     * <p>
     * Valores: art96, art174.
     */
    public String getMethod() {
        return method;
    }

    public ExtraordinaryPayrollReceiptPreviewIsr setMethod(String method) {
        this.method = method;
        return this;
    }
}
