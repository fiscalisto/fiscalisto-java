// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * ExpensePolicy: La política de viáticos y gastos del emisor: topes por categoría, hasta cuánto sin factura y en cuántos días se comprueba.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpensePolicy {
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Topes por categoría (hospedaje, alimentos…): las que no están no tienen tope.
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
     * true si pide una nota en cada gasto que pase un tope.
     */
    @JsonProperty("note_over_limit")
    private Boolean noteOverLimit;

    /**
     * true si avisa por correo a quien aprueba.
     */
    @JsonProperty("notify_approvers")
    private Boolean notifyApprovers;

    /**
     * true si avisa a la persona cuando se aprueba, se devuelve o se le paga.
     */
    @JsonProperty("notify_people")
    private Boolean notifyPeople;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ExpensePolicy setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ExpensePolicy setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ExpensePolicy setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Topes por categoría (hospedaje, alimentos…): las que no están no tienen tope.
     */
    public Map<String, Object> getLimits() {
        return limits;
    }

    public ExpensePolicy setLimits(Map<String, Object> limits) {
        this.limits = limits;
        return this;
    }

    /**
     * Hasta cuánto se acepta un gasto sin factura; 0: todos la piden.
     */
    public BigDecimal getTicketLimit() {
        return ticketLimit;
    }

    public ExpensePolicy setTicketLimit(BigDecimal ticketLimit) {
        this.ticketLimit = ticketLimit;
        return this;
    }

    @JsonIgnore
    public ExpensePolicy setTicketLimit(double ticketLimit) {
        return setTicketLimit(BigDecimal.valueOf(ticketLimit));
    }

    /**
     * Días después del regreso para comprobar.
     */
    public Long getDueDays() {
        return dueDays;
    }

    public ExpensePolicy setDueDays(Long dueDays) {
        this.dueDays = dueDays;
        return this;
    }

    @JsonIgnore
    public ExpensePolicy setDueDays(long dueDays) {
        return setDueDays(Long.valueOf(dueDays));
    }

    /**
     * true si pide una nota en cada gasto que pase un tope.
     */
    public Boolean getNoteOverLimit() {
        return noteOverLimit;
    }

    public ExpensePolicy setNoteOverLimit(Boolean noteOverLimit) {
        this.noteOverLimit = noteOverLimit;
        return this;
    }

    /**
     * true si avisa por correo a quien aprueba.
     */
    public Boolean getNotifyApprovers() {
        return notifyApprovers;
    }

    public ExpensePolicy setNotifyApprovers(Boolean notifyApprovers) {
        this.notifyApprovers = notifyApprovers;
        return this;
    }

    /**
     * true si avisa a la persona cuando se aprueba, se devuelve o se le paga.
     */
    public Boolean getNotifyPeople() {
        return notifyPeople;
    }

    public ExpensePolicy setNotifyPeople(Boolean notifyPeople) {
        this.notifyPeople = notifyPeople;
        return this;
    }
}
