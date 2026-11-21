// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * JobForm: Un formulario de solicitud: las preguntas que llena quien se postula.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobForm {
    /**
     * El formulario (jbf_…).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Sus preguntas, en orden.
     */
    @JsonProperty("questions")
    private List<JobFormQuestion> questions;

    /**
     * El formulario (jbf_…).
     */
    public String getId() {
        return id;
    }

    public JobForm setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public JobForm setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public JobForm setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sus preguntas, en orden.
     */
    public List<JobFormQuestion> getQuestions() {
        return questions;
    }

    public JobForm setQuestions(List<JobFormQuestion> questions) {
        this.questions = questions;
        return this;
    }
}
