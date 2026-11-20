// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatReviewNotice: SatReviewNotice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatReviewNotice {
    /**
     * Qué oficio es, de los de su tipo.
     */
    @JsonProperty("step")
    private String step;

    /**
     * Su nombre («Solicitud de información»).
     */
    @JsonProperty("name")
    private String name;

    /**
     * El día en que se lo notificaron.
     */
    @JsonProperty("notified_on")
    private String notifiedOn;

    /**
     * El día en que surte efectos (el hábil siguiente).
     */
    @JsonProperty("effective_on")
    private String effectiveOn;

    /**
     * Los días hábiles que da, con la prórroga si la pidió; null si la ley no da plazo.
     */
    @JsonProperty("business_days")
    private Long businessDays;

    /**
     * Si pidió la prórroga o presentó el aviso.
     */
    @JsonProperty("extension")
    private Boolean extension;

    /**
     * Su último día para responder, o null.
     */
    @JsonProperty("due_on")
    private String dueOn;

    /**
     * Días hábiles que le quedan (0 es hoy, negativo ya pasó), o null.
     */
    @JsonProperty("business_days_left")
    private Long businessDaysLeft;

    /**
     * El día en que lo respondió, o null.
     */
    @JsonProperty("answered_on")
    private String answeredOn;

    /**
     * El artículo que da el plazo («art. 53 inciso c) CFF»).
     */
    @JsonProperty("law")
    private String law;

    /**
     * Hasta cuándo puede pedir un acuerdo conclusivo en Prodecon (art. 69-C CFF), cuando aplica.
     */
    @JsonProperty("conclusive_agreement_until")
    private String conclusiveAgreementUntil;

    /**
     * Qué oficio es, de los de su tipo.
     */
    public String getStep() {
        return step;
    }

    public SatReviewNotice setStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * Su nombre («Solicitud de información»).
     */
    public String getName() {
        return name;
    }

    public SatReviewNotice setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El día en que se lo notificaron.
     */
    public String getNotifiedOn() {
        return notifiedOn;
    }

    public SatReviewNotice setNotifiedOn(String notifiedOn) {
        this.notifiedOn = notifiedOn;
        return this;
    }

    /**
     * El día en que surte efectos (el hábil siguiente).
     */
    public String getEffectiveOn() {
        return effectiveOn;
    }

    public SatReviewNotice setEffectiveOn(String effectiveOn) {
        this.effectiveOn = effectiveOn;
        return this;
    }

    /**
     * Los días hábiles que da, con la prórroga si la pidió; null si la ley no da plazo.
     */
    public Long getBusinessDays() {
        return businessDays;
    }

    public SatReviewNotice setBusinessDays(Long businessDays) {
        this.businessDays = businessDays;
        return this;
    }

    @JsonIgnore
    public SatReviewNotice setBusinessDays(long businessDays) {
        return setBusinessDays(Long.valueOf(businessDays));
    }

    /**
     * Si pidió la prórroga o presentó el aviso.
     */
    public Boolean getExtension() {
        return extension;
    }

    public SatReviewNotice setExtension(Boolean extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Su último día para responder, o null.
     */
    public String getDueOn() {
        return dueOn;
    }

    public SatReviewNotice setDueOn(String dueOn) {
        this.dueOn = dueOn;
        return this;
    }

    /**
     * Días hábiles que le quedan (0 es hoy, negativo ya pasó), o null.
     */
    public Long getBusinessDaysLeft() {
        return businessDaysLeft;
    }

    public SatReviewNotice setBusinessDaysLeft(Long businessDaysLeft) {
        this.businessDaysLeft = businessDaysLeft;
        return this;
    }

    @JsonIgnore
    public SatReviewNotice setBusinessDaysLeft(long businessDaysLeft) {
        return setBusinessDaysLeft(Long.valueOf(businessDaysLeft));
    }

    /**
     * El día en que lo respondió, o null.
     */
    public String getAnsweredOn() {
        return answeredOn;
    }

    public SatReviewNotice setAnsweredOn(String answeredOn) {
        this.answeredOn = answeredOn;
        return this;
    }

    /**
     * El artículo que da el plazo («art. 53 inciso c) CFF»).
     */
    public String getLaw() {
        return law;
    }

    public SatReviewNotice setLaw(String law) {
        this.law = law;
        return this;
    }

    /**
     * Hasta cuándo puede pedir un acuerdo conclusivo en Prodecon (art. 69-C CFF), cuando aplica.
     */
    public String getConclusiveAgreementUntil() {
        return conclusiveAgreementUntil;
    }

    public SatReviewNotice setConclusiveAgreementUntil(String conclusiveAgreementUntil) {
        this.conclusiveAgreementUntil = conclusiveAgreementUntil;
        return this;
    }
}
