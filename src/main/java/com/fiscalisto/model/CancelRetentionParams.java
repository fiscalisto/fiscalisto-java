// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CancelRetentionParams: los campos de «Cancelar una constancia».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelRetentionParams {
    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 solo en una factura global, cuando una venta incluida se facturó a nombre del cliente.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    @JsonProperty("motive")
    private String motive;

    /**
     * El comprobante que sustituye a este (su id o su UUID), con el motivo 01.
     */
    @JsonProperty("substitution")
    private String substitution;

    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 solo en una factura global, cuando una venta incluida se facturó a nombre del cliente.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    public String getMotive() {
        return motive;
    }

    public CancelRetentionParams setMotive(String motive) {
        this.motive = motive;
        return this;
    }

    /**
     * El comprobante que sustituye a este (su id o su UUID), con el motivo 01.
     */
    public String getSubstitution() {
        return substitution;
    }

    public CancelRetentionParams setSubstitution(String substitution) {
        this.substitution = substitution;
        return this;
    }
}
