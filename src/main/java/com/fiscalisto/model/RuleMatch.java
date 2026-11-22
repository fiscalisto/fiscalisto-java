// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * RuleMatch: Lo que manda una regla con la acción webhook: qué regla, con qué registro y todos sus campos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleMatch {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Siempre true: las reglas son de producción.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * La regla que se cumplió.
     */
    @JsonProperty("rule")
    private RuleMatchRule rule;

    /**
     * Su momento (trigger), como en /v1/rules.
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * true: sus condiciones no se cumplieron y esto es lo que hace «Si no» (else_actions).
     */
    @JsonProperty("else")
    private Boolean else_;

    /**
     * El registro con que se cumplió.
     */
    @JsonProperty("record")
    private RuleMatchRecord record_;

    /**
     * Cada campo de sus condiciones con su valor en ese registro (los de conditions en /v1/rules: total, supplier, age…).
     */
    @JsonProperty("fields")
    private Map<String, Object> fields;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public RuleMatch setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Siempre true: las reglas son de producción.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public RuleMatch setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * La regla que se cumplió.
     */
    public RuleMatchRule getRule() {
        return rule;
    }

    public RuleMatch setRule(RuleMatchRule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Su momento (trigger), como en /v1/rules.
     */
    public String getTrigger() {
        return trigger;
    }

    public RuleMatch setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * true: sus condiciones no se cumplieron y esto es lo que hace «Si no» (else_actions).
     */
    public Boolean getElse() {
        return else_;
    }

    public RuleMatch setElse(Boolean else_) {
        this.else_ = else_;
        return this;
    }

    /**
     * El registro con que se cumplió.
     */
    public RuleMatchRecord getRecord() {
        return record_;
    }

    public RuleMatch setRecord(RuleMatchRecord record_) {
        this.record_ = record_;
        return this;
    }

    /**
     * Cada campo de sus condiciones con su valor en ese registro (los de conditions en /v1/rules: total, supplier, age…).
     */
    public Map<String, Object> getFields() {
        return fields;
    }

    public RuleMatch setFields(Map<String, Object> fields) {
        this.fields = fields;
        return this;
    }
}
