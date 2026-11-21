// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * PayrollPayout: El pago de una nómina en Pagos: el neto de cada empleado a su CLABE aprobada, en un pago en borrador que alguien del equipo firma en la app.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollPayout {
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
     * El emisor (iss_…) que paga.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La fecha de pago de los recibos que paga.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * El pago en borrador (pyo_…), con una línea por empleado: se firma en la app, en su app_url.
     */
    @JsonProperty("payout")
    private Payout payout;

    /**
     * Quién no va en este pago y por qué: su CLABE no está registrada o aún no se puede pagar, no tiene CLABE, su neto es cero o ya va en otro pago de esta nómina.
     */
    @JsonProperty("excluded")
    private List<PayrollPayoutExcludedItem> excluded;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollPayout setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollPayout setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…) que paga.
     */
    public String getIssuer() {
        return issuer;
    }

    public PayrollPayout setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La fecha de pago de los recibos que paga.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public PayrollPayout setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * El pago en borrador (pyo_…), con una línea por empleado: se firma en la app, en su app_url.
     */
    public Payout getPayout() {
        return payout;
    }

    public PayrollPayout setPayout(Payout payout) {
        this.payout = payout;
        return this;
    }

    /**
     * Quién no va en este pago y por qué: su CLABE no está registrada o aún no se puede pagar, no tiene CLABE, su neto es cero o ya va en otro pago de esta nómina.
     */
    public List<PayrollPayoutExcludedItem> getExcluded() {
        return excluded;
    }

    public PayrollPayout setExcluded(List<PayrollPayoutExcludedItem> excluded) {
        this.excluded = excluded;
        return this;
    }
}
