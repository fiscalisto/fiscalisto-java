// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * EntryTemplateLines: Los renglones de una póliza modelo para un total, listos para POST /v1/accounting/manual_entries. No se guarda nada.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryTemplateLines {
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
     * La póliza modelo (mjt_…).
     */
    @JsonProperty("entry_template")
    private String entryTemplate;

    /**
     * El total con que se calcularon.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * El concepto del modelo.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La clase de la póliza, la del modelo.
     * <p>
     * Valores: adjustment, accrual, reclassification, other.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * El tipo de póliza, el del modelo.
     * <p>
     * Valores: journal, income, expense.
     */
    @JsonProperty("journal_type")
    private String journalType;

    /**
     * Los renglones, como los recibe POST /v1/accounting/manual_entries.
     */
    @JsonProperty("lines")
    private List<EntryTemplateLinesLine> lines;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EntryTemplateLines setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public EntryTemplateLines setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * La póliza modelo (mjt_…).
     */
    public String getEntryTemplate() {
        return entryTemplate;
    }

    public EntryTemplateLines setEntryTemplate(String entryTemplate) {
        this.entryTemplate = entryTemplate;
        return this;
    }

    /**
     * El total con que se calcularon.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public EntryTemplateLines setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public EntryTemplateLines setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * El concepto del modelo.
     */
    public String getDescription() {
        return description;
    }

    public EntryTemplateLines setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * La clase de la póliza, la del modelo.
     * <p>
     * Valores: adjustment, accrual, reclassification, other.
     */
    public String getKind() {
        return kind;
    }

    public EntryTemplateLines setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * El tipo de póliza, el del modelo.
     * <p>
     * Valores: journal, income, expense.
     */
    public String getJournalType() {
        return journalType;
    }

    public EntryTemplateLines setJournalType(String journalType) {
        this.journalType = journalType;
        return this;
    }

    /**
     * Los renglones, como los recibe POST /v1/accounting/manual_entries.
     */
    public List<EntryTemplateLinesLine> getLines() {
        return lines;
    }

    public EntryTemplateLines setLines(List<EntryTemplateLinesLine> lines) {
        this.lines = lines;
        return this;
    }
}
