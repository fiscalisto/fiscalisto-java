// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateScheduleSettingsParams: los campos de «Cambiar los horarios».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateScheduleSettingsParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Días que vale una cotización nueva, de 1 a 366. Un cliente o su grupo pueden tener los suyos (quote_valid_days en /v1/customers y /v1/customer_groups).
     */
    @JsonProperty("quote_valid_days")
    private Long quoteValidDays;

    /**
     * A qué hora (0 a 23) vence una cotización su último día; null: al terminar ese día, a medianoche.
     */
    @JsonProperty("quote_expiry_hour")
    private Long quoteExpiryHour;

    /**
     * A qué hora (0 a 23) corren las reglas «Cada mañana» (triggers invoice.daily y purchase_order.daily).
     */
    @JsonProperty("rules_hour")
    private Long rulesHour;

    /**
     * A qué hora (0 a 23) corre la revisión diaria de hallazgos.
     */
    @JsonProperty("findings_hour")
    private Long findingsHour;

    /**
     * A qué hora (0 a 23) del lunes sale el resumen semanal por correo.
     */
    @JsonProperty("digest_hour")
    private Long digestHour;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateScheduleSettingsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Días que vale una cotización nueva, de 1 a 366. Un cliente o su grupo pueden tener los suyos (quote_valid_days en /v1/customers y /v1/customer_groups).
     */
    public Long getQuoteValidDays() {
        return quoteValidDays;
    }

    public UpdateScheduleSettingsParams setQuoteValidDays(Long quoteValidDays) {
        this.quoteValidDays = quoteValidDays;
        return this;
    }

    @JsonIgnore
    public UpdateScheduleSettingsParams setQuoteValidDays(long quoteValidDays) {
        return setQuoteValidDays(Long.valueOf(quoteValidDays));
    }

    /**
     * A qué hora (0 a 23) vence una cotización su último día; null: al terminar ese día, a medianoche.
     */
    public Long getQuoteExpiryHour() {
        return quoteExpiryHour;
    }

    public UpdateScheduleSettingsParams setQuoteExpiryHour(Long quoteExpiryHour) {
        this.quoteExpiryHour = quoteExpiryHour;
        return this;
    }

    @JsonIgnore
    public UpdateScheduleSettingsParams setQuoteExpiryHour(long quoteExpiryHour) {
        return setQuoteExpiryHour(Long.valueOf(quoteExpiryHour));
    }

    /**
     * A qué hora (0 a 23) corren las reglas «Cada mañana» (triggers invoice.daily y purchase_order.daily).
     */
    public Long getRulesHour() {
        return rulesHour;
    }

    public UpdateScheduleSettingsParams setRulesHour(Long rulesHour) {
        this.rulesHour = rulesHour;
        return this;
    }

    @JsonIgnore
    public UpdateScheduleSettingsParams setRulesHour(long rulesHour) {
        return setRulesHour(Long.valueOf(rulesHour));
    }

    /**
     * A qué hora (0 a 23) corre la revisión diaria de hallazgos.
     */
    public Long getFindingsHour() {
        return findingsHour;
    }

    public UpdateScheduleSettingsParams setFindingsHour(Long findingsHour) {
        this.findingsHour = findingsHour;
        return this;
    }

    @JsonIgnore
    public UpdateScheduleSettingsParams setFindingsHour(long findingsHour) {
        return setFindingsHour(Long.valueOf(findingsHour));
    }

    /**
     * A qué hora (0 a 23) del lunes sale el resumen semanal por correo.
     */
    public Long getDigestHour() {
        return digestHour;
    }

    public UpdateScheduleSettingsParams setDigestHour(Long digestHour) {
        this.digestHour = digestHour;
        return this;
    }

    @JsonIgnore
    public UpdateScheduleSettingsParams setDigestHour(long digestHour) {
        return setDigestHour(Long.valueOf(digestHour));
    }
}
