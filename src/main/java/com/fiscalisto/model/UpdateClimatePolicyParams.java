// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateClimatePolicyParams: los campos de «Guardar la política de prevención».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateClimatePolicyParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El texto de la política de prevención de riesgos psicosociales (numeral 5.1). La Guía IV de la norma trae un ejemplo.
     */
    @JsonProperty("policy")
    private String policy;

    /**
     * Con quién más pueden presentar una queja, además del buzón del portal (Recursos Humanos, por ejemplo).
     */
    @JsonProperty("complaints_contact")
    private String complaintsContact;

    /**
     * true la publica en el portal de cada trabajador (numeral 5.7) como una versión nueva, que se les pide leer otra vez.
     */
    @JsonProperty("publish")
    private Boolean publish;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateClimatePolicyParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El texto de la política de prevención de riesgos psicosociales (numeral 5.1). La Guía IV de la norma trae un ejemplo.
     */
    public String getPolicy() {
        return policy;
    }

    public UpdateClimatePolicyParams setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Con quién más pueden presentar una queja, además del buzón del portal (Recursos Humanos, por ejemplo).
     */
    public String getComplaintsContact() {
        return complaintsContact;
    }

    public UpdateClimatePolicyParams setComplaintsContact(String complaintsContact) {
        this.complaintsContact = complaintsContact;
        return this;
    }

    /**
     * true la publica en el portal de cada trabajador (numeral 5.7) como una versión nueva, que se les pide leer otra vez.
     */
    public Boolean getPublish() {
        return publish;
    }

    public UpdateClimatePolicyParams setPublish(Boolean publish) {
        this.publish = publish;
        return this;
    }
}
