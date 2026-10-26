// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SatDeclarationSection: SatDeclarationSection.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationSection {
    /**
     * Impuesto: isr, iva o ieps (ImpuestoRet 001, 002, 003).
     */
    @JsonProperty("tax")
    private String tax;

    /**
     * Los renglones del impuesto, en el orden del PDF.
     */
    @JsonProperty("fields")
    private List<SatDeclarationSectionField> fields;

    /**
     * Impuesto: isr, iva o ieps (ImpuestoRet 001, 002, 003).
     */
    public String getTax() {
        return tax;
    }

    public SatDeclarationSection setTax(String tax) {
        this.tax = tax;
        return this;
    }

    /**
     * Los renglones del impuesto, en el orden del PDF.
     */
    public List<SatDeclarationSectionField> getFields() {
        return fields;
    }

    public SatDeclarationSection setFields(List<SatDeclarationSectionField> fields) {
        this.fields = fields;
        return this;
    }
}
