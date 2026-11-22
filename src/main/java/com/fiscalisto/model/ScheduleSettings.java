// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduleSettings: Los horarios de la empresa (Ajustes › Horarios): cuánto vale una cotización nueva y a qué hora vence, y a qué hora corren las reglas «Cada mañana», los hallazgos diarios y el resumen semanal, en su zona horaria.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleSettings {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor (iss_…) con que se leyeron; valen para toda la empresa.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * La zona horaria de la empresa (Ajustes › Datos fiscales), en la que van todas las horas.
     */
    @JsonProperty("time_zone")
    private String timeZone;

    /**
     * Días que vale una cotización nueva cuando el cliente y su grupo no tienen los suyos.
     */
    @JsonProperty("quote_valid_days")
    private Long quoteValidDays;

    /**
     * A qué hora (0 a 23) vence una cotización su último día; null: al terminar ese día.
     */
    @JsonProperty("quote_expiry_hour")
    private Long quoteExpiryHour;

    /**
     * A qué hora (0 a 23) corren las reglas «Cada mañana».
     */
    @JsonProperty("rules_hour")
    private Long rulesHour;

    /**
     * A qué hora (0 a 23) corre la revisión diaria de hallazgos.
     */
    @JsonProperty("findings_hour")
    private Long findingsHour;

    /**
     * A qué hora (0 a 23) del lunes sale el resumen semanal.
     */
    @JsonProperty("digest_hour")
    private Long digestHour;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ScheduleSettings setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…) con que se leyeron; valen para toda la empresa.
     */
    public String getIssuer() {
        return issuer;
    }

    public ScheduleSettings setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ScheduleSettings setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * La zona horaria de la empresa (Ajustes › Datos fiscales), en la que van todas las horas.
     */
    public String getTimeZone() {
        return timeZone;
    }

    public ScheduleSettings setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Días que vale una cotización nueva cuando el cliente y su grupo no tienen los suyos.
     */
    public Long getQuoteValidDays() {
        return quoteValidDays;
    }

    public ScheduleSettings setQuoteValidDays(Long quoteValidDays) {
        this.quoteValidDays = quoteValidDays;
        return this;
    }

    @JsonIgnore
    public ScheduleSettings setQuoteValidDays(long quoteValidDays) {
        return setQuoteValidDays(Long.valueOf(quoteValidDays));
    }

    /**
     * A qué hora (0 a 23) vence una cotización su último día; null: al terminar ese día.
     */
    public Long getQuoteExpiryHour() {
        return quoteExpiryHour;
    }

    public ScheduleSettings setQuoteExpiryHour(Long quoteExpiryHour) {
        this.quoteExpiryHour = quoteExpiryHour;
        return this;
    }

    @JsonIgnore
    public ScheduleSettings setQuoteExpiryHour(long quoteExpiryHour) {
        return setQuoteExpiryHour(Long.valueOf(quoteExpiryHour));
    }

    /**
     * A qué hora (0 a 23) corren las reglas «Cada mañana».
     */
    public Long getRulesHour() {
        return rulesHour;
    }

    public ScheduleSettings setRulesHour(Long rulesHour) {
        this.rulesHour = rulesHour;
        return this;
    }

    @JsonIgnore
    public ScheduleSettings setRulesHour(long rulesHour) {
        return setRulesHour(Long.valueOf(rulesHour));
    }

    /**
     * A qué hora (0 a 23) corre la revisión diaria de hallazgos.
     */
    public Long getFindingsHour() {
        return findingsHour;
    }

    public ScheduleSettings setFindingsHour(Long findingsHour) {
        this.findingsHour = findingsHour;
        return this;
    }

    @JsonIgnore
    public ScheduleSettings setFindingsHour(long findingsHour) {
        return setFindingsHour(Long.valueOf(findingsHour));
    }

    /**
     * A qué hora (0 a 23) del lunes sale el resumen semanal.
     */
    public Long getDigestHour() {
        return digestHour;
    }

    public ScheduleSettings setDigestHour(Long digestHour) {
        this.digestHour = digestHour;
        return this;
    }

    @JsonIgnore
    public ScheduleSettings setDigestHour(long digestHour) {
        return setDigestHour(Long.valueOf(digestHour));
    }
}
