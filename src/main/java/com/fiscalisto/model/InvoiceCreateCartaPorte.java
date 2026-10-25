// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceCreateCartaPorte: Complemento Carta Porte 3.1 (traslado de mercancías).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorte {
    /**
     * Cómo viajan las mercancías (c_CveTransporte): 01 autotransporte, 02 marítimo, 03 aéreo, 04 ferroviario; varios si es intermodal. Por omisión 01.
     */
    @JsonProperty("modes")
    private List<String> modes;

    /**
     * Transporte internacional (TranspInternac Sí): entrada o salida, país, vía y regímenes aduaneros.
     */
    @JsonProperty("international")
    private InvoiceCreateCartaPorteInternational international;

    /**
     * Corredor Interoceánico del Istmo de Tehuantepec: polos de origen y destino (c_RegistroISTMO).
     */
    @JsonProperty("istmo")
    private InvoiceCreateCartaPorteIstmo istmo;

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
    private InvoiceCreateCartaPorteOrigin origin;

    /**
     * Ubicaciones de destino (TipoUbicacion Destino), en orden: destinatario, llegada, distancia y domicilio.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("destinations")
    private List<InvoiceCreateCartaPorteDestination> destinations;

    /**
     * Mercancías (Mercancia) que se transportan.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("goods")
    private List<InvoiceCreateCartaPorteGood> goods;

    /**
     * Autotransporte (Autotransporte): vehículo, permiso SCT, seguros y remolques.
     */
    @JsonProperty("vehicle")
    private InvoiceCreateCartaPorteVehicle vehicle;

    /**
     * Transporte marítimo (TransporteMaritimo): embarcación, naviero y contenedores.
     */
    @JsonProperty("sea")
    private InvoiceCreateCartaPorteSea sea;

    /**
     * Transporte aéreo (TransporteAereo): permiso, guía y transportista.
     */
    @JsonProperty("air")
    private InvoiceCreateCartaPorteAir air;

    /**
     * Transporte ferroviario (TransporteFerroviario): servicio, tráfico, derechos de paso y carros.
     */
    @JsonProperty("rail")
    private InvoiceCreateCartaPorteRail rail;

    /**
     * Operadores (FiguraTransporte tipo 01): RFC, licencia y nombre.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("drivers")
    private List<InvoiceCreateCartaPorteDriver> drivers;

    /**
     * Otras figuras de transporte: 02 propietario, 03 arrendador, 04 notificado, 05 integrante de coordinados.
     */
    @JsonProperty("figures")
    private List<InvoiceCreateCartaPorteFigure> figures;

    /**
     * Cómo viajan las mercancías (c_CveTransporte): 01 autotransporte, 02 marítimo, 03 aéreo, 04 ferroviario; varios si es intermodal. Por omisión 01.
     */
    public List<String> getModes() {
        return modes;
    }

    public InvoiceCreateCartaPorte setModes(List<String> modes) {
        this.modes = modes;
        return this;
    }

    /**
     * Transporte internacional (TranspInternac Sí): entrada o salida, país, vía y regímenes aduaneros.
     */
    public InvoiceCreateCartaPorteInternational getInternational() {
        return international;
    }

    public InvoiceCreateCartaPorte setInternational(InvoiceCreateCartaPorteInternational international) {
        this.international = international;
        return this;
    }

    /**
     * Corredor Interoceánico del Istmo de Tehuantepec: polos de origen y destino (c_RegistroISTMO).
     */
    public InvoiceCreateCartaPorteIstmo getIstmo() {
        return istmo;
    }

    public InvoiceCreateCartaPorte setIstmo(InvoiceCreateCartaPorteIstmo istmo) {
        this.istmo = istmo;
        return this;
    }

    /**
     * Autotransporte: true si es logística inversa, recolección o devolución.
     */
    public Boolean getReverseLogistics() {
        return reverseLogistics;
    }

    public InvoiceCreateCartaPorte setReverseLogistics(Boolean reverseLogistics) {
        this.reverseLogistics = reverseLogistics;
        return this;
    }

    /**
     * Ubicación de origen (Ubicacion TipoUbicacion Origen): remitente, fecha y hora de salida y domicilio.
     * <p>
     * Obligatorio.
     */
    public InvoiceCreateCartaPorteOrigin getOrigin() {
        return origin;
    }

    public InvoiceCreateCartaPorte setOrigin(InvoiceCreateCartaPorteOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Ubicaciones de destino (TipoUbicacion Destino), en orden: destinatario, llegada, distancia y domicilio.
     * <p>
     * Obligatorio.
     */
    public List<InvoiceCreateCartaPorteDestination> getDestinations() {
        return destinations;
    }

    public InvoiceCreateCartaPorte setDestinations(List<InvoiceCreateCartaPorteDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Mercancías (Mercancia) que se transportan.
     * <p>
     * Obligatorio.
     */
    public List<InvoiceCreateCartaPorteGood> getGoods() {
        return goods;
    }

    public InvoiceCreateCartaPorte setGoods(List<InvoiceCreateCartaPorteGood> goods) {
        this.goods = goods;
        return this;
    }

    /**
     * Autotransporte (Autotransporte): vehículo, permiso SCT, seguros y remolques.
     */
    public InvoiceCreateCartaPorteVehicle getVehicle() {
        return vehicle;
    }

    public InvoiceCreateCartaPorte setVehicle(InvoiceCreateCartaPorteVehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    /**
     * Transporte marítimo (TransporteMaritimo): embarcación, naviero y contenedores.
     */
    public InvoiceCreateCartaPorteSea getSea() {
        return sea;
    }

    public InvoiceCreateCartaPorte setSea(InvoiceCreateCartaPorteSea sea) {
        this.sea = sea;
        return this;
    }

    /**
     * Transporte aéreo (TransporteAereo): permiso, guía y transportista.
     */
    public InvoiceCreateCartaPorteAir getAir() {
        return air;
    }

    public InvoiceCreateCartaPorte setAir(InvoiceCreateCartaPorteAir air) {
        this.air = air;
        return this;
    }

    /**
     * Transporte ferroviario (TransporteFerroviario): servicio, tráfico, derechos de paso y carros.
     */
    public InvoiceCreateCartaPorteRail getRail() {
        return rail;
    }

    public InvoiceCreateCartaPorte setRail(InvoiceCreateCartaPorteRail rail) {
        this.rail = rail;
        return this;
    }

    /**
     * Operadores (FiguraTransporte tipo 01): RFC, licencia y nombre.
     * <p>
     * Obligatorio.
     */
    public List<InvoiceCreateCartaPorteDriver> getDrivers() {
        return drivers;
    }

    public InvoiceCreateCartaPorte setDrivers(List<InvoiceCreateCartaPorteDriver> drivers) {
        this.drivers = drivers;
        return this;
    }

    /**
     * Otras figuras de transporte: 02 propietario, 03 arrendador, 04 notificado, 05 integrante de coordinados.
     */
    public List<InvoiceCreateCartaPorteFigure> getFigures() {
        return figures;
    }

    public InvoiceCreateCartaPorte setFigures(List<InvoiceCreateCartaPorteFigure> figures) {
        this.figures = figures;
        return this;
    }
}
