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
     * pending (espera la respuesta del cliente), accepted (cancelada), rejected (el cliente la rechazó) o lapsed (venció; puede pedirla otra vez).
     */
    @JsonProperty("status")
    private String status;

    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 nominativa en una global.
     */
    @JsonProperty("motive")
    private String motive;

    /**
     * Cuándo se canceló.
     */
    @JsonProperty("canceled_at")
    private String canceledAt;

    /**
     * pending (espera la respuesta del cliente), accepted (cancelada), rejected (el cliente la rechazó) o lapsed (venció; puede pedirla otra vez).
     */
    public String getStatus() {
        return status;
    }

    public RetentionCancellation setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 nominativa en una global.
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
