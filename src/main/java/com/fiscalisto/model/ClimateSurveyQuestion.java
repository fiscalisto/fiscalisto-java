// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ClimateSurveyQuestion: ClimateSurveyQuestion.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSurveyQuestion {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    @JsonProperty("text")
    private String text;

    /**
     * scale, nps, choice o text.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Con choice: sus opciones.
     */
    @JsonProperty("options")
    private List<String> options;

    /**
     * Si es obligatoria.
     */
    @JsonProperty("required")
    private Boolean required;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ClimateSurveyQuestion setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    public String getText() {
        return text;
    }

    public ClimateSurveyQuestion setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * scale, nps, choice o text.
     */
    public String getType() {
        return type;
    }

    public ClimateSurveyQuestion setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Con choice: sus opciones.
     */
    public List<String> getOptions() {
        return options;
    }

    public ClimateSurveyQuestion setOptions(List<String> options) {
        this.options = options;
        return this;
    }

    /**
     * Si es obligatoria.
     */
    public Boolean getRequired() {
        return required;
    }

    public ClimateSurveyQuestion setRequired(Boolean required) {
        this.required = required;
        return this;
    }
}
