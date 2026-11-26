// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateInvoiceParamsCartaPorteRail: Transporte ferroviario (TransporteFerroviario): servicio, tráfico, derechos de paso y carros.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorteRail {
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
    private List<UpdateInvoiceParamsCartaPorteRailRight> rights;

    /**
     * Carros (Carro).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cars")
    private List<UpdateInvoiceParamsCartaPorteRailCar> cars;

    /**
     * Tipo de servicio (TipoDeServicio), c_TipoDeServicio.
     * <p>
     * Obligatorio.
     */
    public String getService() {
        return service;
    }

    public UpdateInvoiceParamsCartaPorteRail setService(String service) {
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

    public UpdateInvoiceParamsCartaPorteRail setTraffic(String traffic) {
        this.traffic = traffic;
        return this;
    }

    /**
     * Aseguradora de responsabilidad civil (AseguraRespCivil).
     */
    public String getInsurer() {
        return insurer;
    }

    public UpdateInvoiceParamsCartaPorteRail setInsurer(String insurer) {
        this.insurer = insurer;
        return this;
    }

    /**
     * Póliza de responsabilidad civil (PolizaRespCivil).
     */
    public String getPolicy() {
        return policy;
    }

    public UpdateInvoiceParamsCartaPorteRail setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Derechos de paso (DerechosDePaso): tipo y kilómetros.
     */
    public List<UpdateInvoiceParamsCartaPorteRailRight> getRights() {
        return rights;
    }

    public UpdateInvoiceParamsCartaPorteRail setRights(List<UpdateInvoiceParamsCartaPorteRailRight> rights) {
        this.rights = rights;
        return this;
    }

    /**
     * Carros (Carro).
     * <p>
     * Obligatorio.
     */
    public List<UpdateInvoiceParamsCartaPorteRailCar> getCars() {
        return cars;
    }

    public UpdateInvoiceParamsCartaPorteRail setCars(List<UpdateInvoiceParamsCartaPorteRailCar> cars) {
        this.cars = cars;
        return this;
    }
}
