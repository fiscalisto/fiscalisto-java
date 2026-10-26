// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateCustomerDataRequestParams: los campos de «Pedirle sus datos fiscales a un cliente».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCustomerDataRequestParams {
    /**
     * El emisor (iss_…) que va a facturarle. Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su id para este cliente o pedido, como «Pedido 1042». El cliente la ve arriba del formulario y viene de vuelta en el evento.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * Una línea que el cliente ve arriba del formulario: para qué son sus datos.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Días que la liga sirve, de 1 a 60. Por omisión 60.
     */
    @JsonProperty("expires_in_days")
    private Long expiresInDays;

    /**
     * El emisor (iss_…) que va a facturarle. Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateCustomerDataRequestParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su id para este cliente o pedido, como «Pedido 1042». El cliente la ve arriba del formulario y viene de vuelta en el evento.
     */
    public String getReference() {
        return reference;
    }

    public CreateCustomerDataRequestParams setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Una línea que el cliente ve arriba del formulario: para qué son sus datos.
     */
    public String getDescription() {
        return description;
    }

    public CreateCustomerDataRequestParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Días que la liga sirve, de 1 a 60. Por omisión 60.
     */
    public Long getExpiresInDays() {
        return expiresInDays;
    }

    public CreateCustomerDataRequestParams setExpiresInDays(Long expiresInDays) {
        this.expiresInDays = expiresInDays;
        return this;
    }

    @JsonIgnore
    public CreateCustomerDataRequestParams setExpiresInDays(long expiresInDays) {
        return setExpiresInDays(Long.valueOf(expiresInDays));
    }
}
