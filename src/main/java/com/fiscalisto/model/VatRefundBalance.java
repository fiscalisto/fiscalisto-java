// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * VatRefundBalance: VatRefundBalance.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VatRefundBalance {
    /**
     * El mes del saldo (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * declaration si sale de la declaración leída; cfdi si se calculó con sus CFDI.
     * <p>
     * Valores: declaration, cfdi.
     */
    @JsonProperty("source")
    private String source;

    /**
     * El saldo a favor del mes.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El número de operación de la declaración, o null.
     */
    @JsonProperty("operation_number")
    private String operationNumber;

    /**
     * Lo que de este saldo se acreditó en meses posteriores, del saldo más antiguo primero.
     */
    @JsonProperty("credited")
    private BigDecimal credited;

    /**
     * En qué mes se acreditó cada parte y cuánto.
     */
    @JsonProperty("credited_in")
    private List<VatRefundBalanceCreditedInItem> creditedIn;

    /**
     * Lo que queda de este saldo para pedir de vuelta.
     */
    @JsonProperty("available")
    private BigDecimal available;

    /**
     * available (se puede pedir), credited (ya se acreditó), in_refund (con solicitud), refunded (depositado), denied (negado) o prescribed (pasaron cinco años).
     * <p>
     * Valores: available, credited, in_refund, refunded, denied, prescribed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuándo prescribe el derecho a pedirlo: cinco años desde su declaración (AAAA-MM-DD).
     */
    @JsonProperty("prescribes_on")
    private String prescribesOn;

    /**
     * El mes del saldo (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public VatRefundBalance setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * declaration si sale de la declaración leída; cfdi si se calculó con sus CFDI.
     * <p>
     * Valores: declaration, cfdi.
     */
    public String getSource() {
        return source;
    }

    public VatRefundBalance setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * El saldo a favor del mes.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public VatRefundBalance setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public VatRefundBalance setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El número de operación de la declaración, o null.
     */
    public String getOperationNumber() {
        return operationNumber;
    }

    public VatRefundBalance setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
        return this;
    }

    /**
     * Lo que de este saldo se acreditó en meses posteriores, del saldo más antiguo primero.
     */
    public BigDecimal getCredited() {
        return credited;
    }

    public VatRefundBalance setCredited(BigDecimal credited) {
        this.credited = credited;
        return this;
    }

    @JsonIgnore
    public VatRefundBalance setCredited(double credited) {
        return setCredited(BigDecimal.valueOf(credited));
    }

    /**
     * En qué mes se acreditó cada parte y cuánto.
     */
    public List<VatRefundBalanceCreditedInItem> getCreditedIn() {
        return creditedIn;
    }

    public VatRefundBalance setCreditedIn(List<VatRefundBalanceCreditedInItem> creditedIn) {
        this.creditedIn = creditedIn;
        return this;
    }

    /**
     * Lo que queda de este saldo para pedir de vuelta.
     */
    public BigDecimal getAvailable() {
        return available;
    }

    public VatRefundBalance setAvailable(BigDecimal available) {
        this.available = available;
        return this;
    }

    @JsonIgnore
    public VatRefundBalance setAvailable(double available) {
        return setAvailable(BigDecimal.valueOf(available));
    }

    /**
     * available (se puede pedir), credited (ya se acreditó), in_refund (con solicitud), refunded (depositado), denied (negado) o prescribed (pasaron cinco años).
     * <p>
     * Valores: available, credited, in_refund, refunded, denied, prescribed.
     */
    public String getStatus() {
        return status;
    }

    public VatRefundBalance setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuándo prescribe el derecho a pedirlo: cinco años desde su declaración (AAAA-MM-DD).
     */
    public String getPrescribesOn() {
        return prescribesOn;
    }

    public VatRefundBalance setPrescribesOn(String prescribesOn) {
        this.prescribesOn = prescribesOn;
        return this;
    }
}
