// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * CreateStockAdjustmentParams: los campos de «Ajustar existencias».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStockAdjustmentParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El almacén (whs_…). Por omisión, el de la Matriz.
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * Por qué: shrinkage (merma), theft (robo o extravío), damage (daño), expiration (caducidad), internal_use (uso interno), gift (muestra o regalo), initial (inventario inicial), surplus (sobrante), count (conteo físico) u other.
     * <p>
     * Valores: shrinkage, theft, damage, expiration, internal_use, gift, initial, surplus, count, other.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Una nota, para el kárdex.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Lo que entra o sale de cada producto, hasta 500 líneas.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("lines")
    private List<CreateStockAdjustmentParamsLine> lines;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateStockAdjustmentParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El almacén (whs_…). Por omisión, el de la Matriz.
     */
    public String getWarehouse() {
        return warehouse;
    }

    public CreateStockAdjustmentParams setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * Por qué: shrinkage (merma), theft (robo o extravío), damage (daño), expiration (caducidad), internal_use (uso interno), gift (muestra o regalo), initial (inventario inicial), surplus (sobrante), count (conteo físico) u other.
     * <p>
     * Valores: shrinkage, theft, damage, expiration, internal_use, gift, initial, surplus, count, other.
     * <p>
     * Obligatorio.
     */
    public String getReason() {
        return reason;
    }

    public CreateStockAdjustmentParams setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Una nota, para el kárdex.
     */
    public String getNote() {
        return note;
    }

    public CreateStockAdjustmentParams setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Lo que entra o sale de cada producto, hasta 500 líneas.
     * <p>
     * Obligatorio.
     */
    public List<CreateStockAdjustmentParamsLine> getLines() {
        return lines;
    }

    public CreateStockAdjustmentParams setLines(List<CreateStockAdjustmentParamsLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreateStockAdjustmentParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
