// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * CreateSupplierGroupParams: los campos de «Crear un grupo de proveedores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSupplierGroupParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Nombre.
     * <p>
     * Obligatorio.
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
    @JsonProperty("suppliers")
    private List<String> suppliers;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateSupplierGroupParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateSupplierGroupParams setName(String name) {
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

    public CreateSupplierGroupParams setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * RFC de los proveedores que entran al grupo (hasta 500); salen del que tenían.
     */
    public List<String> getSuppliers() {
        return suppliers;
    }

    public CreateSupplierGroupParams setSuppliers(List<String> suppliers) {
        this.suppliers = suppliers;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreateSupplierGroupParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
