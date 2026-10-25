// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateRetentionParamsForeignPayment: Complemento de pagos a extranjeros.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsForeignPayment {
    /**
     * true si quien recibe es el beneficiario efectivo (EsBenefEfectDelCobro).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("beneficiary")
    private Boolean beneficiary;

    /**
     * País de residencia del extranjero (PaisDeResidParaEfecFisc), 2 letras.
     */
    @JsonProperty("country")
    private String country;

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     * <p>
     * Valores: 1, 2, 3, 4, 5, 6, 7, 8, 9.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * Descripción del concepto (DescripcionConcepto).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * RFC del beneficiario, si no es quien recibe (RFC).
     */
    @JsonProperty("beneficiary_tax_id")
    private String beneficiaryTaxId;

    /**
     * CURP del beneficiario (CURP).
     */
    @JsonProperty("beneficiary_curp")
    private String beneficiaryCurp;

    /**
     * Nombre o razón social del beneficiario (NomDenRazSocB).
     */
    @JsonProperty("beneficiary_name")
    private String beneficiaryName;

    /**
     * true si quien recibe es el beneficiario efectivo (EsBenefEfectDelCobro).
     * <p>
     * Obligatorio.
     */
    public Boolean getBeneficiary() {
        return beneficiary;
    }

    public CreateRetentionParamsForeignPayment setBeneficiary(Boolean beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    /**
     * País de residencia del extranjero (PaisDeResidParaEfecFisc), 2 letras.
     */
    public String getCountry() {
        return country;
    }

    public CreateRetentionParamsForeignPayment setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     * <p>
     * Valores: 1, 2, 3, 4, 5, 6, 7, 8, 9.
     * <p>
     * Obligatorio.
     */
    public String getConcept() {
        return concept;
    }

    public CreateRetentionParamsForeignPayment setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Descripción del concepto (DescripcionConcepto).
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public CreateRetentionParamsForeignPayment setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * RFC del beneficiario, si no es quien recibe (RFC).
     */
    public String getBeneficiaryTaxId() {
        return beneficiaryTaxId;
    }

    public CreateRetentionParamsForeignPayment setBeneficiaryTaxId(String beneficiaryTaxId) {
        this.beneficiaryTaxId = beneficiaryTaxId;
        return this;
    }

    /**
     * CURP del beneficiario (CURP).
     */
    public String getBeneficiaryCurp() {
        return beneficiaryCurp;
    }

    public CreateRetentionParamsForeignPayment setBeneficiaryCurp(String beneficiaryCurp) {
        this.beneficiaryCurp = beneficiaryCurp;
        return this;
    }

    /**
     * Nombre o razón social del beneficiario (NomDenRazSocB).
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public CreateRetentionParamsForeignPayment setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
        return this;
    }
}
