// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CrossChecksMonthCheck: CrossChecksMonthCheck.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossChecksMonthCheck {
    /**
     * Qué cifra: vat_charged (IVA trasladado), vat_creditable (IVA acreditable), vat_withheld (IVA que le retuvieron) o isr_income (ingresos para ISR: nominales en persona moral, cobrados en los demás).
     * <p>
     * Valores: vat_charged, vat_creditable, vat_withheld, isr_income.
     */
    @JsonProperty("key")
    private String key;

    /**
     * matches (hasta $2 de diferencia), differs, not_filed (no hay declaración del mes) o unreadable (la declaración no trae la cifra en un renglón reconocible).
     * <p>
     * Valores: matches, differs, not_filed, unreadable.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Lo declarado, en pesos; null si no hay declaración o no se pudo leer.
     */
    @JsonProperty("declared")
    private BigDecimal declared;

    /**
     * Lo que dicen los CFDI del mes, con los mismos cálculos de Impuestos.
     */
    @JsonProperty("invoiced")
    private BigDecimal invoiced;

    /**
     * declared menos invoiced; null si declared es null.
     */
    @JsonProperty("difference")
    private BigDecimal difference;

    /**
     * El número de operación de la declaración de donde salió la cifra.
     */
    @JsonProperty("operation_number")
    private String operationNumber;

    /**
     * Qué cifra: vat_charged (IVA trasladado), vat_creditable (IVA acreditable), vat_withheld (IVA que le retuvieron) o isr_income (ingresos para ISR: nominales en persona moral, cobrados en los demás).
     * <p>
     * Valores: vat_charged, vat_creditable, vat_withheld, isr_income.
     */
    public String getKey() {
        return key;
    }

    public CrossChecksMonthCheck setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * matches (hasta $2 de diferencia), differs, not_filed (no hay declaración del mes) o unreadable (la declaración no trae la cifra en un renglón reconocible).
     * <p>
     * Valores: matches, differs, not_filed, unreadable.
     */
    public String getStatus() {
        return status;
    }

    public CrossChecksMonthCheck setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Lo declarado, en pesos; null si no hay declaración o no se pudo leer.
     */
    public BigDecimal getDeclared() {
        return declared;
    }

    public CrossChecksMonthCheck setDeclared(BigDecimal declared) {
        this.declared = declared;
        return this;
    }

    @JsonIgnore
    public CrossChecksMonthCheck setDeclared(double declared) {
        return setDeclared(BigDecimal.valueOf(declared));
    }

    /**
     * Lo que dicen los CFDI del mes, con los mismos cálculos de Impuestos.
     */
    public BigDecimal getInvoiced() {
        return invoiced;
    }

    public CrossChecksMonthCheck setInvoiced(BigDecimal invoiced) {
        this.invoiced = invoiced;
        return this;
    }

    @JsonIgnore
    public CrossChecksMonthCheck setInvoiced(double invoiced) {
        return setInvoiced(BigDecimal.valueOf(invoiced));
    }

    /**
     * declared menos invoiced; null si declared es null.
     */
    public BigDecimal getDifference() {
        return difference;
    }

    public CrossChecksMonthCheck setDifference(BigDecimal difference) {
        this.difference = difference;
        return this;
    }

    @JsonIgnore
    public CrossChecksMonthCheck setDifference(double difference) {
        return setDifference(BigDecimal.valueOf(difference));
    }

    /**
     * El número de operación de la declaración de donde salió la cifra.
     */
    public String getOperationNumber() {
        return operationNumber;
    }

    public CrossChecksMonthCheck setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
        return this;
    }
}
