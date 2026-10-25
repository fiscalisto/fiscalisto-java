// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TaxIdValidationError: TaxIdValidationError.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxIdValidationError {
    /**
     * El campo: tax_id, legal_name, tax_system, zip, use o cif_id.
     */
    @JsonProperty("param")
    private String param;

    /**
     * Qué falló, para su código: tax_id_format, tax_id_date, legal_name_capital_regime, legal_name_mismatch, tax_system_person, tax_system_mismatch, zip_unknown, zip_mismatch, use_tax_system, cif_id_not_found…
     */
    @JsonProperty("code")
    private String code;

    /**
     * La explicación, para mostrarla a su usuario.
     */
    @JsonProperty("message")
    private String message;

    /**
     * El valor correcto cuando se sabe (el del SAT con cif_id, o el nombre sin régimen de capital); null si no.
     */
    @JsonProperty("suggestion")
    private String suggestion;

    /**
     * El campo: tax_id, legal_name, tax_system, zip, use o cif_id.
     */
    public String getParam() {
        return param;
    }

    public TaxIdValidationError setParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * Qué falló, para su código: tax_id_format, tax_id_date, legal_name_capital_regime, legal_name_mismatch, tax_system_person, tax_system_mismatch, zip_unknown, zip_mismatch, use_tax_system, cif_id_not_found…
     */
    public String getCode() {
        return code;
    }

    public TaxIdValidationError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * La explicación, para mostrarla a su usuario.
     */
    public String getMessage() {
        return message;
    }

    public TaxIdValidationError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * El valor correcto cuando se sabe (el del SAT con cif_id, o el nombre sin régimen de capital); null si no.
     */
    public String getSuggestion() {
        return suggestion;
    }

    public TaxIdValidationError setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
}
