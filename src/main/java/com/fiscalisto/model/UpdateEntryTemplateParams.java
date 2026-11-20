// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateEntryTemplateParams: los campos de «Cambiar una póliza modelo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateEntryTemplateParams {
    /**
     * El nombre del modelo, único en el emisor: «Compra con IVA al 16%».
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El concepto de las pólizas que se hacen con él.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * adjustment (ajuste), accrual (provisión), reclassification (reclasificación) u other.
     * <p>
     * Valores: adjustment, accrual, reclassification, other.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * El tipo de póliza: journal (diario), income (ingresos) o expense (egresos).
     * <p>
     * Valores: journal, income, expense.
     */
    @JsonProperty("journal_type")
    private String journalType;

    /**
     * Sus renglones: la cuenta, el lado y el porcentaje del total o el importe fijo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("lines")
    private List<UpdateEntryTemplateParamsLine> lines;

    /**
     * El nombre del modelo, único en el emisor: «Compra con IVA al 16%».
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public UpdateEntryTemplateParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El concepto de las pólizas que se hacen con él.
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public UpdateEntryTemplateParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * adjustment (ajuste), accrual (provisión), reclassification (reclasificación) u other.
     * <p>
     * Valores: adjustment, accrual, reclassification, other.
     */
    public String getKind() {
        return kind;
    }

    public UpdateEntryTemplateParams setKind(String kind) {
        this.kind = kind;
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

    public UpdateEntryTemplateParams setJournalType(String journalType) {
        this.journalType = journalType;
        return this;
    }

    /**
     * Sus renglones: la cuenta, el lado y el porcentaje del total o el importe fijo.
     * <p>
     * Obligatorio.
     */
    public List<UpdateEntryTemplateParamsLine> getLines() {
        return lines;
    }

    public UpdateEntryTemplateParams setLines(List<UpdateEntryTemplateParamsLine> lines) {
        this.lines = lines;
        return this;
    }
}
