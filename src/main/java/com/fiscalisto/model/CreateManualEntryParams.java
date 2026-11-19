// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateManualEntryParams: los campos de «Capturar una póliza».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateManualEntryParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La fecha de la póliza (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Su concepto.
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
     * Solo con kind accrual: la póliza se revierte sola el día 1 del mes siguiente (para cuando llegue la factura).
     */
    @JsonProperty("reverse_next_month")
    private Boolean reverseNextMonth;

    /**
     * El UUID del CFDI con el que se relaciona, si hay uno.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Con uuid: el RFC de la otra parte de ese CFDI.
     */
    @JsonProperty("uuid_tax_id")
    private String uuidTaxId;

    /**
     * Una póliza recurrente: se repite cada mes, el mismo día (el último si la fecha es el último del mes), hasta este mes (AAAA-MM), hasta 60 meses. null: solo en su fecha.
     */
    @JsonProperty("repeat_until")
    private String repeatUntil;

    /**
     * Sus cargos y abonos: cada renglón uno u otro; los cargos suman lo mismo que los abonos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("lines")
    private List<CreateManualEntryParamsLine> lines;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateManualEntryParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La fecha de la póliza (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public CreateManualEntryParams setDate(String date) {
        this.date = date;
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

    public CreateManualEntryParams setDescription(String description) {
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

    public CreateManualEntryParams setKind(String kind) {
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

    public CreateManualEntryParams setJournalType(String journalType) {
        this.journalType = journalType;
        return this;
    }

    /**
     * Solo con kind accrual: la póliza se revierte sola el día 1 del mes siguiente (para cuando llegue la factura).
     */
    public Boolean getReverseNextMonth() {
        return reverseNextMonth;
    }

    public CreateManualEntryParams setReverseNextMonth(Boolean reverseNextMonth) {
        this.reverseNextMonth = reverseNextMonth;
        return this;
    }

    /**
     * El UUID del CFDI con el que se relaciona, si hay uno.
     */
    public String getUuid() {
        return uuid;
    }

    public CreateManualEntryParams setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Con uuid: el RFC de la otra parte de ese CFDI.
     */
    public String getUuidTaxId() {
        return uuidTaxId;
    }

    public CreateManualEntryParams setUuidTaxId(String uuidTaxId) {
        this.uuidTaxId = uuidTaxId;
        return this;
    }

    /**
     * Una póliza recurrente: se repite cada mes, el mismo día (el último si la fecha es el último del mes), hasta este mes (AAAA-MM), hasta 60 meses. null: solo en su fecha.
     */
    public String getRepeatUntil() {
        return repeatUntil;
    }

    public CreateManualEntryParams setRepeatUntil(String repeatUntil) {
        this.repeatUntil = repeatUntil;
        return this;
    }

    /**
     * Sus cargos y abonos: cada renglón uno u otro; los cargos suman lo mismo que los abonos.
     * <p>
     * Obligatorio.
     */
    public List<CreateManualEntryParamsLine> getLines() {
        return lines;
    }

    public CreateManualEntryParams setLines(List<CreateManualEntryParamsLine> lines) {
        this.lines = lines;
        return this;
    }
}
