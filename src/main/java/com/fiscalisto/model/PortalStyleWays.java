// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalStyleWays: Las formas de dar sus datos además de escribirlos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalStyleWays {
    /**
     * Subir la constancia (PDF).
     */
    @JsonProperty("constancia")
    private Boolean constancia;

    /**
     * Escanear el QR de la constancia.
     */
    @JsonProperty("qr")
    private Boolean qr;

    /**
     * Buscar los datos con RFC e idCIF.
     */
    @JsonProperty("cif")
    private Boolean cif;

    /**
     * «Ya le hemos facturado antes»: RFC y correo.
     */
    @JsonProperty("recall")
    private Boolean recall;

    /**
     * Facturar a clientes en el extranjero.
     */
    @JsonProperty("abroad")
    private Boolean abroad;

    /**
     * Subir la constancia (PDF).
     */
    public Boolean getConstancia() {
        return constancia;
    }

    public PortalStyleWays setConstancia(Boolean constancia) {
        this.constancia = constancia;
        return this;
    }

    /**
     * Escanear el QR de la constancia.
     */
    public Boolean getQr() {
        return qr;
    }

    public PortalStyleWays setQr(Boolean qr) {
        this.qr = qr;
        return this;
    }

    /**
     * Buscar los datos con RFC e idCIF.
     */
    public Boolean getCif() {
        return cif;
    }

    public PortalStyleWays setCif(Boolean cif) {
        this.cif = cif;
        return this;
    }

    /**
     * «Ya le hemos facturado antes»: RFC y correo.
     */
    public Boolean getRecall() {
        return recall;
    }

    public PortalStyleWays setRecall(Boolean recall) {
        this.recall = recall;
        return this;
    }

    /**
     * Facturar a clientes en el extranjero.
     */
    public Boolean getAbroad() {
        return abroad;
    }

    public PortalStyleWays setAbroad(Boolean abroad) {
        this.abroad = abroad;
        return this;
    }
}
