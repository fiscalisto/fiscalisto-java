// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * UpdateCostCenterParams: los campos de «Actualizar un centro de costo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateCostCenterParams {
    /**
     * Cómo lo llama su equipo, por ejemplo «Obra Norte». No se repite en el emisor (sin importar mayúsculas).
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su clave, si su contabilidad usa claves (por ejemplo «CC-01»).
     */
    @JsonProperty("code")
    private String code;

    /**
     * true lo archiva: ya no se pueden poner facturas en él, pero las suyas lo conservan. false lo restaura.
     */
    @JsonProperty("archived")
    private Boolean archived;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Cómo lo llama su equipo, por ejemplo «Obra Norte». No se repite en el emisor (sin importar mayúsculas).
     */
    public String getName() {
        return name;
    }

    public UpdateCostCenterParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su clave, si su contabilidad usa claves (por ejemplo «CC-01»).
     */
    public String getCode() {
        return code;
    }

    public UpdateCostCenterParams setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * true lo archiva: ya no se pueden poner facturas en él, pero las suyas lo conservan. false lo restaura.
     */
    public Boolean getArchived() {
        return archived;
    }

    public UpdateCostCenterParams setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public UpdateCostCenterParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
