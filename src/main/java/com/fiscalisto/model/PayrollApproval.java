// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollApproval: Una prenómina pedida para aprobación: con ella aprobada se timbran sus recibos, con esos importes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollApproval {
    /**
     * pap_…
     */
    @JsonProperty("id")
    private String id;

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
     * iss_…
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Periodicidad de la nómina (c_PeriodicidadPago): 02, 03, 04 o 05.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * El periodo de pago de la nómina: FechaInicialPago, FechaFinalPago y FechaPago de sus recibos.
     */
    @JsonProperty("period")
    private PayrollApprovalPeriod period;

    /**
     * pending (por aprobar), approved, rejected (note dice por qué), withdrawn (retirada) o replaced (se pidió otra del mismo periodo).
     * <p>
     * Valores: pending, approved, rejected, withdrawn, replaced.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El neto de todos sus recibos.
     */
    @JsonProperty("net")
    private BigDecimal net;

    /**
     * El recibo de cada empleado, como se calculó al pedirla.
     */
    @JsonProperty("receipts")
    private List<PayrollApprovalReceipt> receipts;

    /**
     * Cuándo se pidió (ISO 8601).
     */
    @JsonProperty("requested_at")
    private String requestedAt;

    /**
     * Cuándo se aprobó, rechazó o retiró, o null.
     */
    @JsonProperty("decided_at")
    private String decidedAt;

    /**
     * Por qué se rechazó, el comentario de quien la aprobó, o el paso que la aprobó solo; o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Mientras espera (pending): en qué paso de sus «Pasos de aprobación» va (Ajustes › Aprobaciones › Prenómina); null en otro estado.
     */
    @JsonProperty("step")
    private PayrollApprovalStep step;

    /**
     * pap_…
     */
    public String getId() {
        return id;
    }

    public PayrollApproval setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollApproval setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollApproval setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * iss_…
     */
    public String getIssuer() {
        return issuer;
    }

    public PayrollApproval setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Periodicidad de la nómina (c_PeriodicidadPago): 02, 03, 04 o 05.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public PayrollApproval setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * El periodo de pago de la nómina: FechaInicialPago, FechaFinalPago y FechaPago de sus recibos.
     */
    public PayrollApprovalPeriod getPeriod() {
        return period;
    }

    public PayrollApproval setPeriod(PayrollApprovalPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * pending (por aprobar), approved, rejected (note dice por qué), withdrawn (retirada) o replaced (se pidió otra del mismo periodo).
     * <p>
     * Valores: pending, approved, rejected, withdrawn, replaced.
     */
    public String getStatus() {
        return status;
    }

    public PayrollApproval setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El neto de todos sus recibos.
     */
    public BigDecimal getNet() {
        return net;
    }

    public PayrollApproval setNet(BigDecimal net) {
        this.net = net;
        return this;
    }

    @JsonIgnore
    public PayrollApproval setNet(double net) {
        return setNet(BigDecimal.valueOf(net));
    }

    /**
     * El recibo de cada empleado, como se calculó al pedirla.
     */
    public List<PayrollApprovalReceipt> getReceipts() {
        return receipts;
    }

    public PayrollApproval setReceipts(List<PayrollApprovalReceipt> receipts) {
        this.receipts = receipts;
        return this;
    }

    /**
     * Cuándo se pidió (ISO 8601).
     */
    public String getRequestedAt() {
        return requestedAt;
    }

    public PayrollApproval setRequestedAt(String requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }

    /**
     * Cuándo se aprobó, rechazó o retiró, o null.
     */
    public String getDecidedAt() {
        return decidedAt;
    }

    public PayrollApproval setDecidedAt(String decidedAt) {
        this.decidedAt = decidedAt;
        return this;
    }

    /**
     * Por qué se rechazó, el comentario de quien la aprobó, o el paso que la aprobó solo; o null.
     */
    public String getNote() {
        return note;
    }

    public PayrollApproval setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Mientras espera (pending): en qué paso de sus «Pasos de aprobación» va (Ajustes › Aprobaciones › Prenómina); null en otro estado.
     */
    public PayrollApprovalStep getStep() {
        return step;
    }

    public PayrollApproval setStep(PayrollApprovalStep step) {
        this.step = step;
        return this;
    }
}
