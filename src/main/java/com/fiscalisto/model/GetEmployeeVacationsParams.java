// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEmployeeVacationsParams: los campos de «Vacaciones de un empleado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetEmployeeVacationsParams {
    /**
     * El día del saldo (AAAA-MM-DD); por omisión hoy, o su último día si ya salió.
     */
    @JsonProperty("as_of")
    private String asOf;

    /**
     * El día del saldo (AAAA-MM-DD); por omisión hoy, o su último día si ya salió.
     */
    public String getAsOf() {
        return asOf;
    }

    public GetEmployeeVacationsParams setAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }
}
