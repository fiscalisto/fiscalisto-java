// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateExternalPayrollReceiptParamsEmployer: El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExternalPayrollReceiptParamsEmployer {
    /**
     * Registro patronal. Sin el campo: el del emisor cuando el contrato es 01–08. null: sin registro patronal.
     */
    @JsonProperty("registration")
    private String registration;

    /**
     * CURP del patrón persona física. Sin el campo: la guardada en el emisor.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * RfcPatronOrigen.
     */
    @JsonProperty("origin_tax_id")
    private String originTaxId;

    /**
     * EntidadSNCF, solo para entidades adheridas al SNCF.
     */
    @JsonProperty("sncf")
    private CreateExternalPayrollReceiptParamsEmployerSncf sncf;

    /**
     * Registro patronal. Sin el campo: el del emisor cuando el contrato es 01–08. null: sin registro patronal.
     */
    public String getRegistration() {
        return registration;
    }

    public CreateExternalPayrollReceiptParamsEmployer setRegistration(String registration) {
        this.registration = registration;
        return this;
    }

    /**
     * CURP del patrón persona física. Sin el campo: la guardada en el emisor.
     */
    public String getCurp() {
        return curp;
    }

    public CreateExternalPayrollReceiptParamsEmployer setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * RfcPatronOrigen.
     */
    public String getOriginTaxId() {
        return originTaxId;
    }

    public CreateExternalPayrollReceiptParamsEmployer setOriginTaxId(String originTaxId) {
        this.originTaxId = originTaxId;
        return this;
    }

    /**
     * EntidadSNCF, solo para entidades adheridas al SNCF.
     */
    public CreateExternalPayrollReceiptParamsEmployerSncf getSncf() {
        return sncf;
    }

    public CreateExternalPayrollReceiptParamsEmployer setSncf(CreateExternalPayrollReceiptParamsEmployerSncf sncf) {
        this.sncf = sncf;
        return this;
    }
}
