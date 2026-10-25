// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCartaPorteGoodHazmat: Material peligroso (MaterialPeligroso Sí): clave UN y embalaje.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteGoodHazmat {
    /**
     * Clave del material peligroso (CveMaterialPeligroso), c_MaterialPeligroso (número UN).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Tipo de embalaje (Embalaje), c_TipoEmbalaje.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("packaging")
    private String packaging;

    /**
     * Descripción del embalaje (DescripEmbalaje).
     */
    @JsonProperty("packaging_description")
    private String packagingDescription;

    /**
     * Clave del material peligroso (CveMaterialPeligroso), c_MaterialPeligroso (número UN).
     * <p>
     * Obligatorio.
     */
    public String getKey() {
        return key;
    }

    public InvoiceCreateCartaPorteGoodHazmat setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Tipo de embalaje (Embalaje), c_TipoEmbalaje.
     * <p>
     * Obligatorio.
     */
    public String getPackaging() {
        return packaging;
    }

    public InvoiceCreateCartaPorteGoodHazmat setPackaging(String packaging) {
        this.packaging = packaging;
        return this;
    }

    /**
     * Descripción del embalaje (DescripEmbalaje).
     */
    public String getPackagingDescription() {
        return packagingDescription;
    }

    public InvoiceCreateCartaPorteGoodHazmat setPackagingDescription(String packagingDescription) {
        this.packagingDescription = packagingDescription;
        return this;
    }
}
