// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoiceCreateItemUsedVehicle: Complemento de vehículo usado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateItemUsedVehicle {
    /**
     * Monto de adquisición (montoAdquisicion).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("purchase_amount")
    private BigDecimal purchaseAmount;

    /**
     * Monto de enajenación (montoEnajenacion).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("sale_amount")
    private BigDecimal saleAmount;

    /**
     * Clave vehicular (claveVehicular).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("vehicle_key")
    private String vehicleKey;

    /**
     * Marca (marca).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("make")
    private String make;

    /**
     * Tipo o versión (tipo).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Año del modelo (modelo), 4 dígitos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("model")
    private String model;

    /**
     * Número de motor (numeroMotor).
     */
    @JsonProperty("engine_number")
    private String engineNumber;

    /**
     * Número de serie (numeroSerie).
     */
    @JsonProperty("serial_number")
    private String serialNumber;

    /**
     * Número de identificación vehicular (NIV).
     */
    @JsonProperty("niv")
    private String niv;

    /**
     * Valor según la guía EBC o Libro Azul (valor).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("guide_value")
    private BigDecimal guideValue;

    /**
     * Información aduanera de la importación del vehículo (InformacionAduanera).
     */
    @JsonProperty("customs")
    private List<InvoiceCreateItemUsedVehicleCustom> customs;

    /**
     * Monto de adquisición (montoAdquisicion).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public InvoiceCreateItemUsedVehicle setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
        return this;
    }

    public InvoiceCreateItemUsedVehicle setPurchaseAmount(double purchaseAmount) {
        return setPurchaseAmount(BigDecimal.valueOf(purchaseAmount));
    }

    /**
     * Monto de enajenación (montoEnajenacion).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public InvoiceCreateItemUsedVehicle setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
        return this;
    }

    public InvoiceCreateItemUsedVehicle setSaleAmount(double saleAmount) {
        return setSaleAmount(BigDecimal.valueOf(saleAmount));
    }

    /**
     * Clave vehicular (claveVehicular).
     * <p>
     * Obligatorio.
     */
    public String getVehicleKey() {
        return vehicleKey;
    }

    public InvoiceCreateItemUsedVehicle setVehicleKey(String vehicleKey) {
        this.vehicleKey = vehicleKey;
        return this;
    }

    /**
     * Marca (marca).
     * <p>
     * Obligatorio.
     */
    public String getMake() {
        return make;
    }

    public InvoiceCreateItemUsedVehicle setMake(String make) {
        this.make = make;
        return this;
    }

    /**
     * Tipo o versión (tipo).
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public InvoiceCreateItemUsedVehicle setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Año del modelo (modelo), 4 dígitos.
     * <p>
     * Obligatorio.
     */
    public String getModel() {
        return model;
    }

    public InvoiceCreateItemUsedVehicle setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Número de motor (numeroMotor).
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    public InvoiceCreateItemUsedVehicle setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
        return this;
    }

    /**
     * Número de serie (numeroSerie).
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public InvoiceCreateItemUsedVehicle setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Número de identificación vehicular (NIV).
     */
    public String getNiv() {
        return niv;
    }

    public InvoiceCreateItemUsedVehicle setNiv(String niv) {
        this.niv = niv;
        return this;
    }

    /**
     * Valor según la guía EBC o Libro Azul (valor).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getGuideValue() {
        return guideValue;
    }

    public InvoiceCreateItemUsedVehicle setGuideValue(BigDecimal guideValue) {
        this.guideValue = guideValue;
        return this;
    }

    public InvoiceCreateItemUsedVehicle setGuideValue(double guideValue) {
        return setGuideValue(BigDecimal.valueOf(guideValue));
    }

    /**
     * Información aduanera de la importación del vehículo (InformacionAduanera).
     */
    public List<InvoiceCreateItemUsedVehicleCustom> getCustoms() {
        return customs;
    }

    public InvoiceCreateItemUsedVehicle setCustoms(List<InvoiceCreateItemUsedVehicleCustom> customs) {
        this.customs = customs;
        return this;
    }
}
