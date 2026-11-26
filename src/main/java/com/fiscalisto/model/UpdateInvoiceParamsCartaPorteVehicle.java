// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdateInvoiceParamsCartaPorteVehicle: Autotransporte (Autotransporte): vehículo, permiso SCT, seguros y remolques.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorteVehicle {
    /**
     * Configuración vehicular (ConfigVehicular), c_ConfigAutotransporte: C2, T3S2…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("config")
    private String config;

    /**
     * Placa (PlacaVM), sin guiones ni espacios.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("plate")
    private String plate;

    /**
     * Año del modelo (AnioModeloVM).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Peso bruto vehicular en toneladas (PesoBrutoVehicular).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("gross_weight")
    private BigDecimal grossWeight;

    /**
     * Tipo de permiso SCT (PermSCT), c_TipoPermiso.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("permit_type")
    private String permitType;

    /**
     * Número de permiso SCT (NumPermisoSCT).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("permit_number")
    private String permitNumber;

    /**
     * Aseguradora de responsabilidad civil (AseguraRespCivil).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("insurer")
    private String insurer;

    /**
     * Póliza de responsabilidad civil (PolizaRespCivil).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("policy")
    private String policy;

    /**
     * Aseguradora de daños al medio ambiente (AseguraMedAmbiente); obligatoria con material peligroso.
     */
    @JsonProperty("env_insurer")
    private String envInsurer;

    /**
     * Póliza de daños al medio ambiente (PolizaMedAmbiente).
     */
    @JsonProperty("env_policy")
    private String envPolicy;

    /**
     * Aseguradora de la carga (AseguraCarga).
     */
    @JsonProperty("cargo_insurer")
    private String cargoInsurer;

    /**
     * Póliza de la carga (PolizaCarga).
     */
    @JsonProperty("cargo_policy")
    private String cargoPolicy;

    /**
     * Prima del seguro (PrimaSeguro).
     */
    @JsonProperty("premium")
    private BigDecimal premium;

    /**
     * Remolques o semirremolques (Remolque): tipo (c_SubTipoRem) y placa.
     */
    @JsonProperty("trailers")
    private List<UpdateInvoiceParamsCartaPorteVehicleTrailer> trailers;

    /**
     * Configuración vehicular (ConfigVehicular), c_ConfigAutotransporte: C2, T3S2…
     * <p>
     * Obligatorio.
     */
    public String getConfig() {
        return config;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setConfig(String config) {
        this.config = config;
        return this;
    }

    /**
     * Placa (PlacaVM), sin guiones ni espacios.
     * <p>
     * Obligatorio.
     */
    public String getPlate() {
        return plate;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setPlate(String plate) {
        this.plate = plate;
        return this;
    }

    /**
     * Año del modelo (AnioModeloVM).
     * <p>
     * Obligatorio.
     */
    public Long getYear() {
        return year;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteVehicle setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Peso bruto vehicular en toneladas (PesoBrutoVehicular).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteVehicle setGrossWeight(double grossWeight) {
        return setGrossWeight(BigDecimal.valueOf(grossWeight));
    }

    /**
     * Tipo de permiso SCT (PermSCT), c_TipoPermiso.
     * <p>
     * Obligatorio.
     */
    public String getPermitType() {
        return permitType;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setPermitType(String permitType) {
        this.permitType = permitType;
        return this;
    }

    /**
     * Número de permiso SCT (NumPermisoSCT).
     * <p>
     * Obligatorio.
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
        return this;
    }

    /**
     * Aseguradora de responsabilidad civil (AseguraRespCivil).
     * <p>
     * Obligatorio.
     */
    public String getInsurer() {
        return insurer;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setInsurer(String insurer) {
        this.insurer = insurer;
        return this;
    }

    /**
     * Póliza de responsabilidad civil (PolizaRespCivil).
     * <p>
     * Obligatorio.
     */
    public String getPolicy() {
        return policy;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Aseguradora de daños al medio ambiente (AseguraMedAmbiente); obligatoria con material peligroso.
     */
    public String getEnvInsurer() {
        return envInsurer;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setEnvInsurer(String envInsurer) {
        this.envInsurer = envInsurer;
        return this;
    }

    /**
     * Póliza de daños al medio ambiente (PolizaMedAmbiente).
     */
    public String getEnvPolicy() {
        return envPolicy;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setEnvPolicy(String envPolicy) {
        this.envPolicy = envPolicy;
        return this;
    }

    /**
     * Aseguradora de la carga (AseguraCarga).
     */
    public String getCargoInsurer() {
        return cargoInsurer;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setCargoInsurer(String cargoInsurer) {
        this.cargoInsurer = cargoInsurer;
        return this;
    }

    /**
     * Póliza de la carga (PolizaCarga).
     */
    public String getCargoPolicy() {
        return cargoPolicy;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setCargoPolicy(String cargoPolicy) {
        this.cargoPolicy = cargoPolicy;
        return this;
    }

    /**
     * Prima del seguro (PrimaSeguro).
     */
    public BigDecimal getPremium() {
        return premium;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setPremium(BigDecimal premium) {
        this.premium = premium;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteVehicle setPremium(double premium) {
        return setPremium(BigDecimal.valueOf(premium));
    }

    /**
     * Remolques o semirremolques (Remolque): tipo (c_SubTipoRem) y placa.
     */
    public List<UpdateInvoiceParamsCartaPorteVehicleTrailer> getTrailers() {
        return trailers;
    }

    public UpdateInvoiceParamsCartaPorteVehicle setTrailers(List<UpdateInvoiceParamsCartaPorteVehicleTrailer> trailers) {
        this.trailers = trailers;
        return this;
    }
}
