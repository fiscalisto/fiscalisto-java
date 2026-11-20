// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SatReview: Una carta invitación, requerimiento u oficio del SAT al RFC del emisor: su plazo en días hábiles desde que surte efectos la notificación (sin los inhábiles del SAT), lo que pide, cuánto de eso tiene Fiscalisto y su última respuesta armada.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatReview {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor cuyo RFC recibió el oficio.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Qué le llegó (invitation_letter, desk_audit, field_audit…).
     * <p>
     * Valores: invitation_letter, return_clarification, missing_returns, desk_audit, field_audit, electronic_audit, supplier_69b, presumption_69b, csd_restriction, tax_discrepancy, refund, other.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Su nombre como lo muestra la app («Revisión de gabinete»).
     */
    @JsonProperty("type_name")
    private String typeName;

    /**
     * open (por atender), answered, concluded (sin observaciones), assessed (con crédito fiscal), in_defense o closed.
     * <p>
     * Valores: open, answered, concluded, assessed, in_defense, closed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Su estado como lo muestra la app («Por atender»).
     */
    @JsonProperty("status_name")
    private String statusName;

    /**
     * El número del oficio, o null.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * El número de orden o de trámite que va en las pólizas de la contabilidad electrónica, o null.
     */
    @JsonProperty("order_number")
    private String orderNumber;

    /**
     * La autoridad que lo firma, o null.
     */
    @JsonProperty("authority")
    private String authority;

    /**
     * Primer día del periodo revisado, o null.
     */
    @JsonProperty("period_start")
    private String periodStart;

    /**
     * Último día del periodo revisado, o null.
     */
    @JsonProperty("period_end")
    private String periodEnd;

    /**
     * El monto que señala el SAT, en pesos, o null.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El último día para responder el oficio pendiente (el más reciente sin responder), o null si la ley no da plazo o ya respondió todos.
     */
    @JsonProperty("due_on")
    private String dueOn;

    /**
     * Días hábiles que le quedan: 0 es hoy, negativo ya pasó. null sin plazo.
     */
    @JsonProperty("business_days_left")
    private Long businessDaysLeft;

    /**
     * El día en que el SAT debe terminar la revisión (12 meses en gabinete y visita, 6 en electrónica), o null.
     */
    @JsonProperty("sat_must_conclude_by")
    private String satMustConcludeBy;

    /**
     * Sus oficios, del primero al último, cada uno con su plazo.
     */
    @JsonProperty("notices")
    private List<SatReviewNotice> notices;

    /**
     * Lo que el oficio pide entregar y qué tan listo está.
     */
    @JsonProperty("requests")
    private List<SatReviewRequest> requests;

    /**
     * Cuántas de requests están listas («Ya tiene N de M»).
     */
    @JsonProperty("ready")
    private Long ready;

    /**
     * Cuántas pide.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * La última respuesta armada (POST /v1/sat_reviews/{id}/answer), o null. Se descarga con GET /v1/sat_reviews/{id}/answer.
     */
    @JsonProperty("answer")
    private SatReviewAnswer answer;

    /**
     * Sus notas, o null.
     */
    @JsonProperty("notes")
    private String notes;

    /**
     * Cuándo se registró.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Su último cambio.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public SatReview setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatReview setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatReview setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor cuyo RFC recibió el oficio.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatReview setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Qué le llegó (invitation_letter, desk_audit, field_audit…).
     * <p>
     * Valores: invitation_letter, return_clarification, missing_returns, desk_audit, field_audit, electronic_audit, supplier_69b, presumption_69b, csd_restriction, tax_discrepancy, refund, other.
     */
    public String getType() {
        return type;
    }

    public SatReview setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Su nombre como lo muestra la app («Revisión de gabinete»).
     */
    public String getTypeName() {
        return typeName;
    }

    public SatReview setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * open (por atender), answered, concluded (sin observaciones), assessed (con crédito fiscal), in_defense o closed.
     * <p>
     * Valores: open, answered, concluded, assessed, in_defense, closed.
     */
    public String getStatus() {
        return status;
    }

    public SatReview setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Su estado como lo muestra la app («Por atender»).
     */
    public String getStatusName() {
        return statusName;
    }

    public SatReview setStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * El número del oficio, o null.
     */
    public String getReference() {
        return reference;
    }

    public SatReview setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * El número de orden o de trámite que va en las pólizas de la contabilidad electrónica, o null.
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    public SatReview setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * La autoridad que lo firma, o null.
     */
    public String getAuthority() {
        return authority;
    }

    public SatReview setAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * Primer día del periodo revisado, o null.
     */
    public String getPeriodStart() {
        return periodStart;
    }

    public SatReview setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
     * Último día del periodo revisado, o null.
     */
    public String getPeriodEnd() {
        return periodEnd;
    }

    public SatReview setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    /**
     * El monto que señala el SAT, en pesos, o null.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SatReview setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SatReview setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El último día para responder el oficio pendiente (el más reciente sin responder), o null si la ley no da plazo o ya respondió todos.
     */
    public String getDueOn() {
        return dueOn;
    }

    public SatReview setDueOn(String dueOn) {
        this.dueOn = dueOn;
        return this;
    }

    /**
     * Días hábiles que le quedan: 0 es hoy, negativo ya pasó. null sin plazo.
     */
    public Long getBusinessDaysLeft() {
        return businessDaysLeft;
    }

    public SatReview setBusinessDaysLeft(Long businessDaysLeft) {
        this.businessDaysLeft = businessDaysLeft;
        return this;
    }

    @JsonIgnore
    public SatReview setBusinessDaysLeft(long businessDaysLeft) {
        return setBusinessDaysLeft(Long.valueOf(businessDaysLeft));
    }

    /**
     * El día en que el SAT debe terminar la revisión (12 meses en gabinete y visita, 6 en electrónica), o null.
     */
    public String getSatMustConcludeBy() {
        return satMustConcludeBy;
    }

    public SatReview setSatMustConcludeBy(String satMustConcludeBy) {
        this.satMustConcludeBy = satMustConcludeBy;
        return this;
    }

    /**
     * Sus oficios, del primero al último, cada uno con su plazo.
     */
    public List<SatReviewNotice> getNotices() {
        return notices;
    }

    public SatReview setNotices(List<SatReviewNotice> notices) {
        this.notices = notices;
        return this;
    }

    /**
     * Lo que el oficio pide entregar y qué tan listo está.
     */
    public List<SatReviewRequest> getRequests() {
        return requests;
    }

    public SatReview setRequests(List<SatReviewRequest> requests) {
        this.requests = requests;
        return this;
    }

    /**
     * Cuántas de requests están listas («Ya tiene N de M»).
     */
    public Long getReady() {
        return ready;
    }

    public SatReview setReady(Long ready) {
        this.ready = ready;
        return this;
    }

    @JsonIgnore
    public SatReview setReady(long ready) {
        return setReady(Long.valueOf(ready));
    }

    /**
     * Cuántas pide.
     */
    public Long getTotal() {
        return total;
    }

    public SatReview setTotal(Long total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public SatReview setTotal(long total) {
        return setTotal(Long.valueOf(total));
    }

    /**
     * La última respuesta armada (POST /v1/sat_reviews/{id}/answer), o null. Se descarga con GET /v1/sat_reviews/{id}/answer.
     */
    public SatReviewAnswer getAnswer() {
        return answer;
    }

    public SatReview setAnswer(SatReviewAnswer answer) {
        this.answer = answer;
        return this;
    }

    /**
     * Sus notas, o null.
     */
    public String getNotes() {
        return notes;
    }

    public SatReview setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Cuándo se registró.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public SatReview setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Su último cambio.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public SatReview setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
