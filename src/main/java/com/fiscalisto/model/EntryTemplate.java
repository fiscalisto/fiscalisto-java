// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * EntryTemplate: Una póliza modelo: las cuentas de una póliza que se captura seguido (una compra, una renta) con el porcentaje del total o el importe fijo de cada renglón, para hacerla otra vez con otro total.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryTemplate {
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
     * El nombre del modelo.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El concepto de las pólizas que se hacen con él.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La clase de las pólizas que se hacen con él: adjustment, accrual, reclassification u other.
     * <p>
     * Valores: adjustment, accrual, reclassification, other.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Su tipo de póliza: journal, income o expense.
     * <p>
     * Valores: journal, income, expense.
     */
    @JsonProperty("journal_type")
    private String journalType;

    /**
     * Sus renglones: la cuenta, el lado y el porcentaje o el importe fijo.
     */
    @JsonProperty("lines")
    private List<EntryTemplateLine> lines;

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

    public EntryTemplate setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public EntryTemplate setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EntryTemplate setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public EntryTemplate setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El nombre del modelo.
     */
    public String getName() {
        return name;
    }

    public EntryTemplate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El concepto de las pólizas que se hacen con él.
     */
    public String getDescription() {
        return description;
    }

    public EntryTemplate setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * La clase de las pólizas que se hacen con él: adjustment, accrual, reclassification u other.
     * <p>
     * Valores: adjustment, accrual, reclassification, other.
     */
    public String getKind() {
        return kind;
    }

    public EntryTemplate setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Su tipo de póliza: journal, income o expense.
     * <p>
     * Valores: journal, income, expense.
     */
    public String getJournalType() {
        return journalType;
    }

    public EntryTemplate setJournalType(String journalType) {
        this.journalType = journalType;
        return this;
    }

    /**
     * Sus renglones: la cuenta, el lado y el porcentaje o el importe fijo.
     */
    public List<EntryTemplateLine> getLines() {
        return lines;
    }

    public EntryTemplate setLines(List<EntryTemplateLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Cuándo cambió por última vez.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public EntryTemplate setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
