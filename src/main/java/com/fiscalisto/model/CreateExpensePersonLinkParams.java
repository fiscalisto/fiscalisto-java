// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateExpensePersonLinkParams: los campos de «Dar su enlace a una persona».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExpensePersonLinkParams {
    /**
     * true le da un enlace nuevo: el anterior deja de funcionar en ese momento (por ejemplo, si se compartió por error).
     */
    @JsonProperty("renew")
    private Boolean renew;

    /**
     * true le da un enlace nuevo: el anterior deja de funcionar en ese momento (por ejemplo, si se compartió por error).
     */
    public Boolean getRenew() {
        return renew;
    }

    public CreateExpensePersonLinkParams setRenew(Boolean renew) {
        this.renew = renew;
        return this;
    }
}
