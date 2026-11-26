// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdateInvoiceParamsCartaPorteRailCar: UpdateInvoiceParamsCartaPorteRailCar.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorteRailCar {
    /**
     * Tipo de carro (TipoCarro), c_TipoCarro.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Matrícula (Matricula).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("registration")
    private String registration;

    /**
     * Guía del carro (GuiaCarro).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("guide")
    private String guide;

    /**
     * Toneladas netas del carro (ToneladasNetasCarro).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("net_tons")
    private BigDecimal netTons;

    /**
     * Contenedores (Contenedor).
     */
    @JsonProperty("containers")
    private List<UpdateInvoiceParamsCartaPorteRailCarContainer> containers;

    /**
     * Tipo de carro (TipoCarro), c_TipoCarro.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public UpdateInvoiceParamsCartaPorteRailCar setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Matrícula (Matricula).
     * <p>
     * Obligatorio.
     */
    public String getRegistration() {
        return registration;
    }

    public UpdateInvoiceParamsCartaPorteRailCar setRegistration(String registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Guía del carro (GuiaCarro).
     * <p>
     * Obligatorio.
     */
    public String getGuide() {
        return guide;
    }

    public UpdateInvoiceParamsCartaPorteRailCar setGuide(String guide) {
        this.guide = guide;
        return this;
    }

    /**
     * Toneladas netas del carro (ToneladasNetasCarro).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getNetTons() {
        return netTons;
    }

    public UpdateInvoiceParamsCartaPorteRailCar setNetTons(BigDecimal netTons) {
        this.netTons = netTons;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteRailCar setNetTons(double netTons) {
        return setNetTons(BigDecimal.valueOf(netTons));
    }

    /**
     * Contenedores (Contenedor).
     */
    public List<UpdateInvoiceParamsCartaPorteRailCarContainer> getContainers() {
        return containers;
    }

    public UpdateInvoiceParamsCartaPorteRailCar setContainers(List<UpdateInvoiceParamsCartaPorteRailCarContainer> containers) {
        this.containers = containers;
        return this;
    }
}
