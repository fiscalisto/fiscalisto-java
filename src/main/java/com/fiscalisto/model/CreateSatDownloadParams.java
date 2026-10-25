// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateSatDownloadParams: los campos de «Pedirle al SAT las facturas de un emisor».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSatDownloadParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * received (las facturas que le hicieron al emisor, por omisión) o issued (las que emitió, aunque no haya sido con Fiscalisto).
     * <p>
     * Valores: received, issued.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Desde qué día (incluido), en hora de la Ciudad de México.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Hasta qué día (incluido). A lo más un año después de from, y no después de hoy.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Solo un tipo de comprobante: I, E, P, T o N. Por omisión, todos.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Solo las de un RFC: el emisor de las recibidas, o el receptor de las emitidas.
     */
    @JsonProperty("counterparty_tax_id")
    private String counterpartyTaxId;

    /**
     * Una sola factura, por su folio fiscal (UUID).
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateSatDownloadParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * received (las facturas que le hicieron al emisor, por omisión) o issued (las que emitió, aunque no haya sido con Fiscalisto).
     * <p>
     * Valores: received, issued.
     */
    public String getDirection() {
        return direction;
    }

    public CreateSatDownloadParams setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Desde qué día (incluido), en hora de la Ciudad de México.
     * <p>
     * Obligatorio.
     */
    public String getFrom() {
        return from;
    }

    public CreateSatDownloadParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Hasta qué día (incluido). A lo más un año después de from, y no después de hoy.
     * <p>
     * Obligatorio.
     */
    public String getTo() {
        return to;
    }

    public CreateSatDownloadParams setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Solo un tipo de comprobante: I, E, P, T o N. Por omisión, todos.
     * <p>
     * Valores: I, E, P, T, N.
     */
    public String getType() {
        return type;
    }

    public CreateSatDownloadParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Solo las de un RFC: el emisor de las recibidas, o el receptor de las emitidas.
     */
    public String getCounterpartyTaxId() {
        return counterpartyTaxId;
    }

    public CreateSatDownloadParams setCounterpartyTaxId(String counterpartyTaxId) {
        this.counterpartyTaxId = counterpartyTaxId;
        return this;
    }

    /**
     * Una sola factura, por su folio fiscal (UUID).
     */
    public String getUuid() {
        return uuid;
    }

    public CreateSatDownloadParams setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
}
