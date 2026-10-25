// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TaxIdValidationWarning: TaxIdValidationWarning.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxIdValidationWarning {
    /**
     * El campo.
     */
    @JsonProperty("param")
    private String param;

    /**
     * tax_id_check_digit, legal_name_format, tax_id_listed_69b o tax_id_listed_69.
     */
    @JsonProperty("code")
    private String code;

    /**
     * La explicación.
     */
    @JsonProperty("message")
    private String message;

    /**
     * El valor sugerido, o null.
     */
    @JsonProperty("suggestion")
    private String suggestion;

    /**
     * El campo.
     */
    public String getParam() {
        return param;
    }

    public TaxIdValidationWarning setParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * tax_id_check_digit, legal_name_format, tax_id_listed_69b o tax_id_listed_69.
     */
    public String getCode() {
        return code;
    }

    public TaxIdValidationWarning setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * La explicación.
     */
    public String getMessage() {
        return message;
    }

    public TaxIdValidationWarning setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * El valor sugerido, o null.
     */
    public String getSuggestion() {
        return suggestion;
    }

    public TaxIdValidationWarning setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
}
