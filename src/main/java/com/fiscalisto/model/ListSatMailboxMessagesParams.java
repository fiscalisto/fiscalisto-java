// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatMailboxMessagesParams: los campos de «Listar avisos del buzón tributario».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatMailboxMessagesParams {
    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * true para solo los no leídos en el SAT, false para los leídos.
     */
    @JsonProperty("unread")
    private Boolean unread;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSatMailboxMessagesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListSatMailboxMessagesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSatMailboxMessagesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatMailboxMessagesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * true para solo los no leídos en el SAT, false para los leídos.
     */
    public Boolean getUnread() {
        return unread;
    }

    public ListSatMailboxMessagesParams setUnread(Boolean unread) {
        this.unread = unread;
        return this;
    }
}
