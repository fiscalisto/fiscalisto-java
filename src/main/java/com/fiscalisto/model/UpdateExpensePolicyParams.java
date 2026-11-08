// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * UpdateExpensePolicyParams: los campos de «Cambiar la política».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateExpensePolicyParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Topes por categoría. Una categoría con null deja de tener tope; las que no manda no cambian. Un gasto que pase un tope no se rechaza: se marca para quien aprueba.
     */
    @JsonProperty("limits")
    private Map<String, Object> limits;

    /**
     * Hasta cuánto se acepta un gasto sin factura; 0: todos la piden.
     */
    @JsonProperty("ticket_limit")
    private BigDecimal ticketLimit;

    /**
     * Días después del regreso para comprobar.
     */
    @JsonProperty("due_days")
    private Long dueDays;

    /**
     * Pedir una nota en cada gasto que pase un tope.
     */
    @JsonProperty("note_over_limit")
    private Boolean noteOverLimit;

    /**
     * Avisar por correo a quien aprueba cuando le envían una comprobación.
     */
    @JsonProperty("notify_approvers")
    private Boolean notifyApprovers;

    /**
     * Avisar a la persona cuando se aprueba, se devuelve o se le paga.
     */
    @JsonProperty("notify_people")
    private Boolean notifyPeople;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateExpensePolicyParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Topes por categoría. Una categoría con null deja de tener tope; las que no manda no cambian. Un gasto que pase un tope no se rechaza: se marca para quien aprueba.
     */
    public Map<String, Object> getLimits() {
        return limits;
    }

    public UpdateExpensePolicyParams setLimits(Map<String, Object> limits) {
        this.limits = limits;
        return this;
    }

    /**
     * Hasta cuánto se acepta un gasto sin factura; 0: todos la piden.
     */
    public BigDecimal getTicketLimit() {
        return ticketLimit;
    }

    public UpdateExpensePolicyParams setTicketLimit(BigDecimal ticketLimit) {
        this.ticketLimit = ticketLimit;
        return this;
    }

    @JsonIgnore
    public UpdateExpensePolicyParams setTicketLimit(double ticketLimit) {
        return setTicketLimit(BigDecimal.valueOf(ticketLimit));
    }

    /**
     * Días después del regreso para comprobar.
     */
    public Long getDueDays() {
        return dueDays;
    }

    public UpdateExpensePolicyParams setDueDays(Long dueDays) {
        this.dueDays = dueDays;
        return this;
    }

    @JsonIgnore
    public UpdateExpensePolicyParams setDueDays(long dueDays) {
        return setDueDays(Long.valueOf(dueDays));
    }

    /**
     * Pedir una nota en cada gasto que pase un tope.
     */
    public Boolean getNoteOverLimit() {
        return noteOverLimit;
    }

    public UpdateExpensePolicyParams setNoteOverLimit(Boolean noteOverLimit) {
        this.noteOverLimit = noteOverLimit;
        return this;
    }

    /**
     * Avisar por correo a quien aprueba cuando le envían una comprobación.
     */
    public Boolean getNotifyApprovers() {
        return notifyApprovers;
    }

    public UpdateExpensePolicyParams setNotifyApprovers(Boolean notifyApprovers) {
        this.notifyApprovers = notifyApprovers;
        return this;
    }

    /**
     * Avisar a la persona cuando se aprueba, se devuelve o se le paga.
     */
    public Boolean getNotifyPeople() {
        return notifyPeople;
    }

    public UpdateExpensePolicyParams setNotifyPeople(Boolean notifyPeople) {
        this.notifyPeople = notifyPeople;
        return this;
    }
}
