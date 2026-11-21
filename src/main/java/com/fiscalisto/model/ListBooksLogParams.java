// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListBooksLogParams: los campos de «Listar la bitácora de la contabilidad».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListBooksLogParams {
    /**
     * Solo los cambios de una cosa: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset o invoice_account (la cuenta de una factura).
     * <p>
     * Valores: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset, invoice_account.
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * Desde este día (AAAA-MM-DD, hora de la Ciudad de México).
     */
    @JsonProperty("from")
    private String from;

    /**
     * Hasta este día, incluido.
     */
    @JsonProperty("to")
    private String to;

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
     * Solo los cambios de una cosa: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset o invoice_account (la cuenta de una factura).
     * <p>
     * Valores: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset, invoice_account.
     */
    public String getSubject() {
        return subject;
    }

    public ListBooksLogParams setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Desde este día (AAAA-MM-DD, hora de la Ciudad de México).
     */
    public String getFrom() {
        return from;
    }

    public ListBooksLogParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Hasta este día, incluido.
     */
    public String getTo() {
        return to;
    }

    public ListBooksLogParams setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListBooksLogParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListBooksLogParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListBooksLogParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListBooksLogParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
