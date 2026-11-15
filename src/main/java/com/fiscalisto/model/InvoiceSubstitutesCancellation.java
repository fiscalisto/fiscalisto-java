// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceSubstitutesCancellation: InvoiceSubstitutesCancellation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceSubstitutesCancellation {
    /**
     * `pending`: el SAT tiene la solicitud (la termina en minutos, o espera la respuesta del receptor). `accepted`: cancelada. `rejected`: el receptor la rechazó. `lapsed`: el SAT nunca la registró; puede pedirse otra vez. `scheduled`: el SAT aún no la acepta (no registra el CFDI que la sustituye, o rechazó la firma un momento) y Fiscalisto la vuelve a pedir sola. `failed`: Fiscalisto dejó de intentarlo; pídala de nuevo con POST /v1/invoices/{id}/cancel.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 solo en una factura global, cuando una venta incluida se facturó a nombre del cliente.
     */
    @JsonProperty("motive")
    private String motive;

    /**
     * El comprobante que sustituye a este (su id o su UUID), con el motivo 01.
     */
    @JsonProperty("substitution")
    private String substitution;

    /**
     * Cuándo se canceló.
     */
    @JsonProperty("canceled_at")
    private String canceledAt;

    /**
     * Con `scheduled`: cuándo la vuelve a pedir Fiscalisto (null: en los próximos 15 minutos).
     */
    @JsonProperty("next_attempt_at")
    private String nextAttemptAt;

    /**
     * Con `scheduled` o `failed`: por qué no ha pasado.
     */
    @JsonProperty("error")
    private String error;

    /**
     * `pending`: el SAT tiene la solicitud (la termina en minutos, o espera la respuesta del receptor). `accepted`: cancelada. `rejected`: el receptor la rechazó. `lapsed`: el SAT nunca la registró; puede pedirse otra vez. `scheduled`: el SAT aún no la acepta (no registra el CFDI que la sustituye, o rechazó la firma un momento) y Fiscalisto la vuelve a pedir sola. `failed`: Fiscalisto dejó de intentarlo; pídala de nuevo con POST /v1/invoices/{id}/cancel.
     */
    public String getStatus() {
        return status;
    }

    public InvoiceSubstitutesCancellation setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 solo en una factura global, cuando una venta incluida se facturó a nombre del cliente.
     */
    public String getMotive() {
        return motive;
    }

    public InvoiceSubstitutesCancellation setMotive(String motive) {
        this.motive = motive;
        return this;
    }

    /**
     * El comprobante que sustituye a este (su id o su UUID), con el motivo 01.
     */
    public String getSubstitution() {
        return substitution;
    }

    public InvoiceSubstitutesCancellation setSubstitution(String substitution) {
        this.substitution = substitution;
        return this;
    }

    /**
     * Cuándo se canceló.
     */
    public String getCanceledAt() {
        return canceledAt;
    }

    public InvoiceSubstitutesCancellation setCanceledAt(String canceledAt) {
        this.canceledAt = canceledAt;
        return this;
    }

    /**
     * Con `scheduled`: cuándo la vuelve a pedir Fiscalisto (null: en los próximos 15 minutos).
     */
    public String getNextAttemptAt() {
        return nextAttemptAt;
    }

    public InvoiceSubstitutesCancellation setNextAttemptAt(String nextAttemptAt) {
        this.nextAttemptAt = nextAttemptAt;
        return this;
    }

    /**
     * Con `scheduled` o `failed`: por qué no ha pasado.
     */
    public String getError() {
        return error;
    }

    public InvoiceSubstitutesCancellation setError(String error) {
        this.error = error;
        return this;
    }
}
