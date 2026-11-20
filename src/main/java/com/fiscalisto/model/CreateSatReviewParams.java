// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateSatReviewParams: los campos de «Registrar una revisión del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSatReviewParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Qué le llegó: invitation_letter, return_clarification, missing_returns, desk_audit (revisión de gabinete), field_audit (visita domiciliaria), electronic_audit, supplier_69b, presumption_69b, csd_restriction, tax_discrepancy, refund u other.
     * <p>
     * Valores: invitation_letter, return_clarification, missing_returns, desk_audit, field_audit, electronic_audit, supplier_69b, presumption_69b, csd_restriction, tax_discrepancy, refund, other.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Sus oficios con su fecha de notificación: el que la abrió y los que siguieron (prórroga, segundo requerimiento, observaciones…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("notices")
    private List<CreateSatReviewParamsNotice> notices;

    /**
     * Lo que el oficio pide entregar. Sin esto, lo que el SAT suele pedir en ese tipo.
     */
    @JsonProperty("requests")
    private List<CreateSatReviewParamsRequest> requests;

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
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateSatReviewParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Qué le llegó: invitation_letter, return_clarification, missing_returns, desk_audit (revisión de gabinete), field_audit (visita domiciliaria), electronic_audit, supplier_69b, presumption_69b, csd_restriction, tax_discrepancy, refund u other.
     * <p>
     * Valores: invitation_letter, return_clarification, missing_returns, desk_audit, field_audit, electronic_audit, supplier_69b, presumption_69b, csd_restriction, tax_discrepancy, refund, other.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateSatReviewParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Sus oficios con su fecha de notificación: el que la abrió y los que siguieron (prórroga, segundo requerimiento, observaciones…).
     * <p>
     * Obligatorio.
     */
    public List<CreateSatReviewParamsNotice> getNotices() {
        return notices;
    }

    public CreateSatReviewParams setNotices(List<CreateSatReviewParamsNotice> notices) {
        this.notices = notices;
        return this;
    }

    /**
     * Lo que el oficio pide entregar. Sin esto, lo que el SAT suele pedir en ese tipo.
     */
    public List<CreateSatReviewParamsRequest> getRequests() {
        return requests;
    }

    public CreateSatReviewParams setRequests(List<CreateSatReviewParamsRequest> requests) {
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

    public CreateSatReviewParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El número del oficio, como viene en él (por ejemplo 500-05-2026-1234).
     */
    public String getReference() {
        return reference;
    }

    public CreateSatReviewParams setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * El número de orden (ABC1234567/26) o de trámite (AB123456789012) si pide la contabilidad electrónica: va en sus pólizas.
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    public CreateSatReviewParams setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * La autoridad que lo firma (por ejemplo «ADAF de Occidente»).
     */
    public String getAuthority() {
        return authority;
    }

    public CreateSatReviewParams setAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * Primer día del periodo que revisa. Con period_end, Fiscalisto arma lo suyo.
     */
    public String getPeriodStart() {
        return periodStart;
    }

    public CreateSatReviewParams setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
     * Último día del periodo que revisa (a lo más 7 ejercicios).
     */
    public String getPeriodEnd() {
        return periodEnd;
    }

    public CreateSatReviewParams setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    /**
     * El monto que señala el SAT, en pesos, si señala uno.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateSatReviewParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateSatReviewParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Sus notas.
     */
    public String getNotes() {
        return notes;
    }

    public CreateSatReviewParams setNotes(String notes) {
        this.notes = notes;
        return this;
    }
}
