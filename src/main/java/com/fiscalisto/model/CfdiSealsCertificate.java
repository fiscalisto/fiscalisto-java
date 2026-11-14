// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CfdiSealsCertificate: CfdiSealsCertificate.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CfdiSealsCertificate {
    /**
     * El número del certificado (20 dígitos), como lo da el SAT.
     */
    @JsonProperty("number")
    private String number;

    /**
     * El RFC dueño del certificado.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * El nombre o razón social en el certificado.
     */
    @JsonProperty("name")
    private String name;

    /**
     * csd si es un sello digital; fiel si es una e.firma (no se debe sellar con ella).
     * <p>
     * Valores: csd, fiel.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Desde cuándo vale el certificado.
     */
    @JsonProperty("valid_from")
    private String validFrom;

    /**
     * Hasta cuándo vale el certificado.
     */
    @JsonProperty("valid_to")
    private String validTo;

    /**
     * El número del certificado (20 dígitos), como lo da el SAT.
     */
    public String getNumber() {
        return number;
    }

    public CfdiSealsCertificate setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * El RFC dueño del certificado.
     */
    public String getTaxId() {
        return taxId;
    }

    public CfdiSealsCertificate setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El nombre o razón social en el certificado.
     */
    public String getName() {
        return name;
    }

    public CfdiSealsCertificate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * csd si es un sello digital; fiel si es una e.firma (no se debe sellar con ella).
     * <p>
     * Valores: csd, fiel.
     */
    public String getKind() {
        return kind;
    }

    public CfdiSealsCertificate setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Desde cuándo vale el certificado.
     */
    public String getValidFrom() {
        return validFrom;
    }

    public CfdiSealsCertificate setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Hasta cuándo vale el certificado.
     */
    public String getValidTo() {
        return validTo;
    }

    public CfdiSealsCertificate setValidTo(String validTo) {
        this.validTo = validTo;
        return this;
    }
}
