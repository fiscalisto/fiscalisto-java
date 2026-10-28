// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollBatchReceiptError: PayrollBatchReceiptError.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollBatchReceiptError {
    /**
     * payroll_invalid, payroll_period_overlap, payroll_receipt_exists, invoice_rejected, invoice_invalid, insufficient_balance…
     */
    @JsonProperty("code")
    private String code;

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    @JsonProperty("message")
    private String message;

    /**
     * payroll_invalid, payroll_period_overlap, payroll_receipt_exists, invoice_rejected, invoice_invalid, insufficient_balance…
     */
    public String getCode() {
        return code;
    }

    public PayrollBatchReceiptError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    public String getMessage() {
        return message;
    }

    public PayrollBatchReceiptError setMessage(String message) {
        this.message = message;
        return this;
    }
}
