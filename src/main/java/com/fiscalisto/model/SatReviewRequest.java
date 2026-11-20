// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatReviewRequest: SatReviewRequest.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatReviewRequest {
    /**
     * Qué pide.
     * <p>
     * Valores: working_paper, tax_discrepancy, issued_invoices, received_invoices, retentions, tax_returns, electronic_accounting, materiality, bank_statements, contracts, inventory, assets_and_staff, articles_and_power, written_answer, other.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Cómo se llama (o como lo dice el oficio).
     */
    @JsonProperty("name")
    private String name;

    /**
     * fiscalisto: lo arma la respuesta con sus datos; you: se sube (contratos, escrito…).
     * <p>
     * Valores: fiscalisto, you.
     */
    @JsonProperty("made_by")
    private String madeBy;

    /**
     * Si lo marcó como listo.
     */
    @JsonProperty("done")
    private Boolean done;

    /**
     * Su nota, o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Lo que Fiscalisto tiene para eso en el periodo («412 CFDI»), o null.
     */
    @JsonProperty("have")
    private String have;

    /**
     * Cuántos documentos subió para eso en la app.
     */
    @JsonProperty("documents")
    private Long documents;

    /**
     * Listo: lo marcó, Fiscalisto lo arma con lo que tiene, o subió al menos un documento.
     */
    @JsonProperty("ready")
    private Boolean ready;

    /**
     * Qué pide.
     * <p>
     * Valores: working_paper, tax_discrepancy, issued_invoices, received_invoices, retentions, tax_returns, electronic_accounting, materiality, bank_statements, contracts, inventory, assets_and_staff, articles_and_power, written_answer, other.
     */
    public String getKey() {
        return key;
    }

    public SatReviewRequest setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Cómo se llama (o como lo dice el oficio).
     */
    public String getName() {
        return name;
    }

    public SatReviewRequest setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * fiscalisto: lo arma la respuesta con sus datos; you: se sube (contratos, escrito…).
     * <p>
     * Valores: fiscalisto, you.
     */
    public String getMadeBy() {
        return madeBy;
    }

    public SatReviewRequest setMadeBy(String madeBy) {
        this.madeBy = madeBy;
        return this;
    }

    /**
     * Si lo marcó como listo.
     */
    public Boolean getDone() {
        return done;
    }

    public SatReviewRequest setDone(Boolean done) {
        this.done = done;
        return this;
    }

    /**
     * Su nota, o null.
     */
    public String getNote() {
        return note;
    }

    public SatReviewRequest setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Lo que Fiscalisto tiene para eso en el periodo («412 CFDI»), o null.
     */
    public String getHave() {
        return have;
    }

    public SatReviewRequest setHave(String have) {
        this.have = have;
        return this;
    }

    /**
     * Cuántos documentos subió para eso en la app.
     */
    public Long getDocuments() {
        return documents;
    }

    public SatReviewRequest setDocuments(Long documents) {
        this.documents = documents;
        return this;
    }

    @JsonIgnore
    public SatReviewRequest setDocuments(long documents) {
        return setDocuments(Long.valueOf(documents));
    }

    /**
     * Listo: lo marcó, Fiscalisto lo arma con lo que tiene, o subió al menos un documento.
     */
    public Boolean getReady() {
        return ready;
    }

    public SatReviewRequest setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }
}
