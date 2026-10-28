// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ExternalPayrollReceiptPreview: Un recibo calculado por su sistema, revisado y sin timbrar: lo que se timbraría, tal cual.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreview {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * external: los importes son los que calculó su sistema.
     */
    @JsonProperty("calculation")
    private String calculation;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El empleado como receptor del CFDI (Receptor).
     */
    @JsonProperty("customer")
    private ExternalPayrollReceiptPreviewCustomer customer;

    /**
     * El recibo de nómina 1.2: empleado, periodo, percepciones, deducciones y otros pagos.
     */
    @JsonProperty("payroll")
    private InvoicePayroll payroll;

    /**
     * SubTotal: percepciones más otros pagos.
     */
    @JsonProperty("subtotal")
    private BigDecimal subtotal;

    /**
     * Descuento: las deducciones.
     */
    @JsonProperty("discount")
    private BigDecimal discount;

    /**
     * Total: el neto a pagar.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo que el SAT podría observar; no impide timbrar.
     */
    @JsonProperty("warnings")
    private List<ExternalPayrollReceiptPreviewWarning> warnings;

    /**
     * El XML que se mandaría al PAC, sin sello ni timbre: sus importes son exactamente los que mandó.
     */
    @JsonProperty("unsigned_xml")
    private String unsignedXml;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ExternalPayrollReceiptPreview setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * external: los importes son los que calculó su sistema.
     */
    public String getCalculation() {
        return calculation;
    }

    public ExternalPayrollReceiptPreview setCalculation(String calculation) {
        this.calculation = calculation;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public ExternalPayrollReceiptPreview setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El empleado como receptor del CFDI (Receptor).
     */
    public ExternalPayrollReceiptPreviewCustomer getCustomer() {
        return customer;
    }

    public ExternalPayrollReceiptPreview setCustomer(ExternalPayrollReceiptPreviewCustomer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * El recibo de nómina 1.2: empleado, periodo, percepciones, deducciones y otros pagos.
     */
    public InvoicePayroll getPayroll() {
        return payroll;
    }

    public ExternalPayrollReceiptPreview setPayroll(InvoicePayroll payroll) {
        this.payroll = payroll;
        return this;
    }

    /**
     * SubTotal: percepciones más otros pagos.
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public ExternalPayrollReceiptPreview setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreview setSubtotal(double subtotal) {
        return setSubtotal(BigDecimal.valueOf(subtotal));
    }

    /**
     * Descuento: las deducciones.
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    public ExternalPayrollReceiptPreview setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreview setDiscount(double discount) {
        return setDiscount(BigDecimal.valueOf(discount));
    }

    /**
     * Total: el neto a pagar.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public ExternalPayrollReceiptPreview setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public ExternalPayrollReceiptPreview setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Lo que el SAT podría observar; no impide timbrar.
     */
    public List<ExternalPayrollReceiptPreviewWarning> getWarnings() {
        return warnings;
    }

    public ExternalPayrollReceiptPreview setWarnings(List<ExternalPayrollReceiptPreviewWarning> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * El XML que se mandaría al PAC, sin sello ni timbre: sus importes son exactamente los que mandó.
     */
    public String getUnsignedXml() {
        return unsignedXml;
    }

    public ExternalPayrollReceiptPreview setUnsignedXml(String unsignedXml) {
        this.unsignedXml = unsignedXml;
        return this;
    }
}
