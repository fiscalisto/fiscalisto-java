// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollPayoutExcludedItem: PayrollPayoutExcludedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollPayoutExcludedItem {
    /**
     * El empleado (emp_…); null si el recibo lo timbró otro sistema y no hay empleado con ese RFC.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su neto: la suma de sus recibos con esa fecha de pago, menos vales.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * add: su CLABE aún no está registrada en Pagos (se registra en la app); waiting: su cuenta está en verificación o en su espera; blocked: su cuenta tiene un problema; no_clabe: no tiene CLABE en su ficha; zero: su neto es cero; in_payout: ya va en otro pago de esta nómina; ready: no cupo (un pago lleva hasta 500).
     * <p>
     * Valores: ready, add, waiting, blocked, no_clabe, zero, in_payout.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Por qué no va en este pago.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * El empleado (emp_…); null si el recibo lo timbró otro sistema y no hay empleado con ese RFC.
     */
    public String getEmployee() {
        return employee;
    }

    public PayrollPayoutExcludedItem setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollPayoutExcludedItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public PayrollPayoutExcludedItem setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su neto: la suma de sus recibos con esa fecha de pago, menos vales.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayrollPayoutExcludedItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayrollPayoutExcludedItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * add: su CLABE aún no está registrada en Pagos (se registra en la app); waiting: su cuenta está en verificación o en su espera; blocked: su cuenta tiene un problema; no_clabe: no tiene CLABE en su ficha; zero: su neto es cero; in_payout: ya va en otro pago de esta nómina; ready: no cupo (un pago lleva hasta 500).
     * <p>
     * Valores: ready, add, waiting, blocked, no_clabe, zero, in_payout.
     */
    public String getStatus() {
        return status;
    }

    public PayrollPayoutExcludedItem setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Por qué no va en este pago.
     */
    public String getReason() {
        return reason;
    }

    public PayrollPayoutExcludedItem setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
