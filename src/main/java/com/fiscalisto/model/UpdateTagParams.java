// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * UpdateTagParams: los campos de «Actualizar una etiqueta».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateTagParams {
    /**
     * Cómo la llama su equipo, por ejemplo «Obra Norte». No se repite (sin importar mayúsculas ni acentos).
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su color: info (azul), positive (verde), warning (ámbar), critical (rojo) o muted (gris). Por omisión, el siguiente de la lista.
     * <p>
     * Valores: info, positive, warning, critical, muted.
     */
    @JsonProperty("color")
    private String color;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Cómo la llama su equipo, por ejemplo «Obra Norte». No se repite (sin importar mayúsculas ni acentos).
     */
    public String getName() {
        return name;
    }

    public UpdateTagParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su color: info (azul), positive (verde), warning (ámbar), critical (rojo) o muted (gris). Por omisión, el siguiente de la lista.
     * <p>
     * Valores: info, positive, warning, critical, muted.
     */
    public String getColor() {
        return color;
    }

    public UpdateTagParams setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public UpdateTagParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
