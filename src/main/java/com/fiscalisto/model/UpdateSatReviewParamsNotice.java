// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSatReviewParamsNotice: UpdateSatReviewParamsNotice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSatReviewParamsNotice {
    /**
     * Qué oficio es, de los de su tipo (en desk_audit: solicitud, observaciones o resolucion); por omisión, el primero, el que abre la revisión. Otro contesta con los de su tipo.
     */
    @JsonProperty("step")
    private String step;

    /**
     * El día en que se lo notificaron (en el Buzón, el día en que lo abrió o, si no lo abrió, el cuarto día hábil después del aviso). No puede ser futuro.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("notified_on")
    private String notifiedOn;

    /**
     * Los días hábiles que da el oficio, solo cuando no son los de la ley (una carta invitación con fecha, «otro» oficio).
     */
    @JsonProperty("business_days")
    private Long businessDays;

    /**
     * true si pidió la prórroga (o presentó el aviso) que la ley permite en ese oficio: suma sus días al plazo.
     */
    @JsonProperty("extension")
    private Boolean extension;

    /**
     * El día en que lo respondió; null mientras no.
     */
    @JsonProperty("answered_on")
    private String answeredOn;

    /**
     * Qué oficio es, de los de su tipo (en desk_audit: solicitud, observaciones o resolucion); por omisión, el primero, el que abre la revisión. Otro contesta con los de su tipo.
     */
    public String getStep() {
        return step;
    }

    public UpdateSatReviewParamsNotice setStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * El día en que se lo notificaron (en el Buzón, el día en que lo abrió o, si no lo abrió, el cuarto día hábil después del aviso). No puede ser futuro.
     * <p>
     * Obligatorio.
     */
    public String getNotifiedOn() {
        return notifiedOn;
    }

    public UpdateSatReviewParamsNotice setNotifiedOn(String notifiedOn) {
        this.notifiedOn = notifiedOn;
        return this;
    }

    /**
     * Los días hábiles que da el oficio, solo cuando no son los de la ley (una carta invitación con fecha, «otro» oficio).
     */
    public Long getBusinessDays() {
        return businessDays;
    }

    public UpdateSatReviewParamsNotice setBusinessDays(Long businessDays) {
        this.businessDays = businessDays;
        return this;
    }

    @JsonIgnore
    public UpdateSatReviewParamsNotice setBusinessDays(long businessDays) {
        return setBusinessDays(Long.valueOf(businessDays));
    }

    /**
     * true si pidió la prórroga (o presentó el aviso) que la ley permite en ese oficio: suma sus días al plazo.
     */
    public Boolean getExtension() {
        return extension;
    }

    public UpdateSatReviewParamsNotice setExtension(Boolean extension) {
        this.extension = extension;
        return this;
    }

    /**
     * El día en que lo respondió; null mientras no.
     */
    public String getAnsweredOn() {
        return answeredOn;
    }

    public UpdateSatReviewParamsNotice setAnsweredOn(String answeredOn) {
        this.answeredOn = answeredOn;
        return this;
    }
}
