// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * VatRefund: El IVA a favor del emisor mes por mes, qué pasó con cada saldo y, con un mes, la revisión antes de pedir su devolución.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VatRefund {
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
     * El IVA a favor que todavía puede pedir de vuelta: lo que queda de cada saldo sin acreditar, sin solicitud y sin prescribir.
     */
    @JsonProperty("available")
    private BigDecimal available;

    /**
     * Lo pedido en solicitudes que siguen en trámite o ya se resolvieron sin depósito.
     */
    @JsonProperty("in_refund")
    private BigDecimal inRefund;

    /**
     * Lo que el SAT ya depositó.
     */
    @JsonProperty("refunded")
    private BigDecimal refunded;

    /**
     * true si algún mes sale de sus CFDI porque su declaración no se ha leído (POST /v1/sat_declarations/refresh).
     */
    @JsonProperty("estimated")
    private Boolean estimated;

    /**
     * Cada mes con IVA a favor en los últimos cinco años, del más reciente al más antiguo.
     */
    @JsonProperty("balances")
    private List<VatRefundBalance> balances;

    /**
     * Con month, la revisión de ese mes antes de pedirlo; null sin month.
     */
    @JsonProperty("review")
    private VatRefundReview review;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public VatRefund setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public VatRefund setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public VatRefund setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El IVA a favor que todavía puede pedir de vuelta: lo que queda de cada saldo sin acreditar, sin solicitud y sin prescribir.
     */
    public BigDecimal getAvailable() {
        return available;
    }

    public VatRefund setAvailable(BigDecimal available) {
        this.available = available;
        return this;
    }

    @JsonIgnore
    public VatRefund setAvailable(double available) {
        return setAvailable(BigDecimal.valueOf(available));
    }

    /**
     * Lo pedido en solicitudes que siguen en trámite o ya se resolvieron sin depósito.
     */
    public BigDecimal getInRefund() {
        return inRefund;
    }

    public VatRefund setInRefund(BigDecimal inRefund) {
        this.inRefund = inRefund;
        return this;
    }

    @JsonIgnore
    public VatRefund setInRefund(double inRefund) {
        return setInRefund(BigDecimal.valueOf(inRefund));
    }

    /**
     * Lo que el SAT ya depositó.
     */
    public BigDecimal getRefunded() {
        return refunded;
    }

    public VatRefund setRefunded(BigDecimal refunded) {
        this.refunded = refunded;
        return this;
    }

    @JsonIgnore
    public VatRefund setRefunded(double refunded) {
        return setRefunded(BigDecimal.valueOf(refunded));
    }

    /**
     * true si algún mes sale de sus CFDI porque su declaración no se ha leído (POST /v1/sat_declarations/refresh).
     */
    public Boolean getEstimated() {
        return estimated;
    }

    public VatRefund setEstimated(Boolean estimated) {
        this.estimated = estimated;
        return this;
    }

    /**
     * Cada mes con IVA a favor en los últimos cinco años, del más reciente al más antiguo.
     */
    public List<VatRefundBalance> getBalances() {
        return balances;
    }

    public VatRefund setBalances(List<VatRefundBalance> balances) {
        this.balances = balances;
        return this;
    }

    /**
     * Con month, la revisión de ese mes antes de pedirlo; null sin month.
     */
    public VatRefundReview getReview() {
        return review;
    }

    public VatRefund setReview(VatRefundReview review) {
        this.review = review;
        return this;
    }
}
