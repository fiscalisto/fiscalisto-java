// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateEmployeeNoticeSettingsParams: los campos de «Cambiar los avisos a empleados».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateEmployeeNoticeSettingsParams {
    /**
     * El emisor (iss_…); por omisión, el único de la cuenta.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * «Ya está su recibo de nómina» en cuanto se timbra.
     */
    @JsonProperty("receipt")
    private Boolean receipt;

    /**
     * Cuando un recibo suyo se cancela ante el SAT.
     */
    @JsonProperty("receipt_canceled")
    private Boolean receiptCanceled;

    /**
     * Al aprobar o rechazar los días que pidió, con su nota.
     */
    @JsonProperty("vacation")
    private Boolean vacation;

    /**
     * Cuando se abre una encuesta NOM-035 o de clima para él (POST /v1/climate_surveys/{id}/open).
     */
    @JsonProperty("survey")
    private Boolean survey;

    /**
     * Cuando se abre un ciclo de Desempeño con evaluaciones que le toca hacer (POST /v1/review_cycles/{id}/open).
     */
    @JsonProperty("review")
    private Boolean review;

    /**
     * Si un recibo sigue sin firmar de recibido estos días después de timbrarse, se le recuerda una vez. 0: nunca.
     */
    @JsonProperty("sign_reminder_days")
    private Long signReminderDays;

    /**
     * A quien no activó los avisos en su celular le llega el mismo aviso a su correo.
     */
    @JsonProperty("email_fallback")
    private Boolean emailFallback;

    /**
     * Los avisos de entre las 21:00 y las 7:00 (hora del centro) llegan a las 7:00.
     */
    @JsonProperty("quiet_hours")
    private Boolean quietHours;

    /**
     * El emisor (iss_…); por omisión, el único de la cuenta.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateEmployeeNoticeSettingsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * «Ya está su recibo de nómina» en cuanto se timbra.
     */
    public Boolean getReceipt() {
        return receipt;
    }

    public UpdateEmployeeNoticeSettingsParams setReceipt(Boolean receipt) {
        this.receipt = receipt;
        return this;
    }

    /**
     * Cuando un recibo suyo se cancela ante el SAT.
     */
    public Boolean getReceiptCanceled() {
        return receiptCanceled;
    }

    public UpdateEmployeeNoticeSettingsParams setReceiptCanceled(Boolean receiptCanceled) {
        this.receiptCanceled = receiptCanceled;
        return this;
    }

    /**
     * Al aprobar o rechazar los días que pidió, con su nota.
     */
    public Boolean getVacation() {
        return vacation;
    }

    public UpdateEmployeeNoticeSettingsParams setVacation(Boolean vacation) {
        this.vacation = vacation;
        return this;
    }

    /**
     * Cuando se abre una encuesta NOM-035 o de clima para él (POST /v1/climate_surveys/{id}/open).
     */
    public Boolean getSurvey() {
        return survey;
    }

    public UpdateEmployeeNoticeSettingsParams setSurvey(Boolean survey) {
        this.survey = survey;
        return this;
    }

    /**
     * Cuando se abre un ciclo de Desempeño con evaluaciones que le toca hacer (POST /v1/review_cycles/{id}/open).
     */
    public Boolean getReview() {
        return review;
    }

    public UpdateEmployeeNoticeSettingsParams setReview(Boolean review) {
        this.review = review;
        return this;
    }

    /**
     * Si un recibo sigue sin firmar de recibido estos días después de timbrarse, se le recuerda una vez. 0: nunca.
     */
    public Long getSignReminderDays() {
        return signReminderDays;
    }

    public UpdateEmployeeNoticeSettingsParams setSignReminderDays(Long signReminderDays) {
        this.signReminderDays = signReminderDays;
        return this;
    }

    @JsonIgnore
    public UpdateEmployeeNoticeSettingsParams setSignReminderDays(long signReminderDays) {
        return setSignReminderDays(Long.valueOf(signReminderDays));
    }

    /**
     * A quien no activó los avisos en su celular le llega el mismo aviso a su correo.
     */
    public Boolean getEmailFallback() {
        return emailFallback;
    }

    public UpdateEmployeeNoticeSettingsParams setEmailFallback(Boolean emailFallback) {
        this.emailFallback = emailFallback;
        return this;
    }

    /**
     * Los avisos de entre las 21:00 y las 7:00 (hora del centro) llegan a las 7:00.
     */
    public Boolean getQuietHours() {
        return quietHours;
    }

    public UpdateEmployeeNoticeSettingsParams setQuietHours(Boolean quietHours) {
        this.quietHours = quietHours;
        return this;
    }
}
