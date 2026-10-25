// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuerOnboardingLink: Una liga para que el dueño de un emisor suba su CSD y firme con su e.firma.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuerOnboardingLink {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor que se da de alta.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La página para el dueño del emisor, en fiscalisto.com. Ábrala en el navegador de su cliente; no la incruste en un iframe.
     */
    @JsonProperty("url")
    private String url;

    /**
     * A dónde regresa al terminar.
     */
    @JsonProperty("return_url")
    private String returnUrl;

    /**
     * Cuándo deja de servir la liga. Pida otra cuando quiera.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Cuándo se creó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public IssuerOnboardingLink setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public IssuerOnboardingLink setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor que se da de alta.
     */
    public String getIssuer() {
        return issuer;
    }

    public IssuerOnboardingLink setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La página para el dueño del emisor, en fiscalisto.com. Ábrala en el navegador de su cliente; no la incruste en un iframe.
     */
    public String getUrl() {
        return url;
    }

    public IssuerOnboardingLink setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * A dónde regresa al terminar.
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    public IssuerOnboardingLink setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }

    /**
     * Cuándo deja de servir la liga. Pida otra cuando quiera.
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public IssuerOnboardingLink setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public IssuerOnboardingLink setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
