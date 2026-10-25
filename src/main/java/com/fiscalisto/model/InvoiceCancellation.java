// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCancellation: InvoiceCancellation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCancellation {
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
     * pending (espera la respuesta del cliente), accepted (cancelada), rejected (el cliente la rechazó) o lapsed (venció; puede pedirla otra vez).
     */
    public String getStatus() {
        return status;
    }

    public InvoiceCancellation setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 nominativa en una global.
     */
    public String getMotive() {
        return motive;
    }

    public InvoiceCancellation setMotive(String motive) {
        this.motive = motive;
        return this;
    }

    /**
     * El comprobante que sustituye a este (su id o su UUID), con el motivo 01.
     */
    public String getSubstitution() {
        return substitution;
    }

    public InvoiceCancellation setSubstitution(String substitution) {
        this.substitution = substitution;
        return this;
    }

    /**
     * Cuándo se canceló.
     */
    public String getCanceledAt() {
        return canceledAt;
    }

    public InvoiceCancellation setCanceledAt(String canceledAt) {
        this.canceledAt = canceledAt;
        return this;
    }
}
