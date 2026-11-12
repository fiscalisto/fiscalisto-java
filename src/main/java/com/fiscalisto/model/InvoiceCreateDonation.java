// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateDonation: Complemento de donatarias: un recibo de donativo. El emisor debe ser donataria (tax_system 603) con su oficio en donation_authorization (POST /v1/issuers/{id}).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateDonation {
    /**
     * true si el donativo es en especie (bienes): va con forma de pago 12 (dación en pago) y un concepto por cada tipo de bien.
     */
    @JsonProperty("in_kind")
    private Boolean inKind;

    /**
     * true si el donante ya había deducido los bienes que dona: el recibo dice que el donativo no es deducible.
     */
    @JsonProperty("deducted")
    private Boolean deducted;

    /**
     * true si el donativo es en especie (bienes): va con forma de pago 12 (dación en pago) y un concepto por cada tipo de bien.
     */
    public Boolean getInKind() {
        return inKind;
    }

    public InvoiceCreateDonation setInKind(Boolean inKind) {
        this.inKind = inKind;
        return this;
    }

    /**
     * true si el donante ya había deducido los bienes que dona: el recibo dice que el donativo no es deducible.
     */
    public Boolean getDeducted() {
        return deducted;
    }

    public InvoiceCreateDonation setDeducted(Boolean deducted) {
        this.deducted = deducted;
        return this;
    }
}
