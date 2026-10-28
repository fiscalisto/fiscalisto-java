// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExternalPayrollReceiptPreviewPayrollEmployer: El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewPayrollEmployer {
    /**
     * Registro patronal ante el IMSS (RegistroPatronal), 11 caracteres. Necesario para timbrar nómina.
     */
    @JsonProperty("employer_registration")
    private String employerRegistration;

    /**
     * CURP, 18 caracteres.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * origin_tax_id.
     */
    @JsonProperty("origin_tax_id")
    private String originTaxId;

    /**
     * sncf.
     */
    @JsonProperty("sncf")
    private ExternalPayrollReceiptPreviewPayrollEmployerSncf sncf;

    /**
     * Registro patronal ante el IMSS (RegistroPatronal), 11 caracteres. Necesario para timbrar nómina.
     */
    public String getEmployerRegistration() {
        return employerRegistration;
    }

    public ExternalPayrollReceiptPreviewPayrollEmployer setEmployerRegistration(String employerRegistration) {
        this.employerRegistration = employerRegistration;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     */
    public String getCurp() {
        return curp;
    }

    public ExternalPayrollReceiptPreviewPayrollEmployer setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * origin_tax_id.
     */
    public String getOriginTaxId() {
        return originTaxId;
    }

    public ExternalPayrollReceiptPreviewPayrollEmployer setOriginTaxId(String originTaxId) {
        this.originTaxId = originTaxId;
        return this;
    }

    /**
     * sncf.
     */
    public ExternalPayrollReceiptPreviewPayrollEmployerSncf getSncf() {
        return sncf;
    }

    public ExternalPayrollReceiptPreviewPayrollEmployer setSncf(ExternalPayrollReceiptPreviewPayrollEmployerSncf sncf) {
        this.sncf = sncf;
        return this;
    }
}
