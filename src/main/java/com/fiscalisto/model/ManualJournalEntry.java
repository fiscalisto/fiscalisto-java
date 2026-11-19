// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ManualJournalEntry: Una póliza capturada a mano (ajuste, provisión, reclasificación): entra a las pólizas, la balanza, los estados financieros y la contabilidad electrónica de su mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ManualJournalEntry {
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
     * La fecha de la póliza.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Su concepto.
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
     * true: una provisión que se revierte sola el día 1 del mes siguiente.
     */
    @JsonProperty("reverse_next_month")
    private Boolean reverseNextMonth;

    /**
     * El día de su reversión, o null si no se revierte.
     */
    @JsonProperty("reverses_on")
    private String reversesOn;

    /**
     * El UUID del CFDI con el que se relaciona, o null.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El RFC de la otra parte de ese CFDI, o null.
     */
    @JsonProperty("uuid_tax_id")
    private String uuidTaxId;

    /**
     * La suma de sus cargos (igual a la de sus abonos).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Sus renglones: la cuenta y su cargo (debit) o abono (credit).
     */
    @JsonProperty("lines")
    private List<ManualJournalEntryLine> lines;

    /**
     * Cuándo se capturó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo cambió por última vez.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ManualJournalEntry setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ManualJournalEntry setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ManualJournalEntry setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ManualJournalEntry setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La fecha de la póliza.
     */
    public String getDate() {
        return date;
    }

    public ManualJournalEntry setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Su concepto.
     */
    public String getDescription() {
        return description;
    }

    public ManualJournalEntry setDescription(String description) {
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

    public ManualJournalEntry setKind(String kind) {
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

    public ManualJournalEntry setJournalType(String journalType) {
        this.journalType = journalType;
        return this;
    }

    /**
     * true: una provisión que se revierte sola el día 1 del mes siguiente.
     */
    public Boolean getReverseNextMonth() {
        return reverseNextMonth;
    }

    public ManualJournalEntry setReverseNextMonth(Boolean reverseNextMonth) {
        this.reverseNextMonth = reverseNextMonth;
        return this;
    }

    /**
     * El día de su reversión, o null si no se revierte.
     */
    public String getReversesOn() {
        return reversesOn;
    }

    public ManualJournalEntry setReversesOn(String reversesOn) {
        this.reversesOn = reversesOn;
        return this;
    }

    /**
     * El UUID del CFDI con el que se relaciona, o null.
     */
    public String getUuid() {
        return uuid;
    }

    public ManualJournalEntry setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * El RFC de la otra parte de ese CFDI, o null.
     */
    public String getUuidTaxId() {
        return uuidTaxId;
    }

    public ManualJournalEntry setUuidTaxId(String uuidTaxId) {
        this.uuidTaxId = uuidTaxId;
        return this;
    }

    /**
     * La suma de sus cargos (igual a la de sus abonos).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public ManualJournalEntry setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public ManualJournalEntry setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Sus renglones: la cuenta y su cargo (debit) o abono (credit).
     */
    public List<ManualJournalEntryLine> getLines() {
        return lines;
    }

    public ManualJournalEntry setLines(List<ManualJournalEntryLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Cuándo se capturó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ManualJournalEntry setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo cambió por última vez.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public ManualJournalEntry setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
