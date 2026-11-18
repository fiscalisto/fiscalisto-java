// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleWays: Las formas de dar sus datos además de escribirlos. Todas `true` por omisión.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleWays {
    /**
     * Ofrecer subir la constancia (PDF).
     */
    @JsonProperty("constancia")
    private Boolean constancia;

    /**
     * Ofrecer escanear el QR de la constancia.
     */
    @JsonProperty("qr")
    private Boolean qr;

    /**
     * Ofrecer buscar los datos con RFC e idCIF.
     */
    @JsonProperty("cif")
    private Boolean cif;

    /**
     * Ofrecer «Ya le hemos facturado antes» (RFC y correo).
     */
    @JsonProperty("recall")
    private Boolean recall;

    /**
     * Ofrecer facturar a clientes en el extranjero.
     */
    @JsonProperty("abroad")
    private Boolean abroad;

    /**
     * Ofrecer subir la constancia (PDF).
     */
    public Boolean getConstancia() {
        return constancia;
    }

    public UpdateSelfInvoicingParamsPortalStyleWays setConstancia(Boolean constancia) {
        this.constancia = constancia;
        return this;
    }

    /**
     * Ofrecer escanear el QR de la constancia.
     */
    public Boolean getQr() {
        return qr;
    }

    public UpdateSelfInvoicingParamsPortalStyleWays setQr(Boolean qr) {
        this.qr = qr;
        return this;
    }

    /**
     * Ofrecer buscar los datos con RFC e idCIF.
     */
    public Boolean getCif() {
        return cif;
    }

    public UpdateSelfInvoicingParamsPortalStyleWays setCif(Boolean cif) {
        this.cif = cif;
        return this;
    }

    /**
     * Ofrecer «Ya le hemos facturado antes» (RFC y correo).
     */
    public Boolean getRecall() {
        return recall;
    }

    public UpdateSelfInvoicingParamsPortalStyleWays setRecall(Boolean recall) {
        this.recall = recall;
        return this;
    }

    /**
     * Ofrecer facturar a clientes en el extranjero.
     */
    public Boolean getAbroad() {
        return abroad;
    }

    public UpdateSelfInvoicingParamsPortalStyleWays setAbroad(Boolean abroad) {
        this.abroad = abroad;
        return this;
    }
}
