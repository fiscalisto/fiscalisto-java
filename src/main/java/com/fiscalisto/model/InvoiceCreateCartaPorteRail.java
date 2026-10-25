// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceCreateCartaPorteRail: Transporte ferroviario (TransporteFerroviario): servicio, tráfico, derechos de paso y carros.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteRail {
    /**
     * Tipo de servicio (TipoDeServicio), c_TipoDeServicio.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("service")
    private String service;

    /**
     * Tipo de tráfico (TipoDeTrafico), c_TipoDeTrafico.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("traffic")
    private String traffic;

    /**
     * Aseguradora de responsabilidad civil (AseguraRespCivil).
     */
    @JsonProperty("insurer")
    private String insurer;

    /**
     * Póliza de responsabilidad civil (PolizaRespCivil).
     */
    @JsonProperty("policy")
    private String policy;

    /**
     * Derechos de paso (DerechosDePaso): tipo y kilómetros.
     */
    @JsonProperty("rights")
    private List<InvoiceCreateCartaPorteRailRight> rights;

    /**
     * Carros (Carro).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cars")
    private List<InvoiceCreateCartaPorteRailCar> cars;

    /**
     * Tipo de servicio (TipoDeServicio), c_TipoDeServicio.
     * <p>
     * Obligatorio.
     */
    public String getService() {
        return service;
    }

    public InvoiceCreateCartaPorteRail setService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Tipo de tráfico (TipoDeTrafico), c_TipoDeTrafico.
     * <p>
     * Obligatorio.
     */
    public String getTraffic() {
        return traffic;
    }

    public InvoiceCreateCartaPorteRail setTraffic(String traffic) {
        this.traffic = traffic;
        return this;
    }

    /**
     * Aseguradora de responsabilidad civil (AseguraRespCivil).
     */
    public String getInsurer() {
        return insurer;
    }

    public InvoiceCreateCartaPorteRail setInsurer(String insurer) {
        this.insurer = insurer;
        return this;
    }

    /**
     * Póliza de responsabilidad civil (PolizaRespCivil).
     */
    public String getPolicy() {
        return policy;
    }

    public InvoiceCreateCartaPorteRail setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Derechos de paso (DerechosDePaso): tipo y kilómetros.
     */
    public List<InvoiceCreateCartaPorteRailRight> getRights() {
        return rights;
    }

    public InvoiceCreateCartaPorteRail setRights(List<InvoiceCreateCartaPorteRailRight> rights) {
        this.rights = rights;
        return this;
    }

    /**
     * Carros (Carro).
     * <p>
     * Obligatorio.
     */
    public List<InvoiceCreateCartaPorteRailCar> getCars() {
        return cars;
    }

    public InvoiceCreateCartaPorteRail setCars(List<InvoiceCreateCartaPorteRailCar> cars) {
        this.cars = cars;
        return this;
    }
}
