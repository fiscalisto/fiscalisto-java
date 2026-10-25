// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SatListCheck: Si un RFC aparece en las listas del SAT (69-B, 69-B Bis y art. 69).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatListCheck {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El RFC revisado.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * El nombre con que aparece en las listas del SAT (null si no aparece).
     */
    @JsonProperty("name")
    private String name;

    /**
     * true si el RFC aparece en alguna lista, aunque haya desvirtuado.
     */
    @JsonProperty("listed")
    private Boolean listed;

    /**
     * high: 69-B o 69-B Bis como presunto o definitivo (el SAT dice que simula operaciones; sus facturas no se pueden deducir). medium: una lista del art. 69 (no localizado, créditos firmes o exigibles, cancelados, sentencias, CSD sin efectos). none: no aparece, o ya desvirtuó o tiene sentencia favorable.
     * <p>
     * Valores: high, medium, none.
     */
    @JsonProperty("risk")
    private String risk;

    /**
     * Cada lista en que aparece; vacía si no aparece en ninguna.
     */
    @JsonProperty("lists")
    private List<SatListCheckList2> lists;

    /**
     * Cuándo se actualizaron las listas por última vez (cada día a las 00:00 de la Ciudad de México).
     */
    @JsonProperty("lists_updated_at")
    private String listsUpdatedAt;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatListCheck setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El RFC revisado.
     */
    public String getTaxId() {
        return taxId;
    }

    public SatListCheck setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El nombre con que aparece en las listas del SAT (null si no aparece).
     */
    public String getName() {
        return name;
    }

    public SatListCheck setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * true si el RFC aparece en alguna lista, aunque haya desvirtuado.
     */
    public Boolean getListed() {
        return listed;
    }

    public SatListCheck setListed(Boolean listed) {
        this.listed = listed;
        return this;
    }

    /**
     * high: 69-B o 69-B Bis como presunto o definitivo (el SAT dice que simula operaciones; sus facturas no se pueden deducir). medium: una lista del art. 69 (no localizado, créditos firmes o exigibles, cancelados, sentencias, CSD sin efectos). none: no aparece, o ya desvirtuó o tiene sentencia favorable.
     * <p>
     * Valores: high, medium, none.
     */
    public String getRisk() {
        return risk;
    }

    public SatListCheck setRisk(String risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Cada lista en que aparece; vacía si no aparece en ninguna.
     */
    public List<SatListCheckList2> getLists() {
        return lists;
    }

    public SatListCheck setLists(List<SatListCheckList2> lists) {
        this.lists = lists;
        return this;
    }

    /**
     * Cuándo se actualizaron las listas por última vez (cada día a las 00:00 de la Ciudad de México).
     */
    public String getListsUpdatedAt() {
        return listsUpdatedAt;
    }

    public SatListCheck setListsUpdatedAt(String listsUpdatedAt) {
        this.listsUpdatedAt = listsUpdatedAt;
        return this;
    }
}
