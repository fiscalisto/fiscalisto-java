// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollBankFileExcludedItem: PayrollBankFileExcludedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollBankFileExcludedItem {
    /**
     * El empleado (emp_…); null si el recibo lo timbró otro sistema y no hay empleado con ese RFC.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Número de empleado (NumEmpleado).
     */
    @JsonProperty("number")
    private String number;

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
     * El neto a pagar: la suma de sus recibos con esa fecha de pago.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Por qué no va en el archivo.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * El empleado (emp_…); null si el recibo lo timbró otro sistema y no hay empleado con ese RFC.
     */
    public String getEmployee() {
        return employee;
    }

    public PayrollBankFileExcludedItem setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Número de empleado (NumEmpleado).
     */
    public String getNumber() {
        return number;
    }

    public PayrollBankFileExcludedItem setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollBankFileExcludedItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public PayrollBankFileExcludedItem setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El neto a pagar: la suma de sus recibos con esa fecha de pago.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayrollBankFileExcludedItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayrollBankFileExcludedItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Por qué no va en el archivo.
     */
    public String getReason() {
        return reason;
    }

    public PayrollBankFileExcludedItem setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
