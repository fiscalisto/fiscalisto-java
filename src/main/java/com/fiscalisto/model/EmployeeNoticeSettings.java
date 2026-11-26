// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

/**
 * EmployeeNoticeSettings: Qué avisos les llegan a los empleados del emisor en Mi nómina (al celular o a su correo). Cada empleado puede apagar los suyos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeNoticeSettings {
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * Avisar cada recibo nuevo en cuanto se timbra.
     */
    @JsonProperty("receipt")
    private Boolean receipt;

    /**
     * Avisar cuando un recibo suyo se cancela ante el SAT.
     */
    @JsonProperty("receipt_canceled")
    private Boolean receiptCanceled;

    /**
     * Avisar la respuesta a sus vacaciones, con su nota.
     */
    @JsonProperty("vacation")
    private Boolean vacation;

    /**
     * Avisar cuando se abre una encuesta NOM-035 o de clima para él.
     */
    @JsonProperty("survey")
    private Boolean survey;

    /**
     * Avisar cuando se abre un ciclo de Desempeño con evaluaciones que le toca hacer.
     */
    @JsonProperty("review")
    private Boolean review;

    /**
     * Los días después de timbrarse en que se le recuerda, una vez, firmar un recibo sin firmar; 0: nunca.
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
     * Cuándo se cambiaron; null, nunca (son los de omisión).
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EmployeeNoticeSettings setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public EmployeeNoticeSettings setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public EmployeeNoticeSettings setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public EmployeeNoticeSettings setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public EmployeeNoticeSettings setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Avisar cada recibo nuevo en cuanto se timbra.
     */
    public Boolean getReceipt() {
        return receipt;
    }

    public EmployeeNoticeSettings setReceipt(Boolean receipt) {
        this.receipt = receipt;
        return this;
    }

    /**
     * Avisar cuando un recibo suyo se cancela ante el SAT.
     */
    public Boolean getReceiptCanceled() {
        return receiptCanceled;
    }

    public EmployeeNoticeSettings setReceiptCanceled(Boolean receiptCanceled) {
        this.receiptCanceled = receiptCanceled;
        return this;
    }

    /**
     * Avisar la respuesta a sus vacaciones, con su nota.
     */
    public Boolean getVacation() {
        return vacation;
    }

    public EmployeeNoticeSettings setVacation(Boolean vacation) {
        this.vacation = vacation;
        return this;
    }

    /**
     * Avisar cuando se abre una encuesta NOM-035 o de clima para él.
     */
    public Boolean getSurvey() {
        return survey;
    }

    public EmployeeNoticeSettings setSurvey(Boolean survey) {
        this.survey = survey;
        return this;
    }

    /**
     * Avisar cuando se abre un ciclo de Desempeño con evaluaciones que le toca hacer.
     */
    public Boolean getReview() {
        return review;
    }

    public EmployeeNoticeSettings setReview(Boolean review) {
        this.review = review;
        return this;
    }

    /**
     * Los días después de timbrarse en que se le recuerda, una vez, firmar un recibo sin firmar; 0: nunca.
     */
    public Long getSignReminderDays() {
        return signReminderDays;
    }

    public EmployeeNoticeSettings setSignReminderDays(Long signReminderDays) {
        this.signReminderDays = signReminderDays;
        return this;
    }

    @JsonIgnore
    public EmployeeNoticeSettings setSignReminderDays(long signReminderDays) {
        return setSignReminderDays(Long.valueOf(signReminderDays));
    }

    /**
     * A quien no activó los avisos en su celular le llega el mismo aviso a su correo.
     */
    public Boolean getEmailFallback() {
        return emailFallback;
    }

    public EmployeeNoticeSettings setEmailFallback(Boolean emailFallback) {
        this.emailFallback = emailFallback;
        return this;
    }

    /**
     * Los avisos de entre las 21:00 y las 7:00 (hora del centro) llegan a las 7:00.
     */
    public Boolean getQuietHours() {
        return quietHours;
    }

    public EmployeeNoticeSettings setQuietHours(Boolean quietHours) {
        this.quietHours = quietHours;
        return this;
    }

    /**
     * Cuándo se cambiaron; null, nunca (son los de omisión).
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public EmployeeNoticeSettings setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
