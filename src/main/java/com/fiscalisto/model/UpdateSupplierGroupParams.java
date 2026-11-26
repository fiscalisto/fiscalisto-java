// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * UpdateSupplierGroupParams: los campos de «Actualizar un grupo de proveedores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSupplierGroupParams {
    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Color de su etiqueta en la app: info, warning, positive, critical o muted.
     * <p>
     * Valores: info, warning, positive, critical, muted.
     */
    @JsonProperty("color")
    private String color;

    /**
     * RFC de los proveedores que entran al grupo (hasta 500); salen del que tenían.
     */
    @JsonProperty("add_suppliers")
    private List<String> addSuppliers;

    /**
     * RFC de los proveedores que salen del grupo y quedan sin grupo (hasta 500).
     */
    @JsonProperty("remove_suppliers")
    private List<String> removeSuppliers;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public UpdateSupplierGroupParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Color de su etiqueta en la app: info, warning, positive, critical o muted.
     * <p>
     * Valores: info, warning, positive, critical, muted.
     */
    public String getColor() {
        return color;
    }

    public UpdateSupplierGroupParams setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * RFC de los proveedores que entran al grupo (hasta 500); salen del que tenían.
     */
    public List<String> getAddSuppliers() {
        return addSuppliers;
    }

    public UpdateSupplierGroupParams setAddSuppliers(List<String> addSuppliers) {
        this.addSuppliers = addSuppliers;
        return this;
    }

    /**
     * RFC de los proveedores que salen del grupo y quedan sin grupo (hasta 500).
     */
    public List<String> getRemoveSuppliers() {
        return removeSuppliers;
    }

    public UpdateSupplierGroupParams setRemoveSuppliers(List<String> removeSuppliers) {
        this.removeSuppliers = removeSuppliers;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public UpdateSupplierGroupParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
