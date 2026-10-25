// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceCreateCartaPorteSeaContainer: InvoiceCreateCartaPorteSeaContainer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteSeaContainer {
    /**
     * Tipo de contenedor (TipoContenedor), c_ContenedorMaritimo o c_Contenedor en ferroviario.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Matrícula (Matricula).
     */
    @JsonProperty("registration")
    private String registration;

    /**
     * Número de precinto (NumPrecinto).
     */
    @JsonProperty("seal")
    private String seal;

    /**
     * Ferri: el IdCCP de la Carta Porte del autotransporte a bordo (IdCCPRelacionado).
     */
    @JsonProperty("related_id_ccp")
    private String relatedIdCcp;

    /**
     * Ferri: placa del vehículo a bordo (PlacaVMCCP).
     */
    @JsonProperty("truck_plate")
    private String truckPlate;

    /**
     * Ferri: fecha de certificación de la Carta Porte del vehículo (FechaCertificacionCCP).
     */
    @JsonProperty("certified_at")
    private String certifiedAt;

    /**
     * Remolques o semirremolques (Remolque): tipo (c_SubTipoRem) y placa.
     */
    @JsonProperty("trailers")
    private List<InvoiceCreateCartaPorteSeaContainerTrailer> trailers;

    /**
     * Tipo de contenedor (TipoContenedor), c_ContenedorMaritimo o c_Contenedor en ferroviario.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public InvoiceCreateCartaPorteSeaContainer setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Matrícula (Matricula).
     */
    public String getRegistration() {
        return registration;
    }

    public InvoiceCreateCartaPorteSeaContainer setRegistration(String registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Número de precinto (NumPrecinto).
     */
    public String getSeal() {
        return seal;
    }

    public InvoiceCreateCartaPorteSeaContainer setSeal(String seal) {
        this.seal = seal;
        return this;
    }

    /**
     * Ferri: el IdCCP de la Carta Porte del autotransporte a bordo (IdCCPRelacionado).
     */
    public String getRelatedIdCcp() {
        return relatedIdCcp;
    }

    public InvoiceCreateCartaPorteSeaContainer setRelatedIdCcp(String relatedIdCcp) {
        this.relatedIdCcp = relatedIdCcp;
        return this;
    }

    /**
     * Ferri: placa del vehículo a bordo (PlacaVMCCP).
     */
    public String getTruckPlate() {
        return truckPlate;
    }

    public InvoiceCreateCartaPorteSeaContainer setTruckPlate(String truckPlate) {
        this.truckPlate = truckPlate;
        return this;
    }

    /**
     * Ferri: fecha de certificación de la Carta Porte del vehículo (FechaCertificacionCCP).
     */
    public String getCertifiedAt() {
        return certifiedAt;
    }

    public InvoiceCreateCartaPorteSeaContainer setCertifiedAt(String certifiedAt) {
        this.certifiedAt = certifiedAt;
        return this;
    }

    /**
     * Remolques o semirremolques (Remolque): tipo (c_SubTipoRem) y placa.
     */
    public List<InvoiceCreateCartaPorteSeaContainerTrailer> getTrailers() {
        return trailers;
    }

    public InvoiceCreateCartaPorteSeaContainer setTrailers(List<InvoiceCreateCartaPorteSeaContainerTrailer> trailers) {
        this.trailers = trailers;
        return this;
    }
}
