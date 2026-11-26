// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CrossCheckCfdiExplanationExactCfdiItem: CrossCheckCfdiExplanationExactCfdiItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossCheckCfdiExplanationExactCfdiItem {
    /**
     * El folio fiscal (UUID) del CFDI; el de la factura PPD en un pago.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * La fecha del CFDI, o la del pago (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * El RFC de la contraparte: el cliente en lo emitido, el proveedor en lo recibido.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * El nombre de la contraparte, como viene en el CFDI.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Lo que aporta a la cifra, en pesos; negativo en una nota de crédito.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Cuánto cambiaría invoiced.
     */
    @JsonProperty("effect")
    private BigDecimal effect;

    /**
     * Por qué lo explicaría.
     * <p>
     * Valores: canceled, ppd_not_collected, other_month, month_edge, credit_note, ppd_payment, duplicate, left_out, withholding_certificate.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * true si está en cfdi.
     */
    @JsonProperty("in_invoiced")
    private Boolean inInvoiced;

    /**
     * El folio fiscal (UUID) del CFDI; el de la factura PPD en un pago.
     */
    public String getUuid() {
        return uuid;
    }

    public CrossCheckCfdiExplanationExactCfdiItem setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * La fecha del CFDI, o la del pago (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public CrossCheckCfdiExplanationExactCfdiItem setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El RFC de la contraparte: el cliente en lo emitido, el proveedor en lo recibido.
     */
    public String getTaxId() {
        return taxId;
    }

    public CrossCheckCfdiExplanationExactCfdiItem setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El nombre de la contraparte, como viene en el CFDI.
     */
    public String getName() {
        return name;
    }

    public CrossCheckCfdiExplanationExactCfdiItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Lo que aporta a la cifra, en pesos; negativo en una nota de crédito.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CrossCheckCfdiExplanationExactCfdiItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdiExplanationExactCfdiItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Cuánto cambiaría invoiced.
     */
    public BigDecimal getEffect() {
        return effect;
    }

    public CrossCheckCfdiExplanationExactCfdiItem setEffect(BigDecimal effect) {
        this.effect = effect;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdiExplanationExactCfdiItem setEffect(double effect) {
        return setEffect(BigDecimal.valueOf(effect));
    }

    /**
     * Por qué lo explicaría.
     * <p>
     * Valores: canceled, ppd_not_collected, other_month, month_edge, credit_note, ppd_payment, duplicate, left_out, withholding_certificate.
     */
    public String getReason() {
        return reason;
    }

    public CrossCheckCfdiExplanationExactCfdiItem setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * true si está en cfdi.
     */
    public Boolean getInInvoiced() {
        return inInvoiced;
    }

    public CrossCheckCfdiExplanationExactCfdiItem setInInvoiced(Boolean inInvoiced) {
        this.inInvoiced = inInvoiced;
        return this;
    }
}
