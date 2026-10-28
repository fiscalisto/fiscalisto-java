// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoicePayrollEmployer: El patrón (Emisor del complemento): registro patronal y CURP si es persona física.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicePayrollEmployer {
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
     * RFC del patrón de origen (RfcPatronOrigen).
     */
    @JsonProperty("origin_tax_id")
    private String originTaxId;

    /**
     * Entidad del SNCF (EntidadSNCF).
     */
    @JsonProperty("sncf")
    private InvoicePayrollEmployerSncf sncf;

    /**
     * Registro patronal ante el IMSS (RegistroPatronal), 11 caracteres. Necesario para timbrar nómina.
     */
    public String getEmployerRegistration() {
        return employerRegistration;
    }

    public InvoicePayrollEmployer setEmployerRegistration(String employerRegistration) {
        this.employerRegistration = employerRegistration;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     */
    public String getCurp() {
        return curp;
    }

    public InvoicePayrollEmployer setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * RFC del patrón de origen (RfcPatronOrigen).
     */
    public String getOriginTaxId() {
        return originTaxId;
    }

    public InvoicePayrollEmployer setOriginTaxId(String originTaxId) {
        this.originTaxId = originTaxId;
        return this;
    }

    /**
     * Entidad del SNCF (EntidadSNCF).
     */
    public InvoicePayrollEmployerSncf getSncf() {
        return sncf;
    }

    public InvoicePayrollEmployer setSncf(InvoicePayrollEmployerSncf sncf) {
        this.sncf = sncf;
        return this;
    }
}
