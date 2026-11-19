// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ManualEntryImport: Las pólizas que entraron de otro sistema (CONTPAQi, COI, una hoja de cálculo) en una importación.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ManualEntryImport {
    /**
     * La importación (mji_…), para deshacerla; null si todas las pólizas ya estaban.
     */
    @JsonProperty("id")
    private String id;

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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cuántas pólizas entraron.
     */
    @JsonProperty("imported")
    private Long imported;

    /**
     * Cuántas se saltaron porque ya estaban importadas.
     */
    @JsonProperty("duplicates")
    private Long duplicates;

    /**
     * La fecha de la primera póliza del archivo.
     */
    @JsonProperty("from")
    private String from;

    /**
     * La fecha de la última.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Las pólizas que entraron (mje_…).
     */
    @JsonProperty("manual_entries")
    private List<String> manualEntries;

    /**
     * La importación (mji_…), para deshacerla; null si todas las pólizas ya estaban.
     */
    public String getId() {
        return id;
    }

    public ManualEntryImport setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ManualEntryImport setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ManualEntryImport setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ManualEntryImport setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cuántas pólizas entraron.
     */
    public Long getImported() {
        return imported;
    }

    public ManualEntryImport setImported(Long imported) {
        this.imported = imported;
        return this;
    }

    @JsonIgnore
    public ManualEntryImport setImported(long imported) {
        return setImported(Long.valueOf(imported));
    }

    /**
     * Cuántas se saltaron porque ya estaban importadas.
     */
    public Long getDuplicates() {
        return duplicates;
    }

    public ManualEntryImport setDuplicates(Long duplicates) {
        this.duplicates = duplicates;
        return this;
    }

    @JsonIgnore
    public ManualEntryImport setDuplicates(long duplicates) {
        return setDuplicates(Long.valueOf(duplicates));
    }

    /**
     * La fecha de la primera póliza del archivo.
     */
    public String getFrom() {
        return from;
    }

    public ManualEntryImport setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * La fecha de la última.
     */
    public String getTo() {
        return to;
    }

    public ManualEntryImport setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Las pólizas que entraron (mje_…).
     */
    public List<String> getManualEntries() {
        return manualEntries;
    }

    public ManualEntryImport setManualEntries(List<String> manualEntries) {
        this.manualEntries = manualEntries;
        return this;
    }
}
