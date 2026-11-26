// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateInvoiceParamsCartaPorteOrigin: Ubicación de origen (Ubicacion TipoUbicacion Origen): remitente, fecha y hora de salida y domicilio.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorteOrigin {
    /**
     * RFC del remitente (RFCRemitenteDestinatario); XEXX010101000 si es extranjero.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre del remitente (NombreRemitenteDestinatario).
     */
    @JsonProperty("name")
    private String name;

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    @JsonProperty("foreign")
    private UpdateInvoiceParamsCartaPorteOriginForeign foreign;

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
    private UpdateInvoiceParamsCartaPorteOriginStation station;

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
    private UpdateInvoiceParamsCartaPorteOriginAddress address;

    /**
     * RFC del remitente (RFCRemitenteDestinatario); XEXX010101000 si es extranjero.
     * <p>
     * Obligatorio.
     */
    public String getTaxId() {
        return taxId;
    }

    public UpdateInvoiceParamsCartaPorteOrigin setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre del remitente (NombreRemitenteDestinatario).
     */
    public String getName() {
        return name;
    }

    public UpdateInvoiceParamsCartaPorteOrigin setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Si es extranjero: su país de residencia (ResidenciaFiscal, c_Pais) y su número de registro tributario (NumRegIdTrib), con el RFC genérico XEXX010101000.
     */
    public UpdateInvoiceParamsCartaPorteOriginForeign getForeign() {
        return foreign;
    }

    public UpdateInvoiceParamsCartaPorteOrigin setForeign(UpdateInvoiceParamsCartaPorteOriginForeign foreign) {
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

    public UpdateInvoiceParamsCartaPorteOrigin setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Distancia recorrida desde la ubicación anterior, en km (DistanciaRecorrida). Autotransporte y ferroviario.
     */
    public BigDecimal getDistanceKm() {
        return distanceKm;
    }

    public UpdateInvoiceParamsCartaPorteOrigin setDistanceKm(BigDecimal distanceKm) {
        this.distanceKm = distanceKm;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteOrigin setDistanceKm(double distanceKm) {
        return setDistanceKm(BigDecimal.valueOf(distanceKm));
    }

    /**
     * Estación, puerto o aeropuerto (TipoEstacion y NumEstacion de c_Estaciones). Solo sin autotransporte.
     */
    public UpdateInvoiceParamsCartaPorteOriginStation getStation() {
        return station;
    }

    public UpdateInvoiceParamsCartaPorteOrigin setStation(UpdateInvoiceParamsCartaPorteOriginStation station) {
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

    public UpdateInvoiceParamsCartaPorteOrigin setNavigation(String navigation) {
        this.navigation = navigation;
        return this;
    }

    /**
     * Domicilio (Domicilio). En México basta el código postal: estado, municipio y localidad se toman de c_CodigoPostal.
     * <p>
     * Obligatorio.
     */
    public UpdateInvoiceParamsCartaPorteOriginAddress getAddress() {
        return address;
    }

    public UpdateInvoiceParamsCartaPorteOrigin setAddress(UpdateInvoiceParamsCartaPorteOriginAddress address) {
        this.address = address;
        return this;
    }
}
