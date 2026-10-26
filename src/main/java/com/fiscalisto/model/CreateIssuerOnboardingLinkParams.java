// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIssuerOnboardingLinkParams: los campos de «Crear una liga de alta».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateIssuerOnboardingLinkParams {
    /**
     * A dónde regresa el botón al terminar, por ejemplo la página de su plataforma donde su cliente sigue. Sin ella, la página solo dice que ya terminó.
     */
    @JsonProperty("return_url")
    private String returnUrl;

    /**
     * Horas que la liga sirve, de 1 a 168 (7 días). Por omisión 24.
     */
    @JsonProperty("expires_in_hours")
    private Long expiresInHours;

    /**
     * A dónde regresa el botón al terminar, por ejemplo la página de su plataforma donde su cliente sigue. Sin ella, la página solo dice que ya terminó.
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    public CreateIssuerOnboardingLinkParams setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }

    /**
     * Horas que la liga sirve, de 1 a 168 (7 días). Por omisión 24.
     */
    public Long getExpiresInHours() {
        return expiresInHours;
    }

    public CreateIssuerOnboardingLinkParams setExpiresInHours(Long expiresInHours) {
        this.expiresInHours = expiresInHours;
        return this;
    }

    @JsonIgnore
    public CreateIssuerOnboardingLinkParams setExpiresInHours(long expiresInHours) {
        return setExpiresInHours(Long.valueOf(expiresInHours));
    }
}
