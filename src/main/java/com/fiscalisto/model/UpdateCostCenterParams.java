// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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
}
