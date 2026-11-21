// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CandidateAnswerFile: CandidateAnswerFile.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CandidateAnswerFile {
    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su tamaño en bytes.
     */
    @JsonProperty("size")
    private Long size;

    /**
     * Dónde descargarlo en la API.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public CandidateAnswerFile setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su tamaño en bytes.
     */
    public Long getSize() {
        return size;
    }

    public CandidateAnswerFile setSize(Long size) {
        this.size = size;
        return this;
    }

    @JsonIgnore
    public CandidateAnswerFile setSize(long size) {
        return setSize(Long.valueOf(size));
    }

    /**
     * Dónde descargarlo en la API.
     */
    public String getUrl() {
        return url;
    }

    public CandidateAnswerFile setUrl(String url) {
        this.url = url;
        return this;
    }
}
