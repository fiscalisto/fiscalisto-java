// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SignEfirmaParams: los campos de «Firmar el contrato con el PAC».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SignEfirmaParams {
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
     * true para guardarla (cifrada) y poder pedir al SAT las facturas del emisor con POST /v1/sat_downloads. Sin esto solo firma el contrato con el PAC y no se guarda.
     */
    @JsonProperty("keep_for_downloads")
    private Boolean keepForDownloads;

    /**
     * El archivo .cer en base64 (puede traer el prefijo data:).
     * <p>
     * Obligatorio.
     */
    public String getCer() {
        return cer;
    }

    public SignEfirmaParams setCer(String cer) {
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

    public SignEfirmaParams setKey(String key) {
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

    public SignEfirmaParams setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * true para guardarla (cifrada) y poder pedir al SAT las facturas del emisor con POST /v1/sat_downloads. Sin esto solo firma el contrato con el PAC y no se guarda.
     */
    public Boolean getKeepForDownloads() {
        return keepForDownloads;
    }

    public SignEfirmaParams setKeepForDownloads(Boolean keepForDownloads) {
        this.keepForDownloads = keepForDownloads;
        return this;
    }
}
