// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateInvoiceParamsCartaPorteSeaContainer: UpdateInvoiceParamsCartaPorteSeaContainer.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorteSeaContainer {
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
    private List<UpdateInvoiceParamsCartaPorteSeaContainerTrailer> trailers;

    /**
     * Tipo de contenedor (TipoContenedor), c_ContenedorMaritimo o c_Contenedor en ferroviario.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public UpdateInvoiceParamsCartaPorteSeaContainer setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Matrícula (Matricula).
     */
    public String getRegistration() {
        return registration;
    }

    public UpdateInvoiceParamsCartaPorteSeaContainer setRegistration(String registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Número de precinto (NumPrecinto).
     */
    public String getSeal() {
        return seal;
    }

    public UpdateInvoiceParamsCartaPorteSeaContainer setSeal(String seal) {
        this.seal = seal;
        return this;
    }

    /**
     * Ferri: el IdCCP de la Carta Porte del autotransporte a bordo (IdCCPRelacionado).
     */
    public String getRelatedIdCcp() {
        return relatedIdCcp;
    }

    public UpdateInvoiceParamsCartaPorteSeaContainer setRelatedIdCcp(String relatedIdCcp) {
        this.relatedIdCcp = relatedIdCcp;
        return this;
    }

    /**
     * Ferri: placa del vehículo a bordo (PlacaVMCCP).
     */
    public String getTruckPlate() {
        return truckPlate;
    }

    public UpdateInvoiceParamsCartaPorteSeaContainer setTruckPlate(String truckPlate) {
        this.truckPlate = truckPlate;
        return this;
    }

    /**
     * Ferri: fecha de certificación de la Carta Porte del vehículo (FechaCertificacionCCP).
     */
    public String getCertifiedAt() {
        return certifiedAt;
    }

    public UpdateInvoiceParamsCartaPorteSeaContainer setCertifiedAt(String certifiedAt) {
        this.certifiedAt = certifiedAt;
        return this;
    }

    /**
     * Remolques o semirremolques (Remolque): tipo (c_SubTipoRem) y placa.
     */
    public List<UpdateInvoiceParamsCartaPorteSeaContainerTrailer> getTrailers() {
        return trailers;
    }

    public UpdateInvoiceParamsCartaPorteSeaContainer setTrailers(List<UpdateInvoiceParamsCartaPorteSeaContainerTrailer> trailers) {
        this.trailers = trailers;
        return this;
    }
}
