// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateJobFormParams: los campos de «Cambiar un formulario de solicitud».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateJobFormParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cómo lo llama su equipo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Sus preguntas, en orden. nombre y correo van siempre (si no las manda, se agregan al principio).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("questions")
    private List<UpdateJobFormParamsQuestion> questions;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateJobFormParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cómo lo llama su equipo.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public UpdateJobFormParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sus preguntas, en orden. nombre y correo van siempre (si no las manda, se agregan al principio).
     * <p>
     * Obligatorio.
     */
    public List<UpdateJobFormParamsQuestion> getQuestions() {
        return questions;
    }

    public UpdateJobFormParams setQuestions(List<UpdateJobFormParamsQuestion> questions) {
        this.questions = questions;
        return this;
    }
}
