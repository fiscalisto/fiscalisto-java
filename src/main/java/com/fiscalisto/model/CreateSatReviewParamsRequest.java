// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateSatReviewParamsRequest: CreateSatReviewParamsRequest.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSatReviewParamsRequest {
    /**
     * Qué pide (vea requests en la guía).
     * <p>
     * Valores: working_paper, tax_discrepancy, issued_invoices, received_invoices, retentions, tax_returns, electronic_accounting, materiality, bank_statements, contracts, inventory, assets_and_staff, articles_and_power, written_answer, other.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Cómo lo dice el oficio, si quiere sus palabras; con other, obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * true cuando ya lo tiene listo.
     */
    @JsonProperty("done")
    private Boolean done;

    /**
     * Una nota suya.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Qué pide (vea requests en la guía).
     * <p>
     * Valores: working_paper, tax_discrepancy, issued_invoices, received_invoices, retentions, tax_returns, electronic_accounting, materiality, bank_statements, contracts, inventory, assets_and_staff, articles_and_power, written_answer, other.
     * <p>
     * Obligatorio.
     */
    public String getKey() {
        return key;
    }

    public CreateSatReviewParamsRequest setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Cómo lo dice el oficio, si quiere sus palabras; con other, obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateSatReviewParamsRequest setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * true cuando ya lo tiene listo.
     */
    public Boolean getDone() {
        return done;
    }

    public CreateSatReviewParamsRequest setDone(Boolean done) {
        this.done = done;
        return this;
    }

    /**
     * Una nota suya.
     */
    public String getNote() {
        return note;
    }

    public CreateSatReviewParamsRequest setNote(String note) {
        this.note = note;
        return this;
    }
}
