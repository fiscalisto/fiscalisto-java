// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTicketParamsBuyer: Quién pagó, para reconocer la venta en Tickets. No es el receptor de la factura (eso lo escribe el comprador en el portal) y no se le manda nada.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTicketParamsBuyer {
    /**
     * Su nombre o el de su empresa, como lo conoce su sistema.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su correo.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Su nombre o el de su empresa, como lo conoce su sistema.
     */
    public String getName() {
        return name;
    }

    public CreateTicketParamsBuyer setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su correo.
     */
    public String getEmail() {
        return email;
    }

    public CreateTicketParamsBuyer setEmail(String email) {
        this.email = email;
        return this;
    }
}
