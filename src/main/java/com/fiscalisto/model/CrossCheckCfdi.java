// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CrossCheckCfdi: Los CFDI que forman una cifra del cruce de un mes (invoiced): cada uno con lo que aporta, y el ajuste que Impuestos agrega encima.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossCheckCfdi {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * La cifra: vat_charged (IVA trasladado), vat_creditable (IVA acreditable), vat_withheld (IVA que le retuvieron), isr_income (ingresos para ISR), isr_withheld_salaries (ISR retenido en sus recibos de nómina), isr_withheld_suppliers o vat_withheld_suppliers (ISR o IVA que retuvo a proveedores).
     * <p>
     * Valores: vat_charged, vat_creditable, vat_withheld, isr_income, isr_withheld_salaries, isr_withheld_suppliers, vat_withheld_suppliers.
     */
    @JsonProperty("key")
    private String key;

    /**
     * El cruce de esa cifra, como en GET /v1/accounting/cross_checks: matches, differs, not_filed o unreadable.
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
     * Lo que dicen los CFDI del mes: la suma de cfdi más adjustment.
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
     * Cada CFDI que suma en el mes, de mayor a menor: los PUE y las notas de crédito en su mes, las facturas PPD por lo que se pagó en el mes.
     */
    @JsonProperty("cfdi")
    private List<CrossCheckCfdiCfdiItem> cfdi;

    /**
     * Lo que Impuestos agrega sobre los CFDI: en vat_creditable, la proporción de gastos comunes, el IVA retenido enterado del mes anterior y las importaciones; 0 en las demás.
     */
    @JsonProperty("adjustment")
    private BigDecimal adjustment;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CrossCheckCfdi setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CrossCheckCfdi setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CrossCheckCfdi setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public CrossCheckCfdi setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * La cifra: vat_charged (IVA trasladado), vat_creditable (IVA acreditable), vat_withheld (IVA que le retuvieron), isr_income (ingresos para ISR), isr_withheld_salaries (ISR retenido en sus recibos de nómina), isr_withheld_suppliers o vat_withheld_suppliers (ISR o IVA que retuvo a proveedores).
     * <p>
     * Valores: vat_charged, vat_creditable, vat_withheld, isr_income, isr_withheld_salaries, isr_withheld_suppliers, vat_withheld_suppliers.
     */
    public String getKey() {
        return key;
    }

    public CrossCheckCfdi setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * El cruce de esa cifra, como en GET /v1/accounting/cross_checks: matches, differs, not_filed o unreadable.
     * <p>
     * Valores: matches, differs, not_filed, unreadable.
     */
    public String getStatus() {
        return status;
    }

    public CrossCheckCfdi setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Lo declarado, en pesos; null si no hay declaración o no se pudo leer.
     */
    public BigDecimal getDeclared() {
        return declared;
    }

    public CrossCheckCfdi setDeclared(BigDecimal declared) {
        this.declared = declared;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdi setDeclared(double declared) {
        return setDeclared(BigDecimal.valueOf(declared));
    }

    /**
     * Lo que dicen los CFDI del mes: la suma de cfdi más adjustment.
     */
    public BigDecimal getInvoiced() {
        return invoiced;
    }

    public CrossCheckCfdi setInvoiced(BigDecimal invoiced) {
        this.invoiced = invoiced;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdi setInvoiced(double invoiced) {
        return setInvoiced(BigDecimal.valueOf(invoiced));
    }

    /**
     * declared menos invoiced; null si declared es null.
     */
    public BigDecimal getDifference() {
        return difference;
    }

    public CrossCheckCfdi setDifference(BigDecimal difference) {
        this.difference = difference;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdi setDifference(double difference) {
        return setDifference(BigDecimal.valueOf(difference));
    }

    /**
     * El número de operación de la declaración de donde salió la cifra.
     */
    public String getOperationNumber() {
        return operationNumber;
    }

    public CrossCheckCfdi setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
        return this;
    }

    /**
     * Cada CFDI que suma en el mes, de mayor a menor: los PUE y las notas de crédito en su mes, las facturas PPD por lo que se pagó en el mes.
     */
    public List<CrossCheckCfdiCfdiItem> getCfdi() {
        return cfdi;
    }

    public CrossCheckCfdi setCfdi(List<CrossCheckCfdiCfdiItem> cfdi) {
        this.cfdi = cfdi;
        return this;
    }

    /**
     * Lo que Impuestos agrega sobre los CFDI: en vat_creditable, la proporción de gastos comunes, el IVA retenido enterado del mes anterior y las importaciones; 0 en las demás.
     */
    public BigDecimal getAdjustment() {
        return adjustment;
    }

    public CrossCheckCfdi setAdjustment(BigDecimal adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdi setAdjustment(double adjustment) {
        return setAdjustment(BigDecimal.valueOf(adjustment));
    }
}
