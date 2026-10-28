// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * BankTransactionSuggestedMatch: BankTransactionSuggestedMatch.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankTransactionSuggestedMatch {
    /**
     * Las facturas, como el cuerpo de POST /v1/invoices, con reference opcional.
     */
    @JsonProperty("invoices")
    private List<String> invoices;

    /**
     * Lo que el depósito pagaría de cada factura (por inv_…).
     */
    @JsonProperty("amounts")
    private Map<String, Object> amounts;

    /**
     * PUE: facturas por cobrar que quedan pagadas al conciliar; PPD: se pagan con su complemento de pago (POST /v1/payments).
     * <p>
     * Valores: PPD, PUE.
     */
    @JsonProperty("method")
    private String method;

    /**
     * high (el monto y además el RFC, el nombre o el folio coinciden) o medium (revíselo antes).
     * <p>
     * Valores: high, medium.
     */
    @JsonProperty("confidence")
    private String confidence;

    /**
     * Por qué se sugiere, en palabras.
     */
    @JsonProperty("reasons")
    private List<String> reasons;

    /**
     * Las facturas, como el cuerpo de POST /v1/invoices, con reference opcional.
     */
    public List<String> getInvoices() {
        return invoices;
    }

    public BankTransactionSuggestedMatch setInvoices(List<String> invoices) {
        this.invoices = invoices;
        return this;
    }

    /**
     * Lo que el depósito pagaría de cada factura (por inv_…).
     */
    public Map<String, Object> getAmounts() {
        return amounts;
    }

    public BankTransactionSuggestedMatch setAmounts(Map<String, Object> amounts) {
        this.amounts = amounts;
        return this;
    }

    /**
     * PUE: facturas por cobrar que quedan pagadas al conciliar; PPD: se pagan con su complemento de pago (POST /v1/payments).
     * <p>
     * Valores: PPD, PUE.
     */
    public String getMethod() {
        return method;
    }

    public BankTransactionSuggestedMatch setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * high (el monto y además el RFC, el nombre o el folio coinciden) o medium (revíselo antes).
     * <p>
     * Valores: high, medium.
     */
    public String getConfidence() {
        return confidence;
    }

    public BankTransactionSuggestedMatch setConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Por qué se sugiere, en palabras.
     */
    public List<String> getReasons() {
        return reasons;
    }

    public BankTransactionSuggestedMatch setReasons(List<String> reasons) {
        this.reasons = reasons;
        return this;
    }
}
