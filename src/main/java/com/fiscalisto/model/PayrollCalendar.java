// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * PayrollCalendar: El calendario de nómina del emisor, por fecha.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollCalendar {
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
     * Hoy en la Ciudad de México (YYYY-MM-DD).
     */
    @JsonProperty("today")
    private String today;

    /**
     * Eventos que quiere recibir, o ["*"] para todos (por omisión). La lista con cuándo llega cada uno: [Tipos de evento](https://fiscalisto.com/docs/api/webhooks#tipos-de-evento).
     */
    @JsonProperty("events")
    private List<PayrollCalendarEvent> events;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollCalendar setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollCalendar setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public PayrollCalendar setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public PayrollCalendar setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public PayrollCalendar setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Hoy en la Ciudad de México (YYYY-MM-DD).
     */
    public String getToday() {
        return today;
    }

    public PayrollCalendar setToday(String today) {
        this.today = today;
        return this;
    }

    /**
     * Eventos que quiere recibir, o ["*"] para todos (por omisión). La lista con cuándo llega cada uno: [Tipos de evento](https://fiscalisto.com/docs/api/webhooks#tipos-de-evento).
     */
    public List<PayrollCalendarEvent> getEvents() {
        return events;
    }

    public PayrollCalendar setEvents(List<PayrollCalendarEvent> events) {
        this.events = events;
        return this;
    }
}
