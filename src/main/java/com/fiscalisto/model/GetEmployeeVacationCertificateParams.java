// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEmployeeVacationCertificateParams: los campos de «Constancia de vacaciones».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetEmployeeVacationCertificateParams {
    /**
     * El día en que empezará a disfrutarlas (AAAA-MM-DD), con enjoy_to.
     */
    @JsonProperty("enjoy_from")
    private String enjoyFrom;

    /**
     * El día en que terminan (AAAA-MM-DD), con enjoy_from.
     */
    @JsonProperty("enjoy_to")
    private String enjoyTo;

    /**
     * El día de la constancia (AAAA-MM-DD); por omisión hoy.
     */
    @JsonProperty("as_of")
    private String asOf;

    /**
     * El día en que empezará a disfrutarlas (AAAA-MM-DD), con enjoy_to.
     */
    public String getEnjoyFrom() {
        return enjoyFrom;
    }

    public GetEmployeeVacationCertificateParams setEnjoyFrom(String enjoyFrom) {
        this.enjoyFrom = enjoyFrom;
        return this;
    }

    /**
     * El día en que terminan (AAAA-MM-DD), con enjoy_from.
     */
    public String getEnjoyTo() {
        return enjoyTo;
    }

    public GetEmployeeVacationCertificateParams setEnjoyTo(String enjoyTo) {
        this.enjoyTo = enjoyTo;
        return this;
    }

    /**
     * El día de la constancia (AAAA-MM-DD); por omisión hoy.
     */
    public String getAsOf() {
        return asOf;
    }

    public GetEmployeeVacationCertificateParams setAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }
}
