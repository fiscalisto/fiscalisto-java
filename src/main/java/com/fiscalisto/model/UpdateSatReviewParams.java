// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdateSatReviewParams: los campos de «Actualizar una revisión del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSatReviewParams {
    /**
     * Qué le llegó (vea type al crearla).
     * <p>
     * Valores: invitation_letter, return_clarification, missing_returns, desk_audit, field_audit, electronic_audit, supplier_69b, presumption_69b, csd_restriction, tax_discrepancy, refund, other.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Todos sus oficios: reemplaza los que tenía.
     */
    @JsonProperty("notices")
    private List<UpdateSatReviewParamsNotice> notices;

    /**
     * Todo lo que pide, con done para marcar lo que ya tiene: reemplaza la lista.
     */
    @JsonProperty("requests")
    private List<UpdateSatReviewParamsRequest> requests;

    /**
     * open (por atender, por omisión), answered, concluded (sin observaciones), assessed (con crédito fiscal), in_defense o closed. Mientras está open, answered, assessed o in_defense, Fiscalisto cuenta sus plazos y avisa.
     * <p>
     * Valores: open, answered, concluded, assessed, in_defense, closed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El número del oficio, como viene en él (por ejemplo 500-05-2026-1234).
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * El número de orden (ABC1234567/26) o de trámite (AB123456789012) si pide la contabilidad electrónica: va en sus pólizas.
     */
    @JsonProperty("order_number")
    private String orderNumber;

    /**
     * La autoridad que lo firma (por ejemplo «ADAF de Occidente»).
     */
    @JsonProperty("authority")
    private String authority;

    /**
     * Primer día del periodo que revisa. Con period_end, Fiscalisto arma lo suyo.
     */
    @JsonProperty("period_start")
    private String periodStart;

    /**
     * Último día del periodo que revisa (a lo más 7 ejercicios).
     */
    @JsonProperty("period_end")
    private String periodEnd;

    /**
     * El monto que señala el SAT, en pesos, si señala uno.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Sus notas.
     */
    @JsonProperty("notes")
    private String notes;

    /**
     * Qué le llegó (vea type al crearla).
     * <p>
     * Valores: invitation_letter, return_clarification, missing_returns, desk_audit, field_audit, electronic_audit, supplier_69b, presumption_69b, csd_restriction, tax_discrepancy, refund, other.
     */
    public String getType() {
        return type;
    }

    public UpdateSatReviewParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Todos sus oficios: reemplaza los que tenía.
     */
    public List<UpdateSatReviewParamsNotice> getNotices() {
        return notices;
    }

    public UpdateSatReviewParams setNotices(List<UpdateSatReviewParamsNotice> notices) {
        this.notices = notices;
        return this;
    }

    /**
     * Todo lo que pide, con done para marcar lo que ya tiene: reemplaza la lista.
     */
    public List<UpdateSatReviewParamsRequest> getRequests() {
        return requests;
    }

    public UpdateSatReviewParams setRequests(List<UpdateSatReviewParamsRequest> requests) {
        this.requests = requests;
        return this;
    }

    /**
     * open (por atender, por omisión), answered, concluded (sin observaciones), assessed (con crédito fiscal), in_defense o closed. Mientras está open, answered, assessed o in_defense, Fiscalisto cuenta sus plazos y avisa.
     * <p>
     * Valores: open, answered, concluded, assessed, in_defense, closed.
     */
    public String getStatus() {
        return status;
    }

    public UpdateSatReviewParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El número del oficio, como viene en él (por ejemplo 500-05-2026-1234).
     */
    public String getReference() {
        return reference;
    }

    public UpdateSatReviewParams setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * El número de orden (ABC1234567/26) o de trámite (AB123456789012) si pide la contabilidad electrónica: va en sus pólizas.
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    public UpdateSatReviewParams setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * La autoridad que lo firma (por ejemplo «ADAF de Occidente»).
     */
    public String getAuthority() {
        return authority;
    }

    public UpdateSatReviewParams setAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * Primer día del periodo que revisa. Con period_end, Fiscalisto arma lo suyo.
     */
    public String getPeriodStart() {
        return periodStart;
    }

    public UpdateSatReviewParams setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
     * Último día del periodo que revisa (a lo más 7 ejercicios).
     */
    public String getPeriodEnd() {
        return periodEnd;
    }

    public UpdateSatReviewParams setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    /**
     * El monto que señala el SAT, en pesos, si señala uno.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public UpdateSatReviewParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public UpdateSatReviewParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Sus notas.
     */
    public String getNotes() {
        return notes;
    }

    public UpdateSatReviewParams setNotes(String notes) {
        this.notes = notes;
        return this;
    }
}
