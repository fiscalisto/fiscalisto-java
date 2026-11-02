// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImssFilesFile: ImssFilesFile.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImssFilesFile {
    /**
     * El nombre del archivo.
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Qué lleva, en palabras.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Cuántos movimientos lleva.
     */
    @JsonProperty("count")
    private Long count;

    /**
     * El archivo como texto, renglones terminados en CR LF.
     */
    @JsonProperty("content")
    private String content;

    /**
     * El archivo en Windows-1252 (ANSI, como lo leen IDSE y SUA), en base64.
     */
    @JsonProperty("content_base64")
    private String contentBase64;

    /**
     * El nombre del archivo.
     */
    public String getFileName() {
        return fileName;
    }

    public ImssFilesFile setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Qué lleva, en palabras.
     */
    public String getDescription() {
        return description;
    }

    public ImssFilesFile setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Cuántos movimientos lleva.
     */
    public Long getCount() {
        return count;
    }

    public ImssFilesFile setCount(Long count) {
        this.count = count;
        return this;
    }

    @JsonIgnore
    public ImssFilesFile setCount(long count) {
        return setCount(Long.valueOf(count));
    }

    /**
     * El archivo como texto, renglones terminados en CR LF.
     */
    public String getContent() {
        return content;
    }

    public ImssFilesFile setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * El archivo en Windows-1252 (ANSI, como lo leen IDSE y SUA), en base64.
     */
    public String getContentBase64() {
        return contentBase64;
    }

    public ImssFilesFile setContentBase64(String contentBase64) {
        this.contentBase64 = contentBase64;
        return this;
    }
}
