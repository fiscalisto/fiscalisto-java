// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * MatchBankTransactionParams: los campos de «Conciliar un depósito».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchBankTransactionParams {
    /**
     * Las facturas (inv_… o UUID) que pagó este depósito, de un mismo cliente. Sin ellas, las de suggested_match.
     */
    @JsonProperty("invoices")
    private List<String> invoices;

    /**
     * Las facturas (inv_… o UUID) que pagó este depósito, de un mismo cliente. Sin ellas, las de suggested_match.
     */
    public List<String> getInvoices() {
        return invoices;
    }

    public MatchBankTransactionParams setInvoices(List<String> invoices) {
        this.invoices = invoices;
        return this;
    }
}
