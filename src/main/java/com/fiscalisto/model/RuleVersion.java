// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleVersion: Un cambio a una regla, con la regla como quedó. Se guardan las últimas 50 de cada regla; las de una regla borrada, 90 días.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleVersion {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Qué cambió: created, edited, paused (en pausa), resumed (activada), deleted o restored (regresó a una versión anterior).
     * <p>
     * Valores: created, edited, paused, resumed, deleted, restored.
     */
    @JsonProperty("change")
    private String change;

    /**
     * El miembro (mem_…) que la cambió; null si fue la API o Fiscalisto.
     */
    @JsonProperty("changed_by")
    private String changedBy;

    /**
     * La regla como quedó después de este cambio.
     */
    @JsonProperty("rule")
    private Rule rule;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public RuleVersion setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public RuleVersion setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Qué cambió: created, edited, paused (en pausa), resumed (activada), deleted o restored (regresó a una versión anterior).
     * <p>
     * Valores: created, edited, paused, resumed, deleted, restored.
     */
    public String getChange() {
        return change;
    }

    public RuleVersion setChange(String change) {
        this.change = change;
        return this;
    }

    /**
     * El miembro (mem_…) que la cambió; null si fue la API o Fiscalisto.
     */
    public String getChangedBy() {
        return changedBy;
    }

    public RuleVersion setChangedBy(String changedBy) {
        this.changedBy = changedBy;
        return this;
    }

    /**
     * La regla como quedó después de este cambio.
     */
    public Rule getRule() {
        return rule;
    }

    public RuleVersion setRule(Rule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public RuleVersion setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
