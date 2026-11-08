// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * VatRefundReview: VatRefundReview.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VatRefundReview {
    /**
     * El mes revisado (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * Lo que conviene pedir, en pesos sin centavos como lo pide el SAT.
     */
    @JsonProperty("amount_to_request")
    private BigDecimal amountToRequest;

    /**
     * true si ya acreditó parte del saldo y lo que pide es el remanente.
     */
    @JsonProperty("remainder")
    private Boolean remainder;

    /**
     * true si ninguna revisión bloquea la solicitud.
     */
    @JsonProperty("ready")
    private Boolean ready;

    /**
     * Cada revisión, de la más grave a la que está bien.
     */
    @JsonProperty("checks")
    private List<VatRefundReviewCheck> checks;

    /**
     * Los proveedores del mes, para la relación que pide el SAT.
     */
    @JsonProperty("suppliers")
    private VatRefundReviewSuppliers suppliers;

    /**
     * Los clientes del mes.
     */
    @JsonProperty("customers")
    private VatRefundReviewCustomers customers;

    /**
     * El mes revisado (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public VatRefundReview setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Lo que conviene pedir, en pesos sin centavos como lo pide el SAT.
     */
    public BigDecimal getAmountToRequest() {
        return amountToRequest;
    }

    public VatRefundReview setAmountToRequest(BigDecimal amountToRequest) {
        this.amountToRequest = amountToRequest;
        return this;
    }

    @JsonIgnore
    public VatRefundReview setAmountToRequest(double amountToRequest) {
        return setAmountToRequest(BigDecimal.valueOf(amountToRequest));
    }

    /**
     * true si ya acreditó parte del saldo y lo que pide es el remanente.
     */
    public Boolean getRemainder() {
        return remainder;
    }

    public VatRefundReview setRemainder(Boolean remainder) {
        this.remainder = remainder;
        return this;
    }

    /**
     * true si ninguna revisión bloquea la solicitud.
     */
    public Boolean getReady() {
        return ready;
    }

    public VatRefundReview setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }

    /**
     * Cada revisión, de la más grave a la que está bien.
     */
    public List<VatRefundReviewCheck> getChecks() {
        return checks;
    }

    public VatRefundReview setChecks(List<VatRefundReviewCheck> checks) {
        this.checks = checks;
        return this;
    }

    /**
     * Los proveedores del mes, para la relación que pide el SAT.
     */
    public VatRefundReviewSuppliers getSuppliers() {
        return suppliers;
    }

    public VatRefundReview setSuppliers(VatRefundReviewSuppliers suppliers) {
        this.suppliers = suppliers;
        return this;
    }

    /**
     * Los clientes del mes.
     */
    public VatRefundReviewCustomers getCustomers() {
        return customers;
    }

    public VatRefundReview setCustomers(VatRefundReviewCustomers customers) {
        this.customers = customers;
        return this;
    }
}
