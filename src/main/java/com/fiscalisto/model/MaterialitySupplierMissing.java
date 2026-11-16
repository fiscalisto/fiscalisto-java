// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MaterialitySupplierMissing: A cuántas facturas les falta el acuerdo, la entrega y el pago.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaterialitySupplierMissing {
    /**
     * Facturas sin acuerdo (contrato u orden de compra).
     */
    @JsonProperty("agreement")
    private Long agreement;

    /**
     * Facturas sin entrega (recepción, entregables o fotos).
     */
    @JsonProperty("delivery")
    private Long delivery;

    /**
     * Facturas sin pago (complemento, pago en el portal o en la orden, banco o comprobante).
     */
    @JsonProperty("payment")
    private Long payment;

    /**
     * Facturas sin acuerdo (contrato u orden de compra).
     */
    public Long getAgreement() {
        return agreement;
    }

    public MaterialitySupplierMissing setAgreement(Long agreement) {
        this.agreement = agreement;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplierMissing setAgreement(long agreement) {
        return setAgreement(Long.valueOf(agreement));
    }

    /**
     * Facturas sin entrega (recepción, entregables o fotos).
     */
    public Long getDelivery() {
        return delivery;
    }

    public MaterialitySupplierMissing setDelivery(Long delivery) {
        this.delivery = delivery;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplierMissing setDelivery(long delivery) {
        return setDelivery(Long.valueOf(delivery));
    }

    /**
     * Facturas sin pago (complemento, pago en el portal o en la orden, banco o comprobante).
     */
    public Long getPayment() {
        return payment;
    }

    public MaterialitySupplierMissing setPayment(Long payment) {
        this.payment = payment;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplierMissing setPayment(long payment) {
        return setPayment(Long.valueOf(payment));
    }
}
