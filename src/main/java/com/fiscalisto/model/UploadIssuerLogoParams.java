// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UploadIssuerLogoParams: los campos de «Subir el logo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UploadIssuerLogoParams {
    /**
     * El logo, PNG o JPG de hasta 1 MB, en base64 (con o sin el prefijo data:image/png;base64,). Uno muy grande se reduce para el PDF.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("file")
    private String file;

    /**
     * El logo, PNG o JPG de hasta 1 MB, en base64 (con o sin el prefijo data:image/png;base64,). Uno muy grande se reduce para el PDF.
     * <p>
     * Obligatorio.
     */
    public String getFile() {
        return file;
    }

    public UploadIssuerLogoParams setFile(String file) {
        this.file = file;
        return this;
    }
}
