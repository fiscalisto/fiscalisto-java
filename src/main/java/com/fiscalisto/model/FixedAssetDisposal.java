// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FixedAssetDisposal: FixedAssetDisposal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FixedAssetDisposal {
    /**
     * El día de la venta o la baja.
     */
    @JsonProperty("date")
    private String date;

    /**
     * sale (venta) o write_off (robo, pérdida, desecho).
     * <p>
     * Valores: sale, write_off.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * La nota que se dejó, o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * El día de la venta o la baja.
     */
    public String getDate() {
        return date;
    }

    public FixedAssetDisposal setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * sale (venta) o write_off (robo, pérdida, desecho).
     * <p>
     * Valores: sale, write_off.
     */
    public String getReason() {
        return reason;
    }

    public FixedAssetDisposal setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * La nota que se dejó, o null.
     */
    public String getNote() {
        return note;
    }

    public FixedAssetDisposal setNote(String note) {
        this.note = note;
        return this;
    }
}
