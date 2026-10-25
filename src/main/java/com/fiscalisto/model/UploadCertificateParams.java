// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UploadCertificateParams: los campos de «Subir el CSD».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UploadCertificateParams {
    /**
     * El archivo .cer en base64 (puede traer el prefijo data:).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cer")
    private String cer;

    /**
     * El archivo .key en base64 (puede traer el prefijo data:).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("key")
    private String key;

    /**
     * La contraseña de la llave privada (.key). Se usa para abrirla y no se guarda en texto.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("password")
    private String password;

    /**
     * El archivo .cer en base64 (puede traer el prefijo data:).
     * <p>
     * Obligatorio.
     */
    public String getCer() {
        return cer;
    }

    public UploadCertificateParams setCer(String cer) {
        this.cer = cer;
        return this;
    }

    /**
     * El archivo .key en base64 (puede traer el prefijo data:).
     * <p>
     * Obligatorio.
     */
    public String getKey() {
        return key;
    }

    public UploadCertificateParams setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * La contraseña de la llave privada (.key). Se usa para abrirla y no se guarda en texto.
     * <p>
     * Obligatorio.
     */
    public String getPassword() {
        return password;
    }

    public UploadCertificateParams setPassword(String password) {
        this.password = password;
        return this;
    }
}
