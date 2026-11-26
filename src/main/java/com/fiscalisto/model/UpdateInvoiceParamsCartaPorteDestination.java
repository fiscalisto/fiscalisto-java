// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateInvoiceParamsCartaPorteDestination: UpdateInvoiceParamsCartaPorteDestination.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorteDestination {
    /**
     * RFC del destinatario (RFCRemitenteDestinatario); XEXX010101000 si es extranjero.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre del destinatario (NombreRemitenteDestinatario).
     */
    @JsonProperty("name")
    private String name;

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    @JsonProperty("foreign")
    private UpdateInvoiceParamsCartaPorteDestinationForeign foreign;

    /**
     * Fecha y hora de salida (origen) o llegada (destino), AAAA-MM-DDTHH:MM, hora local.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date_time")
    private String dateTime;

    /**
     * Distancia recorrida desde la ubicación anterior, en km (DistanciaRecorrida). Autotransporte y ferroviario.
     */
    @JsonProperty("distance_km")
    private BigDecimal distanceKm;

    /**
     * Estación, puerto o aeropuerto (TipoEstacion y NumEstacion de c_Estaciones). Solo sin autotransporte.
     */
    @JsonProperty("station")
    private UpdateInvoiceParamsCartaPorteDestinationStation station;

    /**
     * Marítimo: tipo de tráfico (NavegacionTrafico), Altura o Cabotaje.
     * <p>
     * Valores: Altura, Cabotaje.
     */
    @JsonProperty("navigation")
    private String navigation;

    /**
     * Domicilio (Domicilio). En México basta el código postal: estado, municipio y localidad se toman de c_CodigoPostal.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("address")
    private UpdateInvoiceParamsCartaPorteDestinationAddress address;

    /**
     * RFC del destinatario (RFCRemitenteDestinatario); XEXX010101000 si es extranjero.
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public UpdateInvoiceParamsCartaPorteDestination setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre del destinatario (NombreRemitenteDestinatario).
     */
    public String getName() {
        return name;
    }

    public UpdateInvoiceParamsCartaPorteDestination setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    public UpdateInvoiceParamsCartaPorteDestinationForeign getForeign() {
        return foreign;
    }

    public UpdateInvoiceParamsCartaPorteDestination setForeign(UpdateInvoiceParamsCartaPorteDestinationForeign foreign) {
        this.foreign = foreign;
        return this;
    }

    /**
     * Fecha y hora de salida (origen) o llegada (destino), AAAA-MM-DDTHH:MM, hora local.
     * <p>
     * Obligatorio.
     */
    public String getDateTime() {
        return dateTime;
    }

    public UpdateInvoiceParamsCartaPorteDestination setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Distancia recorrida desde la ubicación anterior, en km (DistanciaRecorrida). Autotransporte y ferroviario.
     */
    public BigDecimal getDistanceKm() {
        return distanceKm;
    }

    public UpdateInvoiceParamsCartaPorteDestination setDistanceKm(BigDecimal distanceKm) {
        this.distanceKm = distanceKm;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteDestination setDistanceKm(double distanceKm) {
        return setDistanceKm(BigDecimal.valueOf(distanceKm));
    }

    /**
     * Estación, puerto o aeropuerto (TipoEstacion y NumEstacion de c_Estaciones). Solo sin autotransporte.
     */
    public UpdateInvoiceParamsCartaPorteDestinationStation getStation() {
        return station;
    }

    public UpdateInvoiceParamsCartaPorteDestination setStation(UpdateInvoiceParamsCartaPorteDestinationStation station) {
        this.station = station;
        return this;
    }

    /**
     * Marítimo: tipo de tráfico (NavegacionTrafico), Altura o Cabotaje.
     * <p>
     * Valores: Altura, Cabotaje.
     */
    public String getNavigation() {
        return navigation;
    }

    public UpdateInvoiceParamsCartaPorteDestination setNavigation(String navigation) {
        this.navigation = navigation;
        return this;
    }

    /**
     * Domicilio (Domicilio). En México basta el código postal: estado, municipio y localidad se toman de c_CodigoPostal.
     * <p>
     * Obligatorio.
     */
    public UpdateInvoiceParamsCartaPorteDestinationAddress getAddress() {
        return address;
    }

    public UpdateInvoiceParamsCartaPorteDestination setAddress(UpdateInvoiceParamsCartaPorteDestinationAddress address) {
        this.address = address;
        return this;
    }
}
