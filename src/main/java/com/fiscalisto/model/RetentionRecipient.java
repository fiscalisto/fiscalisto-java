// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetentionRecipient: Receptor de la constancia (Receptor): nacional con RFC y código postal, o extranjero.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetentionRecipient {
    /**
     * true si el receptor es extranjero (sin RFC).
     */
    @JsonProperty("foreign")
    private Boolean foreign;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    @JsonProperty("legal_name")
    private String legalName;

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * CURP, 18 caracteres.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * true si el receptor es extranjero (sin RFC).
     */
    public Boolean getForeign() {
        return foreign;
    }

    public RetentionRecipient setForeign(Boolean foreign) {
        this.foreign = foreign;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public RetentionRecipient setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    public String getLegalName() {
        return legalName;
    }

    public RetentionRecipient setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Código postal del domicilio fiscal, 5 dígitos, como en la constancia de situación fiscal. El de un emisor es el lugar de expedición (LugarExpedicion) de sus comprobantes.
     */
    public String getZip() {
        return zip;
    }

    public RetentionRecipient setZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     */
    public String getCurp() {
        return curp;
    }

    public RetentionRecipient setCurp(String curp) {
        this.curp = curp;
        return this;
    }
}
