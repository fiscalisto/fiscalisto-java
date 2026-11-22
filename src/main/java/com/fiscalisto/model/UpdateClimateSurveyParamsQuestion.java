// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateClimateSurveyParamsQuestion: UpdateClimateSurveyParamsQuestion.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateClimateSurveyParamsQuestion {
    /**
     * Su id, único en la encuesta.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("id")
    private String id;

    /**
     * La pregunta.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("text")
    private String text;

    /**
     * scale (del 1 al 5, qué tan de acuerdo), nps (del 0 al 10, para el eNPS), choice (opciones) o text (respuesta abierta).
     * <p>
     * Valores: scale, nps, choice, text.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Con choice: de 2 a 12 opciones.
     */
    @JsonProperty("options")
    private List<String> options;

    /**
     * Si es obligatoria (por omisión, sí).
     */
    @JsonProperty("required")
    private Boolean required;

    /**
     * Su id, único en la encuesta.
     * <p>
     * Obligatorio.
     */
    public String getId() {
        return id;
    }

    public UpdateClimateSurveyParamsQuestion setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * La pregunta.
     * <p>
     * Obligatorio.
     */
    public String getText() {
        return text;
    }

    public UpdateClimateSurveyParamsQuestion setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * scale (del 1 al 5, qué tan de acuerdo), nps (del 0 al 10, para el eNPS), choice (opciones) o text (respuesta abierta).
     * <p>
     * Valores: scale, nps, choice, text.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public UpdateClimateSurveyParamsQuestion setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Con choice: de 2 a 12 opciones.
     */
    public List<String> getOptions() {
        return options;
    }

    public UpdateClimateSurveyParamsQuestion setOptions(List<String> options) {
        this.options = options;
        return this;
    }

    /**
     * Si es obligatoria (por omisión, sí).
     */
    public Boolean getRequired() {
        return required;
    }

    public UpdateClimateSurveyParamsQuestion setRequired(Boolean required) {
        this.required = required;
        return this;
    }
}
