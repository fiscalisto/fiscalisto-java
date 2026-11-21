// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * CandidateAnswer: CandidateAnswer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CandidateAnswer {
    /**
     * La clave de la pregunta.
     */
    @JsonProperty("question")
    private String question;

    /**
     * La pregunta, como la leyó.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    @JsonProperty("value")
    private JsonNode value;

    /**
     * El archivo que subió, en una pregunta de tipo file.
     */
    @JsonProperty("file")
    private CandidateAnswerFile file;

    /**
     * La clave de la pregunta.
     */
    public String getQuestion() {
        return question;
    }

    public CandidateAnswer setQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * La pregunta, como la leyó.
     */
    public String getLabel() {
        return label;
    }

    public CandidateAnswer setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     */
    public String getType() {
        return type;
    }

    public CandidateAnswer setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    public JsonNode getValue() {
        return value;
    }

    public CandidateAnswer setValue(JsonNode value) {
        this.value = value;
        return this;
    }

    /**
     * El archivo que subió, en una pregunta de tipo file.
     */
    public CandidateAnswerFile getFile() {
        return file;
    }

    public CandidateAnswer setFile(CandidateAnswerFile file) {
        this.file = file;
        return this;
    }
}
