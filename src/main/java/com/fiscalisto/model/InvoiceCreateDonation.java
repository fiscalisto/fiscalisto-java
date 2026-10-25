// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateDonation: Complemento de donatarias.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateDonation {
    /**
     * true si el donativo es en especie (va sin forma de pago en efectivo).
     */
    @JsonProperty("in_kind")
    private Boolean inKind;

    /**
     * true si el donativo es deducible para quien lo da.
     */
    @JsonProperty("deducted")
    private Boolean deducted;

    /**
     * true si el donativo es en especie (va sin forma de pago en efectivo).
     */
    public Boolean getInKind() {
        return inKind;
    }

    public InvoiceCreateDonation setInKind(Boolean inKind) {
        this.inKind = inKind;
        return this;
    }

    /**
     * true si el donativo es deducible para quien lo da.
     */
    public Boolean getDeducted() {
        return deducted;
    }

    public InvoiceCreateDonation setDeducted(Boolean deducted) {
        this.deducted = deducted;
        return this;
    }
}
