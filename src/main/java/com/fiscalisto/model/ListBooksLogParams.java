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
     * Solo los cambios de una cosa: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset, invoice_account (la cuenta de una factura) o automatic_journal_entry (una póliza automática editada).
     * <p>
     * Valores: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset, invoice_account, automatic_journal_entry, prepaid_expense.
     */
    @JsonProperty("subject")
    private String subject;

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
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gte]")
    private String createdGte;

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gt]")
    private String createdGt;

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lte]")
    private String createdLte;

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lt]")
    private String createdLt;

    /**
     * Igual que created[gte]; se conserva por compatibilidad.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Igual que created[lte]; se conserva por compatibilidad.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Solo los cambios de una cosa: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset, invoice_account (la cuenta de una factura) o automatic_journal_entry (una póliza automática editada).
     * <p>
     * Valores: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset, invoice_account, automatic_journal_entry, prepaid_expense.
     */
    public String getSubject() {
        return subject;
    }

    public ListBooksLogParams setSubject(String subject) {
        this.subject = subject;
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
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListBooksLogParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListBooksLogParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListBooksLogParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListBooksLogParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListBooksLogParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }

    /**
     * Igual que created[gte]; se conserva por compatibilidad.
     */
    public String getFrom() {
        return from;
    }

    public ListBooksLogParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Igual que created[lte]; se conserva por compatibilidad.
     */
    public String getTo() {
        return to;
    }

    public ListBooksLogParams setTo(String to) {
        this.to = to;
        return this;
    }
}
