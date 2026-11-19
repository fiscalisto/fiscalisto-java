// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DisposeFixedAssetParams: los campos de «Vender o dar de baja un activo fijo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisposeFixedAssetParams {
    /**
     * El día de la venta o la baja.
     * <p>
     * Obligatorio.
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
     * Una nota.
     */
    @JsonProperty("note")
    private String note;

    /**
     * El día de la venta o la baja.
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public DisposeFixedAssetParams setDate(String date) {
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

    public DisposeFixedAssetParams setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Una nota.
     */
    public String getNote() {
        return note;
    }

    public DisposeFixedAssetParams setNote(String note) {
        this.note = note;
        return this;
    }
}
