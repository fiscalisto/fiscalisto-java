// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SatDeclarationReceipt: SatDeclarationReceipt.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationReceipt {
    /**
     * Cada impuesto del acuse.
     */
    @JsonProperty("concepts")
    private List<SatDeclarationReceiptConcept> concepts;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * La línea de captura del acuse.
     */
    @JsonProperty("payment_line")
    private String paymentLine;

    /**
     * Hasta cuándo sirve la línea de captura (AAAA-MM-DD).
     */
    @JsonProperty("valid_until")
    private String validUntil;

    /**
     * Cada impuesto del acuse.
     */
    public List<SatDeclarationReceiptConcept> getConcepts() {
        return concepts;
    }

    public SatDeclarationReceipt setConcepts(List<SatDeclarationReceiptConcept> concepts) {
        this.concepts = concepts;
        return this;
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public SatDeclarationReceipt setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public SatDeclarationReceipt setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * La línea de captura del acuse.
     */
    public String getPaymentLine() {
        return paymentLine;
    }

    public SatDeclarationReceipt setPaymentLine(String paymentLine) {
        this.paymentLine = paymentLine;
        return this;
    }

    /**
     * Hasta cuándo sirve la línea de captura (AAAA-MM-DD).
     */
    public String getValidUntil() {
        return validUntil;
    }

    public SatDeclarationReceipt setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
}
