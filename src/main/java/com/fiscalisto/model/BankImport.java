// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * BankImport: Los depósitos que se agregaron.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankImport {
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
     * Cuántos depósitos se agregaron.
     */
    @JsonProperty("added")
    private Long added;

    /**
     * Cuántos ya estaban (se omitieron).
     */
    @JsonProperty("duplicates")
    private Long duplicates;

    /**
     * Los depósitos agregados.
     */
    @JsonProperty("data")
    private List<BankTransaction> data;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public BankImport setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public BankImport setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public BankImport setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cuántos depósitos se agregaron.
     */
    public Long getAdded() {
        return added;
    }

    public BankImport setAdded(Long added) {
        this.added = added;
        return this;
    }

    @JsonIgnore
    public BankImport setAdded(long added) {
        return setAdded(Long.valueOf(added));
    }

    /**
     * Cuántos ya estaban (se omitieron).
     */
    public Long getDuplicates() {
        return duplicates;
    }

    public BankImport setDuplicates(Long duplicates) {
        this.duplicates = duplicates;
        return this;
    }

    @JsonIgnore
    public BankImport setDuplicates(long duplicates) {
        return setDuplicates(Long.valueOf(duplicates));
    }

    /**
     * Los depósitos agregados.
     */
    public List<BankTransaction> getData() {
        return data;
    }

    public BankImport setData(List<BankTransaction> data) {
        this.data = data;
        return this;
    }
}
