// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollBankFilePayment: PayrollBankFilePayment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollBankFilePayment {
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
     * La CLABE a donde se paga.
     */
    @JsonProperty("clabe")
    private String clabe;

    /**
     * true: a otro banco por SPEI; false: a una cuenta del mismo banco.
     */
    @JsonProperty("spei")
    private Boolean spei;

    /**
     * Serie y folio de los recibos que paga.
     */
    @JsonProperty("receipts")
    private List<String> receipts;

    /**
     * El empleado (emp_…); null si el recibo lo timbró otro sistema y no hay empleado con ese RFC.
     */
    public String getEmployee() {
        return employee;
    }

    public PayrollBankFilePayment setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Número de empleado (NumEmpleado).
     */
    public String getNumber() {
        return number;
    }

    public PayrollBankFilePayment setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PayrollBankFilePayment setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public PayrollBankFilePayment setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El neto a pagar: la suma de sus recibos con esa fecha de pago.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayrollBankFilePayment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayrollBankFilePayment setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * La CLABE a donde se paga.
     */
    public String getClabe() {
        return clabe;
    }

    public PayrollBankFilePayment setClabe(String clabe) {
        this.clabe = clabe;
        return this;
    }

    /**
     * true: a otro banco por SPEI; false: a una cuenta del mismo banco.
     */
    public Boolean getSpei() {
        return spei;
    }

    public PayrollBankFilePayment setSpei(Boolean spei) {
        this.spei = spei;
        return this;
    }

    /**
     * Serie y folio de los recibos que paga.
     */
    public List<String> getReceipts() {
        return receipts;
    }

    public PayrollBankFilePayment setReceipts(List<String> receipts) {
        this.receipts = receipts;
        return this;
    }
}
