// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SatAnnualPreloadPersonalDeductionsInvoice: SatAnnualPreloadPersonalDeductionsInvoice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatAnnualPreloadPersonalDeductionsInvoice {
    /**
     * El folio fiscal.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El RFC de quien lo emitió.
     */
    @JsonProperty("issuer_tax_id")
    private String issuerTaxId;

    /**
     * Su nombre.
     */
    @JsonProperty("issuer_name")
    private String issuerName;

    /**
     * Su fecha de emisión (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * Su total, en pesos.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * La forma de pago, como la da el SAT.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * El método de pago, como lo da el SAT.
     */
    @JsonProperty("payment_method")
    private String paymentMethod;

    /**
     * La clave de producto o servicio.
     */
    @JsonProperty("product_code")
    private String productCode;

    /**
     * Sus conceptos.
     */
    @JsonProperty("description")
    private String description;

    /**
     * El tipo de deducción en que lo puso el SAT (A a J), o L si no lo clasificó y podría deducirse.
     */
    @JsonProperty("deduction_code")
    private String deductionCode;

    /**
     * Ese tipo, como lo nombra el SAT.
     */
    @JsonProperty("deduction_type")
    private String deductionType;

    /**
     * Si no lo tomó (L), el tipo que parece; null si lo tomó.
     */
    @JsonProperty("possible_code")
    private String possibleCode;

    /**
     * Por qué no lo toma, o lo que el SAT observa al tomarlo, en sus palabras.
     */
    @JsonProperty("reasons")
    private List<String> reasons;

    /**
     * Si es una aportación o depósito para el retiro que reportó su banco (sin CFDI), cuál; null si es un CFDI.
     */
    @JsonProperty("retirement_deposit")
    private String retirementDeposit;

    /**
     * El folio fiscal.
     */
    public String getUuid() {
        return uuid;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * El RFC de quien lo emitió.
     */
    public String getIssuerTaxId() {
        return issuerTaxId;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setIssuerTaxId(String issuerTaxId) {
        this.issuerTaxId = issuerTaxId;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getIssuerName() {
        return issuerName;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    /**
     * Su fecha de emisión (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Su total, en pesos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public SatAnnualPreloadPersonalDeductionsInvoice setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * La forma de pago, como la da el SAT.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * El método de pago, como lo da el SAT.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * La clave de producto o servicio.
     */
    public String getProductCode() {
        return productCode;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * Sus conceptos.
     */
    public String getDescription() {
        return description;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * El tipo de deducción en que lo puso el SAT (A a J), o L si no lo clasificó y podría deducirse.
     */
    public String getDeductionCode() {
        return deductionCode;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setDeductionCode(String deductionCode) {
        this.deductionCode = deductionCode;
        return this;
    }

    /**
     * Ese tipo, como lo nombra el SAT.
     */
    public String getDeductionType() {
        return deductionType;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setDeductionType(String deductionType) {
        this.deductionType = deductionType;
        return this;
    }

    /**
     * Si no lo tomó (L), el tipo que parece; null si lo tomó.
     */
    public String getPossibleCode() {
        return possibleCode;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setPossibleCode(String possibleCode) {
        this.possibleCode = possibleCode;
        return this;
    }

    /**
     * Por qué no lo toma, o lo que el SAT observa al tomarlo, en sus palabras.
     */
    public List<String> getReasons() {
        return reasons;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setReasons(List<String> reasons) {
        this.reasons = reasons;
        return this;
    }

    /**
     * Si es una aportación o depósito para el retiro que reportó su banco (sin CFDI), cuál; null si es un CFDI.
     */
    public String getRetirementDeposit() {
        return retirementDeposit;
    }

    public SatAnnualPreloadPersonalDeductionsInvoice setRetirementDeposit(String retirementDeposit) {
        this.retirementDeposit = retirementDeposit;
        return this;
    }
}
