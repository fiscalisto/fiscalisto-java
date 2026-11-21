// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AutomaticJournalEntry: La póliza que Fiscalisto arma para un CFDI (factura, nota de crédito o recibo de nómina), con la edición a mano si la tiene: se queda aunque el CFDI se vuelva a descargar, hasta volver a la original.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutomaticJournalEntry {
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
     * El UUID del CFDI de la póliza.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * invoice: una factura o nota de crédito; payroll: un recibo de nómina.
     * <p>
     * Valores: invoice, payroll.
     */
    @JsonProperty("type")
    private String type;

    /**
     * La fecha de la póliza: la del CFDI, o la del pago de la nómina.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Su concepto.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Los renglones que usan los libros.
     */
    @JsonProperty("lines")
    private List<AutomaticJournalEntryLine> lines;

    /**
     * true si se editó a mano.
     */
    @JsonProperty("edited")
    private Boolean edited;

    /**
     * Cuándo se editó por última vez, o null.
     */
    @JsonProperty("edited_at")
    private String editedAt;

    /**
     * Editada: los renglones que arma Fiscalisto hoy para su CFDI.
     */
    @JsonProperty("original_lines")
    private List<AutomaticJournalEntryOriginalLine> originalLines;

    /**
     * Editada: true si la póliza que arma su CFDI cambió desde que se editó (su cuenta o su categoría), para revisar que la edición siga bien.
     */
    @JsonProperty("original_changed")
    private Boolean originalChanged;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AutomaticJournalEntry setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AutomaticJournalEntry setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public AutomaticJournalEntry setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El UUID del CFDI de la póliza.
     */
    public String getUuid() {
        return uuid;
    }

    public AutomaticJournalEntry setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * invoice: una factura o nota de crédito; payroll: un recibo de nómina.
     * <p>
     * Valores: invoice, payroll.
     */
    public String getType() {
        return type;
    }

    public AutomaticJournalEntry setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * La fecha de la póliza: la del CFDI, o la del pago de la nómina.
     */
    public String getDate() {
        return date;
    }

    public AutomaticJournalEntry setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Su concepto.
     */
    public String getDescription() {
        return description;
    }

    public AutomaticJournalEntry setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Los renglones que usan los libros.
     */
    public List<AutomaticJournalEntryLine> getLines() {
        return lines;
    }

    public AutomaticJournalEntry setLines(List<AutomaticJournalEntryLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * true si se editó a mano.
     */
    public Boolean getEdited() {
        return edited;
    }

    public AutomaticJournalEntry setEdited(Boolean edited) {
        this.edited = edited;
        return this;
    }

    /**
     * Cuándo se editó por última vez, o null.
     */
    public String getEditedAt() {
        return editedAt;
    }

    public AutomaticJournalEntry setEditedAt(String editedAt) {
        this.editedAt = editedAt;
        return this;
    }

    /**
     * Editada: los renglones que arma Fiscalisto hoy para su CFDI.
     */
    public List<AutomaticJournalEntryOriginalLine> getOriginalLines() {
        return originalLines;
    }

    public AutomaticJournalEntry setOriginalLines(List<AutomaticJournalEntryOriginalLine> originalLines) {
        this.originalLines = originalLines;
        return this;
    }

    /**
     * Editada: true si la póliza que arma su CFDI cambió desde que se editó (su cuenta o su categoría), para revisar que la edición siga bien.
     */
    public Boolean getOriginalChanged() {
        return originalChanged;
    }

    public AutomaticJournalEntry setOriginalChanged(Boolean originalChanged) {
        this.originalChanged = originalChanged;
        return this;
    }
}
