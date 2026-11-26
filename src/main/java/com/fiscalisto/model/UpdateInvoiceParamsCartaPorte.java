// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateInvoiceParamsCartaPorte: Complemento Carta Porte 3.1 (traslado de mercancías).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorte {
    /**
     * Cómo viajan las mercancías (c_CveTransporte): 01 autotransporte, 02 marítimo, 03 aéreo, 04 ferroviario; varios si es intermodal. Por omisión 01.
     */
    @JsonProperty("modes")
    private List<String> modes;

    /**
     * Transporte internacional (TranspInternac Sí): entrada o salida, país, vía y regímenes aduaneros.
     */
    @JsonProperty("international")
    private UpdateInvoiceParamsCartaPorteInternational international;

    /**
     * Corredor Interoceánico del Istmo de Tehuantepec: polos de origen y destino (c_RegistroISTMO).
     */
    @JsonProperty("istmo")
    private UpdateInvoiceParamsCartaPorteIstmo istmo;

    /**
     * Autotransporte: true si es logística inversa, recolección o devolución.
     */
    @JsonProperty("reverse_logistics")
    private Boolean reverseLogistics;

    /**
     * Ubicación de origen (Ubicacion TipoUbicacion Origen): remitente, fecha y hora de salida y domicilio.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("origin")
    private UpdateInvoiceParamsCartaPorteOrigin origin;

    /**
     * Ubicaciones de destino (TipoUbicacion Destino), en orden: destinatario, llegada, distancia y domicilio.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("destinations")
    private List<UpdateInvoiceParamsCartaPorteDestination> destinations;

    /**
     * Mercancías (Mercancia) que se transportan.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("goods")
    private List<UpdateInvoiceParamsCartaPorteGood> goods;

    /**
     * Autotransporte (Autotransporte): vehículo, permiso SCT, seguros y remolques.
     */
    @JsonProperty("vehicle")
    private UpdateInvoiceParamsCartaPorteVehicle vehicle;

    /**
     * Transporte marítimo (TransporteMaritimo): embarcación, naviero y contenedores.
     */
    @JsonProperty("sea")
    private UpdateInvoiceParamsCartaPorteSea sea;

    /**
     * Transporte aéreo (TransporteAereo): permiso, guía y transportista.
     */
    @JsonProperty("air")
    private UpdateInvoiceParamsCartaPorteAir air;

    /**
     * Transporte ferroviario (TransporteFerroviario): servicio, tráfico, derechos de paso y carros.
     */
    @JsonProperty("rail")
    private UpdateInvoiceParamsCartaPorteRail rail;

    /**
     * Operadores (FiguraTransporte tipo 01): RFC, licencia y nombre.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("drivers")
    private List<UpdateInvoiceParamsCartaPorteDriver> drivers;

    /**
     * Otras figuras de transporte: 02 propietario, 03 arrendador, 04 notificado, 05 integrante de coordinados.
     */
    @JsonProperty("figures")
    private List<UpdateInvoiceParamsCartaPorteFigure> figures;

    /**
     * Cómo viajan las mercancías (c_CveTransporte): 01 autotransporte, 02 marítimo, 03 aéreo, 04 ferroviario; varios si es intermodal. Por omisión 01.
     */
    public List<String> getModes() {
        return modes;
    }

    public UpdateInvoiceParamsCartaPorte setModes(List<String> modes) {
        this.modes = modes;
        return this;
    }

    /**
     * Transporte internacional (TranspInternac Sí): entrada o salida, país, vía y regímenes aduaneros.
     */
    public UpdateInvoiceParamsCartaPorteInternational getInternational() {
        return international;
    }

    public UpdateInvoiceParamsCartaPorte setInternational(UpdateInvoiceParamsCartaPorteInternational international) {
        this.international = international;
        return this;
    }

    /**
     * Corredor Interoceánico del Istmo de Tehuantepec: polos de origen y destino (c_RegistroISTMO).
     */
    public UpdateInvoiceParamsCartaPorteIstmo getIstmo() {
        return istmo;
    }

    public UpdateInvoiceParamsCartaPorte setIstmo(UpdateInvoiceParamsCartaPorteIstmo istmo) {
        this.istmo = istmo;
        return this;
    }

    /**
     * Autotransporte: true si es logística inversa, recolección o devolución.
     */
    public Boolean getReverseLogistics() {
        return reverseLogistics;
    }

    public UpdateInvoiceParamsCartaPorte setReverseLogistics(Boolean reverseLogistics) {
        this.reverseLogistics = reverseLogistics;
        return this;
    }

    /**
     * Ubicación de origen (Ubicacion TipoUbicacion Origen): remitente, fecha y hora de salida y domicilio.
     * <p>
     * Obligatorio.
     */
    public UpdateInvoiceParamsCartaPorteOrigin getOrigin() {
        return origin;
    }

    public UpdateInvoiceParamsCartaPorte setOrigin(UpdateInvoiceParamsCartaPorteOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Ubicaciones de destino (TipoUbicacion Destino), en orden: destinatario, llegada, distancia y domicilio.
     * <p>
     * Obligatorio.
     */
    public List<UpdateInvoiceParamsCartaPorteDestination> getDestinations() {
        return destinations;
    }

    public UpdateInvoiceParamsCartaPorte setDestinations(List<UpdateInvoiceParamsCartaPorteDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Mercancías (Mercancia) que se transportan.
     * <p>
     * Obligatorio.
     */
    public List<UpdateInvoiceParamsCartaPorteGood> getGoods() {
        return goods;
    }

    public UpdateInvoiceParamsCartaPorte setGoods(List<UpdateInvoiceParamsCartaPorteGood> goods) {
        this.goods = goods;
        return this;
    }

    /**
     * Autotransporte (Autotransporte): vehículo, permiso SCT, seguros y remolques.
     */
    public UpdateInvoiceParamsCartaPorteVehicle getVehicle() {
        return vehicle;
    }

    public UpdateInvoiceParamsCartaPorte setVehicle(UpdateInvoiceParamsCartaPorteVehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    /**
     * Transporte marítimo (TransporteMaritimo): embarcación, naviero y contenedores.
     */
    public UpdateInvoiceParamsCartaPorteSea getSea() {
        return sea;
    }

    public UpdateInvoiceParamsCartaPorte setSea(UpdateInvoiceParamsCartaPorteSea sea) {
        this.sea = sea;
        return this;
    }

    /**
     * Transporte aéreo (TransporteAereo): permiso, guía y transportista.
     */
    public UpdateInvoiceParamsCartaPorteAir getAir() {
        return air;
    }

    public UpdateInvoiceParamsCartaPorte setAir(UpdateInvoiceParamsCartaPorteAir air) {
        this.air = air;
        return this;
    }

    /**
     * Transporte ferroviario (TransporteFerroviario): servicio, tráfico, derechos de paso y carros.
     */
    public UpdateInvoiceParamsCartaPorteRail getRail() {
        return rail;
    }

    public UpdateInvoiceParamsCartaPorte setRail(UpdateInvoiceParamsCartaPorteRail rail) {
        this.rail = rail;
        return this;
    }

    /**
     * Operadores (FiguraTransporte tipo 01): RFC, licencia y nombre.
     * <p>
     * Obligatorio.
     */
    public List<UpdateInvoiceParamsCartaPorteDriver> getDrivers() {
        return drivers;
    }

    public UpdateInvoiceParamsCartaPorte setDrivers(List<UpdateInvoiceParamsCartaPorteDriver> drivers) {
        this.drivers = drivers;
        return this;
    }

    /**
     * Otras figuras de transporte: 02 propietario, 03 arrendador, 04 notificado, 05 integrante de coordinados.
     */
    public List<UpdateInvoiceParamsCartaPorteFigure> getFigures() {
        return figures;
    }

    public UpdateInvoiceParamsCartaPorte setFigures(List<UpdateInvoiceParamsCartaPorteFigure> figures) {
        this.figures = figures;
        return this;
    }
}
