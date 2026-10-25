// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoiceCreateCartaPorteVehicle: Autotransporte (Autotransporte): vehículo, permiso SCT, seguros y remolques.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteVehicle {
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
    private List<InvoiceCreateCartaPorteVehicleTrailer> trailers;

    /**
     * Configuración vehicular (ConfigVehicular), c_ConfigAutotransporte: C2, T3S2…
     * <p>
     * Obligatorio.
     */
    public String getConfig() {
        return config;
    }

    public InvoiceCreateCartaPorteVehicle setConfig(String config) {
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

    public InvoiceCreateCartaPorteVehicle setPlate(String plate) {
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

    public InvoiceCreateCartaPorteVehicle setYear(Long year) {
        this.year = year;
        return this;
    }

    public InvoiceCreateCartaPorteVehicle setYear(long year) {
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

    public InvoiceCreateCartaPorteVehicle setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
        return this;
    }

    public InvoiceCreateCartaPorteVehicle setGrossWeight(double grossWeight) {
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

    public InvoiceCreateCartaPorteVehicle setPermitType(String permitType) {
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

    public InvoiceCreateCartaPorteVehicle setPermitNumber(String permitNumber) {
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

    public InvoiceCreateCartaPorteVehicle setInsurer(String insurer) {
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

    public InvoiceCreateCartaPorteVehicle setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Aseguradora de daños al medio ambiente (AseguraMedAmbiente); obligatoria con material peligroso.
     */
    public String getEnvInsurer() {
        return envInsurer;
    }

    public InvoiceCreateCartaPorteVehicle setEnvInsurer(String envInsurer) {
        this.envInsurer = envInsurer;
        return this;
    }

    /**
     * Póliza de daños al medio ambiente (PolizaMedAmbiente).
     */
    public String getEnvPolicy() {
        return envPolicy;
    }

    public InvoiceCreateCartaPorteVehicle setEnvPolicy(String envPolicy) {
        this.envPolicy = envPolicy;
        return this;
    }

    /**
     * Aseguradora de la carga (AseguraCarga).
     */
    public String getCargoInsurer() {
        return cargoInsurer;
    }

    public InvoiceCreateCartaPorteVehicle setCargoInsurer(String cargoInsurer) {
        this.cargoInsurer = cargoInsurer;
        return this;
    }

    /**
     * Póliza de la carga (PolizaCarga).
     */
    public String getCargoPolicy() {
        return cargoPolicy;
    }

    public InvoiceCreateCartaPorteVehicle setCargoPolicy(String cargoPolicy) {
        this.cargoPolicy = cargoPolicy;
        return this;
    }

    /**
     * Prima del seguro (PrimaSeguro).
     */
    public BigDecimal getPremium() {
        return premium;
    }

    public InvoiceCreateCartaPorteVehicle setPremium(BigDecimal premium) {
        this.premium = premium;
        return this;
    }

    public InvoiceCreateCartaPorteVehicle setPremium(double premium) {
        return setPremium(BigDecimal.valueOf(premium));
    }

    /**
     * Remolques o semirremolques (Remolque): tipo (c_SubTipoRem) y placa.
     */
    public List<InvoiceCreateCartaPorteVehicleTrailer> getTrailers() {
        return trailers;
    }

    public InvoiceCreateCartaPorteVehicle setTrailers(List<InvoiceCreateCartaPorteVehicleTrailer> trailers) {
        this.trailers = trailers;
        return this;
    }
}
