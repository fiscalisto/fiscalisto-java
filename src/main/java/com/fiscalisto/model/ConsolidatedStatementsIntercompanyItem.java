// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ConsolidatedStatementsIntercompanyItem: ConsolidatedStatementsIntercompanyItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedStatementsIntercompanyItem {
    /**
     * El RFC que facturó.
     */
    @JsonProperty("issuer_rfc")
    private String issuerRfc;

    /**
     * El RFC que recibió.
     */
    @JsonProperty("receiver_rfc")
    private String receiverRfc;

    /**
     * Lo facturado en el mes, sin impuestos, en pesos (egresos restan).
     */
    @JsonProperty("month_amount")
    private BigDecimal monthAmount;

    /**
     * Lo facturado de enero al mes, sin impuestos, en pesos.
     */
    @JsonProperty("year_to_date_amount")
    private BigDecimal yearToDateAmount;

    /**
     * Cuántos CFDI en el año.
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * El RFC que facturó.
     */
    public String getIssuerRfc() {
        return issuerRfc;
    }

    public ConsolidatedStatementsIntercompanyItem setIssuerRfc(String issuerRfc) {
        this.issuerRfc = issuerRfc;
        return this;
    }

    /**
     * El RFC que recibió.
     */
    public String getReceiverRfc() {
        return receiverRfc;
    }

    public ConsolidatedStatementsIntercompanyItem setReceiverRfc(String receiverRfc) {
        this.receiverRfc = receiverRfc;
        return this;
    }

    /**
     * Lo facturado en el mes, sin impuestos, en pesos (egresos restan).
     */
    public BigDecimal getMonthAmount() {
        return monthAmount;
    }

    public ConsolidatedStatementsIntercompanyItem setMonthAmount(BigDecimal monthAmount) {
        this.monthAmount = monthAmount;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsIntercompanyItem setMonthAmount(double monthAmount) {
        return setMonthAmount(BigDecimal.valueOf(monthAmount));
    }

    /**
     * Lo facturado de enero al mes, sin impuestos, en pesos.
     */
    public BigDecimal getYearToDateAmount() {
        return yearToDateAmount;
    }

    public ConsolidatedStatementsIntercompanyItem setYearToDateAmount(BigDecimal yearToDateAmount) {
        this.yearToDateAmount = yearToDateAmount;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsIntercompanyItem setYearToDateAmount(double yearToDateAmount) {
        return setYearToDateAmount(BigDecimal.valueOf(yearToDateAmount));
    }

    /**
     * Cuántos CFDI en el año.
     */
    public Long getInvoices() {
        return invoices;
    }

    public ConsolidatedStatementsIntercompanyItem setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsIntercompanyItem setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }
}
