// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetentionCancellation: RetentionCancellation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetentionCancellation {
    /**
     * pending (el SAT la tiene: la termina en minutos o espera la respuesta del cliente), accepted (cancelada), rejected (el cliente la rechazó), lapsed (venció; puede pedirla otra vez), scheduled (Fiscalisto la vuelve a pedir sola) o failed (Fiscalisto dejó de intentarlo; pídala de nuevo).
     */
    @JsonProperty("status")
    private String status;

    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 solo en una factura global, cuando una venta incluida se facturó a nombre del cliente.
     */
    @JsonProperty("motive")
    private String motive;

    /**
     * Cuándo se canceló.
     */
    @JsonProperty("canceled_at")
    private String canceledAt;

    /**
     * pending (el SAT la tiene: la termina en minutos o espera la respuesta del cliente), accepted (cancelada), rejected (el cliente la rechazó), lapsed (venció; puede pedirla otra vez), scheduled (Fiscalisto la vuelve a pedir sola) o failed (Fiscalisto dejó de intentarlo; pídala de nuevo).
     */
    public String getStatus() {
        return status;
    }

    public RetentionCancellation setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 solo en una factura global, cuando una venta incluida se facturó a nombre del cliente.
     */
    public String getMotive() {
        return motive;
    }

    public RetentionCancellation setMotive(String motive) {
        this.motive = motive;
        return this;
    }

    /**
     * Cuándo se canceló.
     */
    public String getCanceledAt() {
        return canceledAt;
    }

    public RetentionCancellation setCanceledAt(String canceledAt) {
        this.canceledAt = canceledAt;
        return this;
    }
}
