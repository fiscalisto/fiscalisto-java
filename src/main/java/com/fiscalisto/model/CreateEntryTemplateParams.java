// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateEntryTemplateParams: los campos de «Guardar una póliza modelo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateEntryTemplateParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

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
    private List<CreateEntryTemplateParamsLine> lines;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateEntryTemplateParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El nombre del modelo, único en el emisor: «Compra con IVA al 16%».
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateEntryTemplateParams setName(String name) {
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

    public CreateEntryTemplateParams setDescription(String description) {
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

    public CreateEntryTemplateParams setKind(String kind) {
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

    public CreateEntryTemplateParams setJournalType(String journalType) {
        this.journalType = journalType;
        return this;
    }

    /**
     * Sus renglones: la cuenta, el lado y el porcentaje del total o el importe fijo.
     * <p>
     * Obligatorio.
     */
    public List<CreateEntryTemplateParamsLine> getLines() {
        return lines;
    }

    public CreateEntryTemplateParams setLines(List<CreateEntryTemplateParamsLine> lines) {
        this.lines = lines;
        return this;
    }
}
