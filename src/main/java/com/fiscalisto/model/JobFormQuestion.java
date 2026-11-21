// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * JobFormQuestion: JobFormQuestion.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobFormQuestion {
    /**
     * Su clave: las respuestas van por ella.
     */
    @JsonProperty("id")
    private String id;

    /**
     * La pregunta, como la lee quien se postula.
     */
    @JsonProperty("label")
    private String label;

    /**
     * La ayuda bajo la caja.
     */
    @JsonProperty("help")
    private String help;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: text, longtext, number, date, select, multiselect, yesno, email, phone, url, file.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Si no se puede dejar en blanco.
     */
    @JsonProperty("required")
    private Boolean required;

    /**
     * Las de select y multiselect.
     */
    @JsonProperty("options")
    private List<String> options;

    /**
     * Los archivos que toma una de tipo file.
     */
    @JsonProperty("files")
    private List<String> files;

    /**
     * Lo que se revisa de la respuesta (min_length, max, dates…).
     */
    @JsonProperty("rules")
    private Map<String, Object> rules;

    /**
     * Si es un requisito, las respuestas o el mínimo que lo cumplen.
     */
    @JsonProperty("requirement")
    private JobFormQuestionRequirement requirement;

    /**
     * Su clave: las respuestas van por ella.
     */
    public String getId() {
        return id;
    }

    public JobFormQuestion setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * La pregunta, como la lee quien se postula.
     */
    public String getLabel() {
        return label;
    }

    public JobFormQuestion setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * La ayuda bajo la caja.
     */
    public String getHelp() {
        return help;
    }

    public JobFormQuestion setHelp(String help) {
        this.help = help;
        return this;
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: text, longtext, number, date, select, multiselect, yesno, email, phone, url, file.
     */
    public String getType() {
        return type;
    }

    public JobFormQuestion setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Si no se puede dejar en blanco.
     */
    public Boolean getRequired() {
        return required;
    }

    public JobFormQuestion setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Las de select y multiselect.
     */
    public List<String> getOptions() {
        return options;
    }

    public JobFormQuestion setOptions(List<String> options) {
        this.options = options;
        return this;
    }

    /**
     * Los archivos que toma una de tipo file.
     */
    public List<String> getFiles() {
        return files;
    }

    public JobFormQuestion setFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Lo que se revisa de la respuesta (min_length, max, dates…).
     */
    public Map<String, Object> getRules() {
        return rules;
    }

    public JobFormQuestion setRules(Map<String, Object> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Si es un requisito, las respuestas o el mínimo que lo cumplen.
     */
    public JobFormQuestionRequirement getRequirement() {
        return requirement;
    }

    public JobFormQuestion setRequirement(JobFormQuestionRequirement requirement) {
        this.requirement = requirement;
        return this;
    }
}
