// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateJobFormParamsQuestion: UpdateJobFormParamsQuestion.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateJobFormParamsQuestion {
    /**
     * Su clave en el formulario y en las respuestas; por omisión sale de label. Las de siempre: nombre, correo, telefono y cv.
     */
    @JsonProperty("id")
    private String id;

    /**
     * La pregunta, como la lee quien se postula.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Una ayuda bajo la caja.
     */
    @JsonProperty("help")
    private String help;

    /**
     * text, longtext (párrafo), number, date, select (una de la lista), multiselect (varias), yesno, email, phone, url o file (un archivo).
     * <p>
     * Valores: text, longtext, number, date, select, multiselect, yesno, email, phone, url, file.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Si no se puede dejar en blanco.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("required")
    private Boolean required;

    /**
     * Las opciones de select y multiselect.
     */
    @JsonProperty("options")
    private List<String> options;

    /**
     * Qué archivos toma una de tipo file: pdf, image (JPG, PNG), doc (.docx). Hasta 10 MB.
     */
    @JsonProperty("files")
    private List<String> files;

    /**
     * Lo que se revisa de la respuesta (largo, formato, mínimo, máximo, fechas, ejemplo).
     */
    @JsonProperty("rules")
    private UpdateJobFormParamsQuestionRules rules;

    /**
     * Si es un requisito: quien no lo cumple queda marcado o se le avisa antes de enviar, como diga unmet_requirements.
     */
    @JsonProperty("requirement")
    private UpdateJobFormParamsQuestionRequirement requirement;

    /**
     * Su clave en el formulario y en las respuestas; por omisión sale de label. Las de siempre: nombre, correo, telefono y cv.
     */
    public String getId() {
        return id;
    }

    public UpdateJobFormParamsQuestion setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * La pregunta, como la lee quien se postula.
     * <p>
     * Obligatorio.
     */
    public String getLabel() {
        return label;
    }

    public UpdateJobFormParamsQuestion setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Una ayuda bajo la caja.
     */
    public String getHelp() {
        return help;
    }

    public UpdateJobFormParamsQuestion setHelp(String help) {
        this.help = help;
        return this;
    }

    /**
     * text, longtext (párrafo), number, date, select (una de la lista), multiselect (varias), yesno, email, phone, url o file (un archivo).
     * <p>
     * Valores: text, longtext, number, date, select, multiselect, yesno, email, phone, url, file.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public UpdateJobFormParamsQuestion setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Si no se puede dejar en blanco.
     * <p>
     * Obligatorio.
     */
    public Boolean getRequired() {
        return required;
    }

    public UpdateJobFormParamsQuestion setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Las opciones de select y multiselect.
     */
    public List<String> getOptions() {
        return options;
    }

    public UpdateJobFormParamsQuestion setOptions(List<String> options) {
        this.options = options;
        return this;
    }

    /**
     * Qué archivos toma una de tipo file: pdf, image (JPG, PNG), doc (.docx). Hasta 10 MB.
     */
    public List<String> getFiles() {
        return files;
    }

    public UpdateJobFormParamsQuestion setFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Lo que se revisa de la respuesta (largo, formato, mínimo, máximo, fechas, ejemplo).
     */
    public UpdateJobFormParamsQuestionRules getRules() {
        return rules;
    }

    public UpdateJobFormParamsQuestion setRules(UpdateJobFormParamsQuestionRules rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Si es un requisito: quien no lo cumple queda marcado o se le avisa antes de enviar, como diga unmet_requirements.
     */
    public UpdateJobFormParamsQuestionRequirement getRequirement() {
        return requirement;
    }

    public UpdateJobFormParamsQuestion setRequirement(UpdateJobFormParamsQuestionRequirement requirement) {
        this.requirement = requirement;
        return this;
    }
}
