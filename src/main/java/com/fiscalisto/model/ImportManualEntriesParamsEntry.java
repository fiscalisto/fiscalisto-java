// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ImportManualEntriesParamsEntry: ImportManualEntriesParamsEntry.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImportManualEntriesParamsEntry {
    /**
     * La fecha de la póliza (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El tipo de póliza: journal (diario), income (ingresos) o expense (egresos).
     * <p>
     * Valores: journal, income, expense.
     */
    @JsonProperty("journal_type")
    private String journalType;

    /**
     * Su número en el otro sistema (por ejemplo Dr 15). Con la fecha, el tipo y el total, reconoce una póliza ya importada y la salta.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Su concepto.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Sus cargos y abonos: cada renglón uno u otro; los cargos suman lo mismo que los abonos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("lines")
    private List<ImportManualEntriesParamsEntryLine> lines;

    /**
     * La fecha de la póliza (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public ImportManualEntriesParamsEntry setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El tipo de póliza: journal (diario), income (ingresos) o expense (egresos).
     * <p>
     * Valores: journal, income, expense.
     */
    public String getJournalType() {
        return journalType;
    }

    public ImportManualEntriesParamsEntry setJournalType(String journalType) {
        this.journalType = journalType;
        return this;
    }

    /**
     * Su número en el otro sistema (por ejemplo Dr 15). Con la fecha, el tipo y el total, reconoce una póliza ya importada y la salta.
     */
    public String getNumber() {
        return number;
    }

    public ImportManualEntriesParamsEntry setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su concepto.
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public ImportManualEntriesParamsEntry setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Sus cargos y abonos: cada renglón uno u otro; los cargos suman lo mismo que los abonos.
     * <p>
     * Obligatorio.
     */
    public List<ImportManualEntriesParamsEntryLine> getLines() {
        return lines;
    }

    public ImportManualEntriesParamsEntry setLines(List<ImportManualEntriesParamsEntryLine> lines) {
        this.lines = lines;
        return this;
    }
}
