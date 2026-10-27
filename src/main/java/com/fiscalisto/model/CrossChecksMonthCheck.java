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
     * Qué cifra: vat_charged (IVA trasladado), vat_creditable (IVA acreditable), vat_withheld (IVA que le retuvieron), isr_income (ingresos para ISR: nominales en persona moral, cobrados en los demás) y, solo en los meses en que retuvo, isr_withheld_salaries (ISR retenido por salarios y asimilados, contra sus recibos de nómina), isr_withheld_suppliers (ISR retenido por honorarios y arrendamiento, contra las facturas recibidas que pagó) o vat_withheld_suppliers (IVA retenido a proveedores).
     * <p>
     * Valores: vat_charged, vat_creditable, vat_withheld, isr_income, isr_withheld_salaries, isr_withheld_suppliers, vat_withheld_suppliers.
     */
    @JsonProperty("key")
    private String key;

    /**
     * matches (hasta $2 de diferencia), differs, not_filed (no hay declaración del mes, o en una retención ninguna declaración del mes la trae) o unreadable (la declaración no trae la cifra en un renglón reconocible).
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
     * De declared, lo que la propia declaración dice que no salió de facturas: en isr_income los ingresos nominales adicionales (cobrado sin factura, intereses) y en vat_charged el IVA al 16% por encima de la precarga del SAT. Se compara aparte; 0 si no hay.
     */
    @JsonProperty("declared_without_cfdi")
    private BigDecimal declaredWithoutCfdi;

    /**
     * Lo que dicen los CFDI del mes, con los mismos cálculos de Impuestos.
     */
    @JsonProperty("invoiced")
    private BigDecimal invoiced;

    /**
     * declared menos declared_without_cfdi menos invoiced; null si declared es null.
     */
    @JsonProperty("difference")
    private BigDecimal difference;

    /**
     * El número de operación de la declaración de donde salió la cifra.
     */
    @JsonProperty("operation_number")
    private String operationNumber;

    /**
     * Qué cifra: vat_charged (IVA trasladado), vat_creditable (IVA acreditable), vat_withheld (IVA que le retuvieron), isr_income (ingresos para ISR: nominales en persona moral, cobrados en los demás) y, solo en los meses en que retuvo, isr_withheld_salaries (ISR retenido por salarios y asimilados, contra sus recibos de nómina), isr_withheld_suppliers (ISR retenido por honorarios y arrendamiento, contra las facturas recibidas que pagó) o vat_withheld_suppliers (IVA retenido a proveedores).
     * <p>
     * Valores: vat_charged, vat_creditable, vat_withheld, isr_income, isr_withheld_salaries, isr_withheld_suppliers, vat_withheld_suppliers.
     */
    public String getKey() {
        return key;
    }

    public CrossChecksMonthCheck setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * matches (hasta $2 de diferencia), differs, not_filed (no hay declaración del mes, o en una retención ninguna declaración del mes la trae) o unreadable (la declaración no trae la cifra en un renglón reconocible).
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
     * De declared, lo que la propia declaración dice que no salió de facturas: en isr_income los ingresos nominales adicionales (cobrado sin factura, intereses) y en vat_charged el IVA al 16% por encima de la precarga del SAT. Se compara aparte; 0 si no hay.
     */
    public BigDecimal getDeclaredWithoutCfdi() {
        return declaredWithoutCfdi;
    }

    public CrossChecksMonthCheck setDeclaredWithoutCfdi(BigDecimal declaredWithoutCfdi) {
        this.declaredWithoutCfdi = declaredWithoutCfdi;
        return this;
    }

    @JsonIgnore
    public CrossChecksMonthCheck setDeclaredWithoutCfdi(double declaredWithoutCfdi) {
        return setDeclaredWithoutCfdi(BigDecimal.valueOf(declaredWithoutCfdi));
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
     * declared menos declared_without_cfdi menos invoiced; null si declared es null.
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
