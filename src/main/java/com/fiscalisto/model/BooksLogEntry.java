// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * BooksLogEntry: Un cambio en la contabilidad (bitácora): una póliza, los saldos iniciales, el catálogo, el cierre de un mes, una eliminación, una póliza modelo o la baja de un activo; quién lo hizo y cómo estaba antes y después. No se edita ni se borra.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BooksLogEntry {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cuándo se hizo el cambio.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Qué cambió: una póliza a mano (manual_journal_entry), los saldos iniciales, una cuenta, el catálogo completo (una importación o una renumeración), el cierre del mes (period_close), una eliminación de consolidación, una póliza modelo o la baja de un activo fijo.
     * <p>
     * Valores: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset, invoice_account, automatic_journal_entry.
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * El id de lo que cambió cuando tiene uno en la API (mje_, cel_, mjt_); null en los demás.
     */
    @JsonProperty("subject_id")
    private String subjectId;

    /**
     * created, updated, deleted, restored (deshecho), imported, closed (se cerró el mes) o reopened (se reabrió).
     * <p>
     * Valores: created, updated, deleted, restored, imported, closed, reopened.
     */
    @JsonProperty("action")
    private String action;

    /**
     * Lo que cambió, para leerlo: «Póliza de diario del 2026-03-15: Préstamo».
     */
    @JsonProperty("description")
    private String description;

    /**
     * Quién: un usuario del panel (user, con su nombre), una llave de la API (api_key, con su nombre en label) o un asistente por MCP (assistant: su nombre en label y el del usuario en name).
     */
    @JsonProperty("actor")
    private BooksLogEntryActor actor;

    /**
     * Cómo estaba (con los nombres de campo en español de la bitácora); null cuando no existía.
     */
    @JsonProperty("before")
    private JsonNode before;

    /**
     * Cómo quedó; null cuando se borró.
     */
    @JsonProperty("after")
    private JsonNode after;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public BooksLogEntry setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public BooksLogEntry setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public BooksLogEntry setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public BooksLogEntry setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cuándo se hizo el cambio.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public BooksLogEntry setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Qué cambió: una póliza a mano (manual_journal_entry), los saldos iniciales, una cuenta, el catálogo completo (una importación o una renumeración), el cierre del mes (period_close), una eliminación de consolidación, una póliza modelo o la baja de un activo fijo.
     * <p>
     * Valores: manual_journal_entry, opening_balances, account, chart_of_accounts, period_close, consolidation_elimination, entry_template, fixed_asset, invoice_account, automatic_journal_entry.
     */
    public String getSubject() {
        return subject;
    }

    public BooksLogEntry setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * El id de lo que cambió cuando tiene uno en la API (mje_, cel_, mjt_); null en los demás.
     */
    public String getSubjectId() {
        return subjectId;
    }

    public BooksLogEntry setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    /**
     * created, updated, deleted, restored (deshecho), imported, closed (se cerró el mes) o reopened (se reabrió).
     * <p>
     * Valores: created, updated, deleted, restored, imported, closed, reopened.
     */
    public String getAction() {
        return action;
    }

    public BooksLogEntry setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Lo que cambió, para leerlo: «Póliza de diario del 2026-03-15: Préstamo».
     */
    public String getDescription() {
        return description;
    }

    public BooksLogEntry setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Quién: un usuario del panel (user, con su nombre), una llave de la API (api_key, con su nombre en label) o un asistente por MCP (assistant: su nombre en label y el del usuario en name).
     */
    public BooksLogEntryActor getActor() {
        return actor;
    }

    public BooksLogEntry setActor(BooksLogEntryActor actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Cómo estaba (con los nombres de campo en español de la bitácora); null cuando no existía.
     */
    public JsonNode getBefore() {
        return before;
    }

    public BooksLogEntry setBefore(JsonNode before) {
        this.before = before;
        return this;
    }

    /**
     * Cómo quedó; null cuando se borró.
     */
    public JsonNode getAfter() {
        return after;
    }

    public BooksLogEntry setAfter(JsonNode after) {
        this.after = after;
        return this;
    }
}
